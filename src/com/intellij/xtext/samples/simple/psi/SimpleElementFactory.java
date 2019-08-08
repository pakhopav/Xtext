package com.intellij.xtext.samples.simple.psi;

import com. intellij.openapi.project.Project;
import com.intellij.psi.*;
import com.intellij.xtext.samples.simple.SimpleFileType;
import com.intellij.xtext.samples.simple.psi.SimpleEntity;

public class SimpleElementFactory {
    public static SimpleEntity createProperty(Project project, String name) {
        final SimpleFile file = createFile(project, name);
        return (SimpleEntity) file.getFirstChild();
    }

    public static SimpleFile createFile(Project project, String text) {
        String name = "dummy.simple";
        return (SimpleFile) PsiFileFactory.getInstance(project).
                createFileFromText(name, SimpleFileType.INSTANCE, text);
    }
}