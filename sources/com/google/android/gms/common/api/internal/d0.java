package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-base@@18.2.0 */
/* loaded from: classes2.dex */
public abstract class d0 extends hjc {
    protected final a7b b;

    public d0(int i, a7b a7bVar) {
        super(i);
        this.b = a7bVar;
    }

    @Override // com.google.android.gms.common.api.internal.j0
    public final void a(@NonNull Status status) {
        this.b.d(new ApiException(status));
    }

    @Override // com.google.android.gms.common.api.internal.j0
    public final void b(@NonNull Exception exc) {
        this.b.d(exc);
    }

    @Override // com.google.android.gms.common.api.internal.j0
    public final void c(t tVar) throws DeadObjectException {
        try {
            h(tVar);
        } catch (DeadObjectException e) {
            a(j0.e(e));
            throw e;
        } catch (RemoteException e2) {
            a(j0.e(e2));
        } catch (RuntimeException e3) {
            this.b.d(e3);
        }
    }

    protected abstract void h(t tVar) throws RemoteException;
}
