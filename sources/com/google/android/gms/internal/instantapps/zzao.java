package com.google.android.gms.internal.instantapps;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: com.google.android.gms:play-services-instantapps@@17.0.1 */
/* loaded from: classes2.dex */
public final class zzao extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzao> CREATOR = new apc();
    private final String a;
    private final int b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;
    private final String h;

    public zzao(String str, int i, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.a = gh8.f(str);
        this.b = i;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = ys9.a(parcel);
        ys9.t(parcel, 2, this.a, false);
        ys9.m(parcel, 3, this.b);
        ys9.t(parcel, 4, this.c, false);
        ys9.t(parcel, 5, this.d, false);
        ys9.t(parcel, 6, this.e, false);
        ys9.t(parcel, 7, this.g, false);
        ys9.t(parcel, 8, this.h, false);
        ys9.t(parcel, 9, this.e, false);
        ys9.b(parcel, a);
    }
}
