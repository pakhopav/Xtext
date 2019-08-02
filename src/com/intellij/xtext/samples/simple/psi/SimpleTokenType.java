package com.intellij.xtext.samples.simple.psi;


import com.intellij.psi.tree.IElementType;
import com.intellij.xtext.samples.simple.SimpleLanguage;
import org.jetbrains.annotations.*;

public class SimpleTokenType extends IElementType {
    public SimpleTokenType(@NotNull @NonNls String debugName) {
        super(debugName, SimpleLanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return "SimpleTokenType." + super.toString();
    }
}