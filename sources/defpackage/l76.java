package defpackage;
/* compiled from: MapTileList.java */
/* renamed from: l76  reason: default package */
/* loaded from: classes3.dex */
public class l76 implements f76 {
    private long[] a;
    private int b;

    public void a() {
        this.b = 0;
    }

    public void b(int i) {
        if (i == 0) {
            return;
        }
        long[] jArr = this.a;
        if (jArr != null && jArr.length >= i) {
            return;
        }
        synchronized (this) {
            try {
                long[] jArr2 = new long[i];
                long[] jArr3 = this.a;
                if (jArr3 != null) {
                    System.arraycopy(jArr3, 0, jArr2, 0, jArr3.length);
                }
                this.a = jArr2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public long c(int i) {
        return this.a[i];
    }

    @Override // defpackage.f76
    public boolean d(long j) {
        if (this.a == null) {
            return false;
        }
        for (int i = 0; i < this.b; i++) {
            if (this.a[i] == j) {
                return true;
            }
        }
        return false;
    }

    public int e() {
        return this.b;
    }

    public void f(long j) {
        b(this.b + 1);
        long[] jArr = this.a;
        int i = this.b;
        this.b = i + 1;
        jArr[i] = j;
    }
}
