package defpackage;

import defpackage.yac;
/* renamed from: an4  reason: default package */
/* loaded from: classes3.dex */
final class an4 extends yac {
    private final int e;
    private final int f;
    private final int g;

    private an4(b bVar) {
        super(bVar);
        this.e = 0;
        this.f = bVar.e;
        this.g = bVar.f;
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
        return this.f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int f() {
        return this.g;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: an4$b */
    /* loaded from: classes3.dex */
    public static class b extends yac.a<b> {
        private int e;
        private int f;

        /* JADX INFO: Access modifiers changed from: protected */
        public b() {
            super(2);
            this.e = 0;
            this.f = 0;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public yac k() {
            return new an4(this);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public b m(int i) {
            this.e = i;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public b n(int i) {
            this.f = i;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // defpackage.yac.a
        /* renamed from: l */
        public b e() {
            return this;
        }
    }
}
