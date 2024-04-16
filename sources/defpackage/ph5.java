package defpackage;

import java.util.List;
import kotlin.Metadata;
/* compiled from: KustoAnalyticsConsumer.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\f\u001a\u00020\n\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u0014\u0010\f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000bR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000e¨\u0006\u0012"}, d2 = {"Lph5;", "Llc;", "", "event", "", "b", "Lqc;", "analyticsEvent", "", "a", "Loh5;", "Loh5;", "kustoAnalyticsClient", "", "Ljava/util/List;", "events", "<init>", "(Loh5;Ljava/util/List;)V", "analytics-consumer-kusto_release"}, k = 1, mv = {1, 7, 1})
/* renamed from: ph5  reason: default package */
/* loaded from: classes.dex */
public final class ph5 implements lc {
    private final oh5 a;
    private final List<String> b;

    public ph5(oh5 oh5Var, List<String> list) {
        z65.h(oh5Var, "kustoAnalyticsClient");
        z65.h(list, "events");
        this.a = oh5Var;
        this.b = list;
    }

    @Override // defpackage.lc
    public void a(qc qcVar) {
        z65.h(qcVar, "analyticsEvent");
        this.a.a(qcVar.d());
    }

    @Override // defpackage.lc
    public boolean b(String str) {
        z65.h(str, "event");
        return this.b.contains(str);
    }
}
