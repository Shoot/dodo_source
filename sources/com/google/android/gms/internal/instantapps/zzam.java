package com.google.android.gms.internal.instantapps;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: com.google.android.gms:play-services-instantapps@@17.0.1 */
/* loaded from: classes2.dex */
public final class zzam extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzam> CREATOR = new noc();
    private final String[] a;
    private final String[] b;
    private final String[] c;
    private final String[] d;

    public zzam(String[] strArr, String[] strArr2, String[] strArr3, String[] strArr4) {
        this.a = strArr;
        this.b = strArr2;
        this.d = strArr3;
        this.c = strArr4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = ys9.a(parcel);
        ys9.u(parcel, 1, this.a, false);
        ys9.u(parcel, 2, this.b, false);
        ys9.u(parcel, 3, this.c, false);
        ys9.u(parcel, 4, this.d, false);
        ys9.b(parcel, a);
    }
}
