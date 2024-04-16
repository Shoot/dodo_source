package defpackage;

import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.constant.RemoteMessageConst;
import defpackage.k65;
import java.io.EOFException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/* compiled from: LoggingInterceptor.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u00162\u00020\u0001:\u0001\u0005B\u0019\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\f\u001a\u00020\n¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u0014\u0010\f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000bR\u001c\u0010\u0011\u001a\n \u000e*\u0004\u0018\u00010\r0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0017"}, d2 = {"Lay5;", "Lk65;", "Lgn4;", "headers", "", "a", "Lk65$a;", "chain", "Lik9;", "intercept", "Lby5;", "Lby5;", "level", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "b", "Lorg/slf4j/Logger;", "logger", "", RemoteMessageConst.Notification.TAG, "<init>", "(Ljava/lang/String;Lby5;)V", c.a, "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: ay5  reason: default package */
/* loaded from: classes3.dex */
public final class ay5 implements k65 {
    public static final a c = new a(null);
    private static final Charset d = Charset.forName("UTF-8");
    private final by5 a;
    private final Logger b;

    /* compiled from: LoggingInterceptor.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u001c\u0010\t\u001a\n \b*\u0004\u0018\u00010\u00070\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lay5$a;", "", "Lyg0;", "buffer", "", "a", "(Lyg0;)Z", "Ljava/nio/charset/Charset;", "kotlin.jvm.PlatformType", "UTF8", "Ljava/nio/charset/Charset;", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: ay5$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean a(yg0 yg0Var) {
            long j;
            z65.h(yg0Var, "buffer");
            try {
                yg0 yg0Var2 = new yg0();
                if (yg0Var.P() < 64) {
                    j = yg0Var.P();
                } else {
                    j = 64;
                }
                yg0Var.j(yg0Var2, 0L, j);
                for (int i = 0; i < 16; i++) {
                    if (!yg0Var2.U0()) {
                        int M = yg0Var2.M();
                        if (Character.isISOControl(M) && !Character.isWhitespace(M)) {
                            return false;
                        }
                    } else {
                        return true;
                    }
                }
                return true;
            } catch (EOFException unused) {
                return false;
            }
        }
    }

    public ay5(String str, by5 by5Var) {
        z65.h(str, RemoteMessageConst.Notification.TAG);
        z65.h(by5Var, "level");
        this.a = by5Var;
        this.b = LoggerFactory.getLogger(str);
    }

    private final boolean a(gn4 gn4Var) {
        boolean v;
        String d2 = gn4Var.d("Content-Encoding");
        if (d2 != null) {
            v = l0b.v(d2, "identity", true);
            if (!v) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.k65
    public ik9 intercept(k65.a aVar) throws IOException {
        boolean z;
        boolean z2;
        boolean z3;
        vr8 vr8Var;
        boolean z4;
        String str;
        String str2;
        String str3;
        String str4;
        boolean v;
        gn4 gn4Var;
        boolean v2;
        z65.h(aVar, "chain");
        by5 by5Var = this.a;
        hi9 request = aVar.request();
        if (by5Var == by5.a) {
            return aVar.b(request);
        }
        if (by5Var == by5.d) {
            z = true;
        } else {
            z = false;
        }
        if (!z && by5Var != by5.c) {
            z2 = false;
        } else {
            z2 = true;
        }
        ji9 a2 = request.a();
        if (a2 != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        oq1 c2 = aVar.c();
        if (c2 != null) {
            vr8Var = c2.a();
        } else {
            vr8Var = vr8.d;
        }
        String str5 = "--> " + request.h() + " " + request.l() + " " + vr8Var;
        if (!z2 && z3) {
            z65.e(a2);
            str5 = str5 + " (" + a2.contentLength() + "-byte body)";
        }
        this.b.debug(str5);
        if (z2) {
            if (z3) {
                z65.e(a2);
                if (a2.contentType() == null) {
                    str = " ";
                } else {
                    Logger logger = this.b;
                    qc6 contentType = a2.contentType();
                    z65.e(contentType);
                    StringBuilder sb = new StringBuilder();
                    str = " ";
                    sb.append("Content-Type: ");
                    sb.append(contentType);
                    logger.debug(sb.toString());
                }
                if (a2.contentLength() != -1) {
                    Logger logger2 = this.b;
                    long contentLength = a2.contentLength();
                    StringBuilder sb2 = new StringBuilder();
                    z4 = z2;
                    sb2.append("Content-Length: ");
                    sb2.append(contentLength);
                    logger2.debug(sb2.toString());
                } else {
                    z4 = z2;
                }
            } else {
                z4 = z2;
                str = " ";
            }
            gn4 e = request.e();
            int size = e.size();
            int i = 0;
            while (i < size) {
                String h = e.h(i);
                int i2 = size;
                v = l0b.v("Content-Type", h, true);
                if (!v) {
                    v2 = l0b.v("Content-Length", h, true);
                    if (!v2) {
                        gn4Var = e;
                        this.b.debug(h + ": " + e.u(i));
                        i++;
                        size = i2;
                        e = gn4Var;
                    }
                }
                gn4Var = e;
                i++;
                size = i2;
                e = gn4Var;
            }
            if (z && z3) {
                if (a(request.e())) {
                    this.b.debug("--> END " + request.h() + " (encoded body omitted)");
                } else {
                    yg0 yg0Var = new yg0();
                    z65.e(a2);
                    a2.writeTo(yg0Var);
                    Charset charset = d;
                    qc6 contentType2 = a2.contentType();
                    if (contentType2 != null) {
                        charset = contentType2.a(charset);
                    }
                    this.b.debug("");
                    if (c.a(yg0Var)) {
                        Logger logger3 = this.b;
                        z65.e(charset);
                        logger3.debug(yg0Var.n1(charset));
                        this.b.debug("--> END " + request.h() + " (" + a2.contentLength() + "-byte body)");
                    } else {
                        this.b.debug("--> END " + request.h() + " (binary " + a2.contentLength() + "-byte body omitted)");
                    }
                }
            } else {
                this.b.debug("--> END " + request.h());
            }
        } else {
            z4 = z2;
            str = " ";
        }
        long nanoTime = System.nanoTime();
        try {
            ik9 b = aVar.b(request);
            long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - nanoTime);
            kk9 b2 = b.b();
            z65.e(b2);
            long contentLength2 = b2.contentLength();
            if (contentLength2 != -1) {
                str2 = contentLength2 + "-byte";
            } else {
                str2 = "unknown-length";
            }
            Logger logger4 = this.b;
            int j = b.j();
            String r = b.r();
            sq4 l = b.K().l();
            if (z4) {
                str3 = "-byte body omitted)";
                str4 = "";
            } else {
                StringBuilder sb3 = new StringBuilder();
                str3 = "-byte body omitted)";
                sb3.append(", ");
                sb3.append(str2);
                sb3.append(" body");
                str4 = sb3.toString();
            }
            StringBuilder sb4 = new StringBuilder();
            sb4.append("<-- ");
            sb4.append(j);
            String str6 = str;
            sb4.append(str6);
            sb4.append(r);
            sb4.append(str6);
            sb4.append(l);
            sb4.append(" (");
            sb4.append(millis);
            sb4.append("ms");
            sb4.append(str4);
            sb4.append(")");
            logger4.debug(sb4.toString());
            if (z4) {
                gn4 q = b.q();
                int size2 = q.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    this.b.debug(q.h(i3) + ": " + q.u(i3));
                }
                if (z && lq4.b(b)) {
                    if (a(b.q())) {
                        this.b.debug("<-- END HTTP (encoded body omitted)");
                    } else {
                        fh0 source = b2.source();
                        source.w(Long.MAX_VALUE);
                        yg0 d2 = source.d();
                        Charset charset2 = d;
                        qc6 contentType3 = b2.contentType();
                        if (contentType3 != null) {
                            charset2 = contentType3.a(charset2);
                        }
                        if (!c.a(d2)) {
                            this.b.debug("");
                            this.b.debug("<-- END HTTP (binary " + d2.P() + str3);
                            return b;
                        }
                        if (contentLength2 != 0) {
                            this.b.debug("");
                            Logger logger5 = this.b;
                            yg0 clone = d2.clone();
                            z65.e(charset2);
                            logger5.debug(clone.n1(charset2));
                        }
                        this.b.debug("<-- END HTTP (" + d2.P() + "-byte body)");
                    }
                } else {
                    this.b.debug("<-- END HTTP");
                }
            }
            return b;
        } catch (Exception e2) {
            this.b.debug("<-- HTTP FAILED: " + e2);
            throw e2;
        }
    }
}
