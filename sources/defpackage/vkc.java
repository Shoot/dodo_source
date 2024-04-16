package defpackage;

import android.os.Build;
/* compiled from: com.google.android.gms:play-services-base@@18.2.0 */
/* renamed from: vkc  reason: default package */
/* loaded from: classes2.dex */
final class vkc {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a() {
        if (Build.VERSION.SDK_INT < 33 && Build.VERSION.CODENAME.charAt(0) != 'T') {
            return false;
        }
        return true;
    }
}
