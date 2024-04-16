package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* loaded from: classes2.dex */
public final class zzaa extends AbstractSafeParcelable implements tk9 {
    private final Status a;
    public static final zzaa b = new zzaa(Status.g);
    public static final Parcelable.Creator<zzaa> CREATOR = new qmc();

    public zzaa(Status status) {
        this.a = status;
    }

    @Override // defpackage.tk9
    public final Status d() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = ys9.a(parcel);
        ys9.s(parcel, 1, this.a, i, false);
        ys9.b(parcel, a);
    }
}
