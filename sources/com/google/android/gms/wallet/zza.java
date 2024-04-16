package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: com.google.android.gms:play-services-wallet@@18.1.3 */
@Deprecated
/* loaded from: classes2.dex */
public final class zza extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zza> CREATOR = new d();
    String a;
    String b;
    String c;
    String d;
    String e;
    String f;
    String g;
    String h;
    String i;
    boolean j;
    String k;

    zza() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = ys9.a(parcel);
        ys9.t(parcel, 2, this.a, false);
        ys9.t(parcel, 3, this.b, false);
        ys9.t(parcel, 4, this.c, false);
        ys9.t(parcel, 5, this.d, false);
        ys9.t(parcel, 6, this.e, false);
        ys9.t(parcel, 7, this.f, false);
        ys9.t(parcel, 8, this.g, false);
        ys9.t(parcel, 9, this.h, false);
        ys9.t(parcel, 10, this.i, false);
        ys9.c(parcel, 11, this.j);
        ys9.t(parcel, 12, this.k, false);
        ys9.b(parcel, a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zza(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z, String str10) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = str9;
        this.j = z;
        this.k = str10;
    }
}
