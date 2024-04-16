package im.threads.ui.preferences;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import im.threads.business.models.ClientNotificationDisplayType;
import im.threads.business.preferences.Preferences;
import im.threads.business.preferences.PreferencesJava;
import java.lang.reflect.Type;
import kotlin.Metadata;
/* compiled from: PreferencesJavaUI.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lim/threads/ui/preferences/PreferencesJavaUI;", "Lim/threads/business/preferences/PreferencesJava;", "()V", "getClientNotificationDisplayType", "Lim/threads/business/models/ClientNotificationDisplayType;", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PreferencesJavaUI extends PreferencesJava {
    public final ClientNotificationDisplayType getClientNotificationDisplayType() {
        boolean O;
        Object obj;
        boolean J;
        boolean u;
        String T0;
        Object U0;
        Preferences preferences = getPreferences();
        String client_notification_display_type = PreferencesUiKeys.INSTANCE.getCLIENT_NOTIFICATION_DISPLAY_TYPE();
        Type type = new TypeToken<String>() { // from class: im.threads.ui.preferences.PreferencesJavaUI$getClientNotificationDisplayType$$inlined$get$default$1
        }.getType();
        z65.g(type, "object : TypeToken<T>() {}.type");
        Object obj2 = null;
        try {
            Preferences.Companion companion = Preferences.Companion;
            String preferenceFromRam = companion.getPreferenceFromRam(client_notification_display_type);
            int length = preferenceFromRam.length();
            String str = preferenceFromRam;
            if (length == 0) {
                str = preferenceFromRam;
                if (!companion.isRamPreferencesLoaded()) {
                    String string = preferences.getSharedPreferences().getString(client_notification_display_type, null);
                    if (string == null) {
                        string = "";
                    } else {
                        z65.g(string, "sharedPreferences.getString(key, null) ?: \"\"");
                    }
                    String str2 = string;
                    int length2 = str2.length();
                    str = str2;
                    if (length2 > 0) {
                        companion.savePreferenceToRam(client_notification_display_type, str2);
                        str = str2;
                    }
                }
            }
            O = m0b.O(type.toString(), "String", false, 2, null);
            if (O) {
                J = l0b.J(str, "\"", false, 2, null);
                if (J) {
                    u = l0b.u(str, "\"", false, 2, null);
                    if (u) {
                        T0 = o0b.T0(str, 1);
                        U0 = o0b.U0(T0, 1);
                        if (U0 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                        }
                        obj = U0;
                    }
                }
                if (str == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                obj = str;
            } else {
                Object l = new Gson().l(str, type);
                obj = l;
                if (l == null) {
                    throw new NullPointerException();
                }
            }
            if (!z65.c(obj, "null")) {
                obj2 = obj;
            }
        } catch (Exception unused) {
        }
        return ClientNotificationDisplayType.Companion.fromString((String) obj2);
    }
}
