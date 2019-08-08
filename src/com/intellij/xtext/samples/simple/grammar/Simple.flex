package com.intellij.xtext.samples.simple;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;import com.intellij.xtext.samples.simple.psi.SimpleTypes;

import static com.intellij.psi.TokenType.BAD_CHARACTER; // Pre-defined bad character token.
import static com.intellij.psi.TokenType.WHITE_SPACE; // Pre-defined whitespace character token.
import static com.intellij.xtext.samples.simple.psi.SimpleTypes.*; // Note that is the class which is specified as `elementTypeHolderClass`
// in bnf grammar file. This will contain all other tokens which we will use.

%%

%public
%class SimpleLexer // Name of the lexer class which will be generated.
%implements FlexLexer
%function advance
%type IElementType
%unicode

ID=\^?[a-zA-Z$_][a-zA-Z0-9$_]*
BRACKET=[{}\[\]<>]
STRING = (\"([^\"\\]|\\.)*\"|'([^'\\]|\\.)*')
DOT=\.
COMMA= ,
INT=[0-9]+
OPERATORS = [+\-*/]
SEPARATOR = :
WHITE_SPACE=[ \t\n\x0B\f\r]+
END_OF_LINE_COMMENT=("#"|"!")[^\r\n]*


%%
<YYINITIAL> {


"entity" {return KEYWORD_ENTITY;}
"pakage" {return KEYWORD_PAKAGE;}
"extends" {return KEYWORD_EXTENDS;}
{ID} {return ID; }
{STRING} {return STRING;}
{OPERATORS} {return OPERATORS;}
{INT} {return INT;}
{BRACKET} {return BRACKET;}
{SEPARATOR} {return SEP;}
{WHITE_SPACE} { return WHITE_SPACE;}
{END_OF_LINE_COMMENT} {return SL_COMMENT;}
{DOT} {return DOT;}
{COMMA} {return COMMA;}
}


[^] { return BAD_CHARACTER; }