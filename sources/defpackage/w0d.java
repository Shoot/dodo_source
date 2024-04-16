package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.instantapps.zzh;
/* compiled from: com.google.android.gms:play-services-instantapps@@17.0.1 */
/* renamed from: w0d  reason: default package */
/* loaded from: classes2.dex */
public final class w0d implements Parcelable.Creator<zzh> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzh createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        String str = null;
        String str2 = null;
        String[] strArr = null;
        int[] iArr = null;
        byte[] bArr = null;
        int i = 0;
        boolean z = false;
        while (parcel.dataPosition() < B) {
            int t = SafeParcelReader.t(parcel);
            switch (SafeParcelReader.l(t)) {
                case 2:
                    str = SafeParcelReader.f(parcel, t);
                    break;
                case 3:
                default:
                    SafeParcelReader.A(parcel, t);
                    break;
                case 4:
                    str2 = SafeParcelReader.f(parcel, t);
                    break;
                case 5:
                    strArr = SafeParcelReader.g(parcel, t);
                    break;
                case 6:
                    i = SafeParcelReader.v(parcel, t);
                    break;
                case 7:
                    bArr = SafeParcelReader.b(parcel, t);
                    break;
                case 8:
                    iArr = SafeParcelReader.c(parcel, t);
                    break;
                case 9:
                    z = SafeParcelReader.m(parcel, t);
                    break;
            }
        }
        SafeParcelReader.k(parcel, B);
        return new zzh(str, str2, strArr, iArr, i, bArr, z);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzh[] newArray(int i) {
        return new zzh[i];
    }
}
