package com.google.android.gms.internal.location;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* loaded from: classes2.dex */
public final class zzl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzl> CREATOR = new o();
    final int a;
    final zzj b;
    final tpc c;
    final ync d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzl(int i, zzj zzjVar, IBinder iBinder, IBinder iBinder2) {
        tpc C;
        this.a = i;
        this.b = zzjVar;
        ync yncVar = null;
        if (iBinder == null) {
            C = null;
        } else {
            C = qpc.C(iBinder);
        }
        this.c = C;
        if (iBinder2 != null) {
            IInterface queryLocalInterface = iBinder2.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            if (queryLocalInterface instanceof ync) {
                yncVar = (ync) queryLocalInterface;
            } else {
                yncVar = new a(iBinder2);
            }
        }
        this.d = yncVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        IBinder asBinder;
        int a = ys9.a(parcel);
        ys9.m(parcel, 1, this.a);
        ys9.s(parcel, 2, this.b, i, false);
        tpc tpcVar = this.c;
        IBinder iBinder = null;
        if (tpcVar == null) {
            asBinder = null;
        } else {
            asBinder = tpcVar.asBinder();
        }
        ys9.l(parcel, 3, asBinder, false);
        ync yncVar = this.d;
        if (yncVar != null) {
            iBinder = yncVar.asBinder();
        }
        ys9.l(parcel, 4, iBinder, false);
        ys9.b(parcel, a);
    }
}
