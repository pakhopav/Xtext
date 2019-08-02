package simpleLan.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import simpleLan.psi.SimpleNamedElement;
import org.jetbrains.annotations.NotNull;

public abstract class SimpleNamedElementImpl extends ASTWrapperPsiElement implements SimpleNamedElement {
    public SimpleNamedElementImpl(@NotNull ASTNode node) {
        super(node);
    }
}