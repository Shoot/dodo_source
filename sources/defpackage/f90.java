package defpackage;

import java.security.SecureRandom;
/* renamed from: f90  reason: default package */
/* loaded from: classes3.dex */
public class f90 implements ij3 {
    private final SecureRandom a;
    private final boolean b;

    /* renamed from: f90$a */
    /* loaded from: classes3.dex */
    class a implements hj3 {
        final /* synthetic */ int a;

        a(int i) {
            this.a = i;
        }

        @Override // defpackage.hj3
        public int entropySize() {
            return this.a;
        }

        @Override // defpackage.hj3
        public byte[] getEntropy() {
            if (!(f90.this.a instanceof xq9)) {
                SecureRandom unused = f90.this.a;
                return f90.this.a.generateSeed((this.a + 7) / 8);
            }
            byte[] bArr = new byte[(this.a + 7) / 8];
            f90.this.a.nextBytes(bArr);
            return bArr;
        }
    }

    public f90(SecureRandom secureRandom, boolean z) {
        this.a = secureRandom;
        this.b = z;
    }

    @Override // defpackage.ij3
    public hj3 get(int i) {
        return new a(i);
    }
}
