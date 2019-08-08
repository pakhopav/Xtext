// This is a generated file. Not intended for manual editing.
package com.intellij.xtext.samples.simple.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SimplePackageDeclaration extends PsiElement {

  @NotNull
  List<SimpleEntity> getEntityList();

  @NotNull
  List<SimplePackageDeclaration> getPackageDeclarationList();

  @NotNull
  SimpleQualifiedName getXname();

}
