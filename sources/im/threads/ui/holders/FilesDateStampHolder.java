package im.threads.ui.holders;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import im.threads.R;
import im.threads.business.formatters.RussianFormatSymbols;
import im.threads.ui.ChatStyle;
import im.threads.ui.config.Config;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
/* loaded from: classes3.dex */
public final class FilesDateStampHolder extends RecyclerView.d0 {
    private TextView mDateTextView;
    private SimpleDateFormat sdf;
    private ChatStyle style;

    public FilesDateStampHolder(ViewGroup viewGroup) {
        super(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.ecc_item_files_date_mark, viewGroup, false));
        this.mDateTextView = (TextView) this.itemView.findViewById(R.id.text);
        LinearLayout linearLayout = (LinearLayout) this.itemView.findViewById(R.id.line);
        if (Locale.getDefault().getLanguage().equalsIgnoreCase("ru")) {
            this.sdf = new SimpleDateFormat("dd MMMM yyyy", new RussianFormatSymbols());
        } else {
            this.sdf = new SimpleDateFormat("dd MMMM yyyy", Locale.getDefault());
        }
        if (this.style == null) {
            this.style = Config.getInstance().getChatStyle();
        }
        this.mDateTextView.setTextColor(iu1.c(this.itemView.getContext(), this.style.chatSystemMessageTextColor));
        linearLayout.setBackgroundColor(iu1.c(this.itemView.getContext(), this.style.chatBackgroundColor));
    }

    public void onBind(long j) {
        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        if (calendar.get(6) == calendar2.get(6)) {
            this.mDateTextView.setText(this.itemView.getResources().getString(R.string.ecc_recently));
        } else if (calendar2.get(6) - calendar.get(6) == 1) {
            this.mDateTextView.setText(this.itemView.getResources().getString(R.string.ecc_yesterday));
        } else {
            this.mDateTextView.setText(this.sdf.format(new Date(j)));
        }
    }
}
