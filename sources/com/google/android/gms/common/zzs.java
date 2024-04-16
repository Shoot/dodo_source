package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes2.dex */
public final class zzs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzs> CREATOR = new u();
    private final String a;
    private final n b;
    private final boolean c;
    private final boolean d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzs(String str, n nVar, boolean z, boolean z2) {
        this.a = str;
        this.b = nVar;
        this.c = z;
        this.d = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = ys9.a(parcel);
        ys9.t(parcel, 1, this.a, false);
        n nVar = this.b;
        if (nVar == null) {
            Log.w("GoogleCertificatesQuery", "certificate binder is null");
            nVar = null;
        }
        ys9.l(parcel, 2, nVar, false);
        ys9.c(parcel, 3, this.c);
        ys9.c(parcel, 4, this.d);
        ys9.b(parcel, a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzs(String str, IBinder iBinder, boolean z, boolean z2) {
        this.a = str;
        o oVar = null;
        if (iBinder != null) {
            try {
                ns4 d = ecd.C(iBinder).d();
                byte[] bArr = d == null ? null : (byte[]) k57.T1(d);
                if (bArr != null) {
                    oVar = new o(bArr);
                } else {
                    Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
                }
            } catch (RemoteException e) {
                Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", e);
            }
        }
        this.b = oVar;
        this.c = z;
        this.d = z2;
    }
}
