package defpackage;
/* compiled from: SubtleUtil.java */
/* renamed from: p1b  reason: default package */
/* loaded from: classes2.dex */
public final class p1b {
    @Deprecated
    public static int a() {
        Integer a = xub.a();
        if (a != null) {
            return a.intValue();
        }
        return -1;
    }

    public static boolean b() {
        return "The Android Project".equals(System.getProperty("java.vendor"));
    }
}
