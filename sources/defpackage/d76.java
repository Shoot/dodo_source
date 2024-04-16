package defpackage;

import android.content.res.AssetManager;
import android.graphics.drawable.Drawable;
import defpackage.m76;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicReference;
import org.osmdroid.tileprovider.modules.CantContinueException;
import org.osmdroid.tileprovider.tilesource.BitmapTileSourceBase;
/* compiled from: MapTileAssetsProvider.java */
/* renamed from: d76  reason: default package */
/* loaded from: classes3.dex */
public class d76 extends i76 {
    private final AssetManager g;
    private final AtomicReference<org.osmdroid.tileprovider.tilesource.a> h;

    /* JADX INFO: Access modifiers changed from: protected */
    /* compiled from: MapTileAssetsProvider.java */
    /* renamed from: d76$a */
    /* loaded from: classes3.dex */
    public class a extends m76.b {
        private AssetManager b;

        public a(AssetManager assetManager) {
            super();
            this.b = assetManager;
        }

        @Override // defpackage.m76.b
        public Drawable a(long j) throws CantContinueException {
            org.osmdroid.tileprovider.tilesource.a aVar = (org.osmdroid.tileprovider.tilesource.a) d76.this.h.get();
            if (aVar == null) {
                return null;
            }
            try {
                return aVar.a(this.b.open(aVar.d(j)));
            } catch (IOException unused) {
                return null;
            } catch (BitmapTileSourceBase.LowMemoryException e) {
                throw new CantContinueException(e);
            }
        }
    }

    public d76(rs4 rs4Var, AssetManager assetManager, org.osmdroid.tileprovider.tilesource.a aVar) {
        this(rs4Var, assetManager, aVar, dq1.a().u(), dq1.a().b());
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
        return "Assets Cache Provider";
    }

    @Override // defpackage.m76
    protected String g() {
        return "assets";
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
    /* renamed from: q */
    public a h() {
        return new a(this.g);
    }

    public d76(rs4 rs4Var, AssetManager assetManager, org.osmdroid.tileprovider.tilesource.a aVar, int i, int i2) {
        super(rs4Var, i, i2);
        this.h = new AtomicReference<>();
        m(aVar);
        this.g = assetManager;
    }
}
