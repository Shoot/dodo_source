package im.threads.business.controllers;

import ch.qos.logback.core.joran.action.Action;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import im.threads.business.preferences.Preferences;
import im.threads.business.preferences.Preferences$save$1;
import im.threads.business.preferences.PreferencesCoreKeys;
import im.threads.business.secureDatabase.DatabaseHolder;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
/* compiled from: UnreadMessagesController.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0011\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b'\u0010(J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0016\u0010\u0006\u001a\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H\u0002J\u0006\u0010\u0007\u001a\u00020\u0002J\u0006\u0010\b\u001a\u00020\u0002J\u0006\u0010\t\u001a\u00020\u0002R\u001b\u0010\u000f\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0014\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R%\u0010\u001b\u001a\u0010\u0012\f\u0012\n \u001a*\u0004\u0018\u00010\u00190\u00190\u00188\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR$\u0010$\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020\u00198B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0011\u0010&\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b%\u0010!j\u0002\b)¨\u0006*"}, d2 = {"Lim/threads/business/controllers/UnreadMessagesController;", "", "", "updateUnreadMessagesProcessor", "Lkotlin/Function0;", "block", "executeIfHumanMessageFound", "incrementUnreadPush", "clearUnreadPush", "refreshUnreadMessagesCount", "Lim/threads/business/secureDatabase/DatabaseHolder;", "database$delegate", "Lrn5;", "getDatabase", "()Lim/threads/business/secureDatabase/DatabaseHolder;", "database", "Lim/threads/business/preferences/Preferences;", "preferences$delegate", "getPreferences", "()Lim/threads/business/preferences/Preferences;", "preferences", "Lqx1;", Action.SCOPE_ATTRIBUTE, "Lqx1;", "Lsa0;", "", "kotlin.jvm.PlatformType", "unreadMessagesPublishProcessor", "Lsa0;", "getUnreadMessagesPublishProcessor", "()Lsa0;", "value", "getUnreadPushCount", "()I", "setUnreadPushCount", "(I)V", "unreadPushCount", "getUnreadMessages", "unreadMessages", "<init>", "(Ljava/lang/String;I)V", "INSTANCE", "threads_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes3.dex */
public enum UnreadMessagesController {
    INSTANCE;
    
    private final rn5 database$delegate;
    private final rn5 preferences$delegate;
    private final qx1 scope;
    private final sa0<Integer> unreadMessagesPublishProcessor;

    UnreadMessagesController() {
        rn5 b;
        rn5 b2;
        b = yn5.b(UnreadMessagesController$special$$inlined$inject$1.INSTANCE);
        this.database$delegate = b;
        b2 = yn5.b(UnreadMessagesController$special$$inlined$inject$2.INSTANCE);
        this.preferences$delegate = b2;
        this.scope = rx1.a(v33.b());
        sa0<Integer> e0 = sa0.e0();
        z65.g(e0, "create<Int>()");
        this.unreadMessagesPublishProcessor = e0;
    }

    private final void executeIfHumanMessageFound(Function0<Unit> function0) {
        sh0.d(this.scope, null, null, new UnreadMessagesController$executeIfHumanMessageFound$1(this, function0, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DatabaseHolder getDatabase() {
        return (DatabaseHolder) this.database$delegate.getValue();
    }

    private final Preferences getPreferences() {
        return (Preferences) this.preferences$delegate.getValue();
    }

    private final int getUnreadPushCount() {
        boolean O;
        Object l;
        boolean J;
        boolean u;
        String T0;
        Object U0;
        Preferences preferences = getPreferences();
        String unread_push_count = PreferencesCoreKeys.INSTANCE.getUNREAD_PUSH_COUNT();
        Type type = new TypeToken<Integer>() { // from class: im.threads.business.controllers.UnreadMessagesController$special$$inlined$get$default$1
        }.getType();
        z65.g(type, "object : TypeToken<T>() {}.type");
        Object obj = null;
        try {
            Preferences.Companion companion = Preferences.Companion;
            String preferenceFromRam = companion.getPreferenceFromRam(unread_push_count);
            if (preferenceFromRam.length() == 0 && !companion.isRamPreferencesLoaded()) {
                String string = preferences.getSharedPreferences().getString(unread_push_count, null);
                if (string == null) {
                    string = "";
                } else {
                    z65.g(string, "sharedPreferences.getString(key, null) ?: \"\"");
                }
                preferenceFromRam = string;
                if (preferenceFromRam.length() > 0) {
                    companion.savePreferenceToRam(unread_push_count, preferenceFromRam);
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
                            l = (Integer) U0;
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                        }
                    }
                }
                if (preferenceFromRam != null) {
                    l = (Integer) preferenceFromRam;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
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
        Integer num = (Integer) obj;
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    private final void setUnreadPushCount(int i) {
        String str;
        Preferences preferences = getPreferences();
        String unread_push_count = PreferencesCoreKeys.INSTANCE.getUNREAD_PUSH_COUNT();
        Integer valueOf = Integer.valueOf(i);
        if (valueOf instanceof String) {
            str = (String) valueOf;
        } else {
            str = new Gson().t(valueOf).toString();
        }
        Preferences.Companion.savePreferenceToRam(unread_push_count, str);
        sh0.d(preferences.getCoroutineScope(), null, null, new Preferences$save$1(preferences, unread_push_count, str, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateUnreadMessagesProcessor() {
        this.unreadMessagesPublishProcessor.d(Integer.valueOf(getUnreadMessages()));
    }

    public final void clearUnreadPush() {
        setUnreadPushCount(0);
        refreshUnreadMessagesCount();
    }

    public final int getUnreadMessages() {
        return getDatabase().getUnreadMessagesCount() + getUnreadPushCount();
    }

    public final sa0<Integer> getUnreadMessagesPublishProcessor() {
        return this.unreadMessagesPublishProcessor;
    }

    public final void incrementUnreadPush() {
        setUnreadPushCount(getUnreadPushCount() + 1);
        refreshUnreadMessagesCount();
    }

    public final void refreshUnreadMessagesCount() {
        executeIfHumanMessageFound(new UnreadMessagesController$refreshUnreadMessagesCount$1(this));
    }
}
