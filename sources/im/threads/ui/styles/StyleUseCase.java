package im.threads.ui.styles;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.preference.g;
import ch.qos.logback.core.CoreConstants;
import im.threads.business.preferences.Preferences;
import im.threads.business.preferences.PreferencesCoreKeys;
import im.threads.business.transport.MessageAttributes;
import im.threads.ui.ChatStyle;
import im.threads.ui.extensions.UiExtensionsKt;
import im.threads.ui.styles.permissions.PermissionDescriptionDialogStyle;
import im.threads.ui.styles.permissions.PermissionDescriptionType;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: StyleUseCase.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\f\u001a\u00020\rJ\n\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0002J\u0010\u0010\n\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\n\u0010\u0012\u001a\u0004\u0018\u00010\u000fH\u0002J\n\u0010\u0013\u001a\u0004\u0018\u00010\u000fH\u0002J\u0010\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u000fH\u0002J\u000e\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\tJ\u000e\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\tJ\u0016\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u000fJ\u0010\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u000fH\u0002J\u0010\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u000fH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R!\u0010\u0007\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0006\u0012\u0004\u0018\u00010\t0\b8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lim/threads/ui/styles/StyleUseCase;", "", "preferences", "Lim/threads/business/preferences/Preferences;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "(Lim/threads/business/preferences/Preferences;Landroid/content/Context;)V", "incomingStyle", "Lkotlin/Pair;", "Lim/threads/ui/ChatStyle;", "getIncomingStyle", "()Lkotlin/Pair;", "clearUnusedPreferences", "", "getCameraStyle", "Lim/threads/ui/styles/permissions/PermissionDescriptionDialogStyle;", MessageAttributes.TYPE, "Lim/threads/ui/styles/permissions/PermissionDescriptionType;", "getRecordAudioStyle", "getStorageStyle", "setCameraStyle", "style", "setIncomingDarkStyle", "setIncomingLightStyle", "setIncomingStyle", "setRecordAudioStyle", "setStorageStyle", "Companion", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class StyleUseCase {
    public static final Companion Companion = new Companion(null);
    private static PermissionDescriptionDialogStyle cameraChatStyleDark;
    private static PermissionDescriptionDialogStyle cameraChatStyleLight;
    private static ChatStyle incomingStyleDark;
    private static ChatStyle incomingStyleLight;
    private static PermissionDescriptionDialogStyle recordAudioChatStyleDark;
    private static PermissionDescriptionDialogStyle recordAudioChatStyleLight;
    private static PermissionDescriptionDialogStyle storageChatStyleDark;
    private static PermissionDescriptionDialogStyle storageChatStyleLight;
    private final Context context;
    private final Preferences preferences;

    /* compiled from: StyleUseCase.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lim/threads/ui/styles/StyleUseCase$Companion;", "", "()V", "cameraChatStyleDark", "Lim/threads/ui/styles/permissions/PermissionDescriptionDialogStyle;", "cameraChatStyleLight", "incomingStyleDark", "Lim/threads/ui/ChatStyle;", "incomingStyleLight", "recordAudioChatStyleDark", "recordAudioChatStyleLight", "storageChatStyleDark", "storageChatStyleLight", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: StyleUseCase.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PermissionDescriptionType.values().length];
            try {
                iArr[PermissionDescriptionType.STORAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PermissionDescriptionType.RECORD_AUDIO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PermissionDescriptionType.CAMERA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public StyleUseCase(Preferences preferences, Context context) {
        z65.h(preferences, "preferences");
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.preferences = preferences;
        this.context = context;
    }

    private final PermissionDescriptionDialogStyle getCameraStyle() {
        PermissionDescriptionDialogStyle permissionDescriptionDialogStyle;
        if (!UiExtensionsKt.isDarkThemeOn(this.context) || (permissionDescriptionDialogStyle = cameraChatStyleDark) == null) {
            return cameraChatStyleLight;
        }
        return permissionDescriptionDialogStyle;
    }

    private final PermissionDescriptionDialogStyle getRecordAudioStyle() {
        PermissionDescriptionDialogStyle permissionDescriptionDialogStyle;
        if (!UiExtensionsKt.isDarkThemeOn(this.context) || (permissionDescriptionDialogStyle = recordAudioChatStyleDark) == null) {
            return recordAudioChatStyleLight;
        }
        return permissionDescriptionDialogStyle;
    }

    private final PermissionDescriptionDialogStyle getStorageStyle() {
        PermissionDescriptionDialogStyle permissionDescriptionDialogStyle;
        if (!UiExtensionsKt.isDarkThemeOn(this.context) || (permissionDescriptionDialogStyle = storageChatStyleDark) == null) {
            return storageChatStyleLight;
        }
        return permissionDescriptionDialogStyle;
    }

    private final void setCameraStyle(PermissionDescriptionDialogStyle permissionDescriptionDialogStyle) {
        if (UiExtensionsKt.isDarkThemeOn(this.context)) {
            cameraChatStyleDark = permissionDescriptionDialogStyle;
        } else {
            cameraChatStyleLight = permissionDescriptionDialogStyle;
        }
    }

    private final void setRecordAudioStyle(PermissionDescriptionDialogStyle permissionDescriptionDialogStyle) {
        if (UiExtensionsKt.isDarkThemeOn(this.context)) {
            recordAudioChatStyleDark = permissionDescriptionDialogStyle;
        } else {
            recordAudioChatStyleLight = permissionDescriptionDialogStyle;
        }
    }

    private final void setStorageStyle(PermissionDescriptionDialogStyle permissionDescriptionDialogStyle) {
        if (UiExtensionsKt.isDarkThemeOn(this.context)) {
            storageChatStyleDark = permissionDescriptionDialogStyle;
        } else {
            storageChatStyleLight = permissionDescriptionDialogStyle;
        }
    }

    public final void clearUnusedPreferences() {
        String[] strArr = {"APP_STYLE", "STORAGE_PERMISSION_DESCRIPTION_DIALOG_STYLE", "RECORD_AUDIO_PERMISSION_DESCRIPTION_DIALOG_STYLE", "CAMERA_PERMISSION_DESCRIPTION_DIALOG_STYLE", "CLIENT_NOTIFICATION_DISPLAY_TYPE", "PREF_ATTACHMENT_SETTINGS", "APP_LIGHT_STYLE", "APP_DARK_STYLE", "STORAGE_PERMISSION_DESCRIPTION_DIALOG_LIGHT_STYLE", "STORAGE_PERMISSION_DESCRIPTION_DIALOG_DARK_STYLE", "RECORD_AUDIO_PERMISSION_DESCRIPTION_DIALOG_LIGHT_STYLE", "RECORD_AUDIO_PERMISSION_DESCRIPTION_DIALOG_DARK_STYLE", "CAMERA_PERMISSION_DESCRIPTION_DIALOG_LIGHT_STYLE", "CAMERA_PERMISSION_DESCRIPTION_DIALOG_DARK_STYLE"};
        SharedPreferences.Editor edit = g.b(this.context).edit();
        for (int i = 0; i < 14; i++) {
            edit.putString(strArr[i], null);
        }
        edit.commit();
        SharedPreferences.Editor edit2 = this.context.getSharedPreferences(PreferencesCoreKeys.INSTANCE.getSTORE_NAME(), 0).edit();
        for (int i2 = 0; i2 < 14; i2++) {
            edit2.putString(strArr[i2], null);
        }
        edit2.commit();
        SharedPreferences.Editor edit3 = this.preferences.getSharedPreferences().edit();
        for (int i3 = 0; i3 < 14; i3++) {
            edit3.putString(strArr[i3], null);
        }
        edit3.commit();
    }

    public final Pair<ChatStyle, ChatStyle> getIncomingStyle() {
        return new Pair<>(incomingStyleLight, incomingStyleDark);
    }

    public final void setIncomingDarkStyle(ChatStyle chatStyle) {
        z65.h(chatStyle, "style");
        incomingStyleDark = chatStyle;
    }

    public final void setIncomingLightStyle(ChatStyle chatStyle) {
        z65.h(chatStyle, "style");
        incomingStyleLight = chatStyle;
    }

    public final void setIncomingStyle(PermissionDescriptionType permissionDescriptionType, PermissionDescriptionDialogStyle permissionDescriptionDialogStyle) {
        z65.h(permissionDescriptionType, MessageAttributes.TYPE);
        z65.h(permissionDescriptionDialogStyle, "style");
        int i = WhenMappings.$EnumSwitchMapping$0[permissionDescriptionType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    setCameraStyle(permissionDescriptionDialogStyle);
                    return;
                }
                return;
            }
            setRecordAudioStyle(permissionDescriptionDialogStyle);
            return;
        }
        setStorageStyle(permissionDescriptionDialogStyle);
    }

    public final PermissionDescriptionDialogStyle getIncomingStyle(PermissionDescriptionType permissionDescriptionType) {
        z65.h(permissionDescriptionType, MessageAttributes.TYPE);
        int i = WhenMappings.$EnumSwitchMapping$0[permissionDescriptionType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return getCameraStyle();
                }
                throw new NoWhenBranchMatchedException();
            }
            return getRecordAudioStyle();
        }
        return getStorageStyle();
    }
}
