package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.measurement.internal.zzaz;
import com.google.android.gms.measurement.internal.zzbe;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* renamed from: hrc  reason: default package */
/* loaded from: classes2.dex */
public final class hrc implements Parcelable.Creator<zzbe> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzbe createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        String str = null;
        zzaz zzazVar = null;
        String str2 = null;
        long j = 0;
        while (parcel.dataPosition() < B) {
            int t = SafeParcelReader.t(parcel);
            int l = SafeParcelReader.l(t);
            if (l != 2) {
                if (l != 3) {
                    if (l != 4) {
                        if (l != 5) {
                            SafeParcelReader.A(parcel, t);
                        } else {
                            j = SafeParcelReader.x(parcel, t);
                        }
                    } else {
                        str2 = SafeParcelReader.f(parcel, t);
                    }
                } else {
                    zzazVar = (zzaz) SafeParcelReader.e(parcel, t, zzaz.CREATOR);
                }
            } else {
                str = SafeParcelReader.f(parcel, t);
            }
        }
        SafeParcelReader.k(parcel, B);
        return new zzbe(str, zzazVar, str2, j);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzbe[] newArray(int i) {
        return new zzbe[i];
    }
}
