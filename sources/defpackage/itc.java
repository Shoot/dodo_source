package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: com.google.android.gms:play-services-auth-api-phone@@17.5.1 */
/* renamed from: itc  reason: default package */
/* loaded from: classes2.dex */
public final class itc {
    private static final ClassLoader a = itc.class.getClassLoader();

    private itc() {
    }

    public static <T extends Parcelable> T a(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return creator.createFromParcel(parcel);
    }

    public static void b(Parcel parcel, IInterface iInterface) {
        if (iInterface == null) {
            parcel.writeStrongBinder(null);
        } else {
            parcel.writeStrongBinder(iInterface.asBinder());
        }
    }
}
