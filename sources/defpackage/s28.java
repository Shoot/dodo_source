package defpackage;

import kotlin.Metadata;
/* compiled from: PhoneHintFeatureChecker.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Ls28;", "Lr28;", "", "a", "Lih4;", "Lih4;", "googlePlayServicesService", "Lhq3;", "b", "Lhq3;", "featureService", "<init>", "(Lih4;Lhq3;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: s28  reason: default package */
/* loaded from: classes4.dex */
public final class s28 implements r28 {
    private final ih4 a;
    private final hq3 b;

    public s28(ih4 ih4Var, hq3 hq3Var) {
        z65.h(ih4Var, "googlePlayServicesService");
        z65.h(hq3Var, "featureService");
        this.a = ih4Var;
        this.b = hq3Var;
    }

    @Override // defpackage.r28
    public boolean a() {
        if (this.b.a(bq3.I) && this.a.a()) {
            return true;
        }
        return false;
    }
}
