package com.google.android.gms.internal.instantapps;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: com.google.android.gms:play-services-instantapps@@17.0.1 */
/* loaded from: classes2.dex */
public final class zzt extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzt> CREATOR = new c();
    private final int a;
    private final String b;
    private final boolean c;
    private final Intent d;
    private final Intent e;
    private final zzf f;
    private final zzao g;
    private final boolean h;
    private final byte[] i;
    private final String j;
    private final int k;
    private final int l;
    private final String m;
    private final byte[] n;
    private final Bundle o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzt(int i, String str, boolean z, Intent intent, Intent intent2, zzf zzfVar, zzao zzaoVar, boolean z2, byte[] bArr, String str2, int i2, int i3, String str3, byte[] bArr2, Bundle bundle) {
        this.a = i;
        this.b = str;
        this.c = z;
        this.d = intent;
        this.e = intent2;
        this.f = zzfVar;
        this.g = zzaoVar;
        this.h = z2;
        this.i = bArr;
        this.j = str2;
        this.k = i2;
        this.m = str3;
        this.l = i3;
        this.n = bArr2;
        this.o = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = ys9.a(parcel);
        ys9.m(parcel, 2, this.a);
        ys9.t(parcel, 3, this.b, false);
        ys9.c(parcel, 4, this.c);
        ys9.s(parcel, 5, this.d, i, false);
        ys9.s(parcel, 6, this.e, i, false);
        ys9.s(parcel, 8, this.f, i, false);
        ys9.s(parcel, 9, this.g, i, false);
        ys9.c(parcel, 10, this.h);
        ys9.g(parcel, 11, this.i, false);
        ys9.t(parcel, 12, this.j, false);
        ys9.m(parcel, 13, this.k);
        ys9.t(parcel, 14, this.m, false);
        ys9.e(parcel, 15, this.o, false);
        ys9.m(parcel, 16, this.l);
        ys9.g(parcel, 17, this.n, false);
        ys9.b(parcel, a);
    }
}
