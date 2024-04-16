package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* compiled from: AtomicReferenceSerializer.java */
/* renamed from: vy  reason: default package */
/* loaded from: classes2.dex */
public class vy extends ha9<AtomicReference<?>> {
    public vy(ga9 ga9Var, boolean z, bob bobVar, gc5<Object> gc5Var) {
        super(ga9Var, z, bobVar, gc5Var);
    }

    @Override // defpackage.ha9
    public ha9<AtomicReference<?>> P(Object obj, boolean z) {
        return new vy(this, this.d, this.e, this.f, this.g, obj, z);
    }

    @Override // defpackage.ha9
    protected ha9<AtomicReference<?>> Q(ia0 ia0Var, bob bobVar, gc5<?> gc5Var, ps6 ps6Var) {
        return new vy(this, ia0Var, bobVar, gc5Var, ps6Var, this.i, this.j);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ha9
    /* renamed from: S */
    public Object K(AtomicReference<?> atomicReference) {
        return atomicReference.get();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ha9
    /* renamed from: T */
    public Object L(AtomicReference<?> atomicReference) {
        return atomicReference.get();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ha9
    /* renamed from: W */
    public boolean M(AtomicReference<?> atomicReference) {
        if (atomicReference.get() != null) {
            return true;
        }
        return false;
    }

    protected vy(vy vyVar, ia0 ia0Var, bob bobVar, gc5<?> gc5Var, ps6 ps6Var, Object obj, boolean z) {
        super(vyVar, ia0Var, bobVar, gc5Var, ps6Var, obj, z);
    }
}
