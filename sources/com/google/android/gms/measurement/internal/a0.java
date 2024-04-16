package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.Iterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes2.dex */
public final class a0 implements Iterator<String> {
    private Iterator<String> a;
    private final /* synthetic */ zzaz b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a0(zzaz zzazVar) {
        Bundle bundle;
        this.b = zzazVar;
        bundle = zzazVar.a;
        this.a = bundle.keySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ String next() {
        return this.a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }
}
