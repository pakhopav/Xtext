// This is a generated file. Not intended for manual editing.
package com.intellij.xtext.samples.simple.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SimpleEntity extends SimpleNamedElement {

  @NotNull
  List<SimpleFeature> getFeatureList();

  @NotNull
  PsiElement getId();

  @NotNull
  PsiElement getEnt();

  String SimpleEntityGetID();

  String getName();

  PsiElement setName(String newName);

  PsiElement getNameIdentifier();

}
