package im.threads.business.utils;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
/* compiled from: DemoModeProvider.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006J\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lim/threads/business/utils/DemoModeProvider;", "", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "(Landroid/content/Context;)V", "getHistoryMock", "", "isDemoModeEnabled", "", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DemoModeProvider {
    private final Context context;

    public DemoModeProvider(Context context) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.context = context;
    }

    public final String getHistoryMock() {
        String string = this.context.getSharedPreferences("ecc_demo_json_preference", 0).getString("ecc_demo_json_preference_key", "");
        if (string == null) {
            return "";
        }
        return string;
    }

    public final boolean isDemoModeEnabled() {
        try {
            if (!z65.c(this.context.getApplicationInfo().packageName, "io.edna.threads.demo")) {
                return false;
            }
            if (!this.context.getSharedPreferences("ecc_demo_json_preference", 0).getBoolean("ecc_is_demo_mode_enabled_key", false)) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
