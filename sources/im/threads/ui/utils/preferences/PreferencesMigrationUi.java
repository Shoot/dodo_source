package im.threads.ui.utils.preferences;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import im.threads.business.utils.preferences.PreferencesMigrationBase;
import im.threads.ui.preferences.PreferencesUiKeys;
import java.util.List;
import kotlin.Metadata;
/* compiled from: PreferencesMigrationUi.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lim/threads/ui/utils/preferences/PreferencesMigrationUi;", "Lim/threads/business/utils/preferences/PreferencesMigrationBase;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "(Landroid/content/Context;)V", "keys", "", "", "getKeys", "()Ljava/util/List;", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PreferencesMigrationUi extends PreferencesMigrationBase {
    private final List<String> keys;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreferencesMigrationUi(Context context) {
        super(context);
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.keys = PreferencesUiKeys.INSTANCE.getAllPrefKeys();
    }

    @Override // im.threads.business.utils.preferences.PreferencesMigrationBase
    protected List<String> getKeys() {
        return this.keys;
    }
}
