package im.threads.ui.widget;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatButton;
import im.threads.ui.ChatStyle;
import im.threads.ui.config.Config;
/* loaded from: classes3.dex */
public final class CustomFontButton extends AppCompatButton {
    public CustomFontButton(Context context) {
        super(context);
        if (isInEditMode()) {
            return;
        }
        setTypefaceView(context);
    }

    public void setTypefaceView(Context context) {
        ChatStyle chatStyle = Config.getInstance().getChatStyle();
        if (!TextUtils.isEmpty(chatStyle.defaultFontRegular)) {
            setTypeface(Typeface.createFromAsset(context.getAssets(), chatStyle.defaultFontRegular));
        }
    }

    public CustomFontButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (isInEditMode()) {
            return;
        }
        setTypefaceView(context);
    }
}
