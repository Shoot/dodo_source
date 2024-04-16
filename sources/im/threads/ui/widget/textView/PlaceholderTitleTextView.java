package im.threads.ui.widget.textView;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import im.threads.ui.ChatStyle;
import im.threads.ui.config.Config;
import im.threads.ui.widget.BoldCustomFontTextView;
/* loaded from: classes3.dex */
public final class PlaceholderTitleTextView extends BoldCustomFontTextView {
    public PlaceholderTitleTextView(Context context) {
        super(context);
    }

    @Override // im.threads.ui.widget.BoldCustomFontTextView
    public void setTypefaceView(Context context) {
        ChatStyle chatStyle = Config.getInstance().getChatStyle();
        if (!TextUtils.isEmpty(chatStyle.placeholderTitleFont)) {
            setTypeface(Typeface.createFromAsset(context.getAssets(), chatStyle.placeholderTitleFont));
        } else {
            super.setTypefaceView(context);
        }
    }

    public PlaceholderTitleTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
