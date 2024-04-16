package defpackage;

import ru.dodopizza.app.domain.blockstore.WorkflowIdBlockStoreDataSource;
/* compiled from: WorkflowIdBlockStoreDataSource_Factory.java */
/* renamed from: e8c  reason: default package */
/* loaded from: classes4.dex */
public final class e8c implements no3<WorkflowIdBlockStoreDataSource> {
    private final as8<ld0> a;

    public e8c(as8<ld0> as8Var) {
        this.a = as8Var;
    }

    public static e8c a(as8<ld0> as8Var) {
        return new e8c(as8Var);
    }

    public static WorkflowIdBlockStoreDataSource c(ld0 ld0Var) {
        return new WorkflowIdBlockStoreDataSource(ld0Var);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public WorkflowIdBlockStoreDataSource get() {
        return c(this.a.get());
    }
}
