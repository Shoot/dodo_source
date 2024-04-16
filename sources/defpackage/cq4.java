package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.gn4;
import defpackage.ik9;
import defpackage.swa;
import defpackage.xl3;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: Http2ExchangeCodec.kt */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \n2\u00020\u0001:\u0001\u0014B'\u0012\u0006\u0010,\u001a\u00020+\u0012\u0006\u0010\u001c\u001a\u00020\u0018\u0012\u0006\u0010\u001f\u001a\u00020\u001d\u0012\u0006\u0010\"\u001a\u00020 ¢\u0006\u0004\b-\u0010.J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\n\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\bH\u0016J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0010\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\b\u0010\u0016\u001a\u00020\u0015H\u0016J\b\u0010\u0017\u001a\u00020\bH\u0016R\u001a\u0010\u001c\u001a\u00020\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001eR\u0014\u0010\"\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010!R\u0018\u0010%\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010$R\u0014\u0010(\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010'R\u0016\u0010*\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010)¨\u0006/"}, d2 = {"Lcq4;", "Lxl3;", "Lhi9;", "request", "", "contentLength", "Lzma;", DateTokenConverter.CONVERTER_KEY, "", e.a, "g", "b", "", "expectContinue", "Lik9$a;", "f", "Lik9;", "response", c.a, "Lpqa;", "a", "Lgn4;", "i", "cancel", "Lxl3$a;", "Lxl3$a;", Image.TYPE_HIGH, "()Lxl3$a;", "carrier", "Lw79;", "Lw79;", "chain", "Lbq4;", "Lbq4;", "http2Connection", "Leq4;", "Leq4;", "stream", "Lvr8;", "Lvr8;", "protocol", "Z", "canceled", "Lb77;", "client", "<init>", "(Lb77;Lxl3$a;Lw79;Lbq4;)V", "okhttp"}, k = 1, mv = {1, 9, 0})
/* renamed from: cq4  reason: default package */
/* loaded from: classes3.dex */
public final class cq4 implements xl3 {
    public static final a g = new a(null);
    private static final List<String> h = cec.l("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");
    private static final List<String> i = cec.l("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");
    private final xl3.a a;
    private final w79 b;
    private final bq4 c;
    private volatile eq4 d;
    private final vr8 e;
    private volatile boolean f;

    /* compiled from: Http2ExchangeCodec.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\r0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u000fR\u0014\u0010\u0016\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u000fR\u0014\u0010\u0017\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u000fR\u0014\u0010\u0018\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u000fR\u0014\u0010\u0019\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u000f¨\u0006\u001c"}, d2 = {"Lcq4$a;", "", "Lhi9;", "request", "", "Ldn4;", "a", "Lgn4;", "headerBlock", "Lvr8;", "protocol", "Lik9$a;", "b", "", "CONNECTION", "Ljava/lang/String;", "ENCODING", "HOST", "HTTP_2_SKIPPED_REQUEST_HEADERS", "Ljava/util/List;", "HTTP_2_SKIPPED_RESPONSE_HEADERS", "KEEP_ALIVE", "PROXY_CONNECTION", "TE", "TRANSFER_ENCODING", "UPGRADE", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 9, 0})
    /* renamed from: cq4$a */
    /* loaded from: classes3.dex */
    public static final class a {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Http2ExchangeCodec.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lgn4;", "a", "()Lgn4;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: cq4$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0274a extends ej5 implements Function0<gn4> {
            public static final C0274a a = new C0274a();

            C0274a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final gn4 invoke() {
                throw new IllegalStateException("trailers not available".toString());
            }
        }

        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final List<dn4> a(hi9 hi9Var) {
            z65.h(hi9Var, "request");
            gn4 e = hi9Var.e();
            ArrayList arrayList = new ArrayList(e.size() + 4);
            arrayList.add(new dn4(dn4.g, hi9Var.h()));
            arrayList.add(new dn4(dn4.h, ui9.a.c(hi9Var.l())));
            String d = hi9Var.d("Host");
            if (d != null) {
                arrayList.add(new dn4(dn4.j, d));
            }
            arrayList.add(new dn4(dn4.i, hi9Var.l().w()));
            int size = e.size();
            for (int i = 0; i < size; i++) {
                String h = e.h(i);
                Locale locale = Locale.US;
                z65.g(locale, "US");
                String lowerCase = h.toLowerCase(locale);
                z65.g(lowerCase, "toLowerCase(...)");
                if (!cq4.h.contains(lowerCase) || (z65.c(lowerCase, "te") && z65.c(e.u(i), "trailers"))) {
                    arrayList.add(new dn4(lowerCase, e.u(i)));
                }
            }
            return arrayList;
        }

        public final ik9.a b(gn4 gn4Var, vr8 vr8Var) {
            z65.h(gn4Var, "headerBlock");
            z65.h(vr8Var, "protocol");
            gn4.a aVar = new gn4.a();
            int size = gn4Var.size();
            swa swaVar = null;
            for (int i = 0; i < size; i++) {
                String h = gn4Var.h(i);
                String u = gn4Var.u(i);
                if (z65.c(h, ":status")) {
                    swa.a aVar2 = swa.d;
                    swaVar = aVar2.a("HTTP/1.1 " + u);
                } else if (!cq4.i.contains(h)) {
                    aVar.d(h, u);
                }
            }
            if (swaVar != null) {
                return new ik9.a().o(vr8Var).e(swaVar.b).l(swaVar.c).j(aVar.f()).D(C0274a.a);
            }
            throw new ProtocolException("Expected ':status' header not present");
        }
    }

    public cq4(b77 b77Var, xl3.a aVar, w79 w79Var, bq4 bq4Var) {
        z65.h(b77Var, "client");
        z65.h(aVar, "carrier");
        z65.h(w79Var, "chain");
        z65.h(bq4Var, "http2Connection");
        this.a = aVar;
        this.b = w79Var;
        this.c = bq4Var;
        List<vr8> C = b77Var.C();
        vr8 vr8Var = vr8.g;
        this.e = C.contains(vr8Var) ? vr8Var : vr8.f;
    }

    @Override // defpackage.xl3
    public pqa a(ik9 ik9Var) {
        z65.h(ik9Var, "response");
        eq4 eq4Var = this.d;
        z65.e(eq4Var);
        return eq4Var.q();
    }

    @Override // defpackage.xl3
    public void b() {
        eq4 eq4Var = this.d;
        z65.e(eq4Var);
        eq4Var.o().close();
    }

    @Override // defpackage.xl3
    public long c(ik9 ik9Var) {
        z65.h(ik9Var, "response");
        if (!lq4.b(ik9Var)) {
            return 0L;
        }
        return cec.k(ik9Var);
    }

    @Override // defpackage.xl3
    public void cancel() {
        this.f = true;
        eq4 eq4Var = this.d;
        if (eq4Var != null) {
            eq4Var.g(fk3.k);
        }
    }

    @Override // defpackage.xl3
    public zma d(hi9 hi9Var, long j) {
        z65.h(hi9Var, "request");
        eq4 eq4Var = this.d;
        z65.e(eq4Var);
        return eq4Var.o();
    }

    @Override // defpackage.xl3
    public void e(hi9 hi9Var) {
        boolean z;
        z65.h(hi9Var, "request");
        if (this.d != null) {
            return;
        }
        if (hi9Var.a() != null) {
            z = true;
        } else {
            z = false;
        }
        this.d = this.c.n0(g.a(hi9Var), z);
        if (!this.f) {
            eq4 eq4Var = this.d;
            z65.e(eq4Var);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            eq4Var.w().g(this.b.i(), timeUnit);
            eq4 eq4Var2 = this.d;
            z65.e(eq4Var2);
            eq4Var2.E().g(this.b.k(), timeUnit);
            return;
        }
        eq4 eq4Var3 = this.d;
        z65.e(eq4Var3);
        eq4Var3.g(fk3.k);
        throw new IOException("Canceled");
    }

    @Override // defpackage.xl3
    public ik9.a f(boolean z) {
        eq4 eq4Var = this.d;
        if (eq4Var != null) {
            ik9.a b = g.b(eq4Var.B(z), this.e);
            if (z && b.f() == 100) {
                return null;
            }
            return b;
        }
        throw new IOException("stream wasn't created");
    }

    @Override // defpackage.xl3
    public void g() {
        this.c.flush();
    }

    @Override // defpackage.xl3
    public xl3.a h() {
        return this.a;
    }

    @Override // defpackage.xl3
    public gn4 i() {
        eq4 eq4Var = this.d;
        z65.e(eq4Var);
        return eq4Var.C();
    }
}
