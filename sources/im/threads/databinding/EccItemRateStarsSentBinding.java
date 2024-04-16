package im.threads.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import im.threads.R;
import im.threads.ui.widget.textView.BubbleMessageTextView;
import im.threads.ui.widget.textView.BubbleTimeTextView;
/* loaded from: classes3.dex */
public final class EccItemRateStarsSentBinding {
    @NonNull
    public final RelativeLayout bubble;
    @NonNull
    public final BubbleMessageTextView from;
    @NonNull
    public final BubbleMessageTextView header;
    @NonNull
    public final LinearLayout imageLayout;
    @NonNull
    public final BubbleMessageTextView rateStarsCount;
    @NonNull
    private final RelativeLayout rootView;
    @NonNull
    public final ImageView star;
    @NonNull
    public final BubbleTimeTextView timestamp;
    @NonNull
    public final BubbleMessageTextView totalStarsCount;

    private EccItemRateStarsSentBinding(@NonNull RelativeLayout relativeLayout, @NonNull RelativeLayout relativeLayout2, @NonNull BubbleMessageTextView bubbleMessageTextView, @NonNull BubbleMessageTextView bubbleMessageTextView2, @NonNull LinearLayout linearLayout, @NonNull BubbleMessageTextView bubbleMessageTextView3, @NonNull ImageView imageView, @NonNull BubbleTimeTextView bubbleTimeTextView, @NonNull BubbleMessageTextView bubbleMessageTextView4) {
        this.rootView = relativeLayout;
        this.bubble = relativeLayout2;
        this.from = bubbleMessageTextView;
        this.header = bubbleMessageTextView2;
        this.imageLayout = linearLayout;
        this.rateStarsCount = bubbleMessageTextView3;
        this.star = imageView;
        this.timestamp = bubbleTimeTextView;
        this.totalStarsCount = bubbleMessageTextView4;
    }

    @NonNull
    public static EccItemRateStarsSentBinding bind(@NonNull View view) {
        int i = R.id.bubble;
        RelativeLayout relativeLayout = (RelativeLayout) pyb.a(view, i);
        if (relativeLayout != null) {
            i = R.id.from;
            BubbleMessageTextView bubbleMessageTextView = (BubbleMessageTextView) pyb.a(view, i);
            if (bubbleMessageTextView != null) {
                i = R.id.header;
                BubbleMessageTextView bubbleMessageTextView2 = (BubbleMessageTextView) pyb.a(view, i);
                if (bubbleMessageTextView2 != null) {
                    i = R.id.image_layout;
                    LinearLayout linearLayout = (LinearLayout) pyb.a(view, i);
                    if (linearLayout != null) {
                        i = R.id.rate_stars_count;
                        BubbleMessageTextView bubbleMessageTextView3 = (BubbleMessageTextView) pyb.a(view, i);
                        if (bubbleMessageTextView3 != null) {
                            i = R.id.star;
                            ImageView imageView = (ImageView) pyb.a(view, i);
                            if (imageView != null) {
                                i = R.id.timestamp;
                                BubbleTimeTextView bubbleTimeTextView = (BubbleTimeTextView) pyb.a(view, i);
                                if (bubbleTimeTextView != null) {
                                    i = R.id.total_stars_count;
                                    BubbleMessageTextView bubbleMessageTextView4 = (BubbleMessageTextView) pyb.a(view, i);
                                    if (bubbleMessageTextView4 != null) {
                                        return new EccItemRateStarsSentBinding((RelativeLayout) view, relativeLayout, bubbleMessageTextView, bubbleMessageTextView2, linearLayout, bubbleMessageTextView3, imageView, bubbleTimeTextView, bubbleMessageTextView4);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static EccItemRateStarsSentBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static EccItemRateStarsSentBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.ecc_item_rate_stars_sent, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
