package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.zzo;
import com.google.android.gms.common.zzq;
import com.google.android.gms.common.zzs;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* renamed from: hnc  reason: default package */
/* loaded from: classes2.dex */
public final class hnc extends llc implements snc {
    /* JADX INFO: Access modifiers changed from: package-private */
    public hnc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
    }

    @Override // defpackage.snc
    public final boolean X0(zzs zzsVar, ns4 ns4Var) throws RemoteException {
        Parcel C = C();
        qsc.d(C, zzsVar);
        qsc.e(C, ns4Var);
        Parcel x = x(5, C);
        boolean f = qsc.f(x);
        x.recycle();
        return f;
    }

    @Override // defpackage.snc
    public final boolean i() throws RemoteException {
        Parcel x = x(7, C());
        boolean f = qsc.f(x);
        x.recycle();
        return f;
    }

    @Override // defpackage.snc
    public final zzq o1(zzo zzoVar) throws RemoteException {
        Parcel C = C();
        qsc.d(C, zzoVar);
        Parcel x = x(6, C);
        zzq zzqVar = (zzq) qsc.a(x, zzq.CREATOR);
        x.recycle();
        return zzqVar;
    }

    @Override // defpackage.snc
    public final zzq s1(zzo zzoVar) throws RemoteException {
        Parcel C = C();
        qsc.d(C, zzoVar);
        Parcel x = x(8, C);
        zzq zzqVar = (zzq) qsc.a(x, zzq.CREATOR);
        x.recycle();
        return zzqVar;
    }
}
