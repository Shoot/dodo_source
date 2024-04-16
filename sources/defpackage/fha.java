package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import androidx.annotation.NonNull;
import com.airbnb.lottie.n;
import java.util.Collections;
import java.util.List;
/* compiled from: ShapeLayer.java */
/* renamed from: fha  reason: default package */
/* loaded from: classes.dex */
public class fha extends v70 {
    private final jt1 D;
    private final ko1 E;

    /* JADX INFO: Access modifiers changed from: package-private */
    public fha(n nVar, em5 em5Var, ko1 ko1Var) {
        super(nVar, em5Var);
        this.E = ko1Var;
        jt1 jt1Var = new jt1(nVar, this, new cha("__container", em5Var.n(), false));
        this.D = jt1Var;
        jt1Var.b(Collections.emptyList(), Collections.emptyList());
    }

    @Override // defpackage.v70
    protected void H(of5 of5Var, int i, List<of5> list, of5 of5Var2) {
        this.D.g(of5Var, i, list, of5Var2);
    }

    @Override // defpackage.v70, defpackage.y83
    public void d(RectF rectF, Matrix matrix, boolean z) {
        super.d(rectF, matrix, z);
        this.D.d(rectF, this.o, z);
    }

    @Override // defpackage.v70
    void t(@NonNull Canvas canvas, Matrix matrix, int i) {
        this.D.h(canvas, matrix, i);
    }

    @Override // defpackage.v70
    public ae0 v() {
        ae0 v = super.v();
        if (v != null) {
            return v;
        }
        return this.E.v();
    }

    @Override // defpackage.v70
    public e93 x() {
        e93 x = super.x();
        if (x != null) {
            return x;
        }
        return this.E.x();
    }
}
