package defpackage;

import ch.qos.logback.core.util.FileSize;
import org.bouncycastle.crypto.DataLengthException;
/* renamed from: y94  reason: default package */
/* loaded from: classes3.dex */
public class y94 extends qya {
    private static final byte[] f = {105, 0, 114, 34, 100, -55, 4, 35, -115, 58, -37, -106, 70, -23, 42, -60, 24, -2, -84, -108, 0, -19, 7, 18, -64, -122, -36, -62, -17, 76, -87, 43};
    private final yk0 b;
    private lf5 c;
    private long d;
    private boolean e;

    public y94(xc0 xc0Var) {
        super(xc0Var);
        this.d = 0L;
        this.b = new yk0(xc0Var, xc0Var.a() * 8);
    }

    @Override // defpackage.xc0
    public int a() {
        return this.b.a();
    }

    @Override // defpackage.xc0
    public int b(byte[] bArr, int i, byte[] bArr2, int i2) throws DataLengthException, IllegalStateException {
        processBytes(bArr, i, this.b.a(), bArr2, i2);
        return this.b.a();
    }

    @Override // defpackage.qya
    protected byte c(byte b) {
        long j = this.d;
        if (j > 0 && j % FileSize.KB_COEFFICIENT == 0) {
            xc0 d = this.b.d();
            d.init(false, this.c);
            byte[] bArr = new byte[32];
            byte[] bArr2 = f;
            d.b(bArr2, 0, bArr, 0);
            d.b(bArr2, 8, bArr, 8);
            d.b(bArr2, 16, bArr, 16);
            d.b(bArr2, 24, bArr, 24);
            lf5 lf5Var = new lf5(bArr);
            this.c = lf5Var;
            d.init(true, lf5Var);
            byte[] g = this.b.g();
            d.b(g, 0, g, 0);
            this.b.init(this.e, new pq7(this.c, g));
        }
        this.d++;
        return this.b.c(b);
    }

    @Override // defpackage.xc0
    public String getAlgorithmName() {
        String algorithmName = this.b.getAlgorithmName();
        return algorithmName.substring(0, algorithmName.indexOf(47)) + "/G" + algorithmName.substring(algorithmName.indexOf(47) + 1);
    }

    @Override // defpackage.xc0
    public void init(boolean z, v71 v71Var) throws IllegalArgumentException {
        this.d = 0L;
        this.b.init(z, v71Var);
        this.e = z;
        if (v71Var instanceof pq7) {
            v71Var = ((pq7) v71Var).b();
        }
        if (v71Var instanceof qq7) {
            v71Var = ((qq7) v71Var).a();
        }
        if (v71Var instanceof rq7) {
            v71Var = ((rq7) v71Var).a();
        }
        this.c = (lf5) v71Var;
    }

    @Override // defpackage.xc0
    public void reset() {
        this.d = 0L;
        this.b.reset();
    }
}
