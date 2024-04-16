package defpackage;
/* compiled from: Logger.java */
/* renamed from: ox5  reason: default package */
/* loaded from: classes.dex */
public class ox5 {
    private static tz5 a = new lx5();

    public static void a(String str) {
        a.debug(str);
    }

    public static void b(String str, Throwable th) {
        a.error(str, th);
    }

    public static void c(String str) {
        a.a(str);
    }

    public static void d(String str, Throwable th) {
        a.b(str, th);
    }
}
