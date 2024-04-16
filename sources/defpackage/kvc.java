package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.measurement.zzdd;
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
/* renamed from: kvc  reason: default package */
/* loaded from: classes2.dex */
public final class kvc implements Parcelable.Creator<zzdd> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzdd createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        long j = 0;
        long j2 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        Bundle bundle = null;
        String str4 = null;
        boolean z = false;
        while (parcel.dataPosition() < B) {
            int t = SafeParcelReader.t(parcel);
            switch (SafeParcelReader.l(t)) {
                case 1:
                    j = SafeParcelReader.x(parcel, t);
                    break;
                case 2:
                    j2 = SafeParcelReader.x(parcel, t);
                    break;
                case 3:
                    z = SafeParcelReader.m(parcel, t);
                    break;
                case 4:
                    str = SafeParcelReader.f(parcel, t);
                    break;
                case 5:
                    str2 = SafeParcelReader.f(parcel, t);
                    break;
                case 6:
                    str3 = SafeParcelReader.f(parcel, t);
                    break;
                case 7:
                    bundle = SafeParcelReader.a(parcel, t);
                    break;
                case 8:
                    str4 = SafeParcelReader.f(parcel, t);
                    break;
                default:
                    SafeParcelReader.A(parcel, t);
                    break;
            }
        }
        SafeParcelReader.k(parcel, B);
        return new zzdd(j, j2, z, str, str2, str3, bundle, str4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzdd[] newArray(int i) {
        return new zzdd[i];
    }
}
