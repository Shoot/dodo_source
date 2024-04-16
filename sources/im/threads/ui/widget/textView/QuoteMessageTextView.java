package im.threads.ui.widget.textView;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import im.threads.ui.ChatStyle;
import im.threads.ui.config.Config;
import im.threads.ui.widget.LightCustomFontTextView;
/* loaded from: classes3.dex */
public final class QuoteMessageTextView extends LightCustomFontTextView {
    public QuoteMessageTextView(Context context) {
        super(context);
    }

    @Override // im.threads.ui.widget.LightCustomFontTextView
    public void setTypefaceView(Context context) {
        ChatStyle chatStyle = Config.getInstance().getChatStyle();
        if (!TextUtils.isEmpty(chatStyle.quoteMessageFont)) {
            setTypeface(Typeface.createFromAsset(context.getAssets(), chatStyle.quoteMessageFont));
        } else {
            super.setTypefaceView(context);
        }
    }

    public QuoteMessageTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
