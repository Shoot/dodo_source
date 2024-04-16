package im.threads.ui.utils;

import android.annotation.SuppressLint;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import im.threads.business.chatUpdates.ChatUpdateProcessor;
import im.threads.business.config.BaseConfig;
import im.threads.business.logger.LoggerEdna;
import im.threads.business.preferences.Preferences;
import im.threads.business.preferences.Preferences$save$1;
import im.threads.business.transport.models.AttachmentSettings;
import im.threads.ui.preferences.PreferencesUiKeys;
import im.threads.ui.utils.FileHelper;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
/* compiled from: FileHelper.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b(\u0010)J\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\u0010\u0010\n\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bJ\u0006\u0010\u000b\u001a\u00020\u0006J\u0006\u0010\f\u001a\u00020\u0006R\u001b\u0010\u0012\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0017\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR(\u0010$\u001a\u0004\u0018\u00010\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0011\u0010'\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006*"}, d2 = {"Lim/threads/ui/utils/FileHelper;", "", "", "subscribeToAttachments", "", "fileSize", "", "isAllowedFileSize", "", "fileExtension", "isAllowedFileExtension", "isFileExtensionsEmpty", "isJpgAllow", "Lim/threads/business/chatUpdates/ChatUpdateProcessor;", "chatUpdateProcessor$delegate", "Lrn5;", "getChatUpdateProcessor", "()Lim/threads/business/chatUpdates/ChatUpdateProcessor;", "chatUpdateProcessor", "Lim/threads/business/preferences/Preferences;", "preferences$delegate", "getPreferences", "()Lim/threads/business/preferences/Preferences;", "preferences", "", "MEGABYTE", "D", "Lz33;", "disposable", "Lz33;", "Lim/threads/business/transport/models/AttachmentSettings$Content;", "value", "getAttachmentSettings", "()Lim/threads/business/transport/models/AttachmentSettings$Content;", "setAttachmentSettings", "(Lim/threads/business/transport/models/AttachmentSettings$Content;)V", "attachmentSettings", "getMaxAllowedFileSize", "()J", "maxAllowedFileSize", "<init>", "()V", "threads_release"}, k = 1, mv = {1, 8, 0})
@SuppressLint({"CheckResult"})
/* loaded from: classes3.dex */
public final class FileHelper {
    public static final FileHelper INSTANCE;
    private static final double MEGABYTE = 1048576.0d;
    private static final rn5 chatUpdateProcessor$delegate;
    private static z33 disposable;
    private static final rn5 preferences$delegate;

    static {
        rn5 b;
        rn5 b2;
        FileHelper fileHelper = new FileHelper();
        INSTANCE = fileHelper;
        b = yn5.b(FileHelper$special$$inlined$inject$1.INSTANCE);
        chatUpdateProcessor$delegate = b;
        b2 = yn5.b(FileHelper$special$$inlined$inject$2.INSTANCE);
        preferences$delegate = b2;
        fileHelper.subscribeToAttachments();
    }

    private FileHelper() {
    }

    private final AttachmentSettings.Content getAttachmentSettings() {
        boolean O;
        Object obj;
        boolean J;
        boolean u;
        String T0;
        Object U0;
        String str;
        String str2 = "";
        Preferences preferences = getPreferences();
        String pref_attachment_settings = PreferencesUiKeys.INSTANCE.getPREF_ATTACHMENT_SETTINGS();
        Type type = new TypeToken<String>() { // from class: im.threads.ui.utils.FileHelper$special$$inlined$get$default$1
        }.getType();
        z65.g(type, "object : TypeToken<T>() {}.type");
        Object obj2 = null;
        try {
            Preferences.Companion companion = Preferences.Companion;
            String preferenceFromRam = companion.getPreferenceFromRam(pref_attachment_settings);
            int length = preferenceFromRam.length();
            String str3 = preferenceFromRam;
            if (length == 0) {
                str3 = preferenceFromRam;
                if (!companion.isRamPreferencesLoaded()) {
                    String string = preferences.getSharedPreferences().getString(pref_attachment_settings, null);
                    if (string == null) {
                        str = "";
                    } else {
                        z65.g(string, "sharedPreferences.getString(key, null) ?: \"\"");
                        str = string;
                    }
                    int length2 = str.length();
                    str3 = str;
                    if (length2 > 0) {
                        companion.savePreferenceToRam(pref_attachment_settings, str);
                        str3 = str;
                    }
                }
            }
            O = m0b.O(type.toString(), "String", false, 2, null);
            if (O) {
                J = l0b.J(str3, "\"", false, 2, null);
                if (J) {
                    u = l0b.u(str3, "\"", false, 2, null);
                    if (u) {
                        T0 = o0b.T0(str3, 1);
                        U0 = o0b.U0(T0, 1);
                        if (U0 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                        }
                        obj = U0;
                    }
                }
                if (str3 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                obj = str3;
            } else {
                Object l = new Gson().l(str3, type);
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
        String str4 = (String) obj2;
        if (str4 != null) {
            str2 = str4;
        }
        return (AttachmentSettings.Content) BaseConfig.Companion.getInstance().gson.k(str2, AttachmentSettings.Content.class);
    }

    private final ChatUpdateProcessor getChatUpdateProcessor() {
        return (ChatUpdateProcessor) chatUpdateProcessor$delegate.getValue();
    }

    private final Preferences getPreferences() {
        return (Preferences) preferences$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setAttachmentSettings(AttachmentSettings.Content content) {
        Preferences preferences = getPreferences();
        String pref_attachment_settings = PreferencesUiKeys.INSTANCE.getPREF_ATTACHMENT_SETTINGS();
        String t = BaseConfig.Companion.getInstance().gson.t(content);
        if (t == null) {
            t = null;
        }
        Preferences.Companion.savePreferenceToRam(pref_attachment_settings, t);
        qh0.d(preferences.getCoroutineScope(), null, null, new Preferences$save$1(preferences, pref_attachment_settings, t, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void subscribeToAttachments$lambda$0(Function1 function1, Object obj) {
        z65.h(function1, "$tmp0");
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void subscribeToAttachments$lambda$1(Function1 function1, Object obj) {
        z65.h(function1, "$tmp0");
        function1.invoke(obj);
    }

    public final long getMaxAllowedFileSize() {
        AttachmentSettings.Content attachmentSettings = getAttachmentSettings();
        if (attachmentSettings != null) {
            return attachmentSettings.getMaxSize();
        }
        return 0L;
    }

    public final boolean isAllowedFileExtension(String str) {
        List list;
        String[] fileExtensions;
        boolean v;
        AttachmentSettings.Content attachmentSettings = getAttachmentSettings();
        if (attachmentSettings != null) {
            for (String str2 : attachmentSettings.getFileExtensions()) {
                v = l0b.v(str2, str, true);
                if (v) {
                    return true;
                }
            }
        }
        AttachmentSettings.Content attachmentSettings2 = getAttachmentSettings();
        if (attachmentSettings2 != null && (fileExtensions = attachmentSettings2.getFileExtensions()) != null) {
            list = xr.c(fileExtensions);
        } else {
            list = null;
        }
        LoggerEdna.warning("isAllowedFileExtension() - false. Extension \"" + str + "\" missing in array: " + list);
        return false;
    }

    public final boolean isAllowedFileSize(long j) {
        if (j / MEGABYTE <= getMaxAllowedFileSize()) {
            return true;
        }
        return false;
    }

    public final boolean isFileExtensionsEmpty() {
        String[] fileExtensions;
        AttachmentSettings.Content attachmentSettings = getAttachmentSettings();
        if (attachmentSettings == null || (fileExtensions = attachmentSettings.getFileExtensions()) == null || fileExtensions.length == 0) {
            return true;
        }
        return false;
    }

    public final boolean isJpgAllow() {
        String[] fileExtensions;
        boolean A;
        AttachmentSettings.Content attachmentSettings = getAttachmentSettings();
        if (attachmentSettings != null && (fileExtensions = attachmentSettings.getFileExtensions()) != null) {
            A = yr.A(fileExtensions, "jpg");
            return A;
        }
        return false;
    }

    public final void subscribeToAttachments() {
        z33 z33Var = disposable;
        if (z33Var == null || ((z33Var != null && z33Var.i()) || !getChatUpdateProcessor().getAttachmentSettingsProcessor().c0())) {
            i14<AttachmentSettings> attachmentSettingsProcessor = getChatUpdateProcessor().getAttachmentSettingsProcessor();
            final FileHelper$subscribeToAttachments$1 fileHelper$subscribeToAttachments$1 = FileHelper$subscribeToAttachments$1.INSTANCE;
            wr1<? super AttachmentSettings> wr1Var = new wr1() { // from class: xt3
                @Override // defpackage.wr1
                public final void accept(Object obj) {
                    FileHelper.subscribeToAttachments$lambda$0(Function1.this, obj);
                }
            };
            final FileHelper$subscribeToAttachments$2 fileHelper$subscribeToAttachments$2 = new FileHelper$subscribeToAttachments$2(LoggerEdna.INSTANCE);
            disposable = attachmentSettingsProcessor.P(wr1Var, new wr1() { // from class: yt3
                @Override // defpackage.wr1
                public final void accept(Object obj) {
                    FileHelper.subscribeToAttachments$lambda$1(Function1.this, obj);
                }
            });
        }
    }
}
