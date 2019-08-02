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

public class SimpleDataTypeImpl extends ASTWrapperPsiElement implements SimpleDataType {

  public SimpleDataTypeImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SimpleVisitor visitor) {
    visitor.visitDataType(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SimpleVisitor) accept((SimpleVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public SimpleEntity getEntity() {
    return findNotNullChildByClass(SimpleEntity.class);
  }

  @Override
  @NotNull
  public PsiElement getDatatype() {
    return findNotNullChildByType(DATATYPE);
  }

}
