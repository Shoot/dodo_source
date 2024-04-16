package im.threads.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import im.threads.R;
import im.threads.ui.widget.textView.PlaceholderSubtitleTextView;
import im.threads.ui.widget.textView.PlaceholderTitleTextView;
/* loaded from: classes3.dex */
public final class EccViewWelcomeBinding {
    @NonNull
    public final LinearLayout rootLayout;
    @NonNull
    private final LinearLayout rootView;
    @NonNull
    public final ImageView welcomeLogo;
    @NonNull
    public final PlaceholderSubtitleTextView welcomeSubtitle;
    @NonNull
    public final PlaceholderTitleTextView welcomeTitle;

    private EccViewWelcomeBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull ImageView imageView, @NonNull PlaceholderSubtitleTextView placeholderSubtitleTextView, @NonNull PlaceholderTitleTextView placeholderTitleTextView) {
        this.rootView = linearLayout;
        this.rootLayout = linearLayout2;
        this.welcomeLogo = imageView;
        this.welcomeSubtitle = placeholderSubtitleTextView;
        this.welcomeTitle = placeholderTitleTextView;
    }

    @NonNull
    public static EccViewWelcomeBinding bind(@NonNull View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i = R.id.welcome_logo;
        ImageView imageView = (ImageView) pyb.a(view, i);
        if (imageView != null) {
            i = R.id.welcome_subtitle;
            PlaceholderSubtitleTextView placeholderSubtitleTextView = (PlaceholderSubtitleTextView) pyb.a(view, i);
            if (placeholderSubtitleTextView != null) {
                i = R.id.welcome_title;
                PlaceholderTitleTextView placeholderTitleTextView = (PlaceholderTitleTextView) pyb.a(view, i);
                if (placeholderTitleTextView != null) {
                    return new EccViewWelcomeBinding(linearLayout, linearLayout, imageView, placeholderSubtitleTextView, placeholderTitleTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static EccViewWelcomeBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static EccViewWelcomeBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.ecc_view_welcome, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
