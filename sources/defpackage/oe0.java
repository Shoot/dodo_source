package defpackage;

import com.fasterxml.jackson.databind.JsonMappingException;
import defpackage.ta5;
import java.io.IOException;
/* compiled from: BooleanSerializer.java */
@o85
/* renamed from: oe0  reason: default package */
/* loaded from: classes2.dex */
public final class oe0 extends bxa<Object> implements bv1 {
    protected final boolean c;

    /* compiled from: BooleanSerializer.java */
    /* renamed from: oe0$a */
    /* loaded from: classes2.dex */
    static final class a extends bxa<Object> implements bv1 {
        protected final boolean c;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public a(boolean r3) {
            /*
                r2 = this;
                if (r3 == 0) goto L5
                java.lang.Class r0 = java.lang.Boolean.TYPE
                goto L7
            L5:
                java.lang.Class<java.lang.Boolean> r0 = java.lang.Boolean.class
            L7:
                r1 = 0
                r2.<init>(r0, r1)
                r2.c = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.oe0.a.<init>(boolean):void");
        }

        @Override // defpackage.bv1
        public gc5<?> a(bda bdaVar, ia0 ia0Var) throws JsonMappingException {
            ta5.d s = s(bdaVar, ia0Var, Boolean.class);
            if (s != null && !s.j().a()) {
                return new oe0(this.c);
            }
            return this;
        }

        @Override // defpackage.cxa, defpackage.gc5
        public void f(Object obj, ua5 ua5Var, bda bdaVar) throws IOException {
            ua5Var.o0(!Boolean.FALSE.equals(obj));
        }

        @Override // defpackage.bxa, defpackage.gc5
        public final void i(Object obj, ua5 ua5Var, bda bdaVar, bob bobVar) throws IOException {
            ua5Var.T(Boolean.TRUE.equals(obj));
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public oe0(boolean r3) {
        /*
            r2 = this;
            if (r3 == 0) goto L5
            java.lang.Class r0 = java.lang.Boolean.TYPE
            goto L7
        L5:
            java.lang.Class<java.lang.Boolean> r0 = java.lang.Boolean.class
        L7:
            r1 = 0
            r2.<init>(r0, r1)
            r2.c = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oe0.<init>(boolean):void");
    }

    @Override // defpackage.bv1
    public gc5<?> a(bda bdaVar, ia0 ia0Var) throws JsonMappingException {
        ta5.d s = s(bdaVar, ia0Var, c());
        if (s != null) {
            ta5.c j = s.j();
            if (j.a()) {
                return new a(this.c);
            }
            if (j == ta5.c.STRING) {
                return new uhb(this.a);
            }
        }
        return this;
    }

    @Override // defpackage.cxa, defpackage.gc5
    public void f(Object obj, ua5 ua5Var, bda bdaVar) throws IOException {
        ua5Var.T(Boolean.TRUE.equals(obj));
    }

    @Override // defpackage.bxa, defpackage.gc5
    public final void i(Object obj, ua5 ua5Var, bda bdaVar, bob bobVar) throws IOException {
        ua5Var.T(Boolean.TRUE.equals(obj));
    }
}
