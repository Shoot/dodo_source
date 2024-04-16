package defpackage;

import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import org.bouncycastle.asn1.q0;
import org.bouncycastle.openssl.PEMException;
/* renamed from: nn7  reason: default package */
/* loaded from: classes3.dex */
public class nn7 extends ox7 {
    protected final Map a;

    /* renamed from: nn7$b */
    /* loaded from: classes3.dex */
    private class b implements mn7 {
        private b() {
        }

        @Override // defpackage.mn7
        public ln7 a(byte[] bArr) throws IOException {
            try {
                org.bouncycastle.asn1.p D = org.bouncycastle.asn1.p.D(bArr);
                if (D.size() == 6) {
                    org.bouncycastle.asn1.i D2 = org.bouncycastle.asn1.i.D(D.F(1));
                    org.bouncycastle.asn1.i D3 = org.bouncycastle.asn1.i.D(D.F(2));
                    org.bouncycastle.asn1.i D4 = org.bouncycastle.asn1.i.D(D.F(3));
                    org.bouncycastle.asn1.i D5 = org.bouncycastle.asn1.i.D(D.F(4));
                    org.bouncycastle.asn1.i D6 = org.bouncycastle.asn1.i.D(D.F(5));
                    org.bouncycastle.asn1.k kVar = oac.m4;
                    return new ln7(new b1b(new eb(kVar, new z72(D2.G(), D3.G(), D4.G())), D5), new dk8(new eb(kVar, new z72(D2.G(), D3.G(), D4.G())), D6));
                }
                throw new PEMException("malformed sequence in DSA private key");
            } catch (IOException e) {
                throw e;
            } catch (Exception e2) {
                throw new PEMException("problem creating DSA private key: " + e2.toString(), e2);
            }
        }
    }

    /* renamed from: nn7$c */
    /* loaded from: classes3.dex */
    private class c implements nx7 {
        private c() {
        }

        @Override // defpackage.nx7
        public Object a(lx7 lx7Var) throws IOException {
            try {
                org.bouncycastle.asn1.n z = org.bouncycastle.asn1.n.z(lx7Var.b());
                if (z instanceof org.bouncycastle.asn1.k) {
                    return org.bouncycastle.asn1.n.z(lx7Var.b());
                }
                if (z instanceof org.bouncycastle.asn1.p) {
                    return iac.w(z);
                }
                return null;
            } catch (IOException e) {
                throw e;
            } catch (Exception e2) {
                throw new PEMException("exception extracting EC named curve: " + e2.toString());
            }
        }
    }

    /* renamed from: nn7$d */
    /* loaded from: classes3.dex */
    private class d implements mn7 {
        private d() {
        }

        @Override // defpackage.mn7
        public ln7 a(byte[] bArr) throws IOException {
            try {
                mb3 t = mb3.t(org.bouncycastle.asn1.p.D(bArr));
                eb ebVar = new eb(oac.C3, t.w());
                dk8 dk8Var = new dk8(ebVar, t);
                if (t.x() != null) {
                    return new ln7(new b1b(ebVar, t.x().E()), dk8Var);
                }
                return new ln7(null, dk8Var);
            } catch (IOException e) {
                throw e;
            } catch (Exception e2) {
                throw new PEMException("problem creating EC private key: " + e2.toString(), e2);
            }
        }
    }

    /* renamed from: nn7$e */
    /* loaded from: classes3.dex */
    private class e implements nx7 {
        public e() {
        }

        @Override // defpackage.nx7
        public Object a(lx7 lx7Var) throws IOException {
            try {
                return new bo7(mh3.v(lx7Var.b()));
            } catch (Exception e) {
                throw new PEMException("problem parsing ENCRYPTED PRIVATE KEY: " + e.toString(), e);
            }
        }
    }

    /* renamed from: nn7$f */
    /* loaded from: classes3.dex */
    private class f implements nx7 {
        private final mn7 a;

        public f(mn7 mn7Var) {
            this.a = mn7Var;
        }

        @Override // defpackage.nx7
        public Object a(lx7 lx7Var) throws IOException {
            boolean z = false;
            String str = null;
            for (kx7 kx7Var : lx7Var.c()) {
                if (kx7Var.b().equals("Proc-Type") && kx7Var.c().equals("4,ENCRYPTED")) {
                    z = true;
                } else if (kx7Var.b().equals("DEK-Info")) {
                    str = kx7Var.c();
                }
            }
            byte[] b = lx7Var.b();
            try {
                if (z) {
                    StringTokenizer stringTokenizer = new StringTokenizer(str, ",");
                    return new kn7(stringTokenizer.nextToken(), org.bouncycastle.util.encoders.b.a(stringTokenizer.nextToken()), b, this.a);
                }
                return this.a.a(b);
            } catch (IOException e) {
                if (z) {
                    throw new PEMException("exception decoding - please check password and data.", e);
                }
                throw new PEMException(e.getMessage(), e);
            } catch (IllegalArgumentException e2) {
                if (z) {
                    throw new PEMException("exception decoding - please check password and data.", e2);
                }
                throw new PEMException(e2.getMessage(), e2);
            }
        }
    }

    /* renamed from: nn7$g */
    /* loaded from: classes3.dex */
    private class g implements nx7 {
        private g() {
        }

        @Override // defpackage.nx7
        public Object a(lx7 lx7Var) throws IOException {
            try {
                return new qn7(lx7Var.b());
            } catch (Exception e) {
                throw new PEMException("problem parsing certrequest: " + e.toString(), e);
            }
        }
    }

    /* renamed from: nn7$h */
    /* loaded from: classes3.dex */
    private class h implements nx7 {
        private h() {
        }

        @Override // defpackage.nx7
        public Object a(lx7 lx7Var) throws IOException {
            try {
                return lt1.t(new org.bouncycastle.asn1.h(lx7Var.b()).l());
            } catch (Exception e) {
                throw new PEMException("problem parsing PKCS7 object: " + e.toString(), e);
            }
        }
    }

    /* renamed from: nn7$i */
    /* loaded from: classes3.dex */
    private class i implements nx7 {
        public i() {
        }

        @Override // defpackage.nx7
        public Object a(lx7 lx7Var) throws IOException {
            try {
                return dk8.u(lx7Var.b());
            } catch (Exception e) {
                throw new PEMException("problem parsing PRIVATE KEY: " + e.toString(), e);
            }
        }
    }

    /* renamed from: nn7$j */
    /* loaded from: classes3.dex */
    private class j implements nx7 {
        public j() {
        }

        @Override // defpackage.nx7
        public Object a(lx7 lx7Var) throws IOException {
            return b1b.u(lx7Var.b());
        }
    }

    /* renamed from: nn7$k */
    /* loaded from: classes3.dex */
    private class k implements mn7 {
        private k() {
        }

        @Override // defpackage.mn7
        public ln7 a(byte[] bArr) throws IOException {
            try {
                org.bouncycastle.asn1.p D = org.bouncycastle.asn1.p.D(bArr);
                if (D.size() == 9) {
                    p39 w = p39.w(D);
                    q39 q39Var = new q39(w.x(), w.C());
                    eb ebVar = new eb(co7.R, q0.a);
                    return new ln7(new b1b(ebVar, q39Var), new dk8(ebVar, w));
                }
                throw new PEMException("malformed sequence in RSA private key");
            } catch (IOException e) {
                throw e;
            } catch (Exception e2) {
                throw new PEMException("problem creating RSA private key: " + e2.toString(), e2);
            }
        }
    }

    /* renamed from: nn7$l */
    /* loaded from: classes3.dex */
    private class l implements nx7 {
        public l() {
        }

        @Override // defpackage.nx7
        public Object a(lx7 lx7Var) throws IOException {
            try {
                return new b1b(new eb(co7.R, q0.a), q39.t(lx7Var.b()));
            } catch (IOException e) {
                throw e;
            } catch (Exception e2) {
                throw new PEMException("problem extracting key: " + e2.toString(), e2);
            }
        }
    }

    /* renamed from: nn7$m */
    /* loaded from: classes3.dex */
    private class m implements nx7 {
        private m() {
        }

        @Override // defpackage.nx7
        public Object a(lx7 lx7Var) throws IOException {
            return new v9c(lx7Var.b());
        }
    }

    /* renamed from: nn7$n */
    /* loaded from: classes3.dex */
    private class n implements nx7 {
        private n() {
        }

        @Override // defpackage.nx7
        public Object a(lx7 lx7Var) throws IOException {
            try {
                return new w9c(lx7Var.b());
            } catch (Exception e) {
                throw new PEMException("problem parsing cert: " + e.toString(), e);
            }
        }
    }

    /* renamed from: nn7$o */
    /* loaded from: classes3.dex */
    private class o implements nx7 {
        private o() {
        }

        @Override // defpackage.nx7
        public Object a(lx7 lx7Var) throws IOException {
            try {
                return new x9c(lx7Var.b());
            } catch (Exception e) {
                throw new PEMException("problem parsing cert: " + e.toString(), e);
            }
        }
    }

    /* renamed from: nn7$p */
    /* loaded from: classes3.dex */
    private class p implements nx7 {
        private p() {
        }

        @Override // defpackage.nx7
        public Object a(lx7 lx7Var) throws IOException {
            try {
                return new cac(lx7Var.b());
            } catch (Exception e) {
                throw new PEMException("problem parsing cert: " + e.toString(), e);
            }
        }
    }

    public nn7(Reader reader) {
        super(reader);
        HashMap hashMap = new HashMap();
        this.a = hashMap;
        hashMap.put("CERTIFICATE REQUEST", new g());
        hashMap.put("NEW CERTIFICATE REQUEST", new g());
        hashMap.put("CERTIFICATE", new o());
        hashMap.put("TRUSTED CERTIFICATE", new p());
        hashMap.put("X509 CERTIFICATE", new o());
        hashMap.put("X509 CRL", new n());
        hashMap.put("PKCS7", new h());
        hashMap.put("CMS", new h());
        hashMap.put("ATTRIBUTE CERTIFICATE", new m());
        hashMap.put("EC PARAMETERS", new c());
        hashMap.put("PUBLIC KEY", new j());
        hashMap.put("RSA PUBLIC KEY", new l());
        hashMap.put("RSA PRIVATE KEY", new f(new k()));
        hashMap.put("DSA PRIVATE KEY", new f(new b()));
        hashMap.put("EC PRIVATE KEY", new f(new d()));
        hashMap.put("ENCRYPTED PRIVATE KEY", new e());
        hashMap.put("PRIVATE KEY", new i());
    }

    public Object readObject() throws IOException {
        lx7 b2 = b();
        if (b2 != null) {
            String d2 = b2.d();
            Object obj = this.a.get(d2);
            if (obj != null) {
                return ((nx7) obj).a(b2);
            }
            throw new IOException("unrecognised object: " + d2);
        }
        return null;
    }
}
