package androidx.constraintlayout.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import ch.qos.logback.classic.spi.CallerData;
import defpackage.lr1;
/* compiled from: Placeholder.java */
/* loaded from: classes.dex */
public class f extends View {
    private int a;
    private View b;
    private int c;

    public void a(ConstraintLayout constraintLayout) {
        if (this.b == null) {
            return;
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) getLayoutParams();
        ConstraintLayout.b bVar2 = (ConstraintLayout.b) this.b.getLayoutParams();
        bVar2.u0.e1(0);
        lr1.b B = bVar.u0.B();
        lr1.b bVar3 = lr1.b.FIXED;
        if (B != bVar3) {
            bVar.u0.f1(bVar2.u0.U());
        }
        if (bVar.u0.R() != bVar3) {
            bVar.u0.G0(bVar2.u0.y());
        }
        bVar2.u0.e1(8);
    }

    public void b(ConstraintLayout constraintLayout) {
        if (this.a == -1 && !isInEditMode()) {
            setVisibility(this.c);
        }
        View findViewById = constraintLayout.findViewById(this.a);
        this.b = findViewById;
        if (findViewById != null) {
            ((ConstraintLayout.b) findViewById.getLayoutParams()).i0 = true;
            this.b.setVisibility(0);
            setVisibility(0);
        }
    }

    public View getContent() {
        return this.b;
    }

    public int getEmptyVisibility() {
        return this.c;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(223, 223, 223);
            Paint paint = new Paint();
            paint.setARGB(255, 210, 210, 210);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize(rect.height());
            int height = rect.height();
            int width = rect.width();
            paint.setTextAlign(Paint.Align.LEFT);
            paint.getTextBounds(CallerData.NA, 0, 1, rect);
            canvas.drawText(CallerData.NA, ((width / 2.0f) - (rect.width() / 2.0f)) - rect.left, ((height / 2.0f) + (rect.height() / 2.0f)) - rect.bottom, paint);
        }
    }

    public void setContentId(int i) {
        View findViewById;
        if (this.a == i) {
            return;
        }
        View view = this.b;
        if (view != null) {
            view.setVisibility(0);
            ((ConstraintLayout.b) this.b.getLayoutParams()).i0 = false;
            this.b = null;
        }
        this.a = i;
        if (i != -1 && (findViewById = ((View) getParent()).findViewById(i)) != null) {
            findViewById.setVisibility(8);
        }
    }

    public void setEmptyVisibility(int i) {
        this.c = i;
    }
}
