package defpackage;

import androidx.annotation.NonNull;
import defpackage.gp;
import java.lang.ref.WeakReference;
/* compiled from: AppStateUpdateHandler.java */
/* renamed from: jp  reason: default package */
/* loaded from: classes2.dex */
public abstract class jp implements gp.b {
    private final WeakReference<gp.b> appStateCallback;
    private final gp appStateMonitor;
    private tp currentAppState;
    private boolean isRegisteredForAppState;

    /* JADX INFO: Access modifiers changed from: protected */
    public jp() {
        this(gp.b());
    }

    public tp getAppState() {
        return this.currentAppState;
    }

    public WeakReference<gp.b> getAppStateCallback() {
        return this.appStateCallback;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void incrementTsnsCount(int i) {
        this.appStateMonitor.e(i);
    }

    @Override // defpackage.gp.b
    public void onUpdateAppState(tp tpVar) {
        tp tpVar2 = this.currentAppState;
        tp tpVar3 = tp.APPLICATION_PROCESS_STATE_UNKNOWN;
        if (tpVar2 == tpVar3) {
            this.currentAppState = tpVar;
        } else if (tpVar2 != tpVar && tpVar != tpVar3) {
            this.currentAppState = tp.FOREGROUND_BACKGROUND;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void registerForAppState() {
        if (this.isRegisteredForAppState) {
            return;
        }
        this.currentAppState = this.appStateMonitor.a();
        this.appStateMonitor.k(this.appStateCallback);
        this.isRegisteredForAppState = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void unregisterForAppState() {
        if (!this.isRegisteredForAppState) {
            return;
        }
        this.appStateMonitor.p(this.appStateCallback);
        this.isRegisteredForAppState = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public jp(@NonNull gp gpVar) {
        this.isRegisteredForAppState = false;
        this.currentAppState = tp.APPLICATION_PROCESS_STATE_UNKNOWN;
        this.appStateMonitor = gpVar;
        this.appStateCallback = new WeakReference<>(this);
    }
}
