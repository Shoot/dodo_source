package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.kustoworker.KustoStorage;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.yg0;
import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
/* compiled from: WebSocketReader.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\bB/\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\r\u0012\u0006\u0010\u0014\u001a\u00020\u0012\u0012\u0006\u0010\u0016\u001a\u00020\n\u0012\u0006\u0010\u0017\u001a\u00020\n¢\u0006\u0004\b8\u00109J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0002H\u0002J\u0006\u0010\b\u001a\u00020\u0002J\b\u0010\t\u001a\u00020\u0002H\u0016R\u0014\u0010\f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u000bR\u0017\u0010\u0011\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u000bR\u0014\u0010\u0017\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000bR\u0016\u0010\u0019\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u000bR\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010\"\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u000bR\u0016\u0010#\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u000bR\u0016\u0010%\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010\u000bR\u0014\u0010)\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010+\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010(R\u0018\u0010/\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u00103\u001a\u0004\u0018\u0001008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00107\u001a\u0004\u0018\u0001048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106¨\u0006:"}, d2 = {"Lw3c;", "Ljava/io/Closeable;", "", c.a, "b", "i", "j", e.a, "a", "close", "", "Z", "isClient", "Lfh0;", "Lfh0;", "getSource", "()Lfh0;", KustoStorage.KustoTable.COLUMN_SOURCE, "Lw3c$a;", "Lw3c$a;", "frameCallback", DateTokenConverter.CONVERTER_KEY, "perMessageDeflate", "noContextTakeover", "f", "closed", "", "g", "I", "opcode", "", Image.TYPE_HIGH, "J", "frameLength", "isFinalFrame", "isControlFrame", "k", "readingCompressedMessage", "Lyg0;", "l", "Lyg0;", "controlFrameBuffer", Image.TYPE_MEDIUM, "messageFrameBuffer", "Lzh6;", "n", "Lzh6;", "messageInflater", "", "o", "[B", "maskKey", "Lyg0$a;", "p", "Lyg0$a;", "maskCursor", "<init>", "(ZLfh0;Lw3c$a;ZZ)V", "okhttp"}, k = 1, mv = {1, 9, 0})
/* renamed from: w3c  reason: default package */
/* loaded from: classes3.dex */
public final class w3c implements Closeable {
    private final boolean a;
    private final fh0 b;
    private final a c;
    private final boolean d;
    private final boolean e;
    private boolean f;
    private int g;
    private long h;
    private boolean i;
    private boolean j;
    private boolean k;
    private final yg0 l;
    private final yg0 m;
    private zh6 n;
    private final byte[] o;
    private final yg0.a p;

    /* compiled from: WebSocketReader.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006H&J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006H&J\u0018\u0010\u000f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0002H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0001"}, d2 = {"Lw3c$a;", "", "", "text", "", "b", "Llk0;", "bytes", "g", "payload", e.a, c.a, "", "code", "reason", "f", "okhttp"}, k = 1, mv = {1, 9, 0})
    /* renamed from: w3c$a */
    /* loaded from: classes3.dex */
    public interface a {
        void b(String str) throws IOException;

        void c(lk0 lk0Var);

        void e(lk0 lk0Var);

        void f(int i, String str);

        void g(lk0 lk0Var) throws IOException;
    }

    public w3c(boolean z, fh0 fh0Var, a aVar, boolean z2, boolean z3) {
        byte[] bArr;
        z65.h(fh0Var, KustoStorage.KustoTable.COLUMN_SOURCE);
        z65.h(aVar, "frameCallback");
        this.a = z;
        this.b = fh0Var;
        this.c = aVar;
        this.d = z2;
        this.e = z3;
        this.l = new yg0();
        this.m = new yg0();
        if (z) {
            bArr = null;
        } else {
            bArr = new byte[4];
        }
        this.o = bArr;
        this.p = z ? null : new yg0.a();
    }

    private final void b() throws IOException {
        short s;
        String str;
        long j = this.h;
        if (j > 0) {
            this.b.c0(this.l, j);
            if (!this.a) {
                yg0 yg0Var = this.l;
                yg0.a aVar = this.p;
                z65.e(aVar);
                yg0Var.y(aVar);
                this.p.e(0L);
                v3c v3cVar = v3c.a;
                yg0.a aVar2 = this.p;
                byte[] bArr = this.o;
                z65.e(bArr);
                v3cVar.b(aVar2, bArr);
                this.p.close();
            }
        }
        switch (this.g) {
            case 8:
                long P = this.l.P();
                if (P != 1) {
                    if (P != 0) {
                        s = this.l.readShort();
                        str = this.l.L();
                        String a2 = v3c.a.a(s);
                        if (a2 != null) {
                            throw new ProtocolException(a2);
                        }
                    } else {
                        s = 1005;
                        str = "";
                    }
                    this.c.f(s, str);
                    this.f = true;
                    return;
                }
                throw new ProtocolException("Malformed close payload length of 1.");
            case 9:
                this.c.e(this.l.v1());
                return;
            case 10:
                this.c.c(this.l.v1());
                return;
            default:
                throw new ProtocolException("Unknown control opcode: " + cec.u(this.g));
        }
    }

    private final void c() throws IOException, ProtocolException {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        String str;
        if (!this.f) {
            long h = this.b.timeout().h();
            this.b.timeout().b();
            try {
                int b = zdc.b(this.b.readByte(), 255);
                this.b.timeout().g(h, TimeUnit.NANOSECONDS);
                int i = b & 15;
                this.g = i;
                boolean z5 = false;
                if ((b & 128) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                this.i = z;
                if ((b & 8) != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                this.j = z2;
                if (z2 && !z) {
                    throw new ProtocolException("Control frames must be final.");
                }
                if ((b & 64) != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (i != 1 && i != 2) {
                    if (z3) {
                        throw new ProtocolException("Unexpected rsv1 flag");
                    }
                } else {
                    if (z3) {
                        if (this.d) {
                            z4 = true;
                        } else {
                            throw new ProtocolException("Unexpected rsv1 flag");
                        }
                    } else {
                        z4 = false;
                    }
                    this.k = z4;
                }
                if ((b & 32) == 0) {
                    if ((b & 16) == 0) {
                        int b2 = zdc.b(this.b.readByte(), 255);
                        if ((b2 & 128) != 0) {
                            z5 = true;
                        }
                        if (z5 == this.a) {
                            if (this.a) {
                                str = "Server-sent frames must not be masked.";
                            } else {
                                str = "Client-sent frames must be masked.";
                            }
                            throw new ProtocolException(str);
                        }
                        long j = b2 & 127;
                        this.h = j;
                        if (j == 126) {
                            this.h = zdc.c(this.b.readShort(), 65535);
                        } else if (j == 127) {
                            long readLong = this.b.readLong();
                            this.h = readLong;
                            if (readLong < 0) {
                                throw new ProtocolException("Frame length 0x" + cec.v(this.h) + " > 0x7FFFFFFFFFFFFFFF");
                            }
                        }
                        if (this.j && this.h > 125) {
                            throw new ProtocolException("Control frame must be less than 125B.");
                        }
                        if (z5) {
                            fh0 fh0Var = this.b;
                            byte[] bArr = this.o;
                            z65.e(bArr);
                            fh0Var.readFully(bArr);
                            return;
                        }
                        return;
                    }
                    throw new ProtocolException("Unexpected rsv3 flag");
                }
                throw new ProtocolException("Unexpected rsv2 flag");
            } catch (Throwable th) {
                this.b.timeout().g(h, TimeUnit.NANOSECONDS);
                throw th;
            }
        }
        throw new IOException("closed");
    }

    private final void e() throws IOException {
        while (!this.f) {
            long j = this.h;
            if (j > 0) {
                this.b.c0(this.m, j);
                if (!this.a) {
                    yg0 yg0Var = this.m;
                    yg0.a aVar = this.p;
                    z65.e(aVar);
                    yg0Var.y(aVar);
                    this.p.e(this.m.P() - this.h);
                    v3c v3cVar = v3c.a;
                    yg0.a aVar2 = this.p;
                    byte[] bArr = this.o;
                    z65.e(bArr);
                    v3cVar.b(aVar2, bArr);
                    this.p.close();
                }
            }
            if (!this.i) {
                j();
                if (this.g != 0) {
                    throw new ProtocolException("Expected continuation opcode. Got: " + cec.u(this.g));
                }
            } else {
                return;
            }
        }
        throw new IOException("closed");
    }

    private final void i() throws IOException {
        int i = this.g;
        if (i != 1 && i != 2) {
            throw new ProtocolException("Unknown opcode: " + cec.u(i));
        }
        e();
        if (this.k) {
            zh6 zh6Var = this.n;
            if (zh6Var == null) {
                zh6Var = new zh6(this.e);
                this.n = zh6Var;
            }
            zh6Var.a(this.m);
        }
        if (i == 1) {
            this.c.b(this.m.L());
        } else {
            this.c.g(this.m.v1());
        }
    }

    private final void j() throws IOException {
        while (!this.f) {
            c();
            if (this.j) {
                b();
            } else {
                return;
            }
        }
    }

    public final void a() throws IOException {
        c();
        if (this.j) {
            b();
        } else {
            i();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        zh6 zh6Var = this.n;
        if (zh6Var != null) {
            zh6Var.close();
        }
    }
}
