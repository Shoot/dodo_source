package im.threads.ui.holders;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import im.threads.R;
import im.threads.business.formatters.RussianFormatSymbols;
import im.threads.ui.ChatStyle;
import im.threads.ui.config.Config;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
/* loaded from: classes3.dex */
public final class DateViewHolder extends RecyclerView.d0 {
    private TextView mTextView;
    private SimpleDateFormat sdf;

    public DateViewHolder(ViewGroup viewGroup) {
        super(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.ecc_item_date, viewGroup, false));
        this.mTextView = (TextView) this.itemView.findViewById(R.id.text);
        ChatStyle chatStyle = Config.getInstance().getChatStyle();
        if (Locale.getDefault().getLanguage().equalsIgnoreCase("ru")) {
            this.sdf = new SimpleDateFormat("dd MMMM yyyy", new RussianFormatSymbols());
        } else {
            this.sdf = new SimpleDateFormat("dd MMMM yyyy", Locale.getDefault());
        }
        this.mTextView.setTextColor(iu1.c(this.itemView.getContext(), chatStyle.chatSystemMessageTextColor));
    }

    public void onBind(long j) {
        this.mTextView.setText(this.sdf.format(new Date(j)));
    }
}
