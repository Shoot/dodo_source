package defpackage;

import androidx.annotation.NonNull;
/* compiled from: GifDrawableResource.java */
/* renamed from: nf4  reason: default package */
/* loaded from: classes.dex */
public class nf4 extends l83<kf4> implements t25 {
    public nf4(kf4 kf4Var) {
        super(kf4Var);
    }

    @Override // defpackage.nj9
    public int a() {
        return ((kf4) this.a).i();
    }

    @Override // defpackage.nj9
    public void b() {
        ((kf4) this.a).stop();
        ((kf4) this.a).k();
    }

    @Override // defpackage.nj9
    @NonNull
    public Class<kf4> c() {
        return kf4.class;
    }

    @Override // defpackage.l83, defpackage.t25
    public void initialize() {
        ((kf4) this.a).e().prepareToDraw();
    }
}
