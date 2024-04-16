package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import androidx.appcompat.widget.AppCompatTextView;
/* compiled from: SquareTextView.java */
/* renamed from: psa  reason: default package */
/* loaded from: classes.dex */
public class psa extends AppCompatTextView {
    private int a;
    private int b;

    public psa(Context context) {
        super(context);
        this.a = 0;
        this.b = 0;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        canvas.translate(this.b / 2, this.a / 2);
        super.draw(canvas);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int max = Math.max(measuredWidth, measuredHeight);
        if (measuredWidth > measuredHeight) {
            this.a = measuredWidth - measuredHeight;
            this.b = 0;
        } else {
            this.a = 0;
            this.b = measuredHeight - measuredWidth;
        }
        setMeasuredDimension(max, max);
    }
}
