package com.google.android.gms.internal.instantapps;

import android.content.pm.PackageInfo;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-instantapps@@17.0.1 */
/* loaded from: classes2.dex */
public final class zzf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzf> CREATOR = new b();
    private final String a;
    private final String b;
    private final List<zzao> c;
    private final List<zzh> d;
    private final int e;
    private final byte[] f;
    private final PackageInfo g;
    private final List<zzas> h;
    private final byte[] i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzf(String str, String str2, List<zzao> list, List<zzh> list2, List<zzas> list3, int i, byte[] bArr, PackageInfo packageInfo, byte[] bArr2) {
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = list2;
        this.e = i;
        this.f = bArr;
        this.g = packageInfo;
        this.h = list3;
        this.i = bArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = ys9.a(parcel);
        ys9.t(parcel, 2, this.a, false);
        ys9.t(parcel, 3, this.b, false);
        ys9.x(parcel, 5, this.c, false);
        ys9.x(parcel, 6, this.d, false);
        ys9.m(parcel, 7, this.e);
        ys9.g(parcel, 8, this.f, false);
        ys9.s(parcel, 9, this.g, i, false);
        ys9.x(parcel, 11, this.h, false);
        ys9.g(parcel, 12, this.i, false);
        ys9.b(parcel, a);
    }
}
