package im.threads.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import im.threads.R;
import im.threads.ui.widget.textView.BubbleMessageTextView;
import im.threads.ui.widget.textView.BubbleTimeTextView;
/* loaded from: classes3.dex */
public final class EccOpenGraphLayoutBinding {
    @NonNull
    public final LinearLayout ogContent;
    @NonNull
    public final ConstraintLayout ogDataLayout;
    @NonNull
    public final BubbleMessageTextView ogDescription;
    @NonNull
    public final View ogDivider;
    @NonNull
    public final ImageView ogImage;
    @NonNull
    public final BubbleTimeTextView ogTimeStamp;
    @NonNull
    public final BubbleMessageTextView ogTitle;
    @NonNull
    public final BubbleMessageTextView ogUrl;
    @NonNull
    private final ConstraintLayout rootView;

    private EccOpenGraphLayoutBinding(@NonNull ConstraintLayout constraintLayout, @NonNull LinearLayout linearLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull BubbleMessageTextView bubbleMessageTextView, @NonNull View view, @NonNull ImageView imageView, @NonNull BubbleTimeTextView bubbleTimeTextView, @NonNull BubbleMessageTextView bubbleMessageTextView2, @NonNull BubbleMessageTextView bubbleMessageTextView3) {
        this.rootView = constraintLayout;
        this.ogContent = linearLayout;
        this.ogDataLayout = constraintLayout2;
        this.ogDescription = bubbleMessageTextView;
        this.ogDivider = view;
        this.ogImage = imageView;
        this.ogTimeStamp = bubbleTimeTextView;
        this.ogTitle = bubbleMessageTextView2;
        this.ogUrl = bubbleMessageTextView3;
    }

    @NonNull
    public static EccOpenGraphLayoutBinding bind(@NonNull View view) {
        View a;
        int i = R.id.ogContent;
        LinearLayout linearLayout = (LinearLayout) pyb.a(view, i);
        if (linearLayout != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i = R.id.og_description;
            BubbleMessageTextView bubbleMessageTextView = (BubbleMessageTextView) pyb.a(view, i);
            if (bubbleMessageTextView != null && (a = pyb.a(view, (i = R.id.ogDivider))) != null) {
                i = R.id.og_image;
                ImageView imageView = (ImageView) pyb.a(view, i);
                if (imageView != null) {
                    i = R.id.ogTimeStamp;
                    BubbleTimeTextView bubbleTimeTextView = (BubbleTimeTextView) pyb.a(view, i);
                    if (bubbleTimeTextView != null) {
                        i = R.id.og_title;
                        BubbleMessageTextView bubbleMessageTextView2 = (BubbleMessageTextView) pyb.a(view, i);
                        if (bubbleMessageTextView2 != null) {
                            i = R.id.og_url;
                            BubbleMessageTextView bubbleMessageTextView3 = (BubbleMessageTextView) pyb.a(view, i);
                            if (bubbleMessageTextView3 != null) {
                                return new EccOpenGraphLayoutBinding(constraintLayout, linearLayout, constraintLayout, bubbleMessageTextView, a, imageView, bubbleTimeTextView, bubbleMessageTextView2, bubbleMessageTextView3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static EccOpenGraphLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static EccOpenGraphLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.ecc_open_graph_layout, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
