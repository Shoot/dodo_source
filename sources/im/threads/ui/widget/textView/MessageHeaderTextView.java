package im.threads.ui.widget.textView;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import im.threads.ui.ChatStyle;
import im.threads.ui.config.Config;
import im.threads.ui.widget.BoldCustomFontTextView;
/* loaded from: classes3.dex */
public final class MessageHeaderTextView extends BoldCustomFontTextView {
    public MessageHeaderTextView(Context context) {
        super(context);
    }

    @Override // im.threads.ui.widget.BoldCustomFontTextView
    public void setTypefaceView(Context context) {
        ChatStyle chatStyle = Config.getInstance().getChatStyle();
        if (!TextUtils.isEmpty(chatStyle.messageHeaderFont)) {
            setTypeface(Typeface.createFromAsset(context.getAssets(), chatStyle.messageHeaderFont));
        } else {
            super.setTypefaceView(context);
        }
    }

    public MessageHeaderTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
