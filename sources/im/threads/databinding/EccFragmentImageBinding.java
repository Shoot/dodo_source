package im.threads.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import im.threads.R;
import im.threads.ui.widget.CustomFontTextView;
/* loaded from: classes3.dex */
public final class EccFragmentImageBinding {
    @NonNull
    public final CustomFontTextView date;
    @NonNull
    public final CustomFontTextView from;
    @NonNull
    public final ImageView image;
    @NonNull
    public final ImageView loader;
    @NonNull
    public final ImageView preview;
    @NonNull
    private final FrameLayout rootView;

    private EccFragmentImageBinding(@NonNull FrameLayout frameLayout, @NonNull CustomFontTextView customFontTextView, @NonNull CustomFontTextView customFontTextView2, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3) {
        this.rootView = frameLayout;
        this.date = customFontTextView;
        this.from = customFontTextView2;
        this.image = imageView;
        this.loader = imageView2;
        this.preview = imageView3;
    }

    @NonNull
    public static EccFragmentImageBinding bind(@NonNull View view) {
        int i = R.id.date;
        CustomFontTextView customFontTextView = (CustomFontTextView) pyb.a(view, i);
        if (customFontTextView != null) {
            i = R.id.from;
            CustomFontTextView customFontTextView2 = (CustomFontTextView) pyb.a(view, i);
            if (customFontTextView2 != null) {
                i = R.id.image;
                ImageView imageView = (ImageView) pyb.a(view, i);
                if (imageView != null) {
                    i = R.id.loader;
                    ImageView imageView2 = (ImageView) pyb.a(view, i);
                    if (imageView2 != null) {
                        i = R.id.preview;
                        ImageView imageView3 = (ImageView) pyb.a(view, i);
                        if (imageView3 != null) {
                            return new EccFragmentImageBinding((FrameLayout) view, customFontTextView, customFontTextView2, imageView, imageView2, imageView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static EccFragmentImageBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public FrameLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static EccFragmentImageBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.ecc_fragment_image, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
