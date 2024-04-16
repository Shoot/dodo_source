package im.threads.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import im.threads.R;
import im.threads.ui.views.CircularProgressButton;
import im.threads.ui.widget.textView.BubbleMessageTextView;
import im.threads.ui.widget.textView.BubbleTimeTextView;
import im.threads.ui.widget.textView.QuoteAuthorTextView;
import im.threads.ui.widget.textView.QuoteMessageTextView;
import im.threads.ui.widget.textView.QuoteTimeTextView;
/* loaded from: classes3.dex */
public final class EccItemConsultChatFileBinding {
    @NonNull
    public final ConstraintLayout bubble;
    @NonNull
    public final CircularProgressButton circButton;
    @NonNull
    public final ImageView consultAvatar;
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
    public final CircularProgressButton quoteButtonDownload;
    @NonNull
    public final View quoteDelimiter;
    @NonNull
    public final ImageView quoteFileImage;
    @NonNull
    public final QuoteMessageTextView quoteFileSpecs;
    @NonNull
    public final LinearLayout quoteLayout;
    @NonNull
    public final QuoteTimeTextView quoteSendAt;
    @NonNull
    public final QuoteAuthorTextView quoteTo;
    @NonNull
    public final RelativeLayout rootLayout;
    @NonNull
    private final RelativeLayout rootView;
    @NonNull
    public final BubbleTimeTextView timestamp;

    private EccItemConsultChatFileBinding(@NonNull RelativeLayout relativeLayout, @NonNull ConstraintLayout constraintLayout, @NonNull CircularProgressButton circularProgressButton, @NonNull ImageView imageView, @NonNull View view, @NonNull BubbleTimeTextView bubbleTimeTextView, @NonNull BubbleMessageTextView bubbleMessageTextView, @NonNull BubbleMessageTextView bubbleMessageTextView2, @NonNull ImageView imageView2, @NonNull CircularProgressButton circularProgressButton2, @NonNull View view2, @NonNull ImageView imageView3, @NonNull QuoteMessageTextView quoteMessageTextView, @NonNull LinearLayout linearLayout, @NonNull QuoteTimeTextView quoteTimeTextView, @NonNull QuoteAuthorTextView quoteAuthorTextView, @NonNull RelativeLayout relativeLayout2, @NonNull BubbleTimeTextView bubbleTimeTextView2) {
        this.rootView = relativeLayout;
        this.bubble = constraintLayout;
        this.circButton = circularProgressButton;
        this.consultAvatar = imageView;
        this.delimiter = view;
        this.errorText = bubbleTimeTextView;
        this.fileSize = bubbleMessageTextView;
        this.header = bubbleMessageTextView2;
        this.loader = imageView2;
        this.quoteButtonDownload = circularProgressButton2;
        this.quoteDelimiter = view2;
        this.quoteFileImage = imageView3;
        this.quoteFileSpecs = quoteMessageTextView;
        this.quoteLayout = linearLayout;
        this.quoteSendAt = quoteTimeTextView;
        this.quoteTo = quoteAuthorTextView;
        this.rootLayout = relativeLayout2;
        this.timestamp = bubbleTimeTextView2;
    }

    @NonNull
    public static EccItemConsultChatFileBinding bind(@NonNull View view) {
        View a;
        View a2;
        int i = R.id.bubble;
        ConstraintLayout constraintLayout = (ConstraintLayout) pyb.a(view, i);
        if (constraintLayout != null) {
            i = R.id.circ_button;
            CircularProgressButton circularProgressButton = (CircularProgressButton) pyb.a(view, i);
            if (circularProgressButton != null) {
                i = R.id.consult_avatar;
                ImageView imageView = (ImageView) pyb.a(view, i);
                if (imageView != null && (a = pyb.a(view, (i = R.id.delimiter))) != null) {
                    i = R.id.errorText;
                    BubbleTimeTextView bubbleTimeTextView = (BubbleTimeTextView) pyb.a(view, i);
                    if (bubbleTimeTextView != null) {
                        i = R.id.file_size;
                        BubbleMessageTextView bubbleMessageTextView = (BubbleMessageTextView) pyb.a(view, i);
                        if (bubbleMessageTextView != null) {
                            i = R.id.header;
                            BubbleMessageTextView bubbleMessageTextView2 = (BubbleMessageTextView) pyb.a(view, i);
                            if (bubbleMessageTextView2 != null) {
                                i = R.id.loader;
                                ImageView imageView2 = (ImageView) pyb.a(view, i);
                                if (imageView2 != null) {
                                    i = R.id.quoteButtonDownload;
                                    CircularProgressButton circularProgressButton2 = (CircularProgressButton) pyb.a(view, i);
                                    if (circularProgressButton2 != null && (a2 = pyb.a(view, (i = R.id.quoteDelimiter))) != null) {
                                        i = R.id.quoteFileImage;
                                        ImageView imageView3 = (ImageView) pyb.a(view, i);
                                        if (imageView3 != null) {
                                            i = R.id.quoteFileSpecs;
                                            QuoteMessageTextView quoteMessageTextView = (QuoteMessageTextView) pyb.a(view, i);
                                            if (quoteMessageTextView != null) {
                                                i = R.id.quoteLayout;
                                                LinearLayout linearLayout = (LinearLayout) pyb.a(view, i);
                                                if (linearLayout != null) {
                                                    i = R.id.quoteSendAt;
                                                    QuoteTimeTextView quoteTimeTextView = (QuoteTimeTextView) pyb.a(view, i);
                                                    if (quoteTimeTextView != null) {
                                                        i = R.id.quoteTo;
                                                        QuoteAuthorTextView quoteAuthorTextView = (QuoteAuthorTextView) pyb.a(view, i);
                                                        if (quoteAuthorTextView != null) {
                                                            RelativeLayout relativeLayout = (RelativeLayout) view;
                                                            i = R.id.timestamp;
                                                            BubbleTimeTextView bubbleTimeTextView2 = (BubbleTimeTextView) pyb.a(view, i);
                                                            if (bubbleTimeTextView2 != null) {
                                                                return new EccItemConsultChatFileBinding(relativeLayout, constraintLayout, circularProgressButton, imageView, a, bubbleTimeTextView, bubbleMessageTextView, bubbleMessageTextView2, imageView2, circularProgressButton2, a2, imageView3, quoteMessageTextView, linearLayout, quoteTimeTextView, quoteAuthorTextView, relativeLayout, bubbleTimeTextView2);
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
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static EccItemConsultChatFileBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static EccItemConsultChatFileBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.ecc_item_consult_chat_file, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
