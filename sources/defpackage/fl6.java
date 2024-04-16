package defpackage;

import defpackage.yk6;
/* compiled from: MindboxServiceFactory_Factory.java */
/* renamed from: fl6  reason: default package */
/* loaded from: classes4.dex */
public final class fl6 implements no3<dl6> {
    private final as8<qj6> a;
    private final as8<yk6.a> b;

    public fl6(as8<qj6> as8Var, as8<yk6.a> as8Var2) {
        this.a = as8Var;
        this.b = as8Var2;
    }

    public static fl6 a(as8<qj6> as8Var, as8<yk6.a> as8Var2) {
        return new fl6(as8Var, as8Var2);
    }

    public static dl6 c(qj6 qj6Var, yk6.a aVar) {
        return new dl6(qj6Var, aVar);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public dl6 get() {
        return c(this.a.get(), this.b.get());
    }
}
