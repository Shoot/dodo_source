package defpackage;
/* renamed from: q36  reason: default package */
/* loaded from: classes3.dex */
public class q36 extends ed4 {
    private int d;
    private int e;
    private int f;
    private int g;
    private int[] h;
    private int i;

    public q36() {
        this.h = new int[16];
        reset();
    }

    private int i(int i, int i2, int i3) {
        return ((~i) & i3) | (i2 & i);
    }

    private int j(int i, int i2, int i3) {
        return (i & i3) | (i2 & (~i3));
    }

    private int k(int i, int i2, int i3) {
        return (i ^ i2) ^ i3;
    }

    private int l(int i, int i2, int i3) {
        return (i | (~i3)) ^ i2;
    }

    private void m(q36 q36Var) {
        super.d(q36Var);
        this.d = q36Var.d;
        this.e = q36Var.e;
        this.f = q36Var.f;
        this.g = q36Var.g;
        int[] iArr = q36Var.h;
        System.arraycopy(iArr, 0, this.h, 0, iArr.length);
        this.i = q36Var.i;
    }

    private int n(int i, int i2) {
        return (i >>> (32 - i2)) | (i << i2);
    }

    private void o(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >>> 8);
        bArr[i2 + 2] = (byte) (i >>> 16);
        bArr[i2 + 3] = (byte) (i >>> 24);
    }

    @Override // defpackage.sc6
    public sc6 a() {
        return new q36(this);
    }

    @Override // defpackage.sc6
    public void b(sc6 sc6Var) {
        m((q36) sc6Var);
    }

    @Override // defpackage.e23
    public int doFinal(byte[] bArr, int i) {
        e();
        o(this.d, bArr, i);
        o(this.e, bArr, i + 4);
        o(this.f, bArr, i + 8);
        o(this.g, bArr, i + 12);
        reset();
        return 16;
    }

    @Override // defpackage.ed4
    protected void f() {
        int i = this.d;
        int i2 = this.e;
        int i3 = this.f;
        int i4 = this.g;
        int n = n(((i + i(i2, i3, i4)) + this.h[0]) - 680876936, 7) + i2;
        int n2 = n(((i4 + i(n, i2, i3)) + this.h[1]) - 389564586, 12) + n;
        int n3 = n(i3 + i(n2, n, i2) + this.h[2] + 606105819, 17) + n2;
        int n4 = n(((i2 + i(n3, n2, n)) + this.h[3]) - 1044525330, 22) + n3;
        int n5 = n(((n + i(n4, n3, n2)) + this.h[4]) - 176418897, 7) + n4;
        int n6 = n(n2 + i(n5, n4, n3) + this.h[5] + 1200080426, 12) + n5;
        int n7 = n(((n3 + i(n6, n5, n4)) + this.h[6]) - 1473231341, 17) + n6;
        int n8 = n(((n4 + i(n7, n6, n5)) + this.h[7]) - 45705983, 22) + n7;
        int n9 = n(n5 + i(n8, n7, n6) + this.h[8] + 1770035416, 7) + n8;
        int n10 = n(((n6 + i(n9, n8, n7)) + this.h[9]) - 1958414417, 12) + n9;
        int n11 = n(((n7 + i(n10, n9, n8)) + this.h[10]) - 42063, 17) + n10;
        int n12 = n(((n8 + i(n11, n10, n9)) + this.h[11]) - 1990404162, 22) + n11;
        int n13 = n(n9 + i(n12, n11, n10) + this.h[12] + 1804603682, 7) + n12;
        int n14 = n(((n10 + i(n13, n12, n11)) + this.h[13]) - 40341101, 12) + n13;
        int n15 = n(((n11 + i(n14, n13, n12)) + this.h[14]) - 1502002290, 17) + n14;
        int n16 = n(n12 + i(n15, n14, n13) + this.h[15] + 1236535329, 22) + n15;
        int n17 = n(((n13 + j(n16, n15, n14)) + this.h[1]) - 165796510, 5) + n16;
        int n18 = n(((n14 + j(n17, n16, n15)) + this.h[6]) - 1069501632, 9) + n17;
        int n19 = n(n15 + j(n18, n17, n16) + this.h[11] + 643717713, 14) + n18;
        int n20 = n(((n16 + j(n19, n18, n17)) + this.h[0]) - 373897302, 20) + n19;
        int n21 = n(((n17 + j(n20, n19, n18)) + this.h[5]) - 701558691, 5) + n20;
        int n22 = n(n18 + j(n21, n20, n19) + this.h[10] + 38016083, 9) + n21;
        int n23 = n(((n19 + j(n22, n21, n20)) + this.h[15]) - 660478335, 14) + n22;
        int n24 = n(((n20 + j(n23, n22, n21)) + this.h[4]) - 405537848, 20) + n23;
        int n25 = n(n21 + j(n24, n23, n22) + this.h[9] + 568446438, 5) + n24;
        int n26 = n(((n22 + j(n25, n24, n23)) + this.h[14]) - 1019803690, 9) + n25;
        int n27 = n(((n23 + j(n26, n25, n24)) + this.h[3]) - 187363961, 14) + n26;
        int n28 = n(n24 + j(n27, n26, n25) + this.h[8] + 1163531501, 20) + n27;
        int n29 = n(((n25 + j(n28, n27, n26)) + this.h[13]) - 1444681467, 5) + n28;
        int n30 = n(((n26 + j(n29, n28, n27)) + this.h[2]) - 51403784, 9) + n29;
        int n31 = n(n27 + j(n30, n29, n28) + this.h[7] + 1735328473, 14) + n30;
        int n32 = n(((n28 + j(n31, n30, n29)) + this.h[12]) - 1926607734, 20) + n31;
        int n33 = n(((n29 + k(n32, n31, n30)) + this.h[5]) - 378558, 4) + n32;
        int n34 = n(((n30 + k(n33, n32, n31)) + this.h[8]) - 2022574463, 11) + n33;
        int n35 = n(n31 + k(n34, n33, n32) + this.h[11] + 1839030562, 16) + n34;
        int n36 = n(((n32 + k(n35, n34, n33)) + this.h[14]) - 35309556, 23) + n35;
        int n37 = n(((n33 + k(n36, n35, n34)) + this.h[1]) - 1530992060, 4) + n36;
        int n38 = n(n34 + k(n37, n36, n35) + this.h[4] + 1272893353, 11) + n37;
        int n39 = n(((n35 + k(n38, n37, n36)) + this.h[7]) - 155497632, 16) + n38;
        int n40 = n(((n36 + k(n39, n38, n37)) + this.h[10]) - 1094730640, 23) + n39;
        int n41 = n(n37 + k(n40, n39, n38) + this.h[13] + 681279174, 4) + n40;
        int n42 = n(((n38 + k(n41, n40, n39)) + this.h[0]) - 358537222, 11) + n41;
        int n43 = n(((n39 + k(n42, n41, n40)) + this.h[3]) - 722521979, 16) + n42;
        int n44 = n(n40 + k(n43, n42, n41) + this.h[6] + 76029189, 23) + n43;
        int n45 = n(((n41 + k(n44, n43, n42)) + this.h[9]) - 640364487, 4) + n44;
        int n46 = n(((n42 + k(n45, n44, n43)) + this.h[12]) - 421815835, 11) + n45;
        int n47 = n(n43 + k(n46, n45, n44) + this.h[15] + 530742520, 16) + n46;
        int n48 = n(((n44 + k(n47, n46, n45)) + this.h[2]) - 995338651, 23) + n47;
        int n49 = n(((n45 + l(n48, n47, n46)) + this.h[0]) - 198630844, 6) + n48;
        int n50 = n(n46 + l(n49, n48, n47) + this.h[7] + 1126891415, 10) + n49;
        int n51 = n(((n47 + l(n50, n49, n48)) + this.h[14]) - 1416354905, 15) + n50;
        int n52 = n(((n48 + l(n51, n50, n49)) + this.h[5]) - 57434055, 21) + n51;
        int n53 = n(n49 + l(n52, n51, n50) + this.h[12] + 1700485571, 6) + n52;
        int n54 = n(((n50 + l(n53, n52, n51)) + this.h[3]) - 1894986606, 10) + n53;
        int n55 = n(((n51 + l(n54, n53, n52)) + this.h[10]) - 1051523, 15) + n54;
        int n56 = n(((n52 + l(n55, n54, n53)) + this.h[1]) - 2054922799, 21) + n55;
        int n57 = n(n53 + l(n56, n55, n54) + this.h[8] + 1873313359, 6) + n56;
        int n58 = n(((n54 + l(n57, n56, n55)) + this.h[15]) - 30611744, 10) + n57;
        int n59 = n(((n55 + l(n58, n57, n56)) + this.h[6]) - 1560198380, 15) + n58;
        int n60 = n(n56 + l(n59, n58, n57) + this.h[13] + 1309151649, 21) + n59;
        int n61 = n(((n57 + l(n60, n59, n58)) + this.h[4]) - 145523070, 6) + n60;
        int n62 = n(((n58 + l(n61, n60, n59)) + this.h[11]) - 1120210379, 10) + n61;
        int n63 = n(n59 + l(n62, n61, n60) + this.h[2] + 718787259, 15) + n62;
        this.d += n61;
        this.e += n(((n60 + l(n63, n62, n61)) + this.h[9]) - 343485551, 21) + n63;
        this.f += n63;
        this.g += n62;
        this.i = 0;
        int i5 = 0;
        while (true) {
            int[] iArr = this.h;
            if (i5 == iArr.length) {
                return;
            }
            iArr[i5] = 0;
            i5++;
        }
    }

    @Override // defpackage.ed4
    protected void g(long j) {
        if (this.i > 14) {
            f();
        }
        int[] iArr = this.h;
        iArr[14] = (int) j;
        iArr[15] = (int) (j >>> 32);
    }

    @Override // defpackage.e23
    public String getAlgorithmName() {
        return "MD5";
    }

    @Override // defpackage.e23
    public int getDigestSize() {
        return 16;
    }

    @Override // defpackage.ed4
    protected void h(byte[] bArr, int i) {
        int[] iArr = this.h;
        int i2 = this.i;
        int i3 = i2 + 1;
        this.i = i3;
        iArr[i2] = ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        if (i3 == 16) {
            f();
        }
    }

    @Override // defpackage.ed4, defpackage.e23
    public void reset() {
        super.reset();
        this.d = 1732584193;
        this.e = -271733879;
        this.f = -1732584194;
        this.g = 271733878;
        this.i = 0;
        int i = 0;
        while (true) {
            int[] iArr = this.h;
            if (i != iArr.length) {
                iArr[i] = 0;
                i++;
            } else {
                return;
            }
        }
    }

    public q36(q36 q36Var) {
        super(q36Var);
        this.h = new int[16];
        m(q36Var);
    }
}
