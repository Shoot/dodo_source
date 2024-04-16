package defpackage;

import ch.qos.logback.core.CoreConstants;
import com.airbnb.lottie.n;
import java.util.Arrays;
import java.util.List;
/* compiled from: ShapeGroup.java */
/* renamed from: cha  reason: default package */
/* loaded from: classes.dex */
public class cha implements xt1 {
    private final String a;
    private final List<xt1> b;
    private final boolean c;

    public cha(String str, List<xt1> list, boolean z) {
        this.a = str;
        this.b = list;
        this.c = z;
    }

    @Override // defpackage.xt1
    public dt1 a(n nVar, v70 v70Var) {
        return new jt1(nVar, v70Var, this);
    }

    public List<xt1> b() {
        return this.b;
    }

    public String c() {
        return this.a;
    }

    public boolean d() {
        return this.c;
    }

    public String toString() {
        return "ShapeGroup{name='" + this.a + "' Shapes: " + Arrays.toString(this.b.toArray()) + CoreConstants.CURLY_RIGHT;
    }
}
