package defpackage;

import com.fasterxml.jackson.databind.JsonMappingException;
import defpackage.er8;
import java.io.IOException;
/* compiled from: AsArraySerializerBase.java */
/* renamed from: as  reason: default package */
/* loaded from: classes2.dex */
public abstract class as<T> extends ct1<T> implements bv1 {
    protected final y85 c;
    protected final ia0 d;
    protected final boolean e;
    protected final Boolean f;
    protected final bob g;
    protected final gc5<Object> h;
    protected er8 i;

    /* JADX INFO: Access modifiers changed from: protected */
    public as(Class<?> cls, y85 y85Var, boolean z, bob bobVar, gc5<Object> gc5Var) {
        this(cls, y85Var, z, bobVar, null, gc5Var, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final gc5<Object> K(er8 er8Var, y85 y85Var, bda bdaVar) throws JsonMappingException {
        er8.d g = er8Var.g(y85Var, bdaVar, this.d);
        er8 er8Var2 = g.b;
        if (er8Var != er8Var2) {
            this.i = er8Var2;
        }
        return g.a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final gc5<Object> L(er8 er8Var, Class<?> cls, bda bdaVar) throws JsonMappingException {
        er8.d h = er8Var.h(cls, bdaVar, this.d);
        er8 er8Var2 = h.b;
        if (er8Var != er8Var2) {
            this.i = er8Var2;
        }
        return h.a;
    }

    protected abstract void M(T t, ua5 ua5Var, bda bdaVar) throws IOException;

    public abstract as<T> N(ia0 ia0Var, bob bobVar, gc5<?> gc5Var, Boolean bool);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    @Override // defpackage.bv1
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
            ql r2 = r6.j0()
            hl r3 = r7.c()
            if (r3 == 0) goto L20
            java.lang.Object r2 = r2.f(r3)
            if (r2 == 0) goto L20
            gc5 r2 = r6.T0(r3, r2)
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
            y85 r3 = r5.c
            if (r3 == 0) goto L4f
            boolean r4 = r5.e
            if (r4 == 0) goto L4f
            boolean r3 = r3.W()
            if (r3 != 0) goto L4f
            y85 r2 = r5.c
            gc5 r2 = r6.H(r2, r7)
        L4f:
            gc5<java.lang.Object> r6 = r5.h
            if (r2 != r6) goto L65
            ia0 r6 = r5.d
            if (r7 != r6) goto L65
            bob r6 = r5.g
            if (r6 != r0) goto L65
            java.lang.Boolean r6 = r5.f
            boolean r6 = java.util.Objects.equals(r6, r1)
            if (r6 != 0) goto L64
            goto L65
        L64:
            return r5
        L65:
            as r6 = r5.N(r7, r0, r2, r1)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.as.a(bda, ia0):gc5");
    }

    @Override // defpackage.gc5
    public void i(T t, ua5 ua5Var, bda bdaVar, bob bobVar) throws IOException {
        c9c g = bobVar.g(ua5Var, bobVar.d(t, nc5.START_ARRAY));
        ua5Var.u(t);
        M(t, ua5Var, bdaVar);
        bobVar.h(ua5Var, g);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected as(Class<?> cls, y85 y85Var, boolean z, bob bobVar, ia0 ia0Var, gc5<?> gc5Var, Boolean bool) {
        super(cls, false);
        boolean z2 = false;
        this.c = y85Var;
        if (z || (y85Var != null && y85Var.S())) {
            z2 = true;
        }
        this.e = z2;
        this.g = bobVar;
        this.d = ia0Var;
        this.h = gc5Var;
        this.i = er8.c();
        this.f = bool;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public as(as<?> asVar, ia0 ia0Var, bob bobVar, gc5<?> gc5Var, Boolean bool) {
        super(asVar);
        this.c = asVar.c;
        this.e = asVar.e;
        this.g = bobVar;
        this.d = ia0Var;
        this.h = gc5Var;
        this.i = er8.c();
        this.f = bool;
    }
}
