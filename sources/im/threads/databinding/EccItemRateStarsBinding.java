package im.threads.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import im.threads.R;
import im.threads.ui.widget.Rating;
import im.threads.ui.widget.textView.BubbleMessageTextView;
/* loaded from: classes3.dex */
public final class EccItemRateStarsBinding {
    @NonNull
    public final BubbleMessageTextView askForRate;
    @NonNull
    public final Rating mark;
    @NonNull
    private final LinearLayout rootView;
    @NonNull
    public final BubbleMessageTextView thanksForRate;

    private EccItemRateStarsBinding(@NonNull LinearLayout linearLayout, @NonNull BubbleMessageTextView bubbleMessageTextView, @NonNull Rating rating, @NonNull BubbleMessageTextView bubbleMessageTextView2) {
        this.rootView = linearLayout;
        this.askForRate = bubbleMessageTextView;
        this.mark = rating;
        this.thanksForRate = bubbleMessageTextView2;
    }

    @NonNull
    public static EccItemRateStarsBinding bind(@NonNull View view) {
        int i = R.id.ask_for_rate;
        BubbleMessageTextView bubbleMessageTextView = (BubbleMessageTextView) pyb.a(view, i);
        if (bubbleMessageTextView != null) {
            i = R.id.mark;
            Rating rating = (Rating) pyb.a(view, i);
            if (rating != null) {
                i = R.id.thanks_for_rate;
                BubbleMessageTextView bubbleMessageTextView2 = (BubbleMessageTextView) pyb.a(view, i);
                if (bubbleMessageTextView2 != null) {
                    return new EccItemRateStarsBinding((LinearLayout) view, bubbleMessageTextView, rating, bubbleMessageTextView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static EccItemRateStarsBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static EccItemRateStarsBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.ecc_item_rate_stars, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
