package defpackage;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.instantapps.zzn;
/* compiled from: com.google.android.gms:play-services-instantapps@@17.0.1 */
/* renamed from: l6d  reason: default package */
/* loaded from: classes2.dex */
public final class l6d implements Parcelable.Creator<zzn> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzn createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        long j = 0;
        Account account = null;
        Account[] accountArr = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < B) {
            int t = SafeParcelReader.t(parcel);
            int l = SafeParcelReader.l(t);
            if (l != 2) {
                if (l != 3) {
                    if (l != 4) {
                        if (l != 5) {
                            if (l != 6) {
                                SafeParcelReader.A(parcel, t);
                            } else {
                                accountArr = (Account[]) SafeParcelReader.i(parcel, t, Account.CREATOR);
                            }
                        } else {
                            account = (Account) SafeParcelReader.e(parcel, t, Account.CREATOR);
                        }
                    } else {
                        i2 = SafeParcelReader.v(parcel, t);
                    }
                } else {
                    j = SafeParcelReader.x(parcel, t);
                }
            } else {
                i = SafeParcelReader.v(parcel, t);
            }
        }
        SafeParcelReader.k(parcel, B);
        return new zzn(i, j, i2, account, accountArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzn[] newArray(int i) {
        return new zzn[i];
    }
}
