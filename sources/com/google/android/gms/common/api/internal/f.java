package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.b;
import com.google.android.gms.common.api.internal.d;
/* compiled from: com.google.android.gms:play-services-base@@18.2.0 */
/* loaded from: classes2.dex */
public abstract class f<A extends a.b, L> {
    private final d a;
    private final Feature[] b;
    private final boolean c;
    private final int d;

    /* JADX INFO: Access modifiers changed from: protected */
    public f(@NonNull d<L> dVar, Feature[] featureArr, boolean z, int i) {
        this.a = dVar;
        this.b = featureArr;
        this.c = z;
        this.d = i;
    }

    public void a() {
        this.a.a();
    }

    public d.a<L> b() {
        return this.a.b();
    }

    public Feature[] c() {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void d(@NonNull A a, @NonNull a7b<Void> a7bVar) throws RemoteException;

    public final int e() {
        return this.d;
    }

    public final boolean f() {
        return this.c;
    }
}
