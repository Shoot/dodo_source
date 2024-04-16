package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.location.LocationRequest;
import java.util.Collections;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* loaded from: classes2.dex */
public final class zzba extends AbstractSafeParcelable {
    final LocationRequest a;
    final List<ClientIdentity> b;
    final String c;
    final boolean d;
    final boolean e;
    final boolean f;
    final String g;
    final boolean h;
    boolean i;
    String j;
    long k;
    static final List<ClientIdentity> l = Collections.emptyList();
    public static final Parcelable.Creator<zzba> CREATOR = new j();

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzba(LocationRequest locationRequest, List<ClientIdentity> list, String str, boolean z, boolean z2, boolean z3, String str2, boolean z4, boolean z5, String str3, long j) {
        this.a = locationRequest;
        this.b = list;
        this.c = str;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = str2;
        this.h = z4;
        this.i = z5;
        this.j = str3;
        this.k = j;
    }

    public static zzba h(String str, LocationRequest locationRequest) {
        return new zzba(locationRequest, l, null, false, false, false, null, false, false, null, Long.MAX_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzba) {
            zzba zzbaVar = (zzba) obj;
            if (m57.a(this.a, zzbaVar.a) && m57.a(this.b, zzbaVar.b) && m57.a(this.c, zzbaVar.c) && this.d == zzbaVar.d && this.e == zzbaVar.e && this.f == zzbaVar.f && m57.a(this.g, zzbaVar.g) && this.h == zzbaVar.h && this.i == zzbaVar.i && m57.a(this.j, zzbaVar.j)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final zzba k(String str) {
        this.j = str;
        return this;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        if (this.c != null) {
            sb.append(" tag=");
            sb.append(this.c);
        }
        if (this.g != null) {
            sb.append(" moduleId=");
            sb.append(this.g);
        }
        if (this.j != null) {
            sb.append(" contextAttributionTag=");
            sb.append(this.j);
        }
        sb.append(" hideAppOps=");
        sb.append(this.d);
        sb.append(" clients=");
        sb.append(this.b);
        sb.append(" forceCoarseLocation=");
        sb.append(this.e);
        if (this.f) {
            sb.append(" exemptFromBackgroundThrottle");
        }
        if (this.h) {
            sb.append(" locationSettingsIgnored");
        }
        if (this.i) {
            sb.append(" inaccurateLocationsDelayed");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = ys9.a(parcel);
        ys9.s(parcel, 1, this.a, i, false);
        ys9.x(parcel, 5, this.b, false);
        ys9.t(parcel, 6, this.c, false);
        ys9.c(parcel, 7, this.d);
        ys9.c(parcel, 8, this.e);
        ys9.c(parcel, 9, this.f);
        ys9.t(parcel, 10, this.g, false);
        ys9.c(parcel, 11, this.h);
        ys9.c(parcel, 12, this.i);
        ys9.t(parcel, 13, this.j, false);
        ys9.q(parcel, 14, this.k);
        ys9.b(parcel, a);
    }
}
