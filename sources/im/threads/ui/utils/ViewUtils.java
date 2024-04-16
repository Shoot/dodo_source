package im.threads.ui.utils;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/* loaded from: classes3.dex */
public final class ViewUtils {

    @Target({ElementType.FIELD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface DrawablePosition {
        public static final int BOTTOM = 3;
        public static final int LEFT = 0;
        public static final int RIGHT = 2;
        public static final int TOP = 1;
    }

    public void removeClickListener(ViewGroup viewGroup) {
        viewGroup.setOnLongClickListener(null);
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            if (viewGroup.getChildAt(i) instanceof ViewGroup) {
                removeClickListener((ViewGroup) viewGroup.getChildAt(i));
            } else if (viewGroup.getChildAt(i) != null) {
                viewGroup.getChildAt(i).setOnLongClickListener(null);
            }
        }
    }

    public void setClickListener(ViewGroup viewGroup, View.OnClickListener onClickListener) {
        viewGroup.setOnClickListener(onClickListener);
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            if (viewGroup.getChildAt(i) instanceof ViewGroup) {
                setClickListener((ViewGroup) viewGroup.getChildAt(i), onClickListener);
            } else if (viewGroup.getChildAt(i) != null) {
                viewGroup.getChildAt(i).setOnClickListener(onClickListener);
            }
        }
    }

    public void setCompoundDrawablesWithIntrinsicBoundsCompat(TextView textView, int i, int i2) {
        Drawable drawable;
        Drawable drawable2;
        Drawable drawable3;
        Drawable b = on.b(textView.getContext(), i);
        if (i2 == 0) {
            drawable = b;
        } else {
            drawable = null;
        }
        if (i2 == 1) {
            drawable2 = b;
        } else {
            drawable2 = null;
        }
        if (i2 == 2) {
            drawable3 = b;
        } else {
            drawable3 = null;
        }
        if (i2 != 3) {
            b = null;
        }
        textView.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, b);
    }

    public void setClickListener(ViewGroup viewGroup, View.OnLongClickListener onLongClickListener) {
        viewGroup.setOnLongClickListener(onLongClickListener);
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            if (viewGroup.getChildAt(i) instanceof ViewGroup) {
                setClickListener((ViewGroup) viewGroup.getChildAt(i), onLongClickListener);
            } else if (viewGroup.getChildAt(i) != null) {
                viewGroup.getChildAt(i).setOnLongClickListener(onLongClickListener);
            }
        }
    }
}
