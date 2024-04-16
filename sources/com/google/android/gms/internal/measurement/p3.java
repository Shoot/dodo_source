package com.google.android.gms.internal.measurement;

import java.util.Iterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
/* loaded from: classes2.dex */
public final class p3 extends v3 {
    private final /* synthetic */ n3 b;

    @Override // com.google.android.gms.internal.measurement.v3, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new o3(this.b);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private p3(n3 n3Var) {
        super(n3Var);
        this.b = n3Var;
    }
}
