package defpackage;

import java.io.IOException;
/* compiled from: StringArraySerializer.java */
@o85
/* renamed from: nza  reason: default package */
/* loaded from: classes2.dex */
public class nza extends pr<String[]> implements bv1 {
    private static final y85 f = rnb.S().Z(String.class);
    public static final nza g = new nza();
    protected final gc5<Object> e;

    protected nza() {
        super(String[].class);
        this.e = null;
    }

    private void S(String[] strArr, ua5 ua5Var, bda bdaVar, gc5<Object> gc5Var) throws IOException {
        for (String str : strArr) {
            if (str == null) {
                bdaVar.G(ua5Var);
            } else {
                gc5Var.f(str, ua5Var, bdaVar);
            }
        }
    }

    @Override // defpackage.pr
    public gc5<?> L(ia0 ia0Var, Boolean bool) {
        return new nza(this, ia0Var, this.e, bool);
    }

    @Override // defpackage.gc5
    /* renamed from: N */
    public boolean d(bda bdaVar, String[] strArr) {
        if (strArr.length == 0) {
            return true;
        }
        return false;
    }

    @Override // defpackage.cxa, defpackage.gc5
    /* renamed from: P */
    public final void f(String[] strArr, ua5 ua5Var, bda bdaVar) throws IOException {
        int length = strArr.length;
        if (length == 1 && ((this.d == null && bdaVar.M0(qca.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED)) || this.d == Boolean.TRUE)) {
            M(strArr, ua5Var, bdaVar);
            return;
        }
        ua5Var.f1(strArr, length);
        M(strArr, ua5Var, bdaVar);
        ua5Var.W();
    }

    @Override // defpackage.pr
    /* renamed from: Q */
    public void M(String[] strArr, ua5 ua5Var, bda bdaVar) throws IOException {
        if (strArr.length == 0) {
            return;
        }
        gc5<Object> gc5Var = this.e;
        if (gc5Var != null) {
            S(strArr, ua5Var, bdaVar, gc5Var);
            return;
        }
        for (String str : strArr) {
            if (str == null) {
                ua5Var.l0();
            } else {
                ua5Var.q1(str);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0038  */
    @Override // defpackage.pr, defpackage.bv1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.gc5<?> a(defpackage.bda r5, defpackage.ia0 r6) throws com.fasterxml.jackson.databind.JsonMappingException {
        /*
            r4 = this;
            r0 = 0
            if (r6 == 0) goto L18
            ql r1 = r5.j0()
            hl r2 = r6.c()
            if (r2 == 0) goto L18
            java.lang.Object r1 = r1.f(r2)
            if (r1 == 0) goto L18
            gc5 r1 = r5.T0(r2, r1)
            goto L19
        L18:
            r1 = r0
        L19:
            java.lang.Class<java.lang.String[]> r2 = java.lang.String[].class
            ta5$a r3 = defpackage.ta5.a.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED
            java.lang.Boolean r2 = r4.r(r5, r6, r2, r3)
            if (r1 != 0) goto L25
            gc5<java.lang.Object> r1 = r4.e
        L25:
            gc5 r1 = r4.o(r5, r6, r1)
            if (r1 != 0) goto L31
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            gc5 r1 = r5.K(r1, r6)
        L31:
            boolean r5 = r4.x(r1)
            if (r5 == 0) goto L38
            goto L39
        L38:
            r0 = r1
        L39:
            gc5<java.lang.Object> r5 = r4.e
            if (r0 != r5) goto L46
            java.lang.Boolean r5 = r4.d
            boolean r5 = java.util.Objects.equals(r2, r5)
            if (r5 == 0) goto L46
            return r4
        L46:
            nza r5 = new nza
            r5.<init>(r4, r6, r0, r2)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nza.a(bda, ia0):gc5");
    }

    public nza(nza nzaVar, ia0 ia0Var, gc5<?> gc5Var, Boolean bool) {
        super(nzaVar, ia0Var, bool);
        this.e = gc5Var;
    }

    @Override // defpackage.ct1
    public ct1<?> G(bob bobVar) {
        return this;
    }
}
