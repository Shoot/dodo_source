package com.appsflyer.internal;

import android.content.Context;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.support.annotation.Nullable;
import com.appsflyer.AFLogger;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* loaded from: classes.dex */
public abstract class AFb1lSDK<T> {
    public final String AFInAppEventParameterName;
    public final Context AFInAppEventType;
    private final String[] AFKeystoreWrapper;
    public final FutureTask<T> valueOf = new FutureTask<>(new Callable<T>() { // from class: com.appsflyer.internal.AFb1lSDK.3
        @Override // java.util.concurrent.Callable
        public final T call() {
            if (AFb1lSDK.this.values()) {
                return (T) AFb1lSDK.this.AFKeystoreWrapper();
            }
            return null;
        }
    });
    public final AFc1xSDK values;

    public AFb1lSDK(Context context, AFc1xSDK aFc1xSDK, String str, String... strArr) {
        this.AFInAppEventType = context;
        this.AFInAppEventParameterName = str;
        this.AFKeystoreWrapper = strArr;
        this.values = aFc1xSDK;
    }

    protected abstract T AFKeystoreWrapper();

    @Nullable
    public T valueOf() {
        try {
            return this.valueOf.get(500L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            AFLogger.afErrorLog(e.getMessage(), e);
            return null;
        }
    }

    public final boolean values() {
        try {
            ProviderInfo resolveContentProvider = this.AFInAppEventType.getPackageManager().resolveContentProvider(this.AFInAppEventParameterName, 128);
            if (resolveContentProvider != null) {
                if (Arrays.asList(this.AFKeystoreWrapper).contains(AFa1dSDK.AFKeystoreWrapper(this.AFInAppEventType.getPackageManager(), ((PackageItemInfo) resolveContentProvider).packageName))) {
                    return true;
                }
            }
            return false;
        } catch (PackageManager.NameNotFoundException | NoSuchAlgorithmException | CertificateException e) {
            AFLogger.afErrorLog(e.getMessage(), e);
            return false;
        }
    }
}
