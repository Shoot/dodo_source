package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* compiled from: com.google.android.gms:play-services-base@@18.2.0 */
/* renamed from: wkc  reason: default package */
/* loaded from: classes2.dex */
public final class wkc implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        String str = null;
        String str2 = null;
        long j = 0;
        long j2 = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = -1;
        while (parcel.dataPosition() < B) {
            int t = SafeParcelReader.t(parcel);
            switch (SafeParcelReader.l(t)) {
                case 1:
                    i = SafeParcelReader.v(parcel, t);
                    break;
                case 2:
                    i2 = SafeParcelReader.v(parcel, t);
                    break;
                case 3:
                    i3 = SafeParcelReader.v(parcel, t);
                    break;
                case 4:
                    j = SafeParcelReader.x(parcel, t);
                    break;
                case 5:
                    j2 = SafeParcelReader.x(parcel, t);
                    break;
                case 6:
                    str = SafeParcelReader.f(parcel, t);
                    break;
                case 7:
                    str2 = SafeParcelReader.f(parcel, t);
                    break;
                case 8:
                    i4 = SafeParcelReader.v(parcel, t);
                    break;
                case 9:
                    i5 = SafeParcelReader.v(parcel, t);
                    break;
                default:
                    SafeParcelReader.A(parcel, t);
                    break;
            }
        }
        SafeParcelReader.k(parcel, B);
        return new MethodInvocation(i, i2, i3, j, j2, str, str2, i4, i5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new MethodInvocation[i];
    }
}
