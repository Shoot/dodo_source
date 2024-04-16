package com.appsflyer.internal;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.WorkerThread;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AFa1jSDK implements SensorEventListener {
    @NonNull
    private final String AFInAppEventType;
    @NonNull
    private final String AFKeystoreWrapper;
    private long AFLogger;
    private double afErrorLog;
    @Nullable
    private Executor afInfoLog;
    private final int afRDLog;
    private final int values;
    private final float[][] valueOf = new float[2];
    private final long[] AFInAppEventParameterName = new long[2];

    /* JADX INFO: Access modifiers changed from: package-private */
    public AFa1jSDK(Sensor sensor) {
        int type = sensor.getType();
        this.values = type;
        String name = sensor.getName();
        name = name == null ? "" : name;
        this.AFKeystoreWrapper = name;
        String vendor = sensor.getVendor();
        String str = vendor != null ? vendor : "";
        this.AFInAppEventType = str;
        this.afRDLog = ((((type + 31) * 31) + name.hashCode()) * 31) + str.hashCode();
    }

    @NonNull
    private synchronized Executor AFInAppEventType() {
        try {
            if (this.afInfoLog == null) {
                this.afInfoLog = Executors.newSingleThreadExecutor();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.afInfoLog;
    }

    private boolean AFKeystoreWrapper(int i, @NonNull String str, @NonNull String str2) {
        if (this.values == i && this.AFKeystoreWrapper.equals(str) && this.AFInAppEventType.equals(str2)) {
            return true;
        }
        return false;
    }

    private static double valueOf(@NonNull float[] fArr, @NonNull float[] fArr2) {
        int min = Math.min(fArr.length, fArr2.length);
        double d = 0.0d;
        for (int i = 0; i < min; i++) {
            d += StrictMath.pow(fArr[i] - fArr2[i], 2.0d);
        }
        return Math.sqrt(d);
    }

    private boolean values() {
        if (this.valueOf[0] == null) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void AFInAppEventParameterName(@NonNull Map<AFa1jSDK, Map<String, Object>> map, boolean z) {
        if (values()) {
            map.put(this, valueOf());
            if (z) {
                int length = this.valueOf.length;
                for (int i = 0; i < length; i++) {
                    this.valueOf[i] = null;
                }
                int length2 = this.AFInAppEventParameterName.length;
                for (int i2 = 0; i2 < length2; i2++) {
                    this.AFInAppEventParameterName[i2] = 0;
                }
                this.afErrorLog = 0.0d;
                this.AFLogger = 0L;
            }
        } else if (!map.containsKey(this)) {
            map.put(this, valueOf());
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AFa1jSDK) {
            AFa1jSDK aFa1jSDK = (AFa1jSDK) obj;
            return AFKeystoreWrapper(aFa1jSDK.values, aFa1jSDK.AFKeystoreWrapper, aFa1jSDK.AFInAppEventType);
        }
        return false;
    }

    public final int hashCode() {
        return this.afRDLog;
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(final SensorEvent sensorEvent) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            AFInAppEventType().execute(new Runnable() { // from class: com.appsflyer.internal.a
                @Override // java.lang.Runnable
                public final void run() {
                    AFa1jSDK.this.valueOf(sensorEvent);
                }
            });
        } else {
            valueOf(sensorEvent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @WorkerThread
    /* renamed from: AFInAppEventType */
    public void valueOf(SensorEvent sensorEvent) {
        long j = sensorEvent.timestamp;
        float[] fArr = sensorEvent.values;
        long currentTimeMillis = System.currentTimeMillis();
        float[][] fArr2 = this.valueOf;
        float[] fArr3 = fArr2[0];
        if (fArr3 == null) {
            fArr2[0] = Arrays.copyOf(fArr, fArr.length);
            this.AFInAppEventParameterName[0] = currentTimeMillis;
            return;
        }
        float[] fArr4 = fArr2[1];
        if (fArr4 == null) {
            float[] copyOf = Arrays.copyOf(fArr, fArr.length);
            this.valueOf[1] = copyOf;
            this.AFInAppEventParameterName[1] = currentTimeMillis;
            this.afErrorLog = valueOf(fArr3, copyOf);
        } else if (50000000 <= j - this.AFLogger) {
            this.AFLogger = j;
            if (Arrays.equals(fArr4, fArr)) {
                this.AFInAppEventParameterName[1] = currentTimeMillis;
                return;
            }
            double valueOf = valueOf(fArr3, fArr);
            if (valueOf > this.afErrorLog) {
                this.valueOf[1] = Arrays.copyOf(fArr, fArr.length);
                this.AFInAppEventParameterName[1] = currentTimeMillis;
                this.afErrorLog = valueOf;
            }
        }
    }

    @NonNull
    private static List<Float> valueOf(@NonNull float[] fArr) {
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float f : fArr) {
            arrayList.add(Float.valueOf(f));
        }
        return arrayList;
    }

    @NonNull
    private Map<String, Object> valueOf() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(7);
        concurrentHashMap.put("sT", Integer.valueOf(this.values));
        concurrentHashMap.put("sN", this.AFKeystoreWrapper);
        concurrentHashMap.put("sV", this.AFInAppEventType);
        float[] fArr = this.valueOf[0];
        if (fArr != null) {
            concurrentHashMap.put("sVS", valueOf(fArr));
        }
        float[] fArr2 = this.valueOf[1];
        if (fArr2 != null) {
            concurrentHashMap.put("sVE", valueOf(fArr2));
        }
        return concurrentHashMap;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }
}
