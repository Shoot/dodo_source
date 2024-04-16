package im.threads.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import im.threads.R;
/* loaded from: classes3.dex */
public final class EccRatingStarBinding {
    @NonNull
    private final ImageView rootView;
    @NonNull
    public final ImageView star;

    private EccRatingStarBinding(@NonNull ImageView imageView, @NonNull ImageView imageView2) {
        this.rootView = imageView;
        this.star = imageView2;
    }

    @NonNull
    public static EccRatingStarBinding bind(@NonNull View view) {
        if (view != null) {
            ImageView imageView = (ImageView) view;
            return new EccRatingStarBinding(imageView, imageView);
        }
        throw new NullPointerException("rootView");
    }

    @NonNull
    public static EccRatingStarBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public ImageView getRoot() {
        return this.rootView;
    }

    @NonNull
    public static EccRatingStarBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.ecc_rating_star, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
