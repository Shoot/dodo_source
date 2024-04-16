package com.appsflyer.internal;

import android.content.Context;
import com.dodopizza.kustoworker.KustoStorage;
import im.threads.business.transport.MessageAttributes;
import java.util.HashMap;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;
/* loaded from: classes.dex */
public abstract class AFf1uSDK extends Observable {
    final Runnable AFInAppEventType;
    public final String AFKeystoreWrapper;
    public final String afInfoLog;
    long afRDLog;
    public final Map<String, Object> values = new HashMap();
    public AFa1ySDK afDebugLog = AFa1ySDK.NOT_STARTED;

    /* renamed from: com.appsflyer.internal.AFf1uSDK$2  reason: invalid class name */
    /* loaded from: classes.dex */
    final class AnonymousClass2 implements Observer {
        /* JADX INFO: Access modifiers changed from: package-private */
        public AnonymousClass2() {
        }

        @Override // java.util.Observer
        public final void update(Observable observable, Object obj) {
            AFf1uSDK.this.AFInAppEventType.run();
        }
    }

    /* loaded from: classes.dex */
    public enum AFa1ySDK {
        NOT_STARTED,
        STARTED,
        FINISHED
    }

    public AFf1uSDK(String str, String str2, Runnable runnable) {
        this.AFInAppEventType = runnable;
        this.AFKeystoreWrapper = str2;
        this.afInfoLog = str;
    }

    public abstract void AFInAppEventType(Context context);

    public final void valueOf() {
        this.values.put(KustoStorage.KustoTable.COLUMN_SOURCE, this.AFKeystoreWrapper);
        this.values.put(MessageAttributes.TYPE, this.afInfoLog);
        this.values.put("latency", Long.valueOf(System.currentTimeMillis() - this.afRDLog));
        this.afDebugLog = AFa1ySDK.FINISHED;
        setChanged();
        notifyObservers();
    }
}
