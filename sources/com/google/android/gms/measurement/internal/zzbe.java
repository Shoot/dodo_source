package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes2.dex */
public final class zzbe extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbe> CREATOR = new hrc();
    public final String a;
    public final zzaz b;
    public final String c;
    public final long d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbe(zzbe zzbeVar, long j) {
        gh8.j(zzbeVar);
        this.a = zzbeVar.a;
        this.b = zzbeVar.b;
        this.c = zzbeVar.c;
        this.d = j;
    }

    public final String toString() {
        String str = this.c;
        String str2 = this.a;
        String valueOf = String.valueOf(this.b);
        return "origin=" + str + ",name=" + str2 + ",params=" + valueOf;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = ys9.a(parcel);
        ys9.t(parcel, 2, this.a, false);
        ys9.s(parcel, 3, this.b, i, false);
        ys9.t(parcel, 4, this.c, false);
        ys9.q(parcel, 5, this.d);
        ys9.b(parcel, a);
    }

    public zzbe(String str, zzaz zzazVar, String str2, long j) {
        this.a = str;
        this.b = zzazVar;
        this.c = str2;
        this.d = j;
    }
}
