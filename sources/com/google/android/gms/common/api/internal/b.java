package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.os.DeadObjectException;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.b;
import defpackage.tk9;
/* compiled from: com.google.android.gms:play-services-base@@18.2.0 */
/* loaded from: classes2.dex */
public abstract class b<R extends tk9, A extends a.b> extends BasePendingResult<R> implements p70<R> {
    private final a.c<A> a;
    private final com.google.android.gms.common.api.a<?> b;

    /* JADX INFO: Access modifiers changed from: protected */
    public b(@NonNull com.google.android.gms.common.api.a<?> aVar, @NonNull com.google.android.gms.common.api.c cVar) {
        super((com.google.android.gms.common.api.c) gh8.k(cVar, "GoogleApiClient must not be null"));
        gh8.k(aVar, "Api must not be null");
        this.a = aVar.b();
        this.b = aVar;
    }

    private void e(@NonNull RemoteException remoteException) {
        f(new Status(8, remoteException.getLocalizedMessage(), (PendingIntent) null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p70
    public /* bridge */ /* synthetic */ void a(@NonNull Object obj) {
        super.setResult((tk9) obj);
    }

    protected abstract void b(@NonNull A a) throws RemoteException;

    public final void d(@NonNull A a) throws DeadObjectException {
        try {
            b(a);
        } catch (DeadObjectException e) {
            e(e);
            throw e;
        } catch (RemoteException e2) {
            e(e2);
        }
    }

    public final void f(@NonNull Status status) {
        gh8.b(!status.v(), "Failed result must not be success");
        R createFailedResult = createFailedResult(status);
        setResult(createFailedResult);
        c(createFailedResult);
    }

    protected void c(@NonNull R r) {
    }
}
