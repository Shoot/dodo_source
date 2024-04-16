package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.kustoworker.KustoStorage;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import com.inappstory.sdk.stories.ui.widgets.readerscreen.generated.ElementGenerator;
import defpackage.rp4;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.IntRange;
import kotlin.ranges.d;
import kotlin.ranges.i;
/* compiled from: Http2Reader.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u000e2\u00020\u0001:\u0003\u001d\u001a\u0017B\u0017\u0012\u0006\u0010\u001f\u001a\u00020\u001c\u0012\u0006\u0010!\u001a\u00020\u0018¢\u0006\u0004\b)\u0010*J(\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J.\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J(\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J(\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J\u0018\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J(\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J(\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J(\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J(\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J(\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J(\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J\u000e\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u001b\u001a\u00020\bH\u0016R\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010!\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010 R\u0014\u0010$\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010#R\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006+"}, d2 = {"Ldq4;", "Ljava/io/Closeable;", "Ldq4$c;", "handler", "", "length", "flags", "streamId", "", "k", "padding", "", "Ldn4;", "j", e.a, "n", Image.TYPE_MEDIUM, "q", "r", "o", "l", "i", Image.TYPE_SMALL, com.huawei.hms.opendevice.c.a, "", "requireSettings", "b", "close", "Lfh0;", "a", "Lfh0;", KustoStorage.KustoTable.COLUMN_SOURCE, "Z", "client", "Ldq4$b;", "Ldq4$b;", "continuation", "Lrp4$a;", DateTokenConverter.CONVERTER_KEY, "Lrp4$a;", "hpackReader", "<init>", "(Lfh0;Z)V", "okhttp"}, k = 1, mv = {1, 9, 0})
/* renamed from: dq4  reason: default package */
/* loaded from: classes3.dex */
public final class dq4 implements Closeable {
    public static final a e = new a(null);
    private static final Logger f;
    private final fh0 a;
    private final boolean b;
    private final b c;
    private final rp4.a d;

    /* compiled from: Http2Reader.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u001e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Ldq4$a;", "", "", "length", "flags", "padding", "b", "Ljava/util/logging/Logger;", "logger", "Ljava/util/logging/Logger;", "a", "()Ljava/util/logging/Logger;", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 9, 0})
    /* renamed from: dq4$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Logger a() {
            return dq4.f;
        }

        public final int b(int i, int i2, int i3) throws IOException {
            if ((i2 & 8) != 0) {
                i--;
            }
            if (i3 <= i) {
                return i - i3;
            }
            throw new IOException("PROTOCOL_ERROR padding " + i3 + " > remaining length " + i);
        }
    }

    /* compiled from: Http2Reader.kt */
    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\n\bf\u0018\u00002\u00020\u0001J(\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004H&J.\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH&J\u0018\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H&J\u0018\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H&J\b\u0010\u0017\u001a\u00020\tH&J \u0010\u001b\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0004H&J \u0010\u001f\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u001dH&J\u0018\u0010\"\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010!\u001a\u00020 H&J(\u0010&\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u0002H&J&\u0010)\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010'\u001a\u00020\u00042\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\r0\fH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006*À\u0006\u0001"}, d2 = {"Ldq4$c;", "", "", "inFinished", "", "streamId", "Lfh0;", KustoStorage.KustoTable.COLUMN_SOURCE, "length", "", Image.TYPE_HIGH, "associatedStreamId", "", "Ldn4;", "headerBlock", "a", "Lfk3;", "errorCode", "g", "clearPrevious", "Lwfa;", "settings", DateTokenConverter.CONVERTER_KEY, "f", "ack", "payload1", "payload2", "i", "lastGoodStreamId", "Llk0;", "debugData", e.a, "", "windowSizeIncrement", "b", "streamDependency", "weight", "exclusive", "j", "promisedStreamId", "requestHeaders", com.huawei.hms.opendevice.c.a, "okhttp"}, k = 1, mv = {1, 9, 0})
    /* renamed from: dq4$c */
    /* loaded from: classes3.dex */
    public interface c {
        void a(boolean z, int i, int i2, List<dn4> list);

        void b(int i, long j);

        void c(int i, int i2, List<dn4> list) throws IOException;

        void d(boolean z, wfa wfaVar);

        void e(int i, fk3 fk3Var, lk0 lk0Var);

        void f();

        void g(int i, fk3 fk3Var);

        void h(boolean z, int i, fh0 fh0Var, int i2) throws IOException;

        void i(boolean z, int i, int i2);

        void j(int i, int i2, int i3, boolean z);
    }

    static {
        Logger logger = Logger.getLogger(aq4.class.getName());
        z65.g(logger, "getLogger(...)");
        f = logger;
    }

    public dq4(fh0 fh0Var, boolean z) {
        z65.h(fh0Var, KustoStorage.KustoTable.COLUMN_SOURCE);
        this.a = fh0Var;
        this.b = z;
        b bVar = new b(fh0Var);
        this.c = bVar;
        this.d = new rp4.a(bVar, 4096, 0, 4, null);
    }

    private final void e(c cVar, int i, int i2, int i3) throws IOException {
        boolean z;
        if (i3 != 0) {
            int i4 = 0;
            if ((i2 & 1) != 0) {
                z = true;
            } else {
                z = false;
            }
            if ((i2 & 32) == 0) {
                if ((i2 & 8) != 0) {
                    i4 = zdc.b(this.a.readByte(), 255);
                }
                cVar.h(z, i3, this.a, e.b(i, i2, i4));
                this.a.skip(i4);
                return;
            }
            throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
        }
        throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
    }

    private final void i(c cVar, int i, int i2, int i3) throws IOException {
        if (i >= 8) {
            if (i3 == 0) {
                int readInt = this.a.readInt();
                int readInt2 = this.a.readInt();
                int i4 = i - 8;
                fk3 a2 = fk3.b.a(readInt2);
                if (a2 != null) {
                    lk0 lk0Var = lk0.e;
                    if (i4 > 0) {
                        lk0Var = this.a.J0(i4);
                    }
                    cVar.e(readInt, a2, lk0Var);
                    return;
                }
                throw new IOException("TYPE_GOAWAY unexpected error code: " + readInt2);
            }
            throw new IOException("TYPE_GOAWAY streamId != 0");
        }
        throw new IOException("TYPE_GOAWAY length < 8: " + i);
    }

    private final List<dn4> j(int i, int i2, int i3, int i4) throws IOException {
        this.c.e(i);
        b bVar = this.c;
        bVar.i(bVar.a());
        this.c.j(i2);
        this.c.c(i3);
        this.c.k(i4);
        this.d.k();
        return this.d.e();
    }

    private final void k(c cVar, int i, int i2, int i3) throws IOException {
        boolean z;
        if (i3 != 0) {
            int i4 = 0;
            if ((i2 & 1) != 0) {
                z = true;
            } else {
                z = false;
            }
            if ((i2 & 8) != 0) {
                i4 = zdc.b(this.a.readByte(), 255);
            }
            if ((i2 & 32) != 0) {
                m(cVar, i3);
                i -= 5;
            }
            cVar.a(z, i3, -1, j(e.b(i, i2, i4), i4, i2, i3));
            return;
        }
        throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
    }

    private final void l(c cVar, int i, int i2, int i3) throws IOException {
        if (i == 8) {
            if (i3 == 0) {
                int readInt = this.a.readInt();
                int readInt2 = this.a.readInt();
                boolean z = true;
                if ((i2 & 1) == 0) {
                    z = false;
                }
                cVar.i(z, readInt, readInt2);
                return;
            }
            throw new IOException("TYPE_PING streamId != 0");
        }
        throw new IOException("TYPE_PING length != 8: " + i);
    }

    private final void m(c cVar, int i) throws IOException {
        boolean z;
        int readInt = this.a.readInt();
        if ((Integer.MIN_VALUE & readInt) != 0) {
            z = true;
        } else {
            z = false;
        }
        cVar.j(i, readInt & Integer.MAX_VALUE, zdc.b(this.a.readByte(), 255) + 1, z);
    }

    private final void n(c cVar, int i, int i2, int i3) throws IOException {
        if (i == 5) {
            if (i3 != 0) {
                m(cVar, i3);
                return;
            }
            throw new IOException("TYPE_PRIORITY streamId == 0");
        }
        throw new IOException("TYPE_PRIORITY length: " + i + " != 5");
    }

    private final void o(c cVar, int i, int i2, int i3) throws IOException {
        int i4;
        if (i3 != 0) {
            if ((i2 & 8) != 0) {
                i4 = zdc.b(this.a.readByte(), 255);
            } else {
                i4 = 0;
            }
            cVar.c(i3, this.a.readInt() & Integer.MAX_VALUE, j(e.b(i - 4, i2, i4), i4, i2, i3));
            return;
        }
        throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
    }

    private final void q(c cVar, int i, int i2, int i3) throws IOException {
        if (i == 4) {
            if (i3 != 0) {
                int readInt = this.a.readInt();
                fk3 a2 = fk3.b.a(readInt);
                if (a2 != null) {
                    cVar.g(i3, a2);
                    return;
                }
                throw new IOException("TYPE_RST_STREAM unexpected error code: " + readInt);
            }
            throw new IOException("TYPE_RST_STREAM streamId == 0");
        }
        throw new IOException("TYPE_RST_STREAM length: " + i + " != 4");
    }

    private final void r(c cVar, int i, int i2, int i3) throws IOException {
        IntRange q;
        d p;
        int readInt;
        if (i3 == 0) {
            if ((i2 & 1) != 0) {
                if (i == 0) {
                    cVar.f();
                    return;
                }
                throw new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
            } else if (i % 6 == 0) {
                wfa wfaVar = new wfa();
                q = i.q(0, i);
                p = i.p(q, 6);
                int h = p.h();
                int k = p.k();
                int p2 = p.p();
                if ((p2 > 0 && h <= k) || (p2 < 0 && k <= h)) {
                    while (true) {
                        int c2 = zdc.c(this.a.readShort(), 65535);
                        readInt = this.a.readInt();
                        if (c2 != 2) {
                            if (c2 != 3) {
                                if (c2 != 4) {
                                    if (c2 == 5 && (readInt < 16384 || readInt > 16777215)) {
                                        break;
                                    }
                                } else if (readInt >= 0) {
                                    c2 = 7;
                                } else {
                                    throw new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                                }
                            } else {
                                c2 = 4;
                            }
                        } else if (readInt != 0 && readInt != 1) {
                            throw new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                        }
                        wfaVar.h(c2, readInt);
                        if (h == k) {
                            break;
                        }
                        h += p2;
                    }
                    throw new IOException("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: " + readInt);
                }
                cVar.d(false, wfaVar);
                return;
            } else {
                throw new IOException("TYPE_SETTINGS length % 6 != 0: " + i);
            }
        }
        throw new IOException("TYPE_SETTINGS streamId != 0");
    }

    private final void s(c cVar, int i, int i2, int i3) throws IOException {
        try {
            if (i == 4) {
                long d = zdc.d(this.a.readInt(), 2147483647L);
                if (d != 0) {
                    Logger logger = f;
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine(aq4.a.d(true, i3, i, d));
                    }
                    cVar.b(i3, d);
                    return;
                }
                throw new IOException("windowSizeIncrement was 0");
            }
            throw new IOException("TYPE_WINDOW_UPDATE length !=4: " + i);
        } catch (Exception e2) {
            f.fine(aq4.a.c(true, i3, i, 8, i2));
            throw e2;
        }
    }

    public final boolean b(boolean z, c cVar) throws IOException {
        z65.h(cVar, "handler");
        try {
            this.a.B0(9L);
            int E = zdc.E(this.a);
            if (E <= 16384) {
                int b2 = zdc.b(this.a.readByte(), 255);
                int b3 = zdc.b(this.a.readByte(), 255);
                int readInt = this.a.readInt() & Integer.MAX_VALUE;
                if (b2 != 8) {
                    Logger logger = f;
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine(aq4.a.c(true, readInt, E, b2, b3));
                    }
                }
                if (z && b2 != 4) {
                    throw new IOException("Expected a SETTINGS frame but was " + aq4.a.b(b2));
                }
                switch (b2) {
                    case 0:
                        e(cVar, E, b3, readInt);
                        return true;
                    case 1:
                        k(cVar, E, b3, readInt);
                        return true;
                    case 2:
                        n(cVar, E, b3, readInt);
                        return true;
                    case 3:
                        q(cVar, E, b3, readInt);
                        return true;
                    case 4:
                        r(cVar, E, b3, readInt);
                        return true;
                    case 5:
                        o(cVar, E, b3, readInt);
                        return true;
                    case 6:
                        l(cVar, E, b3, readInt);
                        return true;
                    case 7:
                        i(cVar, E, b3, readInt);
                        return true;
                    case 8:
                        s(cVar, E, b3, readInt);
                        return true;
                    default:
                        this.a.skip(E);
                        return true;
                }
            }
            throw new IOException("FRAME_SIZE_ERROR: " + E);
        } catch (EOFException unused) {
            return false;
        }
    }

    public final void c(c cVar) throws IOException {
        z65.h(cVar, "handler");
        if (this.b) {
            if (!b(true, cVar)) {
                throw new IOException("Required SETTINGS preface not received");
            }
            return;
        }
        fh0 fh0Var = this.a;
        lk0 lk0Var = aq4.b;
        lk0 J0 = fh0Var.J0(lk0Var.n0());
        Logger logger = f;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(cec.j("<< CONNECTION " + J0.G(), new Object[0]));
        }
        if (z65.c(lk0Var, J0)) {
            return;
        }
        throw new IOException("Expected a connection header but was " + J0.z0());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.a.close();
    }

    /* compiled from: Http2Reader.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0016\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b$\u0010%J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\u000b\u001a\u00020\u0002H\u0016R\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\"\u0010\u0016\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u0019\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0011\u001a\u0004\b\u0018\u0010\u0013\"\u0004\b\u0017\u0010\u0015R\"\u0010\u001d\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0011\u001a\u0004\b\u001b\u0010\u0013\"\u0004\b\u001c\u0010\u0015R\"\u0010\u001f\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0011\u001a\u0004\b\r\u0010\u0013\"\u0004\b\u001e\u0010\u0015R\"\u0010#\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010\u0011\u001a\u0004\b!\u0010\u0013\"\u0004\b\"\u0010\u0015¨\u0006&"}, d2 = {"Ldq4$b;", "Lpqa;", "", "b", "Lyg0;", "sink", "", "byteCount", "read", "Lxgb;", "timeout", "close", "Lfh0;", "a", "Lfh0;", KustoStorage.KustoTable.COLUMN_SOURCE, "", "I", "getLength", "()I", "i", "(I)V", "length", com.huawei.hms.opendevice.c.a, "getFlags", "flags", DateTokenConverter.CONVERTER_KEY, "getStreamId", "k", "streamId", e.a, ElementGenerator.TEXT_ALIGN_LEFT, "f", "getPadding", "j", "padding", "<init>", "(Lfh0;)V", "okhttp"}, k = 1, mv = {1, 9, 0})
    /* renamed from: dq4$b */
    /* loaded from: classes3.dex */
    public static final class b implements pqa {
        private final fh0 a;
        private int b;
        private int c;
        private int d;
        private int e;
        private int f;

        public b(fh0 fh0Var) {
            z65.h(fh0Var, KustoStorage.KustoTable.COLUMN_SOURCE);
            this.a = fh0Var;
        }

        private final void b() throws IOException {
            int i = this.d;
            int E = zdc.E(this.a);
            this.e = E;
            this.b = E;
            int b = zdc.b(this.a.readByte(), 255);
            this.c = zdc.b(this.a.readByte(), 255);
            a aVar = dq4.e;
            if (aVar.a().isLoggable(Level.FINE)) {
                aVar.a().fine(aq4.a.c(true, this.d, this.b, b, this.c));
            }
            int readInt = this.a.readInt() & Integer.MAX_VALUE;
            this.d = readInt;
            if (b == 9) {
                if (readInt == i) {
                    return;
                }
                throw new IOException("TYPE_CONTINUATION streamId changed");
            }
            throw new IOException(b + " != TYPE_CONTINUATION");
        }

        public final int a() {
            return this.e;
        }

        public final void c(int i) {
            this.c = i;
        }

        public final void e(int i) {
            this.e = i;
        }

        public final void i(int i) {
            this.b = i;
        }

        public final void j(int i) {
            this.f = i;
        }

        public final void k(int i) {
            this.d = i;
        }

        @Override // defpackage.pqa
        public long read(yg0 yg0Var, long j) throws IOException {
            z65.h(yg0Var, "sink");
            while (true) {
                int i = this.e;
                if (i == 0) {
                    this.a.skip(this.f);
                    this.f = 0;
                    if ((this.c & 4) != 0) {
                        return -1L;
                    }
                    b();
                } else {
                    long read = this.a.read(yg0Var, Math.min(j, i));
                    if (read == -1) {
                        return -1L;
                    }
                    this.e -= (int) read;
                    return read;
                }
            }
        }

        @Override // defpackage.pqa
        public xgb timeout() {
            return this.a.timeout();
        }

        @Override // defpackage.pqa, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }
    }
}
