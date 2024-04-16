package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Process;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.push.e;
import defpackage.j12;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
/* compiled from: ProcessDetailsProvider.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\t\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004J.\u0010\u0010\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0007¨\u0006\u0013"}, d2 = {"Lpk8;", "", "", "f", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "Lj12$e$d$a$c;", DateTokenConverter.CONVERTER_KEY, e.a, "processName", "", "pid", "importance", "", "isDefaultProcess", "b", "<init>", "()V", "com.google.firebase-firebase-crashlytics"}, k = 1, mv = {1, 7, 1})
/* renamed from: pk8  reason: default package */
/* loaded from: classes2.dex */
public final class pk8 {
    public static final pk8 a = new pk8();

    private pk8() {
    }

    public static /* synthetic */ j12.e.d.a.c c(pk8 pk8Var, String str, int i, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        if ((i3 & 8) != 0) {
            z = false;
        }
        return pk8Var.b(str, i, i2, z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
        r0 = android.app.Application.getProcessName();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.String f() {
        /*
            r3 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto L10
            java.lang.String r0 = defpackage.nk8.a()
            java.lang.String r1 = "{\n      Process.myProcessName()\n    }"
            defpackage.z65.g(r0, r1)
            goto L1d
        L10:
            r1 = 28
            java.lang.String r2 = ""
            if (r0 < r1) goto L1c
            java.lang.String r0 = defpackage.wk8.a()
            if (r0 != 0) goto L1d
        L1c:
            r0 = r2
        L1d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pk8.f():java.lang.String");
    }

    public final j12.e.d.a.c a(String str, int i, int i2) {
        z65.h(str, "processName");
        return c(this, str, i, i2, false, 8, null);
    }

    public final j12.e.d.a.c b(String str, int i, int i2, boolean z) {
        z65.h(str, "processName");
        j12.e.d.a.c a2 = j12.e.d.a.c.a().e(str).d(i).c(i2).b(z).a();
        z65.g(a2, "builder()\n      .setProc…ltProcess)\n      .build()");
        return a2;
    }

    public final List<j12.e.d.a.c> d(Context context) {
        ActivityManager activityManager;
        List W;
        int w;
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        int i = context.getApplicationInfo().uid;
        String str = context.getApplicationInfo().processName;
        Object systemService = context.getSystemService("activity");
        List<ActivityManager.RunningAppProcessInfo> list = null;
        if (systemService instanceof ActivityManager) {
            activityManager = (ActivityManager) systemService;
        } else {
            activityManager = null;
        }
        if (activityManager != null) {
            list = activityManager.getRunningAppProcesses();
        }
        if (list == null) {
            list = kc1.l();
        }
        W = sc1.W(list);
        ArrayList<ActivityManager.RunningAppProcessInfo> arrayList = new ArrayList();
        for (Object obj : W) {
            if (((ActivityManager.RunningAppProcessInfo) obj).uid == i) {
                arrayList.add(obj);
            }
        }
        w = lc1.w(arrayList, 10);
        ArrayList arrayList2 = new ArrayList(w);
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : arrayList) {
            arrayList2.add(j12.e.d.a.c.a().e(runningAppProcessInfo.processName).d(runningAppProcessInfo.pid).c(runningAppProcessInfo.importance).b(z65.c(runningAppProcessInfo.processName, str)).a());
        }
        return arrayList2;
    }

    public final j12.e.d.a.c e(Context context) {
        Object obj;
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        int myPid = Process.myPid();
        Iterator<T> it = d(context).iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((j12.e.d.a.c) obj).c() == myPid) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        j12.e.d.a.c cVar = (j12.e.d.a.c) obj;
        if (cVar == null) {
            return c(this, f(), myPid, 0, false, 12, null);
        }
        return cVar;
    }
}
