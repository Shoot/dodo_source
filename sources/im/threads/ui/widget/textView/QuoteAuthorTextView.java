package im.threads.ui.widget.textView;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import im.threads.ui.ChatStyle;
import im.threads.ui.config.Config;
import im.threads.ui.widget.BoldCustomFontTextView;
/* loaded from: classes3.dex */
public final class QuoteAuthorTextView extends BoldCustomFontTextView {
    public QuoteAuthorTextView(Context context) {
        super(context);
    }

    @Override // im.threads.ui.widget.BoldCustomFontTextView
    public void setTypefaceView(Context context) {
        ChatStyle chatStyle = Config.getInstance().getChatStyle();
        if (!TextUtils.isEmpty(chatStyle.quoteAuthorFont)) {
            setTypeface(Typeface.createFromAsset(context.getAssets(), chatStyle.quoteAuthorFont));
        } else {
            super.setTypefaceView(context);
        }
    }

    public QuoteAuthorTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
