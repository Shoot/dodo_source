package defpackage;

import com.google.android.gms.maps.model.CameraPosition;
import defpackage.ja1;
import java.util.Collection;
import java.util.Set;
/* compiled from: ScreenBasedAlgorithmAdapter.java */
/* renamed from: bx9  reason: default package */
/* loaded from: classes.dex */
public class bx9<T extends ja1> extends v0<T> implements ax9<T> {
    private db<T> b;

    public bx9(db<T> dbVar) {
        this.b = dbVar;
    }

    @Override // defpackage.db
    public boolean b(Collection<T> collection) {
        return this.b.b(collection);
    }

    @Override // defpackage.db
    public void c() {
        this.b.c();
    }

    @Override // defpackage.ax9
    public boolean d() {
        return false;
    }

    @Override // defpackage.db
    public Set<? extends ia1<T>> e(float f) {
        return this.b.e(f);
    }

    @Override // defpackage.db
    public int f() {
        return this.b.f();
    }

    @Override // defpackage.ax9
    public void a(CameraPosition cameraPosition) {
    }
}
