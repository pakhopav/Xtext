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

public class SimplePackageDeclarationImpl extends SimplePsiCompositeElementImpl implements SimplePackageDeclaration {

  public SimplePackageDeclarationImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SimpleVisitor visitor) {
    visitor.visitPackageDeclaration(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SimpleVisitor) accept((SimpleVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<SimpleEntity> getEntityList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SimpleEntity.class);
  }

  @Override
  @NotNull
  public List<SimplePackageDeclaration> getPackageDeclarationList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SimplePackageDeclaration.class);
  }

  @Override
  @NotNull
  public SimpleQualifiedName getXname() {
    return findNotNullChildByClass(SimpleQualifiedName.class);
  }

}
