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
  // PackageDeclaration | Entity
  static boolean AbstractElement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AbstractElement")) return false;
    boolean r;
    r = PackageDeclaration(b, l + 1);
    if (!r) r = Entity(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // '[' ']'
  public static boolean ArrayBrackets(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArrayBrackets")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ARRAY_BRACKETS, "<array brackets>");
    r = consumeToken(b, "[");
    r = r && consumeToken(b, "]");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'entity'  ValidID  ('extends' JvmTypeReference  )? "{"
  //     Feature*
  //     "}"
  public static boolean Entity(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Entity")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, ENTITY, "<entity>");
    r = consumeToken(b, "entity");
    p = r; // pin = 1
    r = r && report_error_(b, ValidID(b, l + 1));
    r = p && report_error_(b, Entity_2(b, l + 1)) && r;
    r = p && report_error_(b, consumeToken(b, "{")) && r;
    r = p && report_error_(b, Entity_4(b, l + 1)) && r;
    r = p && consumeToken(b, "}") && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // ('extends' JvmTypeReference  )?
  private static boolean Entity_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Entity_2")) return false;
    Entity_2_0(b, l + 1);
    return true;
  }

  // 'extends' JvmTypeReference
  private static boolean Entity_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Entity_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "extends");
    r = r && JvmTypeReference(b, l + 1);
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
  // Property
  public static boolean Feature(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Feature")) return false;
    if (!nextTokenIs(b, STRING)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Property(b, l + 1);
    exit_section_(b, m, FEATURE, r);
    return r;
  }

  /* ********************************************************** */
  // JvmTypeReference | JvmWildcardTypeReference
  public static boolean JvmArgumentTypeReference(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "JvmArgumentTypeReference")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, JVM_ARGUMENT_TYPE_REFERENCE, "<jvm argument type reference>");
    r = JvmTypeReference(b, l + 1);
    if (!r) r = JvmWildcardTypeReference(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'super' JvmTypeReference
  public static boolean JvmLowerBound(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "JvmLowerBound")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, JVM_LOWER_BOUND, "<jvm lower bound>");
    r = consumeToken(b, "super");
    r = r && JvmTypeReference(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '&' JvmTypeReference
  public static boolean JvmLowerBoundAnded(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "JvmLowerBoundAnded")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, JVM_LOWER_BOUND_ANDED, "<jvm lower bound anded>");
    r = consumeToken(b, "&");
    r = r && JvmTypeReference(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // REFERENCE_TO_JvmType_QualifiedName (
  // 		'<' JvmArgumentTypeReference (',' JvmArgumentTypeReference)* '>'
  // 		('.' REFERENCE_TO_JvmType_ValidID ('<' JvmArgumentTypeReference (',' JvmArgumentTypeReference)* '>')?)*
  // 	)?
  public static boolean JvmParameterizedTypeReference(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "JvmParameterizedTypeReference")) return false;
    if (!nextTokenIs(b, ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = REFERENCE_TO_JvmType_QualifiedName(b, l + 1);
    r = r && JvmParameterizedTypeReference_1(b, l + 1);
    exit_section_(b, m, JVM_PARAMETERIZED_TYPE_REFERENCE, r);
    return r;
  }

  // (
  // 		'<' JvmArgumentTypeReference (',' JvmArgumentTypeReference)* '>'
  // 		('.' REFERENCE_TO_JvmType_ValidID ('<' JvmArgumentTypeReference (',' JvmArgumentTypeReference)* '>')?)*
  // 	)?
  private static boolean JvmParameterizedTypeReference_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "JvmParameterizedTypeReference_1")) return false;
    JvmParameterizedTypeReference_1_0(b, l + 1);
    return true;
  }

  // '<' JvmArgumentTypeReference (',' JvmArgumentTypeReference)* '>'
  // 		('.' REFERENCE_TO_JvmType_ValidID ('<' JvmArgumentTypeReference (',' JvmArgumentTypeReference)* '>')?)*
  private static boolean JvmParameterizedTypeReference_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "JvmParameterizedTypeReference_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "<");
    r = r && JvmArgumentTypeReference(b, l + 1);
    r = r && JvmParameterizedTypeReference_1_0_2(b, l + 1);
    r = r && consumeToken(b, ">");
    r = r && JvmParameterizedTypeReference_1_0_4(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (',' JvmArgumentTypeReference)*
  private static boolean JvmParameterizedTypeReference_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "JvmParameterizedTypeReference_1_0_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!JvmParameterizedTypeReference_1_0_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "JvmParameterizedTypeReference_1_0_2", c)) break;
    }
    return true;
  }

  // ',' JvmArgumentTypeReference
  private static boolean JvmParameterizedTypeReference_1_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "JvmParameterizedTypeReference_1_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && JvmArgumentTypeReference(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ('.' REFERENCE_TO_JvmType_ValidID ('<' JvmArgumentTypeReference (',' JvmArgumentTypeReference)* '>')?)*
  private static boolean JvmParameterizedTypeReference_1_0_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "JvmParameterizedTypeReference_1_0_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!JvmParameterizedTypeReference_1_0_4_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "JvmParameterizedTypeReference_1_0_4", c)) break;
    }
    return true;
  }

  // '.' REFERENCE_TO_JvmType_ValidID ('<' JvmArgumentTypeReference (',' JvmArgumentTypeReference)* '>')?
  private static boolean JvmParameterizedTypeReference_1_0_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "JvmParameterizedTypeReference_1_0_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ".");
    r = r && REFERENCE_TO_JvmType_ValidID(b, l + 1);
    r = r && JvmParameterizedTypeReference_1_0_4_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ('<' JvmArgumentTypeReference (',' JvmArgumentTypeReference)* '>')?
  private static boolean JvmParameterizedTypeReference_1_0_4_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "JvmParameterizedTypeReference_1_0_4_0_2")) return false;
    JvmParameterizedTypeReference_1_0_4_0_2_0(b, l + 1);
    return true;
  }

  // '<' JvmArgumentTypeReference (',' JvmArgumentTypeReference)* '>'
  private static boolean JvmParameterizedTypeReference_1_0_4_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "JvmParameterizedTypeReference_1_0_4_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "<");
    r = r && JvmArgumentTypeReference(b, l + 1);
    r = r && JvmParameterizedTypeReference_1_0_4_0_2_0_2(b, l + 1);
    r = r && consumeToken(b, ">");
    exit_section_(b, m, null, r);
    return r;
  }

  // (',' JvmArgumentTypeReference)*
  private static boolean JvmParameterizedTypeReference_1_0_4_0_2_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "JvmParameterizedTypeReference_1_0_4_0_2_0_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!JvmParameterizedTypeReference_1_0_4_0_2_0_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "JvmParameterizedTypeReference_1_0_4_0_2_0_2", c)) break;
    }
    return true;
  }

  // ',' JvmArgumentTypeReference
  private static boolean JvmParameterizedTypeReference_1_0_4_0_2_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "JvmParameterizedTypeReference_1_0_4_0_2_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && JvmArgumentTypeReference(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ValidID (JvmUpperBound (JvmUpperBoundAnded)*)?
  public static boolean JvmTypeParameter(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "JvmTypeParameter")) return false;
    if (!nextTokenIs(b, ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ValidID(b, l + 1);
    r = r && JvmTypeParameter_1(b, l + 1);
    exit_section_(b, m, JVM_TYPE_PARAMETER, r);
    return r;
  }

  // (JvmUpperBound (JvmUpperBoundAnded)*)?
  private static boolean JvmTypeParameter_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "JvmTypeParameter_1")) return false;
    JvmTypeParameter_1_0(b, l + 1);
    return true;
  }

  // JvmUpperBound (JvmUpperBoundAnded)*
  private static boolean JvmTypeParameter_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "JvmTypeParameter_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = JvmUpperBound(b, l + 1);
    r = r && JvmTypeParameter_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (JvmUpperBoundAnded)*
  private static boolean JvmTypeParameter_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "JvmTypeParameter_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!JvmTypeParameter_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "JvmTypeParameter_1_0_1", c)) break;
    }
    return true;
  }

  // (JvmUpperBoundAnded)
  private static boolean JvmTypeParameter_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "JvmTypeParameter_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = JvmUpperBoundAnded(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // JvmParameterizedTypeReference ( ArrayBrackets)*
  // 	| XFunctionTypeRef
  public static boolean JvmTypeReference(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "JvmTypeReference")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, JVM_TYPE_REFERENCE, "<jvm type reference>");
    r = JvmTypeReference_0(b, l + 1);
    if (!r) r = XFunctionTypeRef(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // JvmParameterizedTypeReference ( ArrayBrackets)*
  private static boolean JvmTypeReference_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "JvmTypeReference_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = JvmParameterizedTypeReference(b, l + 1);
    r = r && JvmTypeReference_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ArrayBrackets)*
  private static boolean JvmTypeReference_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "JvmTypeReference_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!JvmTypeReference_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "JvmTypeReference_0_1", c)) break;
    }
    return true;
  }

  // ( ArrayBrackets)
  private static boolean JvmTypeReference_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "JvmTypeReference_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ArrayBrackets(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'extends' JvmTypeReference
  public static boolean JvmUpperBound(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "JvmUpperBound")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, JVM_UPPER_BOUND, "<jvm upper bound>");
    r = consumeToken(b, "extends");
    r = r && JvmTypeReference(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '&' JvmTypeReference
  public static boolean JvmUpperBoundAnded(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "JvmUpperBoundAnded")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, JVM_UPPER_BOUND_ANDED, "<jvm upper bound anded>");
    r = consumeToken(b, "&");
    r = r && JvmTypeReference(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '?' (
  //                           JvmUpperBound (JvmUpperBoundAnded)*
  //                         | JvmLowerBound (JvmLowerBoundAnded)*
  //                         )?
  public static boolean JvmWildcardTypeReference(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "JvmWildcardTypeReference")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, JVM_WILDCARD_TYPE_REFERENCE, "<jvm wildcard type reference>");
    r = consumeToken(b, "?");
    r = r && JvmWildcardTypeReference_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (
  //                           JvmUpperBound (JvmUpperBoundAnded)*
  //                         | JvmLowerBound (JvmLowerBoundAnded)*
  //                         )?
  private static boolean JvmWildcardTypeReference_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "JvmWildcardTypeReference_1")) return false;
    JvmWildcardTypeReference_1_0(b, l + 1);
    return true;
  }

  // JvmUpperBound (JvmUpperBoundAnded)*
  //                         | JvmLowerBound (JvmLowerBoundAnded)*
  private static boolean JvmWildcardTypeReference_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "JvmWildcardTypeReference_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = JvmWildcardTypeReference_1_0_0(b, l + 1);
    if (!r) r = JvmWildcardTypeReference_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // JvmUpperBound (JvmUpperBoundAnded)*
  private static boolean JvmWildcardTypeReference_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "JvmWildcardTypeReference_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = JvmUpperBound(b, l + 1);
    r = r && JvmWildcardTypeReference_1_0_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (JvmUpperBoundAnded)*
  private static boolean JvmWildcardTypeReference_1_0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "JvmWildcardTypeReference_1_0_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!JvmWildcardTypeReference_1_0_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "JvmWildcardTypeReference_1_0_0_1", c)) break;
    }
    return true;
  }

  // (JvmUpperBoundAnded)
  private static boolean JvmWildcardTypeReference_1_0_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "JvmWildcardTypeReference_1_0_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = JvmUpperBoundAnded(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // JvmLowerBound (JvmLowerBoundAnded)*
  private static boolean JvmWildcardTypeReference_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "JvmWildcardTypeReference_1_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = JvmLowerBound(b, l + 1);
    r = r && JvmWildcardTypeReference_1_0_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (JvmLowerBoundAnded)*
  private static boolean JvmWildcardTypeReference_1_0_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "JvmWildcardTypeReference_1_0_1_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!JvmWildcardTypeReference_1_0_1_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "JvmWildcardTypeReference_1_0_1_1", c)) break;
    }
    return true;
  }

  // (JvmLowerBoundAnded)
  private static boolean JvmWildcardTypeReference_1_0_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "JvmWildcardTypeReference_1_0_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = JvmLowerBoundAnded(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'package' QualifiedName '{'
  //         AbstractElement*
  //     '}'
  public static boolean PackageDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PackageDeclaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PACKAGE_DECLARATION, "<package declaration>");
    r = consumeToken(b, "package");
    r = r && QualifiedName(b, l + 1);
    r = r && consumeToken(b, "{");
    r = r && PackageDeclaration_3(b, l + 1);
    r = r && consumeToken(b, "}");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // AbstractElement*
  private static boolean PackageDeclaration_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PackageDeclaration_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!AbstractElement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "PackageDeclaration_3", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // STRING ':' JvmTypeReference
  public static boolean Property(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Property")) return false;
    if (!nextTokenIs(b, STRING)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, STRING);
    r = r && consumeToken(b, ":");
    r = r && JvmTypeReference(b, l + 1);
    exit_section_(b, m, PROPERTY, r);
    return r;
  }

  /* ********************************************************** */
  // ValidID ("."ValidID)*
  public static boolean QualifiedName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "QualifiedName")) return false;
    if (!nextTokenIs(b, ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ValidID(b, l + 1);
    r = r && QualifiedName_1(b, l + 1);
    exit_section_(b, m, QUALIFIED_NAME, r);
    return r;
  }

  // ("."ValidID)*
  private static boolean QualifiedName_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "QualifiedName_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!QualifiedName_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "QualifiedName_1", c)) break;
    }
    return true;
  }

  // "."ValidID
  private static boolean QualifiedName_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "QualifiedName_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ".");
    r = r && ValidID(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (ValidID "." )+
  public static boolean QualifiedNameInStaticImport(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "QualifiedNameInStaticImport")) return false;
    if (!nextTokenIs(b, ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = QualifiedNameInStaticImport_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!QualifiedNameInStaticImport_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "QualifiedNameInStaticImport", c)) break;
    }
    exit_section_(b, m, QUALIFIED_NAME_IN_STATIC_IMPORT, r);
    return r;
  }

  // ValidID "."
  private static boolean QualifiedNameInStaticImport_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "QualifiedNameInStaticImport_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ValidID(b, l + 1);
    r = r && consumeToken(b, ".");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // QualifiedName ".*"
  public static boolean QualifiedNameWithWildcard(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "QualifiedNameWithWildcard")) return false;
    if (!nextTokenIs(b, ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = QualifiedName(b, l + 1);
    r = r && consumeToken(b, ".*");
    exit_section_(b, m, QUALIFIED_NAME_WITH_WILDCARD, r);
    return r;
  }

  /* ********************************************************** */
  // QualifiedName
  public static boolean REFERENCE_TO_JvmDeclaredType_QualifiedName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "REFERENCE_TO_JvmDeclaredType_QualifiedName")) return false;
    if (!nextTokenIs(b, ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = QualifiedName(b, l + 1);
    exit_section_(b, m, REFERENCE_TO_JVM_DECLARED_TYPE_QUALIFIED_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // QualifiedNameInStaticImport
  public static boolean REFERENCE_TO_JvmDeclaredType_QualifiedNameInStaticImport(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "REFERENCE_TO_JvmDeclaredType_QualifiedNameInStaticImport")) return false;
    if (!nextTokenIs(b, ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = QualifiedNameInStaticImport(b, l + 1);
    exit_section_(b, m, REFERENCE_TO_JVM_DECLARED_TYPE_QUALIFIED_NAME_IN_STATIC_IMPORT, r);
    return r;
  }

  /* ********************************************************** */
  // QualifiedName
  public static boolean REFERENCE_TO_JvmType_QualifiedName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "REFERENCE_TO_JvmType_QualifiedName")) return false;
    if (!nextTokenIs(b, ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = QualifiedName(b, l + 1);
    exit_section_(b, m, REFERENCE_TO_JVM_TYPE_QUALIFIED_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // ValidID
  public static boolean REFERENCE_TO_JvmType_ValidID(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "REFERENCE_TO_JvmType_ValidID")) return false;
    if (!nextTokenIs(b, ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ValidID(b, l + 1);
    exit_section_(b, m, REFERENCE_TO_JVM_TYPE_VALID_ID, r);
    return r;
  }

  /* ********************************************************** */
  // ID
  public static boolean ValidID(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ValidID")) return false;
    if (!nextTokenIs(b, ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ID);
    exit_section_(b, m, VALID_ID, r);
    return r;
  }

  /* ********************************************************** */
  // ('(' (JvmTypeReference (',' JvmTypeReference)*)? ')')? '=>' JvmTypeReference
  public static boolean XFunctionTypeRef(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "XFunctionTypeRef")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, X_FUNCTION_TYPE_REF, "<x function type ref>");
    r = XFunctionTypeRef_0(b, l + 1);
    r = r && consumeToken(b, "=>");
    r = r && JvmTypeReference(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ('(' (JvmTypeReference (',' JvmTypeReference)*)? ')')?
  private static boolean XFunctionTypeRef_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "XFunctionTypeRef_0")) return false;
    XFunctionTypeRef_0_0(b, l + 1);
    return true;
  }

  // '(' (JvmTypeReference (',' JvmTypeReference)*)? ')'
  private static boolean XFunctionTypeRef_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "XFunctionTypeRef_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "(");
    r = r && XFunctionTypeRef_0_0_1(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, null, r);
    return r;
  }

  // (JvmTypeReference (',' JvmTypeReference)*)?
  private static boolean XFunctionTypeRef_0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "XFunctionTypeRef_0_0_1")) return false;
    XFunctionTypeRef_0_0_1_0(b, l + 1);
    return true;
  }

  // JvmTypeReference (',' JvmTypeReference)*
  private static boolean XFunctionTypeRef_0_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "XFunctionTypeRef_0_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = JvmTypeReference(b, l + 1);
    r = r && XFunctionTypeRef_0_0_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (',' JvmTypeReference)*
  private static boolean XFunctionTypeRef_0_0_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "XFunctionTypeRef_0_0_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!XFunctionTypeRef_0_0_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "XFunctionTypeRef_0_0_1_0_1", c)) break;
    }
    return true;
  }

  // ',' JvmTypeReference
  private static boolean XFunctionTypeRef_0_0_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "XFunctionTypeRef_0_0_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && JvmTypeReference(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "import" (
  //                     ("static" ("extension")? REFERENCE_TO_JvmDeclaredType_QualifiedNameInStaticImport ("*" | ValidID))
  //                      | REFERENCE_TO_JvmDeclaredType_QualifiedName
  //                      | QualifiedNameWithWildcard) ';'?
  public static boolean XImportDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "XImportDeclaration")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, X_IMPORT_DECLARATION, "<x import declaration>");
    r = consumeToken(b, "import");
    p = r; // pin = 1
    r = r && report_error_(b, XImportDeclaration_1(b, l + 1));
    r = p && XImportDeclaration_2(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // ("static" ("extension")? REFERENCE_TO_JvmDeclaredType_QualifiedNameInStaticImport ("*" | ValidID))
  //                      | REFERENCE_TO_JvmDeclaredType_QualifiedName
  //                      | QualifiedNameWithWildcard
  private static boolean XImportDeclaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "XImportDeclaration_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = XImportDeclaration_1_0(b, l + 1);
    if (!r) r = REFERENCE_TO_JvmDeclaredType_QualifiedName(b, l + 1);
    if (!r) r = QualifiedNameWithWildcard(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // "static" ("extension")? REFERENCE_TO_JvmDeclaredType_QualifiedNameInStaticImport ("*" | ValidID)
  private static boolean XImportDeclaration_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "XImportDeclaration_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "static");
    r = r && XImportDeclaration_1_0_1(b, l + 1);
    r = r && REFERENCE_TO_JvmDeclaredType_QualifiedNameInStaticImport(b, l + 1);
    r = r && XImportDeclaration_1_0_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ("extension")?
  private static boolean XImportDeclaration_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "XImportDeclaration_1_0_1")) return false;
    XImportDeclaration_1_0_1_0(b, l + 1);
    return true;
  }

  // ("extension")
  private static boolean XImportDeclaration_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "XImportDeclaration_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "extension");
    exit_section_(b, m, null, r);
    return r;
  }

  // "*" | ValidID
  private static boolean XImportDeclaration_1_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "XImportDeclaration_1_0_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "*");
    if (!r) r = ValidID(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ';'?
  private static boolean XImportDeclaration_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "XImportDeclaration_2")) return false;
    consumeToken(b, ";");
    return true;
  }

  /* ********************************************************** */
  // XImportDeclaration+
  public static boolean XImportSection(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "XImportSection")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, X_IMPORT_SECTION, "<x import section>");
    r = XImportDeclaration(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!XImportDeclaration(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "XImportSection", c)) break;
    }
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // XImportSection? AbstractElement*
  static boolean simpleFile(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simpleFile")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = simpleFile_0(b, l + 1);
    r = r && simpleFile_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // XImportSection?
  private static boolean simpleFile_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simpleFile_0")) return false;
    XImportSection(b, l + 1);
    return true;
  }

  // AbstractElement*
  private static boolean simpleFile_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simpleFile_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!AbstractElement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "simpleFile_1", c)) break;
    }
    return true;
  }

}
