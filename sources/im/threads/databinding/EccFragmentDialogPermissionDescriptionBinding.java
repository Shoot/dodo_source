package im.threads.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import im.threads.R;
/* loaded from: classes3.dex */
public final class EccFragmentDialogPermissionDescriptionBinding {
    @NonNull
    public final LinearLayout dialogLayout;
    @NonNull
    public final ImageView image;
    @NonNull
    public final TextView message;
    @NonNull
    public final Button negativeButton;
    @NonNull
    public final Button positiveButton;
    @NonNull
    private final FrameLayout rootView;
    @NonNull
    public final TextView title;

    private EccFragmentDialogPermissionDescriptionBinding(@NonNull FrameLayout frameLayout, @NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull Button button, @NonNull Button button2, @NonNull TextView textView2) {
        this.rootView = frameLayout;
        this.dialogLayout = linearLayout;
        this.image = imageView;
        this.message = textView;
        this.negativeButton = button;
        this.positiveButton = button2;
        this.title = textView2;
    }

    @NonNull
    public static EccFragmentDialogPermissionDescriptionBinding bind(@NonNull View view) {
        int i = R.id.dialog_layout;
        LinearLayout linearLayout = (LinearLayout) pyb.a(view, i);
        if (linearLayout != null) {
            i = R.id.image;
            ImageView imageView = (ImageView) pyb.a(view, i);
            if (imageView != null) {
                i = R.id.message;
                TextView textView = (TextView) pyb.a(view, i);
                if (textView != null) {
                    i = R.id.negative_button;
                    Button button = (Button) pyb.a(view, i);
                    if (button != null) {
                        i = R.id.positive_button;
                        Button button2 = (Button) pyb.a(view, i);
                        if (button2 != null) {
                            i = R.id.title;
                            TextView textView2 = (TextView) pyb.a(view, i);
                            if (textView2 != null) {
                                return new EccFragmentDialogPermissionDescriptionBinding((FrameLayout) view, linearLayout, imageView, textView, button, button2, textView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static EccFragmentDialogPermissionDescriptionBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public FrameLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static EccFragmentDialogPermissionDescriptionBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.ecc_fragment_dialog_permission_description, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
