package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.widget.RemoteViews;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.wallet.zzq;
/* compiled from: com.google.android.gms:play-services-wallet@@18.1.3 */
/* renamed from: z9d  reason: default package */
/* loaded from: classes2.dex */
public final class z9d implements Parcelable.Creator<zzq> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzq createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        String[] strArr = null;
        int[] iArr = null;
        RemoteViews remoteViews = null;
        byte[] bArr = null;
        while (parcel.dataPosition() < B) {
            int t = SafeParcelReader.t(parcel);
            int l = SafeParcelReader.l(t);
            if (l != 1) {
                if (l != 2) {
                    if (l != 3) {
                        if (l != 4) {
                            SafeParcelReader.A(parcel, t);
                        } else {
                            bArr = SafeParcelReader.b(parcel, t);
                        }
                    } else {
                        remoteViews = (RemoteViews) SafeParcelReader.e(parcel, t, RemoteViews.CREATOR);
                    }
                } else {
                    iArr = SafeParcelReader.c(parcel, t);
                }
            } else {
                strArr = SafeParcelReader.g(parcel, t);
            }
        }
        SafeParcelReader.k(parcel, B);
        return new zzq(strArr, iArr, remoteViews, bArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzq[] newArray(int i) {
        return new zzq[i];
    }
}
