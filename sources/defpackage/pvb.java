package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import ch.qos.logback.core.spi.AbstractComponentTracker;
import com.huawei.hms.opendevice.c;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Metadata;
/* compiled from: UuidCopyManager.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u000e\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nRP\u0010\u0013\u001a>\u0012\u0004\u0012\u00020\u0002\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u000f0\u000ej\b\u0012\u0004\u0012\u00020\u000f`\u00100\rj\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u000f0\u000ej\b\u0012\u0004\u0012\u00020\u000f`\u0010`\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0012¨\u0006\u0016"}, d2 = {"Lpvb;", "", "", "activityHash", "", c.a, "Landroid/content/Context;", "appContext", "", "a", "Landroid/app/Activity;", "activity", "b", "Ljava/util/HashMap;", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", "appOpenTimestampMap", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: pvb  reason: default package */
/* loaded from: classes.dex */
public final class pvb {
    public static final pvb a = new pvb();
    private static final HashMap<Integer, ArrayList<Long>> b = new HashMap<>();

    private pvb() {
    }

    private final void a(Context context) {
        ClipboardManager clipboardManager;
        String b2 = nk6.a.b();
        if (b2.length() > 0 && (clipboardManager = (ClipboardManager) iu1.i(context, ClipboardManager.class)) != null) {
            clipboardManager.setPrimaryClip(ClipData.newPlainText(b2, b2));
        }
    }

    private final boolean c(int i) {
        Object k0;
        ArrayList<Long> arrayList = b.get(Integer.valueOf(i));
        if (arrayList == null || !nk6.a.m() || arrayList.size() < 5) {
            return false;
        }
        Long l = arrayList.get(arrayList.size() - 5);
        z65.g(l, "appOpenTimestampList[\n  …_APP_OPEN_TIMES\n        ]");
        long longValue = l.longValue();
        k0 = sc1.k0(arrayList);
        if (longValue + AbstractComponentTracker.LINGERING_TIMEOUT <= ((Number) k0).longValue()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0031, code lost:
        if (r1.put(java.lang.Integer.valueOf(r0), r2) == null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(android.app.Activity r7) {
        /*
            r6 = this;
            java.lang.String r0 = "activity"
            defpackage.z65.h(r7, r0)
            int r0 = r7.hashCode()
            java.util.HashMap<java.lang.Integer, java.util.ArrayList<java.lang.Long>> r1 = defpackage.pvb.b
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            java.lang.Object r2 = r1.get(r2)
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            if (r2 == 0) goto L33
            java.util.Date r3 = new java.util.Date
            r3.<init>()
            long r3 = r3.getTime()
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r2.add(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            java.lang.Object r2 = r1.put(r3, r2)
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            if (r2 != 0) goto L54
        L33:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r3 = 1
            java.lang.Long[] r3 = new java.lang.Long[r3]
            java.util.Date r4 = new java.util.Date
            r4.<init>()
            long r4 = r4.getTime()
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r5 = 0
            r3[r5] = r4
            java.util.ArrayList r3 = defpackage.ic1.h(r3)
            java.lang.Object r1 = r1.put(r2, r3)
            java.util.ArrayList r1 = (java.util.ArrayList) r1
        L54:
            boolean r0 = r6.c(r0)
            if (r0 == 0) goto L66
            android.content.Context r7 = r7.getApplicationContext()
            java.lang.String r0 = "activity.applicationContext"
            defpackage.z65.g(r7, r0)
            r6.a(r7)
        L66:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pvb.b(android.app.Activity):void");
    }
}
