package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.c;
import com.google.android.gms.common.internal.c;
import defpackage.kz;
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
/* renamed from: a9d  reason: default package */
/* loaded from: classes2.dex */
public final class a9d extends c<vbd> {
    private final kz.a I;

    public a9d(Context context, Looper looper, n91 n91Var, kz.a aVar, c.b bVar, c.InterfaceC0218c interfaceC0218c) {
        super(context, looper, 68, n91Var, bVar, interfaceC0218c);
        this.I = new kz.a.C0420a(aVar == null ? kz.a.d : aVar).a(brc.a()).b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.b
    public final String B() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    @Override // com.google.android.gms.common.internal.b
    protected final String C() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }

    @Override // com.google.android.gms.common.internal.b, com.google.android.gms.common.api.a.f
    public final int k() {
        return 12800000;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.b
    public final /* synthetic */ IInterface p(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        if (queryLocalInterface instanceof vbd) {
            return (vbd) queryLocalInterface;
        }
        return new nbd(iBinder);
    }

    @Override // com.google.android.gms.common.internal.b
    protected final Bundle x() {
        return this.I.b();
    }
}
