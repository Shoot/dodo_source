package defpackage;

import android.util.Log;
import defpackage.m76;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: MapTileFileArchiveProvider.java */
/* renamed from: h76  reason: default package */
/* loaded from: classes3.dex */
public class h76 extends i76 {
    private final ArrayList<gr4> g;
    private final AtomicReference<org.osmdroid.tileprovider.tilesource.a> h;
    private final boolean i;
    private final boolean j;

    /* JADX INFO: Access modifiers changed from: protected */
    /* compiled from: MapTileFileArchiveProvider.java */
    /* renamed from: h76$a */
    /* loaded from: classes3.dex */
    public class a extends m76.b {
        protected a() {
            super();
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0074, code lost:
            if (r3 == null) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0077, code lost:
            return r2;
         */
        @Override // defpackage.m76.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public android.graphics.drawable.Drawable a(long r7) {
            /*
                r6 = this;
                java.lang.String r0 = "OsmDroid"
                h76 r1 = defpackage.h76.this
                java.util.concurrent.atomic.AtomicReference r1 = defpackage.h76.p(r1)
                java.lang.Object r1 = r1.get()
                org.osmdroid.tileprovider.tilesource.a r1 = (org.osmdroid.tileprovider.tilesource.a) r1
                r2 = 0
                if (r1 != 0) goto L12
                return r2
            L12:
                ir4 r3 = defpackage.dq1.a()     // Catch: java.lang.Throwable -> L35
                boolean r3 = r3.v()     // Catch: java.lang.Throwable -> L35
                if (r3 == 0) goto L38
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L35
                r3.<init>()     // Catch: java.lang.Throwable -> L35
                java.lang.String r4 = "Archives - Tile doesn't exist: "
                r3.append(r4)     // Catch: java.lang.Throwable -> L35
                java.lang.String r4 = defpackage.k76.h(r7)     // Catch: java.lang.Throwable -> L35
                r3.append(r4)     // Catch: java.lang.Throwable -> L35
                java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L35
                android.util.Log.d(r0, r3)     // Catch: java.lang.Throwable -> L35
                goto L38
            L35:
                r7 = move-exception
                r3 = r2
                goto L6f
            L38:
                h76 r3 = defpackage.h76.this     // Catch: java.lang.Throwable -> L35
                java.io.InputStream r3 = defpackage.h76.q(r3, r7, r1)     // Catch: java.lang.Throwable -> L35
                if (r3 == 0) goto L69
                ir4 r4 = defpackage.dq1.a()     // Catch: java.lang.Throwable -> L63
                boolean r4 = r4.v()     // Catch: java.lang.Throwable -> L63
                if (r4 == 0) goto L65
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L63
                r4.<init>()     // Catch: java.lang.Throwable -> L63
                java.lang.String r5 = "Use tile from archive: "
                r4.append(r5)     // Catch: java.lang.Throwable -> L63
                java.lang.String r7 = defpackage.k76.h(r7)     // Catch: java.lang.Throwable -> L63
                r4.append(r7)     // Catch: java.lang.Throwable -> L63
                java.lang.String r7 = r4.toString()     // Catch: java.lang.Throwable -> L63
                android.util.Log.d(r0, r7)     // Catch: java.lang.Throwable -> L63
                goto L65
            L63:
                r7 = move-exception
                goto L6f
            L65:
                android.graphics.drawable.Drawable r2 = r1.a(r3)     // Catch: java.lang.Throwable -> L63
            L69:
                if (r3 == 0) goto L77
            L6b:
                defpackage.xya.a(r3)
                goto L77
            L6f:
                java.lang.String r8 = "Error loading tile"
                android.util.Log.e(r0, r8, r7)     // Catch: java.lang.Throwable -> L78
                if (r3 == 0) goto L77
                goto L6b
            L77:
                return r2
            L78:
                r7 = move-exception
                if (r3 == 0) goto L7e
                defpackage.xya.a(r3)
            L7e:
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.h76.a.a(long):android.graphics.drawable.Drawable");
        }
    }

    public h76(rs4 rs4Var, org.osmdroid.tileprovider.tilesource.a aVar, gr4[] gr4VarArr) {
        this(rs4Var, aVar, gr4VarArr, false);
    }

    private void r() {
        while (!this.g.isEmpty()) {
            gr4 gr4Var = this.g.get(0);
            if (gr4Var != null) {
                gr4Var.close();
            }
            this.g.remove(0);
        }
    }

    private void s() {
        File[] listFiles;
        r();
        File n = dq1.a().n();
        if (n != null && (listFiles = n.listFiles()) != null) {
            for (File file : listFiles) {
                gr4 a2 = vq.a(file);
                if (a2 != null) {
                    a2.b(this.j);
                    this.g.add(a2);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized InputStream t(long j, org.osmdroid.tileprovider.tilesource.a aVar) {
        InputStream c;
        Iterator<gr4> it = this.g.iterator();
        while (it.hasNext()) {
            gr4 next = it.next();
            if (next != null && (c = next.c(aVar, j)) != null) {
                if (dq1.a().v()) {
                    Log.d("OsmDroid", "Found tile " + k76.h(j) + " in " + next);
                }
                return c;
            }
        }
        return null;
    }

    @Override // defpackage.i76, defpackage.m76
    public void c() {
        r();
        super.c();
    }

    @Override // defpackage.m76
    public int d() {
        org.osmdroid.tileprovider.tilesource.a aVar = this.h.get();
        if (aVar != null) {
            return aVar.f();
        }
        return cgb.u();
    }

    @Override // defpackage.m76
    public int e() {
        org.osmdroid.tileprovider.tilesource.a aVar = this.h.get();
        if (aVar != null) {
            return aVar.e();
        }
        return 0;
    }

    @Override // defpackage.m76
    protected String f() {
        return "File Archive Provider";
    }

    @Override // defpackage.m76
    protected String g() {
        return "filearchive";
    }

    @Override // defpackage.m76
    public boolean i() {
        return false;
    }

    @Override // defpackage.m76
    public void m(org.osmdroid.tileprovider.tilesource.a aVar) {
        this.h.set(aVar);
    }

    @Override // defpackage.i76
    protected void n() {
        if (!this.i) {
            s();
        }
    }

    @Override // defpackage.i76
    protected void o() {
        if (!this.i) {
            s();
        }
    }

    @Override // defpackage.m76
    /* renamed from: u */
    public a h() {
        return new a();
    }

    public h76(rs4 rs4Var, org.osmdroid.tileprovider.tilesource.a aVar, gr4[] gr4VarArr, boolean z) {
        super(rs4Var, dq1.a().F(), dq1.a().c());
        this.g = new ArrayList<>();
        this.h = new AtomicReference<>();
        this.j = z;
        m(aVar);
        if (gr4VarArr == null) {
            this.i = false;
            s();
            return;
        }
        this.i = true;
        for (int length = gr4VarArr.length - 1; length >= 0; length--) {
            this.g.add(gr4VarArr[length]);
        }
    }

    public h76(rs4 rs4Var, org.osmdroid.tileprovider.tilesource.a aVar) {
        this(rs4Var, aVar, null);
    }
}
