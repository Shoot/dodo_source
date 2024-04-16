package defpackage;

import android.content.Context;
/* compiled from: InstallerPackageNameProvider.java */
/* renamed from: x45  reason: default package */
/* loaded from: classes2.dex */
class x45 {
    private String a;

    private static String b(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        if (installerPackageName == null) {
            return "";
        }
        return installerPackageName;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized String a(Context context) {
        String str;
        try {
            if (this.a == null) {
                this.a = b(context);
            }
            if ("".equals(this.a)) {
                str = null;
            } else {
                str = this.a;
            }
        } finally {
        }
        return str;
    }
}
