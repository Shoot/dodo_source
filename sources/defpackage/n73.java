package defpackage;

import com.huawei.hms.adapter.internal.CommonCode;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import org.java_websocket.exceptions.IncompleteException;
import org.java_websocket.exceptions.InvalidDataException;
import org.java_websocket.exceptions.InvalidFrameException;
import org.java_websocket.exceptions.InvalidHandshakeException;
import org.java_websocket.exceptions.LimitExceededException;
import org.java_websocket.exceptions.NotSendableException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/* compiled from: Draft_6455.java */
/* renamed from: n73  reason: default package */
/* loaded from: classes3.dex */
public class n73 extends m73 {
    private final Logger c;
    private tr4 d;
    private tr4 e;
    private List<tr4> f;
    private tr4 g;
    private qs4 h;
    private List<qs4> i;
    private i74 j;
    private final List<ByteBuffer> k;
    private ByteBuffer l;
    private final SecureRandom m;
    private int n;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Draft_6455.java */
    /* renamed from: n73$a */
    /* loaded from: classes3.dex */
    public class a {
        private int a;
        private int b;

        a(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int c() {
            return this.a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int d() {
            return this.b;
        }
    }

    public n73() {
        this(Collections.emptyList());
    }

    private void A() throws LimitExceededException {
        long G = G();
        if (G <= this.n) {
            return;
        }
        B();
        this.c.trace("Payload limit reached. Allowed: {} Current: {}", Integer.valueOf(this.n), Long.valueOf(G));
        throw new LimitExceededException(this.n);
    }

    private void B() {
        synchronized (this.k) {
            this.k.clear();
        }
    }

    private pm4 C(String str) {
        for (qs4 qs4Var : this.i) {
            if (qs4Var.b(str)) {
                this.h = qs4Var;
                this.c.trace("acceptHandshake - Matching protocol found: {}", qs4Var);
                return pm4.MATCHED;
            }
        }
        return pm4.NOT_MATCHED;
    }

    private ByteBuffer D(i74 i74Var) {
        boolean z;
        int i;
        int i2;
        int i3;
        ByteBuffer f = i74Var.f();
        int i4 = 0;
        if (this.a == hn9.CLIENT) {
            z = true;
        } else {
            z = false;
        }
        int Q = Q(f);
        if (Q > 1) {
            i = Q + 1;
        } else {
            i = Q;
        }
        int i5 = i + 1;
        if (z) {
            i2 = 4;
        } else {
            i2 = 0;
        }
        ByteBuffer allocate = ByteBuffer.allocate(i5 + i2 + f.remaining());
        byte E = E(i74Var.c());
        if (i74Var.e()) {
            i3 = -128;
        } else {
            i3 = 0;
        }
        byte b = (byte) (E | ((byte) i3));
        if (i74Var.a()) {
            b = (byte) (b | O(1));
        }
        if (i74Var.b()) {
            b = (byte) (b | O(2));
        }
        if (i74Var.d()) {
            b = (byte) (O(3) | b);
        }
        allocate.put(b);
        byte[] Y = Y(f.remaining(), Q);
        if (Q == 1) {
            allocate.put((byte) (Y[0] | K(z)));
        } else if (Q == 2) {
            allocate.put((byte) (K(z) | 126));
            allocate.put(Y);
        } else if (Q == 8) {
            allocate.put((byte) (K(z) | Byte.MAX_VALUE));
            allocate.put(Y);
        } else {
            throw new IllegalStateException("Size representation not supported/specified");
        }
        if (z) {
            ByteBuffer allocate2 = ByteBuffer.allocate(4);
            allocate2.putInt(this.m.nextInt());
            allocate.put(allocate2.array());
            while (f.hasRemaining()) {
                allocate.put((byte) (f.get() ^ allocate2.get(i4 % 4)));
                i4++;
            }
        } else {
            allocate.put(f);
            f.flip();
        }
        allocate.flip();
        return allocate;
    }

    private byte E(ga7 ga7Var) {
        if (ga7Var == ga7.CONTINUOUS) {
            return (byte) 0;
        }
        if (ga7Var == ga7.TEXT) {
            return (byte) 1;
        }
        if (ga7Var == ga7.BINARY) {
            return (byte) 2;
        }
        if (ga7Var == ga7.CLOSING) {
            return (byte) 8;
        }
        if (ga7Var == ga7.PING) {
            return (byte) 9;
        }
        if (ga7Var == ga7.PONG) {
            return (byte) 10;
        }
        throw new IllegalArgumentException("Don't know how to handle " + ga7Var.toString());
    }

    private String F(String str) {
        try {
            return s60.g(MessageDigest.getInstance("SHA1").digest((str.trim() + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11").getBytes()));
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException(e);
        }
    }

    private long G() {
        long j;
        synchronized (this.k) {
            try {
                j = 0;
                for (ByteBuffer byteBuffer : this.k) {
                    j += byteBuffer.limit();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return j;
    }

    private byte K(boolean z) {
        if (z) {
            return Byte.MIN_VALUE;
        }
        return (byte) 0;
    }

    private ByteBuffer M() throws LimitExceededException {
        ByteBuffer allocate;
        synchronized (this.k) {
            try {
                long j = 0;
                for (ByteBuffer byteBuffer : this.k) {
                    j += byteBuffer.limit();
                }
                A();
                allocate = ByteBuffer.allocate((int) j);
                for (ByteBuffer byteBuffer2 : this.k) {
                    allocate.put(byteBuffer2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        allocate.flip();
        return allocate;
    }

    private byte O(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return (byte) 0;
                }
                return (byte) 16;
            }
            return (byte) 32;
        }
        return (byte) 64;
    }

    private String P() {
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss z", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return simpleDateFormat.format(calendar.getTime());
    }

    private int Q(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() <= 125) {
            return 1;
        }
        if (byteBuffer.remaining() <= 65535) {
            return 2;
        }
        return 8;
    }

    private void R(s3c s3cVar, RuntimeException runtimeException) {
        this.c.error("Runtime exception during onWebsocketMessage", (Throwable) runtimeException);
        s3cVar.v().onWebsocketError(s3cVar, runtimeException);
    }

    private void S(s3c s3cVar, i74 i74Var) {
        try {
            s3cVar.v().onWebsocketMessage(s3cVar, i74Var.f());
        } catch (RuntimeException e) {
            R(s3cVar, e);
        }
    }

    private void T(s3c s3cVar, i74 i74Var) {
        int i;
        String str;
        if (i74Var instanceof y91) {
            y91 y91Var = (y91) i74Var;
            i = y91Var.o();
            str = y91Var.p();
        } else {
            i = 1005;
            str = "";
        }
        if (s3cVar.t() == q79.CLOSING) {
            s3cVar.f(i, str, true);
        } else if (l() == z91.TWOWAY) {
            s3cVar.c(i, str, true);
        } else {
            s3cVar.n(i, str, false);
        }
    }

    private void U(s3c s3cVar, i74 i74Var, ga7 ga7Var) throws InvalidDataException {
        ga7 ga7Var2 = ga7.CONTINUOUS;
        if (ga7Var != ga7Var2) {
            W(i74Var);
        } else if (i74Var.e()) {
            V(s3cVar, i74Var);
        } else if (this.j == null) {
            this.c.error("Protocol error: Continuous frame sequence was not started.");
            throw new InvalidDataException((int) CommonCode.BusInterceptor.PRIVACY_CANCEL, "Continuous frame sequence was not started.");
        }
        if (ga7Var == ga7.TEXT && !qw0.b(i74Var.f())) {
            this.c.error("Protocol error: Payload is not UTF8");
            throw new InvalidDataException(1007);
        } else if (ga7Var == ga7Var2 && this.j != null) {
            z(i74Var.f());
        }
    }

    private void V(s3c s3cVar, i74 i74Var) throws InvalidDataException {
        if (this.j != null) {
            z(i74Var.f());
            A();
            if (this.j.c() == ga7.TEXT) {
                ((j74) this.j).j(M());
                ((j74) this.j).h();
                try {
                    s3cVar.v().onWebsocketMessage(s3cVar, qw0.e(this.j.f()));
                } catch (RuntimeException e) {
                    R(s3cVar, e);
                }
            } else if (this.j.c() == ga7.BINARY) {
                ((j74) this.j).j(M());
                ((j74) this.j).h();
                try {
                    s3cVar.v().onWebsocketMessage(s3cVar, this.j.f());
                } catch (RuntimeException e2) {
                    R(s3cVar, e2);
                }
            }
            this.j = null;
            B();
            return;
        }
        this.c.trace("Protocol error: Previous continuous frame sequence not completed.");
        throw new InvalidDataException((int) CommonCode.BusInterceptor.PRIVACY_CANCEL, "Continuous frame sequence was not started.");
    }

    private void W(i74 i74Var) throws InvalidDataException {
        if (this.j == null) {
            this.j = i74Var;
            z(i74Var.f());
            A();
            return;
        }
        this.c.trace("Protocol error: Previous continuous frame sequence not completed.");
        throw new InvalidDataException((int) CommonCode.BusInterceptor.PRIVACY_CANCEL, "Previous continuous frame sequence not completed.");
    }

    private void X(s3c s3cVar, i74 i74Var) throws InvalidDataException {
        try {
            s3cVar.v().onWebsocketMessage(s3cVar, qw0.e(i74Var.f()));
        } catch (RuntimeException e) {
            R(s3cVar, e);
        }
    }

    private byte[] Y(long j, int i) {
        byte[] bArr = new byte[i];
        int i2 = (i * 8) - 8;
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3] = (byte) (j >>> (i2 - (i3 * 8)));
        }
        return bArr;
    }

    private ga7 Z(byte b) throws InvalidFrameException {
        if (b != 0) {
            if (b != 1) {
                if (b != 2) {
                    switch (b) {
                        case 8:
                            return ga7.CLOSING;
                        case 9:
                            return ga7.PING;
                        case 10:
                            return ga7.PONG;
                        default:
                            throw new InvalidFrameException("Unknown opcode " + ((int) b));
                    }
                }
                return ga7.BINARY;
            }
            return ga7.TEXT;
        }
        return ga7.CONTINUOUS;
    }

    private i74 a0(ByteBuffer byteBuffer) throws IncompleteException, InvalidDataException {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int i;
        String str;
        if (byteBuffer != null) {
            int remaining = byteBuffer.remaining();
            int i2 = 2;
            c0(remaining, 2);
            byte b = byteBuffer.get();
            if ((b >> 8) != 0) {
                z = true;
            } else {
                z = false;
            }
            if ((b & 64) != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if ((b & 32) != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if ((b & 16) != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            byte b2 = byteBuffer.get();
            if ((b2 & Byte.MIN_VALUE) != 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            int i3 = (byte) (b2 & Byte.MAX_VALUE);
            ga7 Z = Z((byte) (b & 15));
            if (i3 < 0 || i3 > 125) {
                a d0 = d0(byteBuffer, Z, i3, remaining, 2);
                i3 = d0.c();
                i2 = d0.d();
            }
            b0(i3);
            if (z5) {
                i = 4;
            } else {
                i = 0;
            }
            c0(remaining, i2 + i + i3);
            ByteBuffer allocate = ByteBuffer.allocate(d(i3));
            if (z5) {
                byte[] bArr = new byte[4];
                byteBuffer.get(bArr);
                for (int i4 = 0; i4 < i3; i4++) {
                    allocate.put((byte) (byteBuffer.get() ^ bArr[i4 % 4]));
                }
            } else {
                allocate.put(byteBuffer.array(), byteBuffer.position(), allocate.limit());
                byteBuffer.position(byteBuffer.position() + allocate.limit());
            }
            j74 g = j74.g(Z);
            g.i(z);
            g.k(z2);
            g.l(z3);
            g.m(z4);
            allocate.flip();
            g.j(allocate);
            if (g.c() != ga7.CONTINUOUS) {
                if (!g.a() && !g.b() && !g.d()) {
                    this.g = this.e;
                } else {
                    this.g = H();
                }
            }
            if (this.g == null) {
                this.g = this.e;
            }
            this.g.d(g);
            this.g.g(g);
            if (this.c.isTraceEnabled()) {
                Logger logger = this.c;
                Integer valueOf = Integer.valueOf(g.f().remaining());
                if (g.f().remaining() > 1000) {
                    str = "too big to display";
                } else {
                    str = new String(g.f().array());
                }
                logger.trace("afterDecoding({}): {}", valueOf, str);
            }
            g.h();
            return g;
        }
        throw new IllegalArgumentException();
    }

    private void b0(long j) throws LimitExceededException {
        if (j <= 2147483647L) {
            int i = this.n;
            if (j <= i) {
                if (j >= 0) {
                    return;
                }
                this.c.trace("Limit underflow: Payloadsize is to little...");
                throw new LimitExceededException("Payloadsize is to little...");
            }
            this.c.trace("Payload limit reached. Allowed: {} Current: {}", Integer.valueOf(i), Long.valueOf(j));
            throw new LimitExceededException("Payload limit reached.", this.n);
        }
        this.c.trace("Limit exedeed: Payloadsize is to big...");
        throw new LimitExceededException("Payloadsize is to big...");
    }

    private void c0(int i, int i2) throws IncompleteException {
        if (i >= i2) {
            return;
        }
        this.c.trace("Incomplete frame: maxpacketsize < realpacketsize");
        throw new IncompleteException(i2);
    }

    private a d0(ByteBuffer byteBuffer, ga7 ga7Var, int i, int i2, int i3) throws InvalidFrameException, IncompleteException, LimitExceededException {
        int i4;
        int i5;
        if (ga7Var != ga7.PING && ga7Var != ga7.PONG && ga7Var != ga7.CLOSING) {
            if (i == 126) {
                i4 = i3 + 2;
                c0(i2, i4);
                i5 = new BigInteger(new byte[]{0, byteBuffer.get(), byteBuffer.get()}).intValue();
            } else {
                i4 = i3 + 8;
                c0(i2, i4);
                byte[] bArr = new byte[8];
                for (int i6 = 0; i6 < 8; i6++) {
                    bArr[i6] = byteBuffer.get();
                }
                long longValue = new BigInteger(bArr).longValue();
                b0(longValue);
                i5 = (int) longValue;
            }
            return new a(i5, i4);
        }
        this.c.trace("Invalid frame: more than 125 octets");
        throw new InvalidFrameException("more than 125 octets");
    }

    private void z(ByteBuffer byteBuffer) {
        synchronized (this.k) {
            this.k.add(byteBuffer);
        }
    }

    public tr4 H() {
        return this.d;
    }

    public List<tr4> I() {
        return this.f;
    }

    public List<qs4> J() {
        return this.i;
    }

    public int L() {
        return this.n;
    }

    public qs4 N() {
        return this.h;
    }

    @Override // defpackage.m73
    public pm4 a(i91 i91Var, kda kdaVar) throws InvalidHandshakeException {
        if (!c(kdaVar)) {
            this.c.trace("acceptHandshakeAsClient - Missing/wrong upgrade or connection in handshake.");
            return pm4.NOT_MATCHED;
        } else if (i91Var.b("Sec-WebSocket-Key") && kdaVar.b("Sec-WebSocket-Accept")) {
            if (!F(i91Var.i("Sec-WebSocket-Key")).equals(kdaVar.i("Sec-WebSocket-Accept"))) {
                this.c.trace("acceptHandshakeAsClient - Wrong key for Sec-WebSocket-Key.");
                return pm4.NOT_MATCHED;
            }
            pm4 pm4Var = pm4.NOT_MATCHED;
            String i = kdaVar.i("Sec-WebSocket-Extensions");
            Iterator<tr4> it = this.f.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                tr4 next = it.next();
                if (next.e(i)) {
                    this.d = next;
                    pm4Var = pm4.MATCHED;
                    this.c.trace("acceptHandshakeAsClient - Matching extension found: {}", next);
                    break;
                }
            }
            pm4 C = C(kdaVar.i("Sec-WebSocket-Protocol"));
            pm4 pm4Var2 = pm4.MATCHED;
            if (C == pm4Var2 && pm4Var == pm4Var2) {
                return pm4Var2;
            }
            this.c.trace("acceptHandshakeAsClient - No matching extension or protocol found.");
            return pm4.NOT_MATCHED;
        } else {
            this.c.trace("acceptHandshakeAsClient - Missing Sec-WebSocket-Key or Sec-WebSocket-Accept");
            return pm4.NOT_MATCHED;
        }
    }

    @Override // defpackage.m73
    public pm4 b(i91 i91Var) throws InvalidHandshakeException {
        if (r(i91Var) != 13) {
            this.c.trace("acceptHandshakeAsServer - Wrong websocket version.");
            return pm4.NOT_MATCHED;
        }
        pm4 pm4Var = pm4.NOT_MATCHED;
        String i = i91Var.i("Sec-WebSocket-Extensions");
        Iterator<tr4> it = this.f.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            tr4 next = it.next();
            if (next.b(i)) {
                this.d = next;
                pm4Var = pm4.MATCHED;
                this.c.trace("acceptHandshakeAsServer - Matching extension found: {}", next);
                break;
            }
        }
        pm4 C = C(i91Var.i("Sec-WebSocket-Protocol"));
        pm4 pm4Var2 = pm4.MATCHED;
        if (C == pm4Var2 && pm4Var == pm4Var2) {
            return pm4Var2;
        }
        this.c.trace("acceptHandshakeAsServer - No matching extension or protocol found.");
        return pm4.NOT_MATCHED;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        n73 n73Var = (n73) obj;
        if (this.n != n73Var.L()) {
            return false;
        }
        tr4 tr4Var = this.d;
        if (tr4Var == null ? n73Var.H() != null : !tr4Var.equals(n73Var.H())) {
            return false;
        }
        qs4 qs4Var = this.h;
        qs4 N = n73Var.N();
        if (qs4Var != null) {
            return qs4Var.equals(N);
        }
        if (N == null) {
            return true;
        }
        return false;
    }

    @Override // defpackage.m73
    public m73 f() {
        ArrayList arrayList = new ArrayList();
        for (tr4 tr4Var : I()) {
            arrayList.add(tr4Var.a());
        }
        ArrayList arrayList2 = new ArrayList();
        for (qs4 qs4Var : J()) {
            arrayList2.add(qs4Var.a());
        }
        return new n73(arrayList, arrayList2, this.n);
    }

    @Override // defpackage.m73
    public ByteBuffer g(i74 i74Var) {
        String str;
        H().f(i74Var);
        if (this.c.isTraceEnabled()) {
            Logger logger = this.c;
            Integer valueOf = Integer.valueOf(i74Var.f().remaining());
            if (i74Var.f().remaining() > 1000) {
                str = "too big to display";
            } else {
                str = new String(i74Var.f().array());
            }
            logger.trace("afterEnconding({}): {}", valueOf, str);
        }
        return D(i74Var);
    }

    @Override // defpackage.m73
    public List<i74> h(String str, boolean z) {
        fbb fbbVar = new fbb();
        fbbVar.j(ByteBuffer.wrap(qw0.f(str)));
        fbbVar.n(z);
        try {
            fbbVar.h();
            return Collections.singletonList(fbbVar);
        } catch (InvalidDataException e) {
            throw new NotSendableException(e);
        }
    }

    public int hashCode() {
        int i;
        tr4 tr4Var = this.d;
        int i2 = 0;
        if (tr4Var != null) {
            i = tr4Var.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        qs4 qs4Var = this.h;
        if (qs4Var != null) {
            i2 = qs4Var.hashCode();
        }
        int i4 = this.n;
        return ((i3 + i2) * 31) + (i4 ^ (i4 >>> 32));
    }

    @Override // defpackage.m73
    public List<i74> i(ByteBuffer byteBuffer, boolean z) {
        ib0 ib0Var = new ib0();
        ib0Var.j(byteBuffer);
        ib0Var.n(z);
        try {
            ib0Var.h();
            return Collections.singletonList(ib0Var);
        } catch (InvalidDataException e) {
            throw new NotSendableException(e);
        }
    }

    @Override // defpackage.m73
    public z91 l() {
        return z91.TWOWAY;
    }

    @Override // defpackage.m73
    public j91 m(j91 j91Var) {
        j91Var.put("Upgrade", "websocket");
        j91Var.put("Connection", "Upgrade");
        byte[] bArr = new byte[16];
        this.m.nextBytes(bArr);
        j91Var.put("Sec-WebSocket-Key", s60.g(bArr));
        j91Var.put("Sec-WebSocket-Version", "13");
        StringBuilder sb = new StringBuilder();
        for (tr4 tr4Var : this.f) {
            if (tr4Var.c() != null && tr4Var.c().length() != 0) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(tr4Var.c());
            }
        }
        if (sb.length() != 0) {
            j91Var.put("Sec-WebSocket-Extensions", sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        for (qs4 qs4Var : this.i) {
            if (qs4Var.c().length() != 0) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(qs4Var.c());
            }
        }
        if (sb2.length() != 0) {
            j91Var.put("Sec-WebSocket-Protocol", sb2.toString());
        }
        return j91Var;
    }

    @Override // defpackage.m73
    public lm4 n(i91 i91Var, lda ldaVar) throws InvalidHandshakeException {
        ldaVar.put("Upgrade", "websocket");
        ldaVar.put("Connection", i91Var.i("Connection"));
        String i = i91Var.i("Sec-WebSocket-Key");
        if (i != null && !"".equals(i)) {
            ldaVar.put("Sec-WebSocket-Accept", F(i));
            if (H().h().length() != 0) {
                ldaVar.put("Sec-WebSocket-Extensions", H().h());
            }
            if (N() != null && N().c().length() != 0) {
                ldaVar.put("Sec-WebSocket-Protocol", N().c());
            }
            ldaVar.h("Web Socket Protocol Handshake");
            ldaVar.put("Server", "TooTallNate Java-WebSocket");
            ldaVar.put("Date", P());
            return ldaVar;
        }
        throw new InvalidHandshakeException("missing Sec-WebSocket-Key");
    }

    @Override // defpackage.m73
    public void o(s3c s3cVar, i74 i74Var) throws InvalidDataException {
        ga7 c = i74Var.c();
        if (c == ga7.CLOSING) {
            T(s3cVar, i74Var);
        } else if (c == ga7.PING) {
            s3cVar.v().onWebsocketPing(s3cVar, i74Var);
        } else if (c == ga7.PONG) {
            s3cVar.L();
            s3cVar.v().onWebsocketPong(s3cVar, i74Var);
        } else if (i74Var.e() && c != ga7.CONTINUOUS) {
            if (this.j == null) {
                if (c == ga7.TEXT) {
                    X(s3cVar, i74Var);
                    return;
                } else if (c == ga7.BINARY) {
                    S(s3cVar, i74Var);
                    return;
                } else {
                    this.c.error("non control or continious frame expected");
                    throw new InvalidDataException((int) CommonCode.BusInterceptor.PRIVACY_CANCEL, "non control or continious frame expected");
                }
            }
            this.c.error("Protocol error: Continuous frame sequence not completed.");
            throw new InvalidDataException((int) CommonCode.BusInterceptor.PRIVACY_CANCEL, "Continuous frame sequence not completed.");
        } else {
            U(s3cVar, i74Var, c);
        }
    }

    @Override // defpackage.m73
    public void s() {
        this.l = null;
        tr4 tr4Var = this.d;
        if (tr4Var != null) {
            tr4Var.reset();
        }
        this.d = new sp2();
        this.h = null;
    }

    @Override // defpackage.m73
    public String toString() {
        String m73Var = super.toString();
        if (H() != null) {
            m73Var = m73Var + " extension: " + H().toString();
        }
        if (N() != null) {
            m73Var = m73Var + " protocol: " + N().toString();
        }
        return m73Var + " max frame size: " + this.n;
    }

    @Override // defpackage.m73
    public List<i74> u(ByteBuffer byteBuffer) throws InvalidDataException {
        LinkedList linkedList;
        while (true) {
            linkedList = new LinkedList();
            if (this.l == null) {
                break;
            }
            try {
                byteBuffer.mark();
                int remaining = byteBuffer.remaining();
                int remaining2 = this.l.remaining();
                if (remaining2 > remaining) {
                    this.l.put(byteBuffer.array(), byteBuffer.position(), remaining);
                    byteBuffer.position(byteBuffer.position() + remaining);
                    return Collections.emptyList();
                }
                this.l.put(byteBuffer.array(), byteBuffer.position(), remaining2);
                byteBuffer.position(byteBuffer.position() + remaining2);
                linkedList.add(a0((ByteBuffer) this.l.duplicate().position(0)));
                this.l = null;
            } catch (IncompleteException e) {
                ByteBuffer allocate = ByteBuffer.allocate(d(e.a()));
                this.l.rewind();
                allocate.put(this.l);
                this.l = allocate;
            }
        }
        while (byteBuffer.hasRemaining()) {
            byteBuffer.mark();
            try {
                linkedList.add(a0(byteBuffer));
            } catch (IncompleteException e2) {
                byteBuffer.reset();
                ByteBuffer allocate2 = ByteBuffer.allocate(d(e2.a()));
                this.l = allocate2;
                allocate2.put(byteBuffer);
            }
        }
        return linkedList;
    }

    public n73(List<tr4> list) {
        this(list, Collections.singletonList(new wr8("")));
    }

    public n73(List<tr4> list, List<qs4> list2) {
        this(list, list2, Integer.MAX_VALUE);
    }

    public n73(List<tr4> list, List<qs4> list2, int i) {
        this.c = LoggerFactory.getLogger(n73.class);
        this.d = new sp2();
        this.e = new sp2();
        this.m = new SecureRandom();
        if (list != null && list2 != null && i >= 1) {
            this.f = new ArrayList(list.size());
            this.i = new ArrayList(list2.size());
            this.k = new ArrayList();
            boolean z = false;
            for (tr4 tr4Var : list) {
                if (tr4Var.getClass().equals(sp2.class)) {
                    z = true;
                }
            }
            this.f.addAll(list);
            if (!z) {
                List<tr4> list3 = this.f;
                list3.add(list3.size(), this.d);
            }
            this.i.addAll(list2);
            this.n = i;
            this.g = null;
            return;
        }
        throw new IllegalArgumentException();
    }
}
