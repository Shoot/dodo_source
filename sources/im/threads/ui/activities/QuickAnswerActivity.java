package im.threads.ui.activities;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.view.Window;
import androidx.fragment.app.Fragment;
import im.threads.R;
import im.threads.business.logger.LoggerEdna;
import im.threads.business.models.ConsultPhrase;
import im.threads.business.models.UpcomingUserMessage;
import im.threads.business.utils.Balloon;
import im.threads.ui.ChatStyle;
import im.threads.ui.config.Config;
import im.threads.ui.controllers.ChatController;
import im.threads.ui.controllers.QuickAnswerController;
import im.threads.ui.fragments.QuickAnswerFragment;
/* loaded from: classes3.dex */
public final class QuickAnswerActivity extends BaseActivity {
    public static final String ACTION_ANSWER = "im.threads.ACTION_ANSWER";
    public static final String ACTION_CANCEL = "im.threads.ACTION_CANCEL";
    private QuickAnswerController controller;
    private QuickAnswerReceiver mQuickAnswerReceiver;

    /* loaded from: classes3.dex */
    private class QuickAnswerReceiver extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            LoggerEdna.debug("onReceive: " + intent);
            if (intent.getAction().equalsIgnoreCase(QuickAnswerActivity.ACTION_CANCEL)) {
                QuickAnswerActivity.this.finish();
            } else if (intent.getAction().equalsIgnoreCase(QuickAnswerActivity.ACTION_ANSWER)) {
                if (ChatController.getInstance().isInputDisabled()) {
                    LoggerEdna.info("onReceive: ACTION_ANSWER. Input is disabled.");
                    Balloon.show(context, context.getString(R.string.ecc_disabled_input_message));
                    return;
                }
                LoggerEdna.info("onReceive: ACTION_ANSWER");
                QuickAnswerActivity.this.controller.onUserAnswer(new UpcomingUserMessage(null, null, null, intent.getStringExtra(QuickAnswerActivity.ACTION_ANSWER), false));
                QuickAnswerActivity.this.finish();
            }
        }

        private QuickAnswerReceiver() {
        }
    }

    public static PendingIntent createPendingIntent(Context context) {
        int i;
        Intent flags = new Intent(context, QuickAnswerActivity.class).setFlags(8388608);
        if (Build.VERSION.SDK_INT >= 23) {
            i = 67108864;
        } else {
            i = 0;
        }
        return PendingIntent.getActivity(context, 1, flags, i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // im.threads.ui.activities.BaseActivity, androidx.fragment.app.d, androidx.activity.ComponentActivity, defpackage.gm1, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ChatStyle chatStyle = Config.getInstance().getChatStyle();
        Window window = getWindow();
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(getResources().getColor(chatStyle.chatStatusBarColorResId));
        if (getResources().getBoolean(chatStyle.windowLightStatusBarResId) && Build.VERSION.SDK_INT >= 23) {
            window.getDecorView().setSystemUiVisibility(8192);
        }
        this.mQuickAnswerReceiver = new QuickAnswerReceiver();
        this.controller = QuickAnswerController.getInstance();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.d, android.app.Activity
    public void onResume() {
        super.onResume();
        this.controller.onBind(this);
        cs5 b = cs5.b(this);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(ACTION_ANSWER);
        intentFilter.addAction(ACTION_CANCEL);
        b.c(this.mQuickAnswerReceiver, intentFilter);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // im.threads.ui.activities.BaseActivity, androidx.appcompat.app.c, androidx.fragment.app.d, android.app.Activity
    public void onStop() {
        super.onStop();
        cs5.b(this).e(this.mQuickAnswerReceiver);
    }

    public void setLastUnreadMessage(ConsultPhrase consultPhrase) {
        if (consultPhrase != null) {
            Fragment l0 = getSupportFragmentManager().l0(QuickAnswerFragment.TAG);
            if (l0 != null) {
                getSupportFragmentManager().p().t(l0).k();
            }
            QuickAnswerFragment.getInstance(consultPhrase.getAvatarPath(), consultPhrase.getConsultName(), consultPhrase.getPhraseText()).show(getSupportFragmentManager(), QuickAnswerFragment.TAG);
        }
    }
}
