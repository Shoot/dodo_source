package im.threads.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.Toolbar;
import im.threads.R;
import im.threads.ui.widget.CustomFontTextView;
/* loaded from: classes3.dex */
public final class EccActivityConsultPageBinding {
    @NonNull
    public final ImageView consultImage;
    @NonNull
    public final CustomFontTextView consultStatus;
    @NonNull
    public final CustomFontTextView consultTitle;
    @NonNull
    private final RelativeLayout rootView;
    @NonNull
    public final Toolbar toolbar;

    private EccActivityConsultPageBinding(@NonNull RelativeLayout relativeLayout, @NonNull ImageView imageView, @NonNull CustomFontTextView customFontTextView, @NonNull CustomFontTextView customFontTextView2, @NonNull Toolbar toolbar) {
        this.rootView = relativeLayout;
        this.consultImage = imageView;
        this.consultStatus = customFontTextView;
        this.consultTitle = customFontTextView2;
        this.toolbar = toolbar;
    }

    @NonNull
    public static EccActivityConsultPageBinding bind(@NonNull View view) {
        int i = R.id.consultImage;
        ImageView imageView = (ImageView) pyb.a(view, i);
        if (imageView != null) {
            i = R.id.consult_status;
            CustomFontTextView customFontTextView = (CustomFontTextView) pyb.a(view, i);
            if (customFontTextView != null) {
                i = R.id.consultTitle;
                CustomFontTextView customFontTextView2 = (CustomFontTextView) pyb.a(view, i);
                if (customFontTextView2 != null) {
                    i = R.id.toolbar;
                    Toolbar toolbar = (Toolbar) pyb.a(view, i);
                    if (toolbar != null) {
                        return new EccActivityConsultPageBinding((RelativeLayout) view, imageView, customFontTextView, customFontTextView2, toolbar);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static EccActivityConsultPageBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static EccActivityConsultPageBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.ecc_activity_consult_page, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
