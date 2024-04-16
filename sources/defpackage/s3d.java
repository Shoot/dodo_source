package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.wallet.wobs.TimeInterval;
/* compiled from: com.google.android.gms:play-services-wallet@@18.1.3 */
/* renamed from: s3d  reason: default package */
/* loaded from: classes2.dex */
public final class s3d implements Parcelable.Creator<TimeInterval> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ TimeInterval createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        long j = 0;
        long j2 = 0;
        while (parcel.dataPosition() < B) {
            int t = SafeParcelReader.t(parcel);
            int l = SafeParcelReader.l(t);
            if (l != 2) {
                if (l != 3) {
                    SafeParcelReader.A(parcel, t);
                } else {
                    j2 = SafeParcelReader.x(parcel, t);
                }
            } else {
                j = SafeParcelReader.x(parcel, t);
            }
        }
        SafeParcelReader.k(parcel, B);
        return new TimeInterval(j, j2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ TimeInterval[] newArray(int i) {
        return new TimeInterval[i];
    }
}
