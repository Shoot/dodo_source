package defpackage;

import defpackage.rc5;
/* compiled from: AsExternalTypeSerializer.java */
/* renamed from: ds  reason: default package */
/* loaded from: classes2.dex */
public class ds extends cob {
    protected final String c;

    public ds(snb snbVar, ia0 ia0Var, String str) {
        super(snbVar, ia0Var);
        this.c = str;
    }

    @Override // defpackage.cob, defpackage.bob
    public String b() {
        return this.c;
    }

    @Override // defpackage.bob
    public rc5.a c() {
        return rc5.a.EXTERNAL_PROPERTY;
    }

    @Override // defpackage.bob
    /* renamed from: m */
    public ds a(ia0 ia0Var) {
        if (this.b == ia0Var) {
            return this;
        }
        return new ds(this.a, ia0Var, this.c);
    }
}
