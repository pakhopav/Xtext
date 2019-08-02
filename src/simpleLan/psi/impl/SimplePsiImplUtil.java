package simpleLan.psi.impl;

import com.intellij.lang.ASTNode;
import com.intellij.navigation.ItemPresentation;
import com.intellij.psi.*;
import simpleLan.SimpleIcons;
import simpleLan.psi.*;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class SimplePsiImplUtil {
    public static String SimpleEntityGetID(SimpleEntity element) {
        ASTNode keyNode = element.getNode().findChildByType(SimpleTypes.ID);
        if (keyNode != null) {
            // IMPORTANT: Convert embedded escaped spaces to simple spaces
            return keyNode.getText().replaceAll("\\\\ ", " ");
        } else {
            return null;
        }
    }

    public static String getName(SimpleEntity element) {
        return SimpleEntityGetID(element);
    }

    public static PsiElement setName(SimpleEntity element, String newName) {
        ASTNode keyNode = element.getNode().findChildByType(SimpleTypes.ID);
        if (keyNode != null) {

            SimpleEntity property = SimpleElementFactory.createProperty(element.getProject(), newName);
            ASTNode newKeyNode = property.getFirstChild().getNode();
            element.getNode().replaceChild(keyNode, newKeyNode);
        }
        return element;
    }

    public static PsiElement getNameIdentifier(SimpleEntity element) {
        ASTNode keyNode = element.getNode().findChildByType(SimpleTypes.ID);
        if (keyNode != null) {
            return keyNode.getPsi();
        } else {
            return null;
        }
    }
}