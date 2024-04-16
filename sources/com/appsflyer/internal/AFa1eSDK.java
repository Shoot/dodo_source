package com.appsflyer.internal;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.support.annotation.NonNull;
import android.support.annotation.VisibleForTesting;
import com.appsflyer.AFLogger;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
/* loaded from: classes.dex */
public final class AFa1eSDK {
    private static final BitSet afErrorLog;
    @VisibleForTesting
    private static volatile AFa1eSDK afRDLog;
    final Runnable AFInAppEventParameterName;
    final Runnable AFInAppEventType;
    final Handler AFKeystoreWrapper;
    private final Map<AFa1jSDK, Map<String, Object>> AFLogger;
    private final Runnable AFLogger$LogLevel;
    private boolean AFVersionDeclaration;
    private final Map<AFa1jSDK, AFa1jSDK> afDebugLog;
    private final SensorManager afErrorLogForExcManagerOnly;
    final Runnable afInfoLog;
    private int afWarnLog;
    private long getLevel;
    boolean valueOf;
    final Object values = new Object();

    /* renamed from: com.appsflyer.internal.AFa1eSDK$8  reason: invalid class name */
    /* loaded from: classes.dex */
    final class AnonymousClass8 implements Runnable {
        AnonymousClass8() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                if (!AFa1eSDK.this.afDebugLog.isEmpty()) {
                    for (AFa1jSDK aFa1jSDK : AFa1eSDK.this.afDebugLog.values()) {
                        AFa1eSDK.this.afErrorLogForExcManagerOnly.unregisterListener(aFa1jSDK);
                        aFa1jSDK.AFInAppEventParameterName(AFa1eSDK.this.AFLogger, true);
                    }
                }
            } catch (Throwable th) {
                AFLogger.afErrorLogForExcManagerOnly("error while unregistering listeners", th);
            }
            AFa1eSDK.this.afWarnLog = 0;
            AFa1eSDK.this.AFVersionDeclaration = false;
        }
    }

    static {
        BitSet bitSet = new BitSet(6);
        afErrorLog = bitSet;
        bitSet.set(1);
        bitSet.set(2);
        bitSet.set(4);
    }

    private AFa1eSDK(@NonNull SensorManager sensorManager, Handler handler) {
        BitSet bitSet = afErrorLog;
        this.afDebugLog = new HashMap(bitSet.size());
        this.AFLogger = new ConcurrentHashMap(bitSet.size());
        this.AFInAppEventParameterName = new Runnable() { // from class: com.appsflyer.internal.AFa1eSDK.5
            @Override // java.lang.Runnable
            public final void run() {
                synchronized (AFa1eSDK.this.values) {
                    final AFa1eSDK aFa1eSDK = AFa1eSDK.this;
                    aFa1eSDK.AFKeystoreWrapper.post(new Runnable() { // from class: com.appsflyer.internal.AFa1eSDK.3
                        @Override // java.lang.Runnable
                        public final void run() {
                            try {
                                for (Sensor sensor : AFa1eSDK.this.afErrorLogForExcManagerOnly.getSensorList(-1)) {
                                    if (AFa1eSDK.values(sensor.getType())) {
                                        AFa1jSDK aFa1jSDK = new AFa1jSDK(sensor);
                                        if (!AFa1eSDK.this.afDebugLog.containsKey(aFa1jSDK)) {
                                            AFa1eSDK.this.afDebugLog.put(aFa1jSDK, aFa1jSDK);
                                        }
                                        AFa1eSDK.this.afErrorLogForExcManagerOnly.registerListener((SensorEventListener) AFa1eSDK.this.afDebugLog.get(aFa1jSDK), sensor, 0, AFa1eSDK.this.AFKeystoreWrapper);
                                    }
                                }
                            } catch (Throwable th) {
                                AFLogger.afErrorLogForExcManagerOnly("registerListeners error", th);
                            }
                            AFa1eSDK.this.AFVersionDeclaration = true;
                        }
                    });
                    AFa1eSDK aFa1eSDK2 = AFa1eSDK.this;
                    aFa1eSDK2.AFKeystoreWrapper.postDelayed(aFa1eSDK2.AFLogger$LogLevel, 100L);
                    AFa1eSDK.this.valueOf = true;
                }
            }
        };
        this.AFInAppEventType = new Runnable() { // from class: com.appsflyer.internal.AFa1eSDK.4
            @Override // java.lang.Runnable
            public final void run() {
                synchronized (AFa1eSDK.this.values) {
                    AFa1eSDK aFa1eSDK = AFa1eSDK.this;
                    aFa1eSDK.AFKeystoreWrapper.post(new AnonymousClass8());
                }
            }
        };
        this.afInfoLog = new Runnable() { // from class: com.appsflyer.internal.AFa1eSDK.1
            @Override // java.lang.Runnable
            public final void run() {
                synchronized (AFa1eSDK.this.values) {
                    try {
                        AFa1eSDK aFa1eSDK = AFa1eSDK.this;
                        if (aFa1eSDK.valueOf) {
                            aFa1eSDK.AFKeystoreWrapper.removeCallbacks(aFa1eSDK.AFInAppEventParameterName);
                            AFa1eSDK aFa1eSDK2 = AFa1eSDK.this;
                            aFa1eSDK2.AFKeystoreWrapper.removeCallbacks(aFa1eSDK2.AFInAppEventType);
                            AFa1eSDK aFa1eSDK3 = AFa1eSDK.this;
                            aFa1eSDK3.AFKeystoreWrapper.post(new AnonymousClass8());
                            AFa1eSDK.this.valueOf = false;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        };
        this.afWarnLog = 1;
        this.getLevel = 0L;
        this.AFLogger$LogLevel = new Runnable() { // from class: com.appsflyer.internal.AFa1eSDK.2
            @Override // java.lang.Runnable
            public final void run() {
                synchronized (AFa1eSDK.this.values) {
                    try {
                        if (AFa1eSDK.this.afWarnLog == 0) {
                            AFa1eSDK.this.afWarnLog = 1;
                        }
                        AFa1eSDK aFa1eSDK = AFa1eSDK.this;
                        aFa1eSDK.AFKeystoreWrapper.postDelayed(aFa1eSDK.AFInAppEventType, aFa1eSDK.afWarnLog * 500);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        };
        this.afErrorLogForExcManagerOnly = sensorManager;
        this.AFKeystoreWrapper = handler;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean values(int i) {
        return i >= 0 && afErrorLog.get(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Map<String, Object> AFInAppEventParameterName() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        List<Map<String, Object>> AFInAppEventType = AFInAppEventType();
        if (!AFInAppEventType.isEmpty()) {
            concurrentHashMap.put("sensors", AFInAppEventType);
        } else {
            List<Map<String, Object>> values = values();
            if (!values.isEmpty()) {
                concurrentHashMap.put("sensors", values);
            }
        }
        return concurrentHashMap;
    }

    @NonNull
    private List<Map<String, Object>> AFInAppEventType() {
        synchronized (this.values) {
            try {
                if (!this.afDebugLog.isEmpty() && this.AFVersionDeclaration) {
                    for (AFa1jSDK aFa1jSDK : this.afDebugLog.values()) {
                        aFa1jSDK.AFInAppEventParameterName(this.AFLogger, false);
                    }
                }
                if (this.AFLogger.isEmpty()) {
                    return new CopyOnWriteArrayList(Collections.emptyList());
                }
                return new CopyOnWriteArrayList(this.AFLogger.values());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static AFa1eSDK valueOf(Context context) {
        if (afRDLog != null) {
            return afRDLog;
        }
        HandlerThread handlerThread = new HandlerThread("internal");
        handlerThread.start();
        return valueOf((SensorManager) context.getApplicationContext().getSystemService("sensor"), new Handler(handlerThread.getLooper()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void AFKeystoreWrapper() {
        this.AFKeystoreWrapper.post(this.afInfoLog);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List<Map<String, Object>> values() {
        for (AFa1jSDK aFa1jSDK : this.afDebugLog.values()) {
            aFa1jSDK.AFInAppEventParameterName(this.AFLogger, true);
        }
        Map<AFa1jSDK, Map<String, Object>> map = this.AFLogger;
        if (map != null && !map.isEmpty()) {
            return new CopyOnWriteArrayList(this.AFLogger.values());
        }
        return new CopyOnWriteArrayList(Collections.emptyList());
    }

    private static AFa1eSDK valueOf(SensorManager sensorManager, Handler handler) {
        if (afRDLog == null) {
            synchronized (AFa1eSDK.class) {
                try {
                    if (afRDLog == null) {
                        afRDLog = new AFa1eSDK(sensorManager, handler);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return afRDLog;
    }
}
