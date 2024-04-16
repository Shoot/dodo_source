package defpackage;

import android.graphics.Paint;
import android.graphics.PathEffect;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import defpackage.q0b;
import defpackage.s0b;
import kotlin.Metadata;
/* compiled from: DrawStyleSpan.android.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0005\u001a\u00020\u0004*\u00020\u0003H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u00020\b*\u00020\u0007H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016R\u0017\u0010\u0013\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\t\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"La83;", "Landroid/text/style/CharacterStyle;", "Landroid/text/style/UpdateAppearance;", "Ls0b;", "Landroid/graphics/Paint$Join;", "b", "(I)Landroid/graphics/Paint$Join;", "Lq0b;", "Landroid/graphics/Paint$Cap;", "a", "(I)Landroid/graphics/Paint$Cap;", "Landroid/text/TextPaint;", "textPaint", "", "updateDrawState", "Lz73;", "Lz73;", "getDrawStyle", "()Lz73;", "drawStyle", "<init>", "(Lz73;)V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: a83  reason: default package */
/* loaded from: classes.dex */
public final class a83 extends CharacterStyle implements UpdateAppearance {
    private final z73 a;

    public a83(z73 z73Var) {
        z65.h(z73Var, "drawStyle");
        this.a = z73Var;
    }

    private final Paint.Cap a(int i) {
        q0b.a aVar = q0b.b;
        if (q0b.g(i, aVar.a())) {
            return Paint.Cap.BUTT;
        }
        if (q0b.g(i, aVar.b())) {
            return Paint.Cap.ROUND;
        }
        if (q0b.g(i, aVar.c())) {
            return Paint.Cap.SQUARE;
        }
        return Paint.Cap.BUTT;
    }

    private final Paint.Join b(int i) {
        s0b.a aVar = s0b.b;
        if (s0b.g(i, aVar.b())) {
            return Paint.Join.MITER;
        }
        if (s0b.g(i, aVar.c())) {
            return Paint.Join.ROUND;
        }
        if (s0b.g(i, aVar.a())) {
            return Paint.Join.BEVEL;
        }
        return Paint.Join.MITER;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        PathEffect pathEffect;
        if (textPaint != null) {
            z73 z73Var = this.a;
            if (z65.c(z73Var, uu3.a)) {
                textPaint.setStyle(Paint.Style.FILL);
            } else if (z73Var instanceof p0b) {
                textPaint.setStyle(Paint.Style.STROKE);
                textPaint.setStrokeWidth(((p0b) this.a).e());
                textPaint.setStrokeMiter(((p0b) this.a).c());
                textPaint.setStrokeJoin(b(((p0b) this.a).b()));
                textPaint.setStrokeCap(a(((p0b) this.a).a()));
                rr7 d = ((p0b) this.a).d();
                if (d != null) {
                    pathEffect = gi.a(d);
                } else {
                    pathEffect = null;
                }
                textPaint.setPathEffect(pathEffect);
            }
        }
    }
}
