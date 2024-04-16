package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.common.api.c;
import com.google.android.gms.common.d;
import com.google.android.gms.common.internal.c;
/* renamed from: goc  reason: default package */
/* loaded from: classes2.dex */
public final class goc extends c<soc> {
    private final Bundle I;

    public goc(Context context, Looper looper, n91 n91Var, nz nzVar, c.b bVar, c.InterfaceC0218c interfaceC0218c) {
        super(context, looper, 16, n91Var, bVar, interfaceC0218c);
        if (nzVar == null) {
            this.I = new Bundle();
            return;
        }
        throw new NoSuchMethodError();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.b
    public final String B() {
        return "com.google.android.gms.auth.api.internal.IAuthService";
    }

    @Override // com.google.android.gms.common.internal.b
    protected final String C() {
        return "com.google.android.gms.auth.service.START";
    }

    @Override // com.google.android.gms.common.internal.b, com.google.android.gms.common.api.a.f
    public final boolean f() {
        n91 g0 = g0();
        if (!TextUtils.isEmpty(g0.c()) && !g0.f(mz.c).isEmpty()) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.common.internal.b, com.google.android.gms.common.api.a.f
    public final int k() {
        return d.a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.b
    public final /* synthetic */ IInterface p(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.internal.IAuthService");
        if (queryLocalInterface instanceof soc) {
            return (soc) queryLocalInterface;
        }
        return new xoc(iBinder);
    }

    @Override // com.google.android.gms.common.internal.b
    protected final Bundle x() {
        return this.I;
    }
}
