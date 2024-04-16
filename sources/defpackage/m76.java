package defpackage;

import android.graphics.drawable.Drawable;
import android.util.Log;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import org.osmdroid.tileprovider.modules.CantContinueException;
/* compiled from: MapTileModuleProviderBase.java */
/* renamed from: m76  reason: default package */
/* loaded from: classes3.dex */
public abstract class m76 {
    private final ExecutorService a;
    protected final Object b = new Object();
    protected final HashMap<Long, r76> c;
    protected final LinkedHashMap<Long, r76> d;

    /* compiled from: MapTileModuleProviderBase.java */
    /* renamed from: m76$a */
    /* loaded from: classes3.dex */
    class a extends LinkedHashMap<Long, r76> {
        final /* synthetic */ int a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i, float f, boolean z, int i2) {
            super(i, f, z);
            this.a = i2;
        }

        @Override // java.util.LinkedHashMap
        protected boolean removeEldestEntry(Map.Entry<Long, r76> entry) {
            r76 r76Var;
            if (size() <= this.a) {
                return false;
            }
            Iterator<Long> it = m76.this.d.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                long longValue = it.next().longValue();
                if (!m76.this.c.containsKey(Long.valueOf(longValue)) && (r76Var = m76.this.d.get(Long.valueOf(longValue))) != null) {
                    m76.this.l(longValue);
                    r76Var.a().c(r76Var);
                    break;
                }
            }
            return false;
        }
    }

    public m76(int i, int i2) {
        if (i2 < i) {
            Log.w("OsmDroid", "The pending queue size is smaller than the thread pool size. Automatically reducing the thread pool size.");
            i = i2;
        }
        this.a = Executors.newFixedThreadPool(i, new cq1(5, g()));
        this.c = new HashMap<>();
        this.d = new a(i2 + 2, 0.1f, true, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        synchronized (this.b) {
            this.d.clear();
            this.c.clear();
        }
    }

    public void c() {
        b();
        this.a.shutdown();
    }

    public abstract int d();

    public abstract int e();

    protected abstract String f();

    protected abstract String g();

    public abstract b h();

    public abstract boolean i();

    public boolean j(long j) {
        int e = k76.e(j);
        if (e >= e() && e <= d()) {
            return true;
        }
        return false;
    }

    public void k(r76 r76Var) {
        if (this.a.isShutdown()) {
            return;
        }
        synchronized (this.b) {
            try {
                if (dq1.a().h()) {
                    Log.d("OsmDroid", "MapTileModuleProviderBase.loadMaptileAsync() on provider: " + f() + " for tile: " + k76.h(r76Var.b()));
                    if (this.d.containsKey(Long.valueOf(r76Var.b()))) {
                        Log.d("OsmDroid", "MapTileModuleProviderBase.loadMaptileAsync() tile already exists in request queue for modular provider. Moving to front of queue.");
                    } else {
                        Log.d("OsmDroid", "MapTileModuleProviderBase.loadMaptileAsync() adding tile to request queue for modular provider.");
                    }
                }
                this.d.put(Long.valueOf(r76Var.b()), r76Var);
            } catch (Throwable th) {
                throw th;
            }
        }
        try {
            this.a.execute(h());
        } catch (RejectedExecutionException e) {
            Log.w("OsmDroid", "RejectedExecutionException", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void l(long j) {
        synchronized (this.b) {
            try {
                if (dq1.a().h()) {
                    Log.d("OsmDroid", "MapTileModuleProviderBase.removeTileFromQueues() on provider: " + f() + " for tile: " + k76.h(j));
                }
                this.d.remove(Long.valueOf(j));
                this.c.remove(Long.valueOf(j));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract void m(org.osmdroid.tileprovider.tilesource.a aVar);

    /* compiled from: MapTileModuleProviderBase.java */
    /* renamed from: m76$b */
    /* loaded from: classes3.dex */
    public abstract class b implements Runnable {
        public b() {
        }

        public abstract Drawable a(long j) throws CantContinueException;

        public Drawable b(long j) throws CantContinueException {
            if (!m76.this.j(j)) {
                return null;
            }
            return a(j);
        }

        protected r76 c() {
            r76 r76Var;
            synchronized (m76.this.b) {
                try {
                    r76Var = null;
                    Long l = null;
                    for (Long l2 : m76.this.d.keySet()) {
                        if (!m76.this.c.containsKey(l2)) {
                            if (dq1.a().h()) {
                                Log.d("OsmDroid", "TileLoader.nextTile() on provider: " + m76.this.f() + " found tile in working queue: " + k76.h(l2.longValue()));
                            }
                            l = l2;
                        }
                    }
                    if (l != null) {
                        if (dq1.a().h()) {
                            Log.d("OsmDroid", "TileLoader.nextTile() on provider: " + m76.this.f() + " adding tile to working queue: " + l);
                        }
                        m76 m76Var = m76.this;
                        m76Var.c.put(l, m76Var.d.get(l));
                    }
                    if (l != null) {
                        r76Var = m76.this.d.get(l);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return r76Var;
        }

        protected void f(r76 r76Var, Drawable drawable) {
            if (dq1.a().h()) {
                Log.d("OsmDroid", "TileLoader.tileLoaded() on provider: " + m76.this.f() + " with tile: " + k76.h(r76Var.b()));
            }
            m76.this.l(r76Var.b());
            jn3.b(drawable, -1);
            r76Var.a().a(r76Var, drawable);
        }

        protected void g(r76 r76Var, Drawable drawable) {
            if (dq1.a().h()) {
                Log.d("OsmDroid", "TileLoader.tileLoadedExpired() on provider: " + m76.this.f() + " with tile: " + k76.h(r76Var.b()));
            }
            m76.this.l(r76Var.b());
            jn3.b(drawable, -2);
            r76Var.a().b(r76Var, drawable);
        }

        protected void h(r76 r76Var) {
            if (dq1.a().h()) {
                Log.d("OsmDroid", "TileLoader.tileLoadedFailed() on provider: " + m76.this.f() + " with tile: " + k76.h(r76Var.b()));
            }
            m76.this.l(r76Var.b());
            r76Var.a().e(r76Var);
        }

        protected void i(r76 r76Var, Drawable drawable) {
            if (dq1.a().h()) {
                Log.d("OsmDroid", "TileLoader.tileLoadedScaled() on provider: " + m76.this.f() + " with tile: " + k76.h(r76Var.b()));
            }
            m76.this.l(r76Var.b());
            jn3.b(drawable, -3);
            r76Var.a().b(r76Var, drawable);
        }

        /* JADX WARN: Removed duplicated region for block: B:31:0x00a4 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:33:0x009f A[SYNTHETIC] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void run() {
            /*
                r6 = this;
                r6.d()
            L3:
                r76 r0 = r6.c()
                if (r0 == 0) goto Lc1
                ir4 r1 = defpackage.dq1.a()
                boolean r1 = r1.h()
                java.lang.String r2 = "OsmDroid"
                if (r1 == 0) goto L51
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r3 = "TileLoader.run() processing next tile: "
                r1.append(r3)
                long r3 = r0.b()
                java.lang.String r3 = defpackage.k76.h(r3)
                r1.append(r3)
                java.lang.String r3 = ", pending:"
                r1.append(r3)
                m76 r3 = defpackage.m76.this
                java.util.LinkedHashMap<java.lang.Long, r76> r3 = r3.d
                int r3 = r3.size()
                r1.append(r3)
                java.lang.String r3 = ", working:"
                r1.append(r3)
                m76 r3 = defpackage.m76.this
                java.util.HashMap<java.lang.Long, r76> r3 = r3.c
                int r3 = r3.size()
                r1.append(r3)
                java.lang.String r1 = r1.toString()
                android.util.Log.d(r2, r1)
            L51:
                long r3 = r0.b()     // Catch: java.lang.Throwable -> L5a org.osmdroid.tileprovider.modules.CantContinueException -> L5c
                android.graphics.drawable.Drawable r1 = r6.b(r3)     // Catch: java.lang.Throwable -> L5a org.osmdroid.tileprovider.modules.CantContinueException -> L5c
                goto L9d
            L5a:
                r1 = move-exception
                goto L5e
            L5c:
                r1 = move-exception
                goto L7b
            L5e:
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "Error downloading tile: "
                r3.append(r4)
                long r4 = r0.b()
                java.lang.String r4 = defpackage.k76.h(r4)
                r3.append(r4)
                java.lang.String r3 = r3.toString()
                android.util.Log.i(r2, r3, r1)
                goto L9c
            L7b:
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "Tile loader can't continue: "
                r3.append(r4)
                long r4 = r0.b()
                java.lang.String r4 = defpackage.k76.h(r4)
                r3.append(r4)
                java.lang.String r3 = r3.toString()
                android.util.Log.i(r2, r3, r1)
                m76 r1 = defpackage.m76.this
                defpackage.m76.a(r1)
            L9c:
                r1 = 0
            L9d:
                if (r1 != 0) goto La4
                r6.h(r0)
                goto L3
            La4:
                int r2 = defpackage.jn3.a(r1)
                r3 = -2
                if (r2 != r3) goto Lb0
                r6.g(r0, r1)
                goto L3
            Lb0:
                int r2 = defpackage.jn3.a(r1)
                r3 = -3
                if (r2 != r3) goto Lbc
                r6.i(r0, r1)
                goto L3
            Lbc:
                r6.f(r0, r1)
                goto L3
            Lc1:
                r6.e()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.m76.b.run():void");
        }

        protected void d() {
        }

        protected void e() {
        }
    }
}
