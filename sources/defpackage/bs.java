package defpackage;

import defpackage.rc5;
/* compiled from: AsArrayTypeSerializer.java */
/* renamed from: bs  reason: default package */
/* loaded from: classes2.dex */
public class bs extends cob {
    public bs(snb snbVar, ia0 ia0Var) {
        super(snbVar, ia0Var);
    }

    @Override // defpackage.bob
    public rc5.a c() {
        return rc5.a.WRAPPER_ARRAY;
    }

    @Override // defpackage.bob
    /* renamed from: m */
    public bs a(ia0 ia0Var) {
        if (this.b == ia0Var) {
            return this;
        }
        return new bs(this.a, ia0Var);
    }
}
