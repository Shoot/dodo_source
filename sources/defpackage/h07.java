package defpackage;

import java.util.Locale;
/* compiled from: Normalizer.java */
/* renamed from: h07  reason: default package */
/* loaded from: classes3.dex */
public final class h07 {
    public static String a(String str) {
        if (str != null) {
            return str.toLowerCase(Locale.ENGLISH);
        }
        return "";
    }

    public static String b(String str) {
        return a(str).trim();
    }

    public static String c(String str, boolean z) {
        if (z) {
            return a(str);
        }
        return b(str);
    }
}
