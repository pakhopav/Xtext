// This is a generated file. Not intended for manual editing.
package com.intellij.xtext.samples.simple.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.xtext.samples.simple.impl.*;

public interface SimpleTypes {

  IElementType DATA_TYPE = new SimpleElementType("DATA_TYPE");
  IElementType ENTITY = new SimpleElementType("ENTITY");
  IElementType FEATURE = new SimpleElementType("FEATURE");
  IElementType REFERENCE_TO_DATATYPE = new SimpleElementType("REFERENCE_TO_DATATYPE");
  IElementType REFERENCE_TO_ENTITY = new SimpleElementType("REFERENCE_TO_ENTITY");

  IElementType BRACKET = new SimpleTokenType("BRACKET");
  IElementType COMMENT = new SimpleTokenType("COMMENT");
  IElementType DATATYPE = new SimpleTokenType("datatype");
  IElementType ENT = new SimpleTokenType("ent");
  IElementType EXTENDS = new SimpleTokenType("extends");
  IElementType ID = new SimpleTokenType("ID");
  IElementType SEP = new SimpleTokenType("SEP");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == DATA_TYPE) {
        return new SimpleDataTypeImpl(node);
      }
      else if (type == ENTITY) {
        return new SimpleEntityImpl(node);
      }
      else if (type == FEATURE) {
        return new SimpleFeatureImpl(node);
      }
      else if (type == REFERENCE_TO_DATATYPE) {
        return new SimpleReferenceToDatatypeImpl(node);
      }
      else if (type == REFERENCE_TO_ENTITY) {
        return new SimpleReferenceToEntityImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
