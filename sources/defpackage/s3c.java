package defpackage;

import com.huawei.hms.adapter.internal.CommonCode;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.channels.SelectionKey;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import org.java_websocket.exceptions.IncompleteHandshakeException;
import org.java_websocket.exceptions.InvalidDataException;
import org.java_websocket.exceptions.InvalidHandshakeException;
import org.java_websocket.exceptions.LimitExceededException;
import org.java_websocket.exceptions.WebsocketNotConnectedException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/* compiled from: WebSocketImpl.java */
/* renamed from: s3c  reason: default package */
/* loaded from: classes3.dex */
public class s3c implements n3c {
    public final BlockingQueue<ByteBuffer> b;
    public final BlockingQueue<ByteBuffer> c;
    private final t3c d;
    private SelectionKey e;
    private ByteChannel f;
    private List<m73> i;
    private m73 j;
    private hn9 k;
    private Object t;
    private final Logger a = LoggerFactory.getLogger(s3c.class);
    private boolean g = false;
    private volatile q79 h = q79.NOT_YET_CONNECTED;
    private ByteBuffer l = ByteBuffer.allocate(0);
    private i91 m = null;
    private String n = null;
    private Integer o = null;
    private Boolean p = null;
    private String q = null;
    private long r = System.nanoTime();
    private final Object s = new Object();

    public s3c(t3c t3cVar, m73 m73Var) {
        this.j = null;
        if (t3cVar != null && (m73Var != null || this.k != hn9.SERVER)) {
            this.b = new LinkedBlockingQueue();
            this.c = new LinkedBlockingQueue();
            this.d = t3cVar;
            this.k = hn9.CLIENT;
            if (m73Var != null) {
                this.j = m73Var.f();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("parameters must not be null");
    }

    private void B(qm4 qm4Var) {
        this.a.trace("open using draft: {}", this.j);
        this.h = q79.OPEN;
        L();
        try {
            this.d.onWebsocketOpen(this, qm4Var);
        } catch (RuntimeException e) {
            this.d.onWebsocketError(this, e);
        }
    }

    private void E(Collection<i74> collection) {
        if (A()) {
            if (collection != null) {
                ArrayList arrayList = new ArrayList();
                for (i74 i74Var : collection) {
                    this.a.trace("send frame: {}", i74Var);
                    arrayList.add(this.j.g(i74Var));
                }
                N(arrayList);
                return;
            }
            throw new IllegalArgumentException();
        }
        throw new WebsocketNotConnectedException();
    }

    private void M(ByteBuffer byteBuffer) {
        String str;
        Logger logger = this.a;
        Integer valueOf = Integer.valueOf(byteBuffer.remaining());
        if (byteBuffer.remaining() > 1000) {
            str = "too big to display";
        } else {
            str = new String(byteBuffer.array());
        }
        logger.trace("write({}): {}", valueOf, str);
        this.b.add(byteBuffer);
        this.d.onWriteDemand(this);
    }

    private void N(List<ByteBuffer> list) {
        synchronized (this.s) {
            try {
                for (ByteBuffer byteBuffer : list) {
                    M(byteBuffer);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void h(RuntimeException runtimeException) {
        M(o(500));
        n(-1, runtimeException.getMessage(), false);
    }

    private void i(InvalidDataException invalidDataException) {
        M(o(404));
        n(invalidDataException.a(), invalidDataException.getMessage(), false);
    }

    private void k(ByteBuffer byteBuffer) {
        try {
            for (i74 i74Var : this.j.u(byteBuffer)) {
                this.a.trace("matched frame: {}", i74Var);
                this.j.o(this, i74Var);
            }
        } catch (LinkageError e) {
            e = e;
            this.a.error("Got fatal error during frame processing");
            throw e;
        } catch (ThreadDeath e2) {
            e = e2;
            this.a.error("Got fatal error during frame processing");
            throw e;
        } catch (VirtualMachineError e3) {
            e = e3;
            this.a.error("Got fatal error during frame processing");
            throw e;
        } catch (Error e4) {
            this.a.error("Closing web socket due to an error during frame processing");
            this.d.onWebsocketError(this, new Exception(e4));
            b(1011, "Got error " + e4.getClass().getName());
        } catch (LimitExceededException e5) {
            if (e5.b() == Integer.MAX_VALUE) {
                this.a.error("Closing due to invalid size of frame", (Throwable) e5);
                this.d.onWebsocketError(this, e5);
            }
            d(e5);
        } catch (InvalidDataException e6) {
            this.a.error("Closing due to invalid data in frame", (Throwable) e6);
            this.d.onWebsocketError(this, e6);
            d(e6);
        }
    }

    private boolean l(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2;
        hn9 hn9Var;
        qm4 v;
        if (this.l.capacity() == 0) {
            byteBuffer2 = byteBuffer;
        } else {
            if (this.l.remaining() < byteBuffer.remaining()) {
                ByteBuffer allocate = ByteBuffer.allocate(this.l.capacity() + byteBuffer.remaining());
                this.l.flip();
                allocate.put(this.l);
                this.l = allocate;
            }
            this.l.put(byteBuffer);
            this.l.flip();
            byteBuffer2 = this.l;
        }
        byteBuffer2.mark();
        try {
            try {
                hn9Var = this.k;
            } catch (InvalidHandshakeException e) {
                this.a.trace("Closing due to invalid handshake", (Throwable) e);
                d(e);
            }
        } catch (IncompleteHandshakeException e2) {
            if (this.l.capacity() == 0) {
                byteBuffer2.reset();
                int a = e2.a();
                if (a == 0) {
                    a = byteBuffer2.capacity() + 16;
                }
                ByteBuffer allocate2 = ByteBuffer.allocate(a);
                this.l = allocate2;
                allocate2.put(byteBuffer);
            } else {
                ByteBuffer byteBuffer3 = this.l;
                byteBuffer3.position(byteBuffer3.limit());
                ByteBuffer byteBuffer4 = this.l;
                byteBuffer4.limit(byteBuffer4.capacity());
            }
        }
        if (hn9Var == hn9.SERVER) {
            m73 m73Var = this.j;
            if (m73Var == null) {
                for (m73 m73Var2 : this.i) {
                    m73 f = m73Var2.f();
                    try {
                        f.t(this.k);
                        byteBuffer2.reset();
                        v = f.v(byteBuffer2);
                    } catch (InvalidHandshakeException unused) {
                    }
                    if (!(v instanceof i91)) {
                        this.a.trace("Closing due to wrong handshake");
                        i(new InvalidDataException((int) CommonCode.BusInterceptor.PRIVACY_CANCEL, "wrong http function"));
                        return false;
                    }
                    i91 i91Var = (i91) v;
                    if (f.b(i91Var) == pm4.MATCHED) {
                        this.q = i91Var.c();
                        try {
                            N(f.j(f.n(i91Var, this.d.onWebsocketHandshakeReceivedAsServer(this, f, i91Var))));
                            this.j = f;
                            B(i91Var);
                            return true;
                        } catch (RuntimeException e3) {
                            this.a.error("Closing due to internal server error", (Throwable) e3);
                            this.d.onWebsocketError(this, e3);
                            h(e3);
                            return false;
                        } catch (InvalidDataException e4) {
                            this.a.trace("Closing due to wrong handshake. Possible handshake rejection", (Throwable) e4);
                            i(e4);
                            return false;
                        }
                    }
                }
                if (this.j == null) {
                    this.a.trace("Closing due to protocol error: no draft matches");
                    i(new InvalidDataException((int) CommonCode.BusInterceptor.PRIVACY_CANCEL, "no draft matches"));
                }
                return false;
            }
            qm4 v2 = m73Var.v(byteBuffer2);
            if (!(v2 instanceof i91)) {
                this.a.trace("Closing due to protocol error: wrong http function");
                n(CommonCode.BusInterceptor.PRIVACY_CANCEL, "wrong http function", false);
                return false;
            }
            i91 i91Var2 = (i91) v2;
            if (this.j.b(i91Var2) == pm4.MATCHED) {
                B(i91Var2);
                return true;
            }
            this.a.trace("Closing due to protocol error: the handshake did finally not match");
            b(CommonCode.BusInterceptor.PRIVACY_CANCEL, "the handshake did finally not match");
            return false;
        }
        if (hn9Var == hn9.CLIENT) {
            this.j.t(hn9Var);
            qm4 v3 = this.j.v(byteBuffer2);
            if (!(v3 instanceof kda)) {
                this.a.trace("Closing due to protocol error: wrong http function");
                n(CommonCode.BusInterceptor.PRIVACY_CANCEL, "wrong http function", false);
                return false;
            }
            kda kdaVar = (kda) v3;
            if (this.j.a(this.m, kdaVar) == pm4.MATCHED) {
                try {
                    this.d.onWebsocketHandshakeReceivedAsClient(this, this.m, kdaVar);
                    B(kdaVar);
                    return true;
                } catch (RuntimeException e5) {
                    this.a.error("Closing since client was never connected", (Throwable) e5);
                    this.d.onWebsocketError(this, e5);
                    n(-1, e5.getMessage(), false);
                    return false;
                } catch (InvalidDataException e6) {
                    this.a.trace("Closing due to invalid data exception. Possible handshake rejection", (Throwable) e6);
                    n(e6.a(), e6.getMessage(), false);
                    return false;
                }
            }
            this.a.trace("Closing due to protocol error: draft {} refuses handshake", this.j);
            b(CommonCode.BusInterceptor.PRIVACY_CANCEL, "draft " + this.j + " refuses handshake");
        }
        return false;
    }

    private ByteBuffer o(int i) {
        String str;
        if (i != 404) {
            str = "500 Internal Server Error";
        } else {
            str = "404 WebSocket Upgrade Failure";
        }
        return ByteBuffer.wrap(qw0.a("HTTP/1.1 " + str + "\r\nContent-Type: text/html\r\nServer: TooTallNate Java-WebSocket\r\nContent-Length: " + (str.length() + 48) + "\r\n\r\n<html><head></head><body><h1>" + str + "</h1></body></html>"));
    }

    public boolean A() {
        if (this.h == q79.OPEN) {
            return true;
        }
        return false;
    }

    public void C(String str) {
        boolean z;
        if (str != null) {
            m73 m73Var = this.j;
            if (this.k == hn9.CLIENT) {
                z = true;
            } else {
                z = false;
            }
            E(m73Var.h(str, z));
            return;
        }
        throw new IllegalArgumentException("Cannot send 'null' data to a WebSocketImpl.");
    }

    public void D(ByteBuffer byteBuffer) {
        boolean z;
        if (byteBuffer != null) {
            m73 m73Var = this.j;
            if (this.k == hn9.CLIENT) {
                z = true;
            } else {
                z = false;
            }
            E(m73Var.i(byteBuffer, z));
            return;
        }
        throw new IllegalArgumentException("Cannot send 'null' data to a WebSocketImpl.");
    }

    public void F(byte[] bArr) {
        D(ByteBuffer.wrap(bArr));
    }

    public void G(ga7 ga7Var, ByteBuffer byteBuffer, boolean z) {
        E(this.j.e(ga7Var, byteBuffer, z));
    }

    public void H(Collection<i74> collection) {
        E(collection);
    }

    public void I() throws NullPointerException {
        v68 onPreparePing = this.d.onPreparePing(this);
        if (onPreparePing != null) {
            sendFrame(onPreparePing);
            return;
        }
        throw new NullPointerException("onPreparePing(WebSocket) returned null. PingFrame to sent can't be null.");
    }

    public <T> void J(T t) {
        this.t = t;
    }

    public void K(j91 j91Var) throws InvalidHandshakeException {
        this.m = this.j.m(j91Var);
        this.q = j91Var.c();
        try {
            this.d.onWebsocketHandshakeSentAsClient(this, this.m);
            N(this.j.j(this.m));
        } catch (RuntimeException e) {
            this.a.error("Exception in startHandshake", (Throwable) e);
            this.d.onWebsocketError(this, e);
            throw new InvalidHandshakeException("rejected because of " + e);
        } catch (InvalidDataException unused) {
            throw new InvalidHandshakeException("Handshake data rejected by client.");
        }
    }

    public void L() {
        this.r = System.nanoTime();
    }

    public void a(int i) {
        c(i, "", false);
    }

    public void b(int i, String str) {
        c(i, str, false);
    }

    public synchronized void c(int i, String str, boolean z) {
        q79 q79Var = this.h;
        q79 q79Var2 = q79.CLOSING;
        if (q79Var != q79Var2 && this.h != q79.CLOSED) {
            if (this.h == q79.OPEN) {
                if (i == 1006) {
                    this.h = q79Var2;
                    n(i, str, false);
                    return;
                }
                if (this.j.l() != z91.NONE) {
                    if (!z) {
                        try {
                            try {
                                this.d.onWebsocketCloseInitiated(this, i, str);
                            } catch (RuntimeException e) {
                                this.d.onWebsocketError(this, e);
                            }
                        } catch (InvalidDataException e2) {
                            this.a.error("generated frame is invalid", (Throwable) e2);
                            this.d.onWebsocketError(this, e2);
                            n(1006, "generated frame is invalid", false);
                        }
                    }
                    if (A()) {
                        y91 y91Var = new y91();
                        y91Var.r(str);
                        y91Var.q(i);
                        y91Var.h();
                        sendFrame(y91Var);
                    }
                }
                n(i, str, z);
            } else if (i == -3) {
                n(-3, str, true);
            } else if (i == 1002) {
                n(i, str, z);
            } else {
                n(-1, str, false);
            }
            this.h = q79.CLOSING;
            this.l = null;
        }
    }

    public void d(InvalidDataException invalidDataException) {
        c(invalidDataException.a(), invalidDataException.getMessage(), false);
    }

    public void e(int i, String str) {
        f(i, str, false);
    }

    public synchronized void f(int i, String str, boolean z) {
        try {
            if (this.h == q79.CLOSED) {
                return;
            }
            if (this.h == q79.OPEN && i == 1006) {
                this.h = q79.CLOSING;
            }
            SelectionKey selectionKey = this.e;
            if (selectionKey != null) {
                selectionKey.cancel();
            }
            ByteChannel byteChannel = this.f;
            if (byteChannel != null) {
                try {
                    byteChannel.close();
                } catch (IOException e) {
                    if (e.getMessage() != null && e.getMessage().equals("Broken pipe")) {
                        this.a.trace("Caught IOException: Broken pipe during closeConnection()", (Throwable) e);
                    } else {
                        this.a.error("Exception during channel.close()", (Throwable) e);
                        this.d.onWebsocketError(this, e);
                    }
                }
            }
            try {
                this.d.onWebsocketClose(this, i, str, z);
            } catch (RuntimeException e2) {
                this.d.onWebsocketError(this, e2);
            }
            m73 m73Var = this.j;
            if (m73Var != null) {
                m73Var.s();
            }
            this.m = null;
            this.h = q79.CLOSED;
        } catch (Throwable th) {
            throw th;
        }
    }

    protected void g(int i, boolean z) {
        f(i, "", z);
    }

    public void j(ByteBuffer byteBuffer) {
        String str;
        Logger logger = this.a;
        Integer valueOf = Integer.valueOf(byteBuffer.remaining());
        if (byteBuffer.remaining() > 1000) {
            str = "too big to display";
        } else {
            str = new String(byteBuffer.array(), byteBuffer.position(), byteBuffer.remaining());
        }
        logger.trace("process({}): ({})", valueOf, str);
        if (this.h != q79.NOT_YET_CONNECTED) {
            if (this.h == q79.OPEN) {
                k(byteBuffer);
            }
        } else if (l(byteBuffer) && !y() && !x()) {
            if (byteBuffer.hasRemaining()) {
                k(byteBuffer);
            } else if (this.l.hasRemaining()) {
                k(this.l);
            }
        }
    }

    public void m() {
        if (this.h == q79.NOT_YET_CONNECTED) {
            g(-1, true);
        } else if (this.g) {
            f(this.o.intValue(), this.n, this.p.booleanValue());
        } else if (this.j.l() == z91.NONE) {
            g(1000, true);
        } else if (this.j.l() == z91.ONEWAY) {
            if (this.k == hn9.SERVER) {
                g(1006, true);
            } else {
                g(1000, true);
            }
        } else {
            g(1006, true);
        }
    }

    public synchronized void n(int i, String str, boolean z) {
        if (this.g) {
            return;
        }
        this.o = Integer.valueOf(i);
        this.n = str;
        this.p = Boolean.valueOf(z);
        this.g = true;
        this.d.onWriteDemand(this);
        try {
            this.d.onWebsocketClosing(this, i, str, z);
        } catch (RuntimeException e) {
            this.a.error("Exception in onWebsocketClosing", (Throwable) e);
            this.d.onWebsocketError(this, e);
        }
        m73 m73Var = this.j;
        if (m73Var != null) {
            m73Var.s();
        }
        this.m = null;
    }

    public <T> T p() {
        return (T) this.t;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long q() {
        return this.r;
    }

    public InetSocketAddress r() {
        return this.d.getLocalSocketAddress(this);
    }

    public qs4 s() {
        m73 m73Var = this.j;
        if (m73Var == null) {
            return null;
        }
        if (m73Var instanceof n73) {
            return ((n73) m73Var).N();
        }
        throw new IllegalArgumentException("This draft does not support Sec-WebSocket-Protocol");
    }

    @Override // defpackage.n3c
    public void sendFrame(i74 i74Var) {
        E(Collections.singletonList(i74Var));
    }

    public q79 t() {
        return this.h;
    }

    public String toString() {
        return super.toString();
    }

    public InetSocketAddress u() {
        return this.d.getRemoteSocketAddress(this);
    }

    public t3c v() {
        return this.d;
    }

    public boolean w() {
        return !this.b.isEmpty();
    }

    public boolean x() {
        if (this.h == q79.CLOSED) {
            return true;
        }
        return false;
    }

    public boolean y() {
        if (this.h == q79.CLOSING) {
            return true;
        }
        return false;
    }

    public boolean z() {
        return this.g;
    }
}
