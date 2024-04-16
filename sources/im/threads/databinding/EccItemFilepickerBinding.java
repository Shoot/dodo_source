package im.threads.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import im.threads.R;
import im.threads.ui.widget.CustomFontTextView;
/* loaded from: classes3.dex */
public final class EccItemFilepickerBinding {
    @NonNull
    private final CustomFontTextView rootView;
    @NonNull
    public final CustomFontTextView text;

    private EccItemFilepickerBinding(@NonNull CustomFontTextView customFontTextView, @NonNull CustomFontTextView customFontTextView2) {
        this.rootView = customFontTextView;
        this.text = customFontTextView2;
    }

    @NonNull
    public static EccItemFilepickerBinding bind(@NonNull View view) {
        if (view != null) {
            CustomFontTextView customFontTextView = (CustomFontTextView) view;
            return new EccItemFilepickerBinding(customFontTextView, customFontTextView);
        }
        throw new NullPointerException("rootView");
    }

    @NonNull
    public static EccItemFilepickerBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public CustomFontTextView getRoot() {
        return this.rootView;
    }

    @NonNull
    public static EccItemFilepickerBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.ecc_item_filepicker, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
