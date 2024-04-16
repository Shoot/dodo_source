package defpackage;

import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
/* compiled from: CollectionSerializer.java */
/* renamed from: dc1  reason: default package */
/* loaded from: classes2.dex */
public class dc1 extends as<Collection<?>> {
    public dc1(y85 y85Var, boolean z, bob bobVar, gc5<Object> gc5Var) {
        super(Collection.class, y85Var, z, bobVar, gc5Var);
    }

    @Override // defpackage.ct1
    public ct1<?> G(bob bobVar) {
        return new dc1(this, this.d, bobVar, this.h, this.f);
    }

    @Override // defpackage.gc5
    /* renamed from: P */
    public boolean d(bda bdaVar, Collection<?> collection) {
        return collection.isEmpty();
    }

    @Override // defpackage.cxa, defpackage.gc5
    /* renamed from: Q */
    public final void f(Collection<?> collection, ua5 ua5Var, bda bdaVar) throws IOException {
        int size = collection.size();
        if (size == 1 && ((this.f == null && bdaVar.M0(qca.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED)) || this.f == Boolean.TRUE)) {
            M(collection, ua5Var, bdaVar);
            return;
        }
        ua5Var.f1(collection, size);
        M(collection, ua5Var, bdaVar);
        ua5Var.W();
    }

    @Override // defpackage.as
    /* renamed from: S */
    public void M(Collection<?> collection, ua5 ua5Var, bda bdaVar) throws IOException {
        gc5<Object> L;
        ua5Var.u(collection);
        gc5<Object> gc5Var = this.h;
        if (gc5Var != null) {
            T(collection, ua5Var, bdaVar, gc5Var);
            return;
        }
        Iterator<?> it = collection.iterator();
        if (!it.hasNext()) {
            return;
        }
        er8 er8Var = this.i;
        bob bobVar = this.g;
        int i = 0;
        do {
            try {
                Object next = it.next();
                if (next == null) {
                    bdaVar.G(ua5Var);
                } else {
                    Class<?> cls = next.getClass();
                    gc5<Object> j = er8Var.j(cls);
                    if (j == null) {
                        if (this.c.G()) {
                            L = K(er8Var, bdaVar.w(this.c, cls), bdaVar);
                        } else {
                            L = L(er8Var, cls, bdaVar);
                        }
                        j = L;
                        er8Var = this.i;
                    }
                    if (bobVar == null) {
                        j.f(next, ua5Var, bdaVar);
                    } else {
                        j.i(next, ua5Var, bdaVar, bobVar);
                    }
                }
                i++;
            } catch (Exception e) {
                y(bdaVar, e, collection, i);
                return;
            }
        } while (it.hasNext());
    }

    public void T(Collection<?> collection, ua5 ua5Var, bda bdaVar, gc5<Object> gc5Var) throws IOException {
        Iterator<?> it = collection.iterator();
        if (it.hasNext()) {
            bob bobVar = this.g;
            int i = 0;
            do {
                Object next = it.next();
                if (next == null) {
                    try {
                        bdaVar.G(ua5Var);
                    } catch (Exception e) {
                        y(bdaVar, e, collection, i);
                    }
                } else if (bobVar == null) {
                    gc5Var.f(next, ua5Var, bdaVar);
                } else {
                    gc5Var.i(next, ua5Var, bdaVar, bobVar);
                }
                i++;
            } while (it.hasNext());
        }
    }

    @Override // defpackage.as
    /* renamed from: W */
    public dc1 N(ia0 ia0Var, bob bobVar, gc5<?> gc5Var, Boolean bool) {
        return new dc1(this, ia0Var, bobVar, gc5Var, bool);
    }

    public dc1(dc1 dc1Var, ia0 ia0Var, bob bobVar, gc5<?> gc5Var, Boolean bool) {
        super(dc1Var, ia0Var, bobVar, gc5Var, bool);
    }
}
