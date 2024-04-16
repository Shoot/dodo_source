package defpackage;
/* compiled from: MessagingClientEvent.java */
/* renamed from: ei6  reason: default package */
/* loaded from: classes2.dex */
public final class ei6 {
    private static final ei6 p = new a().a();
    private final long a;
    private final String b;
    private final String c;
    private final c d;
    private final d e;
    private final String f;
    private final String g;
    private final int h;
    private final int i;
    private final String j;
    private final long k;
    private final b l;
    private final String m;
    private final long n;
    private final String o;

    /* compiled from: MessagingClientEvent.java */
    /* renamed from: ei6$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private long a = 0;
        private String b = "";
        private String c = "";
        private c d = c.UNKNOWN;
        private d e = d.UNKNOWN_OS;
        private String f = "";
        private String g = "";
        private int h = 0;
        private int i = 0;
        private String j = "";
        private long k = 0;
        private b l = b.UNKNOWN_EVENT;
        private String m = "";
        private long n = 0;
        private String o = "";

        a() {
        }

        public ei6 a() {
            return new ei6(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o);
        }

        public a b(String str) {
            this.m = str;
            return this;
        }

        public a c(String str) {
            this.g = str;
            return this;
        }

        public a d(String str) {
            this.o = str;
            return this;
        }

        public a e(b bVar) {
            this.l = bVar;
            return this;
        }

        public a f(String str) {
            this.c = str;
            return this;
        }

        public a g(String str) {
            this.b = str;
            return this;
        }

        public a h(c cVar) {
            this.d = cVar;
            return this;
        }

        public a i(String str) {
            this.f = str;
            return this;
        }

        public a j(long j) {
            this.a = j;
            return this;
        }

        public a k(d dVar) {
            this.e = dVar;
            return this;
        }

        public a l(String str) {
            this.j = str;
            return this;
        }

        public a m(int i) {
            this.i = i;
            return this;
        }
    }

    /* compiled from: MessagingClientEvent.java */
    /* renamed from: ei6$b */
    /* loaded from: classes2.dex */
    public enum b implements jr8 {
        UNKNOWN_EVENT(0),
        MESSAGE_DELIVERED(1),
        MESSAGE_OPEN(2);
        
        private final int a;

        b(int i) {
            this.a = i;
        }

        @Override // defpackage.jr8
        public int e() {
            return this.a;
        }
    }

    /* compiled from: MessagingClientEvent.java */
    /* renamed from: ei6$c */
    /* loaded from: classes2.dex */
    public enum c implements jr8 {
        UNKNOWN(0),
        DATA_MESSAGE(1),
        TOPIC(2),
        DISPLAY_NOTIFICATION(3);
        
        private final int a;

        c(int i) {
            this.a = i;
        }

        @Override // defpackage.jr8
        public int e() {
            return this.a;
        }
    }

    /* compiled from: MessagingClientEvent.java */
    /* renamed from: ei6$d */
    /* loaded from: classes2.dex */
    public enum d implements jr8 {
        UNKNOWN_OS(0),
        ANDROID(1),
        IOS(2),
        WEB(3);
        
        private final int a;

        d(int i) {
            this.a = i;
        }

        @Override // defpackage.jr8
        public int e() {
            return this.a;
        }
    }

    ei6(long j, String str, String str2, c cVar, d dVar, String str3, String str4, int i, int i2, String str5, long j2, b bVar, String str6, long j3, String str7) {
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = cVar;
        this.e = dVar;
        this.f = str3;
        this.g = str4;
        this.h = i;
        this.i = i2;
        this.j = str5;
        this.k = j2;
        this.l = bVar;
        this.m = str6;
        this.n = j3;
        this.o = str7;
    }

    public static a p() {
        return new a();
    }

    @pr8(tag = 13)
    public String a() {
        return this.m;
    }

    @pr8(tag = 11)
    public long b() {
        return this.k;
    }

    @pr8(tag = 14)
    public long c() {
        return this.n;
    }

    @pr8(tag = 7)
    public String d() {
        return this.g;
    }

    @pr8(tag = 15)
    public String e() {
        return this.o;
    }

    @pr8(tag = 12)
    public b f() {
        return this.l;
    }

    @pr8(tag = 3)
    public String g() {
        return this.c;
    }

    @pr8(tag = 2)
    public String h() {
        return this.b;
    }

    @pr8(tag = 4)
    public c i() {
        return this.d;
    }

    @pr8(tag = 6)
    public String j() {
        return this.f;
    }

    @pr8(tag = 8)
    public int k() {
        return this.h;
    }

    @pr8(tag = 1)
    public long l() {
        return this.a;
    }

    @pr8(tag = 5)
    public d m() {
        return this.e;
    }

    @pr8(tag = 10)
    public String n() {
        return this.j;
    }

    @pr8(tag = 9)
    public int o() {
        return this.i;
    }
}
