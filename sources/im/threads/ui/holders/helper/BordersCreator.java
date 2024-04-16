package im.threads.ui.holders.helper;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import ch.qos.logback.core.CoreConstants;
import com.inappstory.sdk.stories.ui.widgets.readerscreen.generated.ElementGenerator;
import im.threads.R;
import im.threads.ui.config.Config;
import im.threads.ui.widget.textView.BubbleTimeTextView;
import kotlin.Metadata;
/* compiled from: BordersCreator.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001dB\u0017\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u001b\u0010\u001cJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u001e\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0016\u001a\u00020\u00118FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001e"}, d2 = {"Lim/threads/ui/holders/helper/BordersCreator;", "", "Lim/threads/ui/widget/textView/BubbleTimeTextView;", "timeLabel", "", "moveTimeToImageLayout", "Landroid/view/View;", "view", "parentView", "rootView", "addMargins", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "", "isIncomingMessage", "Z", "", "sideSize$delegate", "Lrn5;", "getSideSize", "()I", "sideSize", "Lim/threads/ui/holders/helper/BordersCreator$BordersSize;", "getBorders", "()Lim/threads/ui/holders/helper/BordersCreator$BordersSize;", "borders", "<init>", "(Landroid/content/Context;Z)V", "BordersSize", "threads_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class BordersCreator {
    private final Context context;
    private final boolean isIncomingMessage;
    private final rn5 sideSize$delegate;

    /* compiled from: BordersCreator.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, d2 = {"Lim/threads/ui/holders/helper/BordersCreator$BordersSize;", "", ElementGenerator.TEXT_ALIGN_LEFT, "", "top", ElementGenerator.TEXT_ALIGN_RIGHT, "bottom", "(IIII)V", "getBottom", "()I", "getLeft", "getRight", "getTop", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class BordersSize {
        private final int bottom;
        private final int left;
        private final int right;
        private final int top;

        public BordersSize(int i, int i2, int i3, int i4) {
            this.left = i;
            this.top = i2;
            this.right = i3;
            this.bottom = i4;
        }

        public static /* synthetic */ BordersSize copy$default(BordersSize bordersSize, int i, int i2, int i3, int i4, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                i = bordersSize.left;
            }
            if ((i5 & 2) != 0) {
                i2 = bordersSize.top;
            }
            if ((i5 & 4) != 0) {
                i3 = bordersSize.right;
            }
            if ((i5 & 8) != 0) {
                i4 = bordersSize.bottom;
            }
            return bordersSize.copy(i, i2, i3, i4);
        }

        public final int component1() {
            return this.left;
        }

        public final int component2() {
            return this.top;
        }

        public final int component3() {
            return this.right;
        }

        public final int component4() {
            return this.bottom;
        }

        public final BordersSize copy(int i, int i2, int i3, int i4) {
            return new BordersSize(i, i2, i3, i4);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BordersSize)) {
                return false;
            }
            BordersSize bordersSize = (BordersSize) obj;
            if (this.left == bordersSize.left && this.top == bordersSize.top && this.right == bordersSize.right && this.bottom == bordersSize.bottom) {
                return true;
            }
            return false;
        }

        public final int getBottom() {
            return this.bottom;
        }

        public final int getLeft() {
            return this.left;
        }

        public final int getRight() {
            return this.right;
        }

        public final int getTop() {
            return this.top;
        }

        public int hashCode() {
            return (((((this.left * 31) + this.top) * 31) + this.right) * 31) + this.bottom;
        }

        public String toString() {
            int i = this.left;
            int i2 = this.top;
            int i3 = this.right;
            int i4 = this.bottom;
            return "BordersSize(left=" + i + ", top=" + i2 + ", right=" + i3 + ", bottom=" + i4 + ")";
        }
    }

    public BordersCreator(Context context, boolean z) {
        rn5 b;
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.context = context;
        this.isIncomingMessage = z;
        b = yn5.b(BordersCreator$sideSize$2.INSTANCE);
        this.sideSize$delegate = b;
    }

    private final BordersSize getBorders() {
        Resources resources = this.context.getResources();
        if (this.isIncomingMessage) {
            Config.Companion companion = Config.Companion;
            return new BordersSize(resources.getDimensionPixelSize(companion.getInstance().getChatStyle().incomingImageLeftBorderSize), resources.getDimensionPixelSize(companion.getInstance().getChatStyle().incomingImageTopBorderSize), resources.getDimensionPixelSize(companion.getInstance().getChatStyle().incomingImageRightBorderSize), resources.getDimensionPixelSize(companion.getInstance().getChatStyle().incomingImageBottomBorderSize));
        }
        Config.Companion companion2 = Config.Companion;
        return new BordersSize(resources.getDimensionPixelSize(companion2.getInstance().getChatStyle().outgoingImageLeftBorderSize), resources.getDimensionPixelSize(companion2.getInstance().getChatStyle().outgoingImageTopBorderSize), resources.getDimensionPixelSize(companion2.getInstance().getChatStyle().outgoingImageRightBorderSize), resources.getDimensionPixelSize(companion2.getInstance().getChatStyle().outgoingImageBottomBorderSize));
    }

    public final void addMargins(View view, View view2, View view3) {
        int i;
        z65.h(view, "view");
        z65.h(view2, "parentView");
        z65.h(view3, "rootView");
        Resources resources = this.context.getResources();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        z65.f(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMargins(getBorders().getLeft(), getBorders().getTop(), getBorders().getRight(), getBorders().getBottom());
        view.setLayoutParams(marginLayoutParams);
        view.invalidate();
        view.requestLayout();
        ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
        z65.f(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
        if (this.isIncomingMessage) {
            i = resources.getDimensionPixelSize(R.dimen.ecc_margin_eight);
        } else {
            i = 0;
        }
        if (getBorders().getLeft() > 0) {
            i = 0;
        }
        marginLayoutParams2.setMargins(i, getBorders().getTop(), 0, 0);
        view2.setLayoutParams(marginLayoutParams2);
        view2.invalidate();
        view2.requestLayout();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.ecc_margin_quarter);
        ViewGroup.LayoutParams layoutParams3 = view3.getLayoutParams();
        z65.f(layoutParams3, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
        if (getBorders().getTop() < dimensionPixelSize) {
            marginLayoutParams3.topMargin = dimensionPixelSize - getBorders().getTop();
        }
        if (getBorders().getBottom() < dimensionPixelSize) {
            marginLayoutParams3.bottomMargin = dimensionPixelSize - getBorders().getBottom();
        }
    }

    public final int getSideSize() {
        return ((Number) this.sideSize$delegate.getValue()).intValue();
    }

    public final void moveTimeToImageLayout(BubbleTimeTextView bubbleTimeTextView) {
        z65.h(bubbleTimeTextView, "timeLabel");
        if (!z65.c(bubbleTimeTextView.getTag(), "moved_to_picture")) {
            ViewGroup.LayoutParams layoutParams = bubbleTimeTextView.getLayoutParams();
            z65.f(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMarginEnd(marginLayoutParams.getMarginEnd() + getBorders().getRight());
            marginLayoutParams.bottomMargin += getBorders().getBottom();
            bubbleTimeTextView.setLayoutParams(marginLayoutParams);
            bubbleTimeTextView.setTag("moved_to_picture");
        }
    }
}
