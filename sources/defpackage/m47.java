package defpackage;

import com.fasterxml.jackson.databind.JsonMappingException;
import defpackage.er8;
import java.io.IOException;
import java.util.Objects;
/* compiled from: ObjectArraySerializer.java */
@o85
/* renamed from: m47  reason: default package */
/* loaded from: classes2.dex */
public class m47 extends pr<Object[]> implements bv1 {
    protected final boolean e;
    protected final y85 f;
    protected final bob g;
    protected gc5<Object> h;
    protected er8 i;

    public m47(y85 y85Var, boolean z, bob bobVar, gc5<Object> gc5Var) {
        super(Object[].class);
        this.f = y85Var;
        this.e = z;
        this.g = bobVar;
        this.i = er8.c();
        this.h = gc5Var;
    }

    @Override // defpackage.ct1
    public ct1<?> G(bob bobVar) {
        return new m47(this.f, this.e, bobVar, this.h);
    }

    @Override // defpackage.pr
    public gc5<?> L(ia0 ia0Var, Boolean bool) {
        return new m47(this, ia0Var, this.g, this.h, bool);
    }

    protected final gc5<Object> N(er8 er8Var, y85 y85Var, bda bdaVar) throws JsonMappingException {
        er8.d g = er8Var.g(y85Var, bdaVar, this.c);
        er8 er8Var2 = g.b;
        if (er8Var != er8Var2) {
            this.i = er8Var2;
        }
        return g.a;
    }

    protected final gc5<Object> P(er8 er8Var, Class<?> cls, bda bdaVar) throws JsonMappingException {
        er8.d h = er8Var.h(cls, bdaVar, this.c);
        er8 er8Var2 = h.b;
        if (er8Var != er8Var2) {
            this.i = er8Var2;
        }
        return h.a;
    }

    @Override // defpackage.gc5
    /* renamed from: Q */
    public boolean d(bda bdaVar, Object[] objArr) {
        if (objArr.length == 0) {
            return true;
        }
        return false;
    }

    @Override // defpackage.cxa, defpackage.gc5
    /* renamed from: S */
    public final void f(Object[] objArr, ua5 ua5Var, bda bdaVar) throws IOException {
        int length = objArr.length;
        if (length == 1 && ((this.d == null && bdaVar.M0(qca.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED)) || this.d == Boolean.TRUE)) {
            M(objArr, ua5Var, bdaVar);
            return;
        }
        ua5Var.f1(objArr, length);
        M(objArr, ua5Var, bdaVar);
        ua5Var.W();
    }

    @Override // defpackage.pr
    /* renamed from: T */
    public void M(Object[] objArr, ua5 ua5Var, bda bdaVar) throws IOException {
        int length = objArr.length;
        if (length == 0) {
            return;
        }
        gc5<Object> gc5Var = this.h;
        if (gc5Var != null) {
            W(objArr, ua5Var, bdaVar, gc5Var);
        } else if (this.g != null) {
            Z(objArr, ua5Var, bdaVar);
        } else {
            int i = 0;
            Object obj = null;
            try {
                er8 er8Var = this.i;
                while (i < length) {
                    obj = objArr[i];
                    if (obj == null) {
                        bdaVar.G(ua5Var);
                    } else {
                        Class<?> cls = obj.getClass();
                        gc5<Object> j = er8Var.j(cls);
                        if (j == null) {
                            if (this.f.G()) {
                                j = N(er8Var, bdaVar.w(this.f, cls), bdaVar);
                            } else {
                                j = P(er8Var, cls, bdaVar);
                            }
                        }
                        j.f(obj, ua5Var, bdaVar);
                    }
                    i++;
                }
            } catch (Exception e) {
                y(bdaVar, e, obj, i);
            }
        }
    }

    public void W(Object[] objArr, ua5 ua5Var, bda bdaVar, gc5<Object> gc5Var) throws IOException {
        int length = objArr.length;
        bob bobVar = this.g;
        Object obj = null;
        for (int i = 0; i < length; i++) {
            try {
                obj = objArr[i];
                if (obj == null) {
                    bdaVar.G(ua5Var);
                } else if (bobVar == null) {
                    gc5Var.f(obj, ua5Var, bdaVar);
                } else {
                    gc5Var.i(obj, ua5Var, bdaVar, bobVar);
                }
            } catch (Exception e) {
                y(bdaVar, e, obj, i);
                return;
            }
        }
    }

    public void Z(Object[] objArr, ua5 ua5Var, bda bdaVar) throws IOException {
        int length = objArr.length;
        bob bobVar = this.g;
        int i = 0;
        Object obj = null;
        try {
            er8 er8Var = this.i;
            while (i < length) {
                obj = objArr[i];
                if (obj == null) {
                    bdaVar.G(ua5Var);
                } else {
                    Class<?> cls = obj.getClass();
                    gc5<Object> j = er8Var.j(cls);
                    if (j == null) {
                        j = P(er8Var, cls, bdaVar);
                    }
                    j.i(obj, ua5Var, bdaVar, bobVar);
                }
                i++;
            }
        } catch (Exception e) {
            y(bdaVar, e, obj, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    @Override // defpackage.pr, defpackage.bv1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.gc5<?> a(defpackage.bda r6, defpackage.ia0 r7) throws com.fasterxml.jackson.databind.JsonMappingException {
        /*
            r5 = this;
            bob r0 = r5.g
            if (r0 == 0) goto L8
            bob r0 = r0.a(r7)
        L8:
            r1 = 0
            if (r7 == 0) goto L20
            hl r2 = r7.c()
            ql r3 = r6.j0()
            if (r2 == 0) goto L20
            java.lang.Object r3 = r3.f(r2)
            if (r3 == 0) goto L20
            gc5 r2 = r6.T0(r2, r3)
            goto L21
        L20:
            r2 = r1
        L21:
            java.lang.Class r3 = r5.c()
            ta5$d r3 = r5.s(r6, r7, r3)
            if (r3 == 0) goto L31
            ta5$a r1 = defpackage.ta5.a.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED
            java.lang.Boolean r1 = r3.e(r1)
        L31:
            if (r2 != 0) goto L35
            gc5<java.lang.Object> r2 = r5.h
        L35:
            gc5 r2 = r5.o(r6, r7, r2)
            if (r2 != 0) goto L4f
            y85 r3 = r5.f
            if (r3 == 0) goto L4f
            boolean r4 = r5.e
            if (r4 == 0) goto L4f
            boolean r3 = r3.W()
            if (r3 != 0) goto L4f
            y85 r2 = r5.f
            gc5 r2 = r6.H(r2, r7)
        L4f:
            m47 r6 = r5.b0(r7, r0, r2, r1)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m47.a(bda, ia0):gc5");
    }

    public m47 b0(ia0 ia0Var, bob bobVar, gc5<?> gc5Var, Boolean bool) {
        if (this.c == ia0Var && gc5Var == this.h && this.g == bobVar && Objects.equals(this.d, bool)) {
            return this;
        }
        return new m47(this, ia0Var, bobVar, gc5Var, bool);
    }

    public m47(m47 m47Var, ia0 ia0Var, bob bobVar, gc5<?> gc5Var, Boolean bool) {
        super(m47Var, ia0Var, bool);
        this.f = m47Var.f;
        this.g = bobVar;
        this.e = m47Var.e;
        this.i = er8.c();
        this.h = gc5Var;
    }
}
