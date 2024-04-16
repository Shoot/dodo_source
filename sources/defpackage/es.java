package defpackage;

import defpackage.rc5;
/* compiled from: AsPropertyTypeSerializer.java */
/* renamed from: es  reason: default package */
/* loaded from: classes2.dex */
public class es extends bs {
    protected final String c;

    public es(snb snbVar, ia0 ia0Var, String str) {
        super(snbVar, ia0Var);
        this.c = str;
    }

    @Override // defpackage.cob, defpackage.bob
    public String b() {
        return this.c;
    }

    @Override // defpackage.bs, defpackage.bob
    public rc5.a c() {
        return rc5.a.PROPERTY;
    }

    @Override // defpackage.bs
    /* renamed from: n */
    public es m(ia0 ia0Var) {
        if (this.b == ia0Var) {
            return this;
        }
        return new es(this.a, ia0Var, this.c);
    }
}
