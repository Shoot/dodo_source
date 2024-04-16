package im.threads.ui.holders;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import im.threads.R;
/* loaded from: classes3.dex */
public final class SpaceViewHolder extends RecyclerView.d0 {
    private View root;

    public SpaceViewHolder(ViewGroup viewGroup) {
        super(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.ecc_item_free_space, viewGroup, false));
        this.root = this.itemView.findViewById(R.id.root);
    }

    public void onBind(int i) {
        this.root.setLayoutParams(new ViewGroup.LayoutParams(-1, i));
    }
}
