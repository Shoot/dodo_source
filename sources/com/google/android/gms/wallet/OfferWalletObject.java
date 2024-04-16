package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.wallet.wobs.CommonWalletObject;
/* compiled from: com.google.android.gms:play-services-wallet@@18.1.3 */
/* loaded from: classes2.dex */
public final class OfferWalletObject extends AbstractSafeParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<OfferWalletObject> CREATOR = new l();
    private final int a;
    String b;
    String c;
    CommonWalletObject d;

    OfferWalletObject() {
        this.a = 3;
    }

    public int h() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int a = ys9.a(parcel);
        ys9.m(parcel, 1, h());
        ys9.t(parcel, 2, this.b, false);
        ys9.t(parcel, 3, this.c, false);
        ys9.s(parcel, 4, this.d, i, false);
        ys9.b(parcel, a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public OfferWalletObject(int i, String str, String str2, CommonWalletObject commonWalletObject) {
        this.a = i;
        this.c = str2;
        if (i >= 3) {
            this.d = commonWalletObject;
            return;
        }
        com.google.android.gms.wallet.wobs.b h = CommonWalletObject.h();
        h.a(str);
        this.d = h.b();
    }
}
