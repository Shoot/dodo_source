package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes2.dex */
public final class zzmh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzmh> CREATOR = new qa();
    public final String a;
    public final long b;
    public final int c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzmh(String str, long j, int i) {
        this.a = str;
        this.b = j;
        this.c = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = ys9.a(parcel);
        ys9.t(parcel, 1, this.a, false);
        ys9.q(parcel, 2, this.b);
        ys9.m(parcel, 3, this.c);
        ys9.b(parcel, a);
    }
}
