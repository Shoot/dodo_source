package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
/* compiled from: com.google.android.gms:play-services-base@@18.2.0 */
/* loaded from: classes2.dex */
public final class h0 extends hjc {
    private final h b;
    private final a7b c;
    private final rwa d;

    public h0(int i, h hVar, a7b a7bVar, rwa rwaVar) {
        super(i);
        this.c = a7bVar;
        this.b = hVar;
        this.d = rwaVar;
        if (i == 2 && hVar.c()) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // com.google.android.gms.common.api.internal.j0
    public final void a(@NonNull Status status) {
        this.c.d(this.d.a(status));
    }

    @Override // com.google.android.gms.common.api.internal.j0
    public final void b(@NonNull Exception exc) {
        this.c.d(exc);
    }

    @Override // com.google.android.gms.common.api.internal.j0
    public final void c(t tVar) throws DeadObjectException {
        try {
            this.b.b(tVar.s(), this.c);
        } catch (DeadObjectException e) {
            throw e;
        } catch (RemoteException e2) {
            a(j0.e(e2));
        } catch (RuntimeException e3) {
            this.c.d(e3);
        }
    }

    @Override // com.google.android.gms.common.api.internal.j0
    public final void d(@NonNull l lVar, boolean z) {
        lVar.d(this.c, z);
    }

    @Override // defpackage.hjc
    public final boolean f(t tVar) {
        return this.b.c();
    }

    @Override // defpackage.hjc
    public final Feature[] g(t tVar) {
        return this.b.e();
    }
}
