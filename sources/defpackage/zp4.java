package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.kustoworker.KustoStorage;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.ik9;
import defpackage.xl3;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: Http1ExchangeCodec.kt */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 -2\u00020\u0001:\u0007\u001a\u001e\u0019\u0014\u0016&\u001dB)\u0012\b\u0010*\u001a\u0004\u0018\u00010(\u0012\u0006\u0010/\u001a\u00020+\u0012\u0006\u00102\u001a\u000200\u0012\u0006\u00105\u001a\u000203¢\u0006\u0004\bC\u0010DJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002J\b\u0010\f\u001a\u00020\u0007H\u0002J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0018\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0005H\u0016J\b\u0010\u0015\u001a\u00020\u000fH\u0016J\u0010\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0010\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0017H\u0016J\u0010\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0017H\u0016J\b\u0010\u001c\u001a\u00020\u001bH\u0016J\b\u0010\u001d\u001a\u00020\u000fH\u0016J\b\u0010\u001e\u001a\u00020\u000fH\u0016J\u0016\u0010\"\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u001b2\u0006\u0010!\u001a\u00020 J\u0012\u0010&\u001a\u0004\u0018\u00010%2\u0006\u0010$\u001a\u00020#H\u0016J\u000e\u0010'\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u0017R\u0016\u0010*\u001a\u0004\u0018\u00010(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010)R\u001a\u0010/\u001a\u00020+8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010,\u001a\u0004\b-\u0010.R\u0014\u00102\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u00101R\u0014\u00105\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u00104R\u0016\u00108\u001a\u0002068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u00107R\u0014\u0010;\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010:R\u0018\u0010=\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010<R\u0018\u0010@\u001a\u00020#*\u00020\u00178BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b>\u0010?R\u0018\u0010@\u001a\u00020#*\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bA\u0010B¨\u0006E"}, d2 = {"Lzp4;", "Lxl3;", "Lzma;", "v", "y", "", "length", "Lpqa;", "x", "Lsq4;", RemoteMessageConst.Notification.URL, "w", "z", "Lz54;", "timeout", "", Image.TYPE_SMALL, "Lhi9;", "request", "contentLength", DateTokenConverter.CONVERTER_KEY, "cancel", com.huawei.hms.push.e.a, "Lik9;", "response", com.huawei.hms.opendevice.c.a, "a", "Lgn4;", "i", "g", "b", "headers", "", "requestLine", "B", "", "expectContinue", "Lik9$a;", "f", "A", "Lb77;", "Lb77;", "client", "Lxl3$a;", "Lxl3$a;", Image.TYPE_HIGH, "()Lxl3$a;", "carrier", "Lfh0;", "Lfh0;", KustoStorage.KustoTable.COLUMN_SOURCE, "Leh0;", "Leh0;", "sink", "", "I", "state", "Ljn4;", "Ljn4;", "headersReader", "Lgn4;", "trailers", "u", "(Lik9;)Z", "isChunked", "t", "(Lhi9;)Z", "<init>", "(Lb77;Lxl3$a;Lfh0;Leh0;)V", "okhttp"}, k = 1, mv = {1, 9, 0})
/* renamed from: zp4  reason: default package */
/* loaded from: classes3.dex */
public final class zp4 implements xl3 {
    public static final d h = new d(null);
    private final b77 a;
    private final xl3.a b;
    private final fh0 c;
    private final eh0 d;
    private int e;
    private final jn4 f;
    private gn4 g;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Http1ExchangeCodec.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\b¢\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0006\u0010\n\u001a\u00020\tR\u001a\u0010\u0003\u001a\u00020\u000b8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\"\u0010\u0015\u001a\u00020\u00108\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0011\u001a\u0004\b\f\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Lzp4$a;", "Lpqa;", "Lxgb;", "timeout", "Lyg0;", "sink", "", "byteCount", "read", "", "b", "Lz54;", "a", "Lz54;", "getTimeout", "()Lz54;", "", "Z", "()Z", com.huawei.hms.opendevice.c.a, "(Z)V", "closed", "<init>", "(Lzp4;)V", "okhttp"}, k = 1, mv = {1, 9, 0})
    /* renamed from: zp4$a */
    /* loaded from: classes3.dex */
    public abstract class a implements pqa {
        private final z54 a;
        private boolean b;

        public a() {
            this.a = new z54(zp4.this.c.timeout());
        }

        protected final boolean a() {
            return this.b;
        }

        public final void b() {
            if (zp4.this.e == 6) {
                return;
            }
            if (zp4.this.e == 5) {
                zp4.this.s(this.a);
                zp4.this.e = 6;
                return;
            }
            throw new IllegalStateException("state: " + zp4.this.e);
        }

        protected final void c(boolean z) {
            this.b = z;
        }

        @Override // defpackage.pqa
        public long read(yg0 yg0Var, long j) {
            z65.h(yg0Var, "sink");
            try {
                return zp4.this.c.read(yg0Var, j);
            } catch (IOException e) {
                zp4.this.h().b();
                b();
                throw e;
            }
        }

        @Override // defpackage.pqa
        public xgb timeout() {
            return this.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Http1ExchangeCodec.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\bH\u0016R\u0014\u0010\u0003\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lzp4$b;", "Lzma;", "Lxgb;", "timeout", "Lyg0;", KustoStorage.KustoTable.COLUMN_SOURCE, "", "byteCount", "", "r1", "flush", "close", "Lz54;", "a", "Lz54;", "", "b", "Z", "closed", "<init>", "(Lzp4;)V", "okhttp"}, k = 1, mv = {1, 9, 0})
    /* renamed from: zp4$b */
    /* loaded from: classes3.dex */
    public final class b implements zma {
        private final z54 a;
        private boolean b;

        public b() {
            this.a = new z54(zp4.this.d.timeout());
        }

        @Override // defpackage.zma, java.io.Closeable, java.lang.AutoCloseable
        public synchronized void close() {
            if (this.b) {
                return;
            }
            this.b = true;
            zp4.this.d.a0("0\r\n\r\n");
            zp4.this.s(this.a);
            zp4.this.e = 3;
        }

        @Override // defpackage.zma, java.io.Flushable
        public synchronized void flush() {
            if (this.b) {
                return;
            }
            zp4.this.d.flush();
        }

        @Override // defpackage.zma
        public void r1(yg0 yg0Var, long j) {
            z65.h(yg0Var, KustoStorage.KustoTable.COLUMN_SOURCE);
            if (!this.b) {
                if (j == 0) {
                    return;
                }
                zp4.this.d.u1(j);
                zp4.this.d.a0("\r\n");
                zp4.this.d.r1(yg0Var, j);
                zp4.this.d.a0("\r\n");
                return;
            }
            throw new IllegalStateException("closed".toString());
        }

        @Override // defpackage.zma
        public xgb timeout() {
            return this.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Http1ExchangeCodec.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0018\u0010\t\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\u0003H\u0016R\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0010\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u000fR\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Lzp4$c;", "Lzp4$a;", "Lzp4;", "", com.huawei.hms.push.e.a, "Lyg0;", "sink", "", "byteCount", "read", "close", "Lsq4;", DateTokenConverter.CONVERTER_KEY, "Lsq4;", RemoteMessageConst.Notification.URL, "J", "bytesRemainingInChunk", "", "f", "Z", "hasMoreChunks", "<init>", "(Lzp4;Lsq4;)V", "okhttp"}, k = 1, mv = {1, 9, 0})
    /* renamed from: zp4$c */
    /* loaded from: classes3.dex */
    public final class c extends a {
        private final sq4 d;
        private long e;
        private boolean f;
        final /* synthetic */ zp4 g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(zp4 zp4Var, sq4 sq4Var) {
            super();
            z65.h(sq4Var, RemoteMessageConst.Notification.URL);
            this.g = zp4Var;
            this.d = sq4Var;
            this.e = -1L;
            this.f = true;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0046, code lost:
            if (r1 != false) goto L11;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private final void e() {
            /*
                r7 = this;
                long r0 = r7.e
                r2 = -1
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 == 0) goto L11
                zp4 r0 = r7.g
                fh0 r0 = defpackage.zp4.n(r0)
                r0.s0()
            L11:
                zp4 r0 = r7.g     // Catch: java.lang.NumberFormatException -> L49
                fh0 r0 = defpackage.zp4.n(r0)     // Catch: java.lang.NumberFormatException -> L49
                long r0 = r0.T1()     // Catch: java.lang.NumberFormatException -> L49
                r7.e = r0     // Catch: java.lang.NumberFormatException -> L49
                zp4 r0 = r7.g     // Catch: java.lang.NumberFormatException -> L49
                fh0 r0 = defpackage.zp4.n(r0)     // Catch: java.lang.NumberFormatException -> L49
                java.lang.String r0 = r0.s0()     // Catch: java.lang.NumberFormatException -> L49
                java.lang.CharSequence r0 = defpackage.c0b.R0(r0)     // Catch: java.lang.NumberFormatException -> L49
                java.lang.String r0 = r0.toString()     // Catch: java.lang.NumberFormatException -> L49
                long r1 = r7.e     // Catch: java.lang.NumberFormatException -> L49
                r3 = 0
                int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r5 < 0) goto L7f
                int r1 = r0.length()     // Catch: java.lang.NumberFormatException -> L49
                r2 = 0
                if (r1 <= 0) goto L4b
                java.lang.String r1 = ";"
                r5 = 2
                r6 = 0
                boolean r1 = defpackage.c0b.J(r0, r1, r2, r5, r6)     // Catch: java.lang.NumberFormatException -> L49
                if (r1 == 0) goto L7f
                goto L4b
            L49:
                r0 = move-exception
                goto La0
            L4b:
                long r0 = r7.e
                int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
                if (r5 != 0) goto L7e
                r7.f = r2
                zp4 r0 = r7.g
                jn4 r1 = defpackage.zp4.l(r0)
                gn4 r1 = r1.a()
                defpackage.zp4.r(r0, r1)
                zp4 r0 = r7.g
                b77 r0 = defpackage.zp4.k(r0)
                defpackage.z65.e(r0)
                ow1 r0 = r0.m()
                sq4 r1 = r7.d
                zp4 r2 = r7.g
                gn4 r2 = defpackage.zp4.p(r2)
                defpackage.z65.e(r2)
                defpackage.lq4.f(r0, r1, r2)
                r7.b()
            L7e:
                return
            L7f:
                java.net.ProtocolException r1 = new java.net.ProtocolException     // Catch: java.lang.NumberFormatException -> L49
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.NumberFormatException -> L49
                r2.<init>()     // Catch: java.lang.NumberFormatException -> L49
                java.lang.String r3 = "expected chunk size and optional extensions but was \""
                r2.append(r3)     // Catch: java.lang.NumberFormatException -> L49
                long r3 = r7.e     // Catch: java.lang.NumberFormatException -> L49
                r2.append(r3)     // Catch: java.lang.NumberFormatException -> L49
                r2.append(r0)     // Catch: java.lang.NumberFormatException -> L49
                r0 = 34
                r2.append(r0)     // Catch: java.lang.NumberFormatException -> L49
                java.lang.String r0 = r2.toString()     // Catch: java.lang.NumberFormatException -> L49
                r1.<init>(r0)     // Catch: java.lang.NumberFormatException -> L49
                throw r1     // Catch: java.lang.NumberFormatException -> L49
            La0:
                java.net.ProtocolException r1 = new java.net.ProtocolException
                java.lang.String r0 = r0.getMessage()
                r1.<init>(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.zp4.c.e():void");
        }

        @Override // defpackage.pqa, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (a()) {
                return;
            }
            if (this.f && !cec.i(this, 100, TimeUnit.MILLISECONDS)) {
                this.g.h().b();
                b();
            }
            c(true);
        }

        @Override // defpackage.zp4.a, defpackage.pqa
        public long read(yg0 yg0Var, long j) {
            z65.h(yg0Var, "sink");
            if (j >= 0) {
                if (!a()) {
                    if (!this.f) {
                        return -1L;
                    }
                    long j2 = this.e;
                    if (j2 == 0 || j2 == -1) {
                        e();
                        if (!this.f) {
                            return -1L;
                        }
                    }
                    long read = super.read(yg0Var, Math.min(j, this.e));
                    if (read != -1) {
                        this.e -= read;
                        return read;
                    }
                    this.g.h().b();
                    ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                    b();
                    throw protocolException;
                }
                throw new IllegalStateException("closed".toString());
            }
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        }
    }

    /* compiled from: Http1ExchangeCodec.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0014\u0010\t\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0007R\u0014\u0010\f\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0007R\u0014\u0010\r\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0007¨\u0006\u0010"}, d2 = {"Lzp4$d;", "", "", "NO_CHUNK_YET", "J", "", "STATE_CLOSED", "I", "STATE_IDLE", "STATE_OPEN_REQUEST_BODY", "STATE_OPEN_RESPONSE_BODY", "STATE_READING_RESPONSE_BODY", "STATE_READ_RESPONSE_HEADERS", "STATE_WRITING_REQUEST_BODY", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 9, 0})
    /* renamed from: zp4$d */
    /* loaded from: classes3.dex */
    public static final class d {
        private d() {
        }

        public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Http1ExchangeCodec.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u000f\u0012\u0006\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\t\u001a\u00020\bH\u0016R\u0016\u0010\f\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lzp4$e;", "Lzp4$a;", "Lzp4;", "Lyg0;", "sink", "", "byteCount", "read", "", "close", DateTokenConverter.CONVERTER_KEY, "J", "bytesRemaining", "<init>", "(Lzp4;J)V", "okhttp"}, k = 1, mv = {1, 9, 0})
    /* renamed from: zp4$e */
    /* loaded from: classes3.dex */
    public final class e extends a {
        private long d;

        public e(long j) {
            super();
            this.d = j;
            if (j == 0) {
                b();
            }
        }

        @Override // defpackage.pqa, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (a()) {
                return;
            }
            if (this.d != 0 && !cec.i(this, 100, TimeUnit.MILLISECONDS)) {
                zp4.this.h().b();
                b();
            }
            c(true);
        }

        @Override // defpackage.zp4.a, defpackage.pqa
        public long read(yg0 yg0Var, long j) {
            z65.h(yg0Var, "sink");
            if (j >= 0) {
                if (!a()) {
                    long j2 = this.d;
                    if (j2 == 0) {
                        return -1L;
                    }
                    long read = super.read(yg0Var, Math.min(j2, j));
                    if (read != -1) {
                        long j3 = this.d - read;
                        this.d = j3;
                        if (j3 == 0) {
                            b();
                        }
                        return read;
                    }
                    zp4.this.h().b();
                    ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                    b();
                    throw protocolException;
                }
                throw new IllegalStateException("closed".toString());
            }
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Http1ExchangeCodec.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\bH\u0016R\u0014\u0010\u0003\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lzp4$f;", "Lzma;", "Lxgb;", "timeout", "Lyg0;", KustoStorage.KustoTable.COLUMN_SOURCE, "", "byteCount", "", "r1", "flush", "close", "Lz54;", "a", "Lz54;", "", "b", "Z", "closed", "<init>", "(Lzp4;)V", "okhttp"}, k = 1, mv = {1, 9, 0})
    /* renamed from: zp4$f */
    /* loaded from: classes3.dex */
    public final class f implements zma {
        private final z54 a;
        private boolean b;

        public f() {
            this.a = new z54(zp4.this.d.timeout());
        }

        @Override // defpackage.zma, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.b) {
                return;
            }
            this.b = true;
            zp4.this.s(this.a);
            zp4.this.e = 3;
        }

        @Override // defpackage.zma, java.io.Flushable
        public void flush() {
            if (this.b) {
                return;
            }
            zp4.this.d.flush();
        }

        @Override // defpackage.zma
        public void r1(yg0 yg0Var, long j) {
            z65.h(yg0Var, KustoStorage.KustoTable.COLUMN_SOURCE);
            if (!this.b) {
                zdc.e(yg0Var.P(), 0L, j);
                zp4.this.d.r1(yg0Var, j);
                return;
            }
            throw new IllegalStateException("closed".toString());
        }

        @Override // defpackage.zma
        public xgb timeout() {
            return this.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Http1ExchangeCodec.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\t\u001a\u00020\bH\u0016R\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lzp4$g;", "Lzp4$a;", "Lzp4;", "Lyg0;", "sink", "", "byteCount", "read", "", "close", "", DateTokenConverter.CONVERTER_KEY, "Z", "inputExhausted", "<init>", "(Lzp4;)V", "okhttp"}, k = 1, mv = {1, 9, 0})
    /* renamed from: zp4$g */
    /* loaded from: classes3.dex */
    public final class g extends a {
        private boolean d;

        public g() {
            super();
        }

        @Override // defpackage.pqa, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (a()) {
                return;
            }
            if (!this.d) {
                b();
            }
            c(true);
        }

        @Override // defpackage.zp4.a, defpackage.pqa
        public long read(yg0 yg0Var, long j) {
            z65.h(yg0Var, "sink");
            if (j >= 0) {
                if (!a()) {
                    if (this.d) {
                        return -1L;
                    }
                    long read = super.read(yg0Var, j);
                    if (read == -1) {
                        this.d = true;
                        b();
                        return -1L;
                    }
                    return read;
                }
                throw new IllegalStateException("closed".toString());
            }
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        }
    }

    /* compiled from: Http1ExchangeCodec.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lgn4;", "a", "()Lgn4;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: zp4$h */
    /* loaded from: classes3.dex */
    static final class h extends ej5 implements Function0<gn4> {
        public static final h a = new h();

        h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final gn4 invoke() {
            throw new IllegalStateException("trailers not available".toString());
        }
    }

    public zp4(b77 b77Var, xl3.a aVar, fh0 fh0Var, eh0 eh0Var) {
        z65.h(aVar, "carrier");
        z65.h(fh0Var, KustoStorage.KustoTable.COLUMN_SOURCE);
        z65.h(eh0Var, "sink");
        this.a = b77Var;
        this.b = aVar;
        this.c = fh0Var;
        this.d = eh0Var;
        this.f = new jn4(fh0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s(z54 z54Var) {
        xgb i = z54Var.i();
        z54Var.j(xgb.e);
        i.a();
        i.b();
    }

    private final boolean t(hi9 hi9Var) {
        boolean v;
        v = l0b.v("chunked", hi9Var.d("Transfer-Encoding"), true);
        return v;
    }

    private final boolean u(ik9 ik9Var) {
        boolean v;
        v = l0b.v("chunked", ik9.o(ik9Var, "Transfer-Encoding", null, 2, null), true);
        return v;
    }

    private final zma v() {
        if (this.e == 1) {
            this.e = 2;
            return new b();
        }
        throw new IllegalStateException(("state: " + this.e).toString());
    }

    private final pqa w(sq4 sq4Var) {
        if (this.e == 4) {
            this.e = 5;
            return new c(this, sq4Var);
        }
        throw new IllegalStateException(("state: " + this.e).toString());
    }

    private final pqa x(long j) {
        if (this.e == 4) {
            this.e = 5;
            return new e(j);
        }
        throw new IllegalStateException(("state: " + this.e).toString());
    }

    private final zma y() {
        if (this.e == 1) {
            this.e = 2;
            return new f();
        }
        throw new IllegalStateException(("state: " + this.e).toString());
    }

    private final pqa z() {
        if (this.e == 4) {
            this.e = 5;
            h().b();
            return new g();
        }
        throw new IllegalStateException(("state: " + this.e).toString());
    }

    public final void A(ik9 ik9Var) {
        z65.h(ik9Var, "response");
        long k = cec.k(ik9Var);
        if (k == -1) {
            return;
        }
        pqa x = x(k);
        cec.p(x, Integer.MAX_VALUE, TimeUnit.MILLISECONDS);
        x.close();
    }

    public final void B(gn4 gn4Var, String str) {
        z65.h(gn4Var, "headers");
        z65.h(str, "requestLine");
        if (this.e == 0) {
            this.d.a0(str).a0("\r\n");
            int size = gn4Var.size();
            for (int i = 0; i < size; i++) {
                this.d.a0(gn4Var.h(i)).a0(": ").a0(gn4Var.u(i)).a0("\r\n");
            }
            this.d.a0("\r\n");
            this.e = 1;
            return;
        }
        throw new IllegalStateException(("state: " + this.e).toString());
    }

    @Override // defpackage.xl3
    public pqa a(ik9 ik9Var) {
        z65.h(ik9Var, "response");
        if (!lq4.b(ik9Var)) {
            return x(0L);
        }
        if (u(ik9Var)) {
            return w(ik9Var.K().l());
        }
        long k = cec.k(ik9Var);
        if (k != -1) {
            return x(k);
        }
        return z();
    }

    @Override // defpackage.xl3
    public void b() {
        this.d.flush();
    }

    @Override // defpackage.xl3
    public long c(ik9 ik9Var) {
        z65.h(ik9Var, "response");
        if (!lq4.b(ik9Var)) {
            return 0L;
        }
        if (u(ik9Var)) {
            return -1L;
        }
        return cec.k(ik9Var);
    }

    @Override // defpackage.xl3
    public void cancel() {
        h().cancel();
    }

    @Override // defpackage.xl3
    public zma d(hi9 hi9Var, long j) {
        z65.h(hi9Var, "request");
        ji9 a2 = hi9Var.a();
        if (a2 != null && a2.isDuplex()) {
            throw new ProtocolException("Duplex connections are not supported for HTTP/1");
        }
        if (t(hi9Var)) {
            return v();
        }
        if (j != -1) {
            return y();
        }
        throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
    }

    @Override // defpackage.xl3
    public void e(hi9 hi9Var) {
        z65.h(hi9Var, "request");
        ui9 ui9Var = ui9.a;
        Proxy.Type type = h().e().b().type();
        z65.g(type, "type(...)");
        B(hi9Var.e(), ui9Var.a(hi9Var, type));
    }

    @Override // defpackage.xl3
    public ik9.a f(boolean z) {
        int i = this.e;
        if (i != 1 && i != 2 && i != 3) {
            throw new IllegalStateException(("state: " + this.e).toString());
        }
        try {
            swa a2 = swa.d.a(this.f.b());
            ik9.a D = new ik9.a().o(a2.a).e(a2.b).l(a2.c).j(this.f.a()).D(h.a);
            if (z && a2.b == 100) {
                return null;
            }
            int i2 = a2.b;
            if (i2 == 100) {
                this.e = 3;
                return D;
            } else if (102 <= i2 && i2 < 200) {
                this.e = 3;
                return D;
            } else {
                this.e = 4;
                return D;
            }
        } catch (EOFException e2) {
            String u = h().e().a().l().u();
            throw new IOException("unexpected end of stream on " + u, e2);
        }
    }

    @Override // defpackage.xl3
    public void g() {
        this.d.flush();
    }

    @Override // defpackage.xl3
    public xl3.a h() {
        return this.b;
    }

    @Override // defpackage.xl3
    public gn4 i() {
        if (this.e == 6) {
            gn4 gn4Var = this.g;
            if (gn4Var == null) {
                return cec.a;
            }
            return gn4Var;
        }
        throw new IllegalStateException("too early; can't read the trailers yet".toString());
    }
}
