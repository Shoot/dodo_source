package defpackage;

import java.lang.reflect.Array;
/* renamed from: e6b  reason: default package */
/* loaded from: classes3.dex */
public class e6b implements vd5 {
    private long[][] a;

    @Override // defpackage.vd5
    public void a(long[] jArr) {
        long[][] jArr2 = this.a;
        if (jArr2 == null) {
            this.a = (long[][]) Array.newInstance(Long.TYPE, 256, 2);
        } else if (wd5.c(jArr, jArr2[1])) {
            return;
        }
        wd5.b(jArr, this.a[1]);
        for (int i = 2; i < 256; i += 2) {
            long[][] jArr3 = this.a;
            wd5.d(jArr3[i >> 1], jArr3[i]);
            long[][] jArr4 = this.a;
            wd5.a(jArr4[i], jArr4[1], jArr4[i + 1]);
        }
    }

    @Override // defpackage.vd5
    public void b(long[] jArr) {
        long[] jArr2 = new long[2];
        wd5.b(this.a[((int) (jArr[1] >>> 56)) & 255], jArr2);
        for (int i = 14; i >= 0; i--) {
            wd5.e(jArr2, jArr2);
            wd5.a(this.a[((int) (jArr[i >>> 3] >>> ((i & 7) << 3))) & 255], jArr2, jArr2);
        }
        wd5.b(jArr2, jArr);
    }
}
