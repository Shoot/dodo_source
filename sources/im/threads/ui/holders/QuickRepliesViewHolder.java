package im.threads.ui.holders;

import android.content.Context;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.ConstraintLayout;
import im.threads.R;
import im.threads.business.models.QuickReply;
import im.threads.business.models.QuickReplyItem;
import im.threads.ui.adapters.ChatAdapter;
import im.threads.ui.holders.QuickRepliesViewHolder;
import im.threads.ui.utils.ViewExtensionsKt;
import im.threads.ui.widget.CustomFontTextView;
import java.util.List;
import kotlin.Metadata;
/* compiled from: QuickRepliesViewHolder.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\b\u0010\u0016\u001a\u00020\u0011H\u0002R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lim/threads/ui/holders/QuickRepliesViewHolder;", "Lim/threads/ui/holders/BaseHolder;", "parent", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)V", "attachedViews", "", "Landroid/view/View;", "chipGroup", "Landroidx/constraintlayout/helper/widget/Flow;", "getParent", "()Landroid/view/ViewGroup;", "rootLayout", "Landroidx/constraintlayout/widget/ConstraintLayout;", "screenSize", "Landroid/util/Size;", "bind", "", "quickReplies", "Lim/threads/business/models/QuickReplyItem;", "callback", "Lim/threads/ui/adapters/ChatAdapter$Callback;", "removeAllViews", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class QuickRepliesViewHolder extends BaseHolder {
    private final List<View> attachedViews;
    private final Flow chipGroup;
    private final ViewGroup parent;
    private final ConstraintLayout rootLayout;
    private final Size screenSize;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public QuickRepliesViewHolder(android.view.ViewGroup r10) {
        /*
            r9 = this;
            java.lang.String r0 = "parent"
            defpackage.z65.h(r10, r0)
            android.content.Context r0 = r10.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            int r1 = im.threads.R.layout.ecc_item_quick_replies
            r2 = 0
            android.view.View r4 = r0.inflate(r1, r10, r2)
            java.lang.String r0 = "from(parent.context).inf…k_replies, parent, false)"
            defpackage.z65.g(r4, r0)
            r5 = 0
            r6 = 0
            r7 = 6
            r8 = 0
            r3 = r9
            r3.<init>(r4, r5, r6, r7, r8)
            r9.parent = r10
            android.view.View r0 = r9.itemView
            int r1 = im.threads.R.id.chipGroup
            android.view.View r0 = r0.findViewById(r1)
            java.lang.String r1 = "itemView.findViewById(R.id.chipGroup)"
            defpackage.z65.g(r0, r1)
            androidx.constraintlayout.helper.widget.Flow r0 = (androidx.constraintlayout.helper.widget.Flow) r0
            r9.chipGroup = r0
            android.view.View r0 = r9.itemView
            int r1 = im.threads.R.id.quickRepliesRootLayout
            android.view.View r0 = r0.findViewById(r1)
            java.lang.String r1 = "itemView.findViewById(R.id.quickRepliesRootLayout)"
            defpackage.z65.g(r0, r1)
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r9.rootLayout = r0
            im.threads.ui.utils.ScreenSizeGetter r0 = new im.threads.ui.utils.ScreenSizeGetter
            r0.<init>()
            android.content.Context r10 = r10.getContext()
            java.lang.String r1 = "parent.context"
            defpackage.z65.g(r10, r1)
            android.util.Size r10 = r0.getScreenSize(r10)
            r9.screenSize = r10
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            r9.attachedViews = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: im.threads.ui.holders.QuickRepliesViewHolder.<init>(android.view.ViewGroup):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$0(ChatAdapter.Callback callback, QuickReply quickReply, View view) {
        z65.h(callback, "$callback");
        z65.h(quickReply, "$repl");
        callback.onQuickReplyClick(quickReply);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$1(QuickRepliesViewHolder quickRepliesViewHolder, View view) {
        z65.h(quickRepliesViewHolder, "this$0");
        Context context = quickRepliesViewHolder.parent.getContext();
        z65.g(context, "parent.context");
        float width = quickRepliesViewHolder.screenSize.getWidth() - (ViewExtensionsKt.dpToPx(context, 16) * 2);
        if (view.getWidth() > width) {
            view.getLayoutParams().width = (int) width;
            view.requestLayout();
        }
    }

    private final void removeAllViews() {
        for (View view : this.attachedViews) {
            try {
                this.rootLayout.removeView(view);
            } catch (Exception unused) {
            }
        }
        this.chipGroup.setReferencedIds(new int[0]);
        this.attachedViews.clear();
    }

    public final void bind(QuickReplyItem quickReplyItem, final ChatAdapter.Callback callback) {
        z65.h(quickReplyItem, "quickReplies");
        z65.h(callback, "callback");
        removeAllViews();
        for (final QuickReply quickReply : quickReplyItem.getItems()) {
            final View inflate = LayoutInflater.from(this.parent.getContext()).inflate(R.layout.ecc_layout_chip, (ViewGroup) null, false);
            CustomFontTextView customFontTextView = (CustomFontTextView) inflate.findViewById(R.id.chip);
            customFontTextView.setText(quickReply.getText());
            customFontTextView.setBackgroundResource(getStyle().quickReplyButtonBackground);
            customFontTextView.setTextColor(iu1.c(this.parent.getContext(), getStyle().quickReplyTextColor));
            customFontTextView.setOnClickListener(new View.OnClickListener() { // from class: hv8
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    QuickRepliesViewHolder.bind$lambda$0(ChatAdapter.Callback.this, quickReply, view);
                }
            });
            inflate.setId(View.generateViewId());
            inflate.setRotationY(180.0f);
            this.rootLayout.addView(inflate, this.attachedViews.size());
            this.chipGroup.h(inflate);
            List<View> list = this.attachedViews;
            z65.g(inflate, "view");
            list.add(inflate);
            inflate.post(new Runnable() { // from class: iv8
                @Override // java.lang.Runnable
                public final void run() {
                    QuickRepliesViewHolder.bind$lambda$1(QuickRepliesViewHolder.this, inflate);
                }
            });
        }
    }

    public final ViewGroup getParent() {
        return this.parent;
    }
}
