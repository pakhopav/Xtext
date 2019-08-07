// This is a generated file. Not intended for manual editing.
package com.intellij.xtext.samples.simple.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.xtext.samples.simple.impl.*;

public interface SimpleTypes {

  IElementType ARRAY_BRACKETS = new SimpleElementType("ARRAY_BRACKETS");
  IElementType DATA_TYPE = new SimpleElementType("DATA_TYPE");
  IElementType ENTITY = new SimpleElementType("ENTITY");
  IElementType FEATURE = new SimpleElementType("FEATURE");
  IElementType JVM_ARGUMENT_TYPE_REFERENCE = new SimpleElementType("JVM_ARGUMENT_TYPE_REFERENCE");
  IElementType JVM_LOWER_BOUND = new SimpleElementType("JVM_LOWER_BOUND");
  IElementType JVM_LOWER_BOUND_ANDED = new SimpleElementType("JVM_LOWER_BOUND_ANDED");
  IElementType JVM_PARAMETERIZED_TYPE_REFERENCE = new SimpleElementType("JVM_PARAMETERIZED_TYPE_REFERENCE");
  IElementType JVM_TYPE_PARAMETER = new SimpleElementType("JVM_TYPE_PARAMETER");
  IElementType JVM_TYPE_REFERENCE = new SimpleElementType("JVM_TYPE_REFERENCE");
  IElementType JVM_UPPER_BOUND = new SimpleElementType("JVM_UPPER_BOUND");
  IElementType JVM_UPPER_BOUND_ANDED = new SimpleElementType("JVM_UPPER_BOUND_ANDED");
  IElementType JVM_WILDCARD_TYPE_REFERENCE = new SimpleElementType("JVM_WILDCARD_TYPE_REFERENCE");
  IElementType QUALIFIED_NAME = new SimpleElementType("QUALIFIED_NAME");
  IElementType QUALIFIED_NAME_IN_STATIC_IMPORT = new SimpleElementType("QUALIFIED_NAME_IN_STATIC_IMPORT");
  IElementType QUALIFIED_NAME_WITH_WILDCARD = new SimpleElementType("QUALIFIED_NAME_WITH_WILDCARD");
  IElementType REFERENCE_TO_DATATYPE = new SimpleElementType("REFERENCE_TO_DATATYPE");
  IElementType REFERENCE_TO_ENTITY = new SimpleElementType("REFERENCE_TO_ENTITY");
  IElementType VALID_ID = new SimpleElementType("VALID_ID");
  IElementType X_FUNCTION_TYPE_REF = new SimpleElementType("X_FUNCTION_TYPE_REF");
  IElementType X_IMPORT_DECLARATION = new SimpleElementType("X_IMPORT_DECLARATION");
  IElementType X_IMPORT_SECTION = new SimpleElementType("X_IMPORT_SECTION");

  IElementType BRACKET = new SimpleTokenType("BRACKET");
  IElementType COMMENT = new SimpleTokenType("COMMENT");
  IElementType DATATYPE = new SimpleTokenType("datatype");
  IElementType ENT = new SimpleTokenType("ent");
  IElementType EXTENDS = new SimpleTokenType("extends");
  IElementType HEX = new SimpleTokenType("HEX");
  IElementType ID = new SimpleTokenType("ID");
  IElementType INT = new SimpleTokenType("INT");
  IElementType ML_COMMENT = new SimpleTokenType("ML_COMMENT");
  IElementType REFERENCE_TO_QUALIFIEDNAME = new SimpleTokenType("REFERENCE_TO_QualifiedName");
  IElementType REFERENCE_TO_QUALIFIEDNAMEINSTATICIMPORT = new SimpleTokenType("REFERENCE_TO_QualifiedNameInStaticImport");
  IElementType REFERENCE_TO_VALIDID = new SimpleTokenType("REFERENCE_TO_ValidID");
  IElementType SEP = new SimpleTokenType("SEP");
  IElementType SL_COMMENT = new SimpleTokenType("SL_COMMENT");
  IElementType STRING = new SimpleTokenType("STRING");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ARRAY_BRACKETS) {
        return new SimpleArrayBracketsImpl(node);
      }
      else if (type == DATA_TYPE) {
        return new SimpleDataTypeImpl(node);
      }
      else if (type == ENTITY) {
        return new SimpleEntityImpl(node);
      }
      else if (type == FEATURE) {
        return new SimpleFeatureImpl(node);
      }
      else if (type == JVM_ARGUMENT_TYPE_REFERENCE) {
        return new SimpleJvmArgumentTypeReferenceImpl(node);
      }
      else if (type == JVM_LOWER_BOUND) {
        return new SimpleJvmLowerBoundImpl(node);
      }
      else if (type == JVM_LOWER_BOUND_ANDED) {
        return new SimpleJvmLowerBoundAndedImpl(node);
      }
      else if (type == JVM_PARAMETERIZED_TYPE_REFERENCE) {
        return new SimpleJvmParameterizedTypeReferenceImpl(node);
      }
      else if (type == JVM_TYPE_PARAMETER) {
        return new SimpleJvmTypeParameterImpl(node);
      }
      else if (type == JVM_TYPE_REFERENCE) {
        return new SimpleJvmTypeReferenceImpl(node);
      }
      else if (type == JVM_UPPER_BOUND) {
        return new SimpleJvmUpperBoundImpl(node);
      }
      else if (type == JVM_UPPER_BOUND_ANDED) {
        return new SimpleJvmUpperBoundAndedImpl(node);
      }
      else if (type == JVM_WILDCARD_TYPE_REFERENCE) {
        return new SimpleJvmWildcardTypeReferenceImpl(node);
      }
      else if (type == QUALIFIED_NAME) {
        return new SimpleQualifiedNameImpl(node);
      }
      else if (type == QUALIFIED_NAME_IN_STATIC_IMPORT) {
        return new SimpleQualifiedNameInStaticImportImpl(node);
      }
      else if (type == QUALIFIED_NAME_WITH_WILDCARD) {
        return new SimpleQualifiedNameWithWildcardImpl(node);
      }
      else if (type == REFERENCE_TO_DATATYPE) {
        return new SimpleReferenceToDatatypeImpl(node);
      }
      else if (type == REFERENCE_TO_ENTITY) {
        return new SimpleReferenceToEntityImpl(node);
      }
      else if (type == VALID_ID) {
        return new SimpleValidIDImpl(node);
      }
      else if (type == X_FUNCTION_TYPE_REF) {
        return new SimpleXFunctionTypeRefImpl(node);
      }
      else if (type == X_IMPORT_DECLARATION) {
        return new SimpleXImportDeclarationImpl(node);
      }
      else if (type == X_IMPORT_SECTION) {
        return new SimpleXImportSectionImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
