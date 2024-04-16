package com.google.firebase.perf.session.gauges;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.perf.session.PerfSession;
import com.google.firebase.perf.session.gauges.GaugeManager;
import com.google.firebase.perf.session.gauges.a;
import com.google.firebase.perf.session.gauges.c;
import com.google.firebase.perf.util.Timer;
import defpackage.dd4;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
@Keep
/* loaded from: classes2.dex */
public class GaugeManager {
    private static final long APPROX_NUMBER_OF_DATA_POINTS_PER_GAUGE_METRIC = 20;
    private static final long INVALID_GAUGE_COLLECTION_FREQUENCY = -1;
    private static final long TIME_TO_WAIT_BEFORE_FLUSHING_GAUGES_QUEUE_MS = 20;
    private tp applicationProcessState;
    private final com.google.firebase.perf.config.a configResolver;
    private final qn5<com.google.firebase.perf.session.gauges.a> cpuGaugeCollector;
    private ScheduledFuture gaugeManagerDataCollectionJob;
    private final qn5<ScheduledExecutorService> gaugeManagerExecutor;
    private b gaugeMetadataManager;
    private final qn5<c> memoryGaugeCollector;
    private String sessionId;
    private final jmb transportManager;
    private static final sh logger = sh.e();
    private static final GaugeManager instance = new GaugeManager();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[tp.values().length];
            a = iArr;
            try {
                iArr[tp.BACKGROUND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[tp.FOREGROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @SuppressLint({"ThreadPoolCreation"})
    private GaugeManager() {
        this(new qn5(new bs8() { // from class: zc4
            @Override // defpackage.bs8
            public final Object get() {
                return Executors.newSingleThreadScheduledExecutor();
            }
        }), jmb.k(), com.google.firebase.perf.config.a.g(), null, new qn5(new bs8() { // from class: ad4
            @Override // defpackage.bs8
            public final Object get() {
                a lambda$new$0;
                lambda$new$0 = GaugeManager.lambda$new$0();
                return lambda$new$0;
            }
        }), new qn5(new bs8() { // from class: bd4
            @Override // defpackage.bs8
            public final Object get() {
                c lambda$new$1;
                lambda$new$1 = GaugeManager.lambda$new$1();
                return lambda$new$1;
            }
        }));
    }

    private long getCpuGaugeCollectionFrequencyMs(tp tpVar) {
        long y;
        int i = a.a[tpVar.ordinal()];
        if (i != 1) {
            if (i != 2) {
                y = -1;
            } else {
                y = this.configResolver.z();
            }
        } else {
            y = this.configResolver.y();
        }
        if (com.google.firebase.perf.session.gauges.a.f(y)) {
            return -1L;
        }
        return y;
    }

    private cd4 getGaugeMetadata() {
        return cd4.f0().I(this.gaugeMetadataManager.a()).J(this.gaugeMetadataManager.b()).K(this.gaugeMetadataManager.c()).a();
    }

    public static synchronized GaugeManager getInstance() {
        GaugeManager gaugeManager;
        synchronized (GaugeManager.class) {
            gaugeManager = instance;
        }
        return gaugeManager;
    }

    private long getMemoryGaugeCollectionFrequencyMs(tp tpVar) {
        long B;
        int i = a.a[tpVar.ordinal()];
        if (i != 1) {
            if (i != 2) {
                B = -1;
            } else {
                B = this.configResolver.C();
            }
        } else {
            B = this.configResolver.B();
        }
        if (c.e(B)) {
            return -1L;
        }
        return B;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ com.google.firebase.perf.session.gauges.a lambda$new$0() {
        return new com.google.firebase.perf.session.gauges.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ c lambda$new$1() {
        return new c();
    }

    private boolean startCollectingCpuMetrics(long j, Timer timer) {
        if (j == -1) {
            logger.a("Invalid Cpu Metrics collection frequency. Did not collect Cpu Metrics.");
            return false;
        }
        this.cpuGaugeCollector.get().k(j, timer);
        return true;
    }

    private boolean startCollectingMemoryMetrics(long j, Timer timer) {
        if (j == -1) {
            logger.a("Invalid Memory Metrics collection frequency. Did not collect Memory Metrics.");
            return false;
        }
        this.memoryGaugeCollector.get().j(j, timer);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: syncFlush */
    public void lambda$stopCollectingGauges$3(String str, tp tpVar) {
        dd4.b p0 = dd4.p0();
        while (!this.cpuGaugeCollector.get().a.isEmpty()) {
            p0.J(this.cpuGaugeCollector.get().a.poll());
        }
        while (!this.memoryGaugeCollector.get().b.isEmpty()) {
            p0.I(this.memoryGaugeCollector.get().b.poll());
        }
        p0.L(str);
        this.transportManager.A(p0.a(), tpVar);
    }

    public void collectGaugeMetricOnce(Timer timer) {
        collectGaugeMetricOnce(this.cpuGaugeCollector.get(), this.memoryGaugeCollector.get(), timer);
    }

    public void initializeGaugeMetadataManager(Context context) {
        this.gaugeMetadataManager = new b(context);
    }

    public boolean logGaugeMetadata(String str, tp tpVar) {
        if (this.gaugeMetadataManager != null) {
            this.transportManager.A(dd4.p0().L(str).K(getGaugeMetadata()).a(), tpVar);
            return true;
        }
        return false;
    }

    public void startCollectingGauges(PerfSession perfSession, final tp tpVar) {
        if (this.sessionId != null) {
            stopCollectingGauges();
        }
        long startCollectingGauges = startCollectingGauges(tpVar, perfSession.d());
        if (startCollectingGauges == -1) {
            logger.j("Invalid gauge collection frequency. Unable to start collecting Gauges.");
            return;
        }
        final String h = perfSession.h();
        this.sessionId = h;
        this.applicationProcessState = tpVar;
        try {
            long j = startCollectingGauges * 20;
            this.gaugeManagerDataCollectionJob = this.gaugeManagerExecutor.get().scheduleAtFixedRate(new Runnable() { // from class: yc4
                @Override // java.lang.Runnable
                public final void run() {
                    GaugeManager.this.lambda$startCollectingGauges$2(h, tpVar);
                }
            }, j, j, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e) {
            sh shVar = logger;
            shVar.j("Unable to start collecting Gauges: " + e.getMessage());
        }
    }

    public void stopCollectingGauges() {
        final String str = this.sessionId;
        if (str == null) {
            return;
        }
        final tp tpVar = this.applicationProcessState;
        this.cpuGaugeCollector.get().l();
        this.memoryGaugeCollector.get().k();
        ScheduledFuture scheduledFuture = this.gaugeManagerDataCollectionJob;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.gaugeManagerExecutor.get().schedule(new Runnable() { // from class: xc4
            @Override // java.lang.Runnable
            public final void run() {
                GaugeManager.this.lambda$stopCollectingGauges$3(str, tpVar);
            }
        }, 20L, TimeUnit.MILLISECONDS);
        this.sessionId = null;
        this.applicationProcessState = tp.APPLICATION_PROCESS_STATE_UNKNOWN;
    }

    private static void collectGaugeMetricOnce(com.google.firebase.perf.session.gauges.a aVar, c cVar, Timer timer) {
        aVar.c(timer);
        cVar.c(timer);
    }

    GaugeManager(qn5<ScheduledExecutorService> qn5Var, jmb jmbVar, com.google.firebase.perf.config.a aVar, b bVar, qn5<com.google.firebase.perf.session.gauges.a> qn5Var2, qn5<c> qn5Var3) {
        this.gaugeManagerDataCollectionJob = null;
        this.sessionId = null;
        this.applicationProcessState = tp.APPLICATION_PROCESS_STATE_UNKNOWN;
        this.gaugeManagerExecutor = qn5Var;
        this.transportManager = jmbVar;
        this.configResolver = aVar;
        this.gaugeMetadataManager = bVar;
        this.cpuGaugeCollector = qn5Var2;
        this.memoryGaugeCollector = qn5Var3;
    }

    private long startCollectingGauges(tp tpVar, Timer timer) {
        long cpuGaugeCollectionFrequencyMs = getCpuGaugeCollectionFrequencyMs(tpVar);
        if (!startCollectingCpuMetrics(cpuGaugeCollectionFrequencyMs, timer)) {
            cpuGaugeCollectionFrequencyMs = -1;
        }
        long memoryGaugeCollectionFrequencyMs = getMemoryGaugeCollectionFrequencyMs(tpVar);
        return startCollectingMemoryMetrics(memoryGaugeCollectionFrequencyMs, timer) ? cpuGaugeCollectionFrequencyMs == -1 ? memoryGaugeCollectionFrequencyMs : Math.min(cpuGaugeCollectionFrequencyMs, memoryGaugeCollectionFrequencyMs) : cpuGaugeCollectionFrequencyMs;
    }
}
