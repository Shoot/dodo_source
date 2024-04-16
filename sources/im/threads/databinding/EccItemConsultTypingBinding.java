package im.threads.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import im.threads.R;
import im.threads.ui.widget.textView.TypingTextView;
/* loaded from: classes3.dex */
public final class EccItemConsultTypingBinding {
    @NonNull
    public final ImageView image;
    @NonNull
    private final RelativeLayout rootView;
    @NonNull
    public final TypingTextView typingInProgress;

    private EccItemConsultTypingBinding(@NonNull RelativeLayout relativeLayout, @NonNull ImageView imageView, @NonNull TypingTextView typingTextView) {
        this.rootView = relativeLayout;
        this.image = imageView;
        this.typingInProgress = typingTextView;
    }

    @NonNull
    public static EccItemConsultTypingBinding bind(@NonNull View view) {
        int i = R.id.image;
        ImageView imageView = (ImageView) pyb.a(view, i);
        if (imageView != null) {
            i = R.id.typing_in_progress;
            TypingTextView typingTextView = (TypingTextView) pyb.a(view, i);
            if (typingTextView != null) {
                return new EccItemConsultTypingBinding((RelativeLayout) view, imageView, typingTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static EccItemConsultTypingBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static EccItemConsultTypingBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.ecc_item_consult_typing, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
