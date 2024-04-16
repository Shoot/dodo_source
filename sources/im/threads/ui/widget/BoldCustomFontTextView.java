package im.threads.ui.widget;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import im.threads.ui.ChatStyle;
import im.threads.ui.config.Config;
/* loaded from: classes3.dex */
public class BoldCustomFontTextView extends AppCompatTextView {
    public BoldCustomFontTextView(Context context) {
        super(context);
        if (isInEditMode()) {
            return;
        }
        setTypefaceView(context);
    }

    public void setTypefaceView(Context context) {
        ChatStyle chatStyle = Config.getInstance().getChatStyle();
        if (!TextUtils.isEmpty(chatStyle.defaultFontBold)) {
            setTypeface(Typeface.createFromAsset(context.getAssets(), chatStyle.defaultFontBold));
        }
    }

    public BoldCustomFontTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (isInEditMode()) {
            return;
        }
        setTypefaceView(context);
    }
}
