package im.threads.ui.holders;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.inappstory.sdk.stories.ui.widgets.readerscreen.generated.ElementGenerator;
import im.threads.R;
import im.threads.business.models.ChatItem;
import im.threads.business.ogParser.OpenGraphParser;
import im.threads.ui.ChatStyle;
import im.threads.ui.config.Config;
import im.threads.ui.holders.helper.BordersCreator;
import im.threads.ui.widget.textView.BubbleTimeTextView;
import kotlin.Metadata;
/* compiled from: BaseImageHolder.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\"\u001a\u00020!\u0012\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010#\u0012\b\u0010'\u001a\u0004\u0018\u00010&\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b(\u0010)J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0006\u0010\u0004\u001a\u00020\u0002R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001a\u0010\t\u001a\u00020\b8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\u00020\r8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\u00020\u00128\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u00128\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u001a\u0010\u001a\u001a\u00020\u00198\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006*"}, d2 = {"Lim/threads/ui/holders/BaseImageHolder;", "Lim/threads/ui/holders/BaseHolder;", "", "applyImageStyle", "moveTimeToImageLayout", "", "isIncomingMessage", "Z", "Landroid/widget/LinearLayout;", "rootLayout", "Landroid/widget/LinearLayout;", "getRootLayout", "()Landroid/widget/LinearLayout;", "Landroid/widget/ImageView;", ElementGenerator.TYPE_IMAGE, "Landroid/widget/ImageView;", "getImage", "()Landroid/widget/ImageView;", "Landroid/widget/FrameLayout;", "imageLayout", "Landroid/widget/FrameLayout;", "getImageLayout", "()Landroid/widget/FrameLayout;", "imageBackground", "getImageBackground", "Lim/threads/ui/widget/textView/BubbleTimeTextView;", "timeStampTextView", "Lim/threads/ui/widget/textView/BubbleTimeTextView;", "getTimeStampTextView", "()Lim/threads/ui/widget/textView/BubbleTimeTextView;", "Lim/threads/ui/holders/helper/BordersCreator;", "bordersCreator", "Lim/threads/ui/holders/helper/BordersCreator;", "Landroid/view/View;", "itemView", "Lks8;", "Lim/threads/business/models/ChatItem;", "highlightingStream", "Lim/threads/business/ogParser/OpenGraphParser;", "openGraphParser", "<init>", "(Landroid/view/View;Lks8;Lim/threads/business/ogParser/OpenGraphParser;Z)V", "threads_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes3.dex */
public class BaseImageHolder extends BaseHolder {
    private final BordersCreator bordersCreator;
    private final ImageView image;
    private final FrameLayout imageBackground;
    private final FrameLayout imageLayout;
    private final boolean isIncomingMessage;
    private final LinearLayout rootLayout;
    private final BubbleTimeTextView timeStampTextView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseImageHolder(View view, ks8<ChatItem> ks8Var, OpenGraphParser openGraphParser, boolean z) {
        super(view, ks8Var, openGraphParser);
        int i;
        int i2;
        int i3;
        z65.h(view, "itemView");
        this.isIncomingMessage = z;
        View findViewById = view.findViewById(R.id.rootLayout);
        z65.g(findViewById, "itemView.findViewById(R.id.rootLayout)");
        this.rootLayout = (LinearLayout) findViewById;
        View findViewById2 = view.findViewById(R.id.image);
        z65.g(findViewById2, "itemView.findViewById(R.id.image)");
        this.image = (ImageView) findViewById2;
        View findViewById3 = view.findViewById(R.id.imageLayout);
        z65.g(findViewById3, "itemView.findViewById(R.id.imageLayout)");
        this.imageLayout = (FrameLayout) findViewById3;
        View findViewById4 = view.findViewById(R.id.imageBackground);
        z65.g(findViewById4, "itemView.findViewById(R.id.imageBackground)");
        this.imageBackground = (FrameLayout) findViewById4;
        View findViewById5 = view.findViewById(R.id.timeStamp);
        BubbleTimeTextView bubbleTimeTextView = (BubbleTimeTextView) findViewById5;
        ChatStyle style = getStyle();
        if (z) {
            i = style.incomingImageTimeColor;
        } else {
            i = style.outgoingImageTimeColor;
        }
        bubbleTimeTextView.setTextColor(getColorInt(i));
        ChatStyle style2 = getStyle();
        if (z) {
            i2 = style2.incomingMessageTimeTextSize;
        } else {
            i2 = style2.outgoingMessageTimeTextSize;
        }
        if (i2 > 0) {
            bubbleTimeTextView.setTextSize(0, view.getContext().getResources().getDimension(i2));
        }
        if (z) {
            i3 = getStyle().incomingImageTimeBackgroundColor;
        } else {
            i3 = getStyle().outgoingImageTimeBackgroundColor;
        }
        bubbleTimeTextView.getBackground().setColorFilter(qc0.a(getColorInt(i3), uc0.SRC_ATOP));
        z65.g(findViewById5, "itemView.findViewById<Bu….SRC_ATOP\n        )\n    }");
        this.timeStampTextView = bubbleTimeTextView;
        Context context = view.getContext();
        z65.g(context, "itemView.context");
        this.bordersCreator = new BordersCreator(context, z);
        applyImageStyle();
    }

    private final void applyImageStyle() {
        int i;
        int i2;
        ChatStyle chatStyle = Config.Companion.getInstance().getChatStyle();
        boolean z = this.isIncomingMessage;
        if (z) {
            i = chatStyle.incomingMessageBubbleBackground;
        } else {
            i = chatStyle.outgoingMessageBubbleBackground;
        }
        if (z) {
            i2 = chatStyle.incomingMessageBubbleColor;
        } else {
            i2 = chatStyle.outgoingMessageBubbleColor;
        }
        this.imageBackground.setBackground(iu1.e(this.itemView.getContext(), i));
        this.imageBackground.getBackground().setColorFilter(qc0.a(getColorInt(i2), uc0.SRC_ATOP));
        setImageSize(this.imageLayout);
        BordersCreator bordersCreator = this.bordersCreator;
        ImageView imageView = this.image;
        FrameLayout frameLayout = this.imageLayout;
        View view = this.itemView;
        z65.g(view, "itemView");
        bordersCreator.addMargins(imageView, frameLayout, view);
        setLayoutMargins(this.isIncomingMessage, this.imageLayout);
        this.rootLayout.invalidate();
        this.rootLayout.requestLayout();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final ImageView getImage() {
        return this.image;
    }

    protected final FrameLayout getImageBackground() {
        return this.imageBackground;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final FrameLayout getImageLayout() {
        return this.imageLayout;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final LinearLayout getRootLayout() {
        return this.rootLayout;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final BubbleTimeTextView getTimeStampTextView() {
        return this.timeStampTextView;
    }

    public final void moveTimeToImageLayout() {
        this.bordersCreator.moveTimeToImageLayout(this.timeStampTextView);
    }
}
