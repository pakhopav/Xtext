package com.intellij.xtext.samples.simple.psi.impl;

import com.intellij.lang.ASTNode;
import com.intellij.psi.*;
import com.intellij.xtext.samples.simple.psi.SimpleElementFactory;
import com.intellij.xtext.samples.simple.psi.*;

public class SimplePsiImplUtil {




    public static <T extends PsiElement> String getID(T element) {
        ASTNode keyNode = element.getNode().findChildByType(SimpleTypes.ID);
        if (keyNode != null) {

            // IMPORTANT: Convert embedded escaped spaces to simple spaces
            return keyNode.getText().replaceAll("\\\\ ", " ");
        } else {
            return null;
        }
    }

    public static String getName(SimpleEntity element) { return element.getValidID().getText(); }

    public static PsiElement setName(SimpleEntity element, String newName)   { return setNameAll(element, newName ); }

    public static PsiElement getNameIdentifier(SimpleEntity element)   { return getNameIdentifierAll(element ); }

    public static <T extends PsiElement> PsiElement setNameAll(T element, String newName) {
        ASTNode keyNode = element.getNode().findChildByType(SimpleTypes.ID);
        if (keyNode != null) {

            SimpleEntity property = SimpleElementFactory.createProperty(element.getProject(), newName);
            ASTNode newKeyNode = property.getFirstChild().getNode();
            element.getNode().replaceChild(keyNode, newKeyNode);
        }
        return element;
    }

    public static <T extends PsiElement> PsiElement getNameIdentifierAll(T element) {
        ASTNode keyNode = element.getNode().findChildByType(SimpleTypes.ID);
        if (keyNode != null) {
            return keyNode.getPsi();
        } else {
            return null;
        }
    }
}