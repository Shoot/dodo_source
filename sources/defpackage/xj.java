package defpackage;

import android.graphics.PointF;
import java.util.List;
/* compiled from: AnimatableSplitDimensionPathValue.java */
/* renamed from: xj  reason: default package */
/* loaded from: classes.dex */
public class xj implements dk<PointF, PointF> {
    private final pj a;
    private final pj b;

    public xj(pj pjVar, pj pjVar2) {
        this.a = pjVar;
        this.b = pjVar2;
    }

    @Override // defpackage.dk
    public t70<PointF, PointF> a() {
        return new hsa(this.a.a(), this.b.a());
    }

    @Override // defpackage.dk
    public List<lg5<PointF>> b() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }

    @Override // defpackage.dk
    public boolean c() {
        if (this.a.c() && this.b.c()) {
            return true;
        }
        return false;
    }
}
