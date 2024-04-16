package defpackage;
/* renamed from: ldc  reason: default package */
/* loaded from: classes3.dex */
public class ldc extends idc {
    private static final byte[] l = {34, 47, 36, 42, 109, 64, 64, 64, 64, 64, 64, 64, 64, 82, 16, 48};
    private static final byte[] m = {34, 47, 37, 42, 109, 64, 64, 64, 64, 64, 64, 64, 64, 82, 16, 48};
    private static final byte[] n = {35, 47, 36, 42, 109, 64, 64, 64, 64, 64, 64, 64, 64, 82, 16, 48};
    private static final byte[] o = {35, 47, 37, 42, 109, 64, 64, 64, 64, 64, 64, 64, 64, 82, 16, 48};
    private byte[] k;

    /* JADX INFO: Access modifiers changed from: protected */
    public ldc() {
        this.k = l;
    }

    private static int u(byte b, byte b2, byte b3, byte b4) {
        return ((b & 255) << 23) | ((b2 & 255) << 16) | ((b3 & 255) << 8) | (b4 & 255);
    }

    @Override // defpackage.idc, defpackage.sc6
    public sc6 a() {
        return new ldc(this);
    }

    @Override // defpackage.idc, defpackage.sc6
    public void b(sc6 sc6Var) {
        super.b(sc6Var);
        this.k = ((ldc) sc6Var).k;
    }

    @Override // defpackage.idc, defpackage.rya
    public String getAlgorithmName() {
        return "Zuc-256";
    }

    @Override // defpackage.idc
    protected int o() {
        return 625;
    }

    @Override // defpackage.idc
    protected void t(int[] iArr, byte[] bArr, byte[] bArr2) {
        if (bArr != null && bArr.length == 32) {
            if (bArr2 != null && bArr2.length == 25) {
                iArr[0] = u(bArr[0], this.k[0], bArr[21], bArr[16]);
                iArr[1] = u(bArr[1], this.k[1], bArr[22], bArr[17]);
                iArr[2] = u(bArr[2], this.k[2], bArr[23], bArr[18]);
                iArr[3] = u(bArr[3], this.k[3], bArr[24], bArr[19]);
                iArr[4] = u(bArr[4], this.k[4], bArr[25], bArr[20]);
                iArr[5] = u(bArr2[0], (byte) (this.k[5] | (bArr2[17] & 63)), bArr[5], bArr[26]);
                iArr[6] = u(bArr2[1], (byte) (this.k[6] | (bArr2[18] & 63)), bArr[6], bArr[27]);
                iArr[7] = u(bArr2[10], (byte) (this.k[7] | (bArr2[19] & 63)), bArr[7], bArr2[2]);
                iArr[8] = u(bArr[8], (byte) (this.k[8] | (bArr2[20] & 63)), bArr2[3], bArr2[11]);
                iArr[9] = u(bArr[9], (byte) ((bArr2[21] & 63) | this.k[9]), bArr2[12], bArr2[4]);
                iArr[10] = u(bArr2[5], (byte) (this.k[10] | (bArr2[22] & 63)), bArr[10], bArr[28]);
                iArr[11] = u(bArr[11], (byte) (this.k[11] | (bArr2[23] & 63)), bArr2[6], bArr2[13]);
                iArr[12] = u(bArr[12], (byte) (this.k[12] | (bArr2[24] & 63)), bArr2[7], bArr2[14]);
                iArr[13] = u(bArr[13], this.k[13], bArr2[15], bArr2[8]);
                iArr[14] = u(bArr[14], (byte) (this.k[14] | ((bArr[31] >>> 4) & 15)), bArr2[16], bArr2[9]);
                iArr[15] = u(bArr[15], (byte) (this.k[15] | (bArr[31] & 15)), bArr[30], bArr[29]);
                return;
            }
            throw new IllegalArgumentException("An IV of 25 bytes is needed");
        }
        throw new IllegalArgumentException("A key of 32 bytes is needed");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ldc(int i) {
        if (i == 32) {
            this.k = m;
        } else if (i == 64) {
            this.k = n;
        } else if (i == 128) {
            this.k = o;
        } else {
            throw new IllegalArgumentException("Unsupported length: " + i);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ldc(ldc ldcVar) {
        super(ldcVar);
    }
}
