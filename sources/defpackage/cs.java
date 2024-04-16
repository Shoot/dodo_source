package defpackage;

import defpackage.rc5;
/* compiled from: AsExistingPropertyTypeSerializer.java */
/* renamed from: cs  reason: default package */
/* loaded from: classes2.dex */
public class cs extends es {
    public cs(snb snbVar, ia0 ia0Var, String str) {
        super(snbVar, ia0Var, str);
    }

    @Override // defpackage.es, defpackage.bs, defpackage.bob
    public rc5.a c() {
        return rc5.a.EXISTING_PROPERTY;
    }

    @Override // defpackage.es
    /* renamed from: o */
    public cs n(ia0 ia0Var) {
        if (this.b == ia0Var) {
            return this;
        }
        return new cs(this.a, ia0Var, this.c);
    }
}
