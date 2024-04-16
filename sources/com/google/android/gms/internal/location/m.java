package com.google.android.gms.internal.location;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.c;
/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* loaded from: classes2.dex */
public class m extends com.google.android.gms.common.internal.c<moc> {
    private final String I;
    protected final nrc<moc> J;

    public m(Context context, Looper looper, c.b bVar, c.InterfaceC0218c interfaceC0218c, String str, n91 n91Var) {
        super(context, looper, 23, n91Var, bVar, interfaceC0218c);
        this.J = new l(this);
        this.I = str;
    }

    public static /* synthetic */ void j0(m mVar) {
        mVar.o();
    }

    @Override // com.google.android.gms.common.internal.b
    public final String B() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    @Override // com.google.android.gms.common.internal.b
    protected final String C() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    @Override // com.google.android.gms.common.internal.b, com.google.android.gms.common.api.a.f
    public final int k() {
        return 11717000;
    }

    @Override // com.google.android.gms.common.internal.b
    public final /* bridge */ /* synthetic */ IInterface p(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        if (queryLocalInterface instanceof moc) {
            return (moc) queryLocalInterface;
        }
        return new b(iBinder);
    }

    @Override // com.google.android.gms.common.internal.b
    public final Feature[] s() {
        return xad.f;
    }

    @Override // com.google.android.gms.common.internal.b
    protected final Bundle x() {
        Bundle bundle = new Bundle();
        bundle.putString("client_name", this.I);
        return bundle;
    }
}
