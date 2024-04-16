package defpackage;
/* compiled from: Delay.java */
/* renamed from: wt2  reason: default package */
/* loaded from: classes3.dex */
public class wt2 {
    private final long[] a;
    private long b;
    private long c;
    private int d;

    public wt2(long[] jArr) {
        if (jArr != null && jArr.length != 0) {
            this.a = jArr;
            a();
            return;
        }
        throw new IllegalArgumentException();
    }

    private long b() {
        return System.nanoTime() / 1000000;
    }

    public long a() {
        long j;
        long[] jArr = this.a;
        if (jArr == null) {
            j = this.b;
        } else {
            int i = this.d;
            long j2 = jArr[i];
            if (i < jArr.length - 1) {
                this.d = i + 1;
            }
            j = j2;
        }
        this.c = b() + j;
        return j;
    }

    public boolean c() {
        if (b() < this.c) {
            return true;
        }
        return false;
    }
}
