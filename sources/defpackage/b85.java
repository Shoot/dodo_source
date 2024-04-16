package defpackage;

import java.io.IOException;
import java.util.Iterator;
/* compiled from: IterableSerializer.java */
@o85
/* renamed from: b85  reason: default package */
/* loaded from: classes2.dex */
public class b85 extends as<Iterable<?>> {
    public b85(y85 y85Var, boolean z, bob bobVar) {
        super(Iterable.class, y85Var, z, bobVar, (gc5<Object>) null);
    }

    @Override // defpackage.ct1
    public ct1<?> G(bob bobVar) {
        return new b85(this, this.d, bobVar, this.h, this.f);
    }

    public boolean P(Iterable<?> iterable) {
        if (iterable != null) {
            Iterator<?> it = iterable.iterator();
            if (it.hasNext()) {
                it.next();
                if (!it.hasNext()) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override // defpackage.gc5
    /* renamed from: Q */
    public boolean d(bda bdaVar, Iterable<?> iterable) {
        return !iterable.iterator().hasNext();
    }

    @Override // defpackage.cxa, defpackage.gc5
    /* renamed from: S */
    public final void f(Iterable<?> iterable, ua5 ua5Var, bda bdaVar) throws IOException {
        if (((this.f == null && bdaVar.M0(qca.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED)) || this.f == Boolean.TRUE) && P(iterable)) {
            M(iterable, ua5Var, bdaVar);
            return;
        }
        ua5Var.e1(iterable);
        M(iterable, ua5Var, bdaVar);
        ua5Var.W();
    }

    @Override // defpackage.as
    /* renamed from: T */
    public void M(Iterable<?> iterable, ua5 ua5Var, bda bdaVar) throws IOException {
        gc5<Object> gc5Var;
        Iterator<?> it = iterable.iterator();
        if (it.hasNext()) {
            bob bobVar = this.g;
            Class<?> cls = null;
            gc5<Object> gc5Var2 = null;
            do {
                Object next = it.next();
                if (next == null) {
                    bdaVar.G(ua5Var);
                } else {
                    gc5<Object> gc5Var3 = this.h;
                    if (gc5Var3 == null) {
                        Class<?> cls2 = next.getClass();
                        if (cls2 != cls) {
                            gc5Var2 = bdaVar.f0(cls2, this.d);
                            cls = cls2;
                        }
                        gc5Var = gc5Var2;
                    } else {
                        gc5Var = gc5Var2;
                        gc5Var2 = gc5Var3;
                    }
                    if (bobVar == null) {
                        gc5Var2.f(next, ua5Var, bdaVar);
                    } else {
                        gc5Var2.i(next, ua5Var, bdaVar, bobVar);
                    }
                    gc5Var2 = gc5Var;
                }
            } while (it.hasNext());
        }
    }

    @Override // defpackage.as
    /* renamed from: W */
    public b85 N(ia0 ia0Var, bob bobVar, gc5<?> gc5Var, Boolean bool) {
        return new b85(this, ia0Var, bobVar, gc5Var, bool);
    }

    public b85(b85 b85Var, ia0 ia0Var, bob bobVar, gc5<?> gc5Var, Boolean bool) {
        super(b85Var, ia0Var, bobVar, gc5Var, bool);
    }
}
