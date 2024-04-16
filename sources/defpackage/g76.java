package defpackage;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import defpackage.m76;
import java.util.concurrent.atomic.AtomicReference;
import org.osmdroid.tileprovider.modules.CantContinueException;
/* compiled from: MapTileDownloader.java */
/* renamed from: g76  reason: default package */
/* loaded from: classes3.dex */
public class g76 extends m76 {
    private final ur4 e;
    private final AtomicReference<da7> f;
    private final js4 g;
    private final a h;
    private final ttb i;
    private xfb j;

    /* JADX INFO: Access modifiers changed from: protected */
    /* compiled from: MapTileDownloader.java */
    /* renamed from: g76$a */
    /* loaded from: classes3.dex */
    public class a extends m76.b {
        protected a() {
            super();
        }

        @Override // defpackage.m76.b
        public Drawable a(long j) throws CantContinueException {
            da7 da7Var = (da7) g76.this.f.get();
            if (da7Var == null) {
                return null;
            }
            if (g76.this.g != null && !g76.this.g.a()) {
                if (dq1.a().v()) {
                    Log.d("OsmDroid", "Skipping " + g76.this.f() + " due to NetworkAvailabliltyCheck.");
                }
                return null;
            }
            String m = da7Var.m(j);
            if (TextUtils.isEmpty(m) || g76.this.i.c(m)) {
                return null;
            }
            Drawable j2 = j(j, 0, m);
            if (j2 == null) {
                g76.this.i.a(m);
            } else {
                g76.this.i.b(m);
            }
            return j2;
        }

        @Override // defpackage.m76.b
        protected void f(r76 r76Var, Drawable drawable) {
            g76.this.l(r76Var.b());
            r76Var.a().a(r76Var, null);
            fc0.d().c(drawable);
        }

        protected Drawable j(long j, int i, String str) throws CantContinueException {
            da7 da7Var = (da7) g76.this.f.get();
            if (da7Var == null) {
                return null;
            }
            try {
                da7Var.j();
                try {
                    return g76.this.j.a(j, i, str, g76.this.e, da7Var);
                } finally {
                    da7Var.n();
                }
            } catch (InterruptedException unused) {
                return null;
            }
        }
    }

    public g76(org.osmdroid.tileprovider.tilesource.a aVar, ur4 ur4Var, js4 js4Var) {
        this(aVar, ur4Var, js4Var, dq1.a().u(), dq1.a().b());
    }

    @Override // defpackage.m76
    public void c() {
        super.c();
        ur4 ur4Var = this.e;
        if (ur4Var != null) {
            ur4Var.b();
        }
    }

    @Override // defpackage.m76
    public int d() {
        da7 da7Var = this.f.get();
        if (da7Var != null) {
            return da7Var.f();
        }
        return cgb.u();
    }

    @Override // defpackage.m76
    public int e() {
        da7 da7Var = this.f.get();
        if (da7Var != null) {
            return da7Var.e();
        }
        return 0;
    }

    @Override // defpackage.m76
    protected String f() {
        return "Online Tile Download Provider";
    }

    @Override // defpackage.m76
    protected String g() {
        return "downloader";
    }

    @Override // defpackage.m76
    public boolean i() {
        return true;
    }

    @Override // defpackage.m76
    public void m(org.osmdroid.tileprovider.tilesource.a aVar) {
        if (aVar instanceof da7) {
            this.f.set((da7) aVar);
        } else {
            this.f.set(null);
        }
    }

    @Override // defpackage.m76
    /* renamed from: s */
    public a h() {
        return this.h;
    }

    public org.osmdroid.tileprovider.tilesource.a t() {
        return this.f.get();
    }

    public g76(org.osmdroid.tileprovider.tilesource.a aVar, ur4 ur4Var, js4 js4Var, int i, int i2) {
        super(i, i2);
        this.f = new AtomicReference<>();
        this.h = new a();
        this.i = new ttb();
        this.j = new xfb();
        this.e = ur4Var;
        this.g = js4Var;
        m(aVar);
    }
}
