package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.signin.internal.zag;
import java.util.ArrayList;
/* compiled from: com.google.android.gms:play-services-base@@18.2.0 */
/* renamed from: okc  reason: default package */
/* loaded from: classes2.dex */
public final class okc implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        ArrayList<String> arrayList = null;
        String str = null;
        while (parcel.dataPosition() < B) {
            int t = SafeParcelReader.t(parcel);
            int l = SafeParcelReader.l(t);
            if (l != 1) {
                if (l != 2) {
                    SafeParcelReader.A(parcel, t);
                } else {
                    str = SafeParcelReader.f(parcel, t);
                }
            } else {
                arrayList = SafeParcelReader.h(parcel, t);
            }
        }
        SafeParcelReader.k(parcel, B);
        return new zag(arrayList, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zag[i];
    }
}
