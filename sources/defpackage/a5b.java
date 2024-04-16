package defpackage;

import android.annotation.SuppressLint;
import android.os.Build;
import defpackage.g79;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SystemLibraryLoader.java */
/* renamed from: a5b  reason: default package */
/* loaded from: classes2.dex */
public final class a5b implements g79.b {
    @Override // defpackage.g79.b
    public void a(String str) {
        System.loadLibrary(str);
    }

    @Override // defpackage.g79.b
    public String b(String str) {
        if (str.startsWith("lib") && str.endsWith(".so")) {
            return str;
        }
        return System.mapLibraryName(str);
    }

    @Override // defpackage.g79.b
    public String c(String str) {
        return str.substring(3, str.length() - 3);
    }

    @Override // defpackage.g79.b
    public String[] d() {
        String[] strArr = Build.SUPPORTED_ABIS;
        if (strArr.length > 0) {
            return strArr;
        }
        String str = Build.CPU_ABI2;
        if (!zcb.a(str)) {
            return new String[]{Build.CPU_ABI, str};
        }
        return new String[]{Build.CPU_ABI};
    }

    @Override // defpackage.g79.b
    @SuppressLint({"UnsafeDynamicallyLoadedCode"})
    public void e(String str) {
        System.load(str);
    }
}
