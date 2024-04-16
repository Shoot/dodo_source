package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: com.google.android.gms:play-services-instantapps@@17.0.1 */
/* renamed from: rsc  reason: default package */
/* loaded from: classes2.dex */
public final class rsc {
    private static final ClassLoader a = rsc.class.getClassLoader();

    private rsc() {
    }

    public static <T extends Parcelable> T a(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return creator.createFromParcel(parcel);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void b(Parcel parcel, IInterface iInterface) {
        parcel.writeStrongBinder(iInterface);
    }

    public static boolean c(Parcel parcel) {
        if (parcel.readInt() != 0) {
            return true;
        }
        return false;
    }
}
