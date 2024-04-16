package im.threads.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import im.threads.R;
/* loaded from: classes3.dex */
public final class EccItemFreeSpaceBinding {
    @NonNull
    public final View root;
    @NonNull
    private final View rootView;

    private EccItemFreeSpaceBinding(@NonNull View view, @NonNull View view2) {
        this.rootView = view;
        this.root = view2;
    }

    @NonNull
    public static EccItemFreeSpaceBinding bind(@NonNull View view) {
        if (view != null) {
            return new EccItemFreeSpaceBinding(view, view);
        }
        throw new NullPointerException("rootView");
    }

    @NonNull
    public static EccItemFreeSpaceBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public View getRoot() {
        return this.rootView;
    }

    @NonNull
    public static EccItemFreeSpaceBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.ecc_item_free_space, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
