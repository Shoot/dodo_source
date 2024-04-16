package im.threads.ui.widget.textView;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import im.threads.ui.ChatStyle;
import im.threads.ui.config.Config;
import im.threads.ui.widget.CustomFontTextView;
/* loaded from: classes3.dex */
public final class InputQuotedMessageTextView extends CustomFontTextView {
    public InputQuotedMessageTextView(Context context) {
        super(context);
    }

    @Override // im.threads.ui.widget.CustomFontTextView
    public void setTypefaceView(Context context) {
        ChatStyle chatStyle = Config.getInstance().getChatStyle();
        if (!TextUtils.isEmpty(chatStyle.inputQuotedMessageFont)) {
            setTypeface(Typeface.createFromAsset(context.getAssets(), chatStyle.inputQuotedMessageFont));
        } else {
            super.setTypefaceView(context);
        }
    }

    public InputQuotedMessageTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
