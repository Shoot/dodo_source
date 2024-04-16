package im.threads.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import im.threads.R;
/* loaded from: classes3.dex */
public final class EccRemotePushExpandedBinding {
    @NonNull
    public final ImageView attachImage;
    @NonNull
    public final TextView consultName;
    @NonNull
    public final FrameLayout delimeter;
    @NonNull
    public final ImageView iconLarge;
    @NonNull
    public final ImageView iconLargeBg;
    @NonNull
    public final ImageView iconSmallCorner;
    @NonNull
    public final Button reply;
    @NonNull
    private final RelativeLayout rootView;
    @NonNull
    public final TextView text;
    @NonNull
    public final TextView title;

    private EccRemotePushExpandedBinding(@NonNull RelativeLayout relativeLayout, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull FrameLayout frameLayout, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull ImageView imageView4, @NonNull Button button, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.rootView = relativeLayout;
        this.attachImage = imageView;
        this.consultName = textView;
        this.delimeter = frameLayout;
        this.iconLarge = imageView2;
        this.iconLargeBg = imageView3;
        this.iconSmallCorner = imageView4;
        this.reply = button;
        this.text = textView2;
        this.title = textView3;
    }

    @NonNull
    public static EccRemotePushExpandedBinding bind(@NonNull View view) {
        int i = R.id.attach_image;
        ImageView imageView = (ImageView) pyb.a(view, i);
        if (imageView != null) {
            i = R.id.consult_name;
            TextView textView = (TextView) pyb.a(view, i);
            if (textView != null) {
                i = R.id.delimeter;
                FrameLayout frameLayout = (FrameLayout) pyb.a(view, i);
                if (frameLayout != null) {
                    i = R.id.icon_large;
                    ImageView imageView2 = (ImageView) pyb.a(view, i);
                    if (imageView2 != null) {
                        i = R.id.icon_large_bg;
                        ImageView imageView3 = (ImageView) pyb.a(view, i);
                        if (imageView3 != null) {
                            i = R.id.icon_small_corner;
                            ImageView imageView4 = (ImageView) pyb.a(view, i);
                            if (imageView4 != null) {
                                i = R.id.reply;
                                Button button = (Button) pyb.a(view, i);
                                if (button != null) {
                                    i = R.id.text;
                                    TextView textView2 = (TextView) pyb.a(view, i);
                                    if (textView2 != null) {
                                        i = R.id.title;
                                        TextView textView3 = (TextView) pyb.a(view, i);
                                        if (textView3 != null) {
                                            return new EccRemotePushExpandedBinding((RelativeLayout) view, imageView, textView, frameLayout, imageView2, imageView3, imageView4, button, textView2, textView3);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static EccRemotePushExpandedBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static EccRemotePushExpandedBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.ecc_remote_push_expanded, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
