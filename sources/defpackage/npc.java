package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-maps@@18.1.0 */
/* renamed from: npc  reason: default package */
/* loaded from: classes2.dex */
public abstract class npc extends fqc implements rpc {
    public npc() {
        super("com.google.android.gms.maps.internal.IOnMarkerDragListener");
    }

    @Override // defpackage.fqc
    protected final boolean x(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return false;
                }
                jmc C = ocd.C(parcel.readStrongBinder());
                tsc.b(parcel);
                s(C);
            } else {
                jmc C2 = ocd.C(parcel.readStrongBinder());
                tsc.b(parcel);
                e(C2);
            }
        } else {
            jmc C3 = ocd.C(parcel.readStrongBinder());
            tsc.b(parcel);
            V(C3);
        }
        parcel2.writeNoException();
        return true;
    }
}
