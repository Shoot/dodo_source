package defpackage;

import defpackage.rc5;
/* compiled from: AsWrapperTypeSerializer.java */
/* renamed from: fs  reason: default package */
/* loaded from: classes2.dex */
public class fs extends cob {
    public fs(snb snbVar, ia0 ia0Var) {
        super(snbVar, ia0Var);
    }

    @Override // defpackage.bob
    public rc5.a c() {
        return rc5.a.WRAPPER_OBJECT;
    }

    @Override // defpackage.bob
    /* renamed from: m */
    public fs a(ia0 ia0Var) {
        if (this.b == ia0Var) {
            return this;
        }
        return new fs(this.a, ia0Var);
    }
}
