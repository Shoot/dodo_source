package im.threads.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import im.threads.R;
/* loaded from: classes3.dex */
public final class EccItemSearchingConsultBinding {
    @NonNull
    public final ProgressBar progress;
    @NonNull
    private final FrameLayout rootView;

    private EccItemSearchingConsultBinding(@NonNull FrameLayout frameLayout, @NonNull ProgressBar progressBar) {
        this.rootView = frameLayout;
        this.progress = progressBar;
    }

    @NonNull
    public static EccItemSearchingConsultBinding bind(@NonNull View view) {
        int i = R.id.progress;
        ProgressBar progressBar = (ProgressBar) pyb.a(view, i);
        if (progressBar != null) {
            return new EccItemSearchingConsultBinding((FrameLayout) view, progressBar);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static EccItemSearchingConsultBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public FrameLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static EccItemSearchingConsultBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.ecc_item_searching_consult, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
