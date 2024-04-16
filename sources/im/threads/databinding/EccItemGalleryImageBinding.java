package im.threads.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatCheckBox;
import im.threads.R;
import im.threads.ui.views.SquareLayout;
/* loaded from: classes3.dex */
public final class EccItemGalleryImageBinding {
    @NonNull
    public final AppCompatCheckBox checkbox;
    @NonNull
    public final ImageView image;
    @NonNull
    private final SquareLayout rootView;

    private EccItemGalleryImageBinding(@NonNull SquareLayout squareLayout, @NonNull AppCompatCheckBox appCompatCheckBox, @NonNull ImageView imageView) {
        this.rootView = squareLayout;
        this.checkbox = appCompatCheckBox;
        this.image = imageView;
    }

    @NonNull
    public static EccItemGalleryImageBinding bind(@NonNull View view) {
        int i = R.id.checkbox;
        AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) pyb.a(view, i);
        if (appCompatCheckBox != null) {
            i = R.id.image;
            ImageView imageView = (ImageView) pyb.a(view, i);
            if (imageView != null) {
                return new EccItemGalleryImageBinding((SquareLayout) view, appCompatCheckBox, imageView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static EccItemGalleryImageBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public SquareLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static EccItemGalleryImageBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.ecc_item_gallery_image, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
