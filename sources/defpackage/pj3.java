package defpackage;

import java.io.IOException;
import java.util.EnumSet;
import java.util.Iterator;
/* compiled from: EnumSetSerializer.java */
/* renamed from: pj3  reason: default package */
/* loaded from: classes2.dex */
public class pj3 extends as<EnumSet<? extends Enum<?>>> {
    public pj3(y85 y85Var) {
        super((Class<?>) EnumSet.class, y85Var, true, (bob) null, (gc5<Object>) null);
    }

    @Override // defpackage.gc5
    /* renamed from: Q */
    public boolean d(bda bdaVar, EnumSet<? extends Enum<?>> enumSet) {
        return enumSet.isEmpty();
    }

    @Override // defpackage.cxa, defpackage.gc5
    /* renamed from: S */
    public final void f(EnumSet<? extends Enum<?>> enumSet, ua5 ua5Var, bda bdaVar) throws IOException {
        int size = enumSet.size();
        if (size == 1 && ((this.f == null && bdaVar.M0(qca.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED)) || this.f == Boolean.TRUE)) {
            M(enumSet, ua5Var, bdaVar);
            return;
        }
        ua5Var.f1(enumSet, size);
        M(enumSet, ua5Var, bdaVar);
        ua5Var.W();
    }

    @Override // defpackage.as
    /* renamed from: T */
    public void M(EnumSet<? extends Enum<?>> enumSet, ua5 ua5Var, bda bdaVar) throws IOException {
        gc5<Object> gc5Var = this.h;
        Iterator<E> it = enumSet.iterator();
        while (it.hasNext()) {
            Enum r1 = (Enum) it.next();
            if (gc5Var == null) {
                gc5Var = bdaVar.K(r1.getDeclaringClass(), this.d);
            }
            gc5Var.f(r1, ua5Var, bdaVar);
        }
    }

    @Override // defpackage.as
    /* renamed from: W */
    public pj3 N(ia0 ia0Var, bob bobVar, gc5<?> gc5Var, Boolean bool) {
        return new pj3(this, ia0Var, bobVar, gc5Var, bool);
    }

    public pj3(pj3 pj3Var, ia0 ia0Var, bob bobVar, gc5<?> gc5Var, Boolean bool) {
        super(pj3Var, ia0Var, bobVar, gc5Var, bool);
    }

    @Override // defpackage.ct1
    /* renamed from: P */
    public pj3 G(bob bobVar) {
        return this;
    }
}
