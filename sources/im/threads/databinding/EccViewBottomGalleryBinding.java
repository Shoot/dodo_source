package im.threads.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import im.threads.R;
/* loaded from: classes3.dex */
public final class EccViewBottomGalleryBinding {
    @NonNull
    public final RecyclerView bottomGalleryRecycler;
    @NonNull
    private final View rootView;

    private EccViewBottomGalleryBinding(@NonNull View view, @NonNull RecyclerView recyclerView) {
        this.rootView = view;
        this.bottomGalleryRecycler = recyclerView;
    }

    @NonNull
    public static EccViewBottomGalleryBinding bind(@NonNull View view) {
        int i = R.id.bottom_gallery_recycler;
        RecyclerView recyclerView = (RecyclerView) pyb.a(view, i);
        if (recyclerView != null) {
            return new EccViewBottomGalleryBinding(view, recyclerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static EccViewBottomGalleryBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.ecc_view_bottom_gallery, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}
