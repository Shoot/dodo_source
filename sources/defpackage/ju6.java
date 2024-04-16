package defpackage;
/* compiled from: NativeLoader.java */
/* renamed from: ju6  reason: default package */
/* loaded from: classes2.dex */
public class ju6 {
    private ju6() {
    }

    public static boolean a(String str) {
        return b(str, 0);
    }

    public static boolean b(String str, int i) {
        synchronized (ju6.class) {
            throw new IllegalStateException("NativeLoader has not been initialized.  To use standard native library loading, call NativeLoader.init(new SystemDelegate()).");
        }
    }
}
