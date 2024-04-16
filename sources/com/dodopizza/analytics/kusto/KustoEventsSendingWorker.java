package com.dodopizza.analytics.kusto;

import android.content.Context;
import android.util.Log;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.huawei.hms.push.e;
import defpackage.b77;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
/* compiled from: KustoEventsSendingWorker.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00102\u00020\u0001:\u0001\u000eB\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\u001a\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00070\u0006H\u0002J\b\u0010\f\u001a\u00020\u000bH\u0016R\u001b\u0010\u0012\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0016\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u000e\u0010\u0015¨\u0006\u001d"}, d2 = {"Lcom/dodopizza/analytics/kusto/KustoEventsSendingWorker;", "Landroidx/work/Worker;", "", e.a, "", DateTokenConverter.CONVERTER_KEY, "", "", "", "", "g", "Landroidx/work/ListenableWorker$a;", "doWork", "Lcom/dodopizza/analytics/kusto/KustoApi;", "a", "Lrn5;", com.huawei.hms.opendevice.c.a, "()Lcom/dodopizza/analytics/kusto/KustoApi;", "kustoApi", "Lzs3;", "b", "()Lzs3;", "fileCachingService", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroidx/work/WorkerParameters;", "workerParameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "analytics-kusto_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class KustoEventsSendingWorker extends Worker {
    public static final a c = new a(null);
    private final rn5 a;
    private final rn5 b;

    /* compiled from: KustoEventsSendingWorker.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/dodopizza/analytics/kusto/KustoEventsSendingWorker$a;", "", "", "MAXIMUM_TRIES_COUNT", "I", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "analytics-kusto_release"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: KustoEventsSendingWorker.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lat3;", "a", "()Lat3;"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    static final class b extends ej5 implements Function0<at3> {
        final /* synthetic */ Context a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Context context) {
            super(0);
            this.a = context;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final at3 invoke() {
            return new at3(qh5.a(this.a));
        }
    }

    /* compiled from: KustoEventsSendingWorker.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/dodopizza/analytics/kusto/KustoApi;", "kotlin.jvm.PlatformType", "a", "()Lcom/dodopizza/analytics/kusto/KustoApi;"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    static final class c extends ej5 implements Function0<KustoApi> {
        final /* synthetic */ Context a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Context context) {
            super(0);
            this.a = context;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final KustoApi invoke() {
            Context context = this.a;
            if (context instanceof uh5) {
                return (KustoApi) ((uh5) context).t0().a().create(KustoApi.class);
            }
            return (KustoApi) new Retrofit.Builder().client(new b77.a().c()).addConverterFactory(GsonConverterFactory.create()).baseUrl("https://eventstream.dodopizza.com/").build().create(KustoApi.class);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KustoEventsSendingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        rn5 b2;
        rn5 b3;
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        z65.h(workerParameters, "workerParameters");
        b2 = yn5.b(new c(context));
        this.a = b2;
        b3 = yn5.b(new b(context));
        this.b = b3;
    }

    private final zs3 a() {
        return (zs3) this.b.getValue();
    }

    private final KustoApi c() {
        Object value = this.a.getValue();
        z65.g(value, "<get-kustoApi>(...)");
        return (KustoApi) value;
    }

    private final long d() {
        return 40000000L;
    }

    private final boolean e() {
        if (getRunAttemptCount() < 2) {
            return true;
        }
        return false;
    }

    private final List<Map<String, Object>> g() {
        List<Map<String, Object>> l;
        List<Map<String, Object>> l2;
        List<Map<String, Object>> list;
        List<Map<String, Object>> l3;
        try {
            String a2 = a().a(d());
            if (a2 != null) {
                list = (List) new Gson().l(a2, new TypeToken<List<? extends Map<String, ? extends Object>>>() { // from class: com.dodopizza.analytics.kusto.KustoEventsSendingWorker$obtainCachedEvents$1$1
                }.getType());
            } else {
                list = null;
            }
            if (list == null) {
                l3 = kc1.l();
                return l3;
            }
            return list;
        } catch (Throwable th) {
            if (th instanceof JsonSyntaxException) {
                a().b();
                l2 = kc1.l();
                return l2;
            } else if ((th instanceof IllegalStateException) || (th instanceof NullPointerException)) {
                Log.d("Kusto worker: ", "invalid json syntax " + th.getMessage(), th);
                l = kc1.l();
                return l;
            } else {
                throw th;
            }
        }
    }

    @Override // androidx.work.Worker
    public ListenableWorker.a doWork() {
        Map<String, Object> p;
        try {
            Log.d("Worker", "doWork: runAttemptCount " + getRunAttemptCount());
            List<Map<String, Object>> g = g();
            if (!g.isEmpty()) {
                KustoApi c2 = c();
                ni5 ni5Var = ni5.a;
                androidx.work.b inputData = getInputData();
                z65.g(inputData, "inputData");
                p = g86.p(ni5Var.d(inputData), lnb.a("events", g));
                c2.sendEventSource(p).execute();
            }
            a().b();
            ListenableWorker.a c3 = ListenableWorker.a.c();
            z65.g(c3, "success()");
            return c3;
        } catch (Exception e) {
            Log.e("KustoAnalytics", "Failed to send events to Kusto", e);
            if (e()) {
                Log.d("Worker", "retry: runAttemptCount " + getRunAttemptCount());
                ListenableWorker.a b2 = ListenableWorker.a.b();
                z65.g(b2, "{\n        Log.d(\"Worker\"…)\n        retry()\n      }");
                return b2;
            }
            Log.d("Worker", "failure: runAttemptCount " + getRunAttemptCount());
            a().b();
            ListenableWorker.a a2 = ListenableWorker.a.a();
            z65.g(a2, "{\n        Log.d(\"Worker\"…        failure()\n      }");
            return a2;
        }
    }
}
