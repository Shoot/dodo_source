package defpackage;

import android.content.Context;
import android.os.PowerManager;
import androidx.annotation.NonNull;
import java.util.HashMap;
import java.util.WeakHashMap;
/* compiled from: WakeLocks.java */
/* renamed from: x2c  reason: default package */
/* loaded from: classes.dex */
public class x2c {
    private static final String a = nx5.f("WakeLocks");
    private static final WeakHashMap<PowerManager.WakeLock, String> b = new WeakHashMap<>();

    public static void a() {
        HashMap hashMap = new HashMap();
        WeakHashMap<PowerManager.WakeLock, String> weakHashMap = b;
        synchronized (weakHashMap) {
            hashMap.putAll(weakHashMap);
        }
        for (PowerManager.WakeLock wakeLock : hashMap.keySet()) {
            if (wakeLock != null && wakeLock.isHeld()) {
                nx5.c().h(a, String.format("WakeLock held for %s", hashMap.get(wakeLock)), new Throwable[0]);
            }
        }
    }

    public static PowerManager.WakeLock b(@NonNull Context context, @NonNull String str) {
        String str2 = "WorkManager: " + str;
        PowerManager.WakeLock newWakeLock = ((PowerManager) context.getApplicationContext().getSystemService("power")).newWakeLock(1, str2);
        WeakHashMap<PowerManager.WakeLock, String> weakHashMap = b;
        synchronized (weakHashMap) {
            weakHashMap.put(newWakeLock, str2);
        }
        return newWakeLock;
    }
}
