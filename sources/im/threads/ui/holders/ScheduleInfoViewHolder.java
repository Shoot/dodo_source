package im.threads.ui.holders;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import im.threads.R;
import im.threads.business.models.ScheduleInfo;
import im.threads.ui.ChatStyle;
import im.threads.ui.config.Config;
/* loaded from: classes3.dex */
public final class ScheduleInfoViewHolder extends RecyclerView.d0 {
    private ImageView icon;
    private ChatStyle style;
    private TextView text;

    public ScheduleInfoViewHolder(ViewGroup viewGroup) {
        super(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.ecc_item_schedule_info, viewGroup, false));
        this.icon = (ImageView) this.itemView.findViewById(R.id.schedule_icon);
        this.text = (TextView) this.itemView.findViewById(R.id.schedule_text);
        this.style = Config.getInstance().getChatStyle();
        this.text.setTextColor(iu1.c(this.itemView.getContext(), this.style.scheduleMessageTextColorResId));
        this.icon.setImageResource(this.style.scheduleMessageIconResId);
    }

    public void bind(ScheduleInfo scheduleInfo) {
        String notification = scheduleInfo.getNotification();
        TextView textView = this.text;
        if (notification == null) {
            notification = "";
        }
        textView.setText(notification);
    }
}
