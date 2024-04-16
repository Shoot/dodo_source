package im.threads.ui.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
/* loaded from: classes3.dex */
public class MaxHeightRecyclerView extends RecyclerView {
    private int maxHeight;

    public MaxHeightRecyclerView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onMeasure(int i, int i2) {
        if (this.maxHeight > 0) {
            int size = View.MeasureSpec.getSize(i2);
            int mode = View.MeasureSpec.getMode(i2);
            if (mode != Integer.MIN_VALUE) {
                if (mode != 0) {
                    if (mode == 1073741824) {
                        i2 = View.MeasureSpec.makeMeasureSpec(Math.min(size, this.maxHeight), 1073741824);
                    }
                } else {
                    i2 = View.MeasureSpec.makeMeasureSpec(this.maxHeight, Integer.MIN_VALUE);
                }
            } else {
                i2 = View.MeasureSpec.makeMeasureSpec(Math.min(size, this.maxHeight), Integer.MIN_VALUE);
            }
        }
        super.onMeasure(i, i2);
    }

    public void setMaxHeight(int i) {
        this.maxHeight = i;
    }

    public MaxHeightRecyclerView(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MaxHeightRecyclerView(@NonNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
