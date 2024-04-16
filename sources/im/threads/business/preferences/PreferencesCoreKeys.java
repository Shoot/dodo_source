package im.threads.business.preferences;

import java.util.List;
import kotlin.Metadata;
/* compiled from: PreferencesCoreKeys.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b!\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0006R\u0014\u0010\u0015\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0006R\u0014\u0010\u0017\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0006R\u0014\u0010\u0019\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0006R\u0014\u0010\u001b\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0006R\u0014\u0010\u001d\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0006R\u0014\u0010\u001f\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0006R\u0014\u0010!\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0006R\u0014\u0010#\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0006R\u0017\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00040&¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u000e\u0010)\u001a\u00020*X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Lim/threads/business/preferences/PreferencesCoreKeys;", "", "()V", "CAMPAIGN_MESSAGE", "", "getCAMPAIGN_MESSAGE", "()Ljava/lang/String;", "CHAT_STATE", "getCHAT_STATE", "CLOUD_MESSAGING_TYPE", "getCLOUD_MESSAGING_TYPE", "DEVICE_ADDRESS", "getDEVICE_ADDRESS", "DEVICE_UID", "getDEVICE_UID", "ENCRYPTED_STORE_NAME", "getENCRYPTED_STORE_NAME", "FCM_TOKEN", "getFCM_TOKEN", "FILE_DESCRIPTION_DRAFT", "getFILE_DESCRIPTION_DRAFT", "HCM_TOKEN", "getHCM_TOKEN", "INIT_SENT_LAST_USER_ID", "getINIT_SENT_LAST_USER_ID", "LAST_COPY_TEXT", "getLAST_COPY_TEXT", "STORE_NAME", "getSTORE_NAME", "THREAD_ID", "getTHREAD_ID", "TYPING_MESSAGES_INTERVAL_SECONDS", "getTYPING_MESSAGES_INTERVAL_SECONDS", "UNREAD_PUSH_COUNT", "getUNREAD_PUSH_COUNT", "USER_SELECTED_UI_THEME_KEY", "getUSER_SELECTED_UI_THEME_KEY", "allPrefKeys", "", "getAllPrefKeys", "()Ljava/util/List;", "migrationKeys", "Lim/threads/business/preferences/PrefKeysForMigration;", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PreferencesCoreKeys {
    private static final String CAMPAIGN_MESSAGE;
    private static final String CHAT_STATE;
    private static final String CLOUD_MESSAGING_TYPE;
    private static final String DEVICE_ADDRESS;
    private static final String DEVICE_UID;
    private static final String ENCRYPTED_STORE_NAME;
    private static final String FCM_TOKEN;
    private static final String FILE_DESCRIPTION_DRAFT;
    private static final String HCM_TOKEN;
    private static final String INIT_SENT_LAST_USER_ID;
    public static final PreferencesCoreKeys INSTANCE = new PreferencesCoreKeys();
    private static final String LAST_COPY_TEXT;
    private static final String STORE_NAME;
    private static final String THREAD_ID;
    private static final String TYPING_MESSAGES_INTERVAL_SECONDS;
    private static final String UNREAD_PUSH_COUNT;
    private static final String USER_SELECTED_UI_THEME_KEY;
    private static final List<String> allPrefKeys;
    private static final PrefKeysForMigration migrationKeys;

    static {
        List<String> r;
        PrefKeysForMigration prefKeysForMigration = new PrefKeysForMigration();
        migrationKeys = prefKeysForMigration;
        LAST_COPY_TEXT = "LAST_COPY_TEXT";
        DEVICE_ADDRESS = "DEVICE_ADDRESS";
        FCM_TOKEN = "FCM_TOKEN";
        HCM_TOKEN = "HCM_TOKEN";
        CLOUD_MESSAGING_TYPE = "CLOUD_MESSAGING_TYPE";
        DEVICE_UID = "DEVICE_UID";
        THREAD_ID = "THREAD_ID";
        FILE_DESCRIPTION_DRAFT = "FILE_DESCRIPTION_DRAFT";
        CAMPAIGN_MESSAGE = "CAMPAIGN_MESSAGE";
        UNREAD_PUSH_COUNT = "UNREAD_PUSH_COUNT";
        STORE_NAME = "im.threads.internal.utils.PrefStore";
        ENCRYPTED_STORE_NAME = "im.threads.internal.utils.EncryptedPrefStore";
        USER_SELECTED_UI_THEME_KEY = "USER_SELECTED_UI_THEME_KEY";
        INIT_SENT_LAST_USER_ID = "INIT_SENT_LAST_USER_ID";
        CHAT_STATE = "CHAT_STATE";
        TYPING_MESSAGES_INTERVAL_SECONDS = "TYPING_MESSAGES_INTERVAL_SECONDS";
        r = kc1.r("LAST_COPY_TEXT", "DEVICE_ADDRESS", "FCM_TOKEN", "HCM_TOKEN", "CLOUD_MESSAGING_TYPE", "DEVICE_UID", "THREAD_ID", "FILE_DESCRIPTION_DRAFT", "CAMPAIGN_MESSAGE", "UNREAD_PUSH_COUNT", "im.threads.internal.utils.PrefStore", "im.threads.internal.utils.EncryptedPrefStore", "USER_SELECTED_UI_THEME_KEY", "INIT_SENT_LAST_USER_ID", "CHAT_STATE", "TYPING_MESSAGES_INTERVAL_SECONDS");
        r.addAll(prefKeysForMigration.getList());
        allPrefKeys = r;
    }

    private PreferencesCoreKeys() {
    }

    public final List<String> getAllPrefKeys() {
        return allPrefKeys;
    }

    public final String getCAMPAIGN_MESSAGE() {
        return CAMPAIGN_MESSAGE;
    }

    public final String getCHAT_STATE() {
        return CHAT_STATE;
    }

    public final String getCLOUD_MESSAGING_TYPE() {
        return CLOUD_MESSAGING_TYPE;
    }

    public final String getDEVICE_ADDRESS() {
        return DEVICE_ADDRESS;
    }

    public final String getDEVICE_UID() {
        return DEVICE_UID;
    }

    public final String getENCRYPTED_STORE_NAME() {
        return ENCRYPTED_STORE_NAME;
    }

    public final String getFCM_TOKEN() {
        return FCM_TOKEN;
    }

    public final String getFILE_DESCRIPTION_DRAFT() {
        return FILE_DESCRIPTION_DRAFT;
    }

    public final String getHCM_TOKEN() {
        return HCM_TOKEN;
    }

    public final String getINIT_SENT_LAST_USER_ID() {
        return INIT_SENT_LAST_USER_ID;
    }

    public final String getLAST_COPY_TEXT() {
        return LAST_COPY_TEXT;
    }

    public final String getSTORE_NAME() {
        return STORE_NAME;
    }

    public final String getTHREAD_ID() {
        return THREAD_ID;
    }

    public final String getTYPING_MESSAGES_INTERVAL_SECONDS() {
        return TYPING_MESSAGES_INTERVAL_SECONDS;
    }

    public final String getUNREAD_PUSH_COUNT() {
        return UNREAD_PUSH_COUNT;
    }

    public final String getUSER_SELECTED_UI_THEME_KEY() {
        return USER_SELECTED_UI_THEME_KEY;
    }
}
