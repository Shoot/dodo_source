package im.threads.ui.holders;

import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import im.threads.R;
import im.threads.business.imageLoading.ImageLoader;
/* loaded from: classes3.dex */
public final class GalleryBucketImageHolder extends RecyclerView.d0 {
    private ImageView mImageView;
    private TextView mNameTextView;
    private TextView mSizeTextView;

    public GalleryBucketImageHolder(ViewGroup viewGroup) {
        super(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.ecc_item_gallery_bucket, viewGroup, false));
        this.mImageView = (ImageView) this.itemView.findViewById(R.id.image);
        this.mNameTextView = (TextView) this.itemView.findViewById(R.id.bucket_name);
        this.mSizeTextView = (TextView) this.itemView.findViewById(R.id.photos_count);
    }

    public void onBind(String str, String str2, Uri uri, View.OnClickListener onClickListener) {
        ViewGroup viewGroup = (ViewGroup) this.itemView;
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            if (onClickListener != null) {
                viewGroup.getChildAt(i).setOnClickListener(onClickListener);
            }
        }
        ImageLoader.get().load(uri.toString()).disableEdnaSsl().autoRotateWithExif(true).scales(ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.CENTER_CROP).into(this.mImageView);
        this.mNameTextView.setText(str);
        this.mSizeTextView.setText(str2);
    }
}
