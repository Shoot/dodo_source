package defpackage;

import com.dodopizza.persistence.entity.ServerDeltaTimeEntity;
/* compiled from: ServerTimeModule_ProvideServerDeltaTimeRepositoryFactory.java */
/* renamed from: pda  reason: default package */
/* loaded from: classes3.dex */
public final class pda implements no3<ida> {
    private final as8<gk2<ServerDeltaTimeEntity>> a;

    public pda(as8<gk2<ServerDeltaTimeEntity>> as8Var) {
        this.a = as8Var;
    }

    public static pda a(as8<gk2<ServerDeltaTimeEntity>> as8Var) {
        return new pda(as8Var);
    }

    public static ida c(gk2<ServerDeltaTimeEntity> gk2Var) {
        return (ida) jh8.e(mda.a.c(gk2Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public ida get() {
        return c(this.a.get());
    }
}
