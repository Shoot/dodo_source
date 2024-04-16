package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import defpackage.s4;
import java.io.File;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
/* compiled from: Picasso.java */
/* renamed from: s58  reason: default package */
/* loaded from: classes3.dex */
public class s58 {
    static final Handler o = new a(Looper.getMainLooper());
    @SuppressLint({"StaticFieldLeak"})
    static volatile s58 p = null;
    private final g a;
    private final c b;
    private final List<si9> c;
    final Context d;
    final s33 e;
    final jl0 f;
    final pwa g;
    final Map<Object, s4> h;
    final Map<ImageView, rs2> i;
    final ReferenceQueue<Object> j;
    final Bitmap.Config k;
    boolean l;
    volatile boolean m;
    boolean n;

    /* compiled from: Picasso.java */
    /* renamed from: s58$a */
    /* loaded from: classes3.dex */
    static class a extends Handler {
        a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i != 3) {
                int i2 = 0;
                if (i != 8) {
                    if (i == 13) {
                        List list = (List) message.obj;
                        int size = list.size();
                        while (i2 < size) {
                            s4 s4Var = (s4) list.get(i2);
                            s4Var.a.n(s4Var);
                            i2++;
                        }
                        return;
                    }
                    throw new AssertionError("Unknown handler message received: " + message.what);
                }
                List list2 = (List) message.obj;
                int size2 = list2.size();
                while (i2 < size2) {
                    zb0 zb0Var = (zb0) list2.get(i2);
                    zb0Var.b.d(zb0Var);
                    i2++;
                }
                return;
            }
            s4 s4Var2 = (s4) message.obj;
            if (s4Var2.g().m) {
                evb.u("Main", "canceled", s4Var2.b.d(), "target got garbage collected");
            }
            s4Var2.a.a(s4Var2.k());
        }
    }

    /* compiled from: Picasso.java */
    /* renamed from: s58$b */
    /* loaded from: classes3.dex */
    public static class b {
        private final Context a;
        private z63 b;
        private ExecutorService c;
        private jl0 d;
        private g e;
        private List<si9> f;
        private Bitmap.Config g;
        private boolean h;
        private boolean i;

        public b(@NonNull Context context) {
            if (context != null) {
                this.a = context.getApplicationContext();
                return;
            }
            throw new IllegalArgumentException("Context must not be null.");
        }

        public s58 a() {
            Context context = this.a;
            if (this.b == null) {
                this.b = new a77(context);
            }
            if (this.d == null) {
                this.d = new g36(context);
            }
            if (this.c == null) {
                this.c = new u58();
            }
            if (this.e == null) {
                this.e = g.a;
            }
            pwa pwaVar = new pwa(this.d);
            return new s58(context, new s33(context, this.c, s58.o, this.b, this.d, pwaVar), this.d, null, this.e, this.f, pwaVar, this.g, this.h, this.i);
        }

        public b b(@NonNull z63 z63Var) {
            if (z63Var != null) {
                if (this.b == null) {
                    this.b = z63Var;
                    return this;
                }
                throw new IllegalStateException("Downloader already set.");
            }
            throw new IllegalArgumentException("Downloader must not be null.");
        }

        public b c(@NonNull ExecutorService executorService) {
            if (executorService != null) {
                if (this.c == null) {
                    this.c = executorService;
                    return this;
                }
                throw new IllegalStateException("Executor service already set.");
            }
            throw new IllegalArgumentException("Executor service must not be null.");
        }
    }

    /* compiled from: Picasso.java */
    /* renamed from: s58$c */
    /* loaded from: classes3.dex */
    private static class c extends Thread {
        private final ReferenceQueue<Object> a;
        private final Handler b;

        /* compiled from: Picasso.java */
        /* renamed from: s58$c$a */
        /* loaded from: classes3.dex */
        class a implements Runnable {
            final /* synthetic */ Exception a;

            a(Exception exc) {
                this.a = exc;
            }

            @Override // java.lang.Runnable
            public void run() {
                throw new RuntimeException(this.a);
            }
        }

        c(ReferenceQueue<Object> referenceQueue, Handler handler) {
            this.a = referenceQueue;
            this.b = handler;
            setDaemon(true);
            setName("Picasso-refQueue");
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Process.setThreadPriority(10);
            while (true) {
                try {
                    s4.a aVar = (s4.a) this.a.remove(1000L);
                    Message obtainMessage = this.b.obtainMessage();
                    if (aVar != null) {
                        obtainMessage.what = 3;
                        obtainMessage.obj = aVar.a;
                        this.b.sendMessage(obtainMessage);
                    } else {
                        obtainMessage.recycle();
                    }
                } catch (InterruptedException unused) {
                    return;
                } catch (Exception e) {
                    this.b.post(new a(e));
                    return;
                }
            }
        }
    }

    /* compiled from: Picasso.java */
    /* renamed from: s58$d */
    /* loaded from: classes3.dex */
    public interface d {
    }

    /* compiled from: Picasso.java */
    /* renamed from: s58$e */
    /* loaded from: classes3.dex */
    public enum e {
        MEMORY(-16711936),
        DISK(-16776961),
        NETWORK(-65536);
        
        final int a;

        e(int i) {
            this.a = i;
        }
    }

    /* compiled from: Picasso.java */
    /* renamed from: s58$f */
    /* loaded from: classes3.dex */
    public enum f {
        LOW,
        NORMAL,
        HIGH
    }

    s58(Context context, s33 s33Var, jl0 jl0Var, d dVar, g gVar, List<si9> list, pwa pwaVar, Bitmap.Config config, boolean z, boolean z2) {
        int i;
        this.d = context;
        this.e = s33Var;
        this.f = jl0Var;
        this.a = gVar;
        this.k = config;
        if (list != null) {
            i = list.size();
        } else {
            i = 0;
        }
        ArrayList arrayList = new ArrayList(i + 7);
        arrayList.add(new bk9(context));
        if (list != null) {
            arrayList.addAll(list);
        }
        arrayList.add(new us1(context));
        arrayList.add(new nc6(context));
        arrayList.add(new cu1(context));
        arrayList.add(new ks(context));
        arrayList.add(new du3(context));
        arrayList.add(new ew6(s33Var.d, pwaVar));
        this.c = Collections.unmodifiableList(arrayList);
        this.g = pwaVar;
        this.h = new WeakHashMap();
        this.i = new WeakHashMap();
        this.l = z;
        this.m = z2;
        ReferenceQueue<Object> referenceQueue = new ReferenceQueue<>();
        this.j = referenceQueue;
        c cVar = new c(referenceQueue, o);
        this.b = cVar;
        cVar.start();
    }

    private void f(Bitmap bitmap, e eVar, s4 s4Var, Exception exc) {
        if (s4Var.l()) {
            return;
        }
        if (!s4Var.m()) {
            this.h.remove(s4Var.k());
        }
        if (bitmap != null) {
            if (eVar != null) {
                s4Var.b(bitmap, eVar);
                if (this.m) {
                    String d2 = s4Var.b.d();
                    evb.u("Main", "completed", d2, "from " + eVar);
                    return;
                }
                return;
            }
            throw new AssertionError("LoadedFrom cannot be null.");
        }
        s4Var.c(exc);
        if (this.m) {
            evb.u("Main", "errored", s4Var.b.d(), exc.getMessage());
        }
    }

    void a(Object obj) {
        evb.c();
        s4 remove = this.h.remove(obj);
        if (remove != null) {
            remove.a();
            this.e.c(remove);
        }
        if (obj instanceof ImageView) {
            rs2 remove2 = this.i.remove((ImageView) obj);
            if (remove2 != null) {
                remove2.a();
            }
        }
    }

    public void b(@NonNull o6b o6bVar) {
        if (o6bVar != null) {
            a(o6bVar);
            return;
        }
        throw new IllegalArgumentException("target cannot be null.");
    }

    public void c(@NonNull ImageView imageView) {
        if (imageView != null) {
            a(imageView);
            return;
        }
        throw new IllegalArgumentException("view cannot be null.");
    }

    void d(zb0 zb0Var) {
        boolean z;
        s4 h = zb0Var.h();
        List<s4> i = zb0Var.i();
        if (i != null && !i.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (h == null && !z) {
            return;
        }
        Uri uri = zb0Var.j().d;
        Exception k = zb0Var.k();
        Bitmap s = zb0Var.s();
        e o2 = zb0Var.o();
        if (h != null) {
            f(s, o2, h, k);
        }
        if (z) {
            int size = i.size();
            for (int i2 = 0; i2 < size; i2++) {
                f(s, o2, i.get(i2), k);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(ImageView imageView, rs2 rs2Var) {
        if (this.i.containsKey(imageView)) {
            a(imageView);
        }
        this.i.put(imageView, rs2Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g(s4 s4Var) {
        Object k = s4Var.k();
        if (k != null && this.h.get(k) != s4Var) {
            a(k);
            this.h.put(k, s4Var);
        }
        o(s4Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<si9> h() {
        return this.c;
    }

    public pi9 i(int i) {
        if (i != 0) {
            return new pi9(this, null, i);
        }
        throw new IllegalArgumentException("Resource ID must not be zero.");
    }

    public pi9 j(Uri uri) {
        return new pi9(this, uri, 0);
    }

    public pi9 k(@NonNull File file) {
        if (file == null) {
            return new pi9(this, null, 0);
        }
        return j(Uri.fromFile(file));
    }

    public pi9 l(String str) {
        if (str == null) {
            return new pi9(this, null, 0);
        }
        if (str.trim().length() != 0) {
            return j(Uri.parse(str));
        }
        throw new IllegalArgumentException("Path must not be empty.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Bitmap m(String str) {
        Bitmap bitmap = this.f.get(str);
        if (bitmap != null) {
            this.g.d();
        } else {
            this.g.e();
        }
        return bitmap;
    }

    void n(s4 s4Var) {
        Bitmap bitmap;
        if (zc6.a(s4Var.e)) {
            bitmap = m(s4Var.d());
        } else {
            bitmap = null;
        }
        if (bitmap != null) {
            e eVar = e.MEMORY;
            f(bitmap, eVar, s4Var, null);
            if (this.m) {
                evb.u("Main", "completed", s4Var.b.d(), "from " + eVar);
                return;
            }
            return;
        }
        g(s4Var);
        if (this.m) {
            evb.t("Main", "resumed", s4Var.b.d());
        }
    }

    void o(s4 s4Var) {
        this.e.h(s4Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public gi9 p(gi9 gi9Var) {
        gi9 a2 = this.a.a(gi9Var);
        if (a2 != null) {
            return a2;
        }
        throw new IllegalStateException("Request transformer " + this.a.getClass().getCanonicalName() + " returned null for " + gi9Var);
    }

    /* compiled from: Picasso.java */
    /* renamed from: s58$g */
    /* loaded from: classes3.dex */
    public interface g {
        public static final g a = new a();

        gi9 a(gi9 gi9Var);

        /* compiled from: Picasso.java */
        /* renamed from: s58$g$a */
        /* loaded from: classes3.dex */
        static class a implements g {
            a() {
            }

            @Override // defpackage.s58.g
            public gi9 a(gi9 gi9Var) {
                return gi9Var;
            }
        }
    }
}
