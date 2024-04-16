package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: com.google.android.gms:play-services-wallet@@18.1.3 */
/* loaded from: classes2.dex */
public final class TransactionInfo extends AbstractSafeParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<TransactionInfo> CREATOR = new aoc();
    int a;
    String b;
    String c;

    private TransactionInfo() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int a = ys9.a(parcel);
        ys9.m(parcel, 1, this.a);
        ys9.t(parcel, 2, this.b, false);
        ys9.t(parcel, 3, this.c, false);
        ys9.b(parcel, a);
    }

    public TransactionInfo(int i, @RecentlyNonNull String str, @RecentlyNonNull String str2) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }
}
