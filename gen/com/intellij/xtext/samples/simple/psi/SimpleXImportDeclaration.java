// This is a generated file. Not intended for manual editing.
package com.intellij.xtext.samples.simple.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SimpleXImportDeclaration extends PsiElement {

  @Nullable
  SimpleValidID getValidID();

  @Nullable
  PsiElement getREFERENCETOQualifiedName();

  @Nullable
  PsiElement getImportedType();

  @Nullable
  SimpleQualifiedNameWithWildcard getImportedNamespace();

}
