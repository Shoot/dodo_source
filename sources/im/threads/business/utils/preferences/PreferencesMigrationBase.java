package im.threads.business.utils.preferences;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.preference.g;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import im.threads.business.UserInfoBuilder;
import im.threads.business.logger.LoggerEdna;
import im.threads.business.preferences.PrefKeysForMigration;
import im.threads.business.preferences.Preferences;
import im.threads.business.preferences.PreferencesCoreKeys;
import im.threads.business.utils.ClientUseCase;
import im.threads.ui.styles.StyleUseCase;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
/* compiled from: PreferencesMigrationBase.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b$\u0010%J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J\u0018\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J\"\u0010\u000e\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\fH\u0002J\u0010\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\bH\u0002J\u0006\u0010\u0011\u001a\u00020\u0005J\u0006\u0010\u0012\u001a\u00020\u0005J\u000e\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\bJ\u0006\u0010\u0015\u001a\u00020\u0005R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR \u0010 \u001a\b\u0012\u0004\u0012\u00020\b0\u001f8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006&"}, d2 = {"Lim/threads/business/utils/preferences/PreferencesMigrationBase;", "Lim/threads/business/preferences/Preferences;", "Landroid/content/SharedPreferences;", "fromPrefs", "toPrefs", "", "movePreferences", "moveCurrentOnlyPrefs", "", Action.KEY_ATTRIBUTE, "", "value", "Landroid/content/SharedPreferences$Editor;", "editor", "addPrefToEditor", "nameContains", "deletePreferenceWithNameContains", "migrateMainSharedPreferences", "removeStyleFromPreferences", "preferenceName", "migrateNamedPreferences", "migrateUserInfo", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "Lim/threads/ui/styles/StyleUseCase;", "styleUseCase$delegate", "Lrn5;", "getStyleUseCase", "()Lim/threads/ui/styles/StyleUseCase;", "styleUseCase", "", "keys", "Ljava/util/List;", "getKeys", "()Ljava/util/List;", "<init>", "(Landroid/content/Context;)V", "threads_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes3.dex */
public class PreferencesMigrationBase extends Preferences {
    private final Context context;
    private final List<String> keys;
    private final rn5 styleUseCase$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreferencesMigrationBase(Context context) {
        super(context);
        rn5 b;
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.context = context;
        b = yn5.b(PreferencesMigrationBase$special$$inlined$inject$1.INSTANCE);
        this.styleUseCase$delegate = b;
        this.keys = PreferencesCoreKeys.INSTANCE.getAllPrefKeys();
    }

    private final void addPrefToEditor(String str, Object obj, SharedPreferences.Editor editor) {
        if (obj instanceof Boolean) {
            editor.putBoolean(str, ((Boolean) obj).booleanValue());
        } else if (obj instanceof Float) {
            editor.putFloat(str, ((Number) obj).floatValue());
        } else if (obj instanceof Integer) {
            editor.putInt(str, ((Number) obj).intValue());
        } else if (obj instanceof Long) {
            editor.putLong(str, ((Number) obj).longValue());
        } else if (obj instanceof String) {
            editor.putString(str, (String) obj);
        }
    }

    private final void deletePreferenceWithNameContains(String str) {
        boolean O;
        try {
            String parent = this.context.getFilesDir().getParent();
            if (parent != null) {
                File file = new File(parent + "/shared_prefs/");
                String[] list = file.list();
                if (list != null) {
                    for (String str2 : list) {
                        z65.g(str2, "child");
                        O = m0b.O(str2, str, false, 2, null);
                        if (O) {
                            new File(file, str2).delete();
                        }
                    }
                }
            }
        } catch (Exception e) {
            LoggerEdna.error("Error when deleting preference file", e);
        }
    }

    private final StyleUseCase getStyleUseCase() {
        return (StyleUseCase) this.styleUseCase$delegate.getValue();
    }

    private final void moveCurrentOnlyPrefs(SharedPreferences sharedPreferences, SharedPreferences sharedPreferences2) {
        SharedPreferences.Editor edit = sharedPreferences2.edit();
        ArrayList<String> arrayList = new ArrayList();
        Map<String, ?> all = sharedPreferences.getAll();
        z65.g(all, "fromPrefs.all");
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (getKeys().contains(key)) {
                z65.g(key, Action.KEY_ATTRIBUTE);
                z65.g(edit, "editor");
                addPrefToEditor(key, value, edit);
                arrayList.add(key);
            }
        }
        SharedPreferences.Editor edit2 = sharedPreferences.edit();
        for (String str : arrayList) {
            edit2.remove(str);
        }
        edit.commit();
        edit2.commit();
    }

    private final void movePreferences(SharedPreferences sharedPreferences, SharedPreferences sharedPreferences2) {
        SharedPreferences.Editor edit = sharedPreferences2.edit();
        Map<String, ?> all = sharedPreferences.getAll();
        z65.g(all, "fromPrefs.all");
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            z65.g(key, Action.KEY_ATTRIBUTE);
            z65.g(edit, "editor");
            addPrefToEditor(key, value, edit);
        }
        edit.commit();
        sharedPreferences.edit().clear().commit();
    }

    protected List<String> getKeys() {
        return this.keys;
    }

    public final void migrateMainSharedPreferences() {
        SharedPreferences b = g.b(this.context);
        Context context = this.context;
        PreferencesCoreKeys preferencesCoreKeys = PreferencesCoreKeys.INSTANCE;
        SharedPreferences sharedPreferences = context.getSharedPreferences(preferencesCoreKeys.getSTORE_NAME(), 0);
        Map<String, ?> all = b.getAll();
        z65.g(all, "oldSharedPreferences.all");
        if (!all.isEmpty()) {
            z65.g(b, "oldSharedPreferences");
            moveCurrentOnlyPrefs(b, getSharedPreferences());
        }
        Map<String, ?> all2 = sharedPreferences.getAll();
        z65.g(all2, "notEncryptedPreferences.all");
        if (!all2.isEmpty()) {
            z65.g(sharedPreferences, "notEncryptedPreferences");
            movePreferences(sharedPreferences, getSharedPreferences());
            deletePreferenceWithNameContains(preferencesCoreKeys.getSTORE_NAME());
        }
    }

    public final void migrateNamedPreferences(String str) {
        z65.h(str, "preferenceName");
        SharedPreferences sharedPreferences = this.context.getSharedPreferences(str, 0);
        z65.g(sharedPreferences, "context.getSharedPrefere…me, Context.MODE_PRIVATE)");
        movePreferences(sharedPreferences, getSharedPreferences());
        deletePreferenceWithNameContains(str);
    }

    public final void migrateUserInfo() {
        Boolean bool;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        PrefKeysForMigration prefKeysForMigration = new PrefKeysForMigration();
        SharedPreferences.Editor edit = getSharedPreferences().edit();
        ClientUseCase clientUseCase = new ClientUseCase();
        try {
            UserInfoBuilder userInfoBuilder = null;
            for (String str8 : prefKeysForMigration.getList()) {
                if (getSharedPreferences().getAll().keySet().contains(str8)) {
                    if (userInfoBuilder == null) {
                        userInfoBuilder = new UserInfoBuilder("stub");
                    }
                    Object obj = getSharedPreferences().getAll().get(str8);
                    if (z65.c(str8, prefKeysForMigration.getAPP_MARKER())) {
                        if (obj instanceof String) {
                            str7 = (String) obj;
                        } else {
                            str7 = null;
                        }
                        if (str7 != null) {
                            userInfoBuilder.setAppMarker(str7);
                        }
                    } else if (z65.c(str8, prefKeysForMigration.getTAG_CLIENT_ID())) {
                        if (obj instanceof String) {
                            str6 = (String) obj;
                        } else {
                            str6 = null;
                        }
                        if (str6 != null) {
                            userInfoBuilder.setClientId(str6);
                        }
                    } else if (z65.c(str8, prefKeysForMigration.getAUTH_TOKEN())) {
                        if (obj instanceof String) {
                            str5 = (String) obj;
                        } else {
                            str5 = null;
                        }
                        if (str5 != null) {
                            UserInfoBuilder.setAuthData$default(userInfoBuilder, str5, userInfoBuilder.getAuthSchema(), null, 4, null);
                        }
                    } else if (z65.c(str8, prefKeysForMigration.getAUTH_SCHEMA())) {
                        if (obj instanceof String) {
                            str4 = (String) obj;
                        } else {
                            str4 = null;
                        }
                        if (str4 != null) {
                            UserInfoBuilder.setAuthData$default(userInfoBuilder, userInfoBuilder.getAuthToken(), str4, null, 4, null);
                        }
                    } else if (z65.c(str8, prefKeysForMigration.getCLIENT_ID_SIGNATURE())) {
                        if (obj instanceof String) {
                            str3 = (String) obj;
                        } else {
                            str3 = null;
                        }
                        if (str3 != null) {
                            userInfoBuilder.setClientIdSignature(str3);
                        }
                    } else if (z65.c(str8, prefKeysForMigration.getDEFAULT_CLIENT_NAMETITLE_TAG())) {
                        if (obj instanceof String) {
                            str2 = (String) obj;
                        } else {
                            str2 = null;
                        }
                        if (str2 != null) {
                            userInfoBuilder.setUserName(str2);
                        }
                    } else if (z65.c(str8, prefKeysForMigration.getEXTRA_DATE())) {
                        if (obj instanceof String) {
                            str = (String) obj;
                        } else {
                            str = null;
                        }
                        if (str != null) {
                            userInfoBuilder.setClientData(str);
                        }
                    } else if (z65.c(str8, prefKeysForMigration.getTAG_CLIENT_ID_ENCRYPTED())) {
                        if (obj instanceof Boolean) {
                            bool = (Boolean) obj;
                        } else {
                            bool = null;
                        }
                        if (bool != null) {
                            userInfoBuilder.m9setClientIdEncrypted(bool.booleanValue());
                        }
                    }
                    edit.remove(str8);
                }
            }
            if (userInfoBuilder != null && !z65.c(userInfoBuilder.getClientId(), "stub")) {
                edit.apply();
                clientUseCase.saveUserInfo(userInfoBuilder);
            }
        } catch (SecurityException unused) {
            removeSharedPreferencesFiles$threads_release();
        }
    }

    public final void removeStyleFromPreferences() {
        getStyleUseCase().clearUnusedPreferences();
    }
}
