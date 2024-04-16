package im.threads.ui.config;

import android.content.Context;
import android.util.Size;
import ch.qos.logback.core.CoreConstants;
import im.threads.business.config.BaseConfig;
import im.threads.business.core.UnreadMessagesCountListener;
import im.threads.business.logger.LoggerConfig;
import im.threads.business.models.enums.ApiVersionEnum;
import im.threads.business.models.enums.CurrentUiTheme;
import im.threads.business.rest.config.RequestConfig;
import im.threads.ui.ChatStyle;
import im.threads.ui.core.PendingIntentCreator;
import im.threads.ui.core.ThreadsLib;
import im.threads.ui.extensions.UiExtensionsKt;
import im.threads.ui.styles.StyleUseCase;
import im.threads.ui.styles.permissions.PermissionDescriptionDialogStyle;
import im.threads.ui.styles.permissions.PermissionDescriptionType;
import im.threads.ui.utils.MetadataUi;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: Config.kt */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\b\u0018\u0000 N2\u00020\u0001:\u0001NBÓ\u0001\u0012\u0006\u00102\u001a\u000201\u0012\b\u00104\u001a\u0004\u0018\u000103\u0012\b\u00105\u001a\u0004\u0018\u000103\u0012\b\u00106\u001a\u0004\u0018\u000103\u0012\b\u00107\u001a\u0004\u0018\u000103\u0012\u0006\u00108\u001a\u00020\u000b\u0012\u0006\u0010:\u001a\u000209\u0012\b\u0010<\u001a\u0004\u0018\u00010;\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010>\u001a\u0004\u0018\u00010=\u0012\b\u0010@\u001a\u0004\u0018\u00010?\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010A\u001a\u00020\u000b\u0012\u0006\u0010C\u001a\u00020B\u0012\u0006\u0010D\u001a\u00020B\u0012\u0006\u0010F\u001a\u00020E\u0012\u000e\u0010H\u001a\n\u0012\u0004\u0012\u00020B\u0018\u00010G\u0012\u0006\u0010I\u001a\u00020\u000b\u0012\u0006\u0010J\u001a\u00020\u000b\u0012\u0006\u0010K\u001a\u00020B\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\bL\u0010MJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002J\u0006\u0010\u0007\u001a\u00020\u0002J\u0010\u0010\b\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002J\u0006\u0010\t\u001a\u00020\u0002J\u0010\u0010\n\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002J\u0006\u0010\f\u001a\u00020\u000bR\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R$\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R$\u0010\u0019\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016\"\u0004\b\u001b\u0010\u0018R\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0018\u0010 \u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u001fR\u0018\u0010!\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\u001fR\u001b\u0010'\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\"\u0010)\u001a\u00020(8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u0011\u00100\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b/\u0010\u0016¨\u0006O"}, d2 = {"Lim/threads/ui/config/Config;", "Lim/threads/business/config/BaseConfig;", "Lim/threads/ui/styles/permissions/PermissionDescriptionDialogStyle;", "getStoragePermissionDescriptionDialogStyle", "style", "", "setStoragePermissionDescriptionDialogStyle", "getRecordAudioPermissionDescriptionDialogStyle", "setRecordAudioPermissionDescriptionDialogStyle", "getCameraPermissionDescriptionDialogStyle", "setCameraPermissionDescriptionDialogStyle", "", "getIsAttachmentsEnabled", "Lim/threads/ui/core/PendingIntentCreator;", "pendingIntentCreator", "Lim/threads/ui/core/PendingIntentCreator;", "getPendingIntentCreator", "()Lim/threads/ui/core/PendingIntentCreator;", "Lim/threads/ui/ChatStyle;", "lightTheme", "Lim/threads/ui/ChatStyle;", "getLightTheme", "()Lim/threads/ui/ChatStyle;", "setLightTheme", "(Lim/threads/ui/ChatStyle;)V", "darkTheme", "getDarkTheme", "setDarkTheme", "isAttachmentsEnabled", "Ljava/lang/Boolean;", "storagePermissionDescriptionDialogStyle", "Lim/threads/ui/styles/permissions/PermissionDescriptionDialogStyle;", "recordAudioPermissionDescriptionDialogStyle", "cameraPermissionDescriptionDialogStyle", "Lim/threads/ui/styles/StyleUseCase;", "styleUseCase$delegate", "Lrn5;", "getStyleUseCase", "()Lim/threads/ui/styles/StyleUseCase;", "styleUseCase", "Landroid/util/Size;", "screenSize", "Landroid/util/Size;", "getScreenSize$threads_release", "()Landroid/util/Size;", "setScreenSize$threads_release", "(Landroid/util/Size;)V", "getChatStyle", "chatStyle", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "serverBaseUrl", "datastoreUrl", "threadsGateUrl", "threadsGateProviderUid", "isNewChatCenterApi", "Lim/threads/business/models/enums/ApiVersionEnum;", "apiVersion", "Lim/threads/business/logger/LoggerConfig;", "loggerConfig", "Lim/threads/business/core/UnreadMessagesCountListener;", "unreadMessagesCountListener", "Lk65;", "networkInterceptor", "isDebugLoggingEnabled", "", "historyLoadingCount", "surveyCompletionDelay", "Lim/threads/business/rest/config/RequestConfig;", "requestConfig", "", "trustedSSLCertificate", "allowUntrustedSSLCertificate", "keepSocketActive", "notificationImportance", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLim/threads/business/models/enums/ApiVersionEnum;Lim/threads/business/logger/LoggerConfig;Lim/threads/ui/core/PendingIntentCreator;Lim/threads/business/core/UnreadMessagesCountListener;Lk65;Lim/threads/ui/ChatStyle;Lim/threads/ui/ChatStyle;ZIILim/threads/business/rest/config/RequestConfig;Ljava/util/List;ZZILjava/lang/Boolean;)V", "Companion", "threads_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class Config extends BaseConfig {
    public static final Companion Companion = new Companion(null);
    private static Config instance;
    private volatile PermissionDescriptionDialogStyle cameraPermissionDescriptionDialogStyle;
    private ChatStyle darkTheme;
    private final Boolean isAttachmentsEnabled;
    private ChatStyle lightTheme;
    private final PendingIntentCreator pendingIntentCreator;
    private volatile PermissionDescriptionDialogStyle recordAudioPermissionDescriptionDialogStyle;
    private Size screenSize;
    private volatile PermissionDescriptionDialogStyle storagePermissionDescriptionDialogStyle;
    private final rn5 styleUseCase$delegate;

    /* compiled from: Config.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CurrentUiTheme.values().length];
            try {
                iArr[CurrentUiTheme.LIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CurrentUiTheme.DARK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CurrentUiTheme.SYSTEM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Config(Context context, String str, String str2, String str3, String str4, boolean z, ApiVersionEnum apiVersionEnum, LoggerConfig loggerConfig, PendingIntentCreator pendingIntentCreator, UnreadMessagesCountListener unreadMessagesCountListener, k65 k65Var, ChatStyle chatStyle, ChatStyle chatStyle2, boolean z2, int i, int i2, RequestConfig requestConfig, List<Integer> list, boolean z3, boolean z4, int i3, Boolean bool) {
        super(context, str, str2, str3, str4, z, loggerConfig, unreadMessagesCountListener, k65Var, z2, i, i2, requestConfig, i3, list, z3, z4, apiVersionEnum);
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        z65.h(apiVersionEnum, "apiVersion");
        z65.h(pendingIntentCreator, "pendingIntentCreator");
        z65.h(requestConfig, "requestConfig");
        this.pendingIntentCreator = pendingIntentCreator;
        this.lightTheme = chatStyle;
        this.darkTheme = chatStyle2;
        this.isAttachmentsEnabled = bool;
        this.styleUseCase$delegate = xn5.b(Config$special$$inlined$inject$1.INSTANCE);
        this.screenSize = new Size(0, 0);
        ChatStyle chatStyle3 = this.lightTheme;
        if (chatStyle3 != null) {
            getStyleUseCase().setIncomingLightStyle(chatStyle3);
        }
        ChatStyle chatStyle4 = this.darkTheme;
        if (chatStyle4 != null) {
            getStyleUseCase().setIncomingDarkStyle(chatStyle4);
        }
    }

    public static final Config getInstance() {
        return Companion.getInstance();
    }

    private final StyleUseCase getStyleUseCase() {
        return (StyleUseCase) this.styleUseCase$delegate.getValue();
    }

    public static final boolean isInstanceNull() {
        return Companion.isInstanceNull();
    }

    public final PermissionDescriptionDialogStyle getCameraPermissionDescriptionDialogStyle() {
        if (this.cameraPermissionDescriptionDialogStyle == null) {
            StyleUseCase styleUseCase = getStyleUseCase();
            PermissionDescriptionType permissionDescriptionType = PermissionDescriptionType.CAMERA;
            PermissionDescriptionDialogStyle incomingStyle = styleUseCase.getIncomingStyle(permissionDescriptionType);
            if (incomingStyle == null) {
                incomingStyle = PermissionDescriptionDialogStyle.Companion.getDefaultDialogStyle(permissionDescriptionType);
            }
            this.cameraPermissionDescriptionDialogStyle = incomingStyle;
        }
        PermissionDescriptionDialogStyle permissionDescriptionDialogStyle = this.cameraPermissionDescriptionDialogStyle;
        z65.e(permissionDescriptionDialogStyle);
        return permissionDescriptionDialogStyle;
    }

    public final ChatStyle getChatStyle() {
        if (this.lightTheme == null && this.darkTheme == null) {
            synchronized (ChatStyle.class) {
                try {
                    Pair<ChatStyle, ChatStyle> incomingStyle = getStyleUseCase().getIncomingStyle();
                    this.lightTheme = incomingStyle.c();
                    ChatStyle d = incomingStyle.d();
                    this.darkTheme = d;
                    if (this.lightTheme == null && d == null) {
                        this.lightTheme = new ChatStyle();
                    }
                    Unit unit = Unit.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        int i = WhenMappings.$EnumSwitchMapping$0[ThreadsLib.Companion.getInstance().getCurrentUiTheme().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    if (UiExtensionsKt.isDarkThemeOn(this.context)) {
                        ChatStyle chatStyle = this.darkTheme;
                        if (chatStyle == null) {
                            ChatStyle chatStyle2 = this.lightTheme;
                            z65.e(chatStyle2);
                            return chatStyle2;
                        }
                        return chatStyle;
                    }
                    ChatStyle chatStyle3 = this.lightTheme;
                    z65.e(chatStyle3);
                    return chatStyle3;
                }
                throw new NoWhenBranchMatchedException();
            }
            ChatStyle chatStyle4 = this.darkTheme;
            if (chatStyle4 == null) {
                ChatStyle chatStyle5 = this.lightTheme;
                z65.e(chatStyle5);
                return chatStyle5;
            }
            return chatStyle4;
        }
        ChatStyle chatStyle6 = this.lightTheme;
        z65.e(chatStyle6);
        return chatStyle6;
    }

    public final ChatStyle getDarkTheme() {
        return this.darkTheme;
    }

    public final boolean getIsAttachmentsEnabled() {
        Boolean bool = this.isAttachmentsEnabled;
        if (bool != null || (bool = MetadataUi.getAttachmentEnabled(this.context)) != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final ChatStyle getLightTheme() {
        return this.lightTheme;
    }

    public final PendingIntentCreator getPendingIntentCreator() {
        return this.pendingIntentCreator;
    }

    public final PermissionDescriptionDialogStyle getRecordAudioPermissionDescriptionDialogStyle() {
        if (this.recordAudioPermissionDescriptionDialogStyle == null) {
            StyleUseCase styleUseCase = getStyleUseCase();
            PermissionDescriptionType permissionDescriptionType = PermissionDescriptionType.RECORD_AUDIO;
            PermissionDescriptionDialogStyle incomingStyle = styleUseCase.getIncomingStyle(permissionDescriptionType);
            if (incomingStyle == null) {
                incomingStyle = PermissionDescriptionDialogStyle.Companion.getDefaultDialogStyle(permissionDescriptionType);
            }
            this.recordAudioPermissionDescriptionDialogStyle = incomingStyle;
        }
        PermissionDescriptionDialogStyle permissionDescriptionDialogStyle = this.recordAudioPermissionDescriptionDialogStyle;
        z65.e(permissionDescriptionDialogStyle);
        return permissionDescriptionDialogStyle;
    }

    public final Size getScreenSize$threads_release() {
        return this.screenSize;
    }

    public final PermissionDescriptionDialogStyle getStoragePermissionDescriptionDialogStyle() {
        if (this.storagePermissionDescriptionDialogStyle == null) {
            StyleUseCase styleUseCase = getStyleUseCase();
            PermissionDescriptionType permissionDescriptionType = PermissionDescriptionType.STORAGE;
            PermissionDescriptionDialogStyle incomingStyle = styleUseCase.getIncomingStyle(permissionDescriptionType);
            if (incomingStyle == null) {
                incomingStyle = PermissionDescriptionDialogStyle.Companion.getDefaultDialogStyle(permissionDescriptionType);
            }
            this.storagePermissionDescriptionDialogStyle = incomingStyle;
        }
        PermissionDescriptionDialogStyle permissionDescriptionDialogStyle = this.storagePermissionDescriptionDialogStyle;
        z65.e(permissionDescriptionDialogStyle);
        return permissionDescriptionDialogStyle;
    }

    public final void setCameraPermissionDescriptionDialogStyle(PermissionDescriptionDialogStyle permissionDescriptionDialogStyle) {
        if (permissionDescriptionDialogStyle != null) {
            this.cameraPermissionDescriptionDialogStyle = permissionDescriptionDialogStyle;
            getStyleUseCase().setIncomingStyle(PermissionDescriptionType.CAMERA, permissionDescriptionDialogStyle);
        }
    }

    public final void setDarkTheme(ChatStyle chatStyle) {
        this.darkTheme = chatStyle;
    }

    public final void setLightTheme(ChatStyle chatStyle) {
        this.lightTheme = chatStyle;
    }

    public final void setRecordAudioPermissionDescriptionDialogStyle(PermissionDescriptionDialogStyle permissionDescriptionDialogStyle) {
        if (permissionDescriptionDialogStyle != null) {
            this.recordAudioPermissionDescriptionDialogStyle = permissionDescriptionDialogStyle;
            getStyleUseCase().setIncomingStyle(PermissionDescriptionType.RECORD_AUDIO, permissionDescriptionDialogStyle);
        }
    }

    public final void setScreenSize$threads_release(Size size) {
        z65.h(size, "<set-?>");
        this.screenSize = size;
    }

    public final void setStoragePermissionDescriptionDialogStyle(PermissionDescriptionDialogStyle permissionDescriptionDialogStyle) {
        if (permissionDescriptionDialogStyle != null) {
            this.storagePermissionDescriptionDialogStyle = permissionDescriptionDialogStyle;
            getStyleUseCase().setIncomingStyle(PermissionDescriptionType.STORAGE, permissionDescriptionDialogStyle);
        }
    }

    /* compiled from: Config.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0007J\b\u0010\u0007\u001a\u00020\bH\u0007J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0004R\u001a\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0002¨\u0006\f"}, d2 = {"Lim/threads/ui/config/Config$Companion;", "", "()V", "instance", "Lim/threads/ui/config/Config;", "getInstance$annotations", "getInstance", "isInstanceNull", "", "setInstance", "", "config", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Config getInstance() {
            if (Config.instance != null) {
                Config config = Config.instance;
                z65.e(config);
                return config;
            }
            throw new NullPointerException("Config instance is not initialized. Called from business logic?");
        }

        public final boolean isInstanceNull() {
            if (Config.instance == null) {
                return true;
            }
            return false;
        }

        public final void setInstance(Config config) {
            z65.h(config, "config");
            Config.instance = config;
            BaseConfig.Companion.setInstance(config);
        }

        private static /* synthetic */ void getInstance$annotations() {
        }
    }
}
