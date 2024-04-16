package defpackage;

import java.io.IOException;
/* compiled from: StdScalarSerializer.java */
/* renamed from: bxa  reason: default package */
/* loaded from: classes2.dex */
public abstract class bxa<T> extends cxa<T> {
    /* JADX INFO: Access modifiers changed from: protected */
    public bxa(Class<T> cls) {
        super(cls);
    }

    @Override // defpackage.gc5
    public void i(T t, ua5 ua5Var, bda bdaVar, bob bobVar) throws IOException {
        c9c g = bobVar.g(ua5Var, bobVar.d(t, nc5.VALUE_STRING));
        f(t, ua5Var, bdaVar);
        bobVar.h(ua5Var, g);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public bxa(Class<?> cls, boolean z) {
        super(cls);
    }
}
