package im.threads.ui.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
/* loaded from: classes3.dex */
public final class SquareLayout extends FrameLayout {
    public SquareLayout(Context context) {
        super(context);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i);
    }

    public SquareLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SquareLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
