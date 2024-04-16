package defpackage;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: ConnectionSpec.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000b2\u00020\u0001:\u0002\u0012\bB9\b\u0000\u0012\u0006\u0010\u0016\u001a\u00020\u0004\u0012\u0006\u0010\u0018\u001a\u00020\u0004\u0012\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0019\u0012\u000e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0019¢\u0006\u0004\b'\u0010(J\u0018\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0002J\u0013\u0010\r\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016R\u0017\u0010\u0016\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0018\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\"\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u00198\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001bR\u0019\u0010#\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010 8G¢\u0006\u0006\u001a\u0004\b\u001a\u0010\"R\u0019\u0010&\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010 8G¢\u0006\u0006\u001a\u0004\b%\u0010\"¨\u0006)"}, d2 = {"Lsq1;", "", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "isFallback", "g", "", "b", "(Ljavax/net/ssl/SSLSocket;Z)V", "socket", e.a, "other", "equals", "", "hashCode", "", "toString", "a", "Z", "f", "()Z", "isTls", Image.TYPE_HIGH, "supportsTlsExtensions", "", c.a, "[Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "()[Ljava/lang/String;", "cipherSuitesAsString", "tlsVersionsAsString", "", "Lw71;", "()Ljava/util/List;", "cipherSuites", "Lmhb;", "i", "tlsVersions", "<init>", "(ZZ[Ljava/lang/String;[Ljava/lang/String;)V", "okhttp"}, k = 1, mv = {1, 9, 0})
/* renamed from: sq1  reason: default package */
/* loaded from: classes3.dex */
public final class sq1 {
    public static final b e = new b(null);
    private static final List<w71> f;
    private static final List<w71> g;
    public static final sq1 h;
    public static final sq1 i;
    public static final sq1 j;
    public static final sq1 k;
    private final boolean a;
    private final boolean b;
    private final String[] c;
    private final String[] d;

    /* compiled from: ConnectionSpec.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u00002\u00020\u0001B\u0011\b\u0010\u0012\u0006\u0010\u0019\u001a\u00020\u000f¢\u0006\u0004\b#\u0010\u0018B\u0011\b\u0016\u0012\u0006\u0010$\u001a\u00020\u0012¢\u0006\u0004\b#\u0010%J!\u0010\u0005\u001a\u00020\u00002\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\"\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\b\u001a\u00020\u00002\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0002\"\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ!\u0010\f\u001a\u00020\u00002\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\u0002\"\u00020\n¢\u0006\u0004\b\f\u0010\rJ!\u0010\u000e\u001a\u00020\u00002\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0002\"\u00020\u0007¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000fH\u0007J\u0006\u0010\u0013\u001a\u00020\u0012R\"\u0010\u0019\u001a\u00020\u000f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R*\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR*\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001f\u0010\u001c\"\u0004\b \u0010\u001eR\"\u0010\u0010\u001a\u00020\u000f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0014\u001a\u0004\b!\u0010\u0016\"\u0004\b\"\u0010\u0018¨\u0006&"}, d2 = {"Lsq1$a;", "", "", "Lw71;", "cipherSuites", "b", "([Lw71;)Lsq1$a;", "", c.a, "([Ljava/lang/String;)Lsq1$a;", "Lmhb;", "tlsVersions", e.a, "([Lmhb;)Lsq1$a;", "f", "", "supportsTlsExtensions", DateTokenConverter.CONVERTER_KEY, "Lsq1;", "a", "Z", "getTls$okhttp", "()Z", "setTls$okhttp", "(Z)V", "tls", "[Ljava/lang/String;", "getCipherSuites$okhttp", "()[Ljava/lang/String;", "setCipherSuites$okhttp", "([Ljava/lang/String;)V", "getTlsVersions$okhttp", "setTlsVersions$okhttp", "getSupportsTlsExtensions$okhttp", "setSupportsTlsExtensions$okhttp", "<init>", "connectionSpec", "(Lsq1;)V", "okhttp"}, k = 1, mv = {1, 9, 0})
    /* renamed from: sq1$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private boolean a;
        private String[] b;
        private String[] c;
        private boolean d;

        public a(boolean z) {
            this.a = z;
        }

        public final sq1 a() {
            return new sq1(this.a, this.d, this.b, this.c);
        }

        public final a b(w71... w71VarArr) {
            z65.h(w71VarArr, "cipherSuites");
            if (this.a) {
                ArrayList arrayList = new ArrayList(w71VarArr.length);
                for (w71 w71Var : w71VarArr) {
                    arrayList.add(w71Var.c());
                }
                String[] strArr = (String[]) arrayList.toArray(new String[0]);
                return c((String[]) Arrays.copyOf(strArr, strArr.length));
            }
            throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
        }

        public final a c(String... strArr) {
            boolean z;
            z65.h(strArr, "cipherSuites");
            if (this.a) {
                if (strArr.length == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    Object[] copyOf = Arrays.copyOf(strArr, strArr.length);
                    z65.g(copyOf, "copyOf(...)");
                    this.b = (String[]) copyOf;
                    return this;
                }
                throw new IllegalArgumentException("At least one cipher suite is required".toString());
            }
            throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
        }

        public final a d(boolean z) {
            if (this.a) {
                this.d = z;
                return this;
            }
            throw new IllegalArgumentException("no TLS extensions for cleartext connections".toString());
        }

        public final a e(mhb... mhbVarArr) {
            z65.h(mhbVarArr, "tlsVersions");
            if (this.a) {
                ArrayList arrayList = new ArrayList(mhbVarArr.length);
                for (mhb mhbVar : mhbVarArr) {
                    arrayList.add(mhbVar.i());
                }
                String[] strArr = (String[]) arrayList.toArray(new String[0]);
                return f((String[]) Arrays.copyOf(strArr, strArr.length));
            }
            throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
        }

        public final a f(String... strArr) {
            boolean z;
            z65.h(strArr, "tlsVersions");
            if (this.a) {
                if (strArr.length == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    Object[] copyOf = Arrays.copyOf(strArr, strArr.length);
                    z65.g(copyOf, "copyOf(...)");
                    this.c = (String[]) copyOf;
                    return this;
                }
                throw new IllegalArgumentException("At least one TLS version is required".toString());
            }
            throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
        }

        public a(sq1 sq1Var) {
            z65.h(sq1Var, "connectionSpec");
            this.a = sq1Var.f();
            this.b = sq1Var.d();
            this.c = sq1Var.d;
            this.d = sq1Var.h();
        }
    }

    /* compiled from: ConnectionSpec.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0014\u0010\n\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0005R\u0014\u0010\f\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\b¨\u0006\u000f"}, d2 = {"Lsq1$b;", "", "", "Lw71;", "APPROVED_CIPHER_SUITES", "Ljava/util/List;", "Lsq1;", "CLEARTEXT", "Lsq1;", "COMPATIBLE_TLS", "MODERN_TLS", "RESTRICTED_CIPHER_SUITES", "RESTRICTED_TLS", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 9, 0})
    /* renamed from: sq1$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        List<w71> o;
        List<w71> o2;
        w71 w71Var = w71.o1;
        w71 w71Var2 = w71.p1;
        w71 w71Var3 = w71.q1;
        w71 w71Var4 = w71.a1;
        w71 w71Var5 = w71.e1;
        w71 w71Var6 = w71.b1;
        w71 w71Var7 = w71.f1;
        w71 w71Var8 = w71.l1;
        w71 w71Var9 = w71.k1;
        o = kc1.o(w71Var, w71Var2, w71Var3, w71Var4, w71Var5, w71Var6, w71Var7, w71Var8, w71Var9);
        f = o;
        o2 = kc1.o(w71Var, w71Var2, w71Var3, w71Var4, w71Var5, w71Var6, w71Var7, w71Var8, w71Var9, w71.L0, w71.M0, w71.j0, w71.k0, w71.H, w71.L, w71.l);
        g = o2;
        a aVar = new a(true);
        w71[] w71VarArr = (w71[]) o.toArray(new w71[0]);
        a b2 = aVar.b((w71[]) Arrays.copyOf(w71VarArr, w71VarArr.length));
        mhb mhbVar = mhb.c;
        mhb mhbVar2 = mhb.d;
        h = b2.e(mhbVar, mhbVar2).d(true).a();
        a aVar2 = new a(true);
        w71[] w71VarArr2 = (w71[]) o2.toArray(new w71[0]);
        i = aVar2.b((w71[]) Arrays.copyOf(w71VarArr2, w71VarArr2.length)).e(mhbVar, mhbVar2).d(true).a();
        a aVar3 = new a(true);
        w71[] w71VarArr3 = (w71[]) o2.toArray(new w71[0]);
        j = aVar3.b((w71[]) Arrays.copyOf(w71VarArr3, w71VarArr3.length)).e(mhbVar, mhbVar2, mhb.e, mhb.f).d(true).a();
        k = new a(false).a();
    }

    public sq1(boolean z, boolean z2, String[] strArr, String[] strArr2) {
        this.a = z;
        this.b = z2;
        this.c = strArr;
        this.d = strArr2;
    }

    private final sq1 g(SSLSocket sSLSocket, boolean z) {
        String[] enabledProtocols;
        Comparator f2;
        String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        z65.e(enabledCipherSuites);
        String[] c = p65.c(this, enabledCipherSuites);
        if (this.d != null) {
            String[] enabledProtocols2 = sSLSocket.getEnabledProtocols();
            z65.g(enabledProtocols2, "getEnabledProtocols(...)");
            String[] strArr = this.d;
            f2 = mk1.f();
            enabledProtocols = zdc.z(enabledProtocols2, strArr, f2);
        } else {
            enabledProtocols = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        z65.e(supportedCipherSuites);
        int r = zdc.r(supportedCipherSuites, "TLS_FALLBACK_SCSV", w71.b.c());
        if (z && r != -1) {
            String str = supportedCipherSuites[r];
            z65.g(str, "get(...)");
            c = zdc.g(c, str);
        }
        a c2 = new a(this).c((String[]) Arrays.copyOf(c, c.length));
        z65.e(enabledProtocols);
        return c2.f((String[]) Arrays.copyOf(enabledProtocols, enabledProtocols.length)).a();
    }

    public final void b(SSLSocket sSLSocket, boolean z) {
        z65.h(sSLSocket, "sslSocket");
        sq1 g2 = g(sSLSocket, z);
        if (g2.i() != null) {
            sSLSocket.setEnabledProtocols(g2.d);
        }
        if (g2.c() != null) {
            sSLSocket.setEnabledCipherSuites(g2.c);
        }
    }

    public final List<w71> c() {
        String[] strArr = this.c;
        if (strArr != null) {
            ArrayList arrayList = new ArrayList(strArr.length);
            for (String str : strArr) {
                arrayList.add(w71.b.b(str));
            }
            return arrayList;
        }
        return null;
    }

    public final String[] d() {
        return this.c;
    }

    public final boolean e(SSLSocket sSLSocket) {
        Comparator f2;
        z65.h(sSLSocket, "socket");
        if (!this.a) {
            return false;
        }
        String[] strArr = this.d;
        if (strArr != null) {
            String[] enabledProtocols = sSLSocket.getEnabledProtocols();
            f2 = mk1.f();
            if (!zdc.q(strArr, enabledProtocols, f2)) {
                return false;
            }
        }
        String[] strArr2 = this.c;
        if (strArr2 != null && !zdc.q(strArr2, sSLSocket.getEnabledCipherSuites(), w71.b.c())) {
            return false;
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof sq1)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        boolean z = this.a;
        sq1 sq1Var = (sq1) obj;
        if (z != sq1Var.a) {
            return false;
        }
        if (z && (!Arrays.equals(this.c, sq1Var.c) || !Arrays.equals(this.d, sq1Var.d) || this.b != sq1Var.b)) {
            return false;
        }
        return true;
    }

    public final boolean f() {
        return this.a;
    }

    public final boolean h() {
        return this.b;
    }

    public int hashCode() {
        int i2;
        if (this.a) {
            String[] strArr = this.c;
            int i3 = 0;
            if (strArr != null) {
                i2 = Arrays.hashCode(strArr);
            } else {
                i2 = 0;
            }
            int i4 = (527 + i2) * 31;
            String[] strArr2 = this.d;
            if (strArr2 != null) {
                i3 = Arrays.hashCode(strArr2);
            }
            return ((i4 + i3) * 31) + (!this.b ? 1 : 0);
        }
        return 17;
    }

    public final List<mhb> i() {
        String[] strArr = this.d;
        if (strArr != null) {
            ArrayList arrayList = new ArrayList(strArr.length);
            for (String str : strArr) {
                arrayList.add(mhb.b.a(str));
            }
            return arrayList;
        }
        return null;
    }

    public String toString() {
        if (!this.a) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + Objects.toString(c(), "[all enabled]") + ", tlsVersions=" + Objects.toString(i(), "[all enabled]") + ", supportsTlsExtensions=" + this.b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
