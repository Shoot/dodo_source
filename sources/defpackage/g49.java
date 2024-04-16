package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: Rate.java */
/* renamed from: g49  reason: default package */
/* loaded from: classes2.dex */
public class g49 {
    private long a;
    private long b;
    private TimeUnit c;

    /* compiled from: Rate.java */
    /* renamed from: g49$a */
    /* loaded from: classes2.dex */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[TimeUnit.values().length];
            a = iArr;
            try {
                iArr[TimeUnit.NANOSECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[TimeUnit.MICROSECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[TimeUnit.MILLISECONDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public g49(long j, long j2, TimeUnit timeUnit) {
        this.a = j;
        this.b = j2;
        this.c = timeUnit;
    }

    public double a() {
        int i = a.a[this.c.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return this.a / this.c.toSeconds(this.b);
                }
                return (this.a / this.b) * TimeUnit.SECONDS.toMillis(1L);
            }
            return (this.a / this.b) * TimeUnit.SECONDS.toMicros(1L);
        }
        return (this.a / this.b) * TimeUnit.SECONDS.toNanos(1L);
    }
}
