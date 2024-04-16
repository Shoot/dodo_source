package im.threads.business.core;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.os.Looper;
import ch.qos.logback.core.CoreConstants;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import im.threads.BuildConfig;
import im.threads.business.AuthMethod;
import im.threads.business.UserInfoBuilder;
import im.threads.business.audio.audioConverter.AudioConverter;
import im.threads.business.audio.audioConverter.callback.ILoadCallback;
import im.threads.business.chatUpdates.ChatUpdateProcessor;
import im.threads.business.config.BaseConfig;
import im.threads.business.config.BaseConfigBuilder;
import im.threads.business.controllers.UnreadMessagesController;
import im.threads.business.core.ThreadsLibBase;
import im.threads.business.logger.LoggerConfig;
import im.threads.business.logger.LoggerEdna;
import im.threads.business.models.CampaignMessage;
import im.threads.business.models.enums.CurrentUiTheme;
import im.threads.business.preferences.Preferences;
import im.threads.business.preferences.Preferences$save$1;
import im.threads.business.preferences.PreferencesCoreKeys;
import im.threads.business.rest.queries.BackendApi;
import im.threads.business.rest.queries.DatastoreApi;
import im.threads.business.secureDatabase.DatabaseHolder;
import im.threads.business.serviceLocator.CoreSLModuleKt;
import im.threads.business.serviceLocator.core.LocatorContext;
import im.threads.business.serviceLocator.core.LocatorContextKt;
import im.threads.business.state.ChatState;
import im.threads.business.useractivity.UserActivityTimeProvider;
import im.threads.business.utils.ClientUseCase;
import im.threads.business.utils.preferences.PreferencesMigrationBase;
import im.threads.ui.ChatCenterPushMessageHelper;
import im.threads.ui.controllers.ChatController;
import im.threads.ui.serviceLocator.ServiceLocatorModulesKt;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: ThreadsLibBase.kt */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000 K2\u00020\u0001:\u0001KB\u0011\b\u0004\u0012\u0006\u0010H\u001a\u00020G¢\u0006\u0004\bI\u0010JJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u001a\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0016J\u000f\u0010\u000b\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\f\u001a\u00020\u0002J\u0006\u0010\r\u001a\u00020\u0002J\u000e\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eJ$\u0010\u0016\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0015\u001a\u00020\u0014R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001b\u0010 \u001a\u00020\u001b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010%\u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u001d\u001a\u0004\b#\u0010$R\u001b\u0010*\u001a\u00020&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\u001d\u001a\u0004\b(\u0010)R\u001b\u0010/\u001a\u00020+8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010\u001d\u001a\u0004\b-\u0010.R\u001b\u00104\u001a\u0002008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u0010\u001d\u001a\u0004\b2\u00103R\u0011\u00108\u001a\u0002058F¢\u0006\u0006\u001a\u0004\b6\u00107R\u0011\u00109\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b9\u0010:R$\u0010A\u001a\u00020;2\u0006\u0010<\u001a\u00020;8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R#\u0010F\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00010C0B8F¢\u0006\u0006\u001a\u0004\bD\u0010E¨\u0006L"}, d2 = {"Lim/threads/business/core/ThreadsLibBase;", "", "", "checkAndUpdateFCMToken", "Lim/threads/business/UserInfoBuilder;", "userInfoBuilder", "", "forceRegistration", "initUser", "updateUnreadCountMessagesIfNeed$threads_release", "()V", "updateUnreadCountMessagesIfNeed", "logoutClient", "removeUser", "Lim/threads/business/models/CampaignMessage;", "campaignMessage", "setCampaignMessage", "", "authToken", "authSchema", "Lim/threads/business/AuthMethod;", "authMethod", "updateAuthData", "Lqx1;", "coroutineScope$1", "Lqx1;", "coroutineScope", "Lim/threads/business/preferences/Preferences;", "preferences$delegate", "Lrn5;", "getPreferences", "()Lim/threads/business/preferences/Preferences;", "preferences", "Lim/threads/business/utils/ClientUseCase;", "clientUseCase$delegate", "getClientUseCase", "()Lim/threads/business/utils/ClientUseCase;", "clientUseCase", "Lim/threads/business/chatUpdates/ChatUpdateProcessor;", "chatUpdateProcessor$delegate", "getChatUpdateProcessor", "()Lim/threads/business/chatUpdates/ChatUpdateProcessor;", "chatUpdateProcessor", "Lim/threads/business/secureDatabase/DatabaseHolder;", "database$delegate", "getDatabase", "()Lim/threads/business/secureDatabase/DatabaseHolder;", "database", "Lim/threads/business/state/ChatState;", "chatState$delegate", "getChatState", "()Lim/threads/business/state/ChatState;", "chatState", "", "getSecondsSinceLastActivity", "()J", "secondsSinceLastActivity", "isUserInitialized", "()Z", "Lim/threads/business/models/enums/CurrentUiTheme;", "value", "getCurrentUiTheme", "()Lim/threads/business/models/enums/CurrentUiTheme;", "setCurrentUiTheme", "(Lim/threads/business/models/enums/CurrentUiTheme;)V", "currentUiTheme", "Li14;", "", "getSocketResponseMapProcessor", "()Li14;", "socketResponseMapProcessor", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Companion", "threads_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes3.dex */
public class ThreadsLibBase {
    public static final Companion Companion = new Companion(null);
    private static final rn5<ClientUseCase> clientInteractor$delegate;
    private static final qx1 coroutineScope;
    @SuppressLint({"StaticFieldLeak"})
    private static ThreadsLibBase libInstance;
    private final rn5 chatState$delegate;
    private final rn5 chatUpdateProcessor$delegate;
    private final rn5 clientUseCase$delegate;
    private final qx1 coroutineScope$1;
    private final rn5 database$delegate;
    private final rn5 preferences$delegate;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ThreadsLibBase.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lim/threads/business/serviceLocator/core/LocatorContext;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: im.threads.business.core.ThreadsLibBase$1 */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends ej5 implements Function1<LocatorContext, Unit> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(LocatorContext locatorContext) {
            invoke2(locatorContext);
            return Unit.a;
        }

        /* renamed from: invoke */
        public final void invoke2(LocatorContext locatorContext) {
            z65.h(locatorContext, "$this$startEdnaLocator");
            locatorContext.modules(CoreSLModuleKt.getCoreSLModule(), ServiceLocatorModulesKt.getUiSLModule());
        }
    }

    static {
        rn5<ClientUseCase> b;
        b = yn5.b(ThreadsLibBase$special$$inlined$inject$6.INSTANCE);
        clientInteractor$delegate = b;
        coroutineScope = rx1.a(v33.c());
    }

    public ThreadsLibBase(Context context) {
        rn5 b;
        rn5 b2;
        rn5 b3;
        rn5 b4;
        rn5 b5;
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        ContextHolder.INSTANCE.setContext(context);
        LocatorContextKt.startEdnaLocator(AnonymousClass1.INSTANCE);
        this.coroutineScope$1 = rx1.a(v33.b());
        b = yn5.b(ThreadsLibBase$special$$inlined$inject$1.INSTANCE);
        this.preferences$delegate = b;
        b2 = yn5.b(ThreadsLibBase$special$$inlined$inject$2.INSTANCE);
        this.clientUseCase$delegate = b2;
        b3 = yn5.b(ThreadsLibBase$special$$inlined$inject$3.INSTANCE);
        this.chatUpdateProcessor$delegate = b3;
        b4 = yn5.b(ThreadsLibBase$special$$inlined$inject$4.INSTANCE);
        this.database$delegate = b4;
        b5 = yn5.b(ThreadsLibBase$special$$inlined$inject$5.INSTANCE);
        this.chatState$delegate = b5;
    }

    public static final void changeServerSettings(String str, String str2, String str3, String str4, List<Integer> list, boolean z) {
        Companion.changeServerSettings(str, str2, str3, str4, list, z);
    }

    private final void checkAndUpdateFCMToken() {
        boolean O;
        Object obj;
        boolean J;
        boolean u;
        String T0;
        Object U0;
        Preferences preferences = getPreferences();
        String fcm_token = PreferencesCoreKeys.INSTANCE.getFCM_TOKEN();
        Type type = new TypeToken<String>() { // from class: im.threads.business.core.ThreadsLibBase$checkAndUpdateFCMToken$$inlined$get$default$1
        }.getType();
        z65.g(type, "object : TypeToken<T>() {}.type");
        Object obj2 = null;
        try {
            Preferences.Companion companion = Preferences.Companion;
            String preferenceFromRam = companion.getPreferenceFromRam(fcm_token);
            int length = preferenceFromRam.length();
            String str = preferenceFromRam;
            if (length == 0) {
                str = preferenceFromRam;
                if (!companion.isRamPreferencesLoaded()) {
                    String string = preferences.getSharedPreferences().getString(fcm_token, null);
                    if (string == null) {
                        string = "";
                    } else {
                        z65.g(string, "sharedPreferences.getString(key, null) ?: \"\"");
                    }
                    String str2 = string;
                    int length2 = str2.length();
                    str = str2;
                    if (length2 > 0) {
                        companion.savePreferenceToRam(fcm_token, str2);
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
        CharSequence charSequence = (CharSequence) obj2;
        if (charSequence == null || charSequence.length() == 0) {
            FirebaseMessaging.l().o().c(new n77() { // from class: keb
                @Override // defpackage.n77
                public final void a(y6b y6bVar) {
                    ThreadsLibBase.checkAndUpdateFCMToken$lambda$2(y6bVar);
                }
            });
        }
    }

    public static final void checkAndUpdateFCMToken$lambda$2(y6b y6bVar) {
        z65.h(y6bVar, "task");
        if (y6bVar.q()) {
            new ChatCenterPushMessageHelper().setFcmToken((String) y6bVar.m());
        }
    }

    private final ChatState getChatState() {
        return (ChatState) this.chatState$delegate.getValue();
    }

    private final ChatUpdateProcessor getChatUpdateProcessor() {
        return (ChatUpdateProcessor) this.chatUpdateProcessor$delegate.getValue();
    }

    private final ClientUseCase getClientUseCase() {
        return (ClientUseCase) this.clientUseCase$delegate.getValue();
    }

    private final DatabaseHolder getDatabase() {
        return (DatabaseHolder) this.database$delegate.getValue();
    }

    public static final ThreadsLibBase getInstance() {
        return Companion.getInstance();
    }

    public static final String getLibVersion() {
        return Companion.getLibVersion();
    }

    public static final void init(BaseConfigBuilder baseConfigBuilder) {
        Companion.init(baseConfigBuilder);
    }

    public static /* synthetic */ void initUser$default(ThreadsLibBase threadsLibBase, UserInfoBuilder userInfoBuilder, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                z = false;
            }
            threadsLibBase.initUser(userInfoBuilder, z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: initUser");
    }

    public static final void setLibraryInstance(ThreadsLibBase threadsLibBase) {
        Companion.setLibraryInstance(threadsLibBase);
    }

    public static /* synthetic */ void updateAuthData$default(ThreadsLibBase threadsLibBase, String str, String str2, AuthMethod authMethod, int i, Object obj) {
        if (obj == null) {
            if ((i & 4) != 0) {
                authMethod = AuthMethod.HEADERS;
            }
            threadsLibBase.updateAuthData(str, str2, authMethod);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateAuthData");
    }

    public final CurrentUiTheme getCurrentUiTheme() {
        boolean O;
        boolean J;
        boolean u;
        String T0;
        Object U0;
        Preferences preferences = getPreferences();
        String user_selected_ui_theme_key = PreferencesCoreKeys.INSTANCE.getUSER_SELECTED_UI_THEME_KEY();
        Object valueOf = Integer.valueOf(CurrentUiTheme.SYSTEM.getValue());
        Type type = new TypeToken<Integer>() { // from class: im.threads.business.core.ThreadsLibBase$special$$inlined$get$1
        }.getType();
        z65.g(type, "object : TypeToken<T>() {}.type");
        Object obj = null;
        try {
            Preferences.Companion companion = Preferences.Companion;
            String preferenceFromRam = companion.getPreferenceFromRam(user_selected_ui_theme_key);
            if (preferenceFromRam.length() == 0 && !companion.isRamPreferencesLoaded()) {
                String string = preferences.getSharedPreferences().getString(user_selected_ui_theme_key, null);
                if (string == null) {
                    string = "";
                } else {
                    z65.g(string, "sharedPreferences.getString(key, null) ?: \"\"");
                }
                preferenceFromRam = string;
                if (preferenceFromRam.length() > 0) {
                    companion.savePreferenceToRam(user_selected_ui_theme_key, preferenceFromRam);
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
                            valueOf = (Integer) U0;
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                        }
                    }
                }
                if (preferenceFromRam != null) {
                    valueOf = (Integer) preferenceFromRam;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                }
            } else {
                Object l = new Gson().l(preferenceFromRam, type);
                if (l != null) {
                    valueOf = l;
                }
            }
            if (!z65.c(valueOf, "null")) {
                obj = valueOf;
            }
        } catch (Exception unused) {
        }
        return CurrentUiTheme.Companion.fromInt((Integer) obj);
    }

    public final Preferences getPreferences() {
        return (Preferences) this.preferences$delegate.getValue();
    }

    public final long getSecondsSinceLastActivity() {
        return UserActivityTimeProvider.INSTANCE.getLastUserActivityTimeCounter().getSecondsSinceLastActivity();
    }

    public final i14<Map<String, Object>> getSocketResponseMapProcessor() {
        return getChatUpdateProcessor().getSocketResponseMapProcessor();
    }

    /* JADX WARN: Code restructure failed: missing block: B:120:0x00e9, code lost:
        if (r8 != false) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:127:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void initUser(im.threads.business.UserInfoBuilder r8, boolean r9) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: im.threads.business.core.ThreadsLibBase.initUser(im.threads.business.UserInfoBuilder, boolean):void");
    }

    public final boolean isUserInitialized() {
        return getClientUseCase().isClientIdNotEmpty();
    }

    public final void logoutClient() {
        String str;
        boolean y;
        getChatState().onLogout();
        UserInfoBuilder userInfo = getClientUseCase().getUserInfo();
        if (userInfo != null) {
            str = userInfo.getClientId();
        } else {
            str = null;
        }
        if (str != null) {
            y = l0b.y(str);
            if (!y) {
                BaseConfig.Companion.getInstance().transport.sendClientOffline(str);
                BaseConfig.Companion.getInstance().transport.closeWebSocket();
                getClientUseCase().saveUserInfo(null);
                ChatController.cleanAll$threads_release$default(ChatController.Companion.getInstance(), false, 1, null);
            }
        }
        LoggerEdna.info("clientId must not be empty");
        BaseConfig.Companion.getInstance().transport.closeWebSocket();
        getClientUseCase().saveUserInfo(null);
        ChatController.cleanAll$threads_release$default(ChatController.Companion.getInstance(), false, 1, null);
    }

    public final void removeUser() {
        getClientUseCase().saveUserInfo(null);
    }

    public final void setCampaignMessage(CampaignMessage campaignMessage) {
        String str;
        z65.h(campaignMessage, "campaignMessage");
        Preferences preferences = getPreferences();
        String campaign_message = PreferencesCoreKeys.INSTANCE.getCAMPAIGN_MESSAGE();
        if (campaignMessage instanceof String) {
            str = (String) campaignMessage;
        } else {
            str = new Gson().t(campaignMessage).toString();
        }
        Preferences.Companion.savePreferenceToRam(campaign_message, str);
        sh0.d(preferences.getCoroutineScope(), null, null, new Preferences$save$1(preferences, campaign_message, str, null), 3, null);
    }

    public final void setCurrentUiTheme(CurrentUiTheme currentUiTheme) {
        String str;
        z65.h(currentUiTheme, "value");
        Preferences preferences = getPreferences();
        String user_selected_ui_theme_key = PreferencesCoreKeys.INSTANCE.getUSER_SELECTED_UI_THEME_KEY();
        Integer valueOf = Integer.valueOf(currentUiTheme.getValue());
        if (valueOf instanceof String) {
            str = (String) valueOf;
        } else {
            str = new Gson().t(valueOf).toString();
        }
        Preferences.Companion.savePreferenceToRam(user_selected_ui_theme_key, str);
        sh0.d(preferences.getCoroutineScope(), null, null, new Preferences$save$1(preferences, user_selected_ui_theme_key, str, null), 3, null);
    }

    public final void updateAuthData(String str, String str2, AuthMethod authMethod) {
        z65.h(authMethod, "authMethod");
        UserInfoBuilder userInfo = getClientUseCase().getUserInfo();
        if (userInfo != null) {
            userInfo.setAuthData(str, str2, authMethod);
            getClientUseCase().saveUserInfo(userInfo);
        }
        BaseConfig.Companion.getInstance().transport.buildTransport();
    }

    public final void updateUnreadCountMessagesIfNeed$threads_release() {
        if (BaseConfig.Companion.getInstance().getUnreadMessagesCountListener() != null && getClientUseCase().getUserInfo() != null) {
            ChatController.loadHistory$threads_release$default(ChatController.Companion.getInstance(), null, null, false, false, false, true, null, null, 223, null);
        }
    }

    /* compiled from: ThreadsLibBase.kt */
    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b7\u0010\u0013J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u001e\u0010\u0007\u001a\u00020\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\b\u001a\u00020\u0002H\u0002J\b\u0010\t\u001a\u00020\u0002H\u0002J\b\u0010\u000b\u001a\u00020\nH\u0007J\u0010\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0007J\u0017\u0010\u0011\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0014\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0017\u001a\u00020\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0015\u0010\u0016JP\u0010!\u001a\u00020\u00022\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\n2\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001c2\u0006\u0010 \u001a\u00020\u001fH\u0007J\b\u0010#\u001a\u00020\"H\u0007J\u0010\u0010%\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\"H\u0005J\u0010\u0010&\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0004R\u001b\u0010,\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R*\u0010-\u001a\u0004\u0018\u00010\"8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b-\u0010.\u0012\u0004\b3\u0010\u0013\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u0014\u00105\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106¨\u00068"}, d2 = {"Lim/threads/business/core/ThreadsLibBase$Companion;", "", "", "migratePreference", "Lkotlin/Function0;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "loadPreferencesInRam", "updateTransport", "showVersionsLog", "", "getLibVersion", "Lim/threads/business/config/BaseConfigBuilder;", "configBuilder", "init", "insertMetaDataToConfigBuilder$threads_release", "(Lim/threads/business/config/BaseConfigBuilder;)V", "insertMetaDataToConfigBuilder", "initBaseParams$threads_release", "()V", "initBaseParams", "loadRamPrefs$threads_release", "(Lkotlin/jvm/functions/Function0;Landroid/content/Context;)V", "loadRamPrefs", "baseUrl", "datastoreUrl", "threadsGateUrl", "threadsGateProviderUid", "", "", "trustedSSLCertificates", "", "allowUntrustedSSLCertificate", "changeServerSettings", "Lim/threads/business/core/ThreadsLibBase;", "getInstance", "instance", "setLibraryInstance", "createLibInstance", "Lim/threads/business/utils/ClientUseCase;", "clientInteractor$delegate", "Lrn5;", "getClientInteractor", "()Lim/threads/business/utils/ClientUseCase;", "clientInteractor", "libInstance", "Lim/threads/business/core/ThreadsLibBase;", "getLibInstance$threads_release", "()Lim/threads/business/core/ThreadsLibBase;", "setLibInstance$threads_release", "(Lim/threads/business/core/ThreadsLibBase;)V", "getLibInstance$threads_release$annotations", "Lqx1;", "coroutineScope", "Lqx1;", "<init>", "threads_release"}, k = 1, mv = {1, 8, 0})
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

        private final ClientUseCase getClientInteractor() {
            return (ClientUseCase) ThreadsLibBase.clientInteractor$delegate.getValue();
        }

        public static final void initBaseParams$lambda$5$lambda$3(Function1 function1, Object obj) {
            z65.h(function1, "$tmp0");
            function1.invoke(obj);
        }

        public static final void initBaseParams$lambda$5$lambda$4(Function1 function1, Object obj) {
            z65.h(function1, "$tmp0");
            function1.invoke(obj);
        }

        public static final void initBaseParams$lambda$6(Function1 function1, Object obj) {
            z65.h(function1, "$tmp0");
            function1.invoke(obj);
        }

        public final void loadPreferencesInRam(Function0<Unit> function0, Context context) {
            function0.invoke();
            new Preferences(context).loadPreferencesInRam$threads_release();
        }

        public final void migratePreference() {
            PreferencesMigrationBase preferencesMigrationBase = new PreferencesMigrationBase(BaseConfig.Companion.getInstance().context);
            preferencesMigrationBase.migrateMainSharedPreferences();
            preferencesMigrationBase.migrateUserInfo();
        }

        private final void showVersionsLog() {
            if (BaseConfig.Companion.getInstance().getLoggerConfig() != null) {
                sh0.d(ThreadsLibBase.coroutineScope, v33.b(), null, new ThreadsLibBase$Companion$showVersionsLog$1(null), 2, null);
            }
        }

        private final void updateTransport() {
            BaseConfig.Companion companion = BaseConfig.Companion;
            String threadsGateUrl = companion.getInstance().getThreadsGateUrl();
            String threadsGateProviderUid = companion.getInstance().getThreadsGateProviderUid();
            List<Integer> trustedSSLCertificates = companion.getInstance().getTrustedSSLCertificates();
            if (threadsGateUrl != null && threadsGateProviderUid != null) {
                companion.getInstance().updateTransport$threads_release(threadsGateUrl, threadsGateProviderUid, trustedSSLCertificates);
            }
        }

        public final void changeServerSettings(String str, String str2, String str3, String str4, List<Integer> list, boolean z) {
            try {
                BaseConfig.Companion companion = BaseConfig.Companion;
                companion.getInstance().setSslSocketFactoryConfig(null);
                companion.getInstance().setAllowUntrustedSSLCertificate(z);
                if (str != null) {
                    companion.getInstance().setServerBaseUrl(str);
                }
                if (str2 != null) {
                    companion.getInstance().setDatastoreUrl(str2);
                }
                if (str3 != null && str4 != null) {
                    companion.getInstance().updateTransport$threads_release(str3, str4, list);
                }
                BackendApi.Companion.init(companion.getInstance());
                DatastoreApi.Companion.init(companion.getInstance());
            } catch (Exception e) {
                sh0.d(ThreadsLibBase.coroutineScope, null, null, new ThreadsLibBase$Companion$changeServerSettings$1(e, null), 3, null);
            }
        }

        protected final void createLibInstance(Context context) {
            z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
            if (getLibInstance$threads_release() == null) {
                setLibInstance$threads_release(new ThreadsLibBase(context));
                return;
            }
            throw new IllegalStateException("ThreadsLib has already been initialized".toString());
        }

        public final ThreadsLibBase getInstance() {
            if (getLibInstance$threads_release() != null) {
                ThreadsLibBase libInstance$threads_release = getLibInstance$threads_release();
                z65.e(libInstance$threads_release);
                return libInstance$threads_release;
            }
            throw new IllegalStateException("ThreadsLib should be initialized first with ThreadsLib.init()".toString());
        }

        public final ThreadsLibBase getLibInstance$threads_release() {
            return ThreadsLibBase.libInstance;
        }

        public final String getLibVersion() {
            return BuildConfig.VERSION_NAME;
        }

        public final void init(BaseConfigBuilder baseConfigBuilder) {
            z65.h(baseConfigBuilder, "configBuilder");
            long currentTimeMillis = System.currentTimeMillis();
            insertMetaDataToConfigBuilder$threads_release(baseConfigBuilder);
            createLibInstance(baseConfigBuilder.getContext());
            BaseConfig.Companion companion = BaseConfig.Companion;
            companion.setInstance(baseConfigBuilder.build());
            LoggerConfig loggerConfig = companion.getInstance().getLoggerConfig();
            if (loggerConfig != null) {
                LoggerEdna.init(loggerConfig);
            }
            loadRamPrefs$threads_release(new ThreadsLibBase$Companion$init$2(this), baseConfigBuilder.getContext());
            initBaseParams$threads_release();
            LoggerEdna.info("Lib_init_time: " + (System.currentTimeMillis() - currentTimeMillis) + "ms");
        }

        @SuppressLint({"CheckResult"})
        public final void initBaseParams$threads_release() {
            BackendApi.Companion companion = BackendApi.Companion;
            BaseConfig.Companion companion2 = BaseConfig.Companion;
            companion.init(companion2.getInstance());
            DatastoreApi.Companion.init(companion2.getInstance());
            UnreadMessagesCountListener unreadMessagesCountListener = companion2.getInstance().getUnreadMessagesCountListener();
            if (unreadMessagesCountListener != null) {
                l04<Integer> H = UnreadMessagesController.INSTANCE.getUnreadMessagesPublishProcessor().p().H(ti.c());
                final ThreadsLibBase$Companion$initBaseParams$1$1 threadsLibBase$Companion$initBaseParams$1$1 = new ThreadsLibBase$Companion$initBaseParams$1$1(unreadMessagesCountListener);
                wr1<? super Integer> wr1Var = new wr1() { // from class: leb
                    @Override // defpackage.wr1
                    public final void accept(Object obj) {
                        ThreadsLibBase.Companion.initBaseParams$lambda$5$lambda$3(Function1.this, obj);
                    }
                };
                final ThreadsLibBase$Companion$initBaseParams$1$2 threadsLibBase$Companion$initBaseParams$1$2 = ThreadsLibBase$Companion$initBaseParams$1$2.INSTANCE;
                H.P(wr1Var, new wr1() { // from class: meb
                    @Override // defpackage.wr1
                    public final void accept(Object obj) {
                        ThreadsLibBase.Companion.initBaseParams$lambda$5$lambda$4(Function1.this, obj);
                    }
                });
                sh0.d(ThreadsLibBase.coroutineScope, null, null, new ThreadsLibBase$Companion$initBaseParams$1$3(unreadMessagesCountListener, null), 3, null);
            }
            if (Build.VERSION.SDK_INT < 29) {
                try {
                    AudioConverter.Companion.load$threads_release(companion2.getInstance().context, new ILoadCallback() { // from class: im.threads.business.core.ThreadsLibBase$Companion$initBaseParams$2
                        @Override // im.threads.business.audio.audioConverter.callback.ILoadCallback
                        public void onFailure(Exception exc) {
                            z65.h(exc, "error");
                            LoggerEdna.error("AndroidAudioConverter failed to load", exc);
                        }

                        @Override // im.threads.business.audio.audioConverter.callback.ILoadCallback
                        public void onSuccess() {
                            LoggerEdna.info("AndroidAudioConverter was successfully loaded");
                        }
                    });
                } catch (UnsatisfiedLinkError e) {
                    LoggerEdna.error("AndroidAudioConverter failed to load (UnsatisfiedLinkError)", e);
                }
            }
            getClientInteractor().initClientId();
            UserActivityTimeProvider.INSTANCE.initializeLastUserActivity();
            if (tp9.e() == null) {
                final ThreadsLibBase$Companion$initBaseParams$3 threadsLibBase$Companion$initBaseParams$3 = ThreadsLibBase$Companion$initBaseParams$3.INSTANCE;
                tp9.y(new wr1() { // from class: neb
                    @Override // defpackage.wr1
                    public final void accept(Object obj) {
                        ThreadsLibBase.Companion.initBaseParams$lambda$6(Function1.this, obj);
                    }
                });
            }
            updateTransport();
            showVersionsLog();
        }

        /* JADX WARN: Code restructure failed: missing block: B:32:0x000f, code lost:
            if (r0 != false) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x0026, code lost:
            if (r0 != false) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x003d, code lost:
            if (r0 != false) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x0054, code lost:
            if (r0 != false) goto L23;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void insertMetaDataToConfigBuilder$threads_release(im.threads.business.config.BaseConfigBuilder r2) {
            /*
                r1 = this;
                java.lang.String r0 = "configBuilder"
                defpackage.z65.h(r2, r0)
                java.lang.String r0 = r2.getDatastoreUrl$threads_release()
                if (r0 == 0) goto L11
                boolean r0 = defpackage.c0b.y(r0)
                if (r0 == 0) goto L1c
            L11:
                android.content.Context r0 = r2.getContext()
                java.lang.String r0 = im.threads.business.utils.MetadataBusiness.getDatastoreUrl(r0)
                r2.setDatastoreUrl$threads_release(r0)
            L1c:
                java.lang.String r0 = r2.getServerBaseUrl$threads_release()
                if (r0 == 0) goto L28
                boolean r0 = defpackage.c0b.y(r0)
                if (r0 == 0) goto L33
            L28:
                android.content.Context r0 = r2.getContext()
                java.lang.String r0 = im.threads.business.utils.MetadataBusiness.getServerBaseUrl(r0)
                r2.setServerBaseUrl$threads_release(r0)
            L33:
                java.lang.String r0 = r2.getThreadsGateUrl$threads_release()
                if (r0 == 0) goto L3f
                boolean r0 = defpackage.c0b.y(r0)
                if (r0 == 0) goto L4a
            L3f:
                android.content.Context r0 = r2.getContext()
                java.lang.String r0 = im.threads.business.utils.MetadataBusiness.getThreadsGateUrl(r0)
                r2.setThreadsGateUrl$threads_release(r0)
            L4a:
                java.lang.String r0 = r2.getThreadsGateProviderUid$threads_release()
                if (r0 == 0) goto L56
                boolean r0 = defpackage.c0b.y(r0)
                if (r0 == 0) goto L61
            L56:
                android.content.Context r0 = r2.getContext()
                java.lang.String r0 = im.threads.business.utils.MetadataBusiness.getThreadsGateProviderUid(r0)
                r2.setThreadsGateProviderUid$threads_release(r0)
            L61:
                boolean r0 = r2.isNewChatCenterApi$threads_release()
                if (r0 != 0) goto L72
                android.content.Context r0 = r2.getContext()
                boolean r0 = im.threads.business.utils.MetadataBusiness.getNewChatCenterApi(r0)
                r2.setNewChatCenterApi$threads_release(r0)
            L72:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: im.threads.business.core.ThreadsLibBase.Companion.insertMetaDataToConfigBuilder$threads_release(im.threads.business.config.BaseConfigBuilder):void");
        }

        public final void loadRamPrefs$threads_release(Function0<Unit> function0, Context context) {
            z65.h(function0, "migratePreference");
            z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
            if (z65.c(Looper.myLooper(), Looper.getMainLooper())) {
                sh0.d(rx1.a(v33.b()), null, null, new ThreadsLibBase$Companion$loadRamPrefs$1(function0, context, null), 3, null);
            } else {
                loadPreferencesInRam(function0, context);
            }
        }

        public final void setLibInstance$threads_release(ThreadsLibBase threadsLibBase) {
            ThreadsLibBase.libInstance = threadsLibBase;
        }

        protected final void setLibraryInstance(ThreadsLibBase threadsLibBase) {
            z65.h(threadsLibBase, "instance");
            setLibInstance$threads_release(threadsLibBase);
        }

        public static /* synthetic */ void getLibInstance$threads_release$annotations() {
        }
    }
}
