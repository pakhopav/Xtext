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

public class SimpleJvmParameterizedTypeReferenceImpl extends SimplePsiCompositeElementImpl implements SimpleJvmParameterizedTypeReference {

  public SimpleJvmParameterizedTypeReferenceImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SimpleVisitor visitor) {
    visitor.visitJvmParameterizedTypeReference(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SimpleVisitor) accept((SimpleVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<SimpleJvmArgumentTypeReference> getJvmArgumentTypeReferenceList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SimpleJvmArgumentTypeReference.class);
  }

  @Override
  @NotNull
  public PsiElement getREFERENCETOQualifiedName() {
    return findNotNullChildByType(REFERENCE_TO_QUALIFIEDNAME);
  }

}
