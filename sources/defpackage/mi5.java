package defpackage;

import kotlin.Metadata;
/* compiled from: KustoTraceFactory.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007¨\u0006\u000b"}, d2 = {"Lmi5;", "Lvjb;", "", "traceName", "Lqjb;", "a", "Loh5;", "Loh5;", "kustoAnalytics", "<init>", "(Loh5;)V", "infrastructure-base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: mi5  reason: default package */
/* loaded from: classes4.dex */
public final class mi5 implements vjb {
    private final oh5 a;

    public mi5(oh5 oh5Var) {
        z65.h(oh5Var, "kustoAnalytics");
        this.a = oh5Var;
    }

    @Override // defpackage.vjb
    public qjb a(String str) {
        z65.h(str, "traceName");
        return new li5(str, this.a);
    }
}
