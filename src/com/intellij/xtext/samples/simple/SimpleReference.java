package com.intellij.xtext.samples.simple;

import com.intellij.codeInsight.lookup.*;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.util.TextRange;
import com.intellij.psi.*;
import com.intellij.xtext.samples.simple.psi.SimpleEntity;
import org.jetbrains.annotations.*;

import java.util.*;

public class SimpleReference extends PsiReferenceBase<PsiElement> implements PsiPolyVariantReference {
    private String key;

    public SimpleReference(@NotNull PsiElement element, TextRange textRange) {
        super(element, textRange);
        key = element.getText().substring(textRange.getStartOffset(), textRange.getEndOffset());
    }

    @NotNull
    @Override
    public ResolveResult[] multiResolve(boolean incompleteCode) {
        Project project = myElement.getProject();
        final List<SimpleEntity> properties = SimpleUtil.findEntities(project, key);
        List<ResolveResult> results = new ArrayList<ResolveResult>();
        for (SimpleEntity property : properties) {
            results.add(new PsiElementResolveResult(property));
        }
        return results.toArray(new ResolveResult[results.size()]);
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
        Project project = myElement.getProject();
        List<SimpleEntity> properties = SimpleUtil.findEntities(project);
        List<LookupElement> variants = new ArrayList<LookupElement>();
        for (final SimpleEntity property : properties) {
            if (property.SimpleEntityGetID() != null && property.SimpleEntityGetID().length() > 0) {
                variants.add(LookupElementBuilder.create(property).
                        withIcon(SimpleIcons.FILE).
                        withTypeText(property.getContainingFile().getName())
                );
            }
        }
        return variants.toArray();
    }
}