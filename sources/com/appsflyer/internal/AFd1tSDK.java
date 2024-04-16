package com.appsflyer.internal;

import android.net.TrafficStats;
import android.support.annotation.CallSuper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.WorkerThread;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public abstract class AFd1tSDK<Result> implements Comparable<AFd1tSDK<?>>, Callable<AFc1aSDK> {
    private static final AtomicInteger afErrorLog = new AtomicInteger();
    @NonNull
    public final Set<AFd1wSDK> AFInAppEventParameterName;
    @Nullable
    public AFc1aSDK AFInAppEventType;
    @NonNull
    public final AFd1wSDK AFKeystoreWrapper;
    private final int AFLogger;
    private long afDebugLog;
    @Nullable
    private Throwable afInfoLog;
    private final String afRDLog;
    private boolean getLevel;
    public volatile int valueOf;
    @NonNull
    public final Set<AFd1wSDK> values;

    public AFd1tSDK(@NonNull AFd1wSDK aFd1wSDK, @NonNull AFd1wSDK[] aFd1wSDKArr, @Nullable String str) {
        HashSet hashSet = new HashSet();
        this.values = hashSet;
        this.AFInAppEventParameterName = new HashSet();
        int incrementAndGet = afErrorLog.incrementAndGet();
        this.AFLogger = incrementAndGet;
        this.getLevel = false;
        this.valueOf = 0;
        this.AFKeystoreWrapper = aFd1wSDK;
        Collections.addAll(hashSet, aFd1wSDKArr);
        if (str != null) {
            this.afRDLog = str;
        } else {
            this.afRDLog = String.valueOf(incrementAndGet);
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: AFInAppEventParameterName */
    public final int compareTo(AFd1tSDK<?> aFd1tSDK) {
        int i = this.AFKeystoreWrapper.onInstallConversionDataLoadedNative - aFd1tSDK.AFKeystoreWrapper.onInstallConversionDataLoadedNative;
        if (i == 0) {
            if (this.afRDLog.equals(aFd1tSDK.afRDLog)) {
                return 0;
            }
            return this.AFLogger - aFd1tSDK.AFLogger;
        }
        return i;
    }

    @WorkerThread
    @NonNull
    protected abstract AFc1aSDK AFInAppEventParameterName() throws Exception;

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract long AFInAppEventType();

    @WorkerThread
    protected void AFInAppEventType(Throwable th) {
    }

    @Nullable
    public final Throwable afDebugLog() {
        return this.afInfoLog;
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: afInfoLog */
    public final AFc1aSDK call() throws Exception {
        TrafficStats.setThreadStatsTag("AppsFlyer".hashCode());
        this.AFInAppEventType = null;
        this.afInfoLog = null;
        long currentTimeMillis = System.currentTimeMillis();
        this.valueOf++;
        try {
            AFc1aSDK AFInAppEventParameterName = AFInAppEventParameterName();
            this.AFInAppEventType = AFInAppEventParameterName;
            return AFInAppEventParameterName;
        } finally {
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean afRDLog() {
        return this.getLevel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AFd1tSDK aFd1tSDK = (AFd1tSDK) obj;
        if (this.AFKeystoreWrapper != aFd1tSDK.AFKeystoreWrapper) {
            return false;
        }
        return this.afRDLog.equals(aFd1tSDK.afRDLog);
    }

    public final int hashCode() {
        return (this.AFKeystoreWrapper.hashCode() * 31) + this.afRDLog.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.AFKeystoreWrapper);
        sb.append("-");
        sb.append(this.afRDLog);
        String obj = sb.toString();
        if (!String.valueOf(this.AFLogger).equals(this.afRDLog)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(obj);
            sb2.append("-");
            sb2.append(this.AFLogger);
            return sb2.toString();
        }
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @WorkerThread
    public abstract boolean valueOf();

    @WorkerThread
    @CallSuper
    public void values() {
        this.getLevel = true;
    }

    @WorkerThread
    protected void AFKeystoreWrapper() {
    }
}
