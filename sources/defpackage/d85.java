package defpackage;

import java.io.IOException;
import java.util.Iterator;
/* compiled from: IteratorSerializer.java */
@o85
/* renamed from: d85  reason: default package */
/* loaded from: classes2.dex */
public class d85 extends as<Iterator<?>> {
    public d85(y85 y85Var, boolean z, bob bobVar) {
        super(Iterator.class, y85Var, z, bobVar, (gc5<Object>) null);
    }

    @Override // defpackage.ct1
    public ct1<?> G(bob bobVar) {
        return new d85(this, this.d, bobVar, this.h, this.f);
    }

    protected void P(Iterator<?> it, ua5 ua5Var, bda bdaVar) throws IOException {
        gc5<Object> L;
        bob bobVar = this.g;
        er8 er8Var = this.i;
        do {
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
        } while (it.hasNext());
    }

    @Override // defpackage.gc5
    /* renamed from: Q */
    public boolean d(bda bdaVar, Iterator<?> it) {
        return !it.hasNext();
    }

    @Override // defpackage.cxa, defpackage.gc5
    /* renamed from: S */
    public final void f(Iterator<?> it, ua5 ua5Var, bda bdaVar) throws IOException {
        ua5Var.e1(it);
        M(it, ua5Var, bdaVar);
        ua5Var.W();
    }

    @Override // defpackage.as
    /* renamed from: T */
    public void M(Iterator<?> it, ua5 ua5Var, bda bdaVar) throws IOException {
        if (!it.hasNext()) {
            return;
        }
        gc5<Object> gc5Var = this.h;
        if (gc5Var == null) {
            P(it, ua5Var, bdaVar);
            return;
        }
        bob bobVar = this.g;
        do {
            Object next = it.next();
            if (next == null) {
                bdaVar.G(ua5Var);
            } else if (bobVar == null) {
                gc5Var.f(next, ua5Var, bdaVar);
            } else {
                gc5Var.i(next, ua5Var, bdaVar, bobVar);
            }
        } while (it.hasNext());
    }

    @Override // defpackage.as
    /* renamed from: W */
    public d85 N(ia0 ia0Var, bob bobVar, gc5<?> gc5Var, Boolean bool) {
        return new d85(this, ia0Var, bobVar, gc5Var, bool);
    }

    public d85(d85 d85Var, ia0 ia0Var, bob bobVar, gc5<?> gc5Var, Boolean bool) {
        super(d85Var, ia0Var, bobVar, gc5Var, bool);
    }
}
