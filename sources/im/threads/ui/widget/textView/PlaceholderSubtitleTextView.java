package im.threads.ui.widget.textView;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import im.threads.ui.ChatStyle;
import im.threads.ui.config.Config;
import im.threads.ui.widget.CustomFontTextView;
/* loaded from: classes3.dex */
public final class PlaceholderSubtitleTextView extends CustomFontTextView {
    public PlaceholderSubtitleTextView(Context context) {
        super(context);
    }

    @Override // im.threads.ui.widget.CustomFontTextView
    public void setTypefaceView(Context context) {
        ChatStyle chatStyle = Config.getInstance().getChatStyle();
        if (!TextUtils.isEmpty(chatStyle.placeholderSubtitleFont)) {
            setTypeface(Typeface.createFromAsset(context.getAssets(), chatStyle.placeholderSubtitleFont));
        } else {
            super.setTypefaceView(context);
        }
    }

    public PlaceholderSubtitleTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
