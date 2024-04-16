package defpackage;

import defpackage.tmb;
import kotlin.Metadata;
/* compiled from: TaxPayerIdValidatorFactory.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lc8b;", "", "Lay1;", tmb.c.COUNTRY_JSON_NAME, "Lb8b;", "a", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: c8b  reason: default package */
/* loaded from: classes4.dex */
public final class c8b {
    public static final c8b a = new c8b();

    private c8b() {
    }

    public final b8b a(ay1 ay1Var) {
        z65.h(ay1Var, tmb.c.COUNTRY_JSON_NAME);
        if (z65.c(ay1Var.getCode(), "616")) {
            return new eb8();
        }
        return new d8b();
    }
}
