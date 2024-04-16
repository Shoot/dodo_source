package defpackage;

import java.io.IOException;
/* compiled from: AutoProtoEncoderDoNotUseEncoder.java */
/* renamed from: v00  reason: default package */
/* loaded from: classes2.dex */
public final class v00 implements hq1 {
    public static final hq1 a = new v00();

    /* compiled from: AutoProtoEncoderDoNotUseEncoder.java */
    /* renamed from: v00$a */
    /* loaded from: classes2.dex */
    private static final class a implements v47<m91> {
        static final a a = new a();
        private static final hs3 b = hs3.a("window").b(qy.b().c(1).a()).a();
        private static final hs3 c = hs3.a("logSourceMetrics").b(qy.b().c(2).a()).a();
        private static final hs3 d = hs3.a("globalMetrics").b(qy.b().c(3).a()).a();
        private static final hs3 e = hs3.a("appNamespace").b(qy.b().c(4).a()).a();

        private a() {
        }

        @Override // defpackage.v47
        /* renamed from: b */
        public void a(m91 m91Var, w47 w47Var) throws IOException {
            w47Var.a(b, m91Var.d());
            w47Var.a(c, m91Var.c());
            w47Var.a(d, m91Var.b());
            w47Var.a(e, m91Var.a());
        }
    }

    /* compiled from: AutoProtoEncoderDoNotUseEncoder.java */
    /* renamed from: v00$b */
    /* loaded from: classes2.dex */
    private static final class b implements v47<ig4> {
        static final b a = new b();
        private static final hs3 b = hs3.a("storageMetrics").b(qy.b().c(1).a()).a();

        private b() {
        }

        @Override // defpackage.v47
        /* renamed from: b */
        public void a(ig4 ig4Var, w47 w47Var) throws IOException {
            w47Var.a(b, ig4Var.a());
        }
    }

    /* compiled from: AutoProtoEncoderDoNotUseEncoder.java */
    /* renamed from: v00$c */
    /* loaded from: classes2.dex */
    private static final class c implements v47<rw5> {
        static final c a = new c();
        private static final hs3 b = hs3.a("eventsDroppedCount").b(qy.b().c(1).a()).a();
        private static final hs3 c = hs3.a("reason").b(qy.b().c(3).a()).a();

        private c() {
        }

        @Override // defpackage.v47
        /* renamed from: b */
        public void a(rw5 rw5Var, w47 w47Var) throws IOException {
            w47Var.g(b, rw5Var.a());
            w47Var.a(c, rw5Var.b());
        }
    }

    /* compiled from: AutoProtoEncoderDoNotUseEncoder.java */
    /* renamed from: v00$d */
    /* loaded from: classes2.dex */
    private static final class d implements v47<ex5> {
        static final d a = new d();
        private static final hs3 b = hs3.a("logSource").b(qy.b().c(1).a()).a();
        private static final hs3 c = hs3.a("logEventDropped").b(qy.b().c(2).a()).a();

        private d() {
        }

        @Override // defpackage.v47
        /* renamed from: b */
        public void a(ex5 ex5Var, w47 w47Var) throws IOException {
            w47Var.a(b, ex5Var.b());
            w47Var.a(c, ex5Var.a());
        }
    }

    /* compiled from: AutoProtoEncoderDoNotUseEncoder.java */
    /* renamed from: v00$e */
    /* loaded from: classes2.dex */
    private static final class e implements v47<ir8> {
        static final e a = new e();
        private static final hs3 b = hs3.d("clientMetrics");

        private e() {
        }

        @Override // defpackage.v47
        /* renamed from: b */
        public void a(ir8 ir8Var, w47 w47Var) throws IOException {
            w47Var.a(b, ir8Var.b());
        }
    }

    /* compiled from: AutoProtoEncoderDoNotUseEncoder.java */
    /* renamed from: v00$f */
    /* loaded from: classes2.dex */
    private static final class f implements v47<qxa> {
        static final f a = new f();
        private static final hs3 b = hs3.a("currentCacheSizeBytes").b(qy.b().c(1).a()).a();
        private static final hs3 c = hs3.a("maxCacheSizeBytes").b(qy.b().c(2).a()).a();

        private f() {
        }

        @Override // defpackage.v47
        /* renamed from: b */
        public void a(qxa qxaVar, w47 w47Var) throws IOException {
            w47Var.g(b, qxaVar.a());
            w47Var.g(c, qxaVar.b());
        }
    }

    /* compiled from: AutoProtoEncoderDoNotUseEncoder.java */
    /* renamed from: v00$g */
    /* loaded from: classes2.dex */
    private static final class g implements v47<ugb> {
        static final g a = new g();
        private static final hs3 b = hs3.a("startMs").b(qy.b().c(1).a()).a();
        private static final hs3 c = hs3.a("endMs").b(qy.b().c(2).a()).a();

        private g() {
        }

        @Override // defpackage.v47
        /* renamed from: b */
        public void a(ugb ugbVar, w47 w47Var) throws IOException {
            w47Var.g(b, ugbVar.b());
            w47Var.g(c, ugbVar.a());
        }
    }

    private v00() {
    }

    @Override // defpackage.hq1
    public void a(ch3<?> ch3Var) {
        ch3Var.a(ir8.class, e.a);
        ch3Var.a(m91.class, a.a);
        ch3Var.a(ugb.class, g.a);
        ch3Var.a(ex5.class, d.a);
        ch3Var.a(rw5.class, c.a);
        ch3Var.a(ig4.class, b.a);
        ch3Var.a(qxa.class, f.a);
    }
}
