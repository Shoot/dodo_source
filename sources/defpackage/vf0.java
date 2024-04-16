package defpackage;

import defpackage.hi9;
import defpackage.ik9;
import defpackage.k65;
import java.io.IOException;
import java.util.List;
import kotlin.Metadata;
/* compiled from: BridgeInterceptor.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016R\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\f¨\u0006\u0010"}, d2 = {"Lvf0;", "Lk65;", "", "Lnw1;", "cookies", "", "a", "Lk65$a;", "chain", "Lik9;", "intercept", "Low1;", "Low1;", "cookieJar", "<init>", "(Low1;)V", "okhttp"}, k = 1, mv = {1, 9, 0})
/* renamed from: vf0  reason: default package */
/* loaded from: classes3.dex */
public final class vf0 implements k65 {
    private final ow1 a;

    public vf0(ow1 ow1Var) {
        z65.h(ow1Var, "cookieJar");
        this.a = ow1Var;
    }

    private final String a(List<nw1> list) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                kc1.v();
            }
            nw1 nw1Var = (nw1) obj;
            if (i > 0) {
                sb.append("; ");
            }
            sb.append(nw1Var.e());
            sb.append('=');
            sb.append(nw1Var.g());
            i = i2;
        }
        String sb2 = sb.toString();
        z65.g(sb2, "toString(...)");
        return sb2;
    }

    @Override // defpackage.k65
    public ik9 intercept(k65.a aVar) throws IOException {
        boolean v;
        kk9 b;
        z65.h(aVar, "chain");
        hi9 request = aVar.request();
        hi9.a i = request.i();
        ji9 a = request.a();
        if (a != null) {
            qc6 contentType = a.contentType();
            if (contentType != null) {
                i.j("Content-Type", contentType.toString());
            }
            long contentLength = a.contentLength();
            if (contentLength != -1) {
                i.j("Content-Length", String.valueOf(contentLength));
                i.n("Transfer-Encoding");
            } else {
                i.j("Transfer-Encoding", "chunked");
                i.n("Content-Length");
            }
        }
        boolean z = false;
        if (request.d("Host") == null) {
            i.j("Host", cec.x(request.l(), false, 1, null));
        }
        if (request.d("Connection") == null) {
            i.j("Connection", "Keep-Alive");
        }
        if (request.d("Accept-Encoding") == null && request.d("Range") == null) {
            i.j("Accept-Encoding", "gzip");
            z = true;
        }
        List<nw1> b2 = this.a.b(request.l());
        if (!b2.isEmpty()) {
            i.j("Cookie", a(b2));
        }
        if (request.d("User-Agent") == null) {
            i.j("User-Agent", "okhttp/5.0.0-alpha.12");
        }
        hi9 b3 = i.b();
        ik9 b4 = aVar.b(b3);
        lq4.f(this.a, b3.l(), b4.q());
        ik9.a r = b4.u().r(b3);
        if (z) {
            v = l0b.v("gzip", ik9.o(b4, "Content-Encoding", null, 2, null), true);
            if (v && lq4.b(b4) && (b = b4.b()) != null) {
                zi4 zi4Var = new zi4(b.source());
                r.j(b4.q().p().i("Content-Encoding").i("Content-Length").f());
                r.b(new x79(ik9.o(b4, "Content-Type", null, 2, null), -1L, c77.c(zi4Var)));
            }
        }
        return r.c();
    }
}
