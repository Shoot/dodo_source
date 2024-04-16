package defpackage;

import java.io.Serializable;
/* compiled from: DeserializerFactoryConfig.java */
/* renamed from: b13  reason: default package */
/* loaded from: classes2.dex */
public class b13 implements Serializable {
    protected static final c13[] f = new c13[0];
    protected static final ha0[] g = new ha0[0];
    protected static final l2[] h = new l2[0];
    protected static final iwb[] i = new iwb[0];
    protected static final ze5[] j = {new ywa()};
    protected final c13[] a;
    protected final ze5[] b;
    protected final ha0[] c;
    protected final l2[] d;
    protected final iwb[] e;

    public b13() {
        this(null, null, null, null, null);
    }

    protected b13(c13[] c13VarArr, ze5[] ze5VarArr, ha0[] ha0VarArr, l2[] l2VarArr, iwb[] iwbVarArr) {
        this.a = c13VarArr == null ? f : c13VarArr;
        this.b = ze5VarArr == null ? j : ze5VarArr;
        this.c = ha0VarArr == null ? g : ha0VarArr;
        this.d = l2VarArr == null ? h : l2VarArr;
        this.e = iwbVarArr == null ? i : iwbVarArr;
    }
}
