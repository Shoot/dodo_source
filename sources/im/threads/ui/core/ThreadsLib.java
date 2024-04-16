package im.threads.ui.core;

import android.content.Context;
import android.net.Uri;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import im.threads.R;
import im.threads.business.UserInfoBuilder;
import im.threads.business.config.BaseConfig;
import im.threads.business.core.ThreadsLibBase;
import im.threads.business.logger.LoggerConfig;
import im.threads.business.logger.LoggerEdna;
import im.threads.business.models.FileDescription;
import im.threads.business.models.UpcomingUserMessage;
import im.threads.business.utils.ClientUseCase;
import im.threads.business.utils.FileProvider;
import im.threads.business.utils.FileUtils;
import im.threads.ui.ChatCenterPushMessageHelper;
import im.threads.ui.ChatStyle;
import im.threads.ui.config.Config;
import im.threads.ui.config.ConfigBuilder;
import im.threads.ui.controllers.ChatController;
import im.threads.ui.styles.permissions.PermissionDescriptionDialogStyle;
import im.threads.ui.utils.preferences.PreferencesMigrationUi;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: ThreadsLib.kt */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 42\u00020\u0001:\u00014B\u000f\u0012\u0006\u00101\u001a\u000200¢\u0006\u0004\b2\u00103J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\b\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004J\u000e\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tJ\u000e\u0010\f\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tJ\u000e\u0010\r\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tJ\u000e\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eJ\u0010\u0010\u0012\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010J\u001a\u0010\u0012\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013J\u001a\u0010\u0012\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015R\u001b\u0010\u001c\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010!\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001f\u0010 R\u001b\u0010&\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u0019\u001a\u0004\b$\u0010%R\u001b\u0010+\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010\u0019\u001a\u0004\b)\u0010*R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010/\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010.¨\u00065"}, d2 = {"Lim/threads/ui/core/ThreadsLib;", "Lim/threads/business/core/ThreadsLibBase;", "", "subscribeToPushEvent", "Lim/threads/ui/ChatStyle;", "lightTheme", "applyLightTheme", "darkTheme", "applyDarkTheme", "Lim/threads/ui/styles/permissions/PermissionDescriptionDialogStyle;", "dialogStyle", "applyStoragePermissionDescriptionDialogStyle", "applyRecordAudioPermissionDescriptionDialogStyle", "applyCameraPermissionDescriptionDialogStyle", "", "disableUserInput", "", "message", "sendMessage", "Ljava/io/File;", Action.FILE_ATTRIBUTE, "Landroid/net/Uri;", "fileUri", "Lim/threads/ui/config/Config;", "config$delegate", "Lrn5;", "getConfig", "()Lim/threads/ui/config/Config;", "config", "Lim/threads/business/utils/ClientUseCase;", "clientUseCase$delegate", "getClientUseCase", "()Lim/threads/business/utils/ClientUseCase;", "clientUseCase", "Lim/threads/business/utils/FileProvider;", "fileProvider$delegate", "getFileProvider", "()Lim/threads/business/utils/FileProvider;", "fileProvider", "Lim/threads/ui/ChatCenterPushMessageHelper;", "chatCenterPushMessageHelper$delegate", "getChatCenterPushMessageHelper", "()Lim/threads/ui/ChatCenterPushMessageHelper;", "chatCenterPushMessageHelper", "Lqx1;", "coroutineScope", "Lqx1;", "unconfinedScope", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Companion", "threads_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class ThreadsLib extends ThreadsLibBase {
    public static final Companion Companion = new Companion(null);
    private final rn5 chatCenterPushMessageHelper$delegate;
    private final rn5 clientUseCase$delegate;
    private final rn5 config$delegate;
    private final qx1 coroutineScope;
    private final rn5 fileProvider$delegate;
    private final qx1 unconfinedScope;

    /* compiled from: ThreadsLib.kt */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JP\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\b\u0010\u000f\u001a\u00020\u0004H\u0007J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0012H\u0003J\b\u0010\u0013\u001a\u00020\u0014H\u0007J\b\u0010\u0015\u001a\u00020\u0006H\u0007J\u0010\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0018H\u0007J\b\u0010\u0019\u001a\u00020\u000eH\u0007J\r\u0010\u001a\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\u001b¨\u0006\u001c"}, d2 = {"Lim/threads/ui/core/ThreadsLib$Companion;", "", "()V", "changeServerSettings", "", "baseUrl", "", "datastoreUrl", "threadsGateUrl", "threadsGateProviderUid", "trustedSSLCertificates", "", "", "allowUntrustedSSLCertificate", "", "cleanLibInstance", "createLibInstance", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "getInstance", "Lim/threads/ui/core/ThreadsLib;", "getLibVersion", "init", "configBuilder", "Lim/threads/ui/config/ConfigBuilder;", "isInitialized", "migratePreference", "migratePreference$threads_release", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void changeServerSettings$default(Companion companion, String str, String str2, String str3, String str4, List list, boolean z, int i, Object obj) {
            String str5;
            String str6;
            String str7;
            String str8;
            if ((i & 1) != 0) {
                str5 = null;
            } else {
                str5 = str;
            }
            if ((i & 2) != 0) {
                str6 = null;
            } else {
                str6 = str2;
            }
            if ((i & 4) != 0) {
                str7 = null;
            } else {
                str7 = str3;
            }
            if ((i & 8) != 0) {
                str8 = null;
            } else {
                str8 = str4;
            }
            companion.changeServerSettings(str5, str6, str7, str8, list, z);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void createLibInstance(Context context) {
            if (ThreadsLibBase.Companion.getLibInstance$threads_release() == null) {
                ThreadsLibBase.setLibraryInstance(new ThreadsLib(context));
                return;
            }
            throw new IllegalStateException("ThreadsLib has already been initialized".toString());
        }

        public final void changeServerSettings(String str, String str2, String str3, String str4, List<Integer> list, boolean z) {
            ThreadsLibBase.Companion.changeServerSettings(str, str2, str3, str4, list, z);
        }

        public final void cleanLibInstance() {
            ThreadsLibBase.Companion.setLibInstance$threads_release(null);
        }

        public final ThreadsLib getInstance() {
            ThreadsLibBase.Companion companion = ThreadsLibBase.Companion;
            if (companion.getLibInstance$threads_release() != null) {
                ThreadsLibBase libInstance$threads_release = companion.getLibInstance$threads_release();
                z65.f(libInstance$threads_release, "null cannot be cast to non-null type im.threads.ui.core.ThreadsLib");
                return (ThreadsLib) libInstance$threads_release;
            }
            throw new IllegalStateException("ThreadsLib should be initialized first with ThreadsLib.init()".toString());
        }

        public final String getLibVersion() {
            return ThreadsLibBase.Companion.getLibVersion();
        }

        public final void init(ConfigBuilder configBuilder) {
            z65.h(configBuilder, "configBuilder");
            ThreadsLibBase.Companion companion = ThreadsLibBase.Companion;
            companion.insertMetaDataToConfigBuilder$threads_release(configBuilder);
            createLibInstance(configBuilder.getContext());
            Config.Companion.setInstance(configBuilder.build());
            LoggerConfig loggerConfig = BaseConfig.Companion.getInstance().getLoggerConfig();
            if (loggerConfig != null) {
                LoggerEdna.init(loggerConfig);
            }
            LoggerEdna.info(configBuilder.toString());
            companion.loadRamPrefs$threads_release(new ThreadsLib$Companion$init$2(this), configBuilder.getContext());
            companion.initBaseParams$threads_release();
            getInstance().subscribeToPushEvent();
            getInstance().updateUnreadCountMessagesIfNeed$threads_release();
        }

        public final boolean isInitialized() {
            if (ThreadsLibBase.Companion.getLibInstance$threads_release() != null) {
                return true;
            }
            return false;
        }

        public final void migratePreference$threads_release() {
            PreferencesMigrationUi preferencesMigrationUi = new PreferencesMigrationUi(BaseConfig.Companion.getInstance().context);
            String simpleName = ChatController.class.getSimpleName();
            z65.g(simpleName, "ChatController::class.java.simpleName");
            preferencesMigrationUi.migrateNamedPreferences(simpleName);
            preferencesMigrationUi.removeStyleFromPreferences();
            preferencesMigrationUi.migrateMainSharedPreferences();
            preferencesMigrationUi.migrateUserInfo();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThreadsLib(Context context) {
        super(context);
        rn5 b;
        rn5 b2;
        rn5 b3;
        rn5 b4;
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        b = yn5.b(ThreadsLib$config$2.INSTANCE);
        this.config$delegate = b;
        b2 = yn5.b(ThreadsLib$special$$inlined$inject$1.INSTANCE);
        this.clientUseCase$delegate = b2;
        b3 = yn5.b(ThreadsLib$special$$inlined$inject$2.INSTANCE);
        this.fileProvider$delegate = b3;
        b4 = yn5.b(ThreadsLib$special$$inlined$inject$3.INSTANCE);
        this.chatCenterPushMessageHelper$delegate = b4;
        this.coroutineScope = rx1.a(v33.b());
        this.unconfinedScope = rx1.a(v33.d());
    }

    public static final void changeServerSettings(String str, String str2, String str3, String str4, List<Integer> list, boolean z) {
        Companion.changeServerSettings(str, str2, str3, str4, list, z);
    }

    public static final void cleanLibInstance() {
        Companion.cleanLibInstance();
    }

    private static final void createLibInstance(Context context) {
        Companion.createLibInstance(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ChatCenterPushMessageHelper getChatCenterPushMessageHelper() {
        return (ChatCenterPushMessageHelper) this.chatCenterPushMessageHelper$delegate.getValue();
    }

    private final ClientUseCase getClientUseCase() {
        return (ClientUseCase) this.clientUseCase$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Config getConfig() {
        return (Config) this.config$delegate.getValue();
    }

    private final FileProvider getFileProvider() {
        return (FileProvider) this.fileProvider$delegate.getValue();
    }

    public static final ThreadsLib getInstance() {
        return Companion.getInstance();
    }

    public static final String getLibVersion() {
        return Companion.getLibVersion();
    }

    public static final void init(ConfigBuilder configBuilder) {
        Companion.init(configBuilder);
    }

    public static final boolean isInitialized() {
        return Companion.isInitialized();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void subscribeToPushEvent() {
        qh0.d(this.unconfinedScope, null, null, new ThreadsLib$subscribeToPushEvent$1(this, null), 3, null);
        qh0.d(this.unconfinedScope, null, null, new ThreadsLib$subscribeToPushEvent$2(this, null), 3, null);
        qh0.d(this.unconfinedScope, null, null, new ThreadsLib$subscribeToPushEvent$3(this, null), 3, null);
    }

    public final void applyCameraPermissionDescriptionDialogStyle(PermissionDescriptionDialogStyle permissionDescriptionDialogStyle) {
        z65.h(permissionDescriptionDialogStyle, "dialogStyle");
        getConfig().setCameraPermissionDescriptionDialogStyle(permissionDescriptionDialogStyle);
    }

    public final void applyDarkTheme(ChatStyle chatStyle) {
        getConfig().setDarkTheme(chatStyle);
        LoggerEdna.info("Applied dark theme. " + chatStyle);
    }

    public final void applyLightTheme(ChatStyle chatStyle) {
        getConfig().setLightTheme(chatStyle);
        LoggerEdna.info("Applied light theme. " + chatStyle);
    }

    public final void applyRecordAudioPermissionDescriptionDialogStyle(PermissionDescriptionDialogStyle permissionDescriptionDialogStyle) {
        z65.h(permissionDescriptionDialogStyle, "dialogStyle");
        getConfig().setRecordAudioPermissionDescriptionDialogStyle(permissionDescriptionDialogStyle);
    }

    public final void applyStoragePermissionDescriptionDialogStyle(PermissionDescriptionDialogStyle permissionDescriptionDialogStyle) {
        z65.h(permissionDescriptionDialogStyle, "dialogStyle");
        getConfig().setStoragePermissionDescriptionDialogStyle(permissionDescriptionDialogStyle);
    }

    public final void disableUserInput(boolean z) {
        getConfig().disabledUserInput.a(Boolean.valueOf(z));
        LoggerEdna.info("Called disableUserInput(" + z + ").");
    }

    public final boolean sendMessage(String str) {
        return sendMessage(str, (Uri) null);
    }

    public final boolean sendMessage(String str, File file) {
        return sendMessage(str, file != null ? getFileProvider().getUriForFile(Config.Companion.getInstance().context, file) : null);
    }

    public final boolean sendMessage(String str, Uri uri) {
        boolean y;
        ChatController companion = ChatController.Companion.getInstance();
        UserInfoBuilder userInfo = getClientUseCase().getUserInfo();
        String clientId = userInfo != null ? userInfo.getClientId() : null;
        if (clientId != null) {
            y = l0b.y(clientId);
            if (!y) {
                companion.onUserInput$threads_release(new UpcomingUserMessage(uri != null ? new FileDescription(Config.Companion.getInstance().context.getString(R.string.ecc_I), uri, FileUtils.getFileSize(uri), System.currentTimeMillis()) : null, null, null, str, false));
                return true;
            }
        }
        LoggerEdna.info(ThreadsLib.class.getSimpleName(), "You might need to initialize user first with ThreadsLib.userInfo()");
        return false;
    }
}
