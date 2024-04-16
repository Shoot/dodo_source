package defpackage;

import defpackage.tmb;
import java.io.IOException;
/* compiled from: AutoBatchedLogRequestEncoder.java */
/* renamed from: j00  reason: default package */
/* loaded from: classes2.dex */
public final class j00 implements hq1 {
    public static final hq1 a = new j00();

    /* compiled from: AutoBatchedLogRequestEncoder.java */
    /* renamed from: j00$a */
    /* loaded from: classes2.dex */
    private static final class a implements v47<wf> {
        static final a a = new a();
        private static final hs3 b = hs3.d("sdkVersion");
        private static final hs3 c = hs3.d("model");
        private static final hs3 d = hs3.d("hardware");
        private static final hs3 e = hs3.d("device");
        private static final hs3 f = hs3.d("product");
        private static final hs3 g = hs3.d("osBuild");
        private static final hs3 h = hs3.d("manufacturer");
        private static final hs3 i = hs3.d("fingerprint");
        private static final hs3 j = hs3.d("locale");
        private static final hs3 k = hs3.d(tmb.c.COUNTRY_JSON_NAME);
        private static final hs3 l = hs3.d("mccMnc");
        private static final hs3 m = hs3.d("applicationBuild");

        private a() {
        }

        @Override // defpackage.v47
        /* renamed from: b */
        public void a(wf wfVar, w47 w47Var) throws IOException {
            w47Var.a(b, wfVar.m());
            w47Var.a(c, wfVar.j());
            w47Var.a(d, wfVar.f());
            w47Var.a(e, wfVar.d());
            w47Var.a(f, wfVar.l());
            w47Var.a(g, wfVar.k());
            w47Var.a(h, wfVar.h());
            w47Var.a(i, wfVar.e());
            w47Var.a(j, wfVar.g());
            w47Var.a(k, wfVar.c());
            w47Var.a(l, wfVar.i());
            w47Var.a(m, wfVar.b());
        }
    }

    /* compiled from: AutoBatchedLogRequestEncoder.java */
    /* renamed from: j00$b */
    /* loaded from: classes2.dex */
    private static final class b implements v47<v90> {
        static final b a = new b();
        private static final hs3 b = hs3.d("logRequest");

        private b() {
        }

        @Override // defpackage.v47
        /* renamed from: b */
        public void a(v90 v90Var, w47 w47Var) throws IOException {
            w47Var.a(b, v90Var.c());
        }
    }

    /* compiled from: AutoBatchedLogRequestEncoder.java */
    /* renamed from: j00$c */
    /* loaded from: classes2.dex */
    private static final class c implements v47<l91> {
        static final c a = new c();
        private static final hs3 b = hs3.d("clientType");
        private static final hs3 c = hs3.d("androidClientInfo");

        private c() {
        }

        @Override // defpackage.v47
        /* renamed from: b */
        public void a(l91 l91Var, w47 w47Var) throws IOException {
            w47Var.a(b, l91Var.c());
            w47Var.a(c, l91Var.b());
        }
    }

    /* compiled from: AutoBatchedLogRequestEncoder.java */
    /* renamed from: j00$d */
    /* loaded from: classes2.dex */
    private static final class d implements v47<qw5> {
        static final d a = new d();
        private static final hs3 b = hs3.d("eventTimeMs");
        private static final hs3 c = hs3.d("eventCode");
        private static final hs3 d = hs3.d("eventUptimeMs");
        private static final hs3 e = hs3.d("sourceExtension");
        private static final hs3 f = hs3.d("sourceExtensionJsonProto3");
        private static final hs3 g = hs3.d("timezoneOffsetSeconds");
        private static final hs3 h = hs3.d("networkConnectionInfo");

        private d() {
        }

        @Override // defpackage.v47
        /* renamed from: b */
        public void a(qw5 qw5Var, w47 w47Var) throws IOException {
            w47Var.g(b, qw5Var.c());
            w47Var.a(c, qw5Var.b());
            w47Var.g(d, qw5Var.d());
            w47Var.a(e, qw5Var.f());
            w47Var.a(f, qw5Var.g());
            w47Var.g(g, qw5Var.h());
            w47Var.a(h, qw5Var.e());
        }
    }

    /* compiled from: AutoBatchedLogRequestEncoder.java */
    /* renamed from: j00$e */
    /* loaded from: classes2.dex */
    private static final class e implements v47<tw5> {
        static final e a = new e();
        private static final hs3 b = hs3.d("requestTimeMs");
        private static final hs3 c = hs3.d("requestUptimeMs");
        private static final hs3 d = hs3.d("clientInfo");
        private static final hs3 e = hs3.d("logSource");
        private static final hs3 f = hs3.d("logSourceName");
        private static final hs3 g = hs3.d("logEvent");
        private static final hs3 h = hs3.d("qosTier");

        private e() {
        }

        @Override // defpackage.v47
        /* renamed from: b */
        public void a(tw5 tw5Var, w47 w47Var) throws IOException {
            w47Var.g(b, tw5Var.g());
            w47Var.g(c, tw5Var.h());
            w47Var.a(d, tw5Var.b());
            w47Var.a(e, tw5Var.d());
            w47Var.a(f, tw5Var.e());
            w47Var.a(g, tw5Var.c());
            w47Var.a(h, tw5Var.f());
        }
    }

    /* compiled from: AutoBatchedLogRequestEncoder.java */
    /* renamed from: j00$f */
    /* loaded from: classes2.dex */
    private static final class f implements v47<zv6> {
        static final f a = new f();
        private static final hs3 b = hs3.d("networkType");
        private static final hs3 c = hs3.d("mobileSubtype");

        private f() {
        }

        @Override // defpackage.v47
        /* renamed from: b */
        public void a(zv6 zv6Var, w47 w47Var) throws IOException {
            w47Var.a(b, zv6Var.c());
            w47Var.a(c, zv6Var.b());
        }
    }

    private j00() {
    }

    @Override // defpackage.hq1
    public void a(ch3<?> ch3Var) {
        b bVar = b.a;
        ch3Var.a(v90.class, bVar);
        ch3Var.a(i10.class, bVar);
        e eVar = e.a;
        ch3Var.a(tw5.class, eVar);
        ch3Var.a(v20.class, eVar);
        c cVar = c.a;
        ch3Var.a(l91.class, cVar);
        ch3Var.a(j10.class, cVar);
        a aVar = a.a;
        ch3Var.a(wf.class, aVar);
        ch3Var.a(f10.class, aVar);
        d dVar = d.a;
        ch3Var.a(qw5.class, dVar);
        ch3Var.a(u20.class, dVar);
        f fVar = f.a;
        ch3Var.a(zv6.class, fVar);
        ch3Var.a(x20.class, fVar);
    }
}
