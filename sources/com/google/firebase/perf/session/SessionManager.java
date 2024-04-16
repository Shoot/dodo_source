package com.google.firebase.perf.session;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.session.gauges.GaugeManager;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
@Keep
/* loaded from: classes2.dex */
public class SessionManager extends jp {
    @SuppressLint({"StaticFieldLeak"})
    private static final SessionManager instance = new SessionManager();
    private final gp appStateMonitor;
    private final Set<WeakReference<aea>> clients;
    private final GaugeManager gaugeManager;
    private PerfSession perfSession;
    private Future syncInitFuture;

    private SessionManager() {
        this(GaugeManager.getInstance(), PerfSession.c(UUID.randomUUID().toString()), gp.b());
    }

    public static SessionManager getInstance() {
        return instance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setApplicationContext$0(Context context, PerfSession perfSession) {
        this.gaugeManager.initializeGaugeMetadataManager(context);
        if (perfSession.e()) {
            this.gaugeManager.logGaugeMetadata(perfSession.h(), tp.FOREGROUND);
        }
    }

    private void logGaugeMetadataIfCollectionEnabled(tp tpVar) {
        if (this.perfSession.e()) {
            this.gaugeManager.logGaugeMetadata(this.perfSession.h(), tpVar);
        }
    }

    private void startOrStopCollectingGauges(tp tpVar) {
        if (this.perfSession.e()) {
            this.gaugeManager.startCollectingGauges(this.perfSession, tpVar);
        } else {
            this.gaugeManager.stopCollectingGauges();
        }
    }

    public Future getSyncInitFuture() {
        return this.syncInitFuture;
    }

    public void initializeGaugeCollection() {
        tp tpVar = tp.FOREGROUND;
        logGaugeMetadataIfCollectionEnabled(tpVar);
        startOrStopCollectingGauges(tpVar);
    }

    @Override // defpackage.jp, defpackage.gp.b
    public void onUpdateAppState(tp tpVar) {
        super.onUpdateAppState(tpVar);
        if (this.appStateMonitor.f()) {
            return;
        }
        if (tpVar == tp.FOREGROUND) {
            updatePerfSession(PerfSession.c(UUID.randomUUID().toString()));
        } else if (this.perfSession.f()) {
            updatePerfSession(PerfSession.c(UUID.randomUUID().toString()));
        } else {
            startOrStopCollectingGauges(tpVar);
        }
    }

    public final PerfSession perfSession() {
        return this.perfSession;
    }

    public void registerForSessionUpdates(WeakReference<aea> weakReference) {
        synchronized (this.clients) {
            this.clients.add(weakReference);
        }
    }

    public void setApplicationContext(final Context context) {
        final PerfSession perfSession = this.perfSession;
        this.syncInitFuture = Executors.newSingleThreadExecutor().submit(new Runnable() { // from class: qea
            @Override // java.lang.Runnable
            public final void run() {
                SessionManager.this.lambda$setApplicationContext$0(context, perfSession);
            }
        });
    }

    public void setPerfSession(PerfSession perfSession) {
        this.perfSession = perfSession;
    }

    public void stopGaugeCollectionIfSessionRunningTooLong() {
        if (this.perfSession.f()) {
            this.gaugeManager.stopCollectingGauges();
        }
    }

    public void unregisterForSessionUpdates(WeakReference<aea> weakReference) {
        synchronized (this.clients) {
            this.clients.remove(weakReference);
        }
    }

    public void updatePerfSession(PerfSession perfSession) {
        if (perfSession.h() == this.perfSession.h()) {
            return;
        }
        this.perfSession = perfSession;
        synchronized (this.clients) {
            try {
                Iterator<WeakReference<aea>> it = this.clients.iterator();
                while (it.hasNext()) {
                    aea aeaVar = it.next().get();
                    if (aeaVar != null) {
                        aeaVar.a(perfSession);
                    } else {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        logGaugeMetadataIfCollectionEnabled(this.appStateMonitor.a());
        startOrStopCollectingGauges(this.appStateMonitor.a());
    }

    public SessionManager(GaugeManager gaugeManager, PerfSession perfSession, gp gpVar) {
        this.clients = new HashSet();
        this.gaugeManager = gaugeManager;
        this.perfSession = perfSession;
        this.appStateMonitor = gpVar;
        registerForAppState();
    }
}
