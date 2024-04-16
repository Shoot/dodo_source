package defpackage;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.inappstory.sdk.stories.api.models.Image;
import java.math.BigInteger;
import java.net.ProtocolException;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
/* compiled from: CertificateAdapters.kt */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b@\u0010AR \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0005R \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00150\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\fR \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00180\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0019\u0010\f\u001a\u0004\b\u000e\u0010\u0013R \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001b0\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001c\u0010\f\u001a\u0004\b\u0011\u0010\u0013R2\u0010!\u001a\u001a\u0012\u0016\u0012\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001e0\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0005\u001a\u0004\b \u0010\u0007R2\u0010$\u001a \u0012\u001c\u0012\u001a\u0012\u0016\u0012\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001e0\"0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\fR\u001c\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\fR \u0010*\u001a\b\u0012\u0004\u0012\u00020'0\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b(\u0010\f\u001a\u0004\b)\u0010\u0013R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020+0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010\fR,\u0010/\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0\"0\"0\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b.\u0010\f\u001a\u0004\b\u0016\u0010\u0013R2\u00102\u001a\u001a\u0012\u0016\u0012\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001e0\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b0\u0010\u0005\u001a\u0004\b1\u0010\u0007R \u00105\u001a\b\u0012\u0004\u0012\u0002030\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b4\u0010\f\u001a\u0004\b\u0019\u0010\u0013R \u00108\u001a\b\u0012\u0004\u0012\u0002060\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b7\u0010\f\u001a\u0004\b\u001c\u0010\u0013R \u0010;\u001a\b\u0012\u0004\u0012\u0002090\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b:\u0010\f\u001a\u0004\b\u000b\u0010\u0013R \u0010?\u001a\b\u0012\u0004\u0012\u00020<0\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b=\u0010\f\u001a\u0004\b>\u0010\u0013¨\u0006B"}, d2 = {"Ldu0;", "", "Lm03;", "", "b", "Lm03;", "getTime$okhttp_tls", "()Lm03;", CrashHianalyticsData.TIME, "Ld90;", "Lawb;", com.huawei.hms.opendevice.c.a, "Ld90;", "validity", DateTokenConverter.CONVERTER_KEY, "algorithmParameters", "Lfb;", com.huawei.hms.push.e.a, "getAlgorithmIdentifier$okhttp_tls", "()Ld90;", "algorithmIdentifier", "Lc90;", "f", "basicConstraints", "", "g", "generalNameDnsName", "Llk0;", Image.TYPE_HIGH, "generalNameIpAddress", "Lkotlin/Pair;", "i", "getGeneralName$okhttp_tls", "generalName", "", "j", "subjectAlternativeName", "k", "extensionValue", "Lqn3;", "l", "getExtension$okhttp_tls", "extension", "Lgz;", Image.TYPE_MEDIUM, "attributeTypeAndValue", "n", "rdnSequence", "o", "getName$okhttp_tls", Action.NAME_ATTRIBUTE, "Lc1b;", "p", "subjectPublicKeyInfo", "Lg8b;", "q", "tbsCertificate", "Lcu0;", "r", "certificate", "Lek8;", Image.TYPE_SMALL, "getPrivateKeyInfo$okhttp_tls", "privateKeyInfo", "<init>", "()V", "okhttp-tls"}, k = 1, mv = {1, 9, 0})
/* renamed from: du0  reason: default package */
/* loaded from: classes3.dex */
public final class du0 {
    public static final du0 a = new du0();
    private static final m03<Long> b;
    private static final d90<awb> c;
    private static final m03<Object> d;
    private static final d90<fb> e;
    private static final d90<c90> f;
    private static final d90<String> g;
    private static final d90<lk0> h;
    private static final m03<Pair<m03<?>, Object>> i;
    private static final d90<List<Pair<m03<?>, Object>>> j;
    private static final d90<Object> k;
    private static final d90<qn3> l;
    private static final d90<gz> m;
    private static final d90<List<List<gz>>> n;
    private static final m03<Pair<m03<?>, Object>> o;
    private static final d90<c1b> p;
    private static final d90<g8b> q;
    private static final d90<cu0> r;
    private static final d90<ek8> s;

    /* compiled from: CertificateAdapters.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lfb;", "it", "", "a", "(Lfb;)Ljava/util/List;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: du0$a */
    /* loaded from: classes3.dex */
    static final class a extends ej5 implements Function1<fb, List<?>> {
        public static final a a = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final List<?> invoke(fb fbVar) {
            List<?> o;
            z65.h(fbVar, "it");
            o = kc1.o(fbVar.a(), fbVar.b());
            return o;
        }
    }

    /* compiled from: CertificateAdapters.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lfb;", "a", "(Ljava/util/List;)Lfb;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: du0$b */
    /* loaded from: classes3.dex */
    static final class b extends ej5 implements Function1<List<?>, fb> {
        public static final b a = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final fb invoke(List<?> list) {
            z65.h(list, "it");
            Object obj = list.get(0);
            z65.f(obj, "null cannot be cast to non-null type kotlin.String");
            return new fb((String) obj, list.get(1));
        }
    }

    /* compiled from: CertificateAdapters.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "typeHint", "Lm03;", "a", "(Ljava/lang/Object;)Lm03;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: du0$c */
    /* loaded from: classes3.dex */
    static final class c extends ej5 implements Function1<Object, m03<?>> {
        public static final c a = new c();

        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final m03<?> invoke(Object obj) {
            if (z65.c(obj, "1.2.840.113549.1.1.11")) {
                return n6.a.m();
            }
            if (z65.c(obj, "1.2.840.113549.1.1.1")) {
                return n6.a.m();
            }
            if (z65.c(obj, "1.2.840.10045.2.1")) {
                return n6.a.n();
            }
            return null;
        }
    }

    /* compiled from: CertificateAdapters.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lgz;", "it", "", "a", "(Lgz;)Ljava/util/List;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: du0$d */
    /* loaded from: classes3.dex */
    static final class d extends ej5 implements Function1<gz, List<?>> {
        public static final d a = new d();

        d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final List<?> invoke(gz gzVar) {
            List<?> o;
            z65.h(gzVar, "it");
            o = kc1.o(gzVar.a(), gzVar.b());
            return o;
        }
    }

    /* compiled from: CertificateAdapters.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lgz;", "a", "(Ljava/util/List;)Lgz;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: du0$e */
    /* loaded from: classes3.dex */
    static final class e extends ej5 implements Function1<List<?>, gz> {
        public static final e a = new e();

        e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final gz invoke(List<?> list) {
            z65.h(list, "it");
            Object obj = list.get(0);
            z65.f(obj, "null cannot be cast to non-null type kotlin.String");
            return new gz((String) obj, list.get(1));
        }
    }

    /* compiled from: CertificateAdapters.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc90;", "it", "", "a", "(Lc90;)Ljava/util/List;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: du0$f */
    /* loaded from: classes3.dex */
    static final class f extends ej5 implements Function1<c90, List<?>> {
        public static final f a = new f();

        f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final List<?> invoke(c90 c90Var) {
            List<?> o;
            z65.h(c90Var, "it");
            o = kc1.o(Boolean.valueOf(c90Var.a()), c90Var.b());
            return o;
        }
    }

    /* compiled from: CertificateAdapters.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lc90;", "a", "(Ljava/util/List;)Lc90;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: du0$g */
    /* loaded from: classes3.dex */
    static final class g extends ej5 implements Function1<List<?>, c90> {
        public static final g a = new g();

        g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final c90 invoke(List<?> list) {
            z65.h(list, "it");
            Object obj = list.get(0);
            z65.f(obj, "null cannot be cast to non-null type kotlin.Boolean");
            return new c90(((Boolean) obj).booleanValue(), (Long) list.get(1));
        }
    }

    /* compiled from: CertificateAdapters.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcu0;", "it", "", "a", "(Lcu0;)Ljava/util/List;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: du0$h */
    /* loaded from: classes3.dex */
    static final class h extends ej5 implements Function1<cu0, List<?>> {
        public static final h a = new h();

        h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final List<?> invoke(cu0 cu0Var) {
            List<?> o;
            z65.h(cu0Var, "it");
            o = kc1.o(cu0Var.c(), cu0Var.a(), cu0Var.b());
            return o;
        }
    }

    /* compiled from: CertificateAdapters.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lcu0;", "a", "(Ljava/util/List;)Lcu0;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: du0$i */
    /* loaded from: classes3.dex */
    static final class i extends ej5 implements Function1<List<?>, cu0> {
        public static final i a = new i();

        i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final cu0 invoke(List<?> list) {
            z65.h(list, "it");
            Object obj = list.get(0);
            z65.f(obj, "null cannot be cast to non-null type okhttp3.tls.internal.der.TbsCertificate");
            Object obj2 = list.get(1);
            z65.f(obj2, "null cannot be cast to non-null type okhttp3.tls.internal.der.AlgorithmIdentifier");
            Object obj3 = list.get(2);
            z65.f(obj3, "null cannot be cast to non-null type okhttp3.tls.internal.der.BitString");
            return new cu0((g8b) obj, (fb) obj2, (pb0) obj3);
        }
    }

    /* compiled from: CertificateAdapters.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lqn3;", "it", "", "a", "(Lqn3;)Ljava/util/List;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: du0$j */
    /* loaded from: classes3.dex */
    static final class j extends ej5 implements Function1<qn3, List<?>> {
        public static final j a = new j();

        j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final List<?> invoke(qn3 qn3Var) {
            List<?> o;
            z65.h(qn3Var, "it");
            o = kc1.o(qn3Var.b(), Boolean.valueOf(qn3Var.a()), qn3Var.c());
            return o;
        }
    }

    /* compiled from: CertificateAdapters.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lqn3;", "a", "(Ljava/util/List;)Lqn3;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: du0$k */
    /* loaded from: classes3.dex */
    static final class k extends ej5 implements Function1<List<?>, qn3> {
        public static final k a = new k();

        k() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final qn3 invoke(List<?> list) {
            z65.h(list, "it");
            Object obj = list.get(0);
            z65.f(obj, "null cannot be cast to non-null type kotlin.String");
            Object obj2 = list.get(1);
            z65.f(obj2, "null cannot be cast to non-null type kotlin.Boolean");
            return new qn3((String) obj, ((Boolean) obj2).booleanValue(), list.get(2));
        }
    }

    /* compiled from: CertificateAdapters.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "typeHint", "Lm03;", "a", "(Ljava/lang/Object;)Lm03;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: du0$l */
    /* loaded from: classes3.dex */
    static final class l extends ej5 implements Function1<Object, m03<?>> {
        public static final l a = new l();

        l() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final m03<?> invoke(Object obj) {
            if (z65.c(obj, "2.5.29.17")) {
                return du0.j;
            }
            if (z65.c(obj, "2.5.29.19")) {
                return du0.f;
            }
            return null;
        }
    }

    /* compiled from: CertificateAdapters.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lek8;", "it", "", "a", "(Lek8;)Ljava/util/List;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: du0$m */
    /* loaded from: classes3.dex */
    static final class m extends ej5 implements Function1<ek8, List<?>> {
        public static final m a = new m();

        m() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final List<?> invoke(ek8 ek8Var) {
            List<?> o;
            z65.h(ek8Var, "it");
            o = kc1.o(Long.valueOf(ek8Var.c()), ek8Var.a(), ek8Var.b());
            return o;
        }
    }

    /* compiled from: CertificateAdapters.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lek8;", "a", "(Ljava/util/List;)Lek8;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: du0$n */
    /* loaded from: classes3.dex */
    static final class n extends ej5 implements Function1<List<?>, ek8> {
        public static final n a = new n();

        n() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final ek8 invoke(List<?> list) {
            z65.h(list, "it");
            Object obj = list.get(0);
            z65.f(obj, "null cannot be cast to non-null type kotlin.Long");
            long longValue = ((Long) obj).longValue();
            Object obj2 = list.get(1);
            z65.f(obj2, "null cannot be cast to non-null type okhttp3.tls.internal.der.AlgorithmIdentifier");
            Object obj3 = list.get(2);
            z65.f(obj3, "null cannot be cast to non-null type okio.ByteString");
            return new ek8(longValue, (fb) obj2, (lk0) obj3);
        }
    }

    /* compiled from: CertificateAdapters.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc1b;", "it", "", "a", "(Lc1b;)Ljava/util/List;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: du0$o */
    /* loaded from: classes3.dex */
    static final class o extends ej5 implements Function1<c1b, List<?>> {
        public static final o a = new o();

        o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final List<?> invoke(c1b c1bVar) {
            List<?> o;
            z65.h(c1bVar, "it");
            o = kc1.o(c1bVar.a(), c1bVar.b());
            return o;
        }
    }

    /* compiled from: CertificateAdapters.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lc1b;", "a", "(Ljava/util/List;)Lc1b;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: du0$p */
    /* loaded from: classes3.dex */
    static final class p extends ej5 implements Function1<List<?>, c1b> {
        public static final p a = new p();

        p() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final c1b invoke(List<?> list) {
            z65.h(list, "it");
            Object obj = list.get(0);
            z65.f(obj, "null cannot be cast to non-null type okhttp3.tls.internal.der.AlgorithmIdentifier");
            Object obj2 = list.get(1);
            z65.f(obj2, "null cannot be cast to non-null type okhttp3.tls.internal.der.BitString");
            return new c1b((fb) obj, (pb0) obj2);
        }
    }

    /* compiled from: CertificateAdapters.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lg8b;", "it", "", "a", "(Lg8b;)Ljava/util/List;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: du0$q */
    /* loaded from: classes3.dex */
    static final class q extends ej5 implements Function1<g8b, List<?>> {
        public static final q a = new q();

        q() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final List<?> invoke(g8b g8bVar) {
            List<?> o;
            z65.h(g8bVar, "it");
            du0 du0Var = du0.a;
            o = kc1.o(Long.valueOf(g8bVar.k()), g8bVar.d(), g8bVar.e(), lnb.a(du0Var.f(), g8bVar.b()), g8bVar.j(), lnb.a(du0Var.f(), g8bVar.g()), g8bVar.h(), g8bVar.c(), g8bVar.i(), g8bVar.a());
            return o;
        }
    }

    /* compiled from: CertificateAdapters.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lg8b;", "a", "(Ljava/util/List;)Lg8b;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: du0$r */
    /* loaded from: classes3.dex */
    static final class r extends ej5 implements Function1<List<?>, g8b> {
        public static final r a = new r();

        r() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final g8b invoke(List<?> list) {
            z65.h(list, "it");
            Object obj = list.get(0);
            z65.f(obj, "null cannot be cast to non-null type kotlin.Long");
            long longValue = ((Long) obj).longValue();
            Object obj2 = list.get(1);
            z65.f(obj2, "null cannot be cast to non-null type java.math.BigInteger");
            BigInteger bigInteger = (BigInteger) obj2;
            Object obj3 = list.get(2);
            z65.f(obj3, "null cannot be cast to non-null type okhttp3.tls.internal.der.AlgorithmIdentifier");
            fb fbVar = (fb) obj3;
            Object obj4 = list.get(3);
            z65.f(obj4, "null cannot be cast to non-null type kotlin.Pair<*, *>");
            Object d = ((Pair) obj4).d();
            z65.f(d, "null cannot be cast to non-null type kotlin.collections.List<kotlin.collections.List<okhttp3.tls.internal.der.AttributeTypeAndValue>>");
            List list2 = (List) d;
            Object obj5 = list.get(4);
            z65.f(obj5, "null cannot be cast to non-null type okhttp3.tls.internal.der.Validity");
            awb awbVar = (awb) obj5;
            Object obj6 = list.get(5);
            z65.f(obj6, "null cannot be cast to non-null type kotlin.Pair<*, *>");
            Object d2 = ((Pair) obj6).d();
            z65.f(d2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.collections.List<okhttp3.tls.internal.der.AttributeTypeAndValue>>");
            List list3 = (List) d2;
            Object obj7 = list.get(6);
            z65.f(obj7, "null cannot be cast to non-null type okhttp3.tls.internal.der.SubjectPublicKeyInfo");
            Object obj8 = list.get(9);
            z65.f(obj8, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.tls.internal.der.Extension>");
            return new g8b(longValue, bigInteger, fbVar, list2, awbVar, list3, (c1b) obj7, (pb0) list.get(7), (pb0) list.get(8), (List) obj8);
        }
    }

    /* compiled from: CertificateAdapters.kt */
    @Metadata(d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0017\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0002H\u0016¨\u0006\u0010"}, d2 = {"du0$s", "Lm03;", "", "Ln03;", "header", "", "b", "Lo03;", "reader", "f", "(Lo03;)Ljava/lang/Long;", "Lp03;", "writer", "value", "", "g", "okhttp-tls"}, k = 1, mv = {1, 9, 0})
    /* renamed from: du0$s */
    /* loaded from: classes3.dex */
    public static final class s implements m03<Long> {
        s() {
        }

        @Override // defpackage.m03
        public boolean b(n03 n03Var) {
            z65.h(n03Var, "header");
            n6 n6Var = n6.a;
            if (!n6Var.q().b(n03Var) && !n6Var.i().b(n03Var)) {
                return false;
            }
            return true;
        }

        @Override // defpackage.m03
        public /* synthetic */ d90<Long> c(int i, long j, Boolean bool) {
            return l03.e(this, i, j, bool);
        }

        @Override // defpackage.m03
        public /* synthetic */ d90<List<Long>> d(String str, int i, long j) {
            return l03.a(this, str, i, j);
        }

        @Override // defpackage.m03
        public /* bridge */ /* synthetic */ void e(p03 p03Var, Long l) {
            g(p03Var, l.longValue());
        }

        @Override // defpackage.m03
        /* renamed from: f */
        public Long a(o03 o03Var) {
            long longValue;
            z65.h(o03Var, "reader");
            n03 m = o03Var.m();
            if (m != null) {
                int d = m.d();
                n6 n6Var = n6.a;
                if (d == n6Var.q().m() && m.c() == n6Var.q().l()) {
                    longValue = n6Var.q().a(o03Var).longValue();
                } else if (m.d() == n6Var.i().m() && m.c() == n6Var.i().l()) {
                    longValue = n6Var.i().a(o03Var).longValue();
                } else {
                    throw new ProtocolException("expected time but was " + m + " at " + o03Var);
                }
                return Long.valueOf(longValue);
            }
            throw new ProtocolException("expected time but was exhausted at " + o03Var);
        }

        public void g(p03 p03Var, long j) {
            z65.h(p03Var, "writer");
            if (-631152000000L <= j && j < 2524608000000L) {
                n6.a.q().e(p03Var, Long.valueOf(j));
            } else {
                n6.a.i().e(p03Var, Long.valueOf(j));
            }
        }
    }

    /* compiled from: CertificateAdapters.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lawb;", "it", "", "a", "(Lawb;)Ljava/util/List;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: du0$t */
    /* loaded from: classes3.dex */
    static final class t extends ej5 implements Function1<awb, List<?>> {
        public static final t a = new t();

        t() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final List<?> invoke(awb awbVar) {
            List<?> o;
            z65.h(awbVar, "it");
            o = kc1.o(Long.valueOf(awbVar.b()), Long.valueOf(awbVar.a()));
            return o;
        }
    }

    /* compiled from: CertificateAdapters.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lawb;", "a", "(Ljava/util/List;)Lawb;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: du0$u */
    /* loaded from: classes3.dex */
    static final class u extends ej5 implements Function1<List<?>, awb> {
        public static final u a = new u();

        u() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final awb invoke(List<?> list) {
            z65.h(list, "it");
            Object obj = list.get(0);
            z65.f(obj, "null cannot be cast to non-null type kotlin.Long");
            long longValue = ((Long) obj).longValue();
            Object obj2 = list.get(1);
            z65.f(obj2, "null cannot be cast to non-null type kotlin.Long");
            return new awb(longValue, ((Long) obj2).longValue());
        }
    }

    static {
        List l2;
        s sVar = new s();
        b = sVar;
        n6 n6Var = n6.a;
        d90<awb> u2 = n6Var.u("Validity", new m03[]{sVar, sVar}, t.a, u.a);
        c = u2;
        m03<?> v = n6Var.v(c.a);
        d = v;
        d90<fb> u3 = n6Var.u("AlgorithmIdentifier", new m03[]{n6Var.n().h(), v}, a.a, b.a);
        e = u3;
        d90<Boolean> h2 = n6Var.h();
        Boolean bool = Boolean.FALSE;
        f = n6Var.u("BasicConstraints", new m03[]{h2.n(bool), d90.o(n6Var.l(), null, 1, null)}, f.a, g.a);
        d90<String> r2 = d90.r(n6Var.j(), 0, 2L, 1, null);
        g = r2;
        d90<lk0> r3 = d90.r(n6Var.o(), 0, 7L, 1, null);
        h = r3;
        m03<Pair<m03<?>, Object>> c2 = n6Var.c(r2, r3, n6Var.f());
        i = c2;
        j = l03.f(c2, null, 0, 0L, 7, null);
        d90<Object> c3 = n6Var.v(l.a).c(n6Var.o().m(), n6Var.o().l(), bool);
        k = c3;
        d90<qn3> u4 = n6Var.u("Extension", new m03[]{n6Var.n().h(), n6Var.h().n(bool), c3}, j.a, k.a);
        l = u4;
        d90<gz> u5 = n6Var.u("AttributeTypeAndValue", new m03[]{n6Var.n(), n6.b(n6Var, new Pair[]{lnb.a(bc9.b(String.class), n6Var.r()), lnb.a(bc9.b(Void.class), n6Var.p()), lnb.a(bc9.b(wl.class), n6Var.f())}, false, null, 6, null)}, d.a, e.a);
        m = u5;
        d90<List<List<gz>>> f2 = l03.f(u5.g(), null, 0, 0L, 7, null);
        n = f2;
        m03<Pair<m03<?>, Object>> c4 = n6Var.c(f2);
        o = c4;
        d90<c1b> u6 = n6Var.u("SubjectPublicKeyInfo", new m03[]{u3, n6Var.g()}, o.a, p.a);
        p = u6;
        d90 g2 = l03.g(l03.f(u4, null, 0, 0L, 7, null), 0, 3L, null, 5, null);
        l2 = kc1.l();
        d90<g8b> u7 = n6Var.u("TBSCertificate", new m03[]{l03.g(n6Var.l(), 0, 0L, null, 5, null).n(0L), n6Var.k(), u3, c4, u2, c4, u6, d90.o(d90.r(n6Var.g(), 0, 1L, 1, null), null, 1, null), d90.o(d90.r(n6Var.g(), 0, 2L, 1, null), null, 1, null), g2.n(l2)}, q.a, r.a);
        q = u7;
        r = n6Var.u("Certificate", new m03[]{u7, u3, n6Var.g()}, h.a, i.a);
        s = n6Var.u("PrivateKeyInfo", new m03[]{n6Var.l(), u3, n6Var.o()}, m.a, n.a);
    }

    private du0() {
    }

    public final d90<cu0> c() {
        return r;
    }

    public final d90<String> d() {
        return g;
    }

    public final d90<lk0> e() {
        return h;
    }

    public final d90<List<List<gz>>> f() {
        return n;
    }

    public final d90<c1b> g() {
        return p;
    }

    public final d90<g8b> h() {
        return q;
    }
}
