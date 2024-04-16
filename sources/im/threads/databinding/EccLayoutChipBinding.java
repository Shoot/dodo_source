package im.threads.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import im.threads.R;
import im.threads.ui.widget.CustomFontTextView;
/* loaded from: classes3.dex */
public final class EccLayoutChipBinding {
    @NonNull
    public final CustomFontTextView chip;
    @NonNull
    private final FrameLayout rootView;

    private EccLayoutChipBinding(@NonNull FrameLayout frameLayout, @NonNull CustomFontTextView customFontTextView) {
        this.rootView = frameLayout;
        this.chip = customFontTextView;
    }

    @NonNull
    public static EccLayoutChipBinding bind(@NonNull View view) {
        int i = R.id.chip;
        CustomFontTextView customFontTextView = (CustomFontTextView) pyb.a(view, i);
        if (customFontTextView != null) {
            return new EccLayoutChipBinding((FrameLayout) view, customFontTextView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static EccLayoutChipBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public FrameLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static EccLayoutChipBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.ecc_layout_chip, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
