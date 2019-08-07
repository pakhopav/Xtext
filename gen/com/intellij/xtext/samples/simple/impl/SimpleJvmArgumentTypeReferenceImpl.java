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

public class SimpleJvmArgumentTypeReferenceImpl extends SimplePsiCompositeElementImpl implements SimpleJvmArgumentTypeReference {

  public SimpleJvmArgumentTypeReferenceImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SimpleVisitor visitor) {
    visitor.visitJvmArgumentTypeReference(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SimpleVisitor) accept((SimpleVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SimpleJvmTypeReference getJvmTypeReference() {
    return findChildByClass(SimpleJvmTypeReference.class);
  }

  @Override
  @Nullable
  public SimpleJvmWildcardTypeReference getJvmWildcardTypeReference() {
    return findChildByClass(SimpleJvmWildcardTypeReference.class);
  }

}
