package defpackage;

import java.util.Collection;
/* compiled from: StaticListSerializerBase.java */
/* renamed from: kwa  reason: default package */
/* loaded from: classes2.dex */
public abstract class kwa<T extends Collection<?>> extends cxa<T> implements bv1 {
    protected final Boolean c;

    /* JADX INFO: Access modifiers changed from: protected */
    public kwa(Class<?> cls) {
        super(cls, false);
        this.c = null;
    }

    public abstract gc5<?> G(ia0 ia0Var, Boolean bool);

    @Override // defpackage.gc5
    /* renamed from: H */
    public boolean d(bda bdaVar, T t) {
        if (t != null && t.size() != 0) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004b  */
    @Override // defpackage.bv1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.gc5<?> a(defpackage.bda r6, defpackage.ia0 r7) throws com.fasterxml.jackson.databind.JsonMappingException {
        /*
            r5 = this;
            r0 = 0
            if (r7 == 0) goto L18
            ql r1 = r6.j0()
            hl r2 = r7.c()
            if (r2 == 0) goto L18
            java.lang.Object r1 = r1.f(r2)
            if (r1 == 0) goto L18
            gc5 r1 = r6.T0(r2, r1)
            goto L19
        L18:
            r1 = r0
        L19:
            java.lang.Class r2 = r5.c()
            ta5$d r2 = r5.s(r6, r7, r2)
            if (r2 == 0) goto L2a
            ta5$a r3 = defpackage.ta5.a.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED
            java.lang.Boolean r2 = r2.e(r3)
            goto L2b
        L2a:
            r2 = r0
        L2b:
            gc5 r1 = r5.o(r6, r7, r1)
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            if (r1 != 0) goto L37
            gc5 r1 = r6.K(r3, r7)
        L37:
            boolean r4 = r5.x(r1)
            if (r4 == 0) goto L4b
            java.lang.Boolean r6 = r5.c
            boolean r6 = java.util.Objects.equals(r2, r6)
            if (r6 == 0) goto L46
            return r5
        L46:
            gc5 r6 = r5.G(r7, r2)
            return r6
        L4b:
            dc1 r7 = new dc1
            y85 r6 = r6.d(r3)
            r2 = 1
            r7.<init>(r6, r2, r0, r1)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kwa.a(bda, ia0):gc5");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public kwa(kwa<?> kwaVar, Boolean bool) {
        super(kwaVar);
        this.c = bool;
    }
}
