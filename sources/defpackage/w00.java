package defpackage;

import com.huawei.hms.push.constant.RemoteMessageConst;
import java.io.IOException;
/* compiled from: AutoProtoEncoderDoNotUseEncoder.java */
/* renamed from: w00  reason: default package */
/* loaded from: classes2.dex */
public final class w00 implements hq1 {
    public static final hq1 a = new w00();

    /* compiled from: AutoProtoEncoderDoNotUseEncoder.java */
    /* renamed from: w00$a */
    /* loaded from: classes2.dex */
    private static final class a implements v47<ei6> {
        static final a a = new a();
        private static final hs3 b = hs3.a("projectNumber").b(qy.b().c(1).a()).a();
        private static final hs3 c = hs3.a("messageId").b(qy.b().c(2).a()).a();
        private static final hs3 d = hs3.a("instanceId").b(qy.b().c(3).a()).a();
        private static final hs3 e = hs3.a("messageType").b(qy.b().c(4).a()).a();
        private static final hs3 f = hs3.a("sdkPlatform").b(qy.b().c(5).a()).a();
        private static final hs3 g = hs3.a("packageName").b(qy.b().c(6).a()).a();
        private static final hs3 h = hs3.a(RemoteMessageConst.COLLAPSE_KEY).b(qy.b().c(7).a()).a();
        private static final hs3 i = hs3.a("priority").b(qy.b().c(8).a()).a();
        private static final hs3 j = hs3.a(RemoteMessageConst.TTL).b(qy.b().c(9).a()).a();
        private static final hs3 k = hs3.a("topic").b(qy.b().c(10).a()).a();
        private static final hs3 l = hs3.a("bulkId").b(qy.b().c(11).a()).a();
        private static final hs3 m = hs3.a("event").b(qy.b().c(12).a()).a();
        private static final hs3 n = hs3.a("analyticsLabel").b(qy.b().c(13).a()).a();
        private static final hs3 o = hs3.a("campaignId").b(qy.b().c(14).a()).a();
        private static final hs3 p = hs3.a("composerLabel").b(qy.b().c(15).a()).a();

        private a() {
        }

        @Override // defpackage.v47
        /* renamed from: b */
        public void a(ei6 ei6Var, w47 w47Var) throws IOException {
            w47Var.g(b, ei6Var.l());
            w47Var.a(c, ei6Var.h());
            w47Var.a(d, ei6Var.g());
            w47Var.a(e, ei6Var.i());
            w47Var.a(f, ei6Var.m());
            w47Var.a(g, ei6Var.j());
            w47Var.a(h, ei6Var.d());
            w47Var.e(i, ei6Var.k());
            w47Var.e(j, ei6Var.o());
            w47Var.a(k, ei6Var.n());
            w47Var.g(l, ei6Var.b());
            w47Var.a(m, ei6Var.f());
            w47Var.a(n, ei6Var.a());
            w47Var.g(o, ei6Var.c());
            w47Var.a(p, ei6Var.e());
        }
    }

    /* compiled from: AutoProtoEncoderDoNotUseEncoder.java */
    /* renamed from: w00$b */
    /* loaded from: classes2.dex */
    private static final class b implements v47<fi6> {
        static final b a = new b();
        private static final hs3 b = hs3.a("messagingClientEvent").b(qy.b().c(1).a()).a();

        private b() {
        }

        @Override // defpackage.v47
        /* renamed from: b */
        public void a(fi6 fi6Var, w47 w47Var) throws IOException {
            w47Var.a(b, fi6Var.a());
        }
    }

    /* compiled from: AutoProtoEncoderDoNotUseEncoder.java */
    /* renamed from: w00$c */
    /* loaded from: classes2.dex */
    private static final class c implements v47<hr8> {
        static final c a = new c();
        private static final hs3 b = hs3.d("messagingClientEventExtension");

        private c() {
        }

        @Override // defpackage.v47
        /* renamed from: b */
        public void a(hr8 hr8Var, w47 w47Var) throws IOException {
            w47Var.a(b, hr8Var.b());
        }
    }

    private w00() {
    }

    @Override // defpackage.hq1
    public void a(ch3<?> ch3Var) {
        ch3Var.a(hr8.class, c.a);
        ch3Var.a(fi6.class, b.a);
        ch3Var.a(ei6.class, a.a);
    }
}
