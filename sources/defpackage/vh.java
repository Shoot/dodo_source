package defpackage;

import android.graphics.Matrix;
import android.graphics.Shader;
import java.util.List;
import kotlin.Metadata;
/* compiled from: AndroidMultiParagraphDraw.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u001aa\u0010\u0010\u001a\u00020\u000f*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001aW\u0010\u0012\u001a\u00020\u000f*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0011\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Lrp6;", "Lqn0;", "canvas", "Lmg0;", "brush", "", "alpha", "Loga;", "shadow", "Lkab;", "decoration", "Lz73;", "drawStyle", "Lpc0;", "blendMode", "", "a", "(Lrp6;Lqn0;Lmg0;FLoga;Lkab;Lz73;I)V", "b", "ui-text_release"}, k = 2, mv = {1, 8, 0})
/* renamed from: vh  reason: default package */
/* loaded from: classes.dex */
public final class vh {
    public static final void a(rp6 rp6Var, qn0 qn0Var, mg0 mg0Var, float f, oga ogaVar, kab kabVar, z73 z73Var, int i) {
        z65.h(rp6Var, "$this$drawMultiParagraph");
        z65.h(qn0Var, "canvas");
        z65.h(mg0Var, "brush");
        qn0Var.l();
        if (rp6Var.p().size() <= 1) {
            b(rp6Var, qn0Var, mg0Var, f, ogaVar, kabVar, z73Var, i);
        } else if (mg0Var instanceof jqa) {
            b(rp6Var, qn0Var, mg0Var, f, ogaVar, kabVar, z73Var, i);
        } else if (mg0Var instanceof mga) {
            List<cq7> p = rp6Var.p();
            int size = p.size();
            float f2 = 0.0f;
            float f3 = 0.0f;
            for (int i2 = 0; i2 < size; i2++) {
                cq7 cq7Var = p.get(i2);
                f3 += cq7Var.e().getHeight();
                f2 = Math.max(f2, cq7Var.e().getWidth());
            }
            Shader b = ((mga) mg0Var).b(ina.a(f2, f3));
            Matrix matrix = new Matrix();
            b.getLocalMatrix(matrix);
            List<cq7> p2 = rp6Var.p();
            int size2 = p2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                cq7 cq7Var2 = p2.get(i3);
                cq7Var2.e().j(qn0Var, ng0.a(b), f, ogaVar, kabVar, z73Var, i);
                qn0Var.a(0.0f, cq7Var2.e().getHeight());
                matrix.setTranslate(0.0f, -cq7Var2.e().getHeight());
                b.setLocalMatrix(matrix);
            }
        }
        qn0Var.g();
    }

    private static final void b(rp6 rp6Var, qn0 qn0Var, mg0 mg0Var, float f, oga ogaVar, kab kabVar, z73 z73Var, int i) {
        List<cq7> p = rp6Var.p();
        int size = p.size();
        for (int i2 = 0; i2 < size; i2++) {
            cq7 cq7Var = p.get(i2);
            cq7Var.e().j(qn0Var, mg0Var, f, ogaVar, kabVar, z73Var, i);
            qn0Var.a(0.0f, cq7Var.e().getHeight());
        }
    }
}
