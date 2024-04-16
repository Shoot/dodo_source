package defpackage;

import java.io.IOException;
import java.util.List;
/* compiled from: IndexedListSerializer.java */
@o85
/* renamed from: k05  reason: default package */
/* loaded from: classes2.dex */
public final class k05 extends as<List<?>> {
    public k05(y85 y85Var, boolean z, bob bobVar, gc5<Object> gc5Var) {
        super(List.class, y85Var, z, bobVar, gc5Var);
    }

    @Override // defpackage.ct1
    public ct1<?> G(bob bobVar) {
        return new k05(this, this.d, bobVar, this.h, this.f);
    }

    @Override // defpackage.gc5
    /* renamed from: P */
    public boolean d(bda bdaVar, List<?> list) {
        return list.isEmpty();
    }

    @Override // defpackage.cxa, defpackage.gc5
    /* renamed from: Q */
    public final void f(List<?> list, ua5 ua5Var, bda bdaVar) throws IOException {
        int size = list.size();
        if (size == 1 && ((this.f == null && bdaVar.M0(qca.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED)) || this.f == Boolean.TRUE)) {
            M(list, ua5Var, bdaVar);
            return;
        }
        ua5Var.f1(list, size);
        M(list, ua5Var, bdaVar);
        ua5Var.W();
    }

    @Override // defpackage.as
    /* renamed from: S */
    public void M(List<?> list, ua5 ua5Var, bda bdaVar) throws IOException {
        gc5<Object> L;
        gc5<Object> gc5Var = this.h;
        if (gc5Var != null) {
            T(list, ua5Var, bdaVar, gc5Var);
        } else if (this.g != null) {
            W(list, ua5Var, bdaVar);
        } else {
            int size = list.size();
            if (size == 0) {
                return;
            }
            int i = 0;
            try {
                er8 er8Var = this.i;
                while (i < size) {
                    Object obj = list.get(i);
                    if (obj == null) {
                        bdaVar.G(ua5Var);
                    } else {
                        Class<?> cls = obj.getClass();
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
                        j.f(obj, ua5Var, bdaVar);
                    }
                    i++;
                }
            } catch (Exception e) {
                y(bdaVar, e, list, i);
            }
        }
    }

    public void T(List<?> list, ua5 ua5Var, bda bdaVar, gc5<Object> gc5Var) throws IOException {
        int size = list.size();
        if (size == 0) {
            return;
        }
        bob bobVar = this.g;
        for (int i = 0; i < size; i++) {
            Object obj = list.get(i);
            if (obj == null) {
                try {
                    bdaVar.G(ua5Var);
                } catch (Exception e) {
                    y(bdaVar, e, list, i);
                }
            } else if (bobVar == null) {
                gc5Var.f(obj, ua5Var, bdaVar);
            } else {
                gc5Var.i(obj, ua5Var, bdaVar, bobVar);
            }
        }
    }

    public void W(List<?> list, ua5 ua5Var, bda bdaVar) throws IOException {
        gc5<Object> L;
        int size = list.size();
        if (size == 0) {
            return;
        }
        int i = 0;
        try {
            bob bobVar = this.g;
            er8 er8Var = this.i;
            while (i < size) {
                Object obj = list.get(i);
                if (obj == null) {
                    bdaVar.G(ua5Var);
                } else {
                    Class<?> cls = obj.getClass();
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
                    j.i(obj, ua5Var, bdaVar, bobVar);
                }
                i++;
            }
        } catch (Exception e) {
            y(bdaVar, e, list, i);
        }
    }

    @Override // defpackage.as
    /* renamed from: Z */
    public k05 N(ia0 ia0Var, bob bobVar, gc5<?> gc5Var, Boolean bool) {
        return new k05(this, ia0Var, bobVar, gc5Var, bool);
    }

    public k05(k05 k05Var, ia0 ia0Var, bob bobVar, gc5<?> gc5Var, Boolean bool) {
        super(k05Var, ia0Var, bobVar, gc5Var, bool);
    }
}
