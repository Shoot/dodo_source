package defpackage;

import android.graphics.PointF;
import ch.qos.logback.core.CoreConstants;
import com.airbnb.lottie.n;
/* compiled from: RectangleShape.java */
/* renamed from: r99  reason: default package */
/* loaded from: classes.dex */
public class r99 implements xt1 {
    private final String a;
    private final dk<PointF, PointF> b;
    private final dk<PointF, PointF> c;
    private final pj d;
    private final boolean e;

    public r99(String str, dk<PointF, PointF> dkVar, dk<PointF, PointF> dkVar2, pj pjVar, boolean z) {
        this.a = str;
        this.b = dkVar;
        this.c = dkVar2;
        this.d = pjVar;
        this.e = z;
    }

    @Override // defpackage.xt1
    public dt1 a(n nVar, v70 v70Var) {
        return new q99(nVar, v70Var, this);
    }

    public pj b() {
        return this.d;
    }

    public String c() {
        return this.a;
    }

    public dk<PointF, PointF> d() {
        return this.b;
    }

    public dk<PointF, PointF> e() {
        return this.c;
    }

    public boolean f() {
        return this.e;
    }

    public String toString() {
        return "RectangleShape{position=" + this.b + ", size=" + this.c + CoreConstants.CURLY_RIGHT;
    }
}
