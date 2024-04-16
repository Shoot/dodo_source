package defpackage;

import java.io.IOException;
import java.net.InetAddress;
/* compiled from: InetAddressSerializer.java */
/* renamed from: v05  reason: default package */
/* loaded from: classes2.dex */
public class v05 extends bxa<InetAddress> implements bv1 {
    protected final boolean c;

    public v05() {
        this(false);
    }

    @Override // defpackage.cxa, defpackage.gc5
    /* renamed from: G */
    public void f(InetAddress inetAddress, ua5 ua5Var, bda bdaVar) throws IOException {
        String trim;
        if (this.c) {
            trim = inetAddress.getHostAddress();
        } else {
            trim = inetAddress.toString().trim();
            int indexOf = trim.indexOf(47);
            if (indexOf >= 0) {
                if (indexOf == 0) {
                    trim = trim.substring(1);
                } else {
                    trim = trim.substring(0, indexOf);
                }
            }
        }
        ua5Var.q1(trim);
    }

    @Override // defpackage.bxa, defpackage.gc5
    /* renamed from: H */
    public void i(InetAddress inetAddress, ua5 ua5Var, bda bdaVar, bob bobVar) throws IOException {
        c9c g = bobVar.g(ua5Var, bobVar.f(inetAddress, InetAddress.class, nc5.VALUE_STRING));
        f(inetAddress, ua5Var, bdaVar);
        bobVar.h(ua5Var, g);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0025 A[RETURN] */
    @Override // defpackage.bv1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.gc5<?> a(defpackage.bda r2, defpackage.ia0 r3) throws com.fasterxml.jackson.databind.JsonMappingException {
        /*
            r1 = this;
            java.lang.Class r0 = r1.c()
            ta5$d r2 = r1.s(r2, r3, r0)
            if (r2 == 0) goto L1a
            ta5$c r2 = r2.j()
            boolean r3 = r2.a()
            if (r3 != 0) goto L18
            ta5$c r3 = defpackage.ta5.c.ARRAY
            if (r2 != r3) goto L1a
        L18:
            r2 = 1
            goto L1b
        L1a:
            r2 = 0
        L1b:
            boolean r3 = r1.c
            if (r2 == r3) goto L25
            v05 r3 = new v05
            r3.<init>(r2)
            return r3
        L25:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v05.a(bda, ia0):gc5");
    }

    public v05(boolean z) {
        super(InetAddress.class);
        this.c = z;
    }
}
