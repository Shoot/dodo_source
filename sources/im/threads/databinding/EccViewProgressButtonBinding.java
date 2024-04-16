package im.threads.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import im.threads.R;
import im.threads.ui.views.MyCircleProgress;
/* loaded from: classes3.dex */
public final class EccViewProgressButtonBinding {
    @NonNull
    public final View background;
    @NonNull
    public final MyCircleProgress circularProgress;
    @NonNull
    public final FrameLayout frame;
    @NonNull
    public final View labelImage;
    @NonNull
    private final FrameLayout rootView;

    private EccViewProgressButtonBinding(@NonNull FrameLayout frameLayout, @NonNull View view, @NonNull MyCircleProgress myCircleProgress, @NonNull FrameLayout frameLayout2, @NonNull View view2) {
        this.rootView = frameLayout;
        this.background = view;
        this.circularProgress = myCircleProgress;
        this.frame = frameLayout2;
        this.labelImage = view2;
    }

    @NonNull
    public static EccViewProgressButtonBinding bind(@NonNull View view) {
        int i = R.id.background;
        View a = pyb.a(view, i);
        if (a != null) {
            i = R.id.circular_progress;
            MyCircleProgress myCircleProgress = (MyCircleProgress) pyb.a(view, i);
            if (myCircleProgress != null) {
                FrameLayout frameLayout = (FrameLayout) view;
                i = R.id.label_image;
                View a2 = pyb.a(view, i);
                if (a2 != null) {
                    return new EccViewProgressButtonBinding(frameLayout, a, myCircleProgress, frameLayout, a2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static EccViewProgressButtonBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public FrameLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static EccViewProgressButtonBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.ecc_view_progress_button, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
