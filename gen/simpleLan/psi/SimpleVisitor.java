// This is a generated file. Not intended for manual editing.
package simpleLan.psi;

import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.PsiElement;

public class SimpleVisitor extends PsiElementVisitor {

  public void visitDataType(@NotNull SimpleDataType o) {
    visitPsiElement(o);
  }

  public void visitEntity(@NotNull SimpleEntity o) {
    visitNamedElement(o);
  }

  public void visitFeature(@NotNull SimpleFeature o) {
    visitPsiElement(o);
  }

  public void visitNamedElement(@NotNull SimpleNamedElement o) {
    visitPsiElement(o);
  }

  public void visitPsiElement(@NotNull PsiElement o) {
    visitElement(o);
  }

}
