package im.threads.ui.holders;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import im.threads.R;
import im.threads.ui.adapters.ChatAdapter;
/* loaded from: classes3.dex */
public final class RequestResolveThreadViewHolder extends BaseHolder {
    private final TextView approveRequest;
    private final TextView denyRequest;

    public RequestResolveThreadViewHolder(ViewGroup viewGroup) {
        super(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.ecc_item_request_resolve_thread, viewGroup, false), null, null);
        View findViewById = this.itemView.findViewById(R.id.top_separator);
        View findViewById2 = this.itemView.findViewById(R.id.bottom_separator);
        TextView textView = (TextView) this.itemView.findViewById(R.id.request_to_resolve_thread);
        TextView textView2 = (TextView) this.itemView.findViewById(R.id.approve_request);
        this.approveRequest = textView2;
        TextView textView3 = (TextView) this.itemView.findViewById(R.id.deny_request);
        this.denyRequest = textView3;
        findViewById.setBackgroundColor(iu1.c(this.itemView.getContext(), getStyle().iconsAndSeparatorsColor));
        findViewById2.setBackgroundColor(iu1.c(this.itemView.getContext(), getStyle().iconsAndSeparatorsColor));
        textView.setTextColor(iu1.c(this.itemView.getContext(), getStyle().chatSystemMessageTextColor));
        textView2.setTextColor(iu1.c(this.itemView.getContext(), getStyle().surveyChoicesTextColorResId));
        textView3.setTextColor(iu1.c(this.itemView.getContext(), getStyle().surveyChoicesTextColorResId));
        textView.setText(getStyle().requestToResolveThreadTextResId);
        textView2.setText(getStyle().approveRequestToResolveThreadTextResId);
        textView3.setText(getStyle().denyRequestToResolveThreadTextResId);
    }

    public void bind(final ChatAdapter.Callback callback) {
        this.approveRequest.setOnClickListener(new View.OnClickListener() { // from class: aj9
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChatAdapter.Callback.this.onResolveThreadClick(true);
            }
        });
        this.denyRequest.setOnClickListener(new View.OnClickListener() { // from class: bj9
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChatAdapter.Callback.this.onResolveThreadClick(false);
            }
        });
    }
}
