package im.threads.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import im.threads.R;
import im.threads.ui.views.CircularProgressButton;
import im.threads.ui.widget.textView.BubbleMessageTextView;
import im.threads.ui.widget.textView.BubbleTimeTextView;
/* loaded from: classes3.dex */
public final class EccItemUserChatFileBinding {
    @NonNull
    public final ConstraintLayout bubble;
    @NonNull
    public final CircularProgressButton buttonDownload;
    @NonNull
    public final FrameLayout buttonsLayout;
    @NonNull
    public final View delimiter;
    @NonNull
    public final BubbleTimeTextView errorText;
    @NonNull
    public final BubbleMessageTextView fileSize;
    @NonNull
    public final BubbleMessageTextView header;
    @NonNull
    public final ImageView loader;
    @NonNull
    public final LinearLayout rootLayout;
    @NonNull
    private final LinearLayout rootView;
    @NonNull
    public final BubbleTimeTextView timeStamp;

    private EccItemUserChatFileBinding(@NonNull LinearLayout linearLayout, @NonNull ConstraintLayout constraintLayout, @NonNull CircularProgressButton circularProgressButton, @NonNull FrameLayout frameLayout, @NonNull View view, @NonNull BubbleTimeTextView bubbleTimeTextView, @NonNull BubbleMessageTextView bubbleMessageTextView, @NonNull BubbleMessageTextView bubbleMessageTextView2, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout2, @NonNull BubbleTimeTextView bubbleTimeTextView2) {
        this.rootView = linearLayout;
        this.bubble = constraintLayout;
        this.buttonDownload = circularProgressButton;
        this.buttonsLayout = frameLayout;
        this.delimiter = view;
        this.errorText = bubbleTimeTextView;
        this.fileSize = bubbleMessageTextView;
        this.header = bubbleMessageTextView2;
        this.loader = imageView;
        this.rootLayout = linearLayout2;
        this.timeStamp = bubbleTimeTextView2;
    }

    @NonNull
    public static EccItemUserChatFileBinding bind(@NonNull View view) {
        View a;
        int i = R.id.bubble;
        ConstraintLayout constraintLayout = (ConstraintLayout) pyb.a(view, i);
        if (constraintLayout != null) {
            i = R.id.buttonDownload;
            CircularProgressButton circularProgressButton = (CircularProgressButton) pyb.a(view, i);
            if (circularProgressButton != null) {
                i = R.id.buttonsLayout;
                FrameLayout frameLayout = (FrameLayout) pyb.a(view, i);
                if (frameLayout != null && (a = pyb.a(view, (i = R.id.delimiter))) != null) {
                    i = R.id.errorText;
                    BubbleTimeTextView bubbleTimeTextView = (BubbleTimeTextView) pyb.a(view, i);
                    if (bubbleTimeTextView != null) {
                        i = R.id.fileSize;
                        BubbleMessageTextView bubbleMessageTextView = (BubbleMessageTextView) pyb.a(view, i);
                        if (bubbleMessageTextView != null) {
                            i = R.id.header;
                            BubbleMessageTextView bubbleMessageTextView2 = (BubbleMessageTextView) pyb.a(view, i);
                            if (bubbleMessageTextView2 != null) {
                                i = R.id.loader;
                                ImageView imageView = (ImageView) pyb.a(view, i);
                                if (imageView != null) {
                                    LinearLayout linearLayout = (LinearLayout) view;
                                    i = R.id.timeStamp;
                                    BubbleTimeTextView bubbleTimeTextView2 = (BubbleTimeTextView) pyb.a(view, i);
                                    if (bubbleTimeTextView2 != null) {
                                        return new EccItemUserChatFileBinding(linearLayout, constraintLayout, circularProgressButton, frameLayout, a, bubbleTimeTextView, bubbleMessageTextView, bubbleMessageTextView2, imageView, linearLayout, bubbleTimeTextView2);
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
    public static EccItemUserChatFileBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static EccItemUserChatFileBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.ecc_item_user_chat_file, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
