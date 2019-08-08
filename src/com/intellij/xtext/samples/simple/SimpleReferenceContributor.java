package com.intellij.xtext.samples.simple;

import com.intellij.openapi.util.TextRange;
import com.intellij.patterns.PlatformPatterns;
import com.intellij.psi.*;
import com.intellij.util.ProcessingContext;
import com.intellij.xtext.samples.simple.psi.*;
import org.jetbrains.annotations.NotNull;

public class SimpleReferenceContributor extends PsiReferenceContributor {
    @Override
    public void registerReferenceProviders(@NotNull PsiReferenceRegistrar registrar) {
        registrar.registerReferenceProvider(PlatformPatterns.psiElement(SimpleREFERENCETOJvmTypeValidID.class).withLanguage(SimpleLanguage.INSTANCE),
                new PsiReferenceProvider() {
                    @NotNull
                    @Override
                    public PsiReference[] getReferencesByElement(@NotNull PsiElement element,
                                                                 @NotNull ProcessingContext
                                                                         context) {
                        SimpleREFERENCETOJvmTypeValidID simpleRef = (SimpleREFERENCETOJvmTypeValidID) element;
                        String value = simpleRef.getText() instanceof String ?  simpleRef.getValidID().getText() : null;

                        return new PsiReference[]{
                                new SimpleReference(element, new TextRange(0, value.length()), SimpleEntity.class)};




                    }
                });
        registrar.registerReferenceProvider(PlatformPatterns.psiElement(SimpleREFERENCETOJvmTypeQualifiedName.class).withLanguage(SimpleLanguage.INSTANCE),
                new PsiReferenceProvider() {
                    @NotNull
                    @Override
                    public PsiReference[] getReferencesByElement(@NotNull PsiElement element,
                                                                 @NotNull ProcessingContext
                                                                         context) {
                        SimpleREFERENCETOJvmTypeQualifiedName simpleRef = (SimpleREFERENCETOJvmTypeQualifiedName) element;
                        String value = simpleRef.getText() instanceof String ?  simpleRef.getQualifiedName().getText() : null;

                        return new PsiReference[]{
                                new SimpleReference(element, new TextRange(0, value.length()), SimpleEntity.class)};




                    }
                });
        registrar.registerReferenceProvider(PlatformPatterns.psiElement(SimpleREFERENCETOJvmDeclaredTypeQualifiedName.class).withLanguage(SimpleLanguage.INSTANCE),
                new PsiReferenceProvider() {
                    @NotNull
                    @Override
                    public PsiReference[] getReferencesByElement(@NotNull PsiElement element,
                                                                 @NotNull ProcessingContext
                                                                         context) {
                        SimpleREFERENCETOJvmDeclaredTypeQualifiedName simpleRef = (SimpleREFERENCETOJvmDeclaredTypeQualifiedName) element;
                        String value = simpleRef.getText() instanceof String ?  simpleRef.getQualifiedName().getText() : null;

                        return new PsiReference[]{
                                new SimpleReference(element, new TextRange(0, value.length()), SimpleEntity.class)};




                    }
                });
        registrar.registerReferenceProvider(PlatformPatterns.psiElement(SimpleREFERENCETOJvmDeclaredTypeQualifiedNameInStaticImport.class).withLanguage(SimpleLanguage.INSTANCE),
                new PsiReferenceProvider() {
                    @NotNull
                    @Override
                    public PsiReference[] getReferencesByElement(@NotNull PsiElement element,
                                                                 @NotNull ProcessingContext
                                                                         context) {
                        SimpleREFERENCETOJvmDeclaredTypeQualifiedNameInStaticImport simpleRef = (SimpleREFERENCETOJvmDeclaredTypeQualifiedNameInStaticImport) element;
                        String value = simpleRef.getText() instanceof String ?  simpleRef.getQualifiedNameInStaticImport().getText() : null;

                        return new PsiReference[]{
                                new SimpleReference(element, new TextRange(0, value.length()), SimpleEntity.class)};




                    }
                });


    }
}