package defpackage;

import ch.qos.logback.core.CoreConstants;
import com.airbnb.lottie.n;
/* compiled from: ShapePath.java */
/* renamed from: iha  reason: default package */
/* loaded from: classes.dex */
public class iha implements xt1 {
    private final String a;
    private final int b;
    private final wj c;
    private final boolean d;

    public iha(String str, int i, wj wjVar, boolean z) {
        this.a = str;
        this.b = i;
        this.c = wjVar;
        this.d = z;
    }

    @Override // defpackage.xt1
    public dt1 a(n nVar, v70 v70Var) {
        return new xga(nVar, v70Var, this);
    }

    public String b() {
        return this.a;
    }

    public wj c() {
        return this.c;
    }

    public boolean d() {
        return this.d;
    }

    public String toString() {
        return "ShapePath{name=" + this.a + ", index=" + this.b + CoreConstants.CURLY_RIGHT;
    }
}
