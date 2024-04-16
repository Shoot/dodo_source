package im.threads.ui.widget.textView;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import im.threads.ui.ChatStyle;
import im.threads.ui.config.Config;
import im.threads.ui.widget.CustomFontTextView;
/* loaded from: classes3.dex */
public final class ToolbarTitleTextView extends CustomFontTextView {
    public ToolbarTitleTextView(Context context) {
        super(context);
    }

    @Override // im.threads.ui.widget.CustomFontTextView
    public void setTypefaceView(Context context) {
        ChatStyle chatStyle = Config.getInstance().getChatStyle();
        if (!TextUtils.isEmpty(chatStyle.toolbarTitleFont)) {
            setTypeface(Typeface.createFromAsset(context.getAssets(), chatStyle.toolbarTitleFont));
        } else {
            super.setTypefaceView(context);
        }
    }

    public ToolbarTitleTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
