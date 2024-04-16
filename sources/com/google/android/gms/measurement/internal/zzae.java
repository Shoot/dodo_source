package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes2.dex */
public final class zzae extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzae> CREATOR = new e();
    public String a;
    public String b;
    public zznb c;
    public long d;
    public boolean e;
    public String f;
    public zzbe g;
    public long h;
    public zzbe i;
    public long j;
    public zzbe k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzae(zzae zzaeVar) {
        gh8.j(zzaeVar);
        this.a = zzaeVar.a;
        this.b = zzaeVar.b;
        this.c = zzaeVar.c;
        this.d = zzaeVar.d;
        this.e = zzaeVar.e;
        this.f = zzaeVar.f;
        this.g = zzaeVar.g;
        this.h = zzaeVar.h;
        this.i = zzaeVar.i;
        this.j = zzaeVar.j;
        this.k = zzaeVar.k;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = ys9.a(parcel);
        ys9.t(parcel, 2, this.a, false);
        ys9.t(parcel, 3, this.b, false);
        ys9.s(parcel, 4, this.c, i, false);
        ys9.q(parcel, 5, this.d);
        ys9.c(parcel, 6, this.e);
        ys9.t(parcel, 7, this.f, false);
        ys9.s(parcel, 8, this.g, i, false);
        ys9.q(parcel, 9, this.h);
        ys9.s(parcel, 10, this.i, i, false);
        ys9.q(parcel, 11, this.j);
        ys9.s(parcel, 12, this.k, i, false);
        ys9.b(parcel, a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzae(String str, String str2, zznb zznbVar, long j, boolean z, String str3, zzbe zzbeVar, long j2, zzbe zzbeVar2, long j3, zzbe zzbeVar3) {
        this.a = str;
        this.b = str2;
        this.c = zznbVar;
        this.d = j;
        this.e = z;
        this.f = str3;
        this.g = zzbeVar;
        this.h = j2;
        this.i = zzbeVar2;
        this.j = j3;
        this.k = zzbeVar3;
    }
}
