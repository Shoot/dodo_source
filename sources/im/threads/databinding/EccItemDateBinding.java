package im.threads.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import im.threads.R;
import im.threads.ui.widget.textView.MessageHeaderTextView;
/* loaded from: classes3.dex */
public final class EccItemDateBinding {
    @NonNull
    private final FrameLayout rootView;
    @NonNull
    public final MessageHeaderTextView text;

    private EccItemDateBinding(@NonNull FrameLayout frameLayout, @NonNull MessageHeaderTextView messageHeaderTextView) {
        this.rootView = frameLayout;
        this.text = messageHeaderTextView;
    }

    @NonNull
    public static EccItemDateBinding bind(@NonNull View view) {
        int i = R.id.text;
        MessageHeaderTextView messageHeaderTextView = (MessageHeaderTextView) pyb.a(view, i);
        if (messageHeaderTextView != null) {
            return new EccItemDateBinding((FrameLayout) view, messageHeaderTextView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static EccItemDateBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public FrameLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static EccItemDateBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.ecc_item_date, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
