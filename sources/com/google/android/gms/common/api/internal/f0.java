package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Status;
/* compiled from: com.google.android.gms:play-services-base@@18.2.0 */
/* loaded from: classes2.dex */
public final class f0 extends j0 {
    protected final b b;

    public f0(int i, b bVar) {
        super(i);
        this.b = (b) gh8.k(bVar, "Null methods are not runnable.");
    }

    @Override // com.google.android.gms.common.api.internal.j0
    public final void a(@NonNull Status status) {
        try {
            this.b.f(status);
        } catch (IllegalStateException e) {
            Log.w("ApiCallRunner", "Exception reporting failure", e);
        }
    }

    @Override // com.google.android.gms.common.api.internal.j0
    public final void b(@NonNull Exception exc) {
        String simpleName = exc.getClass().getSimpleName();
        String localizedMessage = exc.getLocalizedMessage();
        try {
            this.b.f(new Status(10, simpleName + ": " + localizedMessage));
        } catch (IllegalStateException e) {
            Log.w("ApiCallRunner", "Exception reporting failure", e);
        }
    }

    @Override // com.google.android.gms.common.api.internal.j0
    public final void c(t tVar) throws DeadObjectException {
        try {
            this.b.d(tVar.s());
        } catch (RuntimeException e) {
            b(e);
        }
    }

    @Override // com.google.android.gms.common.api.internal.j0
    public final void d(@NonNull l lVar, boolean z) {
        lVar.c(this.b, z);
    }
}
