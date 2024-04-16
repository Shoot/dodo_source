package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
/* compiled from: com.google.android.gms:play-services-wallet@@18.1.3 */
/* loaded from: classes2.dex */
public final class CardInfo extends AbstractSafeParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<CardInfo> CREATOR = new e();
    String a;
    String b;
    String c;
    int d;
    UserAddress e;

    private CardInfo() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int a = ys9.a(parcel);
        ys9.t(parcel, 1, this.a, false);
        ys9.t(parcel, 2, this.b, false);
        ys9.t(parcel, 3, this.c, false);
        ys9.m(parcel, 4, this.d);
        ys9.s(parcel, 5, this.e, i, false);
        ys9.b(parcel, a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CardInfo(String str, String str2, String str3, int i, UserAddress userAddress) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = userAddress;
    }
}
