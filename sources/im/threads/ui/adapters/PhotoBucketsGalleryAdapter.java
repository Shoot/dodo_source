package im.threads.ui.adapters;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import im.threads.business.models.PhotoBucketItem;
import im.threads.ui.adapters.PhotoBucketsGalleryAdapter;
import im.threads.ui.holders.GalleryBucketImageHolder;
import java.util.List;
/* loaded from: classes3.dex */
public final class PhotoBucketsGalleryAdapter extends RecyclerView.h<GalleryBucketImageHolder> {
    private List<PhotoBucketItem> list;
    private OnItemClick mOnItemClick;

    /* loaded from: classes3.dex */
    public interface OnItemClick {
        void onPhotoBucketClick(PhotoBucketItem photoBucketItem);
    }

    public PhotoBucketsGalleryAdapter(List<PhotoBucketItem> list, OnItemClick onItemClick) {
        if (list != null) {
            this.list = list;
            this.mOnItemClick = onItemClick;
            return;
        }
        throw new IllegalStateException("list must not be null");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onBindViewHolder$0(GalleryBucketImageHolder galleryBucketImageHolder, View view) {
        OnItemClick onItemClick = this.mOnItemClick;
        if (onItemClick != null) {
            onItemClick.onPhotoBucketClick(this.list.get(galleryBucketImageHolder.getAdapterPosition()));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.list.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(@NonNull final GalleryBucketImageHolder galleryBucketImageHolder, int i) {
        galleryBucketImageHolder.onBind(this.list.get(i).getBucketName(), this.list.get(i).getBucketSize(), this.list.get(i).getImagePath(), new View.OnClickListener() { // from class: g58
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PhotoBucketsGalleryAdapter.this.lambda$onBindViewHolder$0(galleryBucketImageHolder, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    @NonNull
    public GalleryBucketImageHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new GalleryBucketImageHolder(viewGroup);
    }
}
