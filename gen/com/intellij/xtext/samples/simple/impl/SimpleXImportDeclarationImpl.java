// This is a generated file. Not intended for manual editing.
package com.intellij.xtext.samples.simple.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.intellij.xtext.samples.simple.psi.SimpleTypes.*;
import com.intellij.xtext.samples.simple.psi.impl.SimplePsiCompositeElementImpl;
import com.intellij.xtext.samples.simple.psi.*;
import com.intellij.xtext.samples.simple.psi.impl.SimplePsiImplUtil;

public class SimpleXImportDeclarationImpl extends SimplePsiCompositeElementImpl implements SimpleXImportDeclaration {

  public SimpleXImportDeclarationImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SimpleVisitor visitor) {
    visitor.visitXImportDeclaration(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SimpleVisitor) accept((SimpleVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SimpleREFERENCETOJvmDeclaredTypeQualifiedName getREFERENCETOJvmDeclaredTypeQualifiedName() {
    return findChildByClass(SimpleREFERENCETOJvmDeclaredTypeQualifiedName.class);
  }

  @Override
  @Nullable
  public SimpleValidID getValidID() {
    return findChildByClass(SimpleValidID.class);
  }

  @Override
  @Nullable
  public SimpleREFERENCETOJvmDeclaredTypeQualifiedNameInStaticImport getImportedType() {
    return findChildByClass(SimpleREFERENCETOJvmDeclaredTypeQualifiedNameInStaticImport.class);
  }

  @Override
  @Nullable
  public SimpleQualifiedNameWithWildcard getImportedNamespace() {
    return findChildByClass(SimpleQualifiedNameWithWildcard.class);
  }

}
