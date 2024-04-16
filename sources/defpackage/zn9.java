package defpackage;

import android.annotation.SuppressLint;
import android.os.Build;
/* renamed from: zn9  reason: default package */
/* loaded from: classes3.dex */
public class zn9 {
    private static final String b = "RootKeyUtil";
    private byte[] a = null;

    private zn9() {
    }

    private void a(String str, String str2, String str3, String str4) {
        b(str, str2, str3, jo4.b(str4));
    }

    @SuppressLint({"NewApi"})
    private void b(String str, String str2, String str3, byte[] bArr) {
        if (Build.VERSION.SDK_INT < 26) {
            jec.d(b, "initRootKey: sha1");
            this.a = s70.h(str, str2, str3, bArr, false);
            return;
        }
        jec.d(b, "initRootKey: sha256");
        this.a = s70.h(str, str2, str3, bArr, true);
    }

    public static zn9 d(String str, String str2, String str3, String str4) {
        zn9 zn9Var = new zn9();
        zn9Var.a(str, str2, str3, str4);
        return zn9Var;
    }

    public byte[] c() {
        return (byte[]) this.a.clone();
    }
}
