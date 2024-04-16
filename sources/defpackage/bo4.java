package defpackage;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.lk0;
import java.math.BigInteger;
import java.net.InetAddress;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.cert.X509Certificate;
import java.security.interfaces.RSAPrivateKey;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: HeldCertificate.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0002\u0003\u0005B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u000b\u001a\u00020\b8\u0007¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\u0003\u0010\n¨\u0006\u000f"}, d2 = {"Lbo4;", "", "Ljava/security/KeyPair;", "a", "Ljava/security/KeyPair;", "b", "()Ljava/security/KeyPair;", "keyPair", "Ljava/security/cert/X509Certificate;", "Ljava/security/cert/X509Certificate;", "()Ljava/security/cert/X509Certificate;", "certificate", "<init>", "(Ljava/security/KeyPair;Ljava/security/cert/X509Certificate;)V", c.a, "okhttp-tls"}, k = 1, mv = {1, 9, 0})
/* renamed from: bo4  reason: default package */
/* loaded from: classes3.dex */
public final class bo4 {
    public static final b c = new b(null);
    private static final ec9 d = new ec9("-----BEGIN ([!-,.-~ ]*)-----([^-]*)-----END \\1-----");
    private final KeyPair a;
    private final X509Certificate b;

    /* compiled from: HeldCertificate.kt */
    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\n\u0018\u0000 02\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b.\u0010/J\u0014\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0002J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\b\u0010\u000e\u001a\u00020\nH\u0002J\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000fJ\u000e\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u000fJ\u0006\u0010\u0014\u001a\u00020\u0000J\u0006\u0010\u0016\u001a\u00020\u0015R\u0016\u0010\u0019\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0018R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0018R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u001bR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u001bR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001eR\u0018\u0010\"\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010!R\u0018\u0010$\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010#R\u0018\u0010&\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010%R\u0016\u0010)\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010(R\u0018\u0010+\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010\u001bR\u0016\u0010-\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010(¨\u00061"}, d2 = {"Lbo4$a;", "", "", "Lgz;", Image.TYPE_HIGH, "Lawb;", "i", "", "Lqn3;", e.a, "Ljava/security/KeyPair;", "signedByKeyPair", "Lfb;", "g", "f", "", "altName", "a", "cn", c.a, DateTokenConverter.CONVERTER_KEY, "Lbo4;", "b", "", "J", "notBefore", "notAfter", "Ljava/lang/String;", "commonName", "organizationalUnit", "Ljava/util/List;", "altNames", "Ljava/math/BigInteger;", "Ljava/math/BigInteger;", "serialNumber", "Ljava/security/KeyPair;", "keyPair", "Lbo4;", "signedBy", "", "I", "maxIntermediateCas", "j", "keyAlgorithm", "k", "keySize", "<init>", "()V", "l", "okhttp-tls"}, k = 1, mv = {1, 9, 0})
    /* renamed from: bo4$a */
    /* loaded from: classes3.dex */
    public static final class a {
        public static final C0071a l = new C0071a(null);
        private String c;
        private String d;
        private BigInteger f;
        private KeyPair g;
        private bo4 h;
        private String j;
        private int k;
        private long a = -1;
        private long b = -1;
        private final List<String> e = new ArrayList();
        private int i = -1;

        /* compiled from: HeldCertificate.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lbo4$a$a;", "", "", "DEFAULT_DURATION_MILLIS", "J", "<init>", "()V", "okhttp-tls"}, k = 1, mv = {1, 9, 0})
        /* renamed from: bo4$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0071a {
            private C0071a() {
            }

            public /* synthetic */ C0071a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public a() {
            d();
        }

        private final List<qn3> e() {
            int w;
            Pair a;
            ArrayList arrayList = new ArrayList();
            int i = this.i;
            if (i != -1) {
                arrayList.add(new qn3("2.5.29.19", true, new c90(true, Long.valueOf(i))));
            }
            if (!this.e.isEmpty()) {
                List<String> list = this.e;
                w = lc1.w(list, 10);
                ArrayList arrayList2 = new ArrayList(w);
                for (String str : list) {
                    if (rdc.a(str)) {
                        d90<lk0> e = du0.a.e();
                        lk0.a aVar = lk0.d;
                        byte[] address = InetAddress.getByName(str).getAddress();
                        z65.g(address, "getAddress(...)");
                        a = lnb.a(e, lk0.a.f(aVar, address, 0, 0, 3, null));
                    } else {
                        a = lnb.a(du0.a.d(), str);
                    }
                    arrayList2.add(a);
                }
                arrayList.add(new qn3("2.5.29.17", true, arrayList2));
            }
            return arrayList;
        }

        private final KeyPair f() {
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance(this.j);
            keyPairGenerator.initialize(this.k, new SecureRandom());
            KeyPair generateKeyPair = keyPairGenerator.generateKeyPair();
            z65.g(generateKeyPair, "run(...)");
            return generateKeyPair;
        }

        private final fb g(KeyPair keyPair) {
            if (keyPair.getPrivate() instanceof RSAPrivateKey) {
                return new fb("1.2.840.113549.1.1.11", null);
            }
            return new fb("1.2.840.10045.4.3.2", lk0.e);
        }

        private final List<List<gz>> h() {
            List e;
            List e2;
            ArrayList arrayList = new ArrayList();
            String str = this.d;
            if (str != null) {
                e2 = jc1.e(new gz("2.5.4.11", str));
                arrayList.add(e2);
            }
            String str2 = this.c;
            if (str2 == null) {
                str2 = UUID.randomUUID().toString();
                z65.g(str2, "toString(...)");
            }
            e = jc1.e(new gz("2.5.4.3", str2));
            arrayList.add(e);
            return arrayList;
        }

        private final awb i() {
            long j = this.a;
            if (j == -1) {
                j = System.currentTimeMillis();
            }
            long j2 = this.b;
            if (j2 == -1) {
                j2 = j + CoreConstants.MILLIS_IN_ONE_DAY;
            }
            return new awb(j, j2);
        }

        public final a a(String str) {
            z65.h(str, "altName");
            this.e.add(str);
            return this;
        }

        public final bo4 b() {
            KeyPair keyPair;
            List<List<gz>> list;
            KeyPair keyPair2 = this.g;
            if (keyPair2 == null) {
                keyPair2 = f();
            }
            du0 du0Var = du0.a;
            d90<c1b> g = du0Var.g();
            lk0.a aVar = lk0.d;
            byte[] encoded = keyPair2.getPublic().getEncoded();
            z65.g(encoded, "getEncoded(...)");
            c1b c1bVar = (c1b) g.k(lk0.a.f(aVar, encoded, 0, 0, 3, null));
            List<List<gz>> h = h();
            bo4 bo4Var = this.h;
            if (bo4Var != null) {
                z65.e(bo4Var);
                keyPair = bo4Var.b();
                d90<List<List<gz>>> f = du0Var.f();
                bo4 bo4Var2 = this.h;
                z65.e(bo4Var2);
                byte[] encoded2 = bo4Var2.a().getSubjectX500Principal().getEncoded();
                z65.g(encoded2, "getEncoded(...)");
                list = (List) f.k(lk0.a.f(aVar, encoded2, 0, 0, 3, null));
            } else {
                keyPair = keyPair2;
                list = h;
            }
            fb g2 = g(keyPair);
            BigInteger bigInteger = this.f;
            if (bigInteger == null) {
                bigInteger = BigInteger.ONE;
            }
            BigInteger bigInteger2 = bigInteger;
            z65.e(bigInteger2);
            g8b g8bVar = new g8b(2L, bigInteger2, g2, list, i(), h, c1bVar, null, null, e());
            Signature signature = Signature.getInstance(g8bVar.f());
            signature.initSign(keyPair.getPrivate());
            signature.update(du0Var.h().p(g8bVar).x0());
            byte[] sign = signature.sign();
            z65.g(sign, "sign(...)");
            return new bo4(keyPair2, new cu0(g8bVar, g2, new pb0(lk0.a.f(aVar, sign, 0, 0, 3, null), 0)).d());
        }

        public final a c(String str) {
            z65.h(str, "cn");
            this.c = str;
            return this;
        }

        public final a d() {
            this.j = "EC";
            this.k = 256;
            return this;
        }
    }

    /* compiled from: HeldCertificate.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lbo4$b;", "", "Lec9;", "PEM_REGEX", "Lec9;", "<init>", "()V", "okhttp-tls"}, k = 1, mv = {1, 9, 0})
    /* renamed from: bo4$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public bo4(KeyPair keyPair, X509Certificate x509Certificate) {
        z65.h(keyPair, "keyPair");
        z65.h(x509Certificate, "certificate");
        this.a = keyPair;
        this.b = x509Certificate;
    }

    public final X509Certificate a() {
        return this.b;
    }

    public final KeyPair b() {
        return this.a;
    }
}
