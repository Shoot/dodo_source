package im.threads.business.utils;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Toast;
import ch.qos.logback.core.CoreConstants;
import com.google.android.material.snackbar.Snackbar;
import im.threads.R;
import im.threads.databinding.EccSnackbarBinding;
import im.threads.ui.ChatStyle;
import im.threads.ui.config.Config;
import im.threads.ui.utils.ColorsHelper;
import kotlin.Metadata;
/* compiled from: Balloon.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\bH\u0003¨\u0006\f"}, d2 = {"Lim/threads/business/utils/Balloon;", "", "()V", "show", "", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "message", "", "showSnackbar", "Landroid/app/Activity;", "messageString", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Balloon {
    public static final Balloon INSTANCE = new Balloon();

    private Balloon() {
    }

    public static final void show(Context context, String str) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        z65.h(str, "message");
        if (Config.Companion.getInstance().getChatStyle().isToastStylable() && (context instanceof Activity)) {
            showSnackbar((Activity) context, str);
        } else {
            Toast.makeText(context, str, 1).show();
        }
    }

    private static final void showSnackbar(Activity activity, String str) {
        ChatStyle chatStyle = Config.Companion.getInstance().getChatStyle();
        LayoutInflater layoutInflater = activity.getLayoutInflater();
        z65.g(layoutInflater, "context.layoutInflater");
        Snackbar i0 = Snackbar.i0(activity.getWindow().getDecorView(), str, 0);
        z65.g(i0, "make(context.window.deco…ng, Snackbar.LENGTH_LONG)");
        View D = i0.D();
        z65.f(D, "null cannot be cast to non-null type com.google.android.material.snackbar.Snackbar.SnackbarLayout");
        Snackbar.SnackbarLayout snackbarLayout = (Snackbar.SnackbarLayout) D;
        EccSnackbarBinding inflate = EccSnackbarBinding.inflate(layoutInflater);
        ColorsHelper.setBackgroundColor(activity, snackbarLayout, R.color.ecc_transparent);
        ColorsHelper.setTint(activity, inflate.background, chatStyle.toastBackgroundColor);
        ColorsHelper.setTextColor(activity, inflate.message, chatStyle.toastTextColor);
        inflate.message.setTextSize(0, activity.getResources().getDimension(chatStyle.toastTextSize));
        inflate.message.setText(str);
        snackbarLayout.removeAllViews();
        snackbarLayout.addView(inflate.getRoot().getRootView());
        i0.U();
    }
}
