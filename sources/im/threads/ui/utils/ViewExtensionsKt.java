package im.threads.ui.utils;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
/* compiled from: ViewExtensions.kt */
@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\"\u00020\u0004¢\u0006\u0002\u0010\u0005\u001a\u001f\u0010\u0006\u001a\u00020\u00012\u0012\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\"\u00020\u0004¢\u0006\u0002\u0010\u0005\u001a\u001f\u0010\u0007\u001a\u00020\u00012\u0012\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\"\u00020\u0004¢\u0006\u0002\u0010\u0005\u001a\u0012\u0010\b\u001a\u00020\t*\u00020\n2\u0006\u0010\u000b\u001a\u00020\f\u001a\u0012\u0010\r\u001a\u00020\t*\u00020\n2\u0006\u0010\u000e\u001a\u00020\t\u001a\n\u0010\u000f\u001a\u00020\t*\u00020\u0004\u001a\f\u0010\u0010\u001a\u00020\u0001*\u0004\u0018\u00010\u0004\u001a\f\u0010\u0011\u001a\u00020\u0001*\u0004\u0018\u00010\u0004\u001a\f\u0010\u0012\u001a\u00020\u0013*\u0004\u0018\u00010\u0004\u001a\f\u0010\u0014\u001a\u00020\u0013*\u0004\u0018\u00010\u0004\u001a\f\u0010\u0015\u001a\u00020\u0001*\u0004\u0018\u00010\u0004¨\u0006\u0016"}, d2 = {"goneViews", "", "views", "", "Landroid/view/View;", "([Landroid/view/View;)V", "hideViews", "showViews", "dpToPx", "", "Landroid/content/Context;", "dp", "", "fromPxToDp", "px", "getWidthInDp", "gone", "invisible", "isNotVisible", "", "isVisible", "visible", "threads_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ViewExtensionsKt {
    public static final float dpToPx(Context context, int i) {
        z65.h(context, "<this>");
        return TypedValue.applyDimension(1, i, context.getResources().getDisplayMetrics());
    }

    public static final float fromPxToDp(Context context, float f) {
        z65.h(context, "<this>");
        return f / context.getResources().getDisplayMetrics().density;
    }

    public static final float getWidthInDp(View view) {
        z65.h(view, "<this>");
        Context context = view.getContext();
        z65.g(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        return fromPxToDp(context, view.getWidth());
    }

    public static final void gone(View view) {
        if (view != null) {
            view.setVisibility(8);
        }
    }

    public static final void goneViews(View... viewArr) {
        z65.h(viewArr, "views");
        for (View view : viewArr) {
            gone(view);
        }
    }

    public static final void hideViews(View... viewArr) {
        z65.h(viewArr, "views");
        for (View view : viewArr) {
            invisible(view);
        }
    }

    public static final void invisible(View view) {
        if (view != null) {
            view.setVisibility(4);
        }
    }

    public static final boolean isNotVisible(View view) {
        if (view != null && view.getVisibility() == 0) {
            return false;
        }
        return true;
    }

    public static final boolean isVisible(View view) {
        if (view == null || view.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    public static final void showViews(View... viewArr) {
        z65.h(viewArr, "views");
        for (View view : viewArr) {
            visible(view);
        }
    }

    public static final void visible(View view) {
        if (view != null) {
            view.setVisibility(0);
        }
    }
}
