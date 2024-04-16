package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.e;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: com.google.android.gms:play-services-base@@18.2.0 */
/* loaded from: classes2.dex */
public final class zav extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zav> CREATOR = new i();
    final int a;
    final IBinder b;
    private final ConnectionResult c;
    private final boolean d;
    private final boolean e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zav(int i, IBinder iBinder, ConnectionResult connectionResult, boolean z, boolean z2) {
        this.a = i;
        this.b = iBinder;
        this.c = connectionResult;
        this.d = z;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zav)) {
            return false;
        }
        zav zavVar = (zav) obj;
        if (!this.c.equals(zavVar.c) || !m57.a(k(), zavVar.k())) {
            return false;
        }
        return true;
    }

    public final ConnectionResult h() {
        return this.c;
    }

    public final e k() {
        IBinder iBinder = this.b;
        if (iBinder == null) {
            return null;
        }
        return e.a.C(iBinder);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = ys9.a(parcel);
        ys9.m(parcel, 1, this.a);
        ys9.l(parcel, 2, this.b, false);
        ys9.s(parcel, 3, this.c, i, false);
        ys9.c(parcel, 4, this.d);
        ys9.c(parcel, 5, this.e);
        ys9.b(parcel, a);
    }
}
