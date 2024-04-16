package com.google.protobuf;

import com.google.protobuf.r;
import com.google.protobuf.r.b;
import java.io.IOException;
import java.util.Map;
/* compiled from: ExtensionSchema.java */
/* loaded from: classes.dex */
abstract class n<T extends r.b<T>> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int a(Map.Entry<?, ?> entry);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract Object b(m mVar, k0 k0Var, int i);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract r<T> c(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract r<T> d(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract boolean e(k0 k0Var);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void f(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract <UT, UB> UB g(Object obj, v0 v0Var, Object obj2, m mVar, r<T> rVar, UB ub, c1<UT, UB> c1Var) throws IOException;

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void h(v0 v0Var, Object obj, m mVar, r<T> rVar) throws IOException;

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void i(f fVar, Object obj, m mVar, r<T> rVar) throws IOException;

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void j(i1 i1Var, Map.Entry<?, ?> entry) throws IOException;
}
