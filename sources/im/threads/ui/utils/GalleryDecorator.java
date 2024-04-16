package im.threads.ui.utils;

import android.graphics.Rect;
import android.util.TypedValue;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
/* loaded from: classes3.dex */
public final class GalleryDecorator extends RecyclerView.o {
    private int offset;

    public GalleryDecorator(int i) {
        this.offset = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.a0 a0Var) {
        super.getItemOffsets(rect, view, recyclerView, a0Var);
        int applyDimension = (int) TypedValue.applyDimension(1, this.offset, view.getContext().getResources().getDisplayMetrics());
        if (recyclerView.getChildAdapterPosition(view) == 0) {
            rect.top += applyDimension;
            int i = applyDimension / 2;
            rect.bottom += i;
            rect.left += applyDimension;
            rect.right += i - (applyDimension / 4);
        } else if (recyclerView.getChildAdapterPosition(view) == 1) {
            rect.top += applyDimension;
            int i2 = applyDimension / 2;
            rect.bottom += i2;
            int i3 = i2 + (applyDimension / 6);
            rect.left += i3;
            rect.right += i3;
        } else if (recyclerView.getChildAdapterPosition(view) == 2) {
            rect.top += applyDimension;
            int i4 = applyDimension / 2;
            rect.bottom += i4;
            rect.left += i4 - (applyDimension / 4);
            rect.right += applyDimension;
        } else if (recyclerView.getChildAdapterPosition(view) % 3 == 0) {
            rect.left += applyDimension;
            int i5 = applyDimension / 2;
            rect.right += i5 - (applyDimension / 4);
            rect.top += i5;
            rect.bottom += i5;
        } else if ((recyclerView.getChildAdapterPosition(view) - 1) % 3 == 0) {
            int i6 = applyDimension / 2;
            int i7 = (applyDimension / 6) + i6;
            rect.left += i7;
            rect.right += i7;
            rect.top += i6;
            rect.bottom += i6;
        } else {
            int i8 = applyDimension / 2;
            rect.left += i8 - (applyDimension / 4);
            rect.right += applyDimension;
            rect.top += i8;
            rect.bottom += i8;
        }
    }
}
