package defpackage;

import java.security.SecureRandom;
/* renamed from: yq9  reason: default package */
/* loaded from: classes3.dex */
public class yq9 {
    private final SecureRandom a;
    private final ij3 b;
    private byte[] c;
    private int d;
    private int e;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: yq9$a */
    /* loaded from: classes3.dex */
    public static class a implements r72 {
        private final xc0 a;
        private final int b;
        private final byte[] c;
        private final byte[] d;
        private final int e;

        public a(xc0 xc0Var, int i, byte[] bArr, byte[] bArr2, int i2) {
            this.a = xc0Var;
            this.b = i;
            this.c = bArr;
            this.d = bArr2;
            this.e = i2;
        }

        @Override // defpackage.r72
        public wq9 a(hj3 hj3Var) {
            return new gl0(this.a, this.b, this.e, hj3Var, this.d, this.c);
        }

        @Override // defpackage.r72
        public String getAlgorithm() {
            if (this.a instanceof o62) {
                return "CTR-DRBG-3KEY-TDES";
            }
            return "CTR-DRBG-" + this.a.getAlgorithmName() + this.b;
        }
    }

    /* renamed from: yq9$b */
    /* loaded from: classes3.dex */
    private static class b implements r72 {
        private final x36 a;
        private final byte[] b;
        private final byte[] c;
        private final int d;

        public b(x36 x36Var, byte[] bArr, byte[] bArr2, int i) {
            this.a = x36Var;
            this.b = bArr;
            this.c = bArr2;
            this.d = i;
        }

        @Override // defpackage.r72
        public wq9 a(hj3 hj3Var) {
            return new sj4(this.a, this.d, hj3Var, this.c, this.b);
        }

        @Override // defpackage.r72
        public String getAlgorithm() {
            StringBuilder sb;
            String algorithmName;
            if (this.a instanceof qj4) {
                sb = new StringBuilder();
                sb.append("HMAC-DRBG-");
                algorithmName = yq9.e(((qj4) this.a).b());
            } else {
                sb = new StringBuilder();
                sb.append("HMAC-DRBG-");
                algorithmName = this.a.getAlgorithmName();
            }
            sb.append(algorithmName);
            return sb.toString();
        }
    }

    /* renamed from: yq9$c */
    /* loaded from: classes3.dex */
    private static class c implements r72 {
        private final e23 a;
        private final byte[] b;
        private final byte[] c;
        private final int d;

        public c(e23 e23Var, byte[] bArr, byte[] bArr2, int i) {
            this.a = e23Var;
            this.b = bArr;
            this.c = bArr2;
            this.d = i;
        }

        @Override // defpackage.r72
        public wq9 a(hj3 hj3Var) {
            return new zm4(this.a, this.d, hj3Var, this.c, this.b);
        }

        @Override // defpackage.r72
        public String getAlgorithm() {
            return "HASH-DRBG-" + yq9.e(this.a);
        }
    }

    public yq9(ij3 ij3Var) {
        this.d = 256;
        this.e = 256;
        this.a = null;
        this.b = ij3Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String e(e23 e23Var) {
        String algorithmName = e23Var.getAlgorithmName();
        int indexOf = algorithmName.indexOf(45);
        if (indexOf > 0 && !algorithmName.startsWith("SHA3")) {
            return algorithmName.substring(0, indexOf) + algorithmName.substring(indexOf + 1);
        }
        return algorithmName;
    }

    public xq9 b(xc0 xc0Var, int i, byte[] bArr, boolean z) {
        return new xq9(this.a, this.b.get(this.e), new a(xc0Var, i, bArr, this.c, this.d), z);
    }

    public xq9 c(x36 x36Var, byte[] bArr, boolean z) {
        return new xq9(this.a, this.b.get(this.e), new b(x36Var, bArr, this.c, this.d), z);
    }

    public xq9 d(e23 e23Var, byte[] bArr, boolean z) {
        return new xq9(this.a, this.b.get(this.e), new c(e23Var, bArr, this.c, this.d), z);
    }

    public yq9 f(int i) {
        this.e = i;
        return this;
    }

    public yq9 g(byte[] bArr) {
        this.c = tr.h(bArr);
        return this;
    }

    public yq9(SecureRandom secureRandom, boolean z) {
        this.d = 256;
        this.e = 256;
        this.a = secureRandom;
        this.b = new f90(secureRandom, z);
    }
}
