package defpackage;

import ru.dodopizza.app.domain.blockstore.BaseUrlBlockStoreDataSource;
/* compiled from: BaseUrlBlockStoreDataSource_Factory.java */
/* renamed from: m80  reason: default package */
/* loaded from: classes4.dex */
public final class m80 implements no3<BaseUrlBlockStoreDataSource> {
    private final as8<ld0> a;

    public m80(as8<ld0> as8Var) {
        this.a = as8Var;
    }

    public static m80 a(as8<ld0> as8Var) {
        return new m80(as8Var);
    }

    public static BaseUrlBlockStoreDataSource c(ld0 ld0Var) {
        return new BaseUrlBlockStoreDataSource(ld0Var);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public BaseUrlBlockStoreDataSource get() {
        return c(this.a.get());
    }
}
