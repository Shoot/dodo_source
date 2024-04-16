package defpackage;
/* renamed from: yac  reason: default package */
/* loaded from: classes3.dex */
public abstract class yac {
    private final int a;
    private final long b;
    private final int c;
    private final int d;

    /* renamed from: yac$a */
    /* loaded from: classes3.dex */
    protected static abstract class a<T extends a> {
        private final int a;
        private int b = 0;
        private long c = 0;
        private int d = 0;

        /* JADX INFO: Access modifiers changed from: protected */
        public a(int i) {
            this.a = i;
        }

        protected abstract T e();

        /* JADX INFO: Access modifiers changed from: protected */
        public T f(int i) {
            this.d = i;
            return e();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public T g(int i) {
            this.b = i;
            return e();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public T h(long j) {
            this.c = j;
            return e();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public yac(a aVar) {
        this.a = aVar.b;
        this.b = aVar.c;
        this.c = aVar.a;
        this.d = aVar.d;
    }

    public final int a() {
        return this.d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int b() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final long c() {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public byte[] d() {
        byte[] bArr = new byte[32];
        mo7.f(this.a, bArr, 0);
        mo7.s(this.b, bArr, 4);
        mo7.f(this.c, bArr, 12);
        mo7.f(this.d, bArr, 28);
        return bArr;
    }
}
