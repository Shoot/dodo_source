package defpackage;

import ch.qos.logback.classic.spi.CallerData;
import defpackage.h53;
/* compiled from: Comment.java */
/* renamed from: kj1  reason: default package */
/* loaded from: classes3.dex */
public class kj1 extends io5 {
    public kj1(String str) {
        this.d = str;
    }

    private static boolean d0(String str) {
        if (str.length() > 1 && (str.startsWith("!") || str.startsWith(CallerData.NA))) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
        if (r5.l() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
        v(r3, r4, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001c, code lost:
        if (((defpackage.re3) r0).R0().c() != false) goto L9;
     */
    @Override // defpackage.kz6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void C(java.lang.Appendable r3, int r4, defpackage.h53.a r5) throws java.io.IOException {
        /*
            r2 = this;
            boolean r0 = r5.o()
            if (r0 == 0) goto L27
            int r0 = r2.T()
            if (r0 != 0) goto L1e
            kz6 r0 = r2.a
            boolean r1 = r0 instanceof defpackage.re3
            if (r1 == 0) goto L1e
            re3 r0 = (defpackage.re3) r0
            g6b r0 = r0.R0()
            boolean r0 = r0.c()
            if (r0 != 0) goto L24
        L1e:
            boolean r0 = r5.l()
            if (r0 == 0) goto L27
        L24:
            r2.v(r3, r4, r5)
        L27:
            java.lang.String r4 = "<!--"
            java.lang.Appendable r3 = r3.append(r4)
            java.lang.String r4 = r2.b0()
            java.lang.Appendable r3 = r3.append(r4)
            java.lang.String r4 = "-->"
            r3.append(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kj1.C(java.lang.Appendable, int, h53$a):void");
    }

    public wbc Z() {
        String b0 = b0();
        String substring = b0.substring(1, b0.length() - 1);
        if (d0(substring)) {
            return null;
        }
        h53 f = fr7.b().h(br7.d).f("<" + substring + ">", g());
        if (f.X0().k0().size() <= 0) {
            return null;
        }
        re3 i0 = f.X0().i0(0);
        wbc wbcVar = new wbc(uz6.b(f).g().d(i0.S0()), b0.startsWith("!"));
        wbcVar.f().p(i0.f());
        return wbcVar;
    }

    @Override // defpackage.kz6
    /* renamed from: a0 */
    public kj1 m() {
        return (kj1) super.clone();
    }

    @Override // defpackage.io5, defpackage.kz6
    public /* bridge */ /* synthetic */ String b(String str) {
        return super.b(str);
    }

    public String b0() {
        return V();
    }

    public boolean c0() {
        return d0(b0());
    }

    @Override // defpackage.io5, defpackage.kz6
    public /* bridge */ /* synthetic */ String e(String str) {
        return super.e(str);
    }

    @Override // defpackage.io5, defpackage.kz6
    public /* bridge */ /* synthetic */ String g() {
        return super.g();
    }

    @Override // defpackage.io5, defpackage.kz6
    public /* bridge */ /* synthetic */ int j() {
        return super.j();
    }

    @Override // defpackage.io5, defpackage.kz6
    public /* bridge */ /* synthetic */ kz6 p() {
        return super.p();
    }

    @Override // defpackage.kz6
    public String toString() {
        return A();
    }

    @Override // defpackage.kz6
    public String y() {
        return "#comment";
    }

    @Override // defpackage.kz6
    void D(Appendable appendable, int i, h53.a aVar) {
    }
}
