package im.threads.ui.holders;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.recyclerview.widget.RecyclerView;
import im.threads.R;
import im.threads.business.imageLoading.ImageLoader;
import im.threads.ui.ChatStyle;
import im.threads.ui.config.Config;
import im.threads.ui.utils.ColorsHelper;
/* loaded from: classes3.dex */
public final class GalleryItemHolder extends RecyclerView.d0 {
    private final AppCompatCheckBox mCheckBox;
    private final ImageView mImageView;
    private final ChatStyle mStyle;

    public GalleryItemHolder(ViewGroup viewGroup) {
        super(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.ecc_item_gallery_image, viewGroup, false));
        this.mImageView = (ImageView) this.itemView.findViewById(R.id.image);
        this.mCheckBox = (AppCompatCheckBox) this.itemView.findViewById(R.id.checkbox);
        this.mStyle = Config.getInstance().getChatStyle();
    }

    private void setButtonDrawable(boolean z) {
        Drawable b;
        if (z) {
            b = on.b(this.itemView.getContext(), this.mStyle.attachmentDoneIconResId);
            if (b != null) {
                ChatStyle chatStyle = this.mStyle;
                int i = chatStyle.chatBodyIconsTint;
                if (i == 0) {
                    i = chatStyle.attachmentBottomSheetButtonTintResId;
                }
                ColorsHelper.setDrawableColor(this.itemView.getContext(), b.mutate(), i);
            }
        } else {
            b = on.b(this.itemView.getContext(), R.drawable.ecc_ic_panorama_fish_eye_white_36dp);
        }
        this.mCheckBox.setButtonDrawable(b);
    }

    public void onBind(Uri uri, View.OnClickListener onClickListener, boolean z) {
        if (this.mImageView != null) {
            ImageLoader.get().load(uri.toString()).disableEdnaSsl().scales(ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.CENTER_CROP).into(this.mImageView);
            this.mCheckBox.setChecked(z);
            setButtonDrawable(z);
            this.mCheckBox.setOnClickListener(onClickListener);
            this.mImageView.setOnClickListener(onClickListener);
        }
    }
}
