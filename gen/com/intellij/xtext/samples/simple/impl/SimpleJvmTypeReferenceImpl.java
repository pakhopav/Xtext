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

public class SimpleJvmTypeReferenceImpl extends SimplePsiCompositeElementImpl implements SimpleJvmTypeReference {

  public SimpleJvmTypeReferenceImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SimpleVisitor visitor) {
    visitor.visitJvmTypeReference(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SimpleVisitor) accept((SimpleVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<SimpleArrayBrackets> getArrayBracketsList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SimpleArrayBrackets.class);
  }

  @Override
  @Nullable
  public SimpleJvmParameterizedTypeReference getJvmParameterizedTypeReference() {
    return findChildByClass(SimpleJvmParameterizedTypeReference.class);
  }

  @Override
  @Nullable
  public SimpleXFunctionTypeRef getXFunctionTypeRef() {
    return findChildByClass(SimpleXFunctionTypeRef.class);
  }

}
