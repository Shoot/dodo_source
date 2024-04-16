package im.threads.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import im.threads.R;
import im.threads.ui.widget.textView.BubbleMessageTextView;
import im.threads.ui.widget.textView.BubbleTimeTextView;
/* loaded from: classes3.dex */
public final class EccItemUserImageFromBinding {
    @NonNull
    public final View delimiter;
    @NonNull
    public final BubbleTimeTextView errorText;
    @NonNull
    public final BubbleMessageTextView fileName;
    @NonNull
    public final ImageView image;
    @NonNull
    public final FrameLayout imageBackground;
    @NonNull
    public final FrameLayout imageLayout;
    @NonNull
    public final ImageView loader;
    @NonNull
    public final LinearLayout loaderLayout;
    @NonNull
    public final RelativeLayout loaderLayoutRoot;
    @NonNull
    public final LinearLayout rootLayout;
    @NonNull
    private final FrameLayout rootView;
    @NonNull
    public final BubbleTimeTextView timeStamp;
    @NonNull
    public final BubbleTimeTextView timeStampLoading;

    private EccItemUserImageFromBinding(@NonNull FrameLayout frameLayout, @NonNull View view, @NonNull BubbleTimeTextView bubbleTimeTextView, @NonNull BubbleMessageTextView bubbleMessageTextView, @NonNull ImageView imageView, @NonNull FrameLayout frameLayout2, @NonNull FrameLayout frameLayout3, @NonNull ImageView imageView2, @NonNull LinearLayout linearLayout, @NonNull RelativeLayout relativeLayout, @NonNull LinearLayout linearLayout2, @NonNull BubbleTimeTextView bubbleTimeTextView2, @NonNull BubbleTimeTextView bubbleTimeTextView3) {
        this.rootView = frameLayout;
        this.delimiter = view;
        this.errorText = bubbleTimeTextView;
        this.fileName = bubbleMessageTextView;
        this.image = imageView;
        this.imageBackground = frameLayout2;
        this.imageLayout = frameLayout3;
        this.loader = imageView2;
        this.loaderLayout = linearLayout;
        this.loaderLayoutRoot = relativeLayout;
        this.rootLayout = linearLayout2;
        this.timeStamp = bubbleTimeTextView2;
        this.timeStampLoading = bubbleTimeTextView3;
    }

    @NonNull
    public static EccItemUserImageFromBinding bind(@NonNull View view) {
        int i = R.id.delimiter;
        View a = pyb.a(view, i);
        if (a != null) {
            i = R.id.errorText;
            BubbleTimeTextView bubbleTimeTextView = (BubbleTimeTextView) pyb.a(view, i);
            if (bubbleTimeTextView != null) {
                i = R.id.fileName;
                BubbleMessageTextView bubbleMessageTextView = (BubbleMessageTextView) pyb.a(view, i);
                if (bubbleMessageTextView != null) {
                    i = R.id.image;
                    ImageView imageView = (ImageView) pyb.a(view, i);
                    if (imageView != null) {
                        i = R.id.imageBackground;
                        FrameLayout frameLayout = (FrameLayout) pyb.a(view, i);
                        if (frameLayout != null) {
                            i = R.id.imageLayout;
                            FrameLayout frameLayout2 = (FrameLayout) pyb.a(view, i);
                            if (frameLayout2 != null) {
                                i = R.id.loader;
                                ImageView imageView2 = (ImageView) pyb.a(view, i);
                                if (imageView2 != null) {
                                    i = R.id.loaderLayout;
                                    LinearLayout linearLayout = (LinearLayout) pyb.a(view, i);
                                    if (linearLayout != null) {
                                        i = R.id.loaderLayoutRoot;
                                        RelativeLayout relativeLayout = (RelativeLayout) pyb.a(view, i);
                                        if (relativeLayout != null) {
                                            i = R.id.rootLayout;
                                            LinearLayout linearLayout2 = (LinearLayout) pyb.a(view, i);
                                            if (linearLayout2 != null) {
                                                i = R.id.timeStamp;
                                                BubbleTimeTextView bubbleTimeTextView2 = (BubbleTimeTextView) pyb.a(view, i);
                                                if (bubbleTimeTextView2 != null) {
                                                    i = R.id.timeStampLoading;
                                                    BubbleTimeTextView bubbleTimeTextView3 = (BubbleTimeTextView) pyb.a(view, i);
                                                    if (bubbleTimeTextView3 != null) {
                                                        return new EccItemUserImageFromBinding((FrameLayout) view, a, bubbleTimeTextView, bubbleMessageTextView, imageView, frameLayout, frameLayout2, imageView2, linearLayout, relativeLayout, linearLayout2, bubbleTimeTextView2, bubbleTimeTextView3);
                                                    }
                                                }
                                            }
                                        }
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
    public static EccItemUserImageFromBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public FrameLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static EccItemUserImageFromBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.ecc_item_user_image_from, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
