// This is a generated file. Not intended for manual editing.
package com.intellij.xtext.samples.simple.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static com.intellij.xtext.samples.simple.psi.SimpleTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.tree.IFileElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class SimpleParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    if (t instanceof IFileElementType) {
      r = parse_root_(t, b, 0);
    }
    else {
      r = false;
    }
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return simpleFile(b, l + 1);
  }

  /* ********************************************************** */
  // datatype  ID
  public static boolean DataType(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DataType")) return false;
    if (!nextTokenIs(b, DATATYPE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, DATATYPE, ID);
    exit_section_(b, m, DATA_TYPE, r);
    return r;
  }

  /* ********************************************************** */
  // ent  ID  (extends REFERENCE_TO_ENTITY  )? "{"
  //     Feature*
  //     "}"
  public static boolean Entity(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Entity")) return false;
    if (!nextTokenIs(b, ENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, ENT, ID);
    r = r && Entity_2(b, l + 1);
    r = r && consumeToken(b, "{");
    r = r && Entity_4(b, l + 1);
    r = r && consumeToken(b, "}");
    exit_section_(b, m, ENTITY, r);
    return r;
  }

  // (extends REFERENCE_TO_ENTITY  )?
  private static boolean Entity_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Entity_2")) return false;
    Entity_2_0(b, l + 1);
    return true;
  }

  // extends REFERENCE_TO_ENTITY
  private static boolean Entity_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Entity_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, EXTENDS);
    r = r && REFERENCE_TO_ENTITY(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // Feature*
  private static boolean Entity_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Entity_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!Feature(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Entity_4", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // ID SEP REFERENCE_TO_DATATYPE
  public static boolean Feature(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Feature")) return false;
    if (!nextTokenIs(b, ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, ID, SEP);
    r = r && REFERENCE_TO_DATATYPE(b, l + 1);
    exit_section_(b, m, FEATURE, r);
    return r;
  }

  /* ********************************************************** */
  // ID
  public static boolean REFERENCE_TO_DATATYPE(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "REFERENCE_TO_DATATYPE")) return false;
    if (!nextTokenIs(b, ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ID);
    exit_section_(b, m, REFERENCE_TO_DATATYPE, r);
    return r;
  }

  /* ********************************************************** */
  // ID
  public static boolean REFERENCE_TO_ENTITY(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "REFERENCE_TO_ENTITY")) return false;
    if (!nextTokenIs(b, ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ID);
    exit_section_(b, m, REFERENCE_TO_ENTITY, r);
    return r;
  }

  /* ********************************************************** */
  // DataType | Entity | COMMENT
  static boolean Type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Type")) return false;
    boolean r;
    r = DataType(b, l + 1);
    if (!r) r = Entity(b, l + 1);
    if (!r) r = consumeToken(b, COMMENT);
    return r;
  }

  /* ********************************************************** */
  // Type*
  static boolean simpleFile(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simpleFile")) return false;
    while (true) {
      int c = current_position_(b);
      if (!Type(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "simpleFile", c)) break;
    }
    return true;
  }

}
