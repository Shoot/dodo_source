package com.google.android.gms.internal.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: com.google.android.gms:play-services-wallet@@18.1.3 */
/* loaded from: classes2.dex */
public final class zzi extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzi> CREATOR = new d2d();
    final byte[] a;

    zzi() {
        this.a = new byte[0];
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = ys9.a(parcel);
        ys9.g(parcel, 2, this.a, false);
        ys9.b(parcel, a);
    }

    public zzi(byte[] bArr) {
        this.a = bArr;
    }
}
