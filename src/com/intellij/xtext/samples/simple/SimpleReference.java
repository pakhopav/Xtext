package com.intellij.xtext.samples.simple;

import com.intellij.codeInsight.lookup.*;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.util.TextRange;
import com.intellij.psi.*;
import com.intellij.xtext.samples.simple.psi.SimpleDataType;
import com.intellij.xtext.samples.simple.psi.SimpleEntity;
import com.intellij.xtext.samples.simple.psi.SimpleNamedElement;
import cucumber.api.java.ro.Si;
import org.jetbrains.annotations.*;

import java.util.*;

public class SimpleReference<T extends SimpleNamedElement> extends PsiReferenceBase<PsiElement> implements PsiPolyVariantReference {
    private String key;
    private Class<T> tClass;

    public SimpleReference(@NotNull PsiElement element, TextRange textRange, Class<T> tClass) {
        super(element, textRange);
        key = element.getText().substring(textRange.getStartOffset(), textRange.getEndOffset());
        this.tClass= tClass;
    }

    @NotNull
    @Override
    public ResolveResult[] multiResolve(boolean incompleteCode) {
        return myMultiResolve(incompleteCode,   tClass);
    }

    @Nullable
    @Override
    public PsiElement resolve() {
        ResolveResult[] resolveResults = multiResolve(false);
        return resolveResults.length == 1 ? resolveResults[0].getElement() : null;
    }

    @NotNull
    @Override
    public Object[] getVariants() {
        return myGetVariants(tClass);
    }

    public <T extends SimpleNamedElement> ResolveResult[] myMultiResolve(boolean incompleteCode, final Class<T> tClass) {
        Project project = myElement.getProject();
        List<T> elements= SimpleUtil.findElements(project, tClass, key );
        List<ResolveResult> results = new ArrayList<ResolveResult>();
        for (T element : elements) {
            results.add(new PsiElementResolveResult( element));
        }
        return results.toArray(new ResolveResult[results.size()]);
    }


    public <T extends SimpleNamedElement> Object[] myGetVariants( final Class<T> tClass) {
        Project project = myElement.getProject();
        List<T> dataTypes = SimpleUtil.findElements(project,tClass);
        List<LookupElement> variants = new ArrayList<LookupElement>();
        for (final T dataType : dataTypes) {
            if (dataType.getName() != null && dataType.getName().length() > 0) {
                variants.add(LookupElementBuilder.create(dataType).
                        withIcon(SimpleIcons.FILE).
                        withTypeText(dataType.getContainingFile().getName())
                );
            }
        }
        return variants.toArray();
    }






}