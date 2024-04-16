package im.threads.ui.preferences;

import java.util.List;
import kotlin.Metadata;
/* compiled from: PreferencesUiKeys.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lim/threads/ui/preferences/PreferencesUiKeys;", "", "()V", "CLIENT_NOTIFICATION_DISPLAY_TYPE", "", "getCLIENT_NOTIFICATION_DISPLAY_TYPE", "()Ljava/lang/String;", "PREF_ATTACHMENT_SETTINGS", "getPREF_ATTACHMENT_SETTINGS", "allPrefKeys", "", "getAllPrefKeys", "()Ljava/util/List;", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PreferencesUiKeys {
    private static final List<String> allPrefKeys;
    public static final PreferencesUiKeys INSTANCE = new PreferencesUiKeys();
    private static final String CLIENT_NOTIFICATION_DISPLAY_TYPE = "CLIENT_NOTIFICATION_DISPLAY_TYPE";
    private static final String PREF_ATTACHMENT_SETTINGS = "PREF_ATTACHMENT_SETTINGS";

    static {
        List<String> r;
        r = kc1.r("CLIENT_NOTIFICATION_DISPLAY_TYPE", "PREF_ATTACHMENT_SETTINGS");
        allPrefKeys = r;
    }

    private PreferencesUiKeys() {
    }

    public final List<String> getAllPrefKeys() {
        return allPrefKeys;
    }

    public final String getCLIENT_NOTIFICATION_DISPLAY_TYPE() {
        return CLIENT_NOTIFICATION_DISPLAY_TYPE;
    }

    public final String getPREF_ATTACHMENT_SETTINGS() {
        return PREF_ATTACHMENT_SETTINGS;
    }
}
