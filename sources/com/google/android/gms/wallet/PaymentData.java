package com.google.android.gms.wallet;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
/* compiled from: com.google.android.gms:play-services-wallet@@18.1.3 */
/* loaded from: classes2.dex */
public final class PaymentData extends AbstractSafeParcelable implements x00 {
    @RecentlyNonNull
    public static final Parcelable.Creator<PaymentData> CREATOR = new m();
    String a;
    CardInfo b;
    UserAddress c;
    PaymentMethodToken d;
    String e;
    Bundle f;
    String g;
    Bundle h;

    private PaymentData() {
    }

    @RecentlyNullable
    public static PaymentData h(@RecentlyNonNull Intent intent) {
        return (PaymentData) zs9.b(intent, "com.google.android.gms.wallet.PaymentData", CREATOR);
    }

    @Override // defpackage.x00
    public void a(@RecentlyNonNull Intent intent) {
        zs9.d(this, intent, "com.google.android.gms.wallet.PaymentData");
    }

    @RecentlyNonNull
    public String k() {
        return this.g;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int a = ys9.a(parcel);
        ys9.t(parcel, 1, this.a, false);
        ys9.s(parcel, 2, this.b, i, false);
        ys9.s(parcel, 3, this.c, i, false);
        ys9.s(parcel, 4, this.d, i, false);
        ys9.t(parcel, 5, this.e, false);
        ys9.e(parcel, 6, this.f, false);
        ys9.t(parcel, 7, this.g, false);
        ys9.e(parcel, 8, this.h, false);
        ys9.b(parcel, a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public PaymentData(String str, CardInfo cardInfo, UserAddress userAddress, PaymentMethodToken paymentMethodToken, String str2, Bundle bundle, String str3, Bundle bundle2) {
        this.a = str;
        this.b = cardInfo;
        this.c = userAddress;
        this.d = paymentMethodToken;
        this.e = str2;
        this.f = bundle;
        this.g = str3;
        this.h = bundle2;
    }
}
