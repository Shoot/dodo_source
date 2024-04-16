package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: DefaultAnalytics.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00162\u00020\u0001:\u0002\n\u000fB/\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0012¨\u0006\u0017"}, d2 = {"Lgp2;", "Lgc;", "Lqc;", "event", "Llc;", "analyticsConsumer", "", c.a, "Ldc;", "producer", "a", "", "Ljava/util/Collection;", "consumerRegistry", "Lrc;", "b", "analyticsEventInterceptors", "Ljava/util/concurrent/ExecutorService;", "Ljava/util/concurrent/ExecutorService;", "executorService", "<init>", "(Ljava/util/Collection;Ljava/util/Collection;Ljava/util/concurrent/ExecutorService;)V", DateTokenConverter.CONVERTER_KEY, "analytics-core"}, k = 1, mv = {1, 7, 1})
/* renamed from: gp2  reason: default package */
/* loaded from: classes.dex */
public final class gp2 implements gc {
    public static final b d = new b(null);
    private final Collection<lc> a;
    private final Collection<rc> b;
    private final ExecutorService c;

    /* compiled from: DefaultAnalytics.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005J\u0006\u0010\t\u001a\u00020\bR\u0016\u0010\f\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u000bR\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u000eR\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u000e¨\u0006\u0013"}, d2 = {"Lgp2$a;", "", "Llc;", "consumer", "a", "Lrc;", "eventInterceptor", "b", "Lgc;", c.a, "Ljava/util/concurrent/ExecutorService;", "Ljava/util/concurrent/ExecutorService;", "executorService", "", "Ljava/util/Set;", "eventInterceptors", "consumerRegistry", "<init>", "()V", "analytics-core"}, k = 1, mv = {1, 7, 1})
    /* renamed from: gp2$a */
    /* loaded from: classes.dex */
    public static final class a {
        private ExecutorService a;
        private Set<? extends rc> b;
        private Set<? extends lc> c;

        public a() {
            Set<? extends rc> e;
            Set<? extends lc> e2;
            ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
            z65.g(newSingleThreadExecutor, "newSingleThreadExecutor()");
            this.a = newSingleThreadExecutor;
            e = sfa.e();
            this.b = e;
            e2 = sfa.e();
            this.c = e2;
        }

        public final a a(lc lcVar) {
            Set<? extends lc> j;
            z65.h(lcVar, "consumer");
            j = tfa.j(this.c, lcVar);
            this.c = j;
            return this;
        }

        public final a b(rc rcVar) {
            Set<? extends rc> j;
            z65.h(rcVar, "eventInterceptor");
            j = tfa.j(this.b, rcVar);
            this.b = j;
            return this;
        }

        public final gc c() {
            return new gp2(this.c, this.b, this.a);
        }
    }

    /* compiled from: DefaultAnalytics.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lgp2$b;", "", "<init>", "()V", "analytics-core"}, k = 1, mv = {1, 7, 1})
    /* renamed from: gp2$b */
    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public gp2(Collection<? extends lc> collection, Collection<? extends rc> collection2, ExecutorService executorService) {
        z65.h(collection, "consumerRegistry");
        z65.h(collection2, "analyticsEventInterceptors");
        z65.h(executorService, "executorService");
        this.a = collection;
        this.b = collection2;
        this.c = executorService;
    }

    private final void c(qc qcVar, lc lcVar) {
        for (rc rcVar : this.b) {
            qcVar = rcVar.a(lcVar, qcVar);
        }
        lcVar.a(qcVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(gp2 gp2Var, qc qcVar) {
        z65.h(gp2Var, "this$0");
        z65.h(qcVar, "$this_with");
        ArrayList<lc> arrayList = new ArrayList();
        for (Object obj : gp2Var.a) {
            if (((lc) obj).b(qcVar.c())) {
                arrayList.add(obj);
            }
        }
        for (lc lcVar : arrayList) {
            gp2Var.c(qcVar, lcVar);
        }
    }

    @Override // defpackage.gc
    public void a(dc dcVar) {
        z65.h(dcVar, "producer");
        final qc a2 = dcVar.a();
        this.c.execute(new Runnable() { // from class: fp2
            @Override // java.lang.Runnable
            public final void run() {
                gp2.d(gp2.this, a2);
            }
        });
    }
}
