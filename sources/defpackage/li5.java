package defpackage;

import ch.qos.logback.core.joran.action.Action;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: KustoTrace.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0002\u0006\nB\u0017\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u0010"}, d2 = {"Lli5;", "Lqjb;", "", "start", "stop", "", "a", "Ljava/lang/String;", Action.NAME_ATTRIBUTE, "Loh5;", "b", "Loh5;", "kustoAnalytics", "<init>", "(Ljava/lang/String;Loh5;)V", c.a, "infrastructure-base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: li5  reason: default package */
/* loaded from: classes4.dex */
public final class li5 implements qjb {
    public static final a c = new a(null);
    private final String a;
    private final oh5 b;

    /* compiled from: KustoTrace.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lli5$a;", "", "", "EVENT_NAME_PERFORMANCE", "Ljava/lang/String;", "<init>", "()V", "infrastructure-base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: li5$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: KustoTrace.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lli5$b;", "Ldc;", "Lqc;", "a", "", "Ljava/lang/String;", "delayName", "", "b", "J", "delayValueInMillis", "<init>", "(Ljava/lang/String;J)V", "infrastructure-base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: li5$b */
    /* loaded from: classes4.dex */
    public static final class b implements dc {
        private final String a;
        private final long b;

        public b(String str, long j) {
            z65.h(str, "delayName");
            this.a = str;
            this.b = j;
        }

        @Override // defpackage.dc
        public qc a() {
            return bc.e(new bc("performance"), this.a, Long.valueOf(this.b), false, 4, null).a();
        }
    }

    public li5(String str, oh5 oh5Var) {
        z65.h(str, Action.NAME_ATTRIBUTE);
        z65.h(oh5Var, "kustoAnalytics");
        this.a = str;
        this.b = oh5Var;
    }

    @Override // defpackage.qjb
    public void start() {
        if (xjb.a.a().contains(this.a)) {
            String str = this.a;
            qgb.a("kusto " + str, false);
        }
    }

    @Override // defpackage.qjb
    public void stop() {
        if (xjb.a.a().contains(this.a)) {
            String str = this.a;
            this.b.a(new b(this.a, qgb.b("kusto " + str)).a().d());
        }
    }
}
