package im.threads.ui.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import im.threads.R;
import im.threads.ui.ChatStyle;
import im.threads.ui.config.Config;
import im.threads.ui.utils.ColorsHelper;
/* loaded from: classes3.dex */
public final class WelcomeScreen extends LinearLayout {
    public WelcomeScreen(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    private void init() {
        LayoutInflater layoutInflater = (LayoutInflater) getContext().getSystemService("layout_inflater");
        if (layoutInflater == null) {
            return;
        }
        layoutInflater.inflate(R.layout.ecc_view_welcome, (ViewGroup) this, true);
        ChatStyle chatStyle = Config.getInstance().getChatStyle();
        initBackgroundColor(chatStyle);
        initLogo(chatStyle);
        initTitle(chatStyle);
        initSubtitle(chatStyle);
    }

    private void initBackgroundColor(@NonNull ChatStyle chatStyle) {
        ColorsHelper.setBackgroundColor(getContext(), (LinearLayout) findViewById(R.id.rootLayout), chatStyle.chatBackgroundColor);
    }

    private void initLogo(@NonNull ChatStyle chatStyle) {
        ImageView imageView = (ImageView) findViewById(R.id.welcome_logo);
        imageView.setImageResource(chatStyle.welcomeScreenLogoResId);
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        layoutParams.width = getResources().getDimensionPixelSize(chatStyle.welcomeScreenLogoWidth);
        layoutParams.height = getResources().getDimensionPixelSize(chatStyle.welcomeScreenLogoHeight);
    }

    private void initSubtitle(@NonNull ChatStyle chatStyle) {
        TextView textView = (TextView) findViewById(R.id.welcome_subtitle);
        ColorsHelper.setTextColor(textView, chatStyle.welcomeScreenSubtitleTextColorResId);
        textView.setTextSize(0, getContext().getResources().getDimension(chatStyle.welcomeScreenSubtitleSizeInSp));
        textView.setText(chatStyle.welcomeScreenSubtitleTextResId);
    }

    private void initTitle(@NonNull ChatStyle chatStyle) {
        TextView textView = (TextView) findViewById(R.id.welcome_title);
        ColorsHelper.setTextColor(textView, chatStyle.welcomeScreenTitleTextColorResId);
        textView.setTextSize(0, getContext().getResources().getDimension(chatStyle.welcomeScreenTitleSizeInSp));
        textView.setText(chatStyle.welcomeScreenTitleTextResId);
    }

    public WelcomeScreen(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }
}
