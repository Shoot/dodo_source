package im.threads.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.google.android.material.slider.Slider;
import im.threads.R;
import im.threads.ui.views.CircularProgressButton;
import im.threads.ui.widget.textView.BubbleMessageTextView;
import im.threads.ui.widget.textView.BubbleTimeTextView;
import im.threads.ui.widget.textView.QuoteAuthorTextView;
import im.threads.ui.widget.textView.QuoteMessageTextView;
import im.threads.ui.widget.textView.QuoteTimeTextView;
/* loaded from: classes3.dex */
public final class EccItemConsultVoiceMessageBinding {
    @NonNull
    public final ConstraintLayout bubble;
    @NonNull
    public final Guideline buttonsStartGuideline;
    @NonNull
    public final ImageView consultAvatar;
    @NonNull
    public final BubbleTimeTextView errorText;
    @NonNull
    public final BubbleMessageTextView fileSize;
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
    public final ConstraintLayout rootLayout;
    @NonNull
    private final ConstraintLayout rootView;
    @NonNull
    public final BubbleTimeTextView timeStamp;
    @NonNull
    public final BubbleMessageTextView voiceMessageConsultAudioStatus;
    @NonNull
    public final ImageButton voiceMessageConsultButtonPlayPause;
    @NonNull
    public final Slider voiceMessageConsultSlider;
    @NonNull
    public final QuoteMessageTextView voiceMessageConsultText;

    private EccItemConsultVoiceMessageBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull Guideline guideline, @NonNull ImageView imageView, @NonNull BubbleTimeTextView bubbleTimeTextView, @NonNull BubbleMessageTextView bubbleMessageTextView, @NonNull ImageView imageView2, @NonNull CircularProgressButton circularProgressButton, @NonNull View view, @NonNull ImageView imageView3, @NonNull QuoteMessageTextView quoteMessageTextView, @NonNull LinearLayout linearLayout, @NonNull QuoteTimeTextView quoteTimeTextView, @NonNull QuoteAuthorTextView quoteAuthorTextView, @NonNull ConstraintLayout constraintLayout3, @NonNull BubbleTimeTextView bubbleTimeTextView2, @NonNull BubbleMessageTextView bubbleMessageTextView2, @NonNull ImageButton imageButton, @NonNull Slider slider, @NonNull QuoteMessageTextView quoteMessageTextView2) {
        this.rootView = constraintLayout;
        this.bubble = constraintLayout2;
        this.buttonsStartGuideline = guideline;
        this.consultAvatar = imageView;
        this.errorText = bubbleTimeTextView;
        this.fileSize = bubbleMessageTextView;
        this.loader = imageView2;
        this.quoteButtonDownload = circularProgressButton;
        this.quoteDelimiter = view;
        this.quoteFileImage = imageView3;
        this.quoteFileSpecs = quoteMessageTextView;
        this.quoteLayout = linearLayout;
        this.quoteSendAt = quoteTimeTextView;
        this.quoteTo = quoteAuthorTextView;
        this.rootLayout = constraintLayout3;
        this.timeStamp = bubbleTimeTextView2;
        this.voiceMessageConsultAudioStatus = bubbleMessageTextView2;
        this.voiceMessageConsultButtonPlayPause = imageButton;
        this.voiceMessageConsultSlider = slider;
        this.voiceMessageConsultText = quoteMessageTextView2;
    }

    @NonNull
    public static EccItemConsultVoiceMessageBinding bind(@NonNull View view) {
        View a;
        int i = R.id.bubble;
        ConstraintLayout constraintLayout = (ConstraintLayout) pyb.a(view, i);
        if (constraintLayout != null) {
            i = R.id.buttonsStartGuideline;
            Guideline guideline = (Guideline) pyb.a(view, i);
            if (guideline != null) {
                i = R.id.consultAvatar;
                ImageView imageView = (ImageView) pyb.a(view, i);
                if (imageView != null) {
                    i = R.id.errorText;
                    BubbleTimeTextView bubbleTimeTextView = (BubbleTimeTextView) pyb.a(view, i);
                    if (bubbleTimeTextView != null) {
                        i = R.id.fileSize;
                        BubbleMessageTextView bubbleMessageTextView = (BubbleMessageTextView) pyb.a(view, i);
                        if (bubbleMessageTextView != null) {
                            i = R.id.loader;
                            ImageView imageView2 = (ImageView) pyb.a(view, i);
                            if (imageView2 != null) {
                                i = R.id.quoteButtonDownload;
                                CircularProgressButton circularProgressButton = (CircularProgressButton) pyb.a(view, i);
                                if (circularProgressButton != null && (a = pyb.a(view, (i = R.id.quoteDelimiter))) != null) {
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
                                                        ConstraintLayout constraintLayout2 = (ConstraintLayout) view;
                                                        i = R.id.timeStamp;
                                                        BubbleTimeTextView bubbleTimeTextView2 = (BubbleTimeTextView) pyb.a(view, i);
                                                        if (bubbleTimeTextView2 != null) {
                                                            i = R.id.voiceMessageConsultAudioStatus;
                                                            BubbleMessageTextView bubbleMessageTextView2 = (BubbleMessageTextView) pyb.a(view, i);
                                                            if (bubbleMessageTextView2 != null) {
                                                                i = R.id.voiceMessageConsultButtonPlayPause;
                                                                ImageButton imageButton = (ImageButton) pyb.a(view, i);
                                                                if (imageButton != null) {
                                                                    i = R.id.voiceMessageConsultSlider;
                                                                    Slider slider = (Slider) pyb.a(view, i);
                                                                    if (slider != null) {
                                                                        i = R.id.voiceMessageConsultText;
                                                                        QuoteMessageTextView quoteMessageTextView2 = (QuoteMessageTextView) pyb.a(view, i);
                                                                        if (quoteMessageTextView2 != null) {
                                                                            return new EccItemConsultVoiceMessageBinding(constraintLayout2, constraintLayout, guideline, imageView, bubbleTimeTextView, bubbleMessageTextView, imageView2, circularProgressButton, a, imageView3, quoteMessageTextView, linearLayout, quoteTimeTextView, quoteAuthorTextView, constraintLayout2, bubbleTimeTextView2, bubbleMessageTextView2, imageButton, slider, quoteMessageTextView2);
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
    public static EccItemConsultVoiceMessageBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static EccItemConsultVoiceMessageBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.ecc_item_consult_voice_message, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
