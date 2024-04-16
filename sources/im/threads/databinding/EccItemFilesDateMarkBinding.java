package im.threads.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import im.threads.R;
import im.threads.ui.widget.CustomFontTextView;
/* loaded from: classes3.dex */
public final class EccItemFilesDateMarkBinding {
    @NonNull
    public final LinearLayout line;
    @NonNull
    private final LinearLayout rootView;
    @NonNull
    public final CustomFontTextView text;

    private EccItemFilesDateMarkBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull CustomFontTextView customFontTextView) {
        this.rootView = linearLayout;
        this.line = linearLayout2;
        this.text = customFontTextView;
    }

    @NonNull
    public static EccItemFilesDateMarkBinding bind(@NonNull View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i = R.id.text;
        CustomFontTextView customFontTextView = (CustomFontTextView) pyb.a(view, i);
        if (customFontTextView != null) {
            return new EccItemFilesDateMarkBinding(linearLayout, linearLayout, customFontTextView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static EccItemFilesDateMarkBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static EccItemFilesDateMarkBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.ecc_item_files_date_mark, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
