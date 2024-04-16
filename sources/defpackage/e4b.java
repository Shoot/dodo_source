package defpackage;
/* compiled from: SystemClock.java */
/* renamed from: e4b  reason: default package */
/* loaded from: classes2.dex */
public class e4b implements u91 {
    private static e4b a;

    private e4b() {
    }

    public static e4b a() {
        if (a == null) {
            a = new e4b();
        }
        return a;
    }

    @Override // defpackage.u91
    public long currentTimeMillis() {
        return System.currentTimeMillis();
    }
}
