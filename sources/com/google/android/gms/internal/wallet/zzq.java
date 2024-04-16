package com.google.android.gms.internal.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import android.widget.RemoteViews;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: com.google.android.gms:play-services-wallet@@18.1.3 */
/* loaded from: classes2.dex */
public final class zzq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzq> CREATOR = new z9d();
    String[] a;
    int[] b;
    RemoteViews c;
    byte[] d;

    private zzq() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = ys9.a(parcel);
        ys9.u(parcel, 1, this.a, false);
        ys9.n(parcel, 2, this.b, false);
        ys9.s(parcel, 3, this.c, i, false);
        ys9.g(parcel, 4, this.d, false);
        ys9.b(parcel, a);
    }

    public zzq(String[] strArr, int[] iArr, RemoteViews remoteViews, byte[] bArr) {
        this.a = strArr;
        this.b = iArr;
        this.c = remoteViews;
        this.d = bArr;
    }
}
