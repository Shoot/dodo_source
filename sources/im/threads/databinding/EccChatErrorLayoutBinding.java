package im.threads.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import im.threads.R;
/* loaded from: classes3.dex */
public final class EccChatErrorLayoutBinding {
    @NonNull
    public final ImageView errorImage;
    @NonNull
    public final LinearLayout errorLayout;
    @NonNull
    public final TextView errorMessage;
    @NonNull
    public final Button retryInitChatBtn;
    @NonNull
    private final LinearLayout rootView;

    private EccChatErrorLayoutBinding(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout2, @NonNull TextView textView, @NonNull Button button) {
        this.rootView = linearLayout;
        this.errorImage = imageView;
        this.errorLayout = linearLayout2;
        this.errorMessage = textView;
        this.retryInitChatBtn = button;
    }

    @NonNull
    public static EccChatErrorLayoutBinding bind(@NonNull View view) {
        int i = R.id.errorImage;
        ImageView imageView = (ImageView) pyb.a(view, i);
        if (imageView != null) {
            LinearLayout linearLayout = (LinearLayout) view;
            i = R.id.errorMessage;
            TextView textView = (TextView) pyb.a(view, i);
            if (textView != null) {
                i = R.id.retryInitChatBtn;
                Button button = (Button) pyb.a(view, i);
                if (button != null) {
                    return new EccChatErrorLayoutBinding(linearLayout, imageView, linearLayout, textView, button);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static EccChatErrorLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static EccChatErrorLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.ecc_chat_error_layout, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
