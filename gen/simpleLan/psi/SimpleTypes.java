// This is a generated file. Not intended for manual editing.
package simpleLan.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import simpleLan.psi.impl.*;

public interface SimpleTypes {

  IElementType DATA_TYPE = new SimpleElementType("DATA_TYPE");
  IElementType ENTITY = new SimpleElementType("ENTITY");
  IElementType FEATURE = new SimpleElementType("FEATURE");

  IElementType BRACKET = new SimpleTokenType("BRACKET");
  IElementType COMMENT = new SimpleTokenType("COMMENT");
  IElementType DATATYPE = new SimpleTokenType("datatype");
  IElementType ENT = new SimpleTokenType("ent");
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
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
