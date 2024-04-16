package defpackage;

import org.bouncycastle.util.MemoableResetException;
/* renamed from: hq9  reason: default package */
/* loaded from: classes3.dex */
public class hq9 extends ky5 {
    private int p;
    private long q;
    private long r;
    private long s;
    private long t;
    private long u;
    private long v;
    private long w;
    private long x;

    public hq9(int i) {
        if (i >= 512) {
            throw new IllegalArgumentException("bitLength cannot be >= 512");
        }
        if (i % 8 != 0) {
            throw new IllegalArgumentException("bitLength needs to be a multiple of 8");
        }
        if (i == 384) {
            throw new IllegalArgumentException("bitLength cannot be 384 use SHA384 instead");
        }
        int i2 = i / 8;
        this.p = i2;
        r(i2 * 8);
        reset();
    }

    private static void p(int i, byte[] bArr, int i2, int i3) {
        int min = Math.min(4, i3);
        while (true) {
            min--;
            if (min >= 0) {
                bArr[i2 + min] = (byte) (i >>> ((3 - min) * 8));
            } else {
                return;
            }
        }
    }

    private static void q(long j, byte[] bArr, int i, int i2) {
        if (i2 > 0) {
            p((int) (j >>> 32), bArr, i, i2);
            if (i2 > 4) {
                p((int) (j & 4294967295L), bArr, i + 4, i2 - 4);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x007f, code lost:
        if (r4 > 10) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void r(int r4) {
        /*
            r3 = this;
            r0 = -3482333909917012819(0xcfac43c256196cad, double:-6.392239886847908E75)
            r3.e = r0
            r0 = 2216346199247487646(0x1ec20b20216f029e, double:1.604250256667292E-160)
            r3.f = r0
            r0 = -7364697282686394994(0x99cb56d75b315d8e, double:-2.0106609494103695E-184)
            r3.g = r0
            r0 = 65953792586715988(0xea509ffab89354, double:2.9978976005667514E-304)
            r3.h = r0
            r0 = -816286391624063116(0xf4abf7da08432774, double:-1.0252515228978657E254)
            r3.i = r0
            r0 = 4512832404995164602(0x3ea0cd298e9bc9ba, double:5.007211971427005E-7)
            r3.j = r0
            r0 = -5033199132376557362(0xba267c0e5ee418ce, double:-1.418977391716189E-28)
            r3.k = r0
            r0 = -124578254951840548(0xfe4568bcb6db84dc, double:-1.7921927020935902E300)
            r3.l = r0
            r0 = 83
            r3.update(r0)
            r0 = 72
            r3.update(r0)
            r0 = 65
            r3.update(r0)
            r0 = 45
            r3.update(r0)
            r0 = 53
            r3.update(r0)
            r0 = 49
            r3.update(r0)
            r0 = 50
            r3.update(r0)
            r0 = 47
            r3.update(r0)
            r0 = 10
            r1 = 100
            if (r4 <= r1) goto L7f
            int r2 = r4 / 100
            int r2 = r2 + 48
            byte r2 = (byte) r2
            r3.update(r2)
            int r4 = r4 % r1
        L6f:
            int r1 = r4 / 10
            int r1 = r1 + 48
            byte r1 = (byte) r1
            r3.update(r1)
            int r4 = r4 % r0
        L78:
            int r4 = r4 + 48
            byte r4 = (byte) r4
            r3.update(r4)
            goto L82
        L7f:
            if (r4 <= r0) goto L78
            goto L6f
        L82:
            r3.l()
            long r0 = r3.e
            r3.q = r0
            long r0 = r3.f
            r3.r = r0
            long r0 = r3.g
            r3.s = r0
            long r0 = r3.h
            r3.t = r0
            long r0 = r3.i
            r3.u = r0
            long r0 = r3.j
            r3.v = r0
            long r0 = r3.k
            r3.w = r0
            long r0 = r3.l
            r3.x = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hq9.r(int):void");
    }

    @Override // defpackage.sc6
    public sc6 a() {
        return new hq9(this);
    }

    @Override // defpackage.sc6
    public void b(sc6 sc6Var) {
        hq9 hq9Var = (hq9) sc6Var;
        if (this.p == hq9Var.p) {
            super.k(hq9Var);
            this.q = hq9Var.q;
            this.r = hq9Var.r;
            this.s = hq9Var.s;
            this.t = hq9Var.t;
            this.u = hq9Var.u;
            this.v = hq9Var.v;
            this.w = hq9Var.w;
            this.x = hq9Var.x;
            return;
        }
        throw new MemoableResetException("digestLength inappropriate in other");
    }

    @Override // defpackage.e23
    public int doFinal(byte[] bArr, int i) {
        l();
        q(this.e, bArr, i, this.p);
        q(this.f, bArr, i + 8, this.p - 8);
        q(this.g, bArr, i + 16, this.p - 16);
        q(this.h, bArr, i + 24, this.p - 24);
        q(this.i, bArr, i + 32, this.p - 32);
        q(this.j, bArr, i + 40, this.p - 40);
        q(this.k, bArr, i + 48, this.p - 48);
        q(this.l, bArr, i + 56, this.p - 56);
        reset();
        return this.p;
    }

    @Override // defpackage.e23
    public String getAlgorithmName() {
        return "SHA-512/" + Integer.toString(this.p * 8);
    }

    @Override // defpackage.e23
    public int getDigestSize() {
        return this.p;
    }

    @Override // defpackage.ky5, defpackage.e23
    public void reset() {
        super.reset();
        this.e = this.q;
        this.f = this.r;
        this.g = this.s;
        this.h = this.t;
        this.i = this.u;
        this.j = this.v;
        this.k = this.w;
        this.l = this.x;
    }

    public hq9(hq9 hq9Var) {
        super(hq9Var);
        this.p = hq9Var.p;
        b(hq9Var);
    }
}
