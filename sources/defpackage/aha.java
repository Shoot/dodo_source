package defpackage;

import android.graphics.Path;
import ch.qos.logback.core.CoreConstants;
import com.airbnb.lottie.n;
/* compiled from: ShapeFill.java */
/* renamed from: aha  reason: default package */
/* loaded from: classes.dex */
public class aha implements xt1 {
    private final boolean a;
    private final Path.FillType b;
    private final String c;
    private final oj d;
    private final rj e;
    private final boolean f;

    public aha(String str, boolean z, Path.FillType fillType, oj ojVar, rj rjVar, boolean z2) {
        this.c = str;
        this.a = z;
        this.b = fillType;
        this.d = ojVar;
        this.e = rjVar;
        this.f = z2;
    }

    @Override // defpackage.xt1
    public dt1 a(n nVar, v70 v70Var) {
        return new vu3(nVar, v70Var, this);
    }

    public oj b() {
        return this.d;
    }

    public Path.FillType c() {
        return this.b;
    }

    public String d() {
        return this.c;
    }

    public rj e() {
        return this.e;
    }

    public boolean f() {
        return this.f;
    }

    public String toString() {
        return "ShapeFill{color=, fillEnabled=" + this.a + CoreConstants.CURLY_RIGHT;
    }
}
