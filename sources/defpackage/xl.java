package defpackage;

import android.annotation.TargetApi;
import android.os.Trace;
/* compiled from: Api18TraceUtils.java */
@TargetApi(18)
/* renamed from: xl  reason: default package */
/* loaded from: classes2.dex */
class xl {
    public static void a(String str, String str2, String str3) {
        String str4 = str + str2 + str3;
        if (str4.length() > 127 && str2 != null) {
            int length = (127 - str.length()) - str3.length();
            str4 = str + str2.substring(0, length) + str3;
        }
        Trace.beginSection(str4);
    }

    public static void b() {
        Trace.endSection();
    }
}
