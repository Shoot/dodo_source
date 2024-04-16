package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes2.dex */
public final class zzo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzo> CREATOR = new eb();
    public final int A;
    public final String B;
    public final int I;
    public final long X;
    public final String Y;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final long e;
    public final long f;
    public final String g;
    public final boolean h;
    public final boolean i;
    public final long j;
    public final String k;
    @Deprecated
    private final long l;
    public final long m;
    public final int n;
    public final boolean o;
    public final boolean p;
    public final String q;
    public final Boolean r;
    public final long s;
    public final List<String> t;
    private final String u;
    public final String v;
    public final String w;
    public final String x;
    public final boolean y;
    public final long z;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzo(String str, String str2, String str3, long j, String str4, long j2, long j3, String str5, boolean z, boolean z2, String str6, long j4, long j5, int i, boolean z3, boolean z4, String str7, Boolean bool, long j6, List<String> list, String str8, String str9, String str10, String str11, boolean z5, long j7, int i2, String str12, int i3, long j8, String str13) {
        gh8.f(str);
        this.a = str;
        this.b = TextUtils.isEmpty(str2) ? null : str2;
        this.c = str3;
        this.j = j;
        this.d = str4;
        this.e = j2;
        this.f = j3;
        this.g = str5;
        this.h = z;
        this.i = z2;
        this.k = str6;
        this.l = j4;
        this.m = j5;
        this.n = i;
        this.o = z3;
        this.p = z4;
        this.q = str7;
        this.r = bool;
        this.s = j6;
        this.t = list;
        this.u = null;
        this.v = str9;
        this.w = str10;
        this.x = str11;
        this.y = z5;
        this.z = j7;
        this.A = i2;
        this.B = str12;
        this.I = i3;
        this.X = j8;
        this.Y = str13;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = ys9.a(parcel);
        ys9.t(parcel, 2, this.a, false);
        ys9.t(parcel, 3, this.b, false);
        ys9.t(parcel, 4, this.c, false);
        ys9.t(parcel, 5, this.d, false);
        ys9.q(parcel, 6, this.e);
        ys9.q(parcel, 7, this.f);
        ys9.t(parcel, 8, this.g, false);
        ys9.c(parcel, 9, this.h);
        ys9.c(parcel, 10, this.i);
        ys9.q(parcel, 11, this.j);
        ys9.t(parcel, 12, this.k, false);
        ys9.q(parcel, 13, this.l);
        ys9.q(parcel, 14, this.m);
        ys9.m(parcel, 15, this.n);
        ys9.c(parcel, 16, this.o);
        ys9.c(parcel, 18, this.p);
        ys9.t(parcel, 19, this.q, false);
        ys9.d(parcel, 21, this.r, false);
        ys9.q(parcel, 22, this.s);
        ys9.v(parcel, 23, this.t, false);
        ys9.t(parcel, 24, this.u, false);
        ys9.t(parcel, 25, this.v, false);
        ys9.t(parcel, 26, this.w, false);
        ys9.t(parcel, 27, this.x, false);
        ys9.c(parcel, 28, this.y);
        ys9.q(parcel, 29, this.z);
        ys9.m(parcel, 30, this.A);
        ys9.t(parcel, 31, this.B, false);
        ys9.m(parcel, 32, this.I);
        ys9.q(parcel, 34, this.X);
        ys9.t(parcel, 35, this.Y, false);
        ys9.b(parcel, a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzo(String str, String str2, String str3, String str4, long j, long j2, String str5, boolean z, boolean z2, long j3, String str6, long j4, long j5, int i, boolean z3, boolean z4, String str7, Boolean bool, long j6, List<String> list, String str8, String str9, String str10, String str11, boolean z5, long j7, int i2, String str12, int i3, long j8, String str13) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.j = j3;
        this.d = str4;
        this.e = j;
        this.f = j2;
        this.g = str5;
        this.h = z;
        this.i = z2;
        this.k = str6;
        this.l = j4;
        this.m = j5;
        this.n = i;
        this.o = z3;
        this.p = z4;
        this.q = str7;
        this.r = bool;
        this.s = j6;
        this.t = list;
        this.u = str8;
        this.v = str9;
        this.w = str10;
        this.x = str11;
        this.y = z5;
        this.z = j7;
        this.A = i2;
        this.B = str12;
        this.I = i3;
        this.X = j8;
        this.Y = str13;
    }
}
