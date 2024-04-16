package defpackage;

import kotlin.Metadata;
/* compiled from: MenuV5AvailabilityChecker.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Llh6;", "", "", "a", "Lhq3;", "Lhq3;", "featureService", "Lyg6;", "b", "Lyg6;", "menuSectionRepositoryV5", "<init>", "(Lhq3;Lyg6;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: lh6  reason: default package */
/* loaded from: classes4.dex */
public final class lh6 {
    private final hq3 a;
    private final yg6 b;

    public lh6(hq3 hq3Var, yg6 yg6Var) {
        z65.h(hq3Var, "featureService");
        z65.h(yg6Var, "menuSectionRepositoryV5");
        this.a = hq3Var;
        this.b = yg6Var;
    }

    public final boolean a() {
        if (this.a.a(bq3.w6) && (!this.b.a().isEmpty())) {
            return true;
        }
        return false;
    }
}
