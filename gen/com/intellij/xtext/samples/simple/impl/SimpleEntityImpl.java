// This is a generated file. Not intended for manual editing.
package com.intellij.xtext.samples.simple.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.intellij.xtext.samples.simple.psi.SimpleTypes.*;
import com.intellij.xtext.samples.simple.psi.impl.SimpleNamedElementImpl;
import com.intellij.xtext.samples.simple.psi.*;
import com.intellij.xtext.samples.simple.psi.impl.SimplePsiImplUtil;

public class SimpleEntityImpl extends SimpleNamedElementImpl implements SimpleEntity {

  public SimpleEntityImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SimpleVisitor visitor) {
    visitor.visitEntity(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SimpleVisitor) accept((SimpleVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SimpleValidID getValidID() {
    return findChildByClass(SimpleValidID.class);
  }

  @Override
  @Nullable
  public SimpleJvmTypeReference getSuperType() {
    return findChildByClass(SimpleJvmTypeReference.class);
  }

  @Override
  @NotNull
  public List<SimpleFeature> getFeatures() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SimpleFeature.class);
  }

  @Override
  public String getName() {
    return SimplePsiImplUtil.getName(this);
  }

  @Override
  public PsiElement setName(String newName) {
    return SimplePsiImplUtil.setName(this, newName);
  }

  @Override
  public PsiElement getNameIdentifier() {
    return SimplePsiImplUtil.getNameIdentifier(this);
  }

}
