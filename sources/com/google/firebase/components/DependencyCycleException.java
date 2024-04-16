package com.google.firebase.components;

import java.util.Arrays;
import java.util.List;
/* loaded from: classes2.dex */
public class DependencyCycleException extends DependencyException {
    private final List<bm1<?>> a;

    public DependencyCycleException(List<bm1<?>> list) {
        super("Dependency cycle detected: " + Arrays.toString(list.toArray()));
        this.a = list;
    }
}
