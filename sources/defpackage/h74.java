package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import defpackage.d9c;
import defpackage.m79;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.LockSupport;
/* compiled from: FrameSeqDecoder.java */
/* renamed from: h74  reason: default package */
/* loaded from: classes2.dex */
public abstract class h74<R extends m79, W extends d9c> {
    private static final String t = "h74";
    private static final Rect u = new Rect();
    private final int a;
    private final xr5 b;
    private final Handler c;
    private int f;
    private final Set<j> h;
    private final AtomicBoolean i;
    private final Runnable j;
    protected int k;
    private final Set<Bitmap> l;
    private final Object m;
    protected Map<Bitmap, Canvas> n;
    protected ByteBuffer o;
    protected volatile Rect p;
    private R q;
    private boolean r;
    private volatile k s;
    protected List<z64<R, W>> d = new ArrayList();
    protected int e = -1;
    private Integer g = null;

    /* compiled from: FrameSeqDecoder.java */
    /* renamed from: h74$a */
    /* loaded from: classes2.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (h74.this.i.get()) {
                return;
            }
            if (h74.this.p()) {
                long currentTimeMillis = System.currentTimeMillis();
                h74.this.c.postDelayed(this, Math.max(0L, h74.this.P() - (System.currentTimeMillis() - currentTimeMillis)));
                for (j jVar : h74.this.h) {
                    jVar.a(h74.this.o);
                }
                return;
            }
            h74.this.Q();
        }
    }

    /* compiled from: FrameSeqDecoder.java */
    /* renamed from: h74$b */
    /* loaded from: classes2.dex */
    class b implements Runnable {
        final /* synthetic */ j a;

        b(j jVar) {
            this.a = jVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            h74.this.h.add(this.a);
        }
    }

    /* compiled from: FrameSeqDecoder.java */
    /* renamed from: h74$c */
    /* loaded from: classes2.dex */
    class c implements Runnable {
        final /* synthetic */ j a;

        c(j jVar) {
            this.a = jVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            h74.this.h.remove(this.a);
        }
    }

    /* compiled from: FrameSeqDecoder.java */
    /* renamed from: h74$d */
    /* loaded from: classes2.dex */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (h74.this.h.size() == 0) {
                h74.this.Q();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FrameSeqDecoder.java */
    /* renamed from: h74$e */
    /* loaded from: classes2.dex */
    public class e implements Runnable {
        final /* synthetic */ Thread a;

        e(Thread thread) {
            this.a = thread;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            try {
                try {
                    if (h74.this.p == null) {
                        if (h74.this.q == null) {
                            h74 h74Var = h74.this;
                            h74Var.q = h74Var.z(h74Var.b.a());
                        } else {
                            h74.this.q.reset();
                        }
                        h74 h74Var2 = h74.this;
                        h74Var2.C(h74Var2.H(h74Var2.q));
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    h74.this.p = h74.u;
                }
                LockSupport.unpark(this.a);
            } catch (Throwable th) {
                LockSupport.unpark(this.a);
                throw th;
            }
        }
    }

    /* compiled from: FrameSeqDecoder.java */
    /* renamed from: h74$f */
    /* loaded from: classes2.dex */
    class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            h74.this.D();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FrameSeqDecoder.java */
    /* renamed from: h74$g */
    /* loaded from: classes2.dex */
    public class g implements Runnable {
        g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            h74.this.E();
        }
    }

    /* compiled from: FrameSeqDecoder.java */
    /* renamed from: h74$h */
    /* loaded from: classes2.dex */
    class h implements Runnable {
        h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            h74.this.f = 0;
            h74 h74Var = h74.this;
            h74Var.e = -1;
            h74Var.r = false;
        }
    }

    /* compiled from: FrameSeqDecoder.java */
    /* renamed from: h74$i */
    /* loaded from: classes2.dex */
    class i implements Runnable {
        final /* synthetic */ int a;
        final /* synthetic */ boolean b;

        i(int i, boolean z) {
            this.a = i;
            this.b = z;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            h74.this.E();
            try {
                h74 h74Var = h74.this;
                h74Var.k = this.a;
                h74Var.C(h74Var.H(h74Var.z(h74Var.b.a())));
                if (this.b) {
                    h74.this.D();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /* compiled from: FrameSeqDecoder.java */
    /* renamed from: h74$j */
    /* loaded from: classes2.dex */
    public interface j {
        void a(ByteBuffer byteBuffer);

        void b();

        void onStart();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: FrameSeqDecoder.java */
    /* renamed from: h74$k */
    /* loaded from: classes2.dex */
    public enum k {
        IDLE,
        RUNNING,
        INITIALIZING,
        FINISHING
    }

    public h74(xr5 xr5Var, j jVar) {
        HashSet hashSet = new HashSet();
        this.h = hashSet;
        this.i = new AtomicBoolean(true);
        this.j = new a();
        this.k = 1;
        this.l = new HashSet();
        this.m = new Object();
        this.n = new WeakHashMap();
        B();
        this.q = null;
        this.r = false;
        this.s = k.IDLE;
        this.b = xr5Var;
        if (jVar != null) {
            hashSet.add(jVar);
        }
        int a2 = c74.b().a();
        this.a = a2;
        this.c = new Handler(c74.b().c(a2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C(Rect rect) {
        this.p = rect;
        this.o = ByteBuffer.allocate((((rect.width() * rect.height()) / (A() * A())) + 1) * 4);
        B();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D() {
        this.i.compareAndSet(true, false);
        long currentTimeMillis = System.currentTimeMillis();
        try {
            if (v() == 0) {
                R r = this.q;
                if (r == null) {
                    this.q = z(this.b.a());
                } else {
                    r.reset();
                }
                C(H(this.q));
            }
            String str = t;
            Log.i(str, q() + " Set state to RUNNING,cost " + (System.currentTimeMillis() - currentTimeMillis));
            this.s = k.RUNNING;
            if (y() != 0 && this.r) {
                Log.i(str, q() + " No need to started");
                return;
            }
            this.e = -1;
            this.j.run();
            for (j jVar : this.h) {
                jVar.onStart();
            }
        } catch (Throwable th) {
            String str2 = t;
            Log.i(str2, q() + " Set state to RUNNING,cost " + (System.currentTimeMillis() - currentTimeMillis));
            this.s = k.RUNNING;
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E() {
        this.c.removeCallbacks(this.j);
        this.d.clear();
        synchronized (this.m) {
            try {
                for (Bitmap bitmap : this.l) {
                    if (bitmap != null && !bitmap.isRecycled()) {
                        bitmap.recycle();
                    }
                }
                this.l.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (this.o != null) {
            this.o = null;
        }
        this.n.clear();
        try {
            R r = this.q;
            if (r != null) {
                r.close();
                this.q = null;
            }
        } catch (IOException e2) {
            e2.printStackTrace();
        }
        J();
        this.s = k.IDLE;
        for (j jVar : this.h) {
            jVar.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long P() {
        int i2 = this.e + 1;
        this.e = i2;
        if (i2 >= v()) {
            this.e = 0;
            this.f++;
        }
        z64<R, W> t2 = t(this.e);
        if (t2 == null) {
            return 0L;
        }
        L(t2);
        return t2.b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean p() {
        if (!F() || v() == 0) {
            return false;
        }
        if (y() <= 0 || this.f < y() - 1) {
            return true;
        }
        if (this.f == y() - 1 && this.e < v() - 1) {
            return true;
        }
        this.r = true;
        return false;
    }

    private String q() {
        return "";
    }

    private int y() {
        Integer num = this.g;
        if (num != null) {
            return num.intValue();
        }
        return w();
    }

    public int A() {
        return this.k;
    }

    protected abstract W B();

    public boolean F() {
        if (this.s != k.RUNNING && this.s != k.INITIALIZING) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Bitmap G(int i2, int i3) {
        synchronized (this.m) {
            try {
                Iterator<Bitmap> it = this.l.iterator();
                Bitmap bitmap = null;
                while (it.hasNext()) {
                    int i4 = i2 * i3 * 4;
                    Bitmap next = it.next();
                    if (next != null && next.getAllocationByteCount() >= i4) {
                        it.remove();
                        if (next.getWidth() == i2) {
                            if (next.getHeight() != i3) {
                            }
                            next.eraseColor(0);
                            return next;
                        }
                        if (i2 > 0 && i3 > 0) {
                            next.reconfigure(i2, i3, Bitmap.Config.ARGB_8888);
                        }
                        next.eraseColor(0);
                        return next;
                    }
                    bitmap = next;
                }
                if (i2 <= 0 || i3 <= 0) {
                    return null;
                }
                try {
                    try {
                        bitmap = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                } catch (OutOfMemoryError e3) {
                    e3.printStackTrace();
                }
                return bitmap;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    protected abstract Rect H(R r) throws IOException;

    /* JADX INFO: Access modifiers changed from: protected */
    public void I(Bitmap bitmap) {
        synchronized (this.m) {
            if (bitmap != null) {
                try {
                    this.l.add(bitmap);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    protected abstract void J();

    public void K(j jVar) {
        this.c.post(new c(jVar));
    }

    protected abstract void L(z64<R, W> z64Var);

    public void M() {
        this.c.post(new h());
    }

    public boolean N(int i2, int i3) {
        int s = s(i2, i3);
        if (s != A()) {
            boolean F = F();
            this.c.removeCallbacks(this.j);
            this.c.post(new i(s, F));
            return true;
        }
        return false;
    }

    public void O() {
        if (this.p == u) {
            return;
        }
        if (this.s != k.RUNNING) {
            k kVar = this.s;
            k kVar2 = k.INITIALIZING;
            if (kVar != kVar2) {
                if (this.s == k.FINISHING) {
                    String str = t;
                    Log.e(str, q() + " Processing,wait for finish at " + this.s);
                }
                this.s = kVar2;
                if (Looper.myLooper() == this.c.getLooper()) {
                    D();
                    return;
                } else {
                    this.c.post(new f());
                    return;
                }
            }
        }
        String str2 = t;
        Log.i(str2, q() + " Already started");
    }

    public void Q() {
        if (this.p == u) {
            return;
        }
        k kVar = this.s;
        k kVar2 = k.FINISHING;
        if (kVar != kVar2 && this.s != k.IDLE) {
            if (this.s == k.INITIALIZING) {
                String str = t;
                Log.e(str, q() + "Processing,wait for finish at " + this.s);
            }
            this.s = kVar2;
            if (Looper.myLooper() == this.c.getLooper()) {
                E();
                return;
            } else {
                this.c.post(new g());
                return;
            }
        }
        String str2 = t;
        Log.i(str2, q() + "No need to stop");
    }

    public void R() {
        this.c.post(new d());
    }

    public void o(j jVar) {
        this.c.post(new b(jVar));
    }

    public Rect r() {
        if (this.p == null) {
            if (this.s == k.FINISHING) {
                Log.e(t, "In finishing,do not interrupt");
            }
            Thread currentThread = Thread.currentThread();
            this.c.post(new e(currentThread));
            LockSupport.park(currentThread);
        }
        if (this.p == null) {
            return u;
        }
        return this.p;
    }

    protected int s(int i2, int i3) {
        int i4 = 1;
        if (i2 != 0 && i3 != 0) {
            int min = Math.min(r().width() / i2, r().height() / i3);
            while (true) {
                int i5 = i4 * 2;
                if (i5 > min) {
                    break;
                }
                i4 = i5;
            }
        }
        return i4;
    }

    public z64<R, W> t(int i2) {
        if (i2 >= 0 && i2 < this.d.size()) {
            return this.d.get(i2);
        }
        return null;
    }

    public Bitmap u(int i2) throws IOException {
        if (this.s != k.IDLE) {
            String str = t;
            Log.e(str, q() + ",stop first");
            return null;
        }
        this.s = k.RUNNING;
        int i3 = 0;
        this.i.compareAndSet(true, false);
        if (this.d.size() == 0) {
            R r = this.q;
            if (r == null) {
                this.q = z(this.b.a());
            } else {
                r.reset();
            }
            C(H(this.q));
        }
        if (i2 < 0) {
            i2 += this.d.size();
        }
        if (i2 >= 0) {
            i3 = i2;
        }
        this.e = -1;
        while (this.e < i3 && p()) {
            P();
        }
        this.o.rewind();
        Bitmap createBitmap = Bitmap.createBitmap(r().width() / A(), r().height() / A(), Bitmap.Config.ARGB_8888);
        createBitmap.copyPixelsFromBuffer(this.o);
        E();
        return createBitmap;
    }

    public int v() {
        return this.d.size();
    }

    protected abstract int w();

    public int x() {
        int i2;
        synchronized (this.m) {
            try {
                i2 = 0;
                for (Bitmap bitmap : this.l) {
                    if (!bitmap.isRecycled()) {
                        i2 += bitmap.getAllocationByteCount();
                    }
                }
                ByteBuffer byteBuffer = this.o;
                if (byteBuffer != null) {
                    i2 += byteBuffer.capacity();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return i2;
    }

    protected abstract R z(m79 m79Var);
}
