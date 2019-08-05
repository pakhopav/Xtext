package com.intellij.xtext.samples.simple;

import com.intellij.openapi.util.TextRange;
import com.intellij.patterns.PlatformPatterns;
import com.intellij.psi.*;
import com.intellij.util.ProcessingContext;
import com.intellij.xtext.samples.simple.psi.SimpleDataType;
import com.intellij.xtext.samples.simple.psi.SimpleEntity;
import com.intellij.xtext.samples.simple.psi.SimpleReferenceToDatatype;
import com.intellij.xtext.samples.simple.psi.SimpleReferenceToEntity;
import org.jetbrains.annotations.NotNull;

public class SimpleReferenceContributor extends PsiReferenceContributor {
    @Override
    public void registerReferenceProviders(@NotNull PsiReferenceRegistrar registrar) {
        registrar.registerReferenceProvider(PlatformPatterns.psiElement(SimpleReferenceToEntity.class).withLanguage(SimpleLanguage.INSTANCE),
                new PsiReferenceProvider() {
                    @NotNull
                    @Override
                    public PsiReference[] getReferencesByElement(@NotNull PsiElement element,
                                                                 @NotNull ProcessingContext
                                                                         context) {
                        SimpleReferenceToEntity simpleRef = (SimpleReferenceToEntity) element;
                        String value = simpleRef.getText() instanceof String ? (String) simpleRef.getId().getText() : null;
                        return new PsiReference[]{
                            new SimpleReference(element, new TextRange(0, value.length()), SimpleEntity.class)};
                    }
                });
        registrar.registerReferenceProvider(PlatformPatterns.psiElement(SimpleReferenceToDatatype.class).withLanguage(SimpleLanguage.INSTANCE),
                new PsiReferenceProvider() {
                    @NotNull
                    @Override
                    public PsiReference[] getReferencesByElement(@NotNull PsiElement element,
                                                                 @NotNull ProcessingContext
                                                                         context) {
                        SimpleReferenceToDatatype simpleRef = (SimpleReferenceToDatatype) element;
                        String value = simpleRef.getText() instanceof String ? (String) simpleRef.getId().getText() : null;
                        return new PsiReference[]{
                                new SimpleReference(element, new TextRange(0, value.length()), SimpleDataType.class)};
                    }
                });
    }
}