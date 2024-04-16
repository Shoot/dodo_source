package defpackage;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
/* compiled from: CollectorBase.java */
/* renamed from: tc1  reason: default package */
/* loaded from: classes2.dex */
class tc1 {
    protected static final rl[] b = new rl[0];
    protected static final Annotation[] c = new Annotation[0];
    protected final ql a;

    /* JADX INFO: Access modifiers changed from: protected */
    public tc1(ql qlVar) {
        this.a = qlVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static rl a() {
        return new rl();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static rl[] b(int i) {
        if (i == 0) {
            return b;
        }
        rl[] rlVarArr = new rl[i];
        for (int i2 = 0; i2 < i; i2++) {
            rlVarArr[i2] = a();
        }
        return rlVarArr;
    }

    protected static final boolean c(Annotation annotation) {
        if (!(annotation instanceof Target) && !(annotation instanceof Retention)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final pl d(pl plVar, Annotation[] annotationArr) {
        for (Annotation annotation : annotationArr) {
            plVar = plVar.a(annotation);
            if (this.a.Q0(annotation)) {
                plVar = h(plVar, annotation);
            }
        }
        return plVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final pl e(Annotation[] annotationArr) {
        pl e = pl.e();
        for (Annotation annotation : annotationArr) {
            e = e.a(annotation);
            if (this.a.Q0(annotation)) {
                e = h(e, annotation);
            }
        }
        return e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final pl f(pl plVar, Annotation[] annotationArr) {
        for (Annotation annotation : annotationArr) {
            if (!plVar.f(annotation)) {
                plVar = plVar.a(annotation);
                if (this.a.Q0(annotation)) {
                    plVar = g(plVar, annotation);
                }
            }
        }
        return plVar;
    }

    protected final pl g(pl plVar, Annotation annotation) {
        Annotation[] o;
        for (Annotation annotation2 : q81.o(annotation.annotationType())) {
            if (!c(annotation2) && !plVar.f(annotation2)) {
                plVar = plVar.a(annotation2);
                if (this.a.Q0(annotation2)) {
                    plVar = h(plVar, annotation2);
                }
            }
        }
        return plVar;
    }

    protected final pl h(pl plVar, Annotation annotation) {
        Annotation[] o;
        for (Annotation annotation2 : q81.o(annotation.annotationType())) {
            if (!c(annotation2)) {
                if (this.a.Q0(annotation2)) {
                    if (!plVar.f(annotation2)) {
                        plVar = h(plVar.a(annotation2), annotation2);
                    }
                } else {
                    plVar = plVar.a(annotation2);
                }
            }
        }
        return plVar;
    }
}
