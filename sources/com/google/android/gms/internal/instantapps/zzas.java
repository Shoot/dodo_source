package com.google.android.gms.internal.instantapps;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: com.google.android.gms:play-services-instantapps@@17.0.1 */
/* loaded from: classes2.dex */
public final class zzas extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzas> CREATOR = new jpc();
    private final String a;
    private final int b;
    private final String c;
    private final String d;
    private final long e;
    private final byte[] f;

    public zzas(String str, int i, String str2, String str3, long j, byte[] bArr) {
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = str3;
        this.e = j;
        this.f = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = ys9.a(parcel);
        ys9.t(parcel, 1, this.a, false);
        ys9.m(parcel, 2, this.b);
        ys9.t(parcel, 3, this.c, false);
        ys9.t(parcel, 4, this.d, false);
        ys9.q(parcel, 5, this.e);
        ys9.g(parcel, 6, this.f, false);
        ys9.b(parcel, a);
    }
}
