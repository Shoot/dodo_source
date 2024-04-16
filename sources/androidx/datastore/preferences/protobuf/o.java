package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.s;
import androidx.datastore.preferences.protobuf.s.b;
import java.io.IOException;
import java.util.Map;
/* compiled from: ExtensionSchema.java */
/* loaded from: classes.dex */
abstract class o<T extends s.b<T>> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int a(Map.Entry<?, ?> entry);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract Object b(n nVar, l0 l0Var, int i);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract s<T> c(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract s<T> d(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract boolean e(l0 l0Var);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void f(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract <UT, UB> UB g(w0 w0Var, Object obj, n nVar, s<T> sVar, UB ub, d1<UT, UB> d1Var) throws IOException;

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void h(w0 w0Var, Object obj, n nVar, s<T> sVar) throws IOException;

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void i(g gVar, Object obj, n nVar, s<T> sVar) throws IOException;

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void j(j1 j1Var, Map.Entry<?, ?> entry) throws IOException;
}
