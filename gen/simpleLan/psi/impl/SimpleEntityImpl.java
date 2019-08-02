// This is a generated file. Not intended for manual editing.
package simpleLan.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static simpleLan.psi.SimpleTypes.*;
import simpleLan.psi.*;

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
  @NotNull
  public List<SimpleFeature> getFeatureList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SimpleFeature.class);
  }

  @Override
  @NotNull
  public PsiElement getId() {
    return findNotNullChildByType(ID);
  }

  @Override
  @NotNull
  public PsiElement getEnt() {
    return findNotNullChildByType(ENT);
  }

  @Override
  public String SimpleEntityGetID() {
    return SimplePsiImplUtil.SimpleEntityGetID(this);
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
