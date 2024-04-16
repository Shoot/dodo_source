package im.threads.ui.utils;

import android.graphics.Rect;
import android.util.TypedValue;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
/* loaded from: classes3.dex */
public final class BucketsGalleryDecorator extends RecyclerView.o {
    private int offset;

    public BucketsGalleryDecorator(int i) {
        this.offset = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.a0 a0Var) {
        super.getItemOffsets(rect, view, recyclerView, a0Var);
        int applyDimension = (int) TypedValue.applyDimension(1, this.offset, view.getContext().getResources().getDisplayMetrics());
        if (recyclerView.getChildAdapterPosition(view) == 0) {
            int i = applyDimension / 2;
            rect.bottom += i;
            rect.left += applyDimension;
            rect.right += i;
        } else if (recyclerView.getChildAdapterPosition(view) == 1) {
            int i2 = applyDimension / 2;
            rect.bottom += i2;
            rect.left += i2;
            rect.right += applyDimension;
        } else if (recyclerView.getChildAdapterPosition(view) % 2 == 0) {
            int i3 = applyDimension / 2;
            rect.top += i3;
            rect.bottom += i3;
            rect.left += applyDimension;
            rect.right += i3;
        } else {
            int i4 = applyDimension / 2;
            rect.top += i4;
            rect.bottom += i4;
            rect.left += i4;
            rect.right += applyDimension;
        }
    }
}
