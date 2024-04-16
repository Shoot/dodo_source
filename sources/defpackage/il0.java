package defpackage;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.kustoworker.KustoStorage;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.push.e;
import com.inappstory.sdk.network.NetworkHandler;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.gn4;
import defpackage.h33;
import defpackage.ik9;
import defpackage.lk0;
import defpackage.nr7;
import defpackage.xb8;
import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.slf4j.Marker;
/* compiled from: Cache.kt */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 ?2\u00020\u00012\u00020\u0002:\u0004\u0007*-\u000bB)\b\u0000\u0012\u0006\u00103\u001a\u000202\u0012\u0006\u00105\u001a\u000204\u0012\u0006\u00107\u001a\u000206\u0012\u0006\u00109\u001a\u000208¢\u0006\u0004\b:\u0010;B!\b\u0016\u0012\u0006\u00103\u001a\u000202\u0012\u0006\u00105\u001a\u000204\u0012\u0006\u00107\u001a\u000206¢\u0006\u0004\b:\u0010<B\u0019\b\u0016\u0012\u0006\u00103\u001a\u00020=\u0012\u0006\u00105\u001a\u000204¢\u0006\u0004\b:\u0010>J\u0016\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0018\u00010\u0003R\u00020\u0004H\u0002J\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\nH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0017\u001a\u00020\u0006H\u0016J\b\u0010\u0018\u001a\u00020\u0006H\u0016J\u0017\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0019H\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\"\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010!R\"\u0010)\u001a\u00020#8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u0010,\u001a\u00020#8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b*\u0010$\u001a\u0004\b*\u0010&\"\u0004\b+\u0010(R\u0016\u0010.\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010$R\u0016\u0010/\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010$R\u0016\u00101\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010$¨\u0006@"}, d2 = {"Lil0;", "Ljava/io/Closeable;", "Ljava/io/Flushable;", "Lh33$a;", "Lh33;", "editor", "", "a", "Lhi9;", "request", "Lik9;", "b", "(Lhi9;)Lik9;", "response", "Lrl0;", "i", "(Lik9;)Lrl0;", "j", "(Lhi9;)V", "cached", "network", "o", "(Lik9;Lik9;)V", "flush", "close", "Lsl0;", "cacheStrategy", "n", "(Lsl0;)V", Image.TYPE_MEDIUM, "()V", "Lh33;", "getCache$okhttp", "()Lh33;", "cache", "", "I", e.a, "()I", "l", "(I)V", "writeSuccessCount", com.huawei.hms.opendevice.c.a, "k", "writeAbortCount", DateTokenConverter.CONVERTER_KEY, "networkCount", "hitCount", "f", "requestCount", "Lnr7;", "directory", "", "maxSize", "Liu3;", "fileSystem", "Lk7b;", "taskRunner", "<init>", "(Lnr7;JLiu3;Lk7b;)V", "(Lnr7;JLiu3;)V", "Ljava/io/File;", "(Ljava/io/File;J)V", "g", "okhttp"}, k = 1, mv = {1, 9, 0})
/* renamed from: il0  reason: default package */
/* loaded from: classes3.dex */
public final class il0 implements Closeable, Flushable {
    public static final c g = new c(null);
    private final h33 a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Cache.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B'\u0012\n\u0010\r\u001a\u00060\bR\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0015\u0010\u0016J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u001b\u0010\r\u001a\u00060\bR\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Lil0$a;", "Lkk9;", "Lqc6;", "contentType", "", "contentLength", "Lfh0;", KustoStorage.KustoTable.COLUMN_SOURCE, "Lh33$g;", "Lh33;", "a", "Lh33$g;", "()Lh33$g;", "snapshot", "", "b", "Ljava/lang/String;", com.huawei.hms.opendevice.c.a, DateTokenConverter.CONVERTER_KEY, "Lfh0;", "bodySource", "<init>", "(Lh33$g;Ljava/lang/String;Ljava/lang/String;)V", "okhttp"}, k = 1, mv = {1, 9, 0})
    /* renamed from: il0$a */
    /* loaded from: classes3.dex */
    public static final class a extends kk9 {
        private final h33.g a;
        private final String b;
        private final String c;
        private final fh0 d;

        /* compiled from: Cache.kt */
        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"il0$a$a", "Ly54;", "", "close", "okhttp"}, k = 1, mv = {1, 9, 0})
        /* renamed from: il0$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0359a extends y54 {
            final /* synthetic */ a a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0359a(pqa pqaVar, a aVar) {
                super(pqaVar);
                this.a = aVar;
            }

            @Override // defpackage.y54, defpackage.pqa, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                this.a.a().close();
                super.close();
            }
        }

        public a(h33.g gVar, String str, String str2) {
            z65.h(gVar, "snapshot");
            this.a = gVar;
            this.b = str;
            this.c = str2;
            this.d = c77.c(new C0359a(gVar.b(1), this));
        }

        public final h33.g a() {
            return this.a;
        }

        @Override // defpackage.kk9
        public long contentLength() {
            String str = this.c;
            if (str == null) {
                return -1L;
            }
            return zdc.G(str, -1L);
        }

        @Override // defpackage.kk9
        public qc6 contentType() {
            String str = this.b;
            if (str != null) {
                return qc6.e.b(str);
            }
            return null;
        }

        @Override // defpackage.kk9
        public fh0 source() {
            return this.d;
        }
    }

    /* compiled from: Cache.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\t\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\t\u001a\u00060\u0006R\u00020\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u0018\u0010\t\u001a\u00060\u0006R\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\nR\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\nR\"\u0010\u0014\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Lil0$b;", "Lrl0;", "", "a", "Lzma;", "b", "Lh33$a;", "Lh33;", "Lh33$a;", "editor", "Lzma;", "cacheOut", com.huawei.hms.opendevice.c.a, "body", "", DateTokenConverter.CONVERTER_KEY, "Z", "()Z", e.a, "(Z)V", "done", "<init>", "(Lil0;Lh33$a;)V", "okhttp"}, k = 1, mv = {1, 9, 0})
    /* renamed from: il0$b */
    /* loaded from: classes3.dex */
    private final class b implements rl0 {
        private final h33.a a;
        private final zma b;
        private final zma c;
        private boolean d;
        final /* synthetic */ il0 e;

        /* compiled from: Cache.kt */
        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"il0$b$a", "Lx54;", "", "close", "okhttp"}, k = 1, mv = {1, 9, 0})
        /* renamed from: il0$b$a */
        /* loaded from: classes3.dex */
        public static final class a extends x54 {
            final /* synthetic */ il0 b;
            final /* synthetic */ b c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(il0 il0Var, b bVar, zma zmaVar) {
                super(zmaVar);
                this.b = il0Var;
                this.c = bVar;
            }

            @Override // defpackage.x54, defpackage.zma, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                il0 il0Var = this.b;
                b bVar = this.c;
                synchronized (il0Var) {
                    if (bVar.d()) {
                        return;
                    }
                    bVar.e(true);
                    il0Var.l(il0Var.e() + 1);
                    super.close();
                    this.c.a.b();
                }
            }
        }

        public b(il0 il0Var, h33.a aVar) {
            z65.h(aVar, "editor");
            this.e = il0Var;
            this.a = aVar;
            zma f = aVar.f(1);
            this.b = f;
            this.c = new a(il0Var, this, f);
        }

        @Override // defpackage.rl0
        public void a() {
            il0 il0Var = this.e;
            synchronized (il0Var) {
                if (this.d) {
                    return;
                }
                this.d = true;
                il0Var.k(il0Var.c() + 1);
                zdc.f(this.b);
                try {
                    this.a.a();
                } catch (IOException unused) {
                }
            }
        }

        @Override // defpackage.rl0
        public zma b() {
            return this.c;
        }

        public final boolean d() {
            return this.d;
        }

        public final void e(boolean z) {
            this.d = z;
        }
    }

    /* compiled from: Cache.kt */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u0002H\u0002J\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0002J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0007J\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u001e\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014J\n\u0010\u0018\u001a\u00020\u0016*\u00020\u0011J\n\u0010\u0019\u001a\u00020\u0002*\u00020\u0011R\u0014\u0010\u001a\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001b¨\u0006!"}, d2 = {"Lil0$c;", "", "Lgn4;", "", "", DateTokenConverter.CONVERTER_KEY, "requestHeaders", "responseHeaders", e.a, "Lsq4;", RemoteMessageConst.Notification.URL, "b", "Lfh0;", KustoStorage.KustoTable.COLUMN_SOURCE, "", com.huawei.hms.opendevice.c.a, "(Lfh0;)I", "Lik9;", "cachedResponse", "cachedRequest", "Lhi9;", "newRequest", "", "g", "a", "f", "ENTRY_BODY", "I", "ENTRY_COUNT", "ENTRY_METADATA", "VERSION", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 9, 0})
    /* renamed from: il0$c */
    /* loaded from: classes3.dex */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final Set<String> d(gn4 gn4Var) {
            Set<String> e;
            boolean v;
            List<String> x0;
            CharSequence R0;
            Comparator x;
            int size = gn4Var.size();
            TreeSet treeSet = null;
            for (int i = 0; i < size; i++) {
                v = l0b.v("Vary", gn4Var.h(i), true);
                if (v) {
                    String u = gn4Var.u(i);
                    if (treeSet == null) {
                        x = l0b.x(pza.a);
                        treeSet = new TreeSet(x);
                    }
                    x0 = m0b.x0(u, new char[]{CoreConstants.COMMA_CHAR}, false, 0, 6, null);
                    for (String str : x0) {
                        R0 = m0b.R0(str);
                        treeSet.add(R0.toString());
                    }
                }
            }
            if (treeSet == null) {
                e = sfa.e();
                return e;
            }
            return treeSet;
        }

        private final gn4 e(gn4 gn4Var, gn4 gn4Var2) {
            Set<String> d = d(gn4Var2);
            if (d.isEmpty()) {
                return cec.a;
            }
            gn4.a aVar = new gn4.a();
            int size = gn4Var.size();
            for (int i = 0; i < size; i++) {
                String h = gn4Var.h(i);
                if (d.contains(h)) {
                    aVar.a(h, gn4Var.u(i));
                }
            }
            return aVar.f();
        }

        public final boolean a(ik9 ik9Var) {
            z65.h(ik9Var, "<this>");
            return d(ik9Var.q()).contains(Marker.ANY_MARKER);
        }

        public final String b(sq4 sq4Var) {
            z65.h(sq4Var, RemoteMessageConst.Notification.URL);
            return lk0.d.d(sq4Var.toString()).W().G();
        }

        public final int c(fh0 fh0Var) throws IOException {
            z65.h(fh0Var, KustoStorage.KustoTable.COLUMN_SOURCE);
            try {
                long b1 = fh0Var.b1();
                String s0 = fh0Var.s0();
                if (b1 >= 0 && b1 <= 2147483647L && s0.length() <= 0) {
                    return (int) b1;
                }
                throw new IOException("expected an int but was \"" + b1 + s0 + CoreConstants.DOUBLE_QUOTE_CHAR);
            } catch (NumberFormatException e) {
                throw new IOException(e.getMessage());
            }
        }

        public final gn4 f(ik9 ik9Var) {
            z65.h(ik9Var, "<this>");
            ik9 s = ik9Var.s();
            z65.e(s);
            return e(s.K().e(), ik9Var.q());
        }

        public final boolean g(ik9 ik9Var, gn4 gn4Var, hi9 hi9Var) {
            z65.h(ik9Var, "cachedResponse");
            z65.h(gn4Var, "cachedRequest");
            z65.h(hi9Var, "newRequest");
            Set<String> d = d(ik9Var.q());
            if ((d instanceof Collection) && d.isEmpty()) {
                return true;
            }
            for (String str : d) {
                if (!z65.c(gn4Var.v(str), hi9Var.f(str))) {
                    return false;
                }
            }
            return true;
        }
    }

    public il0(nr7 nr7Var, long j, iu3 iu3Var, k7b k7bVar) {
        z65.h(nr7Var, "directory");
        z65.h(iu3Var, "fileSystem");
        z65.h(k7bVar, "taskRunner");
        this.a = new h33(iu3Var, nr7Var, 201105, 2, j, k7bVar);
    }

    private final void a(h33.a aVar) {
        if (aVar != null) {
            try {
                aVar.a();
            } catch (IOException unused) {
            }
        }
    }

    public final ik9 b(hi9 hi9Var) {
        z65.h(hi9Var, "request");
        try {
            h33.g u = this.a.u(g.b(hi9Var.l()));
            if (u == null) {
                return null;
            }
            try {
                d dVar = new d(u.b(0));
                ik9 c2 = dVar.c(u);
                if (!dVar.a(hi9Var, c2)) {
                    zdc.f(c2.b());
                    return null;
                }
                return c2;
            } catch (IOException unused) {
                zdc.f(u);
                return null;
            }
        } catch (IOException unused2) {
        }
    }

    public final int c() {
        return this.c;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.a.close();
    }

    public final int e() {
        return this.b;
    }

    @Override // java.io.Flushable
    public void flush() throws IOException {
        this.a.flush();
    }

    public final rl0 i(ik9 ik9Var) {
        h33.a aVar;
        z65.h(ik9Var, "response");
        String h = ik9Var.K().h();
        if (nq4.a(ik9Var.K().h())) {
            try {
                j(ik9Var.K());
            } catch (IOException unused) {
            }
            return null;
        } else if (!z65.c(h, NetworkHandler.GET)) {
            return null;
        } else {
            c cVar = g;
            if (cVar.a(ik9Var)) {
                return null;
            }
            d dVar = new d(ik9Var);
            try {
                aVar = h33.s(this.a, cVar.b(ik9Var.K().l()), 0L, 2, null);
                if (aVar == null) {
                    return null;
                }
                try {
                    dVar.e(aVar);
                    return new b(this, aVar);
                } catch (IOException unused2) {
                    a(aVar);
                    return null;
                }
            } catch (IOException unused3) {
                aVar = null;
            }
        }
    }

    public final void j(hi9 hi9Var) throws IOException {
        z65.h(hi9Var, "request");
        this.a.T(g.b(hi9Var.l()));
    }

    public final void k(int i) {
        this.c = i;
    }

    public final void l(int i) {
        this.b = i;
    }

    public final synchronized void m() {
        this.e++;
    }

    public final synchronized void n(sl0 sl0Var) {
        try {
            z65.h(sl0Var, "cacheStrategy");
            this.f++;
            if (sl0Var.b() != null) {
                this.d++;
            } else if (sl0Var.a() != null) {
                this.e++;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void o(ik9 ik9Var, ik9 ik9Var2) {
        h33.a aVar;
        z65.h(ik9Var, "cached");
        z65.h(ik9Var2, "network");
        d dVar = new d(ik9Var2);
        kk9 b2 = ik9Var.b();
        z65.f(b2, "null cannot be cast to non-null type okhttp3.Cache.CacheResponseBody");
        try {
            aVar = ((a) b2).a().a();
            if (aVar == null) {
                return;
            }
            try {
                dVar.e(aVar);
                aVar.b();
            } catch (IOException unused) {
                a(aVar);
            }
        } catch (IOException unused2) {
            aVar = null;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public il0(nr7 nr7Var, long j, iu3 iu3Var) {
        this(nr7Var, j, iu3Var, k7b.m);
        z65.h(nr7Var, "directory");
        z65.h(iu3Var, "fileSystem");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public il0(File file, long j) {
        this(nr7.a.d(nr7.b, file, false, 1, null), j, iu3.b);
        z65.h(file, "directory");
    }

    /* compiled from: Cache.kt */
    @Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000 ;2\u00020\u0001:\u0001\u0015B\u0011\b\u0016\u0012\u0006\u00107\u001a\u000206¢\u0006\u0004\b8\u00109B\u0011\b\u0016\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b8\u0010:J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001e\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002J\u0012\u0010\u000f\u001a\u00020\n2\n\u0010\u000e\u001a\u00060\fR\u00020\rJ\u0016\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012J\u0012\u0010\u0018\u001a\u00020\u00122\n\u0010\u0017\u001a\u00060\u0016R\u00020\rR\u0014\u0010\u001b\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001dR\u0014\u0010!\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010 R\u0014\u0010$\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010#R\u0014\u0010'\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010&R\u0014\u0010)\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010 R\u0014\u0010+\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010\u001dR\u0016\u0010/\u001a\u0004\u0018\u00010,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00103\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00105\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00102¨\u0006<"}, d2 = {"Lil0$d;", "", "Lfh0;", KustoStorage.KustoTable.COLUMN_SOURCE, "", "Ljava/security/cert/Certificate;", "b", "Leh0;", "sink", "certificates", "", DateTokenConverter.CONVERTER_KEY, "Lh33$a;", "Lh33;", "editor", e.a, "Lhi9;", "request", "Lik9;", "response", "", "a", "Lh33$g;", "snapshot", com.huawei.hms.opendevice.c.a, "Lsq4;", "Lsq4;", RemoteMessageConst.Notification.URL, "Lgn4;", "Lgn4;", "varyHeaders", "", "Ljava/lang/String;", "requestMethod", "Lvr8;", "Lvr8;", "protocol", "", "I", "code", "f", "message", "g", "responseHeaders", "Lkm4;", Image.TYPE_HIGH, "Lkm4;", "handshake", "", "i", "J", "sentRequestMillis", "j", "receivedResponseMillis", "Lpqa;", "rawSource", "<init>", "(Lpqa;)V", "(Lik9;)V", "k", "okhttp"}, k = 1, mv = {1, 9, 0})
    /* renamed from: il0$d */
    /* loaded from: classes3.dex */
    private static final class d {
        public static final a k = new a(null);
        private static final String l;
        private static final String m;
        private final sq4 a;
        private final gn4 b;
        private final String c;
        private final vr8 d;
        private final int e;
        private final String f;
        private final gn4 g;
        private final km4 h;
        private final long i;
        private final long j;

        /* compiled from: Cache.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Lil0$d$a;", "", "", "RECEIVED_MILLIS", "Ljava/lang/String;", "SENT_MILLIS", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 9, 0})
        /* renamed from: il0$d$a */
        /* loaded from: classes3.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        static {
            xb8.a aVar;
            StringBuilder sb = new StringBuilder();
            sb.append(xb8.a.g().g());
            sb.append("-Sent-Millis");
            l = sb.toString();
            m = aVar.g().g() + "-Received-Millis";
        }

        public d(pqa pqaVar) throws IOException {
            mhb mhbVar;
            z65.h(pqaVar, "rawSource");
            try {
                fh0 c = c77.c(pqaVar);
                String s0 = c.s0();
                sq4 c2 = sq4.j.c(s0);
                if (c2 != null) {
                    this.a = c2;
                    this.c = c.s0();
                    gn4.a aVar = new gn4.a();
                    int c3 = il0.g.c(c);
                    for (int i = 0; i < c3; i++) {
                        aVar.c(c.s0());
                    }
                    this.b = aVar.f();
                    swa a2 = swa.d.a(c.s0());
                    this.d = a2.a;
                    this.e = a2.b;
                    this.f = a2.c;
                    gn4.a aVar2 = new gn4.a();
                    int c4 = il0.g.c(c);
                    for (int i2 = 0; i2 < c4; i2++) {
                        aVar2.c(c.s0());
                    }
                    String str = l;
                    String g = aVar2.g(str);
                    String str2 = m;
                    String g2 = aVar2.g(str2);
                    aVar2.i(str);
                    aVar2.i(str2);
                    this.i = g != null ? Long.parseLong(g) : 0L;
                    this.j = g2 != null ? Long.parseLong(g2) : 0L;
                    this.g = aVar2.f();
                    if (this.a.l()) {
                        String s02 = c.s0();
                        if (s02.length() <= 0) {
                            w71 b = w71.b.b(c.s0());
                            List<Certificate> b2 = b(c);
                            List<Certificate> b3 = b(c);
                            if (!c.U0()) {
                                mhbVar = mhb.b.a(c.s0());
                            } else {
                                mhbVar = mhb.g;
                            }
                            this.h = km4.e.a(mhbVar, b, b2, b3);
                        } else {
                            throw new IOException("expected \"\" but was \"" + s02 + CoreConstants.DOUBLE_QUOTE_CHAR);
                        }
                    } else {
                        this.h = null;
                    }
                    Unit unit = Unit.a;
                    aa1.a(pqaVar, null);
                    return;
                }
                IOException iOException = new IOException("Cache corruption for " + s0);
                xb8.a.g().k("cache corruption", 5, iOException);
                throw iOException;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    aa1.a(pqaVar, th);
                    throw th2;
                }
            }
        }

        private final List<Certificate> b(fh0 fh0Var) throws IOException {
            List<Certificate> l2;
            int c = il0.g.c(fh0Var);
            if (c == -1) {
                l2 = kc1.l();
                return l2;
            }
            try {
                CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
                ArrayList arrayList = new ArrayList(c);
                for (int i = 0; i < c; i++) {
                    String s0 = fh0Var.s0();
                    yg0 yg0Var = new yg0();
                    lk0 a2 = lk0.d.a(s0);
                    if (a2 != null) {
                        yg0Var.d0(a2);
                        arrayList.add(certificateFactory.generateCertificate(yg0Var.z()));
                    } else {
                        throw new IOException("Corrupt certificate in cache entry");
                    }
                }
                return arrayList;
            } catch (CertificateException e) {
                throw new IOException(e.getMessage());
            }
        }

        private final void d(eh0 eh0Var, List<? extends Certificate> list) throws IOException {
            try {
                eh0Var.C0(list.size()).V0(10);
                for (Certificate certificate : list) {
                    byte[] encoded = certificate.getEncoded();
                    lk0.a aVar = lk0.d;
                    z65.e(encoded);
                    eh0Var.a0(lk0.a.f(aVar, encoded, 0, 0, 3, null).a()).V0(10);
                }
            } catch (CertificateEncodingException e) {
                throw new IOException(e.getMessage());
            }
        }

        public final boolean a(hi9 hi9Var, ik9 ik9Var) {
            z65.h(hi9Var, "request");
            z65.h(ik9Var, "response");
            if (z65.c(this.a, hi9Var.l()) && z65.c(this.c, hi9Var.h()) && il0.g.g(ik9Var, this.b, hi9Var)) {
                return true;
            }
            return false;
        }

        public final ik9 c(h33.g gVar) {
            z65.h(gVar, "snapshot");
            String d = this.g.d("Content-Type");
            String d2 = this.g.d("Content-Length");
            return new ik9.a().r(new hi9(this.a, this.b, this.c, null, 8, null)).o(this.d).e(this.e).l(this.f).j(this.g).b(new a(gVar, d, d2)).h(this.h).s(this.i).p(this.j).c();
        }

        public final void e(h33.a aVar) throws IOException {
            z65.h(aVar, "editor");
            eh0 b = c77.b(aVar.f(0));
            try {
                b.a0(this.a.toString()).V0(10);
                b.a0(this.c).V0(10);
                b.C0(this.b.size()).V0(10);
                int size = this.b.size();
                for (int i = 0; i < size; i++) {
                    b.a0(this.b.h(i)).a0(": ").a0(this.b.u(i)).V0(10);
                }
                b.a0(new swa(this.d, this.e, this.f).toString()).V0(10);
                b.C0(this.g.size() + 2).V0(10);
                int size2 = this.g.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    b.a0(this.g.h(i2)).a0(": ").a0(this.g.u(i2)).V0(10);
                }
                b.a0(l).a0(": ").C0(this.i).V0(10);
                b.a0(m).a0(": ").C0(this.j).V0(10);
                if (this.a.l()) {
                    b.V0(10);
                    km4 km4Var = this.h;
                    z65.e(km4Var);
                    b.a0(km4Var.a().c()).V0(10);
                    d(b, this.h.d());
                    d(b, this.h.c());
                    b.a0(this.h.e().i()).V0(10);
                }
                Unit unit = Unit.a;
                aa1.a(b, null);
            } finally {
            }
        }

        public d(ik9 ik9Var) {
            z65.h(ik9Var, "response");
            this.a = ik9Var.K().l();
            this.b = il0.g.f(ik9Var);
            this.c = ik9Var.K().h();
            this.d = ik9Var.E();
            this.e = ik9Var.j();
            this.f = ik9Var.r();
            this.g = ik9Var.q();
            this.h = ik9Var.m();
            this.i = ik9Var.L();
            this.j = ik9Var.H();
        }
    }
}
