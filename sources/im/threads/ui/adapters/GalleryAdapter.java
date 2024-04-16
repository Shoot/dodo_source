package im.threads.ui.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import im.threads.R;
import im.threads.business.models.MediaPhoto;
import im.threads.business.utils.Balloon;
import im.threads.ui.adapters.GalleryAdapter;
import im.threads.ui.config.Config;
import im.threads.ui.holders.GalleryItemHolder;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes3.dex */
public final class GalleryAdapter extends RecyclerView.h<GalleryItemHolder> {
    private final List<MediaPhoto> chosenList = new ArrayList();
    private final Config config = Config.getInstance();
    private final List<MediaPhoto> list;
    private final OnGalleryItemClick onGalleryItemClick;

    /* loaded from: classes3.dex */
    public interface OnGalleryItemClick {
        void onGalleryItemsChosen(List<MediaPhoto> list);
    }

    public GalleryAdapter(List<MediaPhoto> list, OnGalleryItemClick onGalleryItemClick) {
        this.list = list;
        this.onGalleryItemClick = onGalleryItemClick;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onBindViewHolder$0(GalleryItemHolder galleryItemHolder, View view) {
        MediaPhoto mediaPhoto = this.list.get(galleryItemHolder.getAdapterPosition());
        if (mediaPhoto.isChecked()) {
            mediaPhoto.setChecked(false);
        } else {
            Context context = this.config.context;
            if (this.chosenList.size() >= this.config.getChatStyle().getMaxGalleryImagesCount(context)) {
                Balloon.show(context, context.getString(R.string.ecc_achieve_images_count_limit_message));
            } else {
                mediaPhoto.setChecked(true);
            }
        }
        if (this.onGalleryItemClick != null) {
            this.chosenList.clear();
            for (MediaPhoto mediaPhoto2 : this.list) {
                if (mediaPhoto2.isChecked()) {
                    this.chosenList.add(mediaPhoto2);
                }
            }
            this.onGalleryItemClick.onGalleryItemsChosen(this.chosenList);
        }
        notifyItemChanged(galleryItemHolder.getAdapterPosition());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.list.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(@NonNull final GalleryItemHolder galleryItemHolder, int i) {
        galleryItemHolder.onBind(this.list.get(i).getImageUri(), new View.OnClickListener() { // from class: lc4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GalleryAdapter.this.lambda$onBindViewHolder$0(galleryItemHolder, view);
            }
        }, this.list.get(i).isChecked());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    @NonNull
    public GalleryItemHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new GalleryItemHolder(viewGroup);
    }
}
