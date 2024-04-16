package defpackage;

import android.graphics.drawable.Drawable;
/* compiled from: DrawableCrossFadeFactory.java */
/* renamed from: h83  reason: default package */
/* loaded from: classes.dex */
public class h83 implements elb<Drawable> {
    private final int a;
    private final boolean b;
    private i83 c;

    /* compiled from: DrawableCrossFadeFactory.java */
    /* renamed from: h83$a */
    /* loaded from: classes.dex */
    public static class a {
        private final int a;
        private boolean b;

        public a() {
            this(300);
        }

        public h83 a() {
            return new h83(this.a, this.b);
        }

        public a b(boolean z) {
            this.b = z;
            return this;
        }

        public a(int i) {
            this.a = i;
        }
    }

    protected h83(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    private dlb<Drawable> b() {
        if (this.c == null) {
            this.c = new i83(this.a, this.b);
        }
        return this.c;
    }

    @Override // defpackage.elb
    public dlb<Drawable> a(dl2 dl2Var, boolean z) {
        if (dl2Var == dl2.MEMORY_CACHE) {
            return iz6.b();
        }
        return b();
    }
}
