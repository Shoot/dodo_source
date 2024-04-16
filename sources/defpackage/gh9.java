package defpackage;

import ru.dodopizza.backend.domain.upload.UploadAPI;
/* compiled from: RepositoryModule_ProvideFileUploaderFactory.java */
/* renamed from: gh9  reason: default package */
/* loaded from: classes3.dex */
public final class gh9 implements no3<ku3> {
    private final tg9 a;
    private final as8<UploadAPI> b;

    public gh9(tg9 tg9Var, as8<UploadAPI> as8Var) {
        this.a = tg9Var;
        this.b = as8Var;
    }

    public static gh9 a(tg9 tg9Var, as8<UploadAPI> as8Var) {
        return new gh9(tg9Var, as8Var);
    }

    public static ku3 c(tg9 tg9Var, UploadAPI uploadAPI) {
        return (ku3) jh8.e(tg9Var.m(uploadAPI));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public ku3 get() {
        return c(this.a, this.b.get());
    }
}
