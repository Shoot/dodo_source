package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Process;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
/* compiled from: ProcessDetailsProvider.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J.\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0002J\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\r2\u0006\u0010\f\u001a\u00020\u000bJ\u000e\u0010\u000f\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lok8;", "", "", "processName", "", "pid", "importance", "", "isDefaultProcess", "Lmk8;", "a", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", c.a, DateTokenConverter.CONVERTER_KEY, e.a, "()Ljava/lang/String;", "<init>", "()V", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 7, 1})
/* renamed from: ok8  reason: default package */
/* loaded from: classes2.dex */
public final class ok8 {
    public static final ok8 a = new ok8();

    private ok8() {
    }

    private final mk8 a(String str, int i, int i2, boolean z) {
        return new mk8(str, i, i2, z);
    }

    static /* synthetic */ mk8 b(ok8 ok8Var, String str, int i, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        if ((i3 & 8) != 0) {
            z = false;
        }
        return ok8Var.a(str, i, i2, z);
    }

    public final List<mk8> c(Context context) {
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
            String str2 = runningAppProcessInfo.processName;
            z65.g(str2, "runningAppProcessInfo.processName");
            arrayList2.add(new mk8(str2, runningAppProcessInfo.pid, runningAppProcessInfo.importance, z65.c(runningAppProcessInfo.processName, str)));
        }
        return arrayList2;
    }

    public final mk8 d(Context context) {
        Object obj;
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        int myPid = Process.myPid();
        Iterator<T> it = c(context).iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((mk8) obj).b() == myPid) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        mk8 mk8Var = (mk8) obj;
        if (mk8Var == null) {
            return b(this, e(), myPid, 0, false, 12, null);
        }
        return mk8Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0014, code lost:
        r0 = android.app.Application.getProcessName();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String e() {
        /*
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto L10
            java.lang.String r0 = defpackage.nk8.a()
            java.lang.String r1 = "myProcessName()"
            defpackage.z65.g(r0, r1)
            return r0
        L10:
            r1 = 28
            if (r0 < r1) goto L1b
            java.lang.String r0 = defpackage.wk8.a()
            if (r0 == 0) goto L1b
            return r0
        L1b:
            java.lang.String r0 = defpackage.xk8.a()
            if (r0 == 0) goto L22
            return r0
        L22:
            java.lang.String r0 = ""
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ok8.e():java.lang.String");
    }
}
