package im.threads.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import im.threads.R;
/* loaded from: classes3.dex */
public final class EccActivityChatActivityBinding {
    @NonNull
    private final View rootView;

    private EccActivityChatActivityBinding(@NonNull View view) {
        this.rootView = view;
    }

    @NonNull
    public static EccActivityChatActivityBinding bind(@NonNull View view) {
        if (view != null) {
            return new EccActivityChatActivityBinding(view);
        }
        throw new NullPointerException("rootView");
    }

    @NonNull
    public static EccActivityChatActivityBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public View getRoot() {
        return this.rootView;
    }

    @NonNull
    public static EccActivityChatActivityBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.ecc_activity_chat_activity, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
