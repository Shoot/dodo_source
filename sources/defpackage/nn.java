package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.a0;
/* compiled from: AppCompatRatingBar.java */
/* renamed from: nn  reason: default package */
/* loaded from: classes.dex */
public class nn extends RatingBar {
    private final mn a;

    public nn(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, aw8.K);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Bitmap b = this.a.b();
        if (b != null) {
            setMeasuredDimension(View.resolveSizeAndState(b.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }

    public nn(@NonNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a0.a(this, getContext());
        mn mnVar = new mn(this);
        this.a = mnVar;
        mnVar.c(attributeSet, i);
    }
}
