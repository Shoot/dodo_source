package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.vo9;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import kotlin.Metadata;
import kotlin.Unit;
/* compiled from: RealCall.kt */
@Metadata(d1 = {"\u0000³\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001R\u0018\u00002\u00020\u00012\u00020\u0002:\u0002;@B\u001f\u0012\u0006\u0010?\u001a\u00020:\u0012\u0006\u0010D\u001a\u00020\u0014\u0012\u0006\u0010I\u001a\u00020\u0017¢\u0006\u0004\bq\u0010rJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J#\u0010\u0007\u001a\u00028\u0000\"\n\b\u0000\u0010\u0006*\u0004\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\n\u001a\u00028\u0000\"\n\b\u0000\u0010\u0006*\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\n\u0010\bJ\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002J\b\u0010\u0010\u001a\u00020\u000fH\u0002J\b\u0010\u0012\u001a\u00020\u0011H\u0016J\b\u0010\u0013\u001a\u00020\u0001H\u0016J\b\u0010\u0015\u001a\u00020\u0014H\u0016J\b\u0010\u0016\u001a\u00020\u0003H\u0016J\b\u0010\u0018\u001a\u00020\u0017H\u0016J\b\u0010\u001a\u001a\u00020\u0019H\u0016J\u0010\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u001bH\u0016J\u000f\u0010\u001e\u001a\u00020\u0019H\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u001e\u0010#\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010 \u001a\u00020\u00172\u0006\u0010\"\u001a\u00020!J\u0017\u0010%\u001a\u00020$2\u0006\u0010\"\u001a\u00020!H\u0000¢\u0006\u0004\b%\u0010&J\u000e\u0010)\u001a\u00020\u00032\u0006\u0010(\u001a\u00020'J;\u0010-\u001a\u00028\u0000\"\n\b\u0000\u0010\u0006*\u0004\u0018\u00010\u00052\u0006\u0010*\u001a\u00020$2\u0006\u0010+\u001a\u00020\u00172\u0006\u0010,\u001a\u00020\u00172\u0006\u0010\u0007\u001a\u00028\u0000H\u0000¢\u0006\u0004\b-\u0010.J\u001b\u0010/\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0004\b/\u0010\bJ\u0011\u00101\u001a\u0004\u0018\u000100H\u0000¢\u0006\u0004\b1\u00102J\u0006\u00103\u001a\u00020\u0003J\u0017\u00105\u001a\u00020\u00032\u0006\u00104\u001a\u00020\u0017H\u0000¢\u0006\u0004\b5\u00106J\u0006\u00107\u001a\u00020\u0017J\u000f\u00108\u001a\u00020\u000fH\u0000¢\u0006\u0004\b8\u00109R\u0017\u0010?\u001a\u00020:8\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u0017\u0010D\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u0017\u0010I\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR\u0014\u0010L\u001a\u00020J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010KR\u001a\u0010Q\u001a\u00020M8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010N\u001a\u0004\bO\u0010PR\u0014\u0010\u0012\u001a\u00020R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010SR\u0014\u0010V\u001a\u00020T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010UR\u0018\u0010Y\u001a\u0004\u0018\u00010W8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010XR\u0018\u0010\\\u001a\u0004\u0018\u00010Z8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010[R(\u0010(\u001a\u0004\u0018\u00010'2\b\u0010]\u001a\u0004\u0018\u00010'8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b5\u0010^\u001a\u0004\b_\u0010`R\u0016\u0010b\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010FR(\u0010f\u001a\u0004\u0018\u00010$2\b\u0010]\u001a\u0004\u0018\u00010$8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b=\u0010c\u001a\u0004\bd\u0010eR\u0016\u0010g\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010FR\u0016\u0010h\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010FR\u0016\u0010i\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010FR\u0016\u0010j\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010FR\u0018\u0010*\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010cR \u0010p\u001a\b\u0012\u0004\u0012\u00020l0k8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bm\u0010n\u001a\u0004\bm\u0010o¨\u0006s"}, d2 = {"Lt79;", "Lcm0;", "", "", "f", "Ljava/io/IOException;", "E", e.a, "(Ljava/io/IOException;)Ljava/io/IOException;", "cause", "C", "Lsq4;", RemoteMessageConst.Notification.URL, "Lx6;", Image.TYPE_HIGH, "", "D", "Lxgb;", "timeout", "g", "Lhi9;", "request", "cancel", "", "isCanceled", "Lik9;", "execute", "Lfm0;", "responseCallback", "I0", Image.TYPE_SMALL, "()Lik9;", "newRoutePlanner", "Lw79;", "chain", "i", "Lwl3;", "t", "(Lw79;)Lwl3;", "Lu79;", "connection", DateTokenConverter.CONVERTER_KEY, "exchange", "requestDone", "responseDone", "v", "(Lwl3;ZZLjava/io/IOException;)Ljava/io/IOException;", "w", "Ljava/net/Socket;", "z", "()Ljava/net/Socket;", "B", "closeExchange", "j", "(Z)V", "A", "y", "()Ljava/lang/String;", "Lb77;", "a", "Lb77;", "l", "()Lb77;", "client", "b", "Lhi9;", "q", "()Lhi9;", "originalRequest", com.huawei.hms.opendevice.c.a, "Z", "o", "()Z", "forWebSocket", "Lv79;", "Lv79;", "connectionPool", "Lxk3;", "Lxk3;", "n", "()Lxk3;", "eventListener", "t79$c", "Lt79$c;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "executed", "", "Ljava/lang/Object;", "callStackTrace", "Lyl3;", "Lyl3;", "exchangeFinder", "<set-?>", "Lu79;", Image.TYPE_MEDIUM, "()Lu79;", "k", "timeoutEarlyExit", "Lwl3;", "p", "()Lwl3;", "interceptorScopedExchange", "requestBodyOpen", "responseBodyOpen", "expectMoreExchanges", "canceled", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lvo9$b;", "r", "Ljava/util/concurrent/CopyOnWriteArrayList;", "()Ljava/util/concurrent/CopyOnWriteArrayList;", "plansToCancel", "<init>", "(Lb77;Lhi9;Z)V", "okhttp"}, k = 1, mv = {1, 9, 0})
/* renamed from: t79  reason: default package */
/* loaded from: classes3.dex */
public final class t79 implements cm0, Cloneable {
    private final b77 a;
    private final hi9 b;
    private final boolean c;
    private final v79 d;
    private final xk3 e;
    private final c f;
    private final AtomicBoolean g;
    private Object h;
    private yl3 i;
    private u79 j;
    private boolean k;
    private wl3 l;
    private boolean m;
    private boolean n;
    private boolean o;
    private volatile boolean p;
    private volatile wl3 q;
    private final CopyOnWriteArrayList<vo9.b> r;

    /* compiled from: RealCall.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000e¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u0005\u001a\u00020\u00042\n\u0010\u0003\u001a\u00060\u0000R\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u001b\u0010\u000b\u001a\u00020\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tH\u0000¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\r\u001a\u00020\u0004H\u0016R\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u000fR$\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00118\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u000b\u0010\u0013\u001a\u0004\b\n\u0010\u0014R\u0011\u0010\u0019\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u001c\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, d2 = {"Lt79$a;", "Ljava/lang/Runnable;", "Lt79;", "other", "", "g", "Ljava/util/concurrent/ExecutorService;", "executorService", "a", "Ljava/util/concurrent/RejectedExecutionException;", e.a, "b", "(Ljava/util/concurrent/RejectedExecutionException;)V", "run", "Lfm0;", "Lfm0;", "responseCallback", "Ljava/util/concurrent/atomic/AtomicInteger;", "<set-?>", "Ljava/util/concurrent/atomic/AtomicInteger;", "()Ljava/util/concurrent/atomic/AtomicInteger;", "callsPerHost", "", "f", "()Ljava/lang/String;", "host", DateTokenConverter.CONVERTER_KEY, "()Lt79;", "call", "<init>", "(Lt79;Lfm0;)V", "okhttp"}, k = 1, mv = {1, 9, 0})
    /* renamed from: t79$a */
    /* loaded from: classes3.dex */
    public final class a implements Runnable {
        private final fm0 a;
        private volatile AtomicInteger b;
        final /* synthetic */ t79 c;

        public a(t79 t79Var, fm0 fm0Var) {
            z65.h(fm0Var, "responseCallback");
            this.c = t79Var;
            this.a = fm0Var;
            this.b = new AtomicInteger(0);
        }

        public static /* synthetic */ void c(a aVar, RejectedExecutionException rejectedExecutionException, int i, Object obj) {
            if ((i & 1) != 0) {
                rejectedExecutionException = null;
            }
            aVar.b(rejectedExecutionException);
        }

        public final void a(ExecutorService executorService) {
            z65.h(executorService, "executorService");
            t33 n = this.c.l().n();
            if (cec.e && Thread.holdsLock(n)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + n);
            }
            try {
                try {
                    executorService.execute(this);
                } catch (RejectedExecutionException e) {
                    b(e);
                    this.c.l().n().f(this);
                }
            } catch (Throwable th) {
                this.c.l().n().f(this);
                throw th;
            }
        }

        public final void b(RejectedExecutionException rejectedExecutionException) {
            InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
            interruptedIOException.initCause(rejectedExecutionException);
            this.c.w(interruptedIOException);
            this.a.onFailure(this.c, interruptedIOException);
        }

        public final t79 d() {
            return this.c;
        }

        public final AtomicInteger e() {
            return this.b;
        }

        public final String f() {
            return this.c.q().l().k();
        }

        public final void g(a aVar) {
            z65.h(aVar, "other");
            this.b = aVar.b;
        }

        @Override // java.lang.Runnable
        public void run() {
            Throwable th;
            boolean z;
            IOException e;
            t33 n;
            t79 t79Var = this.c;
            Thread currentThread = Thread.currentThread();
            String name = currentThread.getName();
            currentThread.setName("OkHttp " + this.c.y());
            try {
                t79Var.f.v();
                try {
                    z = true;
                    try {
                        this.a.onResponse(t79Var, t79Var.s());
                        n = t79Var.l().n();
                    } catch (IOException e2) {
                        e = e2;
                        if (z) {
                            xb8.a.g().k("Callback failure for " + t79Var.D(), 4, e);
                        } else {
                            this.a.onFailure(t79Var, e);
                        }
                        n = t79Var.l().n();
                        n.f(this);
                    } catch (Throwable th2) {
                        th = th2;
                        t79Var.cancel();
                        if (!z) {
                            IOException iOException = new IOException("canceled due to " + th);
                            vl3.a(iOException, th);
                            this.a.onFailure(t79Var, iOException);
                        }
                        throw th;
                    }
                } catch (IOException e3) {
                    e = e3;
                    z = false;
                } catch (Throwable th3) {
                    th = th3;
                    z = false;
                }
                n.f(this);
            } finally {
                currentThread.setName(name);
            }
        }
    }

    /* compiled from: RealCall.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0004\u0010\u0006¨\u0006\u000b"}, d2 = {"Lt79$b;", "Ljava/lang/ref/WeakReference;", "Lt79;", "", "a", "Ljava/lang/Object;", "()Ljava/lang/Object;", "callStackTrace", "referent", "<init>", "(Lt79;Ljava/lang/Object;)V", "okhttp"}, k = 1, mv = {1, 9, 0})
    /* renamed from: t79$b */
    /* loaded from: classes3.dex */
    public static final class b extends WeakReference<t79> {
        private final Object a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(t79 t79Var, Object obj) {
            super(t79Var);
            z65.h(t79Var, "referent");
            this.a = obj;
        }

        public final Object a() {
            return this.a;
        }
    }

    /* compiled from: RealCall.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0014¨\u0006\u0004"}, d2 = {"t79$c", "Lky;", "", "B", "okhttp"}, k = 1, mv = {1, 9, 0})
    /* renamed from: t79$c */
    /* loaded from: classes3.dex */
    public static final class c extends ky {
        c() {
        }

        @Override // defpackage.ky
        protected void B() {
            t79.this.cancel();
        }
    }

    public t79(b77 b77Var, hi9 hi9Var, boolean z) {
        z65.h(b77Var, "client");
        z65.h(hi9Var, "originalRequest");
        this.a = b77Var;
        this.b = hi9Var;
        this.c = z;
        this.d = b77Var.k().b();
        this.e = b77Var.p().a(this);
        c cVar = new c();
        cVar.g(b77Var.g(), TimeUnit.MILLISECONDS);
        this.f = cVar;
        this.g = new AtomicBoolean();
        this.o = true;
        this.r = new CopyOnWriteArrayList<>();
    }

    private final <E extends IOException> E C(E e) {
        if (this.k) {
            return e;
        }
        if (!this.f.w()) {
            return e;
        }
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (e != null) {
            interruptedIOException.initCause(e);
        }
        return interruptedIOException;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String D() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        if (isCanceled()) {
            str = "canceled ";
        } else {
            str = "";
        }
        sb.append(str);
        if (this.c) {
            str2 = "web socket";
        } else {
            str2 = "call";
        }
        sb.append(str2);
        sb.append(" to ");
        sb.append(y());
        return sb.toString();
    }

    private final <E extends IOException> E e(E e) {
        Socket z;
        boolean z2 = cec.e;
        if (z2 && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        u79 u79Var = this.j;
        if (u79Var != null) {
            if (z2 && Thread.holdsLock(u79Var)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + u79Var);
            }
            synchronized (u79Var) {
                z = z();
            }
            if (this.j == null) {
                if (z != null) {
                    cec.h(z);
                }
                this.e.l(this, u79Var);
                u79Var.j().g(u79Var, this);
                if (z != null) {
                    u79Var.j().f(u79Var);
                }
            } else if (z != null) {
                throw new IllegalStateException("Check failed.".toString());
            }
        }
        E e2 = (E) C(e);
        if (e != null) {
            xk3 xk3Var = this.e;
            z65.e(e2);
            xk3Var.e(this, e2);
        } else {
            this.e.d(this);
        }
        return e2;
    }

    private final void f() {
        this.h = xb8.a.g().i("response.body().close()");
        this.e.f(this);
    }

    private final x6 h(sq4 sq4Var) {
        SSLSocketFactory sSLSocketFactory;
        HostnameVerifier hostnameVerifier;
        gu0 gu0Var;
        if (sq4Var.l()) {
            sSLSocketFactory = this.a.J();
            hostnameVerifier = this.a.v();
            gu0Var = this.a.i();
        } else {
            sSLSocketFactory = null;
            hostnameVerifier = null;
            gu0Var = null;
        }
        return new x6(sq4Var.k(), sq4Var.r(), this.a.o(), this.a.I(), sSLSocketFactory, hostnameVerifier, gu0Var, this.a.E(), this.a.D(), this.a.C(), this.a.l(), this.a.F());
    }

    public final boolean A() {
        u79 u79Var;
        wl3 wl3Var = this.q;
        if (wl3Var != null && wl3Var.k()) {
            yl3 yl3Var = this.i;
            z65.e(yl3Var);
            vo9 b2 = yl3Var.b();
            wl3 wl3Var2 = this.q;
            if (wl3Var2 != null) {
                u79Var = wl3Var2.h();
            } else {
                u79Var = null;
            }
            if (b2.a(u79Var)) {
                return true;
            }
        }
        return false;
    }

    public final void B() {
        if (!this.k) {
            this.k = true;
            this.f.w();
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    @Override // defpackage.cm0
    public void I0(fm0 fm0Var) {
        z65.h(fm0Var, "responseCallback");
        if (this.g.compareAndSet(false, true)) {
            f();
            this.a.n().a(new a(this, fm0Var));
            return;
        }
        throw new IllegalStateException("Already Executed".toString());
    }

    @Override // defpackage.cm0
    public void cancel() {
        if (this.p) {
            return;
        }
        this.p = true;
        wl3 wl3Var = this.q;
        if (wl3Var != null) {
            wl3Var.b();
        }
        Iterator<vo9.b> it = this.r.iterator();
        while (it.hasNext()) {
            it.next().cancel();
        }
        this.e.g(this);
    }

    public final void d(u79 u79Var) {
        z65.h(u79Var, "connection");
        if (cec.e && !Thread.holdsLock(u79Var)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + u79Var);
        } else if (this.j == null) {
            this.j = u79Var;
            u79Var.i().add(new b(this, this.h));
        } else {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    @Override // defpackage.cm0
    public ik9 execute() {
        if (this.g.compareAndSet(false, true)) {
            this.f.v();
            f();
            try {
                this.a.n().b(this);
                return s();
            } finally {
                this.a.n().g(this);
            }
        }
        throw new IllegalStateException("Already Executed".toString());
    }

    /* renamed from: g */
    public cm0 clone() {
        return new t79(this.a, this.b, this.c);
    }

    public final void i(hi9 hi9Var, boolean z, w79 w79Var) {
        yl3 fcaVar;
        z65.h(hi9Var, "request");
        z65.h(w79Var, "chain");
        if (this.l == null) {
            synchronized (this) {
                if (!this.n) {
                    if (!this.m) {
                        Unit unit = Unit.a;
                    } else {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                } else {
                    throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()".toString());
                }
            }
            if (z) {
                y79 y79Var = new y79(this.a, h(hi9Var.l()), this, w79Var, this.d.d());
                if (this.a.q()) {
                    fcaVar = new xo3(y79Var, this.a.u());
                } else {
                    fcaVar = new fca(y79Var);
                }
                this.i = fcaVar;
                return;
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    @Override // defpackage.cm0
    public boolean isCanceled() {
        return this.p;
    }

    public final void j(boolean z) {
        wl3 wl3Var;
        synchronized (this) {
            if (this.o) {
                Unit unit = Unit.a;
            } else {
                throw new IllegalStateException("released".toString());
            }
        }
        if (z && (wl3Var = this.q) != null) {
            wl3Var.d();
        }
        this.l = null;
    }

    public final b77 l() {
        return this.a;
    }

    public final u79 m() {
        return this.j;
    }

    public final xk3 n() {
        return this.e;
    }

    public final boolean o() {
        return this.c;
    }

    public final wl3 p() {
        return this.l;
    }

    public final hi9 q() {
        return this.b;
    }

    public final CopyOnWriteArrayList<vo9.b> r() {
        return this.r;
    }

    @Override // defpackage.cm0
    public hi9 request() {
        return this.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.ik9 s() throws java.io.IOException {
        /*
            r10 = this;
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            b77 r0 = r10.a
            java.util.List r0 = r0.w()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            defpackage.ic1.C(r2, r0)
            xl9 r0 = new xl9
            b77 r1 = r10.a
            r0.<init>(r1)
            r2.add(r0)
            vf0 r0 = new vf0
            b77 r1 = r10.a
            ow1 r1 = r1.m()
            r0.<init>(r1)
            r2.add(r0)
            pl0 r0 = new pl0
            b77 r1 = r10.a
            il0 r1 = r1.f()
            r0.<init>(r1)
            r2.add(r0)
            lq1 r0 = defpackage.lq1.a
            r2.add(r0)
            boolean r0 = r10.c
            if (r0 != 0) goto L4a
            b77 r0 = r10.a
            java.util.List r0 = r0.y()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            defpackage.ic1.C(r2, r0)
        L4a:
            dm0 r0 = new dm0
            boolean r1 = r10.c
            r0.<init>(r1)
            r2.add(r0)
            w79 r9 = new w79
            r3 = 0
            r4 = 0
            hi9 r5 = r10.b
            b77 r0 = r10.a
            int r6 = r0.j()
            b77 r0 = r10.a
            int r7 = r0.G()
            b77 r0 = r10.a
            int r8 = r0.L()
            r0 = r9
            r1 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = 0
            r1 = 0
            hi9 r2 = r10.b     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L90
            ik9 r2 = r9.b(r2)     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L90
            boolean r3 = r10.isCanceled()     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L90
            if (r3 != 0) goto L83
            r10.w(r0)
            return r2
        L83:
            defpackage.zdc.f(r2)     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L90
            java.io.IOException r2 = new java.io.IOException     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L90
            java.lang.String r3 = "Canceled"
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L90
            throw r2     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L90
        L8e:
            r2 = move-exception
            goto L9f
        L90:
            r1 = move-exception
            r2 = 1
            java.io.IOException r1 = r10.w(r1)     // Catch: java.lang.Throwable -> L9c
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.Throwable"
            defpackage.z65.f(r1, r3)     // Catch: java.lang.Throwable -> L9c
            throw r1     // Catch: java.lang.Throwable -> L9c
        L9c:
            r1 = move-exception
            r2 = r1
            r1 = 1
        L9f:
            if (r1 != 0) goto La4
            r10.w(r0)
        La4:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t79.s():ik9");
    }

    public final wl3 t(w79 w79Var) {
        z65.h(w79Var, "chain");
        synchronized (this) {
            if (this.o) {
                if (!this.n) {
                    if (!this.m) {
                        Unit unit = Unit.a;
                    } else {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                } else {
                    throw new IllegalStateException("Check failed.".toString());
                }
            } else {
                throw new IllegalStateException("released".toString());
            }
        }
        yl3 yl3Var = this.i;
        z65.e(yl3Var);
        wl3 wl3Var = new wl3(this, this.e, yl3Var, yl3Var.a().s(this.a, w79Var));
        this.l = wl3Var;
        this.q = wl3Var;
        synchronized (this) {
            this.m = true;
            this.n = true;
        }
        if (!this.p) {
            return wl3Var;
        }
        throw new IOException("Canceled");
    }

    @Override // defpackage.cm0
    public xgb timeout() {
        return this.f;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0021 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:8:0x0012, B:17:0x0021, B:19:0x0025, B:20:0x0027, B:22:0x002c, B:27:0x0035, B:29:0x0039, B:34:0x0042, B:14:0x001b), top: B:46:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0025 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:8:0x0012, B:17:0x0021, B:19:0x0025, B:20:0x0027, B:22:0x002c, B:27:0x0035, B:29:0x0039, B:34:0x0042, B:14:0x001b), top: B:46:0x0012 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <E extends java.io.IOException> E v(defpackage.wl3 r2, boolean r3, boolean r4, E r5) {
        /*
            r1 = this;
            java.lang.String r0 = "exchange"
            defpackage.z65.h(r2, r0)
            wl3 r0 = r1.q
            boolean r2 = defpackage.z65.c(r2, r0)
            if (r2 != 0) goto Le
            return r5
        Le:
            monitor-enter(r1)
            r2 = 0
            if (r3 == 0) goto L19
            boolean r0 = r1.m     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L1f
            goto L19
        L17:
            r2 = move-exception
            goto L59
        L19:
            if (r4 == 0) goto L41
            boolean r0 = r1.n     // Catch: java.lang.Throwable -> L17
            if (r0 == 0) goto L41
        L1f:
            if (r3 == 0) goto L23
            r1.m = r2     // Catch: java.lang.Throwable -> L17
        L23:
            if (r4 == 0) goto L27
            r1.n = r2     // Catch: java.lang.Throwable -> L17
        L27:
            boolean r3 = r1.m     // Catch: java.lang.Throwable -> L17
            r4 = 1
            if (r3 != 0) goto L32
            boolean r0 = r1.n     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L32
            r0 = 1
            goto L33
        L32:
            r0 = 0
        L33:
            if (r3 != 0) goto L3e
            boolean r3 = r1.n     // Catch: java.lang.Throwable -> L17
            if (r3 != 0) goto L3e
            boolean r3 = r1.o     // Catch: java.lang.Throwable -> L17
            if (r3 != 0) goto L3e
            r2 = 1
        L3e:
            r3 = r2
            r2 = r0
            goto L42
        L41:
            r3 = 0
        L42:
            kotlin.Unit r4 = kotlin.Unit.a     // Catch: java.lang.Throwable -> L17
            monitor-exit(r1)
            if (r2 == 0) goto L51
            r2 = 0
            r1.q = r2
            u79 r2 = r1.j
            if (r2 == 0) goto L51
            r2.o()
        L51:
            if (r3 == 0) goto L58
            java.io.IOException r2 = r1.e(r5)
            return r2
        L58:
            return r5
        L59:
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t79.v(wl3, boolean, boolean, java.io.IOException):java.io.IOException");
    }

    public final IOException w(IOException iOException) {
        boolean z;
        synchronized (this) {
            try {
                z = false;
                if (this.o) {
                    this.o = false;
                    if (!this.m && !this.n) {
                        z = true;
                    }
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            return e(iOException);
        }
        return iOException;
    }

    public final String y() {
        return this.b.l().u();
    }

    public final Socket z() {
        u79 u79Var = this.j;
        z65.e(u79Var);
        if (cec.e && !Thread.holdsLock(u79Var)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + u79Var);
        }
        List<Reference<t79>> i = u79Var.i();
        Iterator<Reference<t79>> it = i.iterator();
        int i2 = 0;
        while (true) {
            if (it.hasNext()) {
                if (z65.c(it.next().get(), this)) {
                    break;
                }
                i2++;
            } else {
                i2 = -1;
                break;
            }
        }
        if (i2 != -1) {
            i.remove(i2);
            this.j = null;
            if (i.isEmpty()) {
                u79Var.x(System.nanoTime());
                if (this.d.c(u79Var)) {
                    return u79Var.z();
                }
            }
            return null;
        }
        throw new IllegalStateException("Check failed.".toString());
    }
}
