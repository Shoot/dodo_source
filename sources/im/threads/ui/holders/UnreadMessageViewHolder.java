package im.threads.ui.holders;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import im.threads.R;
import im.threads.business.models.UnreadMessages;
import im.threads.ui.config.Config;
/* loaded from: classes3.dex */
public final class UnreadMessageViewHolder extends RecyclerView.d0 {
    private TextView mTextView;

    public UnreadMessageViewHolder(ViewGroup viewGroup) {
        super(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.ecc_item_unread_counter, viewGroup, false));
        this.mTextView = (TextView) this.itemView.findViewById(R.id.text);
        this.mTextView.setTextColor(iu1.c(this.itemView.getContext(), Config.getInstance().getChatStyle().chatSystemMessageTextColor));
    }

    public void onBind(UnreadMessages unreadMessages) {
        TextView textView = this.mTextView;
        textView.setText(unreadMessages.getMessage(textView.getContext()));
    }
}
