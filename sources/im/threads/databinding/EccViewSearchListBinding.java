package im.threads.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import im.threads.R;
import im.threads.ui.widget.CustomFontTextView;
/* loaded from: classes3.dex */
public final class EccViewSearchListBinding {
    @NonNull
    public final ImageView noResultsImage;
    @NonNull
    public final CustomFontTextView noResultsTextView;
    @NonNull
    public final LinearLayout noResultsView;
    @NonNull
    private final FrameLayout rootView;
    @NonNull
    public final RecyclerView searchResultsListView;

    private EccViewSearchListBinding(@NonNull FrameLayout frameLayout, @NonNull ImageView imageView, @NonNull CustomFontTextView customFontTextView, @NonNull LinearLayout linearLayout, @NonNull RecyclerView recyclerView) {
        this.rootView = frameLayout;
        this.noResultsImage = imageView;
        this.noResultsTextView = customFontTextView;
        this.noResultsView = linearLayout;
        this.searchResultsListView = recyclerView;
    }

    @NonNull
    public static EccViewSearchListBinding bind(@NonNull View view) {
        int i = R.id.noResultsImage;
        ImageView imageView = (ImageView) pyb.a(view, i);
        if (imageView != null) {
            i = R.id.noResultsTextView;
            CustomFontTextView customFontTextView = (CustomFontTextView) pyb.a(view, i);
            if (customFontTextView != null) {
                i = R.id.noResultsView;
                LinearLayout linearLayout = (LinearLayout) pyb.a(view, i);
                if (linearLayout != null) {
                    i = R.id.searchResultsListView;
                    RecyclerView recyclerView = (RecyclerView) pyb.a(view, i);
                    if (recyclerView != null) {
                        return new EccViewSearchListBinding((FrameLayout) view, imageView, customFontTextView, linearLayout, recyclerView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static EccViewSearchListBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public FrameLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static EccViewSearchListBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.ecc_view_search_list, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
