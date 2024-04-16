package defpackage;

import java.io.IOException;
/* compiled from: AutoSessionEventEncoder.java */
/* renamed from: c10  reason: default package */
/* loaded from: classes2.dex */
public final class c10 implements hq1 {
    public static final hq1 a = new c10();

    /* compiled from: AutoSessionEventEncoder.java */
    /* renamed from: c10$a */
    /* loaded from: classes2.dex */
    private static final class a implements v47<fe> {
        static final a a = new a();
        private static final hs3 b = hs3.d("packageName");
        private static final hs3 c = hs3.d("versionName");
        private static final hs3 d = hs3.d("appBuildVersion");
        private static final hs3 e = hs3.d("deviceManufacturer");
        private static final hs3 f = hs3.d("currentProcessDetails");
        private static final hs3 g = hs3.d("appProcessDetails");

        private a() {
        }

        @Override // defpackage.v47
        /* renamed from: b */
        public void a(fe feVar, w47 w47Var) throws IOException {
            w47Var.a(b, feVar.e());
            w47Var.a(c, feVar.f());
            w47Var.a(d, feVar.a());
            w47Var.a(e, feVar.d());
            w47Var.a(f, feVar.c());
            w47Var.a(g, feVar.b());
        }
    }

    /* compiled from: AutoSessionEventEncoder.java */
    /* renamed from: c10$b */
    /* loaded from: classes2.dex */
    private static final class b implements v47<op> {
        static final b a = new b();
        private static final hs3 b = hs3.d("appId");
        private static final hs3 c = hs3.d("deviceModel");
        private static final hs3 d = hs3.d("sessionSdkVersion");
        private static final hs3 e = hs3.d("osVersion");
        private static final hs3 f = hs3.d("logEnvironment");
        private static final hs3 g = hs3.d("androidAppInfo");

        private b() {
        }

        @Override // defpackage.v47
        /* renamed from: b */
        public void a(op opVar, w47 w47Var) throws IOException {
            w47Var.a(b, opVar.b());
            w47Var.a(c, opVar.c());
            w47Var.a(d, opVar.f());
            w47Var.a(e, opVar.e());
            w47Var.a(f, opVar.d());
            w47Var.a(g, opVar.a());
        }
    }

    /* compiled from: AutoSessionEventEncoder.java */
    /* renamed from: c10$c */
    /* loaded from: classes2.dex */
    private static final class c implements v47<sk2> {
        static final c a = new c();
        private static final hs3 b = hs3.d("performance");
        private static final hs3 c = hs3.d("crashlytics");
        private static final hs3 d = hs3.d("sessionSamplingRate");

        private c() {
        }

        @Override // defpackage.v47
        /* renamed from: b */
        public void a(sk2 sk2Var, w47 w47Var) throws IOException {
            w47Var.a(b, sk2Var.b());
            w47Var.a(c, sk2Var.a());
            w47Var.f(d, sk2Var.c());
        }
    }

    /* compiled from: AutoSessionEventEncoder.java */
    /* renamed from: c10$d */
    /* loaded from: classes2.dex */
    private static final class d implements v47<mk8> {
        static final d a = new d();
        private static final hs3 b = hs3.d("processName");
        private static final hs3 c = hs3.d("pid");
        private static final hs3 d = hs3.d("importance");
        private static final hs3 e = hs3.d("defaultProcess");

        private d() {
        }

        @Override // defpackage.v47
        /* renamed from: b */
        public void a(mk8 mk8Var, w47 w47Var) throws IOException {
            w47Var.a(b, mk8Var.c());
            w47Var.e(c, mk8Var.b());
            w47Var.e(d, mk8Var.a());
            w47Var.d(e, mk8Var.d());
        }
    }

    /* compiled from: AutoSessionEventEncoder.java */
    /* renamed from: c10$e */
    /* loaded from: classes2.dex */
    private static final class e implements v47<gea> {
        static final e a = new e();
        private static final hs3 b = hs3.d("eventType");
        private static final hs3 c = hs3.d("sessionData");
        private static final hs3 d = hs3.d("applicationInfo");

        private e() {
        }

        @Override // defpackage.v47
        /* renamed from: b */
        public void a(gea geaVar, w47 w47Var) throws IOException {
            w47Var.a(b, geaVar.b());
            w47Var.a(c, geaVar.c());
            w47Var.a(d, geaVar.a());
        }
    }

    /* compiled from: AutoSessionEventEncoder.java */
    /* renamed from: c10$f */
    /* loaded from: classes2.dex */
    private static final class f implements v47<lea> {
        static final f a = new f();
        private static final hs3 b = hs3.d("sessionId");
        private static final hs3 c = hs3.d("firstSessionId");
        private static final hs3 d = hs3.d("sessionIndex");
        private static final hs3 e = hs3.d("eventTimestampUs");
        private static final hs3 f = hs3.d("dataCollectionStatus");
        private static final hs3 g = hs3.d("firebaseInstallationId");

        private f() {
        }

        @Override // defpackage.v47
        /* renamed from: b */
        public void a(lea leaVar, w47 w47Var) throws IOException {
            w47Var.a(b, leaVar.e());
            w47Var.a(c, leaVar.d());
            w47Var.e(d, leaVar.f());
            w47Var.g(e, leaVar.b());
            w47Var.a(f, leaVar.a());
            w47Var.a(g, leaVar.c());
        }
    }

    private c10() {
    }

    @Override // defpackage.hq1
    public void a(ch3<?> ch3Var) {
        ch3Var.a(gea.class, e.a);
        ch3Var.a(lea.class, f.a);
        ch3Var.a(sk2.class, c.a);
        ch3Var.a(op.class, b.a);
        ch3Var.a(fe.class, a.a);
        ch3Var.a(mk8.class, d.a);
    }
}
