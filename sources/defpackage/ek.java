package defpackage;

import java.io.IOException;
import java.util.List;
/* compiled from: AnimatableValueParser.java */
/* renamed from: ek  reason: default package */
/* loaded from: classes.dex */
public class ek {
    private static <T> List<lg5<T>> a(xb5 xb5Var, float f, ez5 ez5Var, jwb<T> jwbVar) throws IOException {
        return og5.a(xb5Var, ez5Var, f, jwbVar, false);
    }

    private static <T> List<lg5<T>> b(xb5 xb5Var, ez5 ez5Var, jwb<T> jwbVar) throws IOException {
        return og5.a(xb5Var, ez5Var, 1.0f, jwbVar, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static oj c(xb5 xb5Var, ez5 ez5Var) throws IOException {
        return new oj(b(xb5Var, ez5Var, bd1.a));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static yj d(xb5 xb5Var, ez5 ez5Var) throws IOException {
        return new yj(b(xb5Var, ez5Var, l53.a));
    }

    public static pj e(xb5 xb5Var, ez5 ez5Var) throws IOException {
        return f(xb5Var, ez5Var, true);
    }

    public static pj f(xb5 xb5Var, ez5 ez5Var, boolean z) throws IOException {
        float f;
        if (z) {
            f = fvb.e();
        } else {
            f = 1.0f;
        }
        return new pj(a(xb5Var, f, ez5Var, kz3.a));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static qj g(xb5 xb5Var, ez5 ez5Var, int i) throws IOException {
        return new qj(b(xb5Var, ez5Var, new wh4(i)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static rj h(xb5 xb5Var, ez5 ez5Var) throws IOException {
        return new rj(b(xb5Var, ez5Var, f65.a));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static uj i(xb5 xb5Var, ez5 ez5Var) throws IOException {
        return new uj(og5.a(xb5Var, ez5Var, fvb.e(), ed8.a, true));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static vj j(xb5 xb5Var, ez5 ez5Var) throws IOException {
        return new vj(b(xb5Var, ez5Var, kv9.a));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static wj k(xb5 xb5Var, ez5 ez5Var) throws IOException {
        return new wj(a(xb5Var, fvb.e(), ez5Var, zga.a));
    }
}
