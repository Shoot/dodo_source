package im.threads.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Chronometer;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import im.threads.R;
import im.threads.ui.views.shimmerLayout.ShimmerLayout;
/* loaded from: classes3.dex */
public final class EccVoiceRecordViewLayoutBinding {
    @NonNull
    public final ImageView arrow;
    @NonNull
    public final ImageView basketImg;
    @NonNull
    public final TextView cancelTextView;
    @NonNull
    public final Chronometer counterTime;
    @NonNull
    public final RelativeLayout parentLayout;
    @NonNull
    private final RelativeLayout rootView;
    @NonNull
    public final TextView slideToCancel;
    @NonNull
    public final ShimmerLayout slideToCancelLayout;
    @NonNull
    public final ImageView smallBlinkingMic;

    private EccVoiceRecordViewLayoutBinding(@NonNull RelativeLayout relativeLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull TextView textView, @NonNull Chronometer chronometer, @NonNull RelativeLayout relativeLayout2, @NonNull TextView textView2, @NonNull ShimmerLayout shimmerLayout, @NonNull ImageView imageView3) {
        this.rootView = relativeLayout;
        this.arrow = imageView;
        this.basketImg = imageView2;
        this.cancelTextView = textView;
        this.counterTime = chronometer;
        this.parentLayout = relativeLayout2;
        this.slideToCancel = textView2;
        this.slideToCancelLayout = shimmerLayout;
        this.smallBlinkingMic = imageView3;
    }

    @NonNull
    public static EccVoiceRecordViewLayoutBinding bind(@NonNull View view) {
        int i = R.id.arrow;
        ImageView imageView = (ImageView) pyb.a(view, i);
        if (imageView != null) {
            i = R.id.basket_img;
            ImageView imageView2 = (ImageView) pyb.a(view, i);
            if (imageView2 != null) {
                i = R.id.cancelTextView;
                TextView textView = (TextView) pyb.a(view, i);
                if (textView != null) {
                    i = R.id.counterTime;
                    Chronometer chronometer = (Chronometer) pyb.a(view, i);
                    if (chronometer != null) {
                        RelativeLayout relativeLayout = (RelativeLayout) view;
                        i = R.id.slide_to_cancel;
                        TextView textView2 = (TextView) pyb.a(view, i);
                        if (textView2 != null) {
                            i = R.id.slideToCancelLayout;
                            ShimmerLayout shimmerLayout = (ShimmerLayout) pyb.a(view, i);
                            if (shimmerLayout != null) {
                                i = R.id.smallBlinkingMic;
                                ImageView imageView3 = (ImageView) pyb.a(view, i);
                                if (imageView3 != null) {
                                    return new EccVoiceRecordViewLayoutBinding(relativeLayout, imageView, imageView2, textView, chronometer, relativeLayout, textView2, shimmerLayout, imageView3);
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
    public static EccVoiceRecordViewLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static EccVoiceRecordViewLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.ecc_voice_record_view_layout, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
