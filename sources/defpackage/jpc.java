package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.instantapps.zzas;
/* compiled from: com.google.android.gms:play-services-instantapps@@17.0.1 */
/* renamed from: jpc  reason: default package */
/* loaded from: classes2.dex */
public final class jpc implements Parcelable.Creator<zzas> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzas createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        byte[] bArr = null;
        long j = 0;
        int i = 0;
        while (parcel.dataPosition() < B) {
            int t = SafeParcelReader.t(parcel);
            switch (SafeParcelReader.l(t)) {
                case 1:
                    str = SafeParcelReader.f(parcel, t);
                    break;
                case 2:
                    i = SafeParcelReader.v(parcel, t);
                    break;
                case 3:
                    str2 = SafeParcelReader.f(parcel, t);
                    break;
                case 4:
                    str3 = SafeParcelReader.f(parcel, t);
                    break;
                case 5:
                    j = SafeParcelReader.x(parcel, t);
                    break;
                case 6:
                    bArr = SafeParcelReader.b(parcel, t);
                    break;
                default:
                    SafeParcelReader.A(parcel, t);
                    break;
            }
        }
        SafeParcelReader.k(parcel, B);
        return new zzas(str, i, str2, str3, j, bArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzas[] newArray(int i) {
        return new zzas[i];
    }
}
