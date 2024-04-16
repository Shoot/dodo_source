package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
/* loaded from: classes2.dex */
public final class zzdd extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzdd> CREATOR = new kvc();
    public final long a;
    public final long b;
    public final boolean c;
    public final String d;
    public final String e;
    public final String f;
    public final Bundle g;
    public final String h;

    public zzdd(long j, long j2, boolean z, String str, String str2, String str3, Bundle bundle, String str4) {
        this.a = j;
        this.b = j2;
        this.c = z;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = bundle;
        this.h = str4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = ys9.a(parcel);
        ys9.q(parcel, 1, this.a);
        ys9.q(parcel, 2, this.b);
        ys9.c(parcel, 3, this.c);
        ys9.t(parcel, 4, this.d, false);
        ys9.t(parcel, 5, this.e, false);
        ys9.t(parcel, 6, this.f, false);
        ys9.e(parcel, 7, this.g, false);
        ys9.t(parcel, 8, this.h, false);
        ys9.b(parcel, a);
    }
}
