package defpackage;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import defpackage.k65;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: HttpLoggingInterceptor.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002\t\u0007B\u0013\b\u0007\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001a¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nJ\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016R\u001c\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0013R*\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\n8\u0006@GX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u000b\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001b¨\u0006\u001f"}, d2 = {"Lmq4;", "Lk65;", "Lgn4;", "headers", "", "i", "", "b", "", "a", "Lmq4$a;", "level", c.a, "Lk65$a;", "chain", "Lik9;", "intercept", "", "", "Ljava/util/Set;", "headersToRedact", "<set-?>", "Lmq4$a;", "getLevel", "()Lmq4$a;", "(Lmq4$a;)V", "Lmq4$b;", "Lmq4$b;", "logger", "<init>", "(Lmq4$b;)V", "okhttp-logging-interceptor"}, k = 1, mv = {1, 4, 0})
/* renamed from: mq4  reason: default package */
/* loaded from: classes3.dex */
public final class mq4 implements k65 {
    private volatile Set<String> a;
    private volatile a b;
    private final b c;

    /* compiled from: HttpLoggingInterceptor.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lmq4$a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", c.a, DateTokenConverter.CONVERTER_KEY, "okhttp-logging-interceptor"}, k = 1, mv = {1, 4, 0})
    /* renamed from: mq4$a */
    /* loaded from: classes3.dex */
    public enum a {
        NONE,
        BASIC,
        HEADERS,
        BODY
    }

    /* compiled from: HttpLoggingInterceptor.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bæ\u0080\u0001\u0018\u0000 \u00062\u00020\u0001:\u0001\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\b"}, d2 = {"Lmq4$b;", "", "", "message", "", "log", "b", "a", "okhttp-logging-interceptor"}, k = 1, mv = {1, 4, 0})
    /* renamed from: mq4$b */
    /* loaded from: classes3.dex */
    public interface b {
        public static final a b = new a(null);
        public static final b a = new a.C0443a();

        /* compiled from: HttpLoggingInterceptor.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0001\u0082\u0002\u0007\n\u0005\b\u0091F0\u0001¨\u0006\b"}, d2 = {"Lmq4$b$a;", "", "Lmq4$b;", "DEFAULT", "Lmq4$b;", "<init>", "()V", "a", "okhttp-logging-interceptor"}, k = 1, mv = {1, 4, 0})
        /* renamed from: mq4$b$a */
        /* loaded from: classes3.dex */
        public static final class a {

            /* compiled from: HttpLoggingInterceptor.kt */
            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Lmq4$b$a$a;", "Lmq4$b;", "", "message", "", "log", "<init>", "()V", "okhttp-logging-interceptor"}, k = 1, mv = {1, 4, 0})
            /* renamed from: mq4$b$a$a  reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            private static final class C0443a implements b {
                @Override // defpackage.mq4.b
                public void log(String str) {
                    z65.h(str, "message");
                    xb8.l(xb8.a.g(), str, 0, null, 6, null);
                }
            }

            private a() {
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        void log(String str);
    }

    public mq4(b bVar) {
        Set<String> e;
        z65.h(bVar, "logger");
        this.c = bVar;
        e = sfa.e();
        this.a = e;
        this.b = a.NONE;
    }

    private final boolean a(gn4 gn4Var) {
        boolean v;
        boolean v2;
        String d = gn4Var.d("Content-Encoding");
        if (d != null) {
            v = l0b.v(d, "identity", true);
            if (!v) {
                v2 = l0b.v(d, "gzip", true);
                if (v2) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return false;
    }

    private final void b(gn4 gn4Var, int i) {
        String u;
        if (this.a.contains(gn4Var.h(i))) {
            u = "██";
        } else {
            u = gn4Var.u(i);
        }
        b bVar = this.c;
        bVar.log(gn4Var.h(i) + ": " + u);
    }

    public final mq4 c(a aVar) {
        z65.h(aVar, "level");
        this.b = aVar;
        return this;
    }

    @Override // defpackage.k65
    public ik9 intercept(k65.a aVar) throws IOException {
        boolean z;
        boolean z2;
        String str;
        String str2;
        String str3;
        String sb;
        String str4;
        boolean v;
        Charset charset;
        Charset charset2;
        z65.h(aVar, "chain");
        a aVar2 = this.b;
        hi9 request = aVar.request();
        if (aVar2 == a.NONE) {
            return aVar.b(request);
        }
        if (aVar2 == a.BODY) {
            z = true;
        } else {
            z = false;
        }
        if (!z && aVar2 != a.HEADERS) {
            z2 = false;
        } else {
            z2 = true;
        }
        ji9 a2 = request.a();
        oq1 c = aVar.c();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("--> ");
        sb2.append(request.h());
        sb2.append(' ');
        sb2.append(request.l());
        if (c == null) {
            str = "";
        } else {
            str = " " + c.a();
        }
        sb2.append(str);
        String sb3 = sb2.toString();
        if (!z2 && a2 != 0) {
            sb3 = sb3 + " (" + a2.contentLength() + "-byte body)";
        }
        this.c.log(sb3);
        if (z2) {
            gn4 e = request.e();
            if (a2 != null) {
                qc6 contentType = a2.contentType();
                if (contentType != null && e.d("Content-Type") == null) {
                    this.c.log("Content-Type: " + contentType);
                }
                if (a2.contentLength() != -1 && e.d("Content-Length") == null) {
                    this.c.log("Content-Length: " + a2.contentLength());
                }
            }
            int size = e.size();
            for (int i = 0; i < size; i++) {
                b(e, i);
            }
            if (z && a2 != null) {
                if (a(request.e())) {
                    this.c.log("--> END " + request.h() + " (encoded body omitted)");
                } else if (a2.isDuplex()) {
                    this.c.log("--> END " + request.h() + " (duplex request body omitted)");
                } else if (a2.isOneShot()) {
                    this.c.log("--> END " + request.h() + " (one-shot body omitted)");
                } else {
                    yg0 yg0Var = new yg0();
                    a2.writeTo(yg0Var);
                    qc6 contentType2 = a2.contentType();
                    if (contentType2 == null || (charset2 = contentType2.a(StandardCharsets.UTF_8)) == null) {
                        charset2 = StandardCharsets.UTF_8;
                        z65.g(charset2, "UTF_8");
                    }
                    this.c.log("");
                    if (tub.a(yg0Var)) {
                        this.c.log(yg0Var.n1(charset2));
                        this.c.log("--> END " + request.h() + " (" + a2.contentLength() + "-byte body)");
                    } else {
                        this.c.log("--> END " + request.h() + " (binary " + a2.contentLength() + "-byte body omitted)");
                    }
                }
            } else {
                this.c.log("--> END " + request.h());
            }
        }
        long nanoTime = System.nanoTime();
        try {
            ik9 b2 = aVar.b(request);
            long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - nanoTime);
            kk9 b3 = b2.b();
            z65.e(b3);
            long contentLength = b3.contentLength();
            if (contentLength != -1) {
                str2 = contentLength + "-byte";
            } else {
                str2 = "unknown-length";
            }
            b bVar = this.c;
            StringBuilder sb4 = new StringBuilder();
            sb4.append("<-- ");
            sb4.append(b2.j());
            if (b2.r().length() == 0) {
                str3 = "-byte body omitted)";
                sb = "";
            } else {
                String r = b2.r();
                StringBuilder sb5 = new StringBuilder();
                str3 = "-byte body omitted)";
                sb5.append(String.valueOf(' '));
                sb5.append(r);
                sb = sb5.toString();
            }
            sb4.append(sb);
            sb4.append(' ');
            sb4.append(b2.K().l());
            sb4.append(" (");
            sb4.append(millis);
            sb4.append("ms");
            if (z2) {
                str4 = "";
            } else {
                str4 = ", " + str2 + " body";
            }
            sb4.append(str4);
            sb4.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
            bVar.log(sb4.toString());
            if (z2) {
                gn4 q = b2.q();
                int size2 = q.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    b(q, i2);
                }
                if (z && lq4.b(b2)) {
                    if (a(b2.q())) {
                        this.c.log("<-- END HTTP (encoded body omitted)");
                    } else {
                        fh0 source = b3.source();
                        source.w(Long.MAX_VALUE);
                        yg0 d = source.d();
                        v = l0b.v("gzip", q.d("Content-Encoding"), true);
                        Long l = null;
                        if (v) {
                            Long valueOf = Long.valueOf(d.P());
                            zi4 zi4Var = new zi4(d.clone());
                            try {
                                d = new yg0();
                                d.a1(zi4Var);
                                aa1.a(zi4Var, null);
                                l = valueOf;
                            } finally {
                            }
                        }
                        qc6 contentType3 = b3.contentType();
                        if (contentType3 == null || (charset = contentType3.a(StandardCharsets.UTF_8)) == null) {
                            charset = StandardCharsets.UTF_8;
                            z65.g(charset, "UTF_8");
                        }
                        if (!tub.a(d)) {
                            this.c.log("");
                            this.c.log("<-- END HTTP (binary " + d.P() + str3);
                            return b2;
                        }
                        if (contentLength != 0) {
                            this.c.log("");
                            this.c.log(d.clone().n1(charset));
                        }
                        if (l != null) {
                            this.c.log("<-- END HTTP (" + d.P() + "-byte, " + l + "-gzipped-byte body)");
                        } else {
                            this.c.log("<-- END HTTP (" + d.P() + "-byte body)");
                        }
                    }
                } else {
                    this.c.log("<-- END HTTP");
                }
            }
            return b2;
        } catch (Exception e2) {
            this.c.log("<-- HTTP FAILED: " + e2);
            throw e2;
        }
    }

    public /* synthetic */ mq4(b bVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? b.a : bVar);
    }
}
