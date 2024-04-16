package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes2.dex */
public final class zznb extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zznb> CREATOR = new hb();
    private final int a;
    public final String b;
    public final long c;
    public final Long d;
    private final Float e;
    public final String f;
    public final String g;
    public final Double h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zznb(gb gbVar) {
        this(gbVar.c, gbVar.d, gbVar.e, gbVar.b);
    }

    public final Object h() {
        Long l = this.d;
        if (l != null) {
            return l;
        }
        Double d = this.h;
        if (d != null) {
            return d;
        }
        String str = this.f;
        if (str != null) {
            return str;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = ys9.a(parcel);
        ys9.m(parcel, 1, this.a);
        ys9.t(parcel, 2, this.b, false);
        ys9.q(parcel, 3, this.c);
        ys9.r(parcel, 4, this.d, false);
        ys9.k(parcel, 5, null, false);
        ys9.t(parcel, 6, this.f, false);
        ys9.t(parcel, 7, this.g, false);
        ys9.i(parcel, 8, this.h, false);
        ys9.b(parcel, a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zznb(String str, long j, Object obj, String str2) {
        gh8.f(str);
        this.a = 2;
        this.b = str;
        this.c = j;
        this.g = str2;
        if (obj == null) {
            this.d = null;
            this.e = null;
            this.h = null;
            this.f = null;
        } else if (obj instanceof Long) {
            this.d = (Long) obj;
            this.e = null;
            this.h = null;
            this.f = null;
        } else if (obj instanceof String) {
            this.d = null;
            this.e = null;
            this.h = null;
            this.f = (String) obj;
        } else if (obj instanceof Double) {
            this.d = null;
            this.e = null;
            this.h = (Double) obj;
            this.f = null;
        } else {
            throw new IllegalArgumentException("User attribute given of un-supported type");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zznb(int i, String str, long j, Long l, Float f, String str2, String str3, Double d) {
        this.a = i;
        this.b = str;
        this.c = j;
        this.d = l;
        this.e = null;
        if (i == 1) {
            this.h = f != null ? Double.valueOf(f.doubleValue()) : null;
        } else {
            this.h = d;
        }
        this.f = str2;
        this.g = str3;
    }
}
