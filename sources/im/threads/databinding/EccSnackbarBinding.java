package im.threads.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import im.threads.R;
import im.threads.ui.widget.textView.ToolbarTitleTextView;
/* loaded from: classes3.dex */
public final class EccSnackbarBinding {
    @NonNull
    public final ImageView background;
    @NonNull
    public final ToolbarTitleTextView message;
    @NonNull
    private final FrameLayout rootView;

    private EccSnackbarBinding(@NonNull FrameLayout frameLayout, @NonNull ImageView imageView, @NonNull ToolbarTitleTextView toolbarTitleTextView) {
        this.rootView = frameLayout;
        this.background = imageView;
        this.message = toolbarTitleTextView;
    }

    @NonNull
    public static EccSnackbarBinding bind(@NonNull View view) {
        int i = R.id.background;
        ImageView imageView = (ImageView) pyb.a(view, i);
        if (imageView != null) {
            i = R.id.message;
            ToolbarTitleTextView toolbarTitleTextView = (ToolbarTitleTextView) pyb.a(view, i);
            if (toolbarTitleTextView != null) {
                return new EccSnackbarBinding((FrameLayout) view, imageView, toolbarTitleTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static EccSnackbarBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public FrameLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static EccSnackbarBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.ecc_snackbar, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
