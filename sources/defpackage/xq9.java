package defpackage;

import java.security.SecureRandom;
/* renamed from: xq9  reason: default package */
/* loaded from: classes3.dex */
public class xq9 extends SecureRandom {
    private final r72 a;
    private final boolean b;
    private final SecureRandom c;
    private final hj3 d;
    private wq9 e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public xq9(SecureRandom secureRandom, hj3 hj3Var, r72 r72Var, boolean z) {
        this.c = secureRandom;
        this.d = hj3Var;
        this.a = r72Var;
        this.b = z;
    }

    public void a(byte[] bArr) {
        synchronized (this) {
            try {
                if (this.e == null) {
                    this.e = this.a.a(this.d);
                }
                this.e.b(bArr);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.security.SecureRandom
    public byte[] generateSeed(int i) {
        return jj3.a(this.d, i);
    }

    @Override // java.security.SecureRandom
    public String getAlgorithm() {
        return this.a.getAlgorithm();
    }

    @Override // java.security.SecureRandom, java.util.Random
    public void nextBytes(byte[] bArr) {
        synchronized (this) {
            try {
                if (this.e == null) {
                    this.e = this.a.a(this.d);
                }
                if (this.e.a(bArr, null, this.b) < 0) {
                    this.e.b(null);
                    this.e.a(bArr, null, this.b);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.security.SecureRandom, java.util.Random
    public void setSeed(long j) {
        synchronized (this) {
            try {
                SecureRandom secureRandom = this.c;
                if (secureRandom != null) {
                    secureRandom.setSeed(j);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.security.SecureRandom
    public void setSeed(byte[] bArr) {
        synchronized (this) {
            try {
                SecureRandom secureRandom = this.c;
                if (secureRandom != null) {
                    secureRandom.setSeed(bArr);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
