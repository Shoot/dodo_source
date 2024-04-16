package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* compiled from: SequentialDisposable.java */
/* renamed from: eca  reason: default package */
/* loaded from: classes3.dex */
public final class eca extends AtomicReference<z33> implements z33 {
    public eca() {
    }

    @Override // defpackage.z33
    public void a() {
        g43.k(this);
    }

    public boolean b(z33 z33Var) {
        return g43.q(this, z33Var);
    }

    public boolean c(z33 z33Var) {
        return g43.u(this, z33Var);
    }

    @Override // defpackage.z33
    public boolean i() {
        return g43.o(get());
    }

    public eca(z33 z33Var) {
        lazySet(z33Var);
    }
}
