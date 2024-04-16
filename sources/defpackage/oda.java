package defpackage;

import com.dodopizza.persistence.entity.ServerDeltaTimeEntity;
/* compiled from: ServerTimeModule_ProvideServerDeltaTimeDaoFactory.java */
/* renamed from: oda  reason: default package */
/* loaded from: classes3.dex */
public final class oda implements no3<gk2<ServerDeltaTimeEntity>> {
    private final as8<jk2> a;

    public oda(as8<jk2> as8Var) {
        this.a = as8Var;
    }

    public static oda a(as8<jk2> as8Var) {
        return new oda(as8Var);
    }

    public static gk2<ServerDeltaTimeEntity> c(jk2 jk2Var) {
        return (gk2) jh8.e(mda.a.b(jk2Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public gk2<ServerDeltaTimeEntity> get() {
        return c(this.a.get());
    }
}
