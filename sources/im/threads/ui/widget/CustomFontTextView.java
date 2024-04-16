package im.threads.ui.widget;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import im.threads.ui.ChatStyle;
import im.threads.ui.config.Config;
/* loaded from: classes3.dex */
public class CustomFontTextView extends AppCompatTextView {
    public CustomFontTextView(Context context) {
        super(context);
        init(context);
    }

    private ChatStyle getChatStyle() {
        try {
            return Config.getInstance().getChatStyle();
        } catch (NullPointerException unused) {
            return new ChatStyle();
        }
    }

    private void init(Context context) {
        if (isInEditMode()) {
            return;
        }
        setTypefaceView(context);
    }

    public void setTypefaceView(Context context) {
        ChatStyle chatStyle = getChatStyle();
        if (!TextUtils.isEmpty(chatStyle.defaultFontRegular)) {
            setTypeface(Typeface.createFromAsset(context.getAssets(), chatStyle.defaultFontRegular));
        }
    }

    public CustomFontTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context);
    }
}
