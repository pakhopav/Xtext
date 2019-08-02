// This is a generated file. Not intended for manual editing.
package simpleLan.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static simpleLan.psi.SimpleTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import simpleLan.psi.*;

public class SimpleFeatureImpl extends ASTWrapperPsiElement implements SimpleFeature {

  public SimpleFeatureImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SimpleVisitor visitor) {
    visitor.visitFeature(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SimpleVisitor) accept((SimpleVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SimpleDataType getDataType() {
    return findChildByClass(SimpleDataType.class);
  }

  @Override
  @Nullable
  public SimpleEntity getEntity() {
    return findChildByClass(SimpleEntity.class);
  }

  @Override
  @Nullable
  public PsiElement getComment() {
    return findChildByType(COMMENT);
  }

  @Override
  @NotNull
  public PsiElement getId() {
    return findNotNullChildByType(ID);
  }

}
