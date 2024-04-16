package defpackage;

import androidx.annotation.NonNull;
/* compiled from: MarkwonConfiguration.java */
/* renamed from: s86  reason: default package */
/* loaded from: classes3.dex */
public class s86 {
    private final y86 a;
    private final yx b;
    private final a4b c;
    private final mq5 d;
    private final hu4 e;
    private final pv4 f;
    private final w86 g;

    /* compiled from: MarkwonConfiguration.java */
    /* renamed from: s86$b */
    /* loaded from: classes3.dex */
    public static class b {
        private y86 a;
        private yx b;
        private a4b c;
        private mq5 d;
        private hu4 e;
        private pv4 f;
        private w86 g;

        @NonNull
        public b h(@NonNull yx yxVar) {
            this.b = yxVar;
            return this;
        }

        @NonNull
        public s86 i(@NonNull y86 y86Var, @NonNull w86 w86Var) {
            this.a = y86Var;
            this.g = w86Var;
            if (this.b == null) {
                this.b = yx.c();
            }
            if (this.c == null) {
                this.c = new b4b();
            }
            if (this.d == null) {
                this.d = new nq5();
            }
            if (this.e == null) {
                this.e = hu4.a();
            }
            if (this.f == null) {
                this.f = new qv4();
            }
            return new s86(this);
        }

        @NonNull
        public b j(@NonNull mq5 mq5Var) {
            this.d = mq5Var;
            return this;
        }
    }

    @NonNull
    public yx a() {
        return this.b;
    }

    @NonNull
    public hu4 b() {
        return this.e;
    }

    @NonNull
    public pv4 c() {
        return this.f;
    }

    @NonNull
    public mq5 d() {
        return this.d;
    }

    @NonNull
    public w86 e() {
        return this.g;
    }

    @NonNull
    public a4b f() {
        return this.c;
    }

    @NonNull
    public y86 g() {
        return this.a;
    }

    private s86(@NonNull b bVar) {
        this.a = bVar.a;
        this.b = bVar.b;
        this.c = bVar.c;
        this.d = bVar.d;
        this.e = bVar.e;
        this.f = bVar.f;
        this.g = bVar.g;
    }
}
