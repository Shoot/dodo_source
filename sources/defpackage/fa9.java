package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* compiled from: ReferenceDisposable.java */
/* renamed from: fa9  reason: default package */
/* loaded from: classes3.dex */
abstract class fa9<T> extends AtomicReference<T> implements z33 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public fa9(T t) {
        super(x47.e(t, "value is null"));
    }

    @Override // defpackage.z33
    public final void a() {
        T andSet;
        if (get() != null && (andSet = getAndSet(null)) != null) {
            b(andSet);
        }
    }

    protected abstract void b(T t);

    @Override // defpackage.z33
    public final boolean i() {
        if (get() == null) {
            return true;
        }
        return false;
    }
}
