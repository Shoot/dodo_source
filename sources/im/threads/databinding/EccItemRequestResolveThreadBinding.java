package im.threads.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import im.threads.R;
import im.threads.ui.widget.textView.BubbleMessageTextView;
/* loaded from: classes3.dex */
public final class EccItemRequestResolveThreadBinding {
    @NonNull
    public final BubbleMessageTextView approveRequest;
    @NonNull
    public final View bottomSeparator;
    @NonNull
    public final BubbleMessageTextView denyRequest;
    @NonNull
    public final BubbleMessageTextView requestToResolveThread;
    @NonNull
    private final LinearLayout rootView;
    @NonNull
    public final View topSeparator;

    private EccItemRequestResolveThreadBinding(@NonNull LinearLayout linearLayout, @NonNull BubbleMessageTextView bubbleMessageTextView, @NonNull View view, @NonNull BubbleMessageTextView bubbleMessageTextView2, @NonNull BubbleMessageTextView bubbleMessageTextView3, @NonNull View view2) {
        this.rootView = linearLayout;
        this.approveRequest = bubbleMessageTextView;
        this.bottomSeparator = view;
        this.denyRequest = bubbleMessageTextView2;
        this.requestToResolveThread = bubbleMessageTextView3;
        this.topSeparator = view2;
    }

    @NonNull
    public static EccItemRequestResolveThreadBinding bind(@NonNull View view) {
        View a;
        View a2;
        int i = R.id.approve_request;
        BubbleMessageTextView bubbleMessageTextView = (BubbleMessageTextView) pyb.a(view, i);
        if (bubbleMessageTextView != null && (a = pyb.a(view, (i = R.id.bottom_separator))) != null) {
            i = R.id.deny_request;
            BubbleMessageTextView bubbleMessageTextView2 = (BubbleMessageTextView) pyb.a(view, i);
            if (bubbleMessageTextView2 != null) {
                i = R.id.request_to_resolve_thread;
                BubbleMessageTextView bubbleMessageTextView3 = (BubbleMessageTextView) pyb.a(view, i);
                if (bubbleMessageTextView3 != null && (a2 = pyb.a(view, (i = R.id.top_separator))) != null) {
                    return new EccItemRequestResolveThreadBinding((LinearLayout) view, bubbleMessageTextView, a, bubbleMessageTextView2, bubbleMessageTextView3, a2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static EccItemRequestResolveThreadBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static EccItemRequestResolveThreadBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.ecc_item_request_resolve_thread, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
