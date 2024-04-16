package defpackage;
/* compiled from: LogEventDropped.java */
/* renamed from: rw5  reason: default package */
/* loaded from: classes2.dex */
public final class rw5 {
    private static final rw5 c = new a().a();
    private final long a;
    private final b b;

    /* compiled from: LogEventDropped.java */
    /* renamed from: rw5$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private long a = 0;
        private b b = b.REASON_UNKNOWN;

        a() {
        }

        public rw5 a() {
            return new rw5(this.a, this.b);
        }

        public a b(long j) {
            this.a = j;
            return this;
        }

        public a c(b bVar) {
            this.b = bVar;
            return this;
        }
    }

    /* compiled from: LogEventDropped.java */
    /* renamed from: rw5$b */
    /* loaded from: classes2.dex */
    public enum b implements jr8 {
        REASON_UNKNOWN(0),
        MESSAGE_TOO_OLD(1),
        CACHE_FULL(2),
        PAYLOAD_TOO_BIG(3),
        MAX_RETRIES_REACHED(4),
        INVALID_PAYLOD(5),
        SERVER_ERROR(6);
        
        private final int a;

        b(int i2) {
            this.a = i2;
        }

        @Override // defpackage.jr8
        public int e() {
            return this.a;
        }
    }

    rw5(long j, b bVar) {
        this.a = j;
        this.b = bVar;
    }

    public static a c() {
        return new a();
    }

    @pr8(tag = 1)
    public long a() {
        return this.a;
    }

    @pr8(tag = 3)
    public b b() {
        return this.b;
    }
}
