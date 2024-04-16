package defpackage;

import defpackage.yac;
/* renamed from: aj5  reason: default package */
/* loaded from: classes3.dex */
final class aj5 extends yac {
    private final int e;
    private final int f;
    private final int g;

    private aj5(b bVar) {
        super(bVar);
        this.e = bVar.e;
        this.f = bVar.f;
        this.g = bVar.g;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.yac
    public byte[] d() {
        byte[] d = super.d();
        mo7.f(this.e, d, 16);
        mo7.f(this.f, d, 20);
        mo7.f(this.g, d, 24);
        return d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int e() {
        return this.e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int f() {
        return this.f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int g() {
        return this.g;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: aj5$b */
    /* loaded from: classes3.dex */
    public static class b extends yac.a<b> {
        private int e;
        private int f;
        private int g;

        /* JADX INFO: Access modifiers changed from: protected */
        public b() {
            super(1);
            this.e = 0;
            this.f = 0;
            this.g = 0;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public yac l() {
            return new aj5(this);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public b n(int i) {
            this.e = i;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public b o(int i) {
            this.f = i;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public b p(int i) {
            this.g = i;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // defpackage.yac.a
        /* renamed from: m */
        public b e() {
            return this;
        }
    }
}
