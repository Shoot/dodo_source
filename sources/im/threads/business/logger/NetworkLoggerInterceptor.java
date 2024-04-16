package im.threads.business.logger;

import defpackage.ik9;
import defpackage.k65;
import defpackage.kk9;
import im.threads.business.config.BaseConfig;
import im.threads.business.formatters.JsonFormatter;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: NetworkLoggerInterceptor.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001a\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0004H\u0002J\u0012\u0010\f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0016\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Lim/threads/business/logger/NetworkLoggerInterceptor;", "Lk65;", "Lk65$a;", "chain", "", "getRequestLog", "Lik9;", "response", "responseBodyString", "getResponseLog", "Lhi9;", "request", "bodyToString", "intercept", "", "isImage", "Z", "Lim/threads/business/formatters/JsonFormatter;", "jsonFormatter$delegate", "Lrn5;", "getJsonFormatter", "()Lim/threads/business/formatters/JsonFormatter;", "jsonFormatter", "isLoggerEnabled", "()Z", "<init>", "(Z)V", "threads_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class NetworkLoggerInterceptor implements k65 {
    private final boolean isImage;
    private final rn5 jsonFormatter$delegate;

    public NetworkLoggerInterceptor() {
        this(false, 1, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x004c, code lost:
        if (r1 == false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.String bodyToString(defpackage.hi9 r7) {
        /*
            r6 = this;
            r0 = 0
            hi9$a r7 = r7.i()     // Catch: java.lang.Exception -> L66
            hi9 r7 = r7.b()     // Catch: java.lang.Exception -> L66
            yg0 r1 = new yg0     // Catch: java.lang.Exception -> L66
            r1.<init>()     // Catch: java.lang.Exception -> L66
            ji9 r2 = r7.a()     // Catch: java.lang.Exception -> L66
            defpackage.z65.e(r2)     // Catch: java.lang.Exception -> L66
            r2.writeTo(r1)     // Catch: java.lang.Exception -> L66
            ji9 r7 = r7.a()     // Catch: java.lang.Exception -> L66
            if (r7 == 0) goto L21
            r7.contentType()     // Catch: java.lang.Exception -> L66
        L21:
            java.lang.String r7 = r1.L()     // Catch: java.lang.Exception -> L66
            r1 = 4
            java.lang.String[] r1 = new java.lang.String[r1]     // Catch: java.lang.Exception -> L66
            java.lang.String r2 = "Content-Type: application/json"
            r3 = 0
            r1[r3] = r2     // Catch: java.lang.Exception -> L66
            java.lang.String r2 = "Content-Type: application/text"
            r4 = 1
            r1[r4] = r2     // Catch: java.lang.Exception -> L66
            java.lang.String r2 = "Content-Type: application/html"
            r4 = 2
            r1[r4] = r2     // Catch: java.lang.Exception -> L66
            java.lang.String r2 = "Content-Type: text/"
            r5 = 3
            r1[r5] = r2     // Catch: java.lang.Exception -> L66
            java.util.List r1 = defpackage.ic1.o(r1)     // Catch: java.lang.Exception -> L66
            boolean r1 = im.threads.business.utils.StringExtensionsKt.hasSubstrings(r7, r1)     // Catch: java.lang.Exception -> L66
            if (r1 == 0) goto L50
            java.lang.String r1 = "Content-Transfer-Encoding: binary"
            boolean r1 = defpackage.c0b.O(r7, r1, r3, r4, r0)     // Catch: java.lang.Exception -> L66
            if (r1 != 0) goto L50
        L4e:
            r0 = r7
            goto L66
        L50:
            int r7 = r7.length()     // Catch: java.lang.Exception -> L66
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L66
            r1.<init>()     // Catch: java.lang.Exception -> L66
            java.lang.String r2 = "File body. Size: "
            r1.append(r2)     // Catch: java.lang.Exception -> L66
            r1.append(r7)     // Catch: java.lang.Exception -> L66
            java.lang.String r7 = r1.toString()     // Catch: java.lang.Exception -> L66
            goto L4e
        L66:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: im.threads.business.logger.NetworkLoggerInterceptor.bodyToString(hi9):java.lang.String");
    }

    private final JsonFormatter getJsonFormatter() {
        return (JsonFormatter) this.jsonFormatter$delegate.getValue();
    }

    private final String getRequestLog(k65.a aVar) {
        boolean y;
        boolean y2;
        StringBuilder sb = new StringBuilder();
        sq4 l = aVar.request().l();
        sb.append("[REST] ☛ Request url: " + l + "\n");
        y = l0b.y(String.valueOf(aVar.c()));
        if (!y) {
            oq1 c = aVar.c();
            sb.append("☛ Request connection: " + c + "\n");
        }
        gn4 e = aVar.request().e();
        sb.append("☛ Request headers: " + e);
        String bodyToString = bodyToString(aVar.request());
        if (bodyToString != null) {
            y2 = l0b.y(bodyToString);
            if (!y2) {
                sb.append("☛ Request body: " + bodyToString + "\n");
            }
        }
        String sb2 = sb.toString();
        z65.g(sb2, "StringBuilder().apply {\n…       }\n    }.toString()");
        return sb2;
    }

    private final String getResponseLog(ik9 ik9Var, String str) {
        boolean y;
        StringBuilder sb = new StringBuilder();
        sq4 l = ik9Var.K().l();
        int j = ik9Var.j();
        sb.append("☚ Response received for url: " + l + ", code: " + j + "\n");
        gn4 e = ik9Var.K().e();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("☚ Request headers: ");
        sb2.append(e);
        sb.append(sb2.toString());
        if (str != null) {
            y = l0b.y(str);
            if (!y) {
                String jsonToPrettyFormat = getJsonFormatter().jsonToPrettyFormat(str);
                sb.append("☚ Request body: " + jsonToPrettyFormat + "\n");
            }
        }
        String sb3 = sb.toString();
        z65.g(sb3, "StringBuilder().apply {\n…       }\n    }.toString()");
        return sb3;
    }

    private final boolean isLoggerEnabled() {
        try {
            if (BaseConfig.Companion.getInstance().getLoggerConfig() == null) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // defpackage.k65
    public ik9 intercept(k65.a aVar) {
        ik9 ik9Var;
        z65.h(aVar, "chain");
        if (isLoggerEnabled()) {
            LoggerEdna.info(getRequestLog(aVar));
        }
        ik9 b = aVar.b(aVar.request());
        if (isLoggerEnabled()) {
            ik9Var = null;
            qc6 qc6Var = null;
            if (!this.isImage) {
                String string = b.x(Long.MAX_VALUE).string();
                ik9.a u = b.u();
                kk9.b bVar = kk9.Companion;
                kk9 b2 = b.b();
                if (b2 != null) {
                    qc6Var = b2.contentType();
                }
                ik9Var = u.b(bVar.g(string, qc6Var)).c();
                LoggerEdna.info(getResponseLog(b, string));
            } else {
                LoggerEdna.info(getResponseLog(b, null));
            }
        } else {
            ik9Var = b;
        }
        if (ik9Var != null) {
            return ik9Var;
        }
        return b;
    }

    public NetworkLoggerInterceptor(boolean z) {
        rn5 b;
        this.isImage = z;
        b = yn5.b(NetworkLoggerInterceptor$special$$inlined$inject$1.INSTANCE);
        this.jsonFormatter$delegate = b;
    }

    public /* synthetic */ NetworkLoggerInterceptor(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }
}
