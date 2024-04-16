package com.dodopizza.analytics.kusto;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.aa7;
import defpackage.or1;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: KustoAnalyticsImpl.kt */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 ,2\u00020\u0001:\u0001\u0011B\u001f\u0012\u0006\u0010\u0015\u001a\u00020\u0012\u0012\u0006\u0010\u0019\u001a\u00020\u0016\u0012\u0006\u0010\u001c\u001a\u00020\u001a¢\u0006\u0004\b*\u0010+J\b\u0010\u0003\u001a\u00020\u0002H\u0002J&\u0010\u000b\u001a\u00020\n2\u001c\u0010\t\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\u0002`\b0\u0004H\u0002J\b\u0010\f\u001a\u00020\nH\u0002J\b\u0010\u000e\u001a\u00020\rH\u0002J\u001e\u0010\u000f\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\u0002`\b0\u0004H\u0002J \u0010\u0011\u001a\u00020\n2\u0016\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\u0002`\bH\u0016R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001bR\u001b\u0010 \u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u0017\u0010\u001fR*\u0010#\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\u0002`\b0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\"R\u0014\u0010&\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010%R\u0014\u0010)\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010(¨\u0006-"}, d2 = {"Lcom/dodopizza/analytics/kusto/KustoAnalyticsImpl;", "Loh5;", "Landroidx/work/b;", e.a, "", "", "", "", "Lcom/dodopizza/analytics/kusto/EventParams;", "events", "", Image.TYPE_HIGH, "g", "", DateTokenConverter.CONVERTER_KEY, "f", "eventParams", "a", "Ljava/io/File;", "b", "Ljava/io/File;", "cacheDirectory", "Lai5;", c.a, "Lai5;", "metaDataCollector", "Lrh5;", "Lrh5;", "settings", "Lzs3;", "Lrn5;", "()Lzs3;", "fileCachingService", "", "Ljava/util/List;", "bufferedEvents", "Lor1;", "Lor1;", "kustoWorkerConstraints", "Laa7$a;", "Laa7$a;", "oneTimeWorkRequestBuilder", "<init>", "(Ljava/io/File;Lai5;Lrh5;)V", "i", "analytics-kusto_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class KustoAnalyticsImpl implements oh5 {
    public static final a i = new a(null);
    private final File b;
    private final ai5 c;
    private final rh5 d;
    private final rn5 e;
    private final List<Map<String, Object>> f;
    private final or1 g;
    private final aa7.a h;

    /* compiled from: KustoAnalyticsImpl.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/dodopizza/analytics/kusto/KustoAnalyticsImpl$a;", "", "", "LIMIT_IN_MB", "J", "", "LOG_TAG", "Ljava/lang/String;", "<init>", "()V", "analytics-kusto_release"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: KustoAnalyticsImpl.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lat3;", "a", "()Lat3;"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    static final class b extends ej5 implements Function0<at3> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final at3 invoke() {
            return new at3(KustoAnalyticsImpl.this.b);
        }
    }

    public KustoAnalyticsImpl(File file, ai5 ai5Var, rh5 rh5Var) {
        rn5 b2;
        z65.h(file, "cacheDirectory");
        z65.h(ai5Var, "metaDataCollector");
        z65.h(rh5Var, "settings");
        this.b = file;
        this.c = ai5Var;
        this.d = rh5Var;
        b2 = yn5.b(new b());
        this.e = b2;
        List<Map<String, Object>> synchronizedList = Collections.synchronizedList(new ArrayList());
        z65.g(synchronizedList, "synchronizedList(mutableListOf())");
        this.f = synchronizedList;
        or1 a2 = new or1.a().b(ow6.CONNECTED).a();
        z65.g(a2, "Builder()\n      .setRequ…CONNECTED)\n      .build()");
        this.g = a2;
        aa7.a h = new aa7.a(KustoEventsSendingWorker.class).a("KustoEventsSendingWorker").g(rh5Var.a(), TimeUnit.MILLISECONDS).f(a2).h(e());
        z65.g(h, "Builder(KustoEventsSendi…InputData(packMetaData())");
        this.h = h;
    }

    private final zs3 c() {
        return (zs3) this.e.getValue();
    }

    private final long d() {
        return 40000000L;
    }

    private final androidx.work.b e() {
        return ni5.a.a(this.c.a());
    }

    private final List<Map<String, Object>> f() {
        Object l = new Gson().l(c().a(d()), new TypeToken<List<? extends Map<String, ? extends Object>>>() { // from class: com.dodopizza.analytics.kusto.KustoAnalyticsImpl$readFromFile$1
        }.getType());
        z65.g(l, "Gson().fromJson(\n       … Any>>>() {}.type\n      )");
        return (List) l;
    }

    private final void g() {
        h7c.h().c("KustoEventsSendingWorker");
        h7c.h().d(this.h.b());
    }

    private final void h(List<? extends Map<String, ? extends Object>> list) {
        zs3 c = c();
        String u = new com.google.gson.a().j().b().u(list, new TypeToken<List<? extends Map<String, ? extends Object>>>() { // from class: com.dodopizza.analytics.kusto.KustoAnalyticsImpl$writeToFile$writeSucceeded$1
        }.getType());
        z65.g(u, "GsonBuilder()\n          …>() {}.type\n            )");
        if (c.c(u)) {
            return;
        }
        throw new IllegalStateException("Failed to flush events to a file");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.oh5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(java.util.Map<java.lang.String, ? extends java.lang.Object> r3) {
        /*
            r2 = this;
            java.lang.String r0 = "eventParams"
            defpackage.z65.h(r3, r0)
            sk9$a r0 = defpackage.sk9.b     // Catch: java.lang.Throwable -> L10
            java.util.List r0 = r2.f()     // Catch: java.lang.Throwable -> L10
            java.lang.Object r0 = defpackage.sk9.b(r0)     // Catch: java.lang.Throwable -> L10
            goto L1b
        L10:
            r0 = move-exception
            sk9$a r1 = defpackage.sk9.b
            java.lang.Object r0 = defpackage.vk9.a(r0)
            java.lang.Object r0 = defpackage.sk9.b(r0)
        L1b:
            java.lang.Throwable r1 = defpackage.sk9.d(r0)
            if (r1 != 0) goto L22
            goto L2a
        L22:
            java.util.List r0 = defpackage.ic1.l()
            java.lang.Object r0 = defpackage.sk9.b(r0)
        L2a:
            boolean r1 = defpackage.sk9.i(r0)
            if (r1 == 0) goto L3c
            java.util.List r0 = (java.util.List) r0
            java.util.Collection r0 = (java.util.Collection) r0
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r1 = r2.f
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.List r0 = defpackage.ic1.q0(r0, r1)
        L3c:
            java.lang.Object r0 = defpackage.sk9.b(r0)
            boolean r1 = defpackage.sk9.i(r0)
            if (r1 == 0) goto L4e
            java.util.List r0 = (java.util.List) r0
            java.util.Collection r0 = (java.util.Collection) r0
            java.util.List r0 = defpackage.ic1.r0(r0, r3)
        L4e:
            java.lang.Object r0 = defpackage.sk9.b(r0)
            boolean r1 = defpackage.sk9.i(r0)
            if (r1 == 0) goto L6b
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Throwable -> L64
            r2.h(r0)     // Catch: java.lang.Throwable -> L64
            kotlin.Unit r0 = kotlin.Unit.a     // Catch: java.lang.Throwable -> L64
            java.lang.Object r0 = defpackage.sk9.b(r0)     // Catch: java.lang.Throwable -> L64
            goto L6f
        L64:
            r0 = move-exception
            sk9$a r1 = defpackage.sk9.b
            java.lang.Object r0 = defpackage.vk9.a(r0)
        L6b:
            java.lang.Object r0 = defpackage.sk9.b(r0)
        L6f:
            boolean r1 = defpackage.sk9.i(r0)
            if (r1 == 0) goto L80
            r1 = r0
            kotlin.Unit r1 = (kotlin.Unit) r1
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r1 = r2.f
            r1.clear()
            r2.g()
        L80:
            java.lang.Throwable r0 = defpackage.sk9.d(r0)
            if (r0 == 0) goto L92
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r1 = r2.f
            r1.add(r3)
            java.lang.String r3 = "KustoAnalyticsImpl"
            java.lang.String r1 = "Failed to send an event"
            android.util.Log.e(r3, r1, r0)
        L92:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dodopizza.analytics.kusto.KustoAnalyticsImpl.a(java.util.Map):void");
    }
}
