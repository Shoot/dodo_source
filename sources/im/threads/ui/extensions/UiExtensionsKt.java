package im.threads.ui.extensions;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.d;
import im.threads.business.models.enums.CurrentUiTheme;
import im.threads.ui.core.ThreadsLib;
import kotlin.Metadata;
/* compiled from: UiExtensions.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\f\u0010\u0005\u001a\u0004\u0018\u00010\u0004*\u00020\u0003¨\u0006\u0006"}, d2 = {"Landroid/content/Context;", "", "isDarkThemeOn", "Landroid/view/View;", "Landroidx/lifecycle/d;", "lifecycle", "threads_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class UiExtensionsKt {
    public static final boolean isDarkThemeOn(Context context) {
        z65.h(context, "<this>");
        if (ThreadsLib.Companion.getInstance().getCurrentUiTheme() == CurrentUiTheme.DARK || (context.getResources().getConfiguration().uiMode & 48) == 32) {
            return true;
        }
        return false;
    }

    public static final d lifecycle(View view) {
        z65.h(view, "<this>");
        op5 a = v0c.a(view);
        if (a != null) {
            return a.getLifecycle();
        }
        return null;
    }
}
