package defpackage;

import android.graphics.drawable.Drawable;
import android.util.Log;
import ch.qos.logback.core.CoreConstants;
import defpackage.m76;
import java.util.concurrent.atomic.AtomicReference;
import org.osmdroid.tileprovider.modules.CantContinueException;
import org.osmdroid.tileprovider.tilesource.BitmapTileSourceBase;
/* compiled from: MapTileFilesystemProvider.java */
/* renamed from: j76  reason: default package */
/* loaded from: classes3.dex */
public class j76 extends i76 {
    private final egb g;
    private final AtomicReference<org.osmdroid.tileprovider.tilesource.a> h;

    /* JADX INFO: Access modifiers changed from: protected */
    /* compiled from: MapTileFilesystemProvider.java */
    /* renamed from: j76$a */
    /* loaded from: classes3.dex */
    public class a extends m76.b {
        protected a() {
            super();
        }

        @Override // defpackage.m76.b
        public Drawable a(long j) throws CantContinueException {
            org.osmdroid.tileprovider.tilesource.a aVar = (org.osmdroid.tileprovider.tilesource.a) j76.this.h.get();
            if (aVar == null) {
                return null;
            }
            try {
                Drawable m = j76.this.g.m(aVar, j);
                if (m == null) {
                    zx1.d++;
                } else {
                    zx1.f++;
                }
                return m;
            } catch (BitmapTileSourceBase.LowMemoryException e) {
                Log.w("OsmDroid", "LowMemoryException downloading MapTile: " + k76.h(j) + " : " + e);
                zx1.e = zx1.e + 1;
                throw new CantContinueException(e);
            } catch (Throwable th) {
                Log.e("OsmDroid", "Error loading tile", th);
                return null;
            }
        }
    }

    public j76(rs4 rs4Var, org.osmdroid.tileprovider.tilesource.a aVar) {
        this(rs4Var, aVar, dq1.a().E() + CoreConstants.MILLIS_IN_ONE_WEEK);
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
        return "File System Cache Provider";
    }

    @Override // defpackage.m76
    protected String g() {
        return "filesystem";
    }

    @Override // defpackage.m76
    public boolean i() {
        return false;
    }

    @Override // defpackage.m76
    public void m(org.osmdroid.tileprovider.tilesource.a aVar) {
        this.h.set(aVar);
    }

    @Override // defpackage.m76
    /* renamed from: r */
    public a h() {
        return new a();
    }

    public j76(rs4 rs4Var, org.osmdroid.tileprovider.tilesource.a aVar, long j) {
        this(rs4Var, aVar, j, dq1.a().F(), dq1.a().c());
    }

    public j76(rs4 rs4Var, org.osmdroid.tileprovider.tilesource.a aVar, long j, int i, int i2) {
        super(rs4Var, i, i2);
        egb egbVar = new egb();
        this.g = egbVar;
        this.h = new AtomicReference<>();
        m(aVar);
        egbVar.n(j);
    }
}
