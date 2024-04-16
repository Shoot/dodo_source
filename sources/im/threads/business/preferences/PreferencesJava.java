package im.threads.business.preferences;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import im.threads.business.preferences.Preferences;
import java.lang.reflect.Type;
import kotlin.Metadata;
/* compiled from: PreferencesJava.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u001b\u0010\n\u001a\u00020\u00058DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lim/threads/business/preferences/PreferencesJava;", "", "", "getThreadId", "()Ljava/lang/Long;", "Lim/threads/business/preferences/Preferences;", "preferences$delegate", "Lrn5;", "getPreferences", "()Lim/threads/business/preferences/Preferences;", "preferences", "<init>", "()V", "threads_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes3.dex */
public class PreferencesJava {
    private final rn5 preferences$delegate;

    public PreferencesJava() {
        rn5 b;
        b = yn5.b(PreferencesJava$special$$inlined$inject$1.INSTANCE);
        this.preferences$delegate = b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Preferences getPreferences() {
        return (Preferences) this.preferences$delegate.getValue();
    }

    public final Long getThreadId() {
        boolean O;
        Object l;
        boolean J;
        boolean u;
        String T0;
        Object U0;
        Preferences preferences = getPreferences();
        String thread_id = PreferencesCoreKeys.INSTANCE.getTHREAD_ID();
        Type type = new TypeToken<Long>() { // from class: im.threads.business.preferences.PreferencesJava$getThreadId$$inlined$get$default$1
        }.getType();
        z65.g(type, "object : TypeToken<T>() {}.type");
        Object obj = null;
        try {
            Preferences.Companion companion = Preferences.Companion;
            String preferenceFromRam = companion.getPreferenceFromRam(thread_id);
            if (preferenceFromRam.length() == 0 && !companion.isRamPreferencesLoaded()) {
                String string = preferences.getSharedPreferences().getString(thread_id, null);
                if (string == null) {
                    string = "";
                } else {
                    z65.g(string, "sharedPreferences.getString(key, null) ?: \"\"");
                }
                preferenceFromRam = string;
                if (preferenceFromRam.length() > 0) {
                    companion.savePreferenceToRam(thread_id, preferenceFromRam);
                }
            }
            O = m0b.O(type.toString(), "String", false, 2, null);
            if (O) {
                J = l0b.J(preferenceFromRam, "\"", false, 2, null);
                if (J) {
                    u = l0b.u(preferenceFromRam, "\"", false, 2, null);
                    if (u) {
                        T0 = o0b.T0(preferenceFromRam, 1);
                        U0 = o0b.U0(T0, 1);
                        if (U0 != null) {
                            l = (Long) U0;
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Long");
                        }
                    }
                }
                if (preferenceFromRam != null) {
                    l = (Long) preferenceFromRam;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Long");
                }
            } else {
                l = new Gson().l(preferenceFromRam, type);
                if (l == null) {
                    throw new NullPointerException();
                }
            }
            if (!z65.c(l, "null")) {
                obj = l;
            }
        } catch (Exception unused) {
        }
        return (Long) obj;
    }
}
