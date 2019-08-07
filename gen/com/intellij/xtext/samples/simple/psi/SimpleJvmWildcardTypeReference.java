// This is a generated file. Not intended for manual editing.
package com.intellij.xtext.samples.simple.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SimpleJvmWildcardTypeReference extends PsiElement {

  @Nullable
  SimpleJvmLowerBound getJvmLowerBound();

  @NotNull
  List<SimpleJvmLowerBoundAnded> getJvmLowerBoundAndedList();

  @NotNull
  List<SimpleJvmUpperBoundAnded> getJvmUpperBoundAndedList();

  @Nullable
  SimpleJvmUpperBound getConstraints();

}
