package im.threads.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import im.threads.R;
import im.threads.ui.widget.textView.BubbleMessageTextView;
/* loaded from: classes3.dex */
public final class EccItemRateThumbsBinding {
    @NonNull
    public final BubbleMessageTextView askForRate;
    @NonNull
    private final LinearLayout rootView;
    @NonNull
    public final BubbleMessageTextView thanksForRate;
    @NonNull
    public final ImageView thumbDown;
    @NonNull
    public final ImageView thumbUp;

    private EccItemRateThumbsBinding(@NonNull LinearLayout linearLayout, @NonNull BubbleMessageTextView bubbleMessageTextView, @NonNull BubbleMessageTextView bubbleMessageTextView2, @NonNull ImageView imageView, @NonNull ImageView imageView2) {
        this.rootView = linearLayout;
        this.askForRate = bubbleMessageTextView;
        this.thanksForRate = bubbleMessageTextView2;
        this.thumbDown = imageView;
        this.thumbUp = imageView2;
    }

    @NonNull
    public static EccItemRateThumbsBinding bind(@NonNull View view) {
        int i = R.id.ask_for_rate;
        BubbleMessageTextView bubbleMessageTextView = (BubbleMessageTextView) pyb.a(view, i);
        if (bubbleMessageTextView != null) {
            i = R.id.thanks_for_rate;
            BubbleMessageTextView bubbleMessageTextView2 = (BubbleMessageTextView) pyb.a(view, i);
            if (bubbleMessageTextView2 != null) {
                i = R.id.thumb_down;
                ImageView imageView = (ImageView) pyb.a(view, i);
                if (imageView != null) {
                    i = R.id.thumb_up;
                    ImageView imageView2 = (ImageView) pyb.a(view, i);
                    if (imageView2 != null) {
                        return new EccItemRateThumbsBinding((LinearLayout) view, bubbleMessageTextView, bubbleMessageTextView2, imageView, imageView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static EccItemRateThumbsBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static EccItemRateThumbsBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.ecc_item_rate_thumbs, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
