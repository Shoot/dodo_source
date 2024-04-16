package im.threads.ui.holders;

import android.content.Context;
import android.graphics.Typeface;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import im.threads.R;
import im.threads.business.models.SystemMessage;
import im.threads.business.utils.UrlUtils;
import im.threads.ui.ChatStyle;
import im.threads.ui.config.Config;
import im.threads.ui.holders.SystemMessageViewHolder;
/* loaded from: classes3.dex */
public class SystemMessageViewHolder extends RecyclerView.d0 {
    private Context context;
    private ChatStyle style;
    private TextView tvSystemMessage;

    public SystemMessageViewHolder(@NonNull ViewGroup viewGroup) {
        super(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.ecc_item_system_message, viewGroup, false));
        this.context = viewGroup.getContext();
        this.tvSystemMessage = (TextView) this.itemView.findViewById(R.id.tv_system_message);
        if (this.style == null) {
            this.style = Config.getInstance().getChatStyle();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onBind$0(SystemMessage systemMessage, View view) {
        String extractDeepLink = UrlUtils.extractDeepLink(systemMessage.getText());
        String link = UrlUtils.extractLink(systemMessage.getText()).getLink();
        if (extractDeepLink != null) {
            UrlUtils.openUrl(this.context, extractDeepLink);
        } else if (link != null) {
            UrlUtils.openUrl(this.context, link);
        }
    }

    public void onBind(final SystemMessage systemMessage, View.OnClickListener onClickListener) {
        SpannableString spannableString = new SpannableString(systemMessage.getText());
        tq5.c(spannableString, UrlUtils.WEB_URL, "");
        this.tvSystemMessage.setText(spannableString);
        this.tvSystemMessage.setLinkTextColor(iu1.c(this.itemView.getContext(), this.style.systemMessageLinkColor));
        this.tvSystemMessage.setOnClickListener(new View.OnClickListener() { // from class: b5b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SystemMessageViewHolder.this.lambda$onBind$0(systemMessage, view);
            }
        });
        this.itemView.setOnClickListener(onClickListener);
        if (!TextUtils.isEmpty(this.style.systemMessageFont)) {
            this.tvSystemMessage.setTypeface(Typeface.createFromAsset(this.itemView.getContext().getAssets(), this.style.systemMessageFont));
        }
        this.tvSystemMessage.setTextSize(0, this.itemView.getContext().getResources().getDimension(this.style.systemMessageTextSize));
        this.tvSystemMessage.setTextColor(iu1.c(this.itemView.getContext(), this.style.systemMessageTextColorResId));
        this.tvSystemMessage.setGravity(this.style.systemMessageTextGravity);
        int dimension = (int) this.itemView.getContext().getResources().getDimension(this.style.systemMessageLeftRightPadding);
        TextView textView = this.tvSystemMessage;
        textView.setPadding(dimension, textView.getPaddingTop(), dimension, this.tvSystemMessage.getPaddingBottom());
    }
}
