package im.threads.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import im.threads.R;
import im.threads.ui.widget.CustomFontButton;
import im.threads.ui.widget.CustomFontEditText;
import im.threads.ui.widget.CustomFontTextView;
/* loaded from: classes3.dex */
public final class EccActivityGalleryBinding {
    @NonNull
    public final RelativeLayout activityRoot;
    @NonNull
    public final ImageButton backButton;
    @NonNull
    public final FrameLayout bottomButtons;
    @NonNull
    public final CustomFontButton cancel;
    @NonNull
    public final ImageButton clearSearchButton;
    @NonNull
    public final CustomFontTextView nothingFoundLabel;
    @NonNull
    public final RecyclerView recycler;
    @NonNull
    private final RelativeLayout rootView;
    @NonNull
    public final CustomFontEditText searchEditText;
    @NonNull
    public final RelativeLayout searchLabelLayout;
    @NonNull
    public final LinearLayout searchLayout;
    @NonNull
    public final ImageButton searchPhoto;
    @NonNull
    public final CustomFontTextView searchPhotoTitle;
    @NonNull
    public final CustomFontButton send;
    @NonNull
    public final TextView title;
    @NonNull
    public final Toolbar toolbar;

    private EccActivityGalleryBinding(@NonNull RelativeLayout relativeLayout, @NonNull RelativeLayout relativeLayout2, @NonNull ImageButton imageButton, @NonNull FrameLayout frameLayout, @NonNull CustomFontButton customFontButton, @NonNull ImageButton imageButton2, @NonNull CustomFontTextView customFontTextView, @NonNull RecyclerView recyclerView, @NonNull CustomFontEditText customFontEditText, @NonNull RelativeLayout relativeLayout3, @NonNull LinearLayout linearLayout, @NonNull ImageButton imageButton3, @NonNull CustomFontTextView customFontTextView2, @NonNull CustomFontButton customFontButton2, @NonNull TextView textView, @NonNull Toolbar toolbar) {
        this.rootView = relativeLayout;
        this.activityRoot = relativeLayout2;
        this.backButton = imageButton;
        this.bottomButtons = frameLayout;
        this.cancel = customFontButton;
        this.clearSearchButton = imageButton2;
        this.nothingFoundLabel = customFontTextView;
        this.recycler = recyclerView;
        this.searchEditText = customFontEditText;
        this.searchLabelLayout = relativeLayout3;
        this.searchLayout = linearLayout;
        this.searchPhoto = imageButton3;
        this.searchPhotoTitle = customFontTextView2;
        this.send = customFontButton2;
        this.title = textView;
        this.toolbar = toolbar;
    }

    @NonNull
    public static EccActivityGalleryBinding bind(@NonNull View view) {
        RelativeLayout relativeLayout = (RelativeLayout) view;
        int i = R.id.back_button;
        ImageButton imageButton = (ImageButton) pyb.a(view, i);
        if (imageButton != null) {
            i = R.id.bottom_buttons;
            FrameLayout frameLayout = (FrameLayout) pyb.a(view, i);
            if (frameLayout != null) {
                i = R.id.cancel;
                CustomFontButton customFontButton = (CustomFontButton) pyb.a(view, i);
                if (customFontButton != null) {
                    i = R.id.clear_search_button;
                    ImageButton imageButton2 = (ImageButton) pyb.a(view, i);
                    if (imageButton2 != null) {
                        i = R.id.nothing_found_label;
                        CustomFontTextView customFontTextView = (CustomFontTextView) pyb.a(view, i);
                        if (customFontTextView != null) {
                            i = R.id.recycler;
                            RecyclerView recyclerView = (RecyclerView) pyb.a(view, i);
                            if (recyclerView != null) {
                                i = R.id.search_edit_text;
                                CustomFontEditText customFontEditText = (CustomFontEditText) pyb.a(view, i);
                                if (customFontEditText != null) {
                                    i = R.id.search_label_layout;
                                    RelativeLayout relativeLayout2 = (RelativeLayout) pyb.a(view, i);
                                    if (relativeLayout2 != null) {
                                        i = R.id.search_layout;
                                        LinearLayout linearLayout = (LinearLayout) pyb.a(view, i);
                                        if (linearLayout != null) {
                                            i = R.id.search_photo;
                                            ImageButton imageButton3 = (ImageButton) pyb.a(view, i);
                                            if (imageButton3 != null) {
                                                i = R.id.search_photo_title;
                                                CustomFontTextView customFontTextView2 = (CustomFontTextView) pyb.a(view, i);
                                                if (customFontTextView2 != null) {
                                                    i = R.id.send;
                                                    CustomFontButton customFontButton2 = (CustomFontButton) pyb.a(view, i);
                                                    if (customFontButton2 != null) {
                                                        i = R.id.title;
                                                        TextView textView = (TextView) pyb.a(view, i);
                                                        if (textView != null) {
                                                            i = R.id.toolbar;
                                                            Toolbar toolbar = (Toolbar) pyb.a(view, i);
                                                            if (toolbar != null) {
                                                                return new EccActivityGalleryBinding(relativeLayout, relativeLayout, imageButton, frameLayout, customFontButton, imageButton2, customFontTextView, recyclerView, customFontEditText, relativeLayout2, linearLayout, imageButton3, customFontTextView2, customFontButton2, textView, toolbar);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
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
    public static EccActivityGalleryBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static EccActivityGalleryBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.ecc_activity_gallery, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
