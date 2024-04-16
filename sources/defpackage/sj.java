package defpackage;

import android.graphics.PointF;
import java.util.List;
/* compiled from: AnimatablePathValue.java */
/* renamed from: sj  reason: default package */
/* loaded from: classes.dex */
public class sj implements dk<PointF, PointF> {
    private final List<lg5<PointF>> a;

    public sj(List<lg5<PointF>> list) {
        this.a = list;
    }

    @Override // defpackage.dk
    public t70<PointF, PointF> a() {
        if (this.a.get(0).h()) {
            return new fd8(this.a);
        }
        return new vr7(this.a);
    }

    @Override // defpackage.dk
    public List<lg5<PointF>> b() {
        return this.a;
    }

    @Override // defpackage.dk
    public boolean c() {
        if (this.a.size() != 1 || !this.a.get(0).h()) {
            return false;
        }
        return true;
    }
}
