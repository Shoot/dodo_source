package defpackage;

import android.graphics.drawable.Drawable;
import android.util.Log;
import defpackage.m76;
import java.util.concurrent.atomic.AtomicReference;
import org.osmdroid.tileprovider.modules.CantContinueException;
import org.osmdroid.tileprovider.tilesource.BitmapTileSourceBase;
/* compiled from: MapTileSqlCacheProvider.java */
/* renamed from: s76  reason: default package */
/* loaded from: classes3.dex */
public class s76 extends i76 {
    private static final String[] i = {"tile", "expires"};
    private final AtomicReference<org.osmdroid.tileprovider.tilesource.a> g;
    private osa h;

    /* JADX INFO: Access modifiers changed from: protected */
    /* compiled from: MapTileSqlCacheProvider.java */
    /* renamed from: s76$a */
    /* loaded from: classes3.dex */
    public class a extends m76.b {
        protected a() {
            super();
        }

        @Override // defpackage.m76.b
        public Drawable a(long j) throws CantContinueException {
            org.osmdroid.tileprovider.tilesource.a aVar = (org.osmdroid.tileprovider.tilesource.a) s76.this.g.get();
            if (aVar == null) {
                return null;
            }
            if (s76.this.h != null) {
                try {
                    Drawable l = s76.this.h.l(aVar, j);
                    if (l == null) {
                        zx1.d++;
                    } else {
                        zx1.f++;
                    }
                    return l;
                } catch (BitmapTileSourceBase.LowMemoryException e) {
                    Log.w("OsmDroid", "LowMemoryException downloading MapTile: " + k76.h(j) + " : " + e);
                    zx1.e = zx1.e + 1;
                    throw new CantContinueException(e);
                } catch (Throwable th) {
                    Log.e("OsmDroid", "Error loading tile", th);
                    return null;
                }
            }
            Log.d("OsmDroid", "TileLoader failed to load tile due to mWriter being null (map shutdown?)");
            return null;
        }
    }

    public s76(rs4 rs4Var, org.osmdroid.tileprovider.tilesource.a aVar) {
        super(rs4Var, dq1.a().F(), dq1.a().c());
        this.g = new AtomicReference<>();
        m(aVar);
        this.h = new osa();
    }

    @Override // defpackage.i76, defpackage.m76
    public void c() {
        osa osaVar = this.h;
        if (osaVar != null) {
            osaVar.b();
        }
        this.h = null;
        super.c();
    }

    @Override // defpackage.m76
    public int d() {
        org.osmdroid.tileprovider.tilesource.a aVar = this.g.get();
        if (aVar != null) {
            return aVar.f();
        }
        return cgb.u();
    }

    @Override // defpackage.m76
    public int e() {
        org.osmdroid.tileprovider.tilesource.a aVar = this.g.get();
        if (aVar != null) {
            return aVar.e();
        }
        return 0;
    }

    @Override // defpackage.m76
    protected String f() {
        return "SQL Cache Archive Provider";
    }

    @Override // defpackage.m76
    protected String g() {
        return "sqlcache";
    }

    @Override // defpackage.m76
    public boolean i() {
        return false;
    }

    @Override // defpackage.m76
    public void m(org.osmdroid.tileprovider.tilesource.a aVar) {
        this.g.set(aVar);
    }

    @Override // defpackage.i76
    protected void o() {
        osa osaVar = this.h;
        if (osaVar != null) {
            osaVar.b();
        }
        this.h = new osa();
    }

    @Override // defpackage.m76
    /* renamed from: r */
    public a h() {
        return new a();
    }

    @Override // defpackage.i76
    protected void n() {
    }
}
