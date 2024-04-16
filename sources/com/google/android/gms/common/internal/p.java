package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.b;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes2.dex */
public final class p extends j {
    public final IBinder g;
    final /* synthetic */ b h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(b bVar, int i, IBinder iBinder, Bundle bundle) {
        super(bVar, i, bundle);
        this.h = bVar;
        this.g = iBinder;
    }

    @Override // com.google.android.gms.common.internal.j
    protected final void f(ConnectionResult connectionResult) {
        if (this.h.v != null) {
            this.h.v.C(connectionResult);
        }
        this.h.I(connectionResult);
    }

    @Override // com.google.android.gms.common.internal.j
    protected final boolean g() {
        b.a aVar;
        b.a aVar2;
        try {
            IBinder iBinder = this.g;
            gh8.j(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            if (!this.h.B().equals(interfaceDescriptor)) {
                String B = this.h.B();
                Log.w("GmsClient", "service descriptor mismatch: " + B + " vs. " + interfaceDescriptor);
                return false;
            }
            IInterface p = this.h.p(this.g);
            if (p != null && (b.d0(this.h, 2, 4, p) || b.d0(this.h, 3, 4, p))) {
                this.h.z = null;
                Bundle u = this.h.u();
                b bVar = this.h;
                aVar = bVar.u;
                if (aVar != null) {
                    aVar2 = bVar.u;
                    aVar2.x(u);
                    return true;
                }
                return true;
            }
            return false;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }
}
