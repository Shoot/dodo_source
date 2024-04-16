package im.threads.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import im.threads.R;
import im.threads.ui.views.SquareLayout;
import im.threads.ui.widget.CustomFontTextView;
/* loaded from: classes3.dex */
public final class EccItemGalleryBucketBinding {
    @NonNull
    public final CustomFontTextView bucketName;
    @NonNull
    public final ImageView image;
    @NonNull
    public final CustomFontTextView photosCount;
    @NonNull
    private final SquareLayout rootView;

    private EccItemGalleryBucketBinding(@NonNull SquareLayout squareLayout, @NonNull CustomFontTextView customFontTextView, @NonNull ImageView imageView, @NonNull CustomFontTextView customFontTextView2) {
        this.rootView = squareLayout;
        this.bucketName = customFontTextView;
        this.image = imageView;
        this.photosCount = customFontTextView2;
    }

    @NonNull
    public static EccItemGalleryBucketBinding bind(@NonNull View view) {
        int i = R.id.bucket_name;
        CustomFontTextView customFontTextView = (CustomFontTextView) pyb.a(view, i);
        if (customFontTextView != null) {
            i = R.id.image;
            ImageView imageView = (ImageView) pyb.a(view, i);
            if (imageView != null) {
                i = R.id.photos_count;
                CustomFontTextView customFontTextView2 = (CustomFontTextView) pyb.a(view, i);
                if (customFontTextView2 != null) {
                    return new EccItemGalleryBucketBinding((SquareLayout) view, customFontTextView, imageView, customFontTextView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static EccItemGalleryBucketBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public SquareLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static EccItemGalleryBucketBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.ecc_item_gallery_bucket, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
