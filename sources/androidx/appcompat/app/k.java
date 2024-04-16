package androidx.appcompat.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import androidx.annotation.NonNull;
import ch.qos.logback.core.CoreConstants;
import java.util.Calendar;
/* compiled from: TwilightManager.java */
/* loaded from: classes.dex */
class k {
    private static k d;
    private final Context a;
    private final LocationManager b;
    private final a c = new a();

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: TwilightManager.java */
    /* loaded from: classes.dex */
    public static class a {
        boolean a;
        long b;
        long c;
        long d;
        long e;
        long f;

        a() {
        }
    }

    k(@NonNull Context context, @NonNull LocationManager locationManager) {
        this.a = context;
        this.b = locationManager;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static k a(@NonNull Context context) {
        if (d == null) {
            Context applicationContext = context.getApplicationContext();
            d = new k(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return d;
    }

    @SuppressLint({"MissingPermission"})
    private Location b() {
        Location location;
        Location location2 = null;
        if (gy7.b(this.a, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
            location = c("network");
        } else {
            location = null;
        }
        if (gy7.b(this.a, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            location2 = c("gps");
        }
        if (location2 != null && location != null) {
            if (location2.getTime() > location.getTime()) {
                return location2;
            }
            return location;
        } else if (location2 != null) {
            return location2;
        } else {
            return location;
        }
    }

    private Location c(String str) {
        try {
            if (this.b.isProviderEnabled(str)) {
                return this.b.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e) {
            Log.d("TwilightManager", "Failed to get last known location", e);
            return null;
        }
    }

    private boolean e() {
        if (this.c.f > System.currentTimeMillis()) {
            return true;
        }
        return false;
    }

    private void f(@NonNull Location location) {
        boolean z;
        long j;
        long j2;
        a aVar = this.c;
        long currentTimeMillis = System.currentTimeMillis();
        j b = j.b();
        b.a(currentTimeMillis - CoreConstants.MILLIS_IN_ONE_DAY, location.getLatitude(), location.getLongitude());
        long j3 = b.a;
        b.a(currentTimeMillis, location.getLatitude(), location.getLongitude());
        if (b.c == 1) {
            z = true;
        } else {
            z = false;
        }
        long j4 = b.b;
        long j5 = b.a;
        boolean z2 = z;
        b.a(CoreConstants.MILLIS_IN_ONE_DAY + currentTimeMillis, location.getLatitude(), location.getLongitude());
        long j6 = b.b;
        if (j4 != -1 && j5 != -1) {
            if (currentTimeMillis > j5) {
                j2 = j6;
            } else if (currentTimeMillis > j4) {
                j2 = j5;
            } else {
                j2 = j4;
            }
            j = j2 + 60000;
        } else {
            j = 43200000 + currentTimeMillis;
        }
        aVar.a = z2;
        aVar.b = j3;
        aVar.c = j4;
        aVar.d = j5;
        aVar.e = j6;
        aVar.f = j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean d() {
        a aVar = this.c;
        if (e()) {
            return aVar.a;
        }
        Location b = b();
        if (b != null) {
            f(b);
            return aVar.a;
        }
        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int i = Calendar.getInstance().get(11);
        if (i >= 6 && i < 22) {
            return false;
        }
        return true;
    }
}
