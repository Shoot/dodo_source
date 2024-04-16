package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.b;
import com.google.android.gms.common.api.internal.d;
/* compiled from: com.google.android.gms:play-services-base@@18.2.0 */
/* loaded from: classes2.dex */
public abstract class i<A extends a.b, L> {
    private final d.a a;

    /* JADX INFO: Access modifiers changed from: protected */
    public i(@NonNull d.a<L> aVar) {
        this.a = aVar;
    }

    @NonNull
    public d.a<L> a() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void b(@NonNull A a, @NonNull a7b<Boolean> a7bVar) throws RemoteException;
}
