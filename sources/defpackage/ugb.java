package defpackage;
/* compiled from: TimeWindow.java */
/* renamed from: ugb  reason: default package */
/* loaded from: classes2.dex */
public final class ugb {
    private static final ugb c = new a().a();
    private final long a;
    private final long b;

    /* compiled from: TimeWindow.java */
    /* renamed from: ugb$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private long a = 0;
        private long b = 0;

        a() {
        }

        public ugb a() {
            return new ugb(this.a, this.b);
        }

        public a b(long j) {
            this.b = j;
            return this;
        }

        public a c(long j) {
            this.a = j;
            return this;
        }
    }

    ugb(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public static a c() {
        return new a();
    }

    @pr8(tag = 2)
    public long a() {
        return this.b;
    }

    @pr8(tag = 1)
    public long b() {
        return this.a;
    }
}
