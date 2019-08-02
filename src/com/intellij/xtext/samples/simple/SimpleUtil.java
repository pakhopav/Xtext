package com.intellij.xtext.samples.simple;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.PsiManager;
import com.intellij.psi.search.*;
import com.intellij.psi.util.PsiTreeUtil;
import com.intellij.xtext.samples.simple.psi.SimpleFile;
import com.intellij.xtext.samples.simple.psi.*;

import java.util.*;

public class SimpleUtil {
    public static List<SimpleEntity> findEntities(Project project, String key) {
        List<SimpleEntity> result = null;
        Collection<VirtualFile> virtualFiles =
                FileTypeIndex.getFiles(SimpleFileType.INSTANCE, GlobalSearchScope.allScope(project));
        for (VirtualFile virtualFile : virtualFiles) {
            SimpleFile simpleFile = (SimpleFile) PsiManager.getInstance(project).findFile(virtualFile);
            if (simpleFile != null) {
                SimpleEntity[] entities = PsiTreeUtil.getChildrenOfType(simpleFile, SimpleEntity.class);
                if (entities != null) {
                    for (SimpleEntity property : entities) {
                        if (key.equals(property.SimpleEntityGetID())) {
                            if (result == null) {
                                result = new ArrayList<SimpleEntity>();
                            }
                            result.add(property);
                        }
                    }
                }
            }
        }
        return result != null ? result : Collections.<SimpleEntity>emptyList();
    }

    public static List<SimpleEntity> findEntities(Project project) {
        List<SimpleEntity> result = new ArrayList<SimpleEntity>();
        Collection<VirtualFile> virtualFiles =
                FileTypeIndex.getFiles(SimpleFileType.INSTANCE, GlobalSearchScope.allScope(project));
        for (VirtualFile virtualFile : virtualFiles) {
            SimpleFile simpleFile = (SimpleFile) PsiManager.getInstance(project).findFile(virtualFile);
            if (simpleFile != null) {
                SimpleEntity[] properties = PsiTreeUtil.getChildrenOfType(simpleFile, SimpleEntity.class);
                if (properties != null) {
                    Collections.addAll(result, properties);
                }
            }
        }
        return result;
    }
}