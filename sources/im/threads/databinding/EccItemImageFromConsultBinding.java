package im.threads.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import im.threads.R;
import im.threads.ui.widget.textView.BubbleMessageTextView;
import im.threads.ui.widget.textView.BubbleTimeTextView;
/* loaded from: classes3.dex */
public final class EccItemImageFromConsultBinding {
    @NonNull
    public final ImageView consultAvatar;
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
    public final LinearLayout imageLayoutWithSpace;
    @NonNull
    public final ImageView loader;
    @NonNull
    public final ImageView loaderImage;
    @NonNull
    public final LinearLayout loaderLayout;
    @NonNull
    public final LinearLayout rootLayout;
    @NonNull
    private final LinearLayout rootView;
    @NonNull
    public final BubbleTimeTextView timeStamp;
    @NonNull
    public final BubbleTimeTextView timeStampLoader;

    private EccItemImageFromConsultBinding(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull View view, @NonNull BubbleTimeTextView bubbleTimeTextView, @NonNull BubbleMessageTextView bubbleMessageTextView, @NonNull ImageView imageView2, @NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2, @NonNull LinearLayout linearLayout2, @NonNull ImageView imageView3, @NonNull ImageView imageView4, @NonNull LinearLayout linearLayout3, @NonNull LinearLayout linearLayout4, @NonNull BubbleTimeTextView bubbleTimeTextView2, @NonNull BubbleTimeTextView bubbleTimeTextView3) {
        this.rootView = linearLayout;
        this.consultAvatar = imageView;
        this.delimiter = view;
        this.errorText = bubbleTimeTextView;
        this.fileName = bubbleMessageTextView;
        this.image = imageView2;
        this.imageBackground = frameLayout;
        this.imageLayout = frameLayout2;
        this.imageLayoutWithSpace = linearLayout2;
        this.loader = imageView3;
        this.loaderImage = imageView4;
        this.loaderLayout = linearLayout3;
        this.rootLayout = linearLayout4;
        this.timeStamp = bubbleTimeTextView2;
        this.timeStampLoader = bubbleTimeTextView3;
    }

    @NonNull
    public static EccItemImageFromConsultBinding bind(@NonNull View view) {
        View a;
        int i = R.id.consultAvatar;
        ImageView imageView = (ImageView) pyb.a(view, i);
        if (imageView != null && (a = pyb.a(view, (i = R.id.delimiter))) != null) {
            i = R.id.errorText;
            BubbleTimeTextView bubbleTimeTextView = (BubbleTimeTextView) pyb.a(view, i);
            if (bubbleTimeTextView != null) {
                i = R.id.fileName;
                BubbleMessageTextView bubbleMessageTextView = (BubbleMessageTextView) pyb.a(view, i);
                if (bubbleMessageTextView != null) {
                    i = R.id.image;
                    ImageView imageView2 = (ImageView) pyb.a(view, i);
                    if (imageView2 != null) {
                        i = R.id.imageBackground;
                        FrameLayout frameLayout = (FrameLayout) pyb.a(view, i);
                        if (frameLayout != null) {
                            i = R.id.imageLayout;
                            FrameLayout frameLayout2 = (FrameLayout) pyb.a(view, i);
                            if (frameLayout2 != null) {
                                i = R.id.imageLayoutWithSpace;
                                LinearLayout linearLayout = (LinearLayout) pyb.a(view, i);
                                if (linearLayout != null) {
                                    i = R.id.loader;
                                    ImageView imageView3 = (ImageView) pyb.a(view, i);
                                    if (imageView3 != null) {
                                        i = R.id.loaderImage;
                                        ImageView imageView4 = (ImageView) pyb.a(view, i);
                                        if (imageView4 != null) {
                                            i = R.id.loaderLayout;
                                            LinearLayout linearLayout2 = (LinearLayout) pyb.a(view, i);
                                            if (linearLayout2 != null) {
                                                LinearLayout linearLayout3 = (LinearLayout) view;
                                                i = R.id.timeStamp;
                                                BubbleTimeTextView bubbleTimeTextView2 = (BubbleTimeTextView) pyb.a(view, i);
                                                if (bubbleTimeTextView2 != null) {
                                                    i = R.id.timeStampLoader;
                                                    BubbleTimeTextView bubbleTimeTextView3 = (BubbleTimeTextView) pyb.a(view, i);
                                                    if (bubbleTimeTextView3 != null) {
                                                        return new EccItemImageFromConsultBinding(linearLayout3, imageView, a, bubbleTimeTextView, bubbleMessageTextView, imageView2, frameLayout, frameLayout2, linearLayout, imageView3, imageView4, linearLayout2, linearLayout3, bubbleTimeTextView2, bubbleTimeTextView3);
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
    public static EccItemImageFromConsultBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static EccItemImageFromConsultBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.ecc_item_image_from_consult, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
