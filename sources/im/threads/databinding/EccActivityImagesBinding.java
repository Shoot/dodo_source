package im.threads.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;
import im.threads.R;
/* loaded from: classes3.dex */
public final class EccActivityImagesBinding {
    @NonNull
    public final RelativeLayout activityRoot;
    @NonNull
    public final ImageButton backButton;
    @NonNull
    public final ViewPager pager;
    @NonNull
    private final RelativeLayout rootView;
    @NonNull
    public final TextView title;
    @NonNull
    public final Toolbar toolbar;
    @NonNull
    public final View toolbarShadow;

    private EccActivityImagesBinding(@NonNull RelativeLayout relativeLayout, @NonNull RelativeLayout relativeLayout2, @NonNull ImageButton imageButton, @NonNull ViewPager viewPager, @NonNull TextView textView, @NonNull Toolbar toolbar, @NonNull View view) {
        this.rootView = relativeLayout;
        this.activityRoot = relativeLayout2;
        this.backButton = imageButton;
        this.pager = viewPager;
        this.title = textView;
        this.toolbar = toolbar;
        this.toolbarShadow = view;
    }

    @NonNull
    public static EccActivityImagesBinding bind(@NonNull View view) {
        View a;
        RelativeLayout relativeLayout = (RelativeLayout) view;
        int i = R.id.back_button;
        ImageButton imageButton = (ImageButton) pyb.a(view, i);
        if (imageButton != null) {
            i = R.id.pager;
            ViewPager viewPager = (ViewPager) pyb.a(view, i);
            if (viewPager != null) {
                i = R.id.title;
                TextView textView = (TextView) pyb.a(view, i);
                if (textView != null) {
                    i = R.id.toolbar;
                    Toolbar toolbar = (Toolbar) pyb.a(view, i);
                    if (toolbar != null && (a = pyb.a(view, (i = R.id.toolbar_shadow))) != null) {
                        return new EccActivityImagesBinding(relativeLayout, relativeLayout, imageButton, viewPager, textView, toolbar, a);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static EccActivityImagesBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static EccActivityImagesBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.ecc_activity_images, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
