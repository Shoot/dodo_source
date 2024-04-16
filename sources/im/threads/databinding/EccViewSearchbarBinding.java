package im.threads.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import im.threads.R;
import im.threads.ui.widget.CustomFontEditText;
/* loaded from: classes3.dex */
public final class EccViewSearchbarBinding {
    @NonNull
    private final ConstraintLayout rootView;
    @NonNull
    public final ImageButton searchClearButton;
    @NonNull
    public final CustomFontEditText searchInput;
    @NonNull
    public final ProgressBar searchProgressBar;

    private EccViewSearchbarBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ImageButton imageButton, @NonNull CustomFontEditText customFontEditText, @NonNull ProgressBar progressBar) {
        this.rootView = constraintLayout;
        this.searchClearButton = imageButton;
        this.searchInput = customFontEditText;
        this.searchProgressBar = progressBar;
    }

    @NonNull
    public static EccViewSearchbarBinding bind(@NonNull View view) {
        int i = R.id.searchClearButton;
        ImageButton imageButton = (ImageButton) pyb.a(view, i);
        if (imageButton != null) {
            i = R.id.searchInput;
            CustomFontEditText customFontEditText = (CustomFontEditText) pyb.a(view, i);
            if (customFontEditText != null) {
                i = R.id.searchProgressBar;
                ProgressBar progressBar = (ProgressBar) pyb.a(view, i);
                if (progressBar != null) {
                    return new EccViewSearchbarBinding((ConstraintLayout) view, imageButton, customFontEditText, progressBar);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static EccViewSearchbarBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static EccViewSearchbarBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.ecc_view_searchbar, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
