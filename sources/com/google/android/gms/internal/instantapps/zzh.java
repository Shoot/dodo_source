package com.google.android.gms.internal.instantapps;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
/* compiled from: com.google.android.gms:play-services-instantapps@@17.0.1 */
/* loaded from: classes2.dex */
public final class zzh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzh> CREATOR = new w0d();
    private final String a;
    private final String b;
    private final String[] c;
    private final int[] d;
    private final int e;
    private final byte[] f;
    private final boolean g;

    public zzh(String str, String str2, String[] strArr, int[] iArr, int i, byte[] bArr, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = strArr;
        this.d = iArr;
        this.e = i;
        this.f = bArr;
        this.g = z;
    }

    private static int h(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzh) {
            zzh zzhVar = (zzh) obj;
            if (this.a.equals(zzhVar.a) && this.g == zzhVar.g && this.b.equals(zzhVar.b) && this.e == zzhVar.e && Arrays.equals(this.f, zzhVar.f) && Arrays.equals(this.c, zzhVar.c) && Arrays.equals(this.d, zzhVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((h(this.a) * 961) + h(Boolean.valueOf(this.g))) * 31) + h(this.b)) * 31) + h(Integer.valueOf(this.e))) * 31) + Arrays.hashCode(this.c)) * 31) + Arrays.hashCode(this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = ys9.a(parcel);
        ys9.t(parcel, 2, this.a, false);
        ys9.t(parcel, 4, this.b, false);
        ys9.u(parcel, 5, this.c, false);
        ys9.m(parcel, 6, this.e);
        ys9.g(parcel, 7, this.f, false);
        ys9.n(parcel, 8, this.d, false);
        ys9.c(parcel, 9, this.g);
        ys9.b(parcel, a);
    }
}
