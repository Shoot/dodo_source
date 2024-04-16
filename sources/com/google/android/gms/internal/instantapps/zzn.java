package com.google.android.gms.internal.instantapps;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: com.google.android.gms:play-services-instantapps@@17.0.1 */
/* loaded from: classes2.dex */
public final class zzn extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzn> CREATOR = new l6d();
    private final int a;
    private final long b;
    private final int c;
    private final Account d;
    private final Account[] e;

    public zzn(int i, long j, int i2, Account account, Account[] accountArr) {
        this.a = i;
        this.b = j;
        this.c = i2;
        this.d = account;
        this.e = accountArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = ys9.a(parcel);
        ys9.m(parcel, 2, this.a);
        ys9.q(parcel, 3, this.b);
        ys9.m(parcel, 4, this.c);
        ys9.s(parcel, 5, this.d, i, false);
        ys9.w(parcel, 6, this.e, i, false);
        ys9.b(parcel, a);
    }
}
