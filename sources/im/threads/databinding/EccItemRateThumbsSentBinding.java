package im.threads.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import im.threads.R;
import im.threads.ui.widget.textView.BubbleMessageTextView;
import im.threads.ui.widget.textView.BubbleTimeTextView;
/* loaded from: classes3.dex */
public final class EccItemRateThumbsSentBinding {
    @NonNull
    public final RelativeLayout bubble;
    @NonNull
    public final BubbleMessageTextView header;
    @NonNull
    private final RelativeLayout rootView;
    @NonNull
    public final ImageView thumb;
    @NonNull
    public final BubbleTimeTextView timestamp;

    private EccItemRateThumbsSentBinding(@NonNull RelativeLayout relativeLayout, @NonNull RelativeLayout relativeLayout2, @NonNull BubbleMessageTextView bubbleMessageTextView, @NonNull ImageView imageView, @NonNull BubbleTimeTextView bubbleTimeTextView) {
        this.rootView = relativeLayout;
        this.bubble = relativeLayout2;
        this.header = bubbleMessageTextView;
        this.thumb = imageView;
        this.timestamp = bubbleTimeTextView;
    }

    @NonNull
    public static EccItemRateThumbsSentBinding bind(@NonNull View view) {
        int i = R.id.bubble;
        RelativeLayout relativeLayout = (RelativeLayout) pyb.a(view, i);
        if (relativeLayout != null) {
            i = R.id.header;
            BubbleMessageTextView bubbleMessageTextView = (BubbleMessageTextView) pyb.a(view, i);
            if (bubbleMessageTextView != null) {
                i = R.id.thumb;
                ImageView imageView = (ImageView) pyb.a(view, i);
                if (imageView != null) {
                    i = R.id.timestamp;
                    BubbleTimeTextView bubbleTimeTextView = (BubbleTimeTextView) pyb.a(view, i);
                    if (bubbleTimeTextView != null) {
                        return new EccItemRateThumbsSentBinding((RelativeLayout) view, relativeLayout, bubbleMessageTextView, imageView, bubbleTimeTextView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static EccItemRateThumbsSentBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static EccItemRateThumbsSentBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.ecc_item_rate_thumbs_sent, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
