package defpackage;

import ch.qos.logback.core.joran.action.Action;
import com.huawei.hms.push.constant.RemoteMessageConst;
import defpackage.j12;
import im.threads.business.transport.MessageAttributes;
import java.io.IOException;
/* compiled from: AutoCrashlyticsReportEncoder.java */
/* renamed from: u00  reason: default package */
/* loaded from: classes2.dex */
public final class u00 implements hq1 {
    public static final hq1 a = new u00();

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* renamed from: u00$a */
    /* loaded from: classes2.dex */
    private static final class a implements v47<j12.a.AbstractC0373a> {
        static final a a = new a();
        private static final hs3 b = hs3.d("arch");
        private static final hs3 c = hs3.d("libraryName");
        private static final hs3 d = hs3.d("buildId");

        private a() {
        }

        @Override // defpackage.v47
        /* renamed from: b */
        public void a(j12.a.AbstractC0373a abstractC0373a, w47 w47Var) throws IOException {
            w47Var.a(b, abstractC0373a.b());
            w47Var.a(c, abstractC0373a.d());
            w47Var.a(d, abstractC0373a.c());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* renamed from: u00$b */
    /* loaded from: classes2.dex */
    private static final class b implements v47<j12.a> {
        static final b a = new b();
        private static final hs3 b = hs3.d("pid");
        private static final hs3 c = hs3.d("processName");
        private static final hs3 d = hs3.d("reasonCode");
        private static final hs3 e = hs3.d("importance");
        private static final hs3 f = hs3.d("pss");
        private static final hs3 g = hs3.d("rss");
        private static final hs3 h = hs3.d("timestamp");
        private static final hs3 i = hs3.d("traceFile");
        private static final hs3 j = hs3.d("buildIdMappingForArch");

        private b() {
        }

        @Override // defpackage.v47
        /* renamed from: b */
        public void a(j12.a aVar, w47 w47Var) throws IOException {
            w47Var.e(b, aVar.d());
            w47Var.a(c, aVar.e());
            w47Var.e(d, aVar.g());
            w47Var.e(e, aVar.c());
            w47Var.g(f, aVar.f());
            w47Var.g(g, aVar.h());
            w47Var.g(h, aVar.i());
            w47Var.a(i, aVar.j());
            w47Var.a(j, aVar.b());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* renamed from: u00$c */
    /* loaded from: classes2.dex */
    private static final class c implements v47<j12.c> {
        static final c a = new c();
        private static final hs3 b = hs3.d(Action.KEY_ATTRIBUTE);
        private static final hs3 c = hs3.d("value");

        private c() {
        }

        @Override // defpackage.v47
        /* renamed from: b */
        public void a(j12.c cVar, w47 w47Var) throws IOException {
            w47Var.a(b, cVar.b());
            w47Var.a(c, cVar.c());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* renamed from: u00$d */
    /* loaded from: classes2.dex */
    private static final class d implements v47<j12> {
        static final d a = new d();
        private static final hs3 b = hs3.d("sdkVersion");
        private static final hs3 c = hs3.d("gmpAppId");
        private static final hs3 d = hs3.d("platform");
        private static final hs3 e = hs3.d("installationUuid");
        private static final hs3 f = hs3.d("firebaseInstallationId");
        private static final hs3 g = hs3.d("appQualitySessionId");
        private static final hs3 h = hs3.d("buildVersion");
        private static final hs3 i = hs3.d("displayVersion");
        private static final hs3 j = hs3.d("session");
        private static final hs3 k = hs3.d("ndkPayload");
        private static final hs3 l = hs3.d("appExitInfo");

        private d() {
        }

        @Override // defpackage.v47
        /* renamed from: b */
        public void a(j12 j12Var, w47 w47Var) throws IOException {
            w47Var.a(b, j12Var.l());
            w47Var.a(c, j12Var.h());
            w47Var.e(d, j12Var.k());
            w47Var.a(e, j12Var.i());
            w47Var.a(f, j12Var.g());
            w47Var.a(g, j12Var.d());
            w47Var.a(h, j12Var.e());
            w47Var.a(i, j12Var.f());
            w47Var.a(j, j12Var.m());
            w47Var.a(k, j12Var.j());
            w47Var.a(l, j12Var.c());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* renamed from: u00$e */
    /* loaded from: classes2.dex */
    private static final class e implements v47<j12.d> {
        static final e a = new e();
        private static final hs3 b = hs3.d("files");
        private static final hs3 c = hs3.d("orgId");

        private e() {
        }

        @Override // defpackage.v47
        /* renamed from: b */
        public void a(j12.d dVar, w47 w47Var) throws IOException {
            w47Var.a(b, dVar.b());
            w47Var.a(c, dVar.c());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* renamed from: u00$f */
    /* loaded from: classes2.dex */
    private static final class f implements v47<j12.d.b> {
        static final f a = new f();
        private static final hs3 b = hs3.d("filename");
        private static final hs3 c = hs3.d("contents");

        private f() {
        }

        @Override // defpackage.v47
        /* renamed from: b */
        public void a(j12.d.b bVar, w47 w47Var) throws IOException {
            w47Var.a(b, bVar.c());
            w47Var.a(c, bVar.b());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* renamed from: u00$g */
    /* loaded from: classes2.dex */
    private static final class g implements v47<j12.e.a> {
        static final g a = new g();
        private static final hs3 b = hs3.d("identifier");
        private static final hs3 c = hs3.d("version");
        private static final hs3 d = hs3.d("displayVersion");
        private static final hs3 e = hs3.d("organization");
        private static final hs3 f = hs3.d("installationUuid");
        private static final hs3 g = hs3.d("developmentPlatform");
        private static final hs3 h = hs3.d("developmentPlatformVersion");

        private g() {
        }

        @Override // defpackage.v47
        /* renamed from: b */
        public void a(j12.e.a aVar, w47 w47Var) throws IOException {
            w47Var.a(b, aVar.e());
            w47Var.a(c, aVar.h());
            w47Var.a(d, aVar.d());
            w47Var.a(e, aVar.g());
            w47Var.a(f, aVar.f());
            w47Var.a(g, aVar.b());
            w47Var.a(h, aVar.c());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* renamed from: u00$h */
    /* loaded from: classes2.dex */
    private static final class h implements v47<j12.e.a.b> {
        static final h a = new h();
        private static final hs3 b = hs3.d("clsId");

        private h() {
        }

        @Override // defpackage.v47
        /* renamed from: b */
        public void a(j12.e.a.b bVar, w47 w47Var) throws IOException {
            w47Var.a(b, bVar.a());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* renamed from: u00$i */
    /* loaded from: classes2.dex */
    private static final class i implements v47<j12.e.c> {
        static final i a = new i();
        private static final hs3 b = hs3.d("arch");
        private static final hs3 c = hs3.d("model");
        private static final hs3 d = hs3.d("cores");
        private static final hs3 e = hs3.d("ram");
        private static final hs3 f = hs3.d("diskSpace");
        private static final hs3 g = hs3.d("simulator");
        private static final hs3 h = hs3.d("state");
        private static final hs3 i = hs3.d("manufacturer");
        private static final hs3 j = hs3.d("modelClass");

        private i() {
        }

        @Override // defpackage.v47
        /* renamed from: b */
        public void a(j12.e.c cVar, w47 w47Var) throws IOException {
            w47Var.e(b, cVar.b());
            w47Var.a(c, cVar.f());
            w47Var.e(d, cVar.c());
            w47Var.g(e, cVar.h());
            w47Var.g(f, cVar.d());
            w47Var.d(g, cVar.j());
            w47Var.e(h, cVar.i());
            w47Var.a(i, cVar.e());
            w47Var.a(j, cVar.g());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* renamed from: u00$j */
    /* loaded from: classes2.dex */
    private static final class j implements v47<j12.e> {
        static final j a = new j();
        private static final hs3 b = hs3.d("generator");
        private static final hs3 c = hs3.d("identifier");
        private static final hs3 d = hs3.d("appQualitySessionId");
        private static final hs3 e = hs3.d("startedAt");
        private static final hs3 f = hs3.d("endedAt");
        private static final hs3 g = hs3.d("crashed");
        private static final hs3 h = hs3.d("app");
        private static final hs3 i = hs3.d("user");
        private static final hs3 j = hs3.d("os");
        private static final hs3 k = hs3.d("device");
        private static final hs3 l = hs3.d("events");
        private static final hs3 m = hs3.d("generatorType");

        private j() {
        }

        @Override // defpackage.v47
        /* renamed from: b */
        public void a(j12.e eVar, w47 w47Var) throws IOException {
            w47Var.a(b, eVar.g());
            w47Var.a(c, eVar.j());
            w47Var.a(d, eVar.c());
            w47Var.g(e, eVar.l());
            w47Var.a(f, eVar.e());
            w47Var.d(g, eVar.n());
            w47Var.a(h, eVar.b());
            w47Var.a(i, eVar.m());
            w47Var.a(j, eVar.k());
            w47Var.a(k, eVar.d());
            w47Var.a(l, eVar.f());
            w47Var.e(m, eVar.h());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* renamed from: u00$k */
    /* loaded from: classes2.dex */
    private static final class k implements v47<j12.e.d.a> {
        static final k a = new k();
        private static final hs3 b = hs3.d("execution");
        private static final hs3 c = hs3.d("customAttributes");
        private static final hs3 d = hs3.d("internalKeys");
        private static final hs3 e = hs3.d("background");
        private static final hs3 f = hs3.d("currentProcessDetails");
        private static final hs3 g = hs3.d("appProcessDetails");
        private static final hs3 h = hs3.d("uiOrientation");

        private k() {
        }

        @Override // defpackage.v47
        /* renamed from: b */
        public void a(j12.e.d.a aVar, w47 w47Var) throws IOException {
            w47Var.a(b, aVar.f());
            w47Var.a(c, aVar.e());
            w47Var.a(d, aVar.g());
            w47Var.a(e, aVar.c());
            w47Var.a(f, aVar.d());
            w47Var.a(g, aVar.b());
            w47Var.e(h, aVar.h());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* renamed from: u00$l */
    /* loaded from: classes2.dex */
    private static final class l implements v47<j12.e.d.a.b.AbstractC0377a> {
        static final l a = new l();
        private static final hs3 b = hs3.d("baseAddress");
        private static final hs3 c = hs3.d("size");
        private static final hs3 d = hs3.d(Action.NAME_ATTRIBUTE);
        private static final hs3 e = hs3.d(MessageAttributes.UUID);

        private l() {
        }

        @Override // defpackage.v47
        /* renamed from: b */
        public void a(j12.e.d.a.b.AbstractC0377a abstractC0377a, w47 w47Var) throws IOException {
            w47Var.g(b, abstractC0377a.b());
            w47Var.g(c, abstractC0377a.d());
            w47Var.a(d, abstractC0377a.c());
            w47Var.a(e, abstractC0377a.f());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* renamed from: u00$m */
    /* loaded from: classes2.dex */
    private static final class m implements v47<j12.e.d.a.b> {
        static final m a = new m();
        private static final hs3 b = hs3.d("threads");
        private static final hs3 c = hs3.d("exception");
        private static final hs3 d = hs3.d("appExitInfo");
        private static final hs3 e = hs3.d("signal");
        private static final hs3 f = hs3.d("binaries");

        private m() {
        }

        @Override // defpackage.v47
        /* renamed from: b */
        public void a(j12.e.d.a.b bVar, w47 w47Var) throws IOException {
            w47Var.a(b, bVar.f());
            w47Var.a(c, bVar.d());
            w47Var.a(d, bVar.b());
            w47Var.a(e, bVar.e());
            w47Var.a(f, bVar.c());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* renamed from: u00$n */
    /* loaded from: classes2.dex */
    private static final class n implements v47<j12.e.d.a.b.c> {
        static final n a = new n();
        private static final hs3 b = hs3.d(MessageAttributes.TYPE);
        private static final hs3 c = hs3.d("reason");
        private static final hs3 d = hs3.d("frames");
        private static final hs3 e = hs3.d("causedBy");
        private static final hs3 f = hs3.d("overflowCount");

        private n() {
        }

        @Override // defpackage.v47
        /* renamed from: b */
        public void a(j12.e.d.a.b.c cVar, w47 w47Var) throws IOException {
            w47Var.a(b, cVar.f());
            w47Var.a(c, cVar.e());
            w47Var.a(d, cVar.c());
            w47Var.a(e, cVar.b());
            w47Var.e(f, cVar.d());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* renamed from: u00$o */
    /* loaded from: classes2.dex */
    private static final class o implements v47<j12.e.d.a.b.AbstractC0381d> {
        static final o a = new o();
        private static final hs3 b = hs3.d(Action.NAME_ATTRIBUTE);
        private static final hs3 c = hs3.d("code");
        private static final hs3 d = hs3.d("address");

        private o() {
        }

        @Override // defpackage.v47
        /* renamed from: b */
        public void a(j12.e.d.a.b.AbstractC0381d abstractC0381d, w47 w47Var) throws IOException {
            w47Var.a(b, abstractC0381d.d());
            w47Var.a(c, abstractC0381d.c());
            w47Var.g(d, abstractC0381d.b());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* renamed from: u00$p */
    /* loaded from: classes2.dex */
    private static final class p implements v47<j12.e.d.a.b.AbstractC0383e> {
        static final p a = new p();
        private static final hs3 b = hs3.d(Action.NAME_ATTRIBUTE);
        private static final hs3 c = hs3.d("importance");
        private static final hs3 d = hs3.d("frames");

        private p() {
        }

        @Override // defpackage.v47
        /* renamed from: b */
        public void a(j12.e.d.a.b.AbstractC0383e abstractC0383e, w47 w47Var) throws IOException {
            w47Var.a(b, abstractC0383e.d());
            w47Var.e(c, abstractC0383e.c());
            w47Var.a(d, abstractC0383e.b());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* renamed from: u00$q */
    /* loaded from: classes2.dex */
    private static final class q implements v47<j12.e.d.a.b.AbstractC0383e.AbstractC0385b> {
        static final q a = new q();
        private static final hs3 b = hs3.d("pc");
        private static final hs3 c = hs3.d("symbol");
        private static final hs3 d = hs3.d(Action.FILE_ATTRIBUTE);
        private static final hs3 e = hs3.d("offset");
        private static final hs3 f = hs3.d("importance");

        private q() {
        }

        @Override // defpackage.v47
        /* renamed from: b */
        public void a(j12.e.d.a.b.AbstractC0383e.AbstractC0385b abstractC0385b, w47 w47Var) throws IOException {
            w47Var.g(b, abstractC0385b.e());
            w47Var.a(c, abstractC0385b.f());
            w47Var.a(d, abstractC0385b.b());
            w47Var.g(e, abstractC0385b.d());
            w47Var.e(f, abstractC0385b.c());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* renamed from: u00$r */
    /* loaded from: classes2.dex */
    private static final class r implements v47<j12.e.d.a.c> {
        static final r a = new r();
        private static final hs3 b = hs3.d("processName");
        private static final hs3 c = hs3.d("pid");
        private static final hs3 d = hs3.d("importance");
        private static final hs3 e = hs3.d("defaultProcess");

        private r() {
        }

        @Override // defpackage.v47
        /* renamed from: b */
        public void a(j12.e.d.a.c cVar, w47 w47Var) throws IOException {
            w47Var.a(b, cVar.d());
            w47Var.e(c, cVar.c());
            w47Var.e(d, cVar.b());
            w47Var.d(e, cVar.e());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* renamed from: u00$s */
    /* loaded from: classes2.dex */
    private static final class s implements v47<j12.e.d.c> {
        static final s a = new s();
        private static final hs3 b = hs3.d("batteryLevel");
        private static final hs3 c = hs3.d("batteryVelocity");
        private static final hs3 d = hs3.d("proximityOn");
        private static final hs3 e = hs3.d("orientation");
        private static final hs3 f = hs3.d("ramUsed");
        private static final hs3 g = hs3.d("diskUsed");

        private s() {
        }

        @Override // defpackage.v47
        /* renamed from: b */
        public void a(j12.e.d.c cVar, w47 w47Var) throws IOException {
            w47Var.a(b, cVar.b());
            w47Var.e(c, cVar.c());
            w47Var.d(d, cVar.g());
            w47Var.e(e, cVar.e());
            w47Var.g(f, cVar.f());
            w47Var.g(g, cVar.d());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* renamed from: u00$t */
    /* loaded from: classes2.dex */
    private static final class t implements v47<j12.e.d> {
        static final t a = new t();
        private static final hs3 b = hs3.d("timestamp");
        private static final hs3 c = hs3.d(MessageAttributes.TYPE);
        private static final hs3 d = hs3.d("app");
        private static final hs3 e = hs3.d("device");
        private static final hs3 f = hs3.d("log");
        private static final hs3 g = hs3.d("rollouts");

        private t() {
        }

        @Override // defpackage.v47
        /* renamed from: b */
        public void a(j12.e.d dVar, w47 w47Var) throws IOException {
            w47Var.g(b, dVar.f());
            w47Var.a(c, dVar.g());
            w47Var.a(d, dVar.b());
            w47Var.a(e, dVar.c());
            w47Var.a(f, dVar.d());
            w47Var.a(g, dVar.e());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* renamed from: u00$u */
    /* loaded from: classes2.dex */
    private static final class u implements v47<j12.e.d.AbstractC0388d> {
        static final u a = new u();
        private static final hs3 b = hs3.d(RemoteMessageConst.Notification.CONTENT);

        private u() {
        }

        @Override // defpackage.v47
        /* renamed from: b */
        public void a(j12.e.d.AbstractC0388d abstractC0388d, w47 w47Var) throws IOException {
            w47Var.a(b, abstractC0388d.b());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* renamed from: u00$v */
    /* loaded from: classes2.dex */
    private static final class v implements v47<j12.e.d.AbstractC0389e> {
        static final v a = new v();
        private static final hs3 b = hs3.d("rolloutVariant");
        private static final hs3 c = hs3.d("parameterKey");
        private static final hs3 d = hs3.d("parameterValue");
        private static final hs3 e = hs3.d("templateVersion");

        private v() {
        }

        @Override // defpackage.v47
        /* renamed from: b */
        public void a(j12.e.d.AbstractC0389e abstractC0389e, w47 w47Var) throws IOException {
            w47Var.a(b, abstractC0389e.d());
            w47Var.a(c, abstractC0389e.b());
            w47Var.a(d, abstractC0389e.c());
            w47Var.g(e, abstractC0389e.e());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* renamed from: u00$w */
    /* loaded from: classes2.dex */
    private static final class w implements v47<j12.e.d.AbstractC0389e.b> {
        static final w a = new w();
        private static final hs3 b = hs3.d("rolloutId");
        private static final hs3 c = hs3.d("variantId");

        private w() {
        }

        @Override // defpackage.v47
        /* renamed from: b */
        public void a(j12.e.d.AbstractC0389e.b bVar, w47 w47Var) throws IOException {
            w47Var.a(b, bVar.b());
            w47Var.a(c, bVar.c());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* renamed from: u00$x */
    /* loaded from: classes2.dex */
    private static final class x implements v47<j12.e.d.f> {
        static final x a = new x();
        private static final hs3 b = hs3.d("assignments");

        private x() {
        }

        @Override // defpackage.v47
        /* renamed from: b */
        public void a(j12.e.d.f fVar, w47 w47Var) throws IOException {
            w47Var.a(b, fVar.b());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* renamed from: u00$y */
    /* loaded from: classes2.dex */
    private static final class y implements v47<j12.e.AbstractC0390e> {
        static final y a = new y();
        private static final hs3 b = hs3.d("platform");
        private static final hs3 c = hs3.d("version");
        private static final hs3 d = hs3.d("buildVersion");
        private static final hs3 e = hs3.d("jailbroken");

        private y() {
        }

        @Override // defpackage.v47
        /* renamed from: b */
        public void a(j12.e.AbstractC0390e abstractC0390e, w47 w47Var) throws IOException {
            w47Var.e(b, abstractC0390e.c());
            w47Var.a(c, abstractC0390e.d());
            w47Var.a(d, abstractC0390e.b());
            w47Var.d(e, abstractC0390e.e());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* renamed from: u00$z */
    /* loaded from: classes2.dex */
    private static final class z implements v47<j12.e.f> {
        static final z a = new z();
        private static final hs3 b = hs3.d("identifier");

        private z() {
        }

        @Override // defpackage.v47
        /* renamed from: b */
        public void a(j12.e.f fVar, w47 w47Var) throws IOException {
            w47Var.a(b, fVar.b());
        }
    }

    private u00() {
    }

    @Override // defpackage.hq1
    public void a(ch3<?> ch3Var) {
        d dVar = d.a;
        ch3Var.a(j12.class, dVar);
        ch3Var.a(l10.class, dVar);
        j jVar = j.a;
        ch3Var.a(j12.e.class, jVar);
        ch3Var.a(s10.class, jVar);
        g gVar = g.a;
        ch3Var.a(j12.e.a.class, gVar);
        ch3Var.a(t10.class, gVar);
        h hVar = h.a;
        ch3Var.a(j12.e.a.b.class, hVar);
        ch3Var.a(u10.class, hVar);
        z zVar = z.a;
        ch3Var.a(j12.e.f.class, zVar);
        ch3Var.a(l20.class, zVar);
        y yVar = y.a;
        ch3Var.a(j12.e.AbstractC0390e.class, yVar);
        ch3Var.a(k20.class, yVar);
        i iVar = i.a;
        ch3Var.a(j12.e.c.class, iVar);
        ch3Var.a(v10.class, iVar);
        t tVar = t.a;
        ch3Var.a(j12.e.d.class, tVar);
        ch3Var.a(w10.class, tVar);
        k kVar = k.a;
        ch3Var.a(j12.e.d.a.class, kVar);
        ch3Var.a(x10.class, kVar);
        m mVar = m.a;
        ch3Var.a(j12.e.d.a.b.class, mVar);
        ch3Var.a(y10.class, mVar);
        p pVar = p.a;
        ch3Var.a(j12.e.d.a.b.AbstractC0383e.class, pVar);
        ch3Var.a(c20.class, pVar);
        q qVar = q.a;
        ch3Var.a(j12.e.d.a.b.AbstractC0383e.AbstractC0385b.class, qVar);
        ch3Var.a(d20.class, qVar);
        n nVar = n.a;
        ch3Var.a(j12.e.d.a.b.c.class, nVar);
        ch3Var.a(a20.class, nVar);
        b bVar = b.a;
        ch3Var.a(j12.a.class, bVar);
        ch3Var.a(n10.class, bVar);
        a aVar = a.a;
        ch3Var.a(j12.a.AbstractC0373a.class, aVar);
        ch3Var.a(o10.class, aVar);
        o oVar = o.a;
        ch3Var.a(j12.e.d.a.b.AbstractC0381d.class, oVar);
        ch3Var.a(b20.class, oVar);
        l lVar = l.a;
        ch3Var.a(j12.e.d.a.b.AbstractC0377a.class, lVar);
        ch3Var.a(z10.class, lVar);
        c cVar = c.a;
        ch3Var.a(j12.c.class, cVar);
        ch3Var.a(p10.class, cVar);
        r rVar = r.a;
        ch3Var.a(j12.e.d.a.c.class, rVar);
        ch3Var.a(e20.class, rVar);
        s sVar = s.a;
        ch3Var.a(j12.e.d.c.class, sVar);
        ch3Var.a(f20.class, sVar);
        u uVar = u.a;
        ch3Var.a(j12.e.d.AbstractC0388d.class, uVar);
        ch3Var.a(g20.class, uVar);
        x xVar = x.a;
        ch3Var.a(j12.e.d.f.class, xVar);
        ch3Var.a(j20.class, xVar);
        v vVar = v.a;
        ch3Var.a(j12.e.d.AbstractC0389e.class, vVar);
        ch3Var.a(h20.class, vVar);
        w wVar = w.a;
        ch3Var.a(j12.e.d.AbstractC0389e.b.class, wVar);
        ch3Var.a(i20.class, wVar);
        e eVar = e.a;
        ch3Var.a(j12.d.class, eVar);
        ch3Var.a(q10.class, eVar);
        f fVar = f.a;
        ch3Var.a(j12.d.b.class, fVar);
        ch3Var.a(r10.class, fVar);
    }
}
