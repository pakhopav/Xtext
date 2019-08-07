// This is a generated file. Not intended for manual editing.
package com.intellij.xtext.samples.simple.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SimpleJvmTypeParameter extends PsiElement {

  @NotNull
  List<SimpleJvmUpperBoundAnded> getJvmUpperBoundAndedList();

  @NotNull
  SimpleValidID getValidID();

  @Nullable
  SimpleJvmUpperBound getConstraints();

}
