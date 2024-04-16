package im.threads.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import im.threads.R;
import im.threads.ui.widget.CustomFontTextView;
/* loaded from: classes3.dex */
public final class EccItemSearchResultBinding {
    @NonNull
    public final ImageView avatarImage;
    @NonNull
    public final View clickableView;
    @NonNull
    public final CustomFontTextView dateTextView;
    @NonNull
    public final View dividerView;
    @NonNull
    public final CustomFontTextView messageTextView;
    @NonNull
    public final CustomFontTextView nameTextView;
    @NonNull
    public final ImageView rightArrowImageView;
    @NonNull
    private final ConstraintLayout rootView;

    private EccItemSearchResultBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull View view, @NonNull CustomFontTextView customFontTextView, @NonNull View view2, @NonNull CustomFontTextView customFontTextView2, @NonNull CustomFontTextView customFontTextView3, @NonNull ImageView imageView2) {
        this.rootView = constraintLayout;
        this.avatarImage = imageView;
        this.clickableView = view;
        this.dateTextView = customFontTextView;
        this.dividerView = view2;
        this.messageTextView = customFontTextView2;
        this.nameTextView = customFontTextView3;
        this.rightArrowImageView = imageView2;
    }

    @NonNull
    public static EccItemSearchResultBinding bind(@NonNull View view) {
        View a;
        View a2;
        int i = R.id.avatarImage;
        ImageView imageView = (ImageView) pyb.a(view, i);
        if (imageView != null && (a = pyb.a(view, (i = R.id.clickableView))) != null) {
            i = R.id.dateTextView;
            CustomFontTextView customFontTextView = (CustomFontTextView) pyb.a(view, i);
            if (customFontTextView != null && (a2 = pyb.a(view, (i = R.id.dividerView))) != null) {
                i = R.id.messageTextView;
                CustomFontTextView customFontTextView2 = (CustomFontTextView) pyb.a(view, i);
                if (customFontTextView2 != null) {
                    i = R.id.nameTextView;
                    CustomFontTextView customFontTextView3 = (CustomFontTextView) pyb.a(view, i);
                    if (customFontTextView3 != null) {
                        i = R.id.rightArrowImageView;
                        ImageView imageView2 = (ImageView) pyb.a(view, i);
                        if (imageView2 != null) {
                            return new EccItemSearchResultBinding((ConstraintLayout) view, imageView, a, customFontTextView, a2, customFontTextView2, customFontTextView3, imageView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static EccItemSearchResultBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static EccItemSearchResultBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.ecc_item_search_result, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
