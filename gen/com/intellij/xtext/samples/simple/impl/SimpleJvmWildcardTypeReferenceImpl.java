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

public class SimpleJvmWildcardTypeReferenceImpl extends SimplePsiCompositeElementImpl implements SimpleJvmWildcardTypeReference {

  public SimpleJvmWildcardTypeReferenceImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SimpleVisitor visitor) {
    visitor.visitJvmWildcardTypeReference(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SimpleVisitor) accept((SimpleVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SimpleJvmLowerBound getJvmLowerBound() {
    return findChildByClass(SimpleJvmLowerBound.class);
  }

  @Override
  @NotNull
  public List<SimpleJvmLowerBoundAnded> getJvmLowerBoundAndedList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SimpleJvmLowerBoundAnded.class);
  }

  @Override
  @NotNull
  public List<SimpleJvmUpperBoundAnded> getJvmUpperBoundAndedList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SimpleJvmUpperBoundAnded.class);
  }

  @Override
  @Nullable
  public SimpleJvmUpperBound getConstraints() {
    return findChildByClass(SimpleJvmUpperBound.class);
  }

}
