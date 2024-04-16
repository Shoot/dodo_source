package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* loaded from: classes2.dex */
public final class zzbc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbc> CREATOR = new k();
    final int a;
    final zzba b;
    final grc c;
    final PendingIntent d;
    final arc e;
    final ync f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbc(int i, zzba zzbaVar, IBinder iBinder, PendingIntent pendingIntent, IBinder iBinder2, IBinder iBinder3) {
        grc C;
        arc C2;
        this.a = i;
        this.b = zzbaVar;
        ync yncVar = null;
        if (iBinder == null) {
            C = null;
        } else {
            C = erc.C(iBinder);
        }
        this.c = C;
        this.d = pendingIntent;
        if (iBinder2 == null) {
            C2 = null;
        } else {
            C2 = aqc.C(iBinder2);
        }
        this.e = C2;
        if (iBinder3 != null) {
            IInterface queryLocalInterface = iBinder3.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            if (queryLocalInterface instanceof ync) {
                yncVar = (ync) queryLocalInterface;
            } else {
                yncVar = new a(iBinder3);
            }
        }
        this.f = yncVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [android.os.IBinder] */
    /* JADX WARN: Type inference failed for: r8v0, types: [grc, android.os.IBinder] */
    public static zzbc h(grc grcVar, ync yncVar) {
        if (yncVar == null) {
            yncVar = null;
        }
        return new zzbc(2, null, grcVar, null, null, yncVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [android.os.IBinder] */
    /* JADX WARN: Type inference failed for: r8v0, types: [arc, android.os.IBinder] */
    public static zzbc k(arc arcVar, ync yncVar) {
        if (yncVar == null) {
            yncVar = null;
        }
        return new zzbc(2, null, null, null, arcVar, yncVar);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        IBinder asBinder;
        IBinder asBinder2;
        int a = ys9.a(parcel);
        ys9.m(parcel, 1, this.a);
        ys9.s(parcel, 2, this.b, i, false);
        grc grcVar = this.c;
        IBinder iBinder = null;
        if (grcVar == null) {
            asBinder = null;
        } else {
            asBinder = grcVar.asBinder();
        }
        ys9.l(parcel, 3, asBinder, false);
        ys9.s(parcel, 4, this.d, i, false);
        arc arcVar = this.e;
        if (arcVar == null) {
            asBinder2 = null;
        } else {
            asBinder2 = arcVar.asBinder();
        }
        ys9.l(parcel, 5, asBinder2, false);
        ync yncVar = this.f;
        if (yncVar != null) {
            iBinder = yncVar.asBinder();
        }
        ys9.l(parcel, 6, iBinder, false);
        ys9.b(parcel, a);
    }
}
