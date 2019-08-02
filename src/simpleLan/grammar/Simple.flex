package simpleLan;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER; // Pre-defined bad character token.
import static com.intellij.psi.TokenType.WHITE_SPACE; // Pre-defined whitespace character token.
import static simpleLan.psi.SimpleTypes.*; // Note that is the class which is specified as `elementTypeHolderClass`
// in bnf grammar file. This will contain all other tokens which we will use.

%%

%public
%class SimpleLexer // Name of the lexer class which will be generated.
%implements FlexLexer
%function advance
%type IElementType
%unicode


ID=[a-zA-Z_][a-zA-Z0-9_]*
BRACKET=[{}]
SEPARATOR = :
WHITE_SPACE=[ \t\n\x0B\f\r]+
END_OF_LINE_COMMENT=("#"|"!")[^\r\n]*


%%
<YYINITIAL> {

"datatype" { return DATATYPE; }
"ent" {return ENT;}
{ID} { return ID; }
{END_OF_LINE_COMMENT} {return COMMENT;}
{BRACKET} {return BRACKET;}
{WHITE_SPACE} { return WHITE_SPACE;}
{SEPARATOR} {return SEP;}
}


[^] { return BAD_CHARACTER; }