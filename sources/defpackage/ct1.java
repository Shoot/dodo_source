package defpackage;
/* compiled from: ContainerSerializer.java */
/* renamed from: ct1  reason: default package */
/* loaded from: classes2.dex */
public abstract class ct1<T> extends cxa<T> {
    /* JADX INFO: Access modifiers changed from: protected */
    public ct1(Class<T> cls) {
        super(cls);
    }

    protected abstract ct1<?> G(bob bobVar);

    /* JADX WARN: Multi-variable type inference failed */
    public ct1<?> H(bob bobVar) {
        if (bobVar == null) {
            return this;
        }
        return G(bobVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ct1(y85 y85Var) {
        super(y85Var);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ct1(Class<?> cls, boolean z) {
        super(cls, z);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ct1(ct1<?> ct1Var) {
        super(ct1Var.a, false);
    }
}
