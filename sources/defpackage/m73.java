package defpackage;

import com.huawei.hms.adapter.internal.CommonCode;
import com.inappstory.sdk.network.NetworkHandler;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.java_websocket.exceptions.IncompleteHandshakeException;
import org.java_websocket.exceptions.InvalidDataException;
import org.java_websocket.exceptions.InvalidHandshakeException;
/* compiled from: Draft.java */
/* renamed from: m73  reason: default package */
/* loaded from: classes3.dex */
public abstract class m73 {
    protected hn9 a = null;
    protected ga7 b = null;

    public static ByteBuffer p(ByteBuffer byteBuffer) {
        ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining());
        byte b = 48;
        while (byteBuffer.hasRemaining()) {
            byte b2 = byteBuffer.get();
            allocate.put(b2);
            if (b == 13 && b2 == 10) {
                allocate.limit(allocate.position() - 2);
                allocate.position(0);
                return allocate;
            }
            b = b2;
        }
        byteBuffer.position(byteBuffer.position() - allocate.position());
        return null;
    }

    public static String q(ByteBuffer byteBuffer) {
        ByteBuffer p = p(byteBuffer);
        if (p == null) {
            return null;
        }
        return qw0.d(p.array(), 0, p.limit());
    }

    public static lm4 w(ByteBuffer byteBuffer, hn9 hn9Var) throws InvalidHandshakeException {
        lm4 y;
        String q = q(byteBuffer);
        if (q != null) {
            String[] split = q.split(" ", 3);
            if (split.length == 3) {
                if (hn9Var == hn9.CLIENT) {
                    y = x(split, q);
                } else {
                    y = y(split, q);
                }
                String q2 = q(byteBuffer);
                while (q2 != null && q2.length() > 0) {
                    String[] split2 = q2.split(":", 2);
                    if (split2.length == 2) {
                        if (y.b(split2[0])) {
                            String str = split2[0];
                            y.put(str, y.i(split2[0]) + "; " + split2[1].replaceFirst("^ +", ""));
                        } else {
                            y.put(split2[0], split2[1].replaceFirst("^ +", ""));
                        }
                        q2 = q(byteBuffer);
                    } else {
                        throw new InvalidHandshakeException("not an http header");
                    }
                }
                if (q2 != null) {
                    return y;
                }
                throw new IncompleteHandshakeException();
            }
            throw new InvalidHandshakeException();
        }
        throw new IncompleteHandshakeException(byteBuffer.capacity() + 128);
    }

    private static lm4 x(String[] strArr, String str) throws InvalidHandshakeException {
        if ("101".equals(strArr[1])) {
            if ("HTTP/1.1".equalsIgnoreCase(strArr[0])) {
                om4 om4Var = new om4();
                om4Var.f(Short.parseShort(strArr[1]));
                om4Var.h(strArr[2]);
                return om4Var;
            }
            throw new InvalidHandshakeException(String.format("Invalid status line received: %s Status line: %s", strArr[0], str));
        }
        throw new InvalidHandshakeException(String.format("Invalid status code received: %s Status line: %s", strArr[1], str));
    }

    private static lm4 y(String[] strArr, String str) throws InvalidHandshakeException {
        if (NetworkHandler.GET.equalsIgnoreCase(strArr[0])) {
            if ("HTTP/1.1".equalsIgnoreCase(strArr[2])) {
                nm4 nm4Var = new nm4();
                nm4Var.g(strArr[1]);
                return nm4Var;
            }
            throw new InvalidHandshakeException(String.format("Invalid status line received: %s Status line: %s", strArr[2], str));
        }
        throw new InvalidHandshakeException(String.format("Invalid request method received: %s Status line: %s", strArr[0], str));
    }

    public abstract pm4 a(i91 i91Var, kda kdaVar) throws InvalidHandshakeException;

    public abstract pm4 b(i91 i91Var) throws InvalidHandshakeException;

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean c(qm4 qm4Var) {
        if (qm4Var.i("Upgrade").equalsIgnoreCase("websocket") && qm4Var.i("Connection").toLowerCase(Locale.ENGLISH).contains("upgrade")) {
            return true;
        }
        return false;
    }

    public int d(int i) throws InvalidDataException {
        if (i >= 0) {
            return i;
        }
        throw new InvalidDataException((int) CommonCode.BusInterceptor.PRIVACY_CANCEL, "Negative count");
    }

    public List<i74> e(ga7 ga7Var, ByteBuffer byteBuffer, boolean z) {
        j74 j74Var;
        ga7 ga7Var2 = ga7.BINARY;
        if (ga7Var != ga7Var2 && ga7Var != ga7.TEXT) {
            throw new IllegalArgumentException("Only Opcode.BINARY or  Opcode.TEXT are allowed");
        }
        if (this.b != null) {
            j74Var = new hv1();
        } else {
            this.b = ga7Var;
            if (ga7Var == ga7Var2) {
                j74Var = new ib0();
            } else if (ga7Var == ga7.TEXT) {
                j74Var = new fbb();
            } else {
                j74Var = null;
            }
        }
        j74Var.j(byteBuffer);
        j74Var.i(z);
        try {
            j74Var.h();
            if (z) {
                this.b = null;
            } else {
                this.b = ga7Var;
            }
            return Collections.singletonList(j74Var);
        } catch (InvalidDataException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public abstract m73 f();

    public abstract ByteBuffer g(i74 i74Var);

    public abstract List<i74> h(String str, boolean z);

    public abstract List<i74> i(ByteBuffer byteBuffer, boolean z);

    public List<ByteBuffer> j(qm4 qm4Var) {
        return k(qm4Var, true);
    }

    public List<ByteBuffer> k(qm4 qm4Var, boolean z) {
        byte[] bArr;
        int length;
        StringBuilder sb = new StringBuilder(100);
        if (qm4Var instanceof i91) {
            sb.append("GET ");
            sb.append(((i91) qm4Var).c());
            sb.append(" HTTP/1.1");
        } else if (qm4Var instanceof kda) {
            sb.append("HTTP/1.1 101 ");
            sb.append(((kda) qm4Var).a());
        } else {
            throw new IllegalArgumentException("unknown role");
        }
        sb.append("\r\n");
        Iterator<String> d = qm4Var.d();
        while (d.hasNext()) {
            String next = d.next();
            String i = qm4Var.i(next);
            sb.append(next);
            sb.append(": ");
            sb.append(i);
            sb.append("\r\n");
        }
        sb.append("\r\n");
        byte[] a = qw0.a(sb.toString());
        if (z) {
            bArr = qm4Var.e();
        } else {
            bArr = null;
        }
        if (bArr == null) {
            length = 0;
        } else {
            length = bArr.length;
        }
        ByteBuffer allocate = ByteBuffer.allocate(length + a.length);
        allocate.put(a);
        if (bArr != null) {
            allocate.put(bArr);
        }
        allocate.flip();
        return Collections.singletonList(allocate);
    }

    public abstract z91 l();

    public abstract j91 m(j91 j91Var) throws InvalidHandshakeException;

    public abstract lm4 n(i91 i91Var, lda ldaVar) throws InvalidHandshakeException;

    public abstract void o(s3c s3cVar, i74 i74Var) throws InvalidDataException;

    /* JADX INFO: Access modifiers changed from: package-private */
    public int r(qm4 qm4Var) {
        String i = qm4Var.i("Sec-WebSocket-Version");
        if (i.length() > 0) {
            try {
                return new Integer(i.trim()).intValue();
            } catch (NumberFormatException unused) {
            }
        }
        return -1;
    }

    public abstract void s();

    public void t(hn9 hn9Var) {
        this.a = hn9Var;
    }

    public String toString() {
        return getClass().getSimpleName();
    }

    public abstract List<i74> u(ByteBuffer byteBuffer) throws InvalidDataException;

    public qm4 v(ByteBuffer byteBuffer) throws InvalidHandshakeException {
        return w(byteBuffer, this.a);
    }
}
