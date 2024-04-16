package com.facebook.flipper.android;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.StrictMode;
import android.util.Log;
import com.facebook.flipper.core.FlipperClient;
/* loaded from: classes2.dex */
public final class AndroidFlipperClient {
    private static final String[] REQUIRED_PERMISSIONS = {"android.permission.INTERNET", "android.permission.ACCESS_WIFI_STATE"};
    private static FlipperThread sConnectionThread = null;
    private static FlipperThread sFlipperThread = null;
    private static boolean sIsInitialized = false;

    static void checkRequiredPermissions(Context context) {
        String[] strArr;
        for (String str : REQUIRED_PERMISSIONS) {
            if (iu1.a(context, str) == -1) {
                Log.e("Flipper", String.format("App needs permission \"%s\" to work with Flipper.", str));
            }
        }
    }

    static String getFriendlyDeviceName() {
        if (isRunningOnGenymotion()) {
            return Build.MODEL;
        }
        return Build.MODEL + " - " + Build.VERSION.RELEASE + " - API " + Build.VERSION.SDK_INT;
    }

    static String getId() {
        return Build.SERIAL;
    }

    public static synchronized FlipperClient getInstance(Context context) {
        FlipperClientImpl flipperClientImpl;
        Context applicationContext;
        synchronized (AndroidFlipperClient.class) {
            try {
                if (!sIsInitialized) {
                    checkRequiredPermissions(context);
                    FlipperThread flipperThread = new FlipperThread("FlipperEventBaseThread");
                    sFlipperThread = flipperThread;
                    flipperThread.start();
                    FlipperThread flipperThread2 = new FlipperThread("FlipperConnectionThread");
                    sConnectionThread = flipperThread2;
                    flipperThread2.start();
                    if (context.getApplicationContext() == null) {
                        applicationContext = context;
                    } else {
                        applicationContext = context.getApplicationContext();
                    }
                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    String absolutePath = context.getFilesDir().getAbsolutePath();
                    StrictMode.setThreadPolicy(allowThreadDiskReads);
                    FlipperClientImpl.init(sFlipperThread.getEventBase(), sConnectionThread.getEventBase(), FlipperProps.getInsecurePort(), FlipperProps.getSecurePort(), FlipperProps.getAltInsecurePort(), FlipperProps.getAltSecurePort(), getServerHost(applicationContext), "Android", getFriendlyDeviceName(), getId(), getRunningAppName(applicationContext), getPackageName(applicationContext), absolutePath);
                    sIsInitialized = true;
                }
                flipperClientImpl = FlipperClientImpl.getInstance();
            } catch (Throwable th) {
                throw th;
            }
        }
        return flipperClientImpl;
    }

    public static synchronized FlipperClient getInstanceIfInitialized() {
        synchronized (AndroidFlipperClient.class) {
            if (!sIsInitialized) {
                return null;
            }
            return FlipperClientImpl.getInstance();
        }
    }

    static String getPackageName(Context context) {
        return context.getPackageName();
    }

    static String getRunningAppName(Context context) {
        return context.getApplicationInfo().loadLabel(context.getPackageManager()).toString();
    }

    static String getServerHost(Context context) {
        isRunningOnStockEmulator();
        if (isRunningOnGenymotion()) {
            int ipAddress = ((WifiManager) context.getSystemService("wifi")).getConnectionInfo().getIpAddress();
            return String.format("%d.%d.%d.2", Integer.valueOf(ipAddress & 255), Integer.valueOf((ipAddress >> 8) & 255), Integer.valueOf((ipAddress >> 16) & 255));
        }
        return "localhost";
    }

    static boolean isRunningOnGenymotion() {
        return Build.FINGERPRINT.contains("vbox");
    }

    static boolean isRunningOnStockEmulator() {
        String str = Build.FINGERPRINT;
        if (str.contains("generic") && !str.contains("vbox")) {
            return true;
        }
        return false;
    }
}
