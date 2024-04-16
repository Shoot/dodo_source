package defpackage;

import android.graphics.PointF;
import com.airbnb.lottie.n;
/* compiled from: CircleShape.java */
/* renamed from: z71  reason: default package */
/* loaded from: classes.dex */
public class z71 implements xt1 {
    private final String a;
    private final dk<PointF, PointF> b;
    private final uj c;
    private final boolean d;
    private final boolean e;

    public z71(String str, dk<PointF, PointF> dkVar, uj ujVar, boolean z, boolean z2) {
        this.a = str;
        this.b = dkVar;
        this.c = ujVar;
        this.d = z;
        this.e = z2;
    }

    @Override // defpackage.xt1
    public dt1 a(n nVar, v70 v70Var) {
        return new bf3(nVar, v70Var, this);
    }

    public String b() {
        return this.a;
    }

    public dk<PointF, PointF> c() {
        return this.b;
    }

    public uj d() {
        return this.c;
    }

    public boolean e() {
        return this.e;
    }

    public boolean f() {
        return this.d;
    }
}
