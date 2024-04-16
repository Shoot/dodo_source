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
import im.threads.ui.views.CircularProgressButton;
import im.threads.ui.widget.textView.BubbleMessageTextView;
import im.threads.ui.widget.textView.BubbleTimeTextView;
import im.threads.ui.widget.textView.QuoteAuthorTextView;
import im.threads.ui.widget.textView.QuoteMessageTextView;
import im.threads.ui.widget.textView.QuoteTimeTextView;
/* loaded from: classes3.dex */
public final class EccItemConsultantTextWithFileBinding {
    @NonNull
    public final LinearLayout bubble;
    @NonNull
    public final CircularProgressButton buttonDownload;
    @NonNull
    public final ImageView consultAvatar;
    @NonNull
    public final View delimiter;
    @NonNull
    public final ImageView errorImage;
    @NonNull
    public final BubbleTimeTextView errorText;
    @NonNull
    public final ImageView fileImage;
    @NonNull
    public final QuoteMessageTextView fileSpecs;
    @NonNull
    public final ImageView image;
    @NonNull
    public final FrameLayout imageLayout;
    @NonNull
    public final FrameLayout imageRoot;
    @NonNull
    public final ImageView loaderImage;
    @NonNull
    public final FrameLayout phraseFrame;
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
    public final LinearLayout rightTextRow;
    @NonNull
    public final RelativeLayout rootLayout;
    @NonNull
    private final RelativeLayout rootView;
    @NonNull
    public final QuoteTimeTextView sendAt;
    @NonNull
    public final BubbleMessageTextView text;
    @NonNull
    public final BubbleTimeTextView timeStamp;
    @NonNull
    public final QuoteAuthorTextView to;

    private EccItemConsultantTextWithFileBinding(@NonNull RelativeLayout relativeLayout, @NonNull LinearLayout linearLayout, @NonNull CircularProgressButton circularProgressButton, @NonNull ImageView imageView, @NonNull View view, @NonNull ImageView imageView2, @NonNull BubbleTimeTextView bubbleTimeTextView, @NonNull ImageView imageView3, @NonNull QuoteMessageTextView quoteMessageTextView, @NonNull ImageView imageView4, @NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2, @NonNull ImageView imageView5, @NonNull FrameLayout frameLayout3, @NonNull CircularProgressButton circularProgressButton2, @NonNull View view2, @NonNull ImageView imageView6, @NonNull QuoteMessageTextView quoteMessageTextView2, @NonNull LinearLayout linearLayout2, @NonNull QuoteTimeTextView quoteTimeTextView, @NonNull QuoteAuthorTextView quoteAuthorTextView, @NonNull LinearLayout linearLayout3, @NonNull RelativeLayout relativeLayout2, @NonNull QuoteTimeTextView quoteTimeTextView2, @NonNull BubbleMessageTextView bubbleMessageTextView, @NonNull BubbleTimeTextView bubbleTimeTextView2, @NonNull QuoteAuthorTextView quoteAuthorTextView2) {
        this.rootView = relativeLayout;
        this.bubble = linearLayout;
        this.buttonDownload = circularProgressButton;
        this.consultAvatar = imageView;
        this.delimiter = view;
        this.errorImage = imageView2;
        this.errorText = bubbleTimeTextView;
        this.fileImage = imageView3;
        this.fileSpecs = quoteMessageTextView;
        this.image = imageView4;
        this.imageLayout = frameLayout;
        this.imageRoot = frameLayout2;
        this.loaderImage = imageView5;
        this.phraseFrame = frameLayout3;
        this.quoteButtonDownload = circularProgressButton2;
        this.quoteDelimiter = view2;
        this.quoteFileImage = imageView6;
        this.quoteFileSpecs = quoteMessageTextView2;
        this.quoteLayout = linearLayout2;
        this.quoteSendAt = quoteTimeTextView;
        this.quoteTo = quoteAuthorTextView;
        this.rightTextRow = linearLayout3;
        this.rootLayout = relativeLayout2;
        this.sendAt = quoteTimeTextView2;
        this.text = bubbleMessageTextView;
        this.timeStamp = bubbleTimeTextView2;
        this.to = quoteAuthorTextView2;
    }

    @NonNull
    public static EccItemConsultantTextWithFileBinding bind(@NonNull View view) {
        View a;
        View a2;
        int i = R.id.bubble;
        LinearLayout linearLayout = (LinearLayout) pyb.a(view, i);
        if (linearLayout != null) {
            i = R.id.buttonDownload;
            CircularProgressButton circularProgressButton = (CircularProgressButton) pyb.a(view, i);
            if (circularProgressButton != null) {
                i = R.id.consultAvatar;
                ImageView imageView = (ImageView) pyb.a(view, i);
                if (imageView != null && (a = pyb.a(view, (i = R.id.delimiter))) != null) {
                    i = R.id.errorImage;
                    ImageView imageView2 = (ImageView) pyb.a(view, i);
                    if (imageView2 != null) {
                        i = R.id.errorText;
                        BubbleTimeTextView bubbleTimeTextView = (BubbleTimeTextView) pyb.a(view, i);
                        if (bubbleTimeTextView != null) {
                            i = R.id.fileImage;
                            ImageView imageView3 = (ImageView) pyb.a(view, i);
                            if (imageView3 != null) {
                                i = R.id.fileSpecs;
                                QuoteMessageTextView quoteMessageTextView = (QuoteMessageTextView) pyb.a(view, i);
                                if (quoteMessageTextView != null) {
                                    i = R.id.image;
                                    ImageView imageView4 = (ImageView) pyb.a(view, i);
                                    if (imageView4 != null) {
                                        i = R.id.imageLayout;
                                        FrameLayout frameLayout = (FrameLayout) pyb.a(view, i);
                                        if (frameLayout != null) {
                                            i = R.id.imageRoot;
                                            FrameLayout frameLayout2 = (FrameLayout) pyb.a(view, i);
                                            if (frameLayout2 != null) {
                                                i = R.id.loaderImage;
                                                ImageView imageView5 = (ImageView) pyb.a(view, i);
                                                if (imageView5 != null) {
                                                    i = R.id.phraseFrame;
                                                    FrameLayout frameLayout3 = (FrameLayout) pyb.a(view, i);
                                                    if (frameLayout3 != null) {
                                                        i = R.id.quoteButtonDownload;
                                                        CircularProgressButton circularProgressButton2 = (CircularProgressButton) pyb.a(view, i);
                                                        if (circularProgressButton2 != null && (a2 = pyb.a(view, (i = R.id.quoteDelimiter))) != null) {
                                                            i = R.id.quoteFileImage;
                                                            ImageView imageView6 = (ImageView) pyb.a(view, i);
                                                            if (imageView6 != null) {
                                                                i = R.id.quoteFileSpecs;
                                                                QuoteMessageTextView quoteMessageTextView2 = (QuoteMessageTextView) pyb.a(view, i);
                                                                if (quoteMessageTextView2 != null) {
                                                                    i = R.id.quoteLayout;
                                                                    LinearLayout linearLayout2 = (LinearLayout) pyb.a(view, i);
                                                                    if (linearLayout2 != null) {
                                                                        i = R.id.quoteSendAt;
                                                                        QuoteTimeTextView quoteTimeTextView = (QuoteTimeTextView) pyb.a(view, i);
                                                                        if (quoteTimeTextView != null) {
                                                                            i = R.id.quoteTo;
                                                                            QuoteAuthorTextView quoteAuthorTextView = (QuoteAuthorTextView) pyb.a(view, i);
                                                                            if (quoteAuthorTextView != null) {
                                                                                i = R.id.rightTextRow;
                                                                                LinearLayout linearLayout3 = (LinearLayout) pyb.a(view, i);
                                                                                if (linearLayout3 != null) {
                                                                                    RelativeLayout relativeLayout = (RelativeLayout) view;
                                                                                    i = R.id.sendAt;
                                                                                    QuoteTimeTextView quoteTimeTextView2 = (QuoteTimeTextView) pyb.a(view, i);
                                                                                    if (quoteTimeTextView2 != null) {
                                                                                        i = R.id.text;
                                                                                        BubbleMessageTextView bubbleMessageTextView = (BubbleMessageTextView) pyb.a(view, i);
                                                                                        if (bubbleMessageTextView != null) {
                                                                                            i = R.id.timeStamp;
                                                                                            BubbleTimeTextView bubbleTimeTextView2 = (BubbleTimeTextView) pyb.a(view, i);
                                                                                            if (bubbleTimeTextView2 != null) {
                                                                                                i = R.id.to;
                                                                                                QuoteAuthorTextView quoteAuthorTextView2 = (QuoteAuthorTextView) pyb.a(view, i);
                                                                                                if (quoteAuthorTextView2 != null) {
                                                                                                    return new EccItemConsultantTextWithFileBinding(relativeLayout, linearLayout, circularProgressButton, imageView, a, imageView2, bubbleTimeTextView, imageView3, quoteMessageTextView, imageView4, frameLayout, frameLayout2, imageView5, frameLayout3, circularProgressButton2, a2, imageView6, quoteMessageTextView2, linearLayout2, quoteTimeTextView, quoteAuthorTextView, linearLayout3, relativeLayout, quoteTimeTextView2, bubbleMessageTextView, bubbleTimeTextView2, quoteAuthorTextView2);
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
    public static EccItemConsultantTextWithFileBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static EccItemConsultantTextWithFileBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.ecc_item_consultant_text_with_file, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
