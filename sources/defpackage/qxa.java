package defpackage;
/* compiled from: StorageMetrics.java */
/* renamed from: qxa  reason: default package */
/* loaded from: classes2.dex */
public final class qxa {
    private static final qxa c = new a().a();
    private final long a;
    private final long b;

    /* compiled from: StorageMetrics.java */
    /* renamed from: qxa$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private long a = 0;
        private long b = 0;

        a() {
        }

        public qxa a() {
            return new qxa(this.a, this.b);
        }

        public a b(long j) {
            this.a = j;
            return this;
        }

        public a c(long j) {
            this.b = j;
            return this;
        }
    }

    qxa(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public static a c() {
        return new a();
    }

    @pr8(tag = 1)
    public long a() {
        return this.a;
    }

    @pr8(tag = 2)
    public long b() {
        return this.b;
    }
}
