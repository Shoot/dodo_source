package com.google.android.gms.internal.instantapps;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: com.google.android.gms:play-services-instantapps@@17.0.1 */
/* loaded from: classes2.dex */
public final class zzaj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaj> CREATOR = new a();
    private final int a;
    private final String b;
    @Deprecated
    private final Account[] c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaj(int i, String str, Account[] accountArr) {
        this.a = i;
        this.b = str;
        this.c = accountArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = ys9.a(parcel);
        ys9.m(parcel, 2, this.a);
        ys9.t(parcel, 3, this.b, false);
        ys9.w(parcel, 4, this.c, i, false);
        ys9.b(parcel, a);
    }
}
