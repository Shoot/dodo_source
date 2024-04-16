package defpackage;

import kotlin.Metadata;
/* compiled from: DrinksTwoColumnChecker.kt.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"La93;", "Lz83;", "", "isEnabled", "Lhq3;", "a", "Lhq3;", "featureService", "Lgy3;", "b", "Lgy3;", "firebaseToggleService", "<init>", "(Lhq3;Lgy3;)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: a93  reason: default package */
/* loaded from: classes2.dex */
public final class a93 implements z83 {
    private final hq3 a;
    private final gy3 b;

    public a93(hq3 hq3Var, gy3 gy3Var) {
        z65.h(hq3Var, "featureService");
        z65.h(gy3Var, "firebaseToggleService");
        this.a = hq3Var;
        this.b = gy3Var;
    }

    @Override // defpackage.z83
    public boolean isEnabled() {
        if (this.a.a(bq3.K5) && this.b.a(bq3.U6)) {
            return true;
        }
        return false;
    }
}
