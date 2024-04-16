package defpackage;

import android.os.Parcel;
/* compiled from: com.google.android.gms:play-services-ads-identifier@@17.1.0 */
/* renamed from: gtc  reason: default package */
/* loaded from: classes2.dex */
public final class gtc {
    private static final ClassLoader a = gtc.class.getClassLoader();

    private gtc() {
    }

    public static void a(Parcel parcel, boolean z) {
        parcel.writeInt(1);
    }

    public static boolean b(Parcel parcel) {
        if (parcel.readInt() != 0) {
            return true;
        }
        return false;
    }
}
