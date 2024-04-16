package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.measurement.internal.zzae;
import com.google.android.gms.measurement.internal.zzaj;
import com.google.android.gms.measurement.internal.zzbe;
import com.google.android.gms.measurement.internal.zzmh;
import com.google.android.gms.measurement.internal.zznb;
import com.google.android.gms.measurement.internal.zzo;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* renamed from: kxc  reason: default package */
/* loaded from: classes2.dex */
public abstract class kxc extends msc implements lxc {
    public kxc() {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // defpackage.msc
    protected final boolean x(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                lsc.f(parcel);
                I((zzbe) lsc.a(parcel, zzbe.CREATOR), (zzo) lsc.a(parcel, zzo.CREATOR));
                parcel2.writeNoException();
                return true;
            case 2:
                lsc.f(parcel);
                c0((zznb) lsc.a(parcel, zznb.CREATOR), (zzo) lsc.a(parcel, zzo.CREATOR));
                parcel2.writeNoException();
                return true;
            case 3:
            case 8:
            case 22:
            case 23:
            default:
                return false;
            case 4:
                lsc.f(parcel);
                p1((zzo) lsc.a(parcel, zzo.CREATOR));
                parcel2.writeNoException();
                return true;
            case 5:
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                lsc.f(parcel);
                d1((zzbe) lsc.a(parcel, zzbe.CREATOR), readString, readString2);
                parcel2.writeNoException();
                return true;
            case 6:
                lsc.f(parcel);
                W0((zzo) lsc.a(parcel, zzo.CREATOR));
                parcel2.writeNoException();
                return true;
            case 7:
                boolean h = lsc.h(parcel);
                lsc.f(parcel);
                List<zznb> C0 = C0((zzo) lsc.a(parcel, zzo.CREATOR), h);
                parcel2.writeNoException();
                parcel2.writeTypedList(C0);
                return true;
            case 9:
                String readString3 = parcel.readString();
                lsc.f(parcel);
                byte[] P = P((zzbe) lsc.a(parcel, zzbe.CREATOR), readString3);
                parcel2.writeNoException();
                parcel2.writeByteArray(P);
                return true;
            case 10:
                long readLong = parcel.readLong();
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                lsc.f(parcel);
                h0(readLong, readString4, readString5, readString6);
                parcel2.writeNoException();
                return true;
            case 11:
                lsc.f(parcel);
                String b1 = b1((zzo) lsc.a(parcel, zzo.CREATOR));
                parcel2.writeNoException();
                parcel2.writeString(b1);
                return true;
            case 12:
                lsc.f(parcel);
                j1((zzae) lsc.a(parcel, zzae.CREATOR), (zzo) lsc.a(parcel, zzo.CREATOR));
                parcel2.writeNoException();
                return true;
            case 13:
                lsc.f(parcel);
                q1((zzae) lsc.a(parcel, zzae.CREATOR));
                parcel2.writeNoException();
                return true;
            case 14:
                lsc.f(parcel);
                List<zznb> C1 = C1(parcel.readString(), parcel.readString(), lsc.h(parcel), (zzo) lsc.a(parcel, zzo.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(C1);
                return true;
            case 15:
                String readString7 = parcel.readString();
                String readString8 = parcel.readString();
                String readString9 = parcel.readString();
                boolean h2 = lsc.h(parcel);
                lsc.f(parcel);
                List<zznb> M = M(readString7, readString8, readString9, h2);
                parcel2.writeNoException();
                parcel2.writeTypedList(M);
                return true;
            case 16:
                lsc.f(parcel);
                List<zzae> D = D(parcel.readString(), parcel.readString(), (zzo) lsc.a(parcel, zzo.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(D);
                return true;
            case 17:
                String readString10 = parcel.readString();
                String readString11 = parcel.readString();
                String readString12 = parcel.readString();
                lsc.f(parcel);
                List<zzae> j0 = j0(readString10, readString11, readString12);
                parcel2.writeNoException();
                parcel2.writeTypedList(j0);
                return true;
            case 18:
                lsc.f(parcel);
                K0((zzo) lsc.a(parcel, zzo.CREATOR));
                parcel2.writeNoException();
                return true;
            case 19:
                lsc.f(parcel);
                U0((Bundle) lsc.a(parcel, Bundle.CREATOR), (zzo) lsc.a(parcel, zzo.CREATOR));
                parcel2.writeNoException();
                return true;
            case 20:
                lsc.f(parcel);
                T0((zzo) lsc.a(parcel, zzo.CREATOR));
                parcel2.writeNoException();
                return true;
            case 21:
                lsc.f(parcel);
                zzaj s0 = s0((zzo) lsc.a(parcel, zzo.CREATOR));
                parcel2.writeNoException();
                lsc.g(parcel2, s0);
                return true;
            case 24:
                lsc.f(parcel);
                List<zzmh> z0 = z0((zzo) lsc.a(parcel, zzo.CREATOR), (Bundle) lsc.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(z0);
                return true;
        }
    }
}
