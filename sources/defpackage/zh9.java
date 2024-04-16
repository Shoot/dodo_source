package defpackage;

import ru.dodopizza.app.domain.blockstore.WorkflowIdBlockStoreDataSource;
/* compiled from: RepositoryModule_ProvideStateRepositoryFactory.java */
/* renamed from: zh9  reason: default package */
/* loaded from: classes3.dex */
public final class zh9 implements no3<cva> {
    private final tg9 a;
    private final as8<f89> b;
    private final as8<dv5> c;
    private final as8<ry1> d;
    private final as8<WorkflowIdBlockStoreDataSource> e;

    public zh9(tg9 tg9Var, as8<f89> as8Var, as8<dv5> as8Var2, as8<ry1> as8Var3, as8<WorkflowIdBlockStoreDataSource> as8Var4) {
        this.a = tg9Var;
        this.b = as8Var;
        this.c = as8Var2;
        this.d = as8Var3;
        this.e = as8Var4;
    }

    public static zh9 a(tg9 tg9Var, as8<f89> as8Var, as8<dv5> as8Var2, as8<ry1> as8Var3, as8<WorkflowIdBlockStoreDataSource> as8Var4) {
        return new zh9(tg9Var, as8Var, as8Var2, as8Var3, as8Var4);
    }

    public static cva c(tg9 tg9Var, f89 f89Var, dv5 dv5Var, ry1 ry1Var, WorkflowIdBlockStoreDataSource workflowIdBlockStoreDataSource) {
        return (cva) jh8.e(tg9Var.F(f89Var, dv5Var, ry1Var, workflowIdBlockStoreDataSource));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public cva get() {
        return c(this.a, this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
