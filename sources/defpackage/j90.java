package defpackage;
/* renamed from: j90  reason: default package */
/* loaded from: classes3.dex */
public class j90 implements aa4 {
    private long[] a;

    @Override // defpackage.aa4
    public void a(byte[] bArr) {
        this.a = ea4.d(bArr);
    }

    @Override // defpackage.aa4
    public void b(long j, byte[] bArr) {
        long[] l = ea4.l();
        if (j > 0) {
            long[] jArr = new long[2];
            ea4.f(this.a, jArr);
            do {
                if ((1 & j) != 0) {
                    ea4.j(l, jArr);
                }
                ea4.m(jArr, jArr);
                j >>>= 1;
            } while (j > 0);
            ea4.b(l, bArr);
        }
        ea4.b(l, bArr);
    }
}
