package defpackage;

import defpackage.tt9;
import kotlin.Metadata;
/* compiled from: SberPayFeatureStateResolverImpl.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lvt9;", "Lut9;", "Ltt9;", "a", "Lhq3;", "Lhq3;", "featureService", "Lcu9;", "b", "Lcu9;", "sberPaySupportChecker", "<init>", "(Lhq3;Lcu9;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: vt9  reason: default package */
/* loaded from: classes3.dex */
public final class vt9 implements ut9 {
    private final hq3 a;
    private final cu9 b;

    public vt9(hq3 hq3Var, cu9 cu9Var) {
        z65.h(hq3Var, "featureService");
        z65.h(cu9Var, "sberPaySupportChecker");
        this.a = hq3Var;
        this.b = cu9Var;
    }

    @Override // defpackage.ut9
    public tt9 a() {
        if (!this.b.b()) {
            return tt9.c.a;
        }
        if (this.a.a(bq3.l5)) {
            return tt9.b.a;
        }
        return tt9.a.a;
    }
}
