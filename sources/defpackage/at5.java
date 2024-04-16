package defpackage;

import defpackage.sl5;
/* compiled from: LocaleListServiceModule_ProvideCacheKeysFactoryFactory.java */
/* renamed from: at5  reason: default package */
/* loaded from: classes3.dex */
public final class at5 implements no3<sl5.a> {
    private final as8<ny1> a;

    public at5(as8<ny1> as8Var) {
        this.a = as8Var;
    }

    public static at5 a(as8<ny1> as8Var) {
        return new at5(as8Var);
    }

    public static sl5.a c(ny1 ny1Var) {
        return (sl5.a) jh8.e(zs5.a.a(ny1Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public sl5.a get() {
        return c(this.a.get());
    }
}
