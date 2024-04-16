package im.threads.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import im.threads.R;
/* loaded from: classes3.dex */
public final class EccItemSystemMessageBinding {
    @NonNull
    private final TextView rootView;
    @NonNull
    public final TextView tvSystemMessage;

    private EccItemSystemMessageBinding(@NonNull TextView textView, @NonNull TextView textView2) {
        this.rootView = textView;
        this.tvSystemMessage = textView2;
    }

    @NonNull
    public static EccItemSystemMessageBinding bind(@NonNull View view) {
        if (view != null) {
            TextView textView = (TextView) view;
            return new EccItemSystemMessageBinding(textView, textView);
        }
        throw new NullPointerException("rootView");
    }

    @NonNull
    public static EccItemSystemMessageBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public TextView getRoot() {
        return this.rootView;
    }

    @NonNull
    public static EccItemSystemMessageBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.ecc_item_system_message, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
