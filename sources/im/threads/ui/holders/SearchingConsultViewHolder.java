package im.threads.ui.holders;

import android.graphics.PorterDuff;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.recyclerview.widget.RecyclerView;
import im.threads.BuildConfig;
import im.threads.R;
import im.threads.ui.ChatStyle;
import im.threads.ui.config.Config;
/* loaded from: classes3.dex */
public final class SearchingConsultViewHolder extends RecyclerView.d0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchingConsultViewHolder(ViewGroup viewGroup) {
        super(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.ecc_item_searching_consult, viewGroup, false));
        int i;
        int i2 = 0;
        ProgressBar progressBar = (ProgressBar) this.itemView.findViewById(R.id.progress);
        ChatStyle chatStyle = Config.getInstance().getChatStyle();
        progressBar.getIndeterminateDrawable().setColorFilter(iu1.c(this.itemView.getContext(), chatStyle.consultSearchingProgressColor), PorterDuff.Mode.SRC_ATOP);
        boolean z = BuildConfig.IS_ANIMATIONS_DISABLED.get();
        View view = this.itemView;
        if (chatStyle.showConsultSearching && !z) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
        progressBar.setVisibility((!chatStyle.showConsultSearching || z) ? 8 : 8);
    }
}
