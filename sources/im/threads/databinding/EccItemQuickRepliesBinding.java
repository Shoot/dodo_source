package im.threads.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.ConstraintLayout;
import im.threads.R;
/* loaded from: classes3.dex */
public final class EccItemQuickRepliesBinding {
    @NonNull
    public final Flow chipGroup;
    @NonNull
    public final ConstraintLayout quickRepliesRootLayout;
    @NonNull
    private final ConstraintLayout rootView;

    private EccItemQuickRepliesBinding(@NonNull ConstraintLayout constraintLayout, @NonNull Flow flow, @NonNull ConstraintLayout constraintLayout2) {
        this.rootView = constraintLayout;
        this.chipGroup = flow;
        this.quickRepliesRootLayout = constraintLayout2;
    }

    @NonNull
    public static EccItemQuickRepliesBinding bind(@NonNull View view) {
        int i = R.id.chipGroup;
        Flow flow = (Flow) pyb.a(view, i);
        if (flow != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            return new EccItemQuickRepliesBinding(constraintLayout, flow, constraintLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static EccItemQuickRepliesBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static EccItemQuickRepliesBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.ecc_item_quick_replies, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
