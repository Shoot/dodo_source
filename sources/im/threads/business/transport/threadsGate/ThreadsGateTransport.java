package im.threads.business.transport.threadsGate;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.lifecycle.d;
import ch.qos.logback.core.CoreConstants;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.huawei.hms.push.constant.RemoteMessageConst;
import defpackage.b77;
import defpackage.hi9;
import defpackage.k65;
import defpackage.mq4;
import im.threads.R;
import im.threads.business.UserInfoBuilder;
import im.threads.business.chatUpdates.ChatUpdateProcessor;
import im.threads.business.config.BaseConfig;
import im.threads.business.formatters.ChatItemType;
import im.threads.business.formatters.JsonFormatter;
import im.threads.business.logger.LoggerEdna;
import im.threads.business.models.CampaignMessage;
import im.threads.business.models.ChatItem;
import im.threads.business.models.ChatItemSendErrorModel;
import im.threads.business.models.ConsultInfo;
import im.threads.business.models.LatLng;
import im.threads.business.models.QuestionDTO;
import im.threads.business.models.SslSocketFactoryConfig;
import im.threads.business.models.Survey;
import im.threads.business.models.UserPhrase;
import im.threads.business.preferences.Preferences;
import im.threads.business.preferences.Preferences$save$1;
import im.threads.business.preferences.PreferencesCoreKeys;
import im.threads.business.rest.config.SocketClientSettings;
import im.threads.business.secureDatabase.DatabaseHolder;
import im.threads.business.state.ChatState;
import im.threads.business.state.ChatStateEnum;
import im.threads.business.transport.AuthInterceptor;
import im.threads.business.transport.MessageAttributes;
import im.threads.business.transport.OutgoingMessageCreator;
import im.threads.business.transport.Transport;
import im.threads.business.transport.TransportException;
import im.threads.business.transport.threadsGate.ThreadsGateTransport;
import im.threads.business.transport.threadsGate.requests.RegisterDeviceRequest;
import im.threads.business.transport.threadsGate.requests.SendMessageRequest;
import im.threads.business.transport.threadsGate.responses.Status;
import im.threads.business.utils.AppInfo;
import im.threads.business.utils.ClientUseCase;
import im.threads.business.utils.DeviceInfo;
import im.threads.business.utils.SSLCertificateInterceptor;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ThreadsGateTransport.kt */
@Metadata(d1 = {"\u0000¨\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 ½\u00012\u00020\u00012\u00020\u0002:\u0004½\u0001¾\u0001BG\u0012\u0006\u0010@\u001a\u00020\u0007\u0012\u0006\u0010D\u001a\u00020\u0007\u0012\u0006\u0010F\u001a\u00020\u0005\u0012\u0006\u0010I\u001a\u00020H\u0012\n\b\u0002\u0010L\u001a\u0004\u0018\u00010K\u0012\b\u0010O\u001a\u0004\u0018\u00010N\u0012\u0006\u0010R\u001a\u00020Q¢\u0006\u0006\b»\u0001\u0010¼\u0001J8\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u0005H\u0002J\u0012\u0010\r\u001a\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u0007H\u0002J\u0012\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u000e\u001a\u00020\u0005H\u0002J\b\u0010\u0011\u001a\u00020\u000fH\u0002J\b\u0010\u0012\u001a\u00020\u000fH\u0002J\n\u0010\u0013\u001a\u0004\u0018\u00010\u0007H\u0002J\b\u0010\u0014\u001a\u00020\u0007H\u0002J\u0010\u0010\u0015\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0002J\u0018\u0010\u0017\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0005H\u0002J\b\u0010\u0018\u001a\u00020\u000fH\u0002J\u0010\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u0007H\u0002J\b\u0010\u001a\u001a\u00020\u0007H\u0002J\b\u0010\u001b\u001a\u00020\u0007H\u0002J\b\u0010\u001c\u001a\u00020\u000fH\u0016J\u0010\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016J\u0010\u0010!\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u0005H\u0016J\u0010\u0010#\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020\u0007H\u0016J\u0010\u0010\u0011\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020\u0005H\u0016J\u0010\u0010%\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0005H\u0016J\u000f\u0010(\u001a\u00020\u000fH\u0010¢\u0006\u0004\b&\u0010'J.\u0010\u000b\u001a\u00020\u00052\u0006\u0010*\u001a\u00020)2\b\u0010,\u001a\u0004\u0018\u00010+2\b\u0010-\u001a\u0004\u0018\u00010\u00072\b\u0010.\u001a\u0004\u0018\u00010\u0007H\u0016J\u0010\u00100\u001a\u00020\u000f2\u0006\u0010/\u001a\u00020\u0007H\u0016J\u001e\u00100\u001a\u00020\u000f2\u0006\u0010/\u001a\u00020\u00072\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u000f01H\u0016J\u0018\u00106\u001a\u00020\u000f2\u0006\u00104\u001a\u0002032\u0006\u00105\u001a\u000203H\u0016J\b\u00107\u001a\u00020\u0007H\u0016J\u0012\u0010:\u001a\u00020\u000f2\b\u00109\u001a\u0004\u0018\u000108H\u0016J\u0010\u0010=\u001a\u00020\u000f2\u0006\u0010<\u001a\u00020;H\u0016J\u0010\u0010>\u001a\u00020\u000f2\u0006\u0010<\u001a\u00020;H\u0016J\b\u0010?\u001a\u00020\u000fH\u0016R\u001a\u0010@\u001a\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u001a\u0010D\u001a\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\bD\u0010A\u001a\u0004\bE\u0010CR\u0014\u0010F\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010I\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0016\u0010L\u001a\u0004\u0018\u00010K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0016\u0010O\u001a\u0004\u0018\u00010N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010R\u001a\u00020Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR(\u0010U\u001a\u00020T8\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0004\bU\u0010V\u0012\u0004\b[\u0010'\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR,\u0010]\u001a\u00060\\R\u00020\u00008\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0004\b]\u0010^\u0012\u0004\bc\u0010'\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR*\u0010e\u001a\u0004\u0018\u00010d8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\be\u0010f\u0012\u0004\bk\u0010'\u001a\u0004\bg\u0010h\"\u0004\bi\u0010jR\u0016\u0010m\u001a\u00020l8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bm\u0010nR\u0018\u0010p\u001a\u0004\u0018\u00010o8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bp\u0010qR\u0014\u0010s\u001a\u00020r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bs\u0010tR\u001a\u0010v\u001a\b\u0012\u0004\u0012\u00020\u00070u8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bv\u0010wR \u0010z\u001a\u000e\u0012\u0004\u0012\u00020y\u0012\u0004\u0012\u00020\u001d0x8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bz\u0010{R\"\u0010}\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020|0x8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b}\u0010{R\u0018\u00109\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010~R \u0010\u0084\u0001\u001a\u00020\u007f8BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0080\u0001\u0010\u0081\u0001\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001R!\u0010\u0089\u0001\u001a\u00030\u0085\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0086\u0001\u0010\u0081\u0001\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001R!\u0010\u008e\u0001\u001a\u00030\u008a\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u008b\u0001\u0010\u0081\u0001\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001R!\u0010\u0093\u0001\u001a\u00030\u008f\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0090\u0001\u0010\u0081\u0001\u001a\u0006\b\u0091\u0001\u0010\u0092\u0001R!\u0010\u0098\u0001\u001a\u00030\u0094\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0095\u0001\u0010\u0081\u0001\u001a\u0006\b\u0096\u0001\u0010\u0097\u0001R!\u0010\u009d\u0001\u001a\u00030\u0099\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u009a\u0001\u0010\u0081\u0001\u001a\u0006\b\u009b\u0001\u0010\u009c\u0001R!\u0010¢\u0001\u001a\u00030\u009e\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u009f\u0001\u0010\u0081\u0001\u001a\u0006\b \u0001\u0010¡\u0001R!\u0010§\u0001\u001a\u00030£\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b¤\u0001\u0010\u0081\u0001\u001a\u0006\b¥\u0001\u0010¦\u0001R!\u0010¬\u0001\u001a\u00030¨\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b©\u0001\u0010\u0081\u0001\u001a\u0006\bª\u0001\u0010«\u0001R!\u0010±\u0001\u001a\u00030\u00ad\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b®\u0001\u0010\u0081\u0001\u001a\u0006\b¯\u0001\u0010°\u0001R!\u0010¶\u0001\u001a\u00030²\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b³\u0001\u0010\u0081\u0001\u001a\u0006\b´\u0001\u0010µ\u0001R\"\u0010¸\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00070·\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¸\u0001\u0010¹\u0001R\u001a\u0010º\u0001\u001a\u0004\u0018\u00010r8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bº\u0001\u0010t¨\u0006¿\u0001"}, d2 = {"Lim/threads/business/transport/threadsGate/ThreadsGateTransport;", "Lim/threads/business/transport/Transport;", "Lpq2;", "Lmb5;", RemoteMessageConst.Notification.CONTENT, "", "important", "", "correlationId", "tryOpeningWebSocket", "sendInit", "sendMessage", "message", "sendMessageWithWebsocket", "isLoggingOut", "", "openWebSocket", "sendRegisterDevice", "sendRegisterDeviceWithoutStateChanging", "getCloudToken", "getDeviceUid", "sendInitChatMessage", "isPreregister", "sendEnvironmentMessage", "closeWebSocketIfNeeded", "processMessageSendError", "getDeviceName", "getSimpleDeviceName", "buildTransport", "Lim/threads/business/models/Survey;", "survey", "sendRatingDone", "approveResolve", "sendResolveThread", "input", "sendUserTying", "forceRegistration", "sendInitMessages", "updatePushToken$threads_release", "()V", "updatePushToken", "Lim/threads/business/models/UserPhrase;", "userPhrase", "Lim/threads/business/models/ConsultInfo;", "consultInfo", "filePath", "quoteFilePath", MessageAttributes.CLIENT_ID, "sendClientOffline", "Lkotlin/Function0;", "callBack", "", "latitude", "longitude", "updateLocation", "getToken", "Landroidx/lifecycle/d;", "lifecycle", "setLifecycle", "Lop5;", "owner", "onStart", "onStop", "closeWebSocket", "threadsGateUrl", "Ljava/lang/String;", "getThreadsGateUrl$threads_release", "()Ljava/lang/String;", "threadsGateProviderUid", "getThreadsGateProviderUid$threads_release", "isDebugLoggingEnabled", "Z", "Lim/threads/business/rest/config/SocketClientSettings;", "socketSettings", "Lim/threads/business/rest/config/SocketClientSettings;", "Lim/threads/business/models/SslSocketFactoryConfig;", "sslSocketFactoryConfig", "Lim/threads/business/models/SslSocketFactoryConfig;", "Lk65;", "networkInterceptor", "Lk65;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "Lb77;", "client", "Lb77;", "getClient", "()Lb77;", "setClient", "(Lb77;)V", "getClient$annotations", "Lim/threads/business/transport/threadsGate/ThreadsGateTransport$WebSocketListener;", "listener", "Lim/threads/business/transport/threadsGate/ThreadsGateTransport$WebSocketListener;", "getListener", "()Lim/threads/business/transport/threadsGate/ThreadsGateTransport$WebSocketListener;", "setListener", "(Lim/threads/business/transport/threadsGate/ThreadsGateTransport$WebSocketListener;)V", "getListener$annotations", "Lo3c;", "webSocket", "Lo3c;", "getWebSocket", "()Lo3c;", "setWebSocket", "(Lo3c;)V", "getWebSocket$annotations", "Lhi9;", "request", "Lhi9;", "Lim/threads/business/models/LatLng;", "location", "Lim/threads/business/models/LatLng;", "Lqx1;", "coroutineScope", "Lqx1;", "", "messageInProcessIds", "Ljava/util/List;", "", "", "surveysInProcess", "Ljava/util/Map;", "Lim/threads/business/models/CampaignMessage;", "campaignsInProcess", "Landroidx/lifecycle/d;", "Lim/threads/business/transport/OutgoingMessageCreator;", "outgoingMessageCreator$delegate", "Lrn5;", "getOutgoingMessageCreator", "()Lim/threads/business/transport/OutgoingMessageCreator;", "outgoingMessageCreator", "Lim/threads/business/preferences/Preferences;", "preferences$delegate", "getPreferences", "()Lim/threads/business/preferences/Preferences;", "preferences", "Lim/threads/business/transport/AuthInterceptor;", "authInterceptor$delegate", "getAuthInterceptor", "()Lim/threads/business/transport/AuthInterceptor;", "authInterceptor", "Lim/threads/business/chatUpdates/ChatUpdateProcessor;", "chatUpdateProcessor$delegate", "getChatUpdateProcessor", "()Lim/threads/business/chatUpdates/ChatUpdateProcessor;", "chatUpdateProcessor", "Lim/threads/business/secureDatabase/DatabaseHolder;", "database$delegate", "getDatabase", "()Lim/threads/business/secureDatabase/DatabaseHolder;", "database", "Lim/threads/business/formatters/JsonFormatter;", "jsonFormatter$delegate", "getJsonFormatter", "()Lim/threads/business/formatters/JsonFormatter;", "jsonFormatter", "Lim/threads/business/utils/ClientUseCase;", "clientUseCase$delegate", "getClientUseCase", "()Lim/threads/business/utils/ClientUseCase;", "clientUseCase", "Lim/threads/business/transport/threadsGate/ThreadsGateMessageParser;", "messageParser$delegate", "getMessageParser", "()Lim/threads/business/transport/threadsGate/ThreadsGateMessageParser;", "messageParser", "Lim/threads/business/utils/AppInfo;", "appInfo$delegate", "getAppInfo", "()Lim/threads/business/utils/AppInfo;", "appInfo", "Lim/threads/business/utils/DeviceInfo;", "deviceInfo$delegate", "getDeviceInfo", "()Lim/threads/business/utils/DeviceInfo;", "deviceInfo", "Lim/threads/business/state/ChatState;", "chatState$delegate", "getChatState", "()Lim/threads/business/state/ChatState;", "chatState", "Lfr6;", "logoutCorrelationId", "Lfr6;", "logoutScope", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLim/threads/business/rest/config/SocketClientSettings;Lim/threads/business/models/SslSocketFactoryConfig;Lk65;Landroid/content/Context;)V", "Companion", "WebSocketListener", "threads_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class ThreadsGateTransport extends Transport implements pq2 {
    private static final String CORRELATION_ID_DIVIDER = ":";
    private static final String KEY_CODE = "code";
    private static final String KEY_ERROR = "error";
    private static final String KEY_ERROR_DETAILS = "errorDetails";
    private static final String KEY_MESSAGE = "message";
    private static final String KEY_PROTOCOL = "protocol";
    private static final String KEY_REASON = "reason";
    private static final String KEY_TEXT = "text";
    private static final String KEY_URL = "url";
    public static final int NORMAL_CLOSURE_STATUS = 1000;
    private static boolean isForceRegistration;
    private final rn5 appInfo$delegate;
    private final rn5 authInterceptor$delegate;
    private final Map<String, CampaignMessage> campaignsInProcess;
    private final rn5 chatState$delegate;
    private final rn5 chatUpdateProcessor$delegate;
    public b77 client;
    private final rn5 clientUseCase$delegate;
    private final Context context;
    private final qx1 coroutineScope;
    private final rn5 database$delegate;
    private final rn5 deviceInfo$delegate;
    private final boolean isDebugLoggingEnabled;
    private final rn5 jsonFormatter$delegate;
    private d lifecycle;
    public WebSocketListener listener;
    private LatLng location;
    private fr6<String> logoutCorrelationId;
    private qx1 logoutScope;
    private final List<String> messageInProcessIds;
    private final rn5 messageParser$delegate;
    private final k65 networkInterceptor;
    private final rn5 outgoingMessageCreator$delegate;
    private final rn5 preferences$delegate;
    private hi9 request;
    private final SocketClientSettings socketSettings;
    private final SslSocketFactoryConfig sslSocketFactoryConfig;
    private final Map<Long, Survey> surveysInProcess;
    private final String threadsGateProviderUid;
    private final String threadsGateUrl;
    private o3c webSocket;
    public static final Companion Companion = new Companion(null);
    private static final cr6<ThreadsGateTransport> transportUpdatedChannel = uha.b(2, 0, null, 6, null);

    /* compiled from: ThreadsGateTransport.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @nn2(c = "im.threads.business.transport.threadsGate.ThreadsGateTransport$1", f = "ThreadsGateTransport.kt", l = {121}, m = "invokeSuspend")
    /* renamed from: im.threads.business.transport.threadsGate.ThreadsGateTransport$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    static final class AnonymousClass1 extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
        int label;

        AnonymousClass1(cv1<? super AnonymousClass1> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new AnonymousClass1(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
            return ((AnonymousClass1) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            Object d;
            d = c75.d();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    vk9.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                vk9.b(obj);
                cr6<ThreadsGateTransport> transportUpdatedChannel = ThreadsGateTransport.Companion.getTransportUpdatedChannel();
                ThreadsGateTransport threadsGateTransport = ThreadsGateTransport.this;
                this.label = 1;
                if (transportUpdatedChannel.emit(threadsGateTransport, this) == d) {
                    return d;
                }
            }
            return Unit.a;
        }
    }

    /* compiled from: ThreadsGateTransport.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001d\u0010\u001eR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\"\u0010\t\u001a\u00020\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0011R\u0014\u0010\u0017\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0011R\u0014\u0010\u0018\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0011R\u0014\u0010\u0019\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0011R\u0014\u0010\u001b\u001a\u00020\u001a8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lim/threads/business/transport/threadsGate/ThreadsGateTransport$Companion;", "", "Lcr6;", "Lim/threads/business/transport/threadsGate/ThreadsGateTransport;", "transportUpdatedChannel", "Lcr6;", "getTransportUpdatedChannel", "()Lcr6;", "", "isForceRegistration", "Z", "isForceRegistration$threads_release", "()Z", "setForceRegistration$threads_release", "(Z)V", "", "CORRELATION_ID_DIVIDER", "Ljava/lang/String;", "KEY_CODE", "KEY_ERROR", "KEY_ERROR_DETAILS", "KEY_MESSAGE", "KEY_PROTOCOL", "KEY_REASON", "KEY_TEXT", "KEY_URL", "", "NORMAL_CLOSURE_STATUS", "I", "<init>", "()V", "threads_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final cr6<ThreadsGateTransport> getTransportUpdatedChannel() {
            return ThreadsGateTransport.transportUpdatedChannel;
        }

        public final boolean isForceRegistration$threads_release() {
            return ThreadsGateTransport.isForceRegistration;
        }

        public final void setForceRegistration$threads_release(boolean z) {
            ThreadsGateTransport.isForceRegistration = z;
        }
    }

    public /* synthetic */ ThreadsGateTransport(String str, String str2, boolean z, SocketClientSettings socketClientSettings, SslSocketFactoryConfig sslSocketFactoryConfig, k65 k65Var, Context context, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, z, socketClientSettings, (i & 16) != 0 ? null : sslSocketFactoryConfig, k65Var, context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean buildTransport$lambda$3(String str, SSLSession sSLSession) {
        z65.h(str, "<anonymous parameter 0>");
        z65.h(sSLSession, "<anonymous parameter 1>");
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void closeWebSocketIfNeeded() {
        d.b b;
        d dVar = this.lifecycle;
        if ((dVar == null || (b = dVar.b()) == null || !b.i(d.b.STARTED)) && this.messageInProcessIds.isEmpty() && !BaseConfig.Companion.getInstance().getKeepSocketActive()) {
            closeWebSocket();
        }
    }

    private final AppInfo getAppInfo() {
        return (AppInfo) this.appInfo$delegate.getValue();
    }

    private final AuthInterceptor getAuthInterceptor() {
        return (AuthInterceptor) this.authInterceptor$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ChatState getChatState() {
        return (ChatState) this.chatState$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ChatUpdateProcessor getChatUpdateProcessor() {
        return (ChatUpdateProcessor) this.chatUpdateProcessor$delegate.getValue();
    }

    private final ClientUseCase getClientUseCase() {
        return (ClientUseCase) this.clientUseCase$delegate.getValue();
    }

    private final String getCloudToken() {
        Object obj;
        boolean O;
        Object obj2;
        boolean J;
        boolean u;
        String T0;
        Object U0;
        boolean O2;
        Object obj3;
        boolean c;
        boolean J2;
        boolean u2;
        String T02;
        Object U02;
        String str;
        String str2 = "";
        Preferences preferences = getPreferences();
        String fcm_token = PreferencesCoreKeys.INSTANCE.getFCM_TOKEN();
        Type type = new TypeToken<String>() { // from class: im.threads.business.transport.threadsGate.ThreadsGateTransport$getCloudToken$$inlined$get$default$1
        }.getType();
        z65.g(type, "object : TypeToken<T>() {}.type");
        Object obj4 = null;
        try {
            Preferences.Companion companion = Preferences.Companion;
            String preferenceFromRam = companion.getPreferenceFromRam(fcm_token);
            int length = preferenceFromRam.length();
            String str3 = preferenceFromRam;
            if (length == 0) {
                str3 = preferenceFromRam;
                if (!companion.isRamPreferencesLoaded()) {
                    String string = preferences.getSharedPreferences().getString(fcm_token, null);
                    if (string == null) {
                        str = "";
                    } else {
                        z65.g(string, "sharedPreferences.getString(key, null) ?: \"\"");
                        str = string;
                    }
                    int length2 = str.length();
                    str3 = str;
                    if (length2 > 0) {
                        companion.savePreferenceToRam(fcm_token, str);
                        str3 = str;
                    }
                }
            }
            O2 = m0b.O(type.toString(), "String", false, 2, null);
            if (O2) {
                J2 = l0b.J(str3, "\"", false, 2, null);
                if (J2) {
                    u2 = l0b.u(str3, "\"", false, 2, null);
                    if (u2) {
                        T02 = o0b.T0(str3, 1);
                        U02 = o0b.U0(T02, 1);
                        if (U02 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                        }
                        obj3 = U02;
                    }
                }
                if (str3 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                obj3 = str3;
            } else {
                Object l = new Gson().l(str3, type);
                obj3 = l;
                if (l == null) {
                    throw new NullPointerException();
                }
            }
            c = z65.c(obj3, "null");
            obj = obj3;
        } catch (Exception unused) {
        }
        if (c) {
            obj = null;
        }
        String str4 = (String) obj;
        Preferences preferences2 = getPreferences();
        String hcm_token = PreferencesCoreKeys.INSTANCE.getHCM_TOKEN();
        Type type2 = new TypeToken<String>() { // from class: im.threads.business.transport.threadsGate.ThreadsGateTransport$getCloudToken$$inlined$get$default$2
        }.getType();
        z65.g(type2, "object : TypeToken<T>() {}.type");
        try {
            Preferences.Companion companion2 = Preferences.Companion;
            String preferenceFromRam2 = companion2.getPreferenceFromRam(hcm_token);
            int length3 = preferenceFromRam2.length();
            String str5 = preferenceFromRam2;
            if (length3 == 0) {
                str5 = preferenceFromRam2;
                if (!companion2.isRamPreferencesLoaded()) {
                    String string2 = preferences2.getSharedPreferences().getString(hcm_token, null);
                    if (string2 != null) {
                        z65.g(string2, "sharedPreferences.getString(key, null) ?: \"\"");
                        str2 = string2;
                    }
                    if (str2.length() > 0) {
                        companion2.savePreferenceToRam(hcm_token, str2);
                    }
                    str5 = str2;
                }
            }
            O = m0b.O(type2.toString(), "String", false, 2, null);
            if (O) {
                J = l0b.J(str5, "\"", false, 2, null);
                if (J) {
                    u = l0b.u(str5, "\"", false, 2, null);
                    if (u) {
                        T0 = o0b.T0(str5, 1);
                        U0 = o0b.U0(T0, 1);
                        if (U0 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                        }
                        obj2 = U0;
                    }
                }
                if (str5 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                obj2 = str5;
            } else {
                Object l2 = new Gson().l(str5, type2);
                obj2 = l2;
                if (l2 == null) {
                    throw new NullPointerException();
                }
            }
            if (!z65.c(obj2, "null")) {
                obj4 = obj2;
            }
        } catch (Exception unused2) {
        }
        String str6 = (String) obj4;
        if (str4 == null) {
            return str6;
        }
        return str4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DatabaseHolder getDatabase() {
        return (DatabaseHolder) this.database$delegate.getValue();
    }

    private final DeviceInfo getDeviceInfo() {
        return (DeviceInfo) this.deviceInfo$delegate.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0020, code lost:
        if (r2 != false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.String getDeviceName() {
        /*
            r3 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 25
            if (r0 < r1) goto L19
            im.threads.business.config.BaseConfig$Companion r1 = im.threads.business.config.BaseConfig.Companion
            im.threads.business.config.BaseConfig r1 = r1.getInstance()
            android.content.Context r1 = r1.context
            android.content.ContentResolver r1 = r1.getContentResolver()
            java.lang.String r2 = "device_name"
            java.lang.String r1 = android.provider.Settings.Secure.getString(r1, r2)
            goto L1a
        L19:
            r1 = 0
        L1a:
            if (r1 == 0) goto L22
            boolean r2 = defpackage.c0b.y(r1)
            if (r2 == 0) goto L46
        L22:
            r2 = 31
            if (r0 > r2) goto L46
            im.threads.business.config.BaseConfig$Companion r0 = im.threads.business.config.BaseConfig.Companion     // Catch: java.lang.Exception -> L3a
            im.threads.business.config.BaseConfig r0 = r0.getInstance()     // Catch: java.lang.Exception -> L3a
            android.content.Context r0 = r0.context     // Catch: java.lang.Exception -> L3a
            android.content.ContentResolver r0 = r0.getContentResolver()     // Catch: java.lang.Exception -> L3a
            java.lang.String r1 = "bluetooth_name"
            java.lang.String r0 = android.provider.Settings.Secure.getString(r0, r1)     // Catch: java.lang.Exception -> L3a
        L38:
            r1 = r0
            goto L3f
        L3a:
            java.lang.String r0 = r3.getSimpleDeviceName()
            goto L38
        L3f:
            if (r1 != 0) goto L52
            java.lang.String r1 = r3.getSimpleDeviceName()
            goto L52
        L46:
            if (r1 == 0) goto L4e
            boolean r0 = defpackage.c0b.y(r1)
            if (r0 == 0) goto L52
        L4e:
            java.lang.String r1 = r3.getSimpleDeviceName()
        L52:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: im.threads.business.transport.threadsGate.ThreadsGateTransport.getDeviceName():java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ac, code lost:
        if (r0 != false) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final synchronized java.lang.String getDeviceUid() {
        /*
            r12 = this;
            monitor-enter(r12)
            im.threads.business.preferences.Preferences r0 = r12.getPreferences()     // Catch: java.lang.Throwable -> L3a
            im.threads.business.preferences.PreferencesCoreKeys r1 = im.threads.business.preferences.PreferencesCoreKeys.INSTANCE     // Catch: java.lang.Throwable -> L3a
            java.lang.String r1 = r1.getDEVICE_UID()     // Catch: java.lang.Throwable -> L3a
            im.threads.business.transport.threadsGate.ThreadsGateTransport$getDeviceUid$$inlined$get$default$1 r2 = new im.threads.business.transport.threadsGate.ThreadsGateTransport$getDeviceUid$$inlined$get$default$1     // Catch: java.lang.Throwable -> L3a
            r2.<init>()     // Catch: java.lang.Throwable -> L3a
            java.lang.reflect.Type r2 = r2.getType()     // Catch: java.lang.Throwable -> L3a
            java.lang.String r3 = "object : TypeToken<T>() {}.type"
            defpackage.z65.g(r2, r3)     // Catch: java.lang.Throwable -> L3a
            r3 = 0
            im.threads.business.preferences.Preferences$Companion r4 = im.threads.business.preferences.Preferences.Companion     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> La3
            java.lang.String r5 = r4.getPreferenceFromRam(r1)     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> La3
            int r6 = r5.length()     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> La3
            if (r6 != 0) goto L4c
            boolean r6 = r4.isRamPreferencesLoaded()     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> La3
            if (r6 != 0) goto L4c
            android.content.SharedPreferences r0 = r0.getSharedPreferences()     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> La3
            java.lang.String r0 = r0.getString(r1, r3)     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> La3
            if (r0 != 0) goto L3d
            java.lang.String r0 = ""
        L38:
            r5 = r0
            goto L43
        L3a:
            r0 = move-exception
            goto Ldc
        L3d:
            java.lang.String r5 = "sharedPreferences.getString(key, null) ?: \"\""
            defpackage.z65.g(r0, r5)     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> La3
            goto L38
        L43:
            int r0 = r5.length()     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> La3
            if (r0 <= 0) goto L4c
            r4.savePreferenceToRam(r1, r5)     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> La3
        L4c:
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> La3
            java.lang.String r1 = "String"
            r4 = 2
            r6 = 0
            boolean r0 = defpackage.c0b.O(r0, r1, r6, r4, r3)     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> La3
            if (r0 == 0) goto L89
            java.lang.String r0 = "\""
            boolean r0 = defpackage.c0b.J(r5, r0, r6, r4, r3)     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> La3
            if (r0 == 0) goto L7e
            java.lang.String r0 = "\""
            boolean r0 = defpackage.c0b.u(r5, r0, r6, r4, r3)     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> La3
            if (r0 == 0) goto L7e
            r0 = 1
            java.lang.String r1 = defpackage.c0b.T0(r5, r0)     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> La3
            java.lang.String r5 = defpackage.c0b.U0(r1, r0)     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> La3
            if (r5 == 0) goto L76
            goto L94
        L76:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> La3
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.String"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> La3
            throw r0     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> La3
        L7e:
            if (r5 == 0) goto L81
            goto L94
        L81:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> La3
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.String"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> La3
            throw r0     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> La3
        L89:
            com.google.gson.Gson r0 = new com.google.gson.Gson     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> La3
            r0.<init>()     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> La3
            java.lang.Object r5 = r0.l(r5, r2)     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> La3
            if (r5 == 0) goto L9d
        L94:
            java.lang.String r0 = "null"
            boolean r0 = defpackage.z65.c(r5, r0)     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> La3
            if (r0 == 0) goto La4
            goto La3
        L9d:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> La3
            r0.<init>()     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> La3
            throw r0     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> La3
        La3:
            r5 = r3
        La4:
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L3a
            if (r5 == 0) goto Lae
            boolean r0 = defpackage.c0b.y(r5)     // Catch: java.lang.Throwable -> L3a
            if (r0 == 0) goto Lda
        Lae:
            java.util.UUID r0 = java.util.UUID.randomUUID()     // Catch: java.lang.Throwable -> L3a
            java.lang.String r5 = r0.toString()     // Catch: java.lang.Throwable -> L3a
            im.threads.business.preferences.Preferences r0 = r12.getPreferences()     // Catch: java.lang.Throwable -> L3a
            im.threads.business.preferences.PreferencesCoreKeys r1 = im.threads.business.preferences.PreferencesCoreKeys.INSTANCE     // Catch: java.lang.Throwable -> L3a
            java.lang.String r1 = r1.getDEVICE_UID()     // Catch: java.lang.Throwable -> L3a
            if (r5 != 0) goto Lc4
            r2 = r3
            goto Lc5
        Lc4:
            r2 = r5
        Lc5:
            im.threads.business.preferences.Preferences$Companion r4 = im.threads.business.preferences.Preferences.Companion     // Catch: java.lang.Throwable -> L3a
            r4.savePreferenceToRam(r1, r2)     // Catch: java.lang.Throwable -> L3a
            qx1 r6 = r0.getCoroutineScope()     // Catch: java.lang.Throwable -> L3a
            r7 = 0
            r8 = 0
            im.threads.business.preferences.Preferences$save$1 r9 = new im.threads.business.preferences.Preferences$save$1     // Catch: java.lang.Throwable -> L3a
            r9.<init>(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L3a
            r10 = 3
            r11 = 0
            defpackage.qh0.d(r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L3a
        Lda:
            monitor-exit(r12)
            return r5
        Ldc:
            monitor-exit(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: im.threads.business.transport.threadsGate.ThreadsGateTransport.getDeviceUid():java.lang.String");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final JsonFormatter getJsonFormatter() {
        return (JsonFormatter) this.jsonFormatter$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ThreadsGateMessageParser getMessageParser() {
        return (ThreadsGateMessageParser) this.messageParser$delegate.getValue();
    }

    private final OutgoingMessageCreator getOutgoingMessageCreator() {
        return (OutgoingMessageCreator) this.outgoingMessageCreator$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Preferences getPreferences() {
        return (Preferences) this.preferences$delegate.getValue();
    }

    private final String getSimpleDeviceName() {
        boolean J;
        String o;
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        z65.g(str2, "model");
        z65.g(str, "manufacturer");
        J = l0b.J(str2, str, false, 2, null);
        if (!J) {
            o = l0b.o(str);
            return o + " " + str2;
        }
        return str2;
    }

    private final synchronized void openWebSocket(boolean z) {
        try {
            if (this.webSocket == null) {
                b77 client = getClient();
                hi9 hi9Var = this.request;
                if (hi9Var == null) {
                    z65.z("request");
                    hi9Var = null;
                }
                this.webSocket = client.A(hi9Var, getListener());
                if (z) {
                    sendRegisterDeviceWithoutStateChanging();
                } else {
                    sendRegisterDevice();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    static /* synthetic */ void openWebSocket$default(ThreadsGateTransport threadsGateTransport, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        threadsGateTransport.openWebSocket(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processMessageSendError(String str) {
        List y0;
        y0 = m0b.y0(str, new String[]{CORRELATION_ID_DIVIDER}, false, 0, 6, null);
        String[] strArr = (String[]) y0.toArray(new String[0]);
        if (strArr.length > 1 && ChatItemType.Companion.fromString(strArr[0]) == ChatItemType.MESSAGE) {
            getChatUpdateProcessor().postChatItemSendError(new ChatItemSendErrorModel(null, strArr[1], null, 5, null));
        }
    }

    private final boolean sendEnvironmentMessage(boolean z, boolean z2) {
        String str;
        UserInfoBuilder userInfo = getClientUseCase().getUserInfo();
        if (userInfo != null) {
            str = userInfo.getClientId();
        } else {
            str = null;
        }
        if (str != null) {
            return sendMessage$default(this, getOutgoingMessageCreator().createClientInfoMessage(userInfo, getDeviceInfo().getLocale(BaseConfig.Companion.getInstance().context), z2), false, null, z, false, 6, null);
        }
        return false;
    }

    private final boolean sendInitChatMessage(boolean z) {
        getChatState().changeState(ChatStateEnum.SENDING_INIT_USER);
        UserInfoBuilder userInfo = getClientUseCase().getUserInfo();
        if (userInfo != null) {
            return sendMessage$default(this, getOutgoingMessageCreator().createInitChatMessage(userInfo), false, null, z, false, 6, null);
        }
        return false;
    }

    static /* synthetic */ boolean sendMessage$default(ThreadsGateTransport threadsGateTransport, mb5 mb5Var, boolean z, String str, boolean z2, boolean z3, int i, Object obj) {
        boolean z4;
        boolean z5;
        boolean z6;
        if ((i & 2) != 0) {
            z4 = false;
        } else {
            z4 = z;
        }
        if ((i & 4) != 0) {
            str = UUID.randomUUID().toString();
            z65.g(str, "randomUUID().toString()");
        }
        String str2 = str;
        if ((i & 8) != 0) {
            z5 = true;
        } else {
            z5 = z2;
        }
        if ((i & 16) != 0) {
            z6 = false;
        } else {
            z6 = z3;
        }
        return threadsGateTransport.sendMessage(mb5Var, z4, str2, z5, z6);
    }

    private final boolean sendMessageWithWebsocket(String str) {
        boolean z = false;
        if (str != null) {
            o3c o3cVar = this.webSocket;
            if (o3cVar != null) {
                z = o3cVar.a(str);
            }
            String jsonToPrettyFormat = getJsonFormatter().jsonToPrettyFormat(str);
            LoggerEdna.info("[WS] ☛ Sending message with WS. Is sent: " + z + ". Message: " + jsonToPrettyFormat);
        }
        return z;
    }

    private final void sendRegisterDeviceWithoutStateChanging() {
        String str;
        boolean y;
        String str2;
        boolean O;
        Object obj;
        boolean J;
        boolean u;
        String T0;
        Object U0;
        UserInfoBuilder userInfo = getClientUseCase().getUserInfo();
        Object obj2 = null;
        if (userInfo != null) {
            str = userInfo.getClientId();
        } else {
            str = null;
        }
        if (str != null) {
            y = l0b.y(str);
            if (!y) {
                String simpleDeviceName = getSimpleDeviceName();
                String deviceName = getDeviceName();
                Preferences preferences = getPreferences();
                String device_address = PreferencesCoreKeys.INSTANCE.getDEVICE_ADDRESS();
                Type type = new TypeToken<String>() { // from class: im.threads.business.transport.threadsGate.ThreadsGateTransport$sendRegisterDeviceWithoutStateChanging$$inlined$get$default$1
                }.getType();
                z65.g(type, "object : TypeToken<T>() {}.type");
                try {
                    Preferences.Companion companion = Preferences.Companion;
                    String preferenceFromRam = companion.getPreferenceFromRam(device_address);
                    int length = preferenceFromRam.length();
                    String str3 = preferenceFromRam;
                    if (length == 0) {
                        str3 = preferenceFromRam;
                        if (!companion.isRamPreferencesLoaded()) {
                            String string = preferences.getSharedPreferences().getString(device_address, null);
                            if (string == null) {
                                string = "";
                            } else {
                                z65.g(string, "sharedPreferences.getString(key, null) ?: \"\"");
                            }
                            String str4 = string;
                            int length2 = str4.length();
                            str3 = str4;
                            if (length2 > 0) {
                                companion.savePreferenceToRam(device_address, str4);
                                str3 = str4;
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
                String str5 = (String) obj2;
                String appId = getAppInfo().getAppId();
                String appVersion = getAppInfo().getAppVersion();
                String str6 = this.threadsGateProviderUid;
                String cloudToken = getCloudToken();
                String deviceUid = getDeviceUid();
                String osVersion = getDeviceInfo().getOsVersion();
                DeviceInfo deviceInfo = getDeviceInfo();
                BaseConfig.Companion companion2 = BaseConfig.Companion;
                String locale = deviceInfo.getLocale(companion2.getInstance().context);
                String displayName = Calendar.getInstance().getTimeZone().getDisplayName(false, 0);
                z65.g(displayName, "getInstance().timeZone.g…me(false, TimeZone.SHORT)");
                if (!TextUtils.isEmpty(deviceName)) {
                    str2 = deviceName;
                } else {
                    str2 = simpleDeviceName;
                }
                sendMessageWithWebsocket(companion2.getInstance().gson.t(new RegisterDeviceRequest(UUID.randomUUID().toString(), new RegisterDeviceRequest.Data(appId, appVersion, str6, cloudToken, deviceUid, "Android", osVersion, locale, displayName, str2, simpleDeviceName, str5, str))));
                return;
            }
        }
        String string2 = this.context.getString(R.string.ecc_no_user_id);
        z65.g(string2, "context.getString(R.string.ecc_no_user_id)");
        getChatUpdateProcessor().postError(new TransportException(string2));
    }

    @Override // im.threads.business.transport.Transport
    public void buildTransport() {
        b77.a a = new b77.a().a(getAuthInterceptor());
        k65 k65Var = this.networkInterceptor;
        if (k65Var != null) {
            a.a(k65Var);
        }
        long resendPingIntervalMillis = this.socketSettings.getResendPingIntervalMillis();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        b77.a a2 = a.O(resendPingIntervalMillis, timeUnit).e(this.socketSettings.getConnectTimeoutMillis(), timeUnit).S(this.socketSettings.getReadTimeoutMillis(), timeUnit).V(this.socketSettings.getWriteTimeoutMillis(), timeUnit).a(new k65() { // from class: im.threads.business.transport.threadsGate.ThreadsGateTransport$buildTransport$$inlined$-addInterceptor$1
            @Override // defpackage.k65
            public final ik9 intercept(k65.a aVar) {
                z65.h(aVar, "chain");
                ik9 b = aVar.b(aVar.request());
                if (b.j() > 299) {
                    String str = "Socket request failed with: " + b.r();
                    ThreadsGateTransport.this.getChatUpdateProcessor().postError(new TransportException(str));
                    LoggerEdna.error("Socket request failed. ", str);
                    b.u().q("Pragma").q("Cache-Control").l(str).e(b.j()).i("Cache-Control", "public, only-if-cached, max-stale=86400").c();
                }
                return b;
            }
        });
        if (this.isDebugLoggingEnabled) {
            a2.a(new mq4(null, 1, null).c(mq4.a.BODY));
        }
        if (this.sslSocketFactoryConfig != null) {
            if (this.isDebugLoggingEnabled) {
                a2.a(new SSLCertificateInterceptor());
            }
            a2.U(this.sslSocketFactoryConfig.getSslSocketFactory(), this.sslSocketFactoryConfig.getTrustManager());
            a2.N(new HostnameVerifier() { // from class: geb
                @Override // javax.net.ssl.HostnameVerifier
                public final boolean verify(String str, SSLSession sSLSession) {
                    boolean buildTransport$lambda$3;
                    buildTransport$lambda$3 = ThreadsGateTransport.buildTransport$lambda$3(str, sSLSession);
                    return buildTransport$lambda$3;
                }
            });
        }
        setClient(a2.c());
        this.request = new hi9.a().u(this.threadsGateUrl).b();
        setListener(new WebSocketListener());
    }

    @Override // im.threads.business.transport.Transport
    public synchronized void closeWebSocket() {
        try {
            this.messageInProcessIds.clear();
            o3c o3cVar = this.webSocket;
            if (o3cVar != null) {
                o3cVar.d(1000, null);
            }
            this.webSocket = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final b77 getClient() {
        b77 b77Var = this.client;
        if (b77Var != null) {
            return b77Var;
        }
        z65.z("client");
        return null;
    }

    public final WebSocketListener getListener() {
        WebSocketListener webSocketListener = this.listener;
        if (webSocketListener != null) {
            return webSocketListener;
        }
        z65.z("listener");
        return null;
    }

    public final String getThreadsGateProviderUid$threads_release() {
        return this.threadsGateProviderUid;
    }

    public final String getThreadsGateUrl$threads_release() {
        return this.threadsGateUrl;
    }

    @Override // im.threads.business.transport.Transport
    public String getToken() {
        Object obj;
        String str;
        boolean O;
        Object obj2;
        boolean c;
        boolean J;
        boolean u;
        String T0;
        Object U0;
        UserInfoBuilder userInfo = getClientUseCase().getUserInfo();
        Preferences preferences = getPreferences();
        String device_address = PreferencesCoreKeys.INSTANCE.getDEVICE_ADDRESS();
        Type type = new TypeToken<String>() { // from class: im.threads.business.transport.threadsGate.ThreadsGateTransport$getToken$$inlined$get$default$1
        }.getType();
        z65.g(type, "object : TypeToken<T>() {}.type");
        String str2 = null;
        try {
            Preferences.Companion companion = Preferences.Companion;
            String preferenceFromRam = companion.getPreferenceFromRam(device_address);
            int length = preferenceFromRam.length();
            String str3 = preferenceFromRam;
            if (length == 0) {
                str3 = preferenceFromRam;
                if (!companion.isRamPreferencesLoaded()) {
                    String string = preferences.getSharedPreferences().getString(device_address, null);
                    if (string == null) {
                        string = "";
                    } else {
                        z65.g(string, "sharedPreferences.getString(key, null) ?: \"\"");
                    }
                    String str4 = string;
                    int length2 = str4.length();
                    str3 = str4;
                    if (length2 > 0) {
                        companion.savePreferenceToRam(device_address, str4);
                        str3 = str4;
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
                        obj2 = U0;
                    }
                }
                if (str3 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                obj2 = str3;
            } else {
                Object l = new Gson().l(str3, type);
                obj2 = l;
                if (l == null) {
                    throw new NullPointerException();
                }
            }
            c = z65.c(obj2, "null");
            obj = obj2;
        } catch (Exception unused) {
        }
        if (c) {
            obj = null;
        }
        String str5 = (String) obj;
        if (userInfo != null) {
            str = userInfo.getClientIdSignature();
        } else {
            str = null;
        }
        if (str != null && str.length() != 0) {
            str5 = userInfo != null ? userInfo.getClientIdSignature() : null;
        }
        if (userInfo != null) {
            str2 = userInfo.getClientId();
        }
        return str5 + CORRELATION_ID_DIVIDER + str2;
    }

    public final o3c getWebSocket() {
        return this.webSocket;
    }

    @Override // defpackage.pq2
    public /* bridge */ /* synthetic */ void onCreate(op5 op5Var) {
        oq2.a(this, op5Var);
    }

    @Override // defpackage.pq2
    public /* bridge */ /* synthetic */ void onDestroy(op5 op5Var) {
        oq2.b(this, op5Var);
    }

    @Override // defpackage.pq2
    public /* bridge */ /* synthetic */ void onPause(op5 op5Var) {
        oq2.c(this, op5Var);
    }

    @Override // defpackage.pq2
    public /* bridge */ /* synthetic */ void onResume(op5 op5Var) {
        oq2.d(this, op5Var);
    }

    @Override // defpackage.pq2
    public void onStart(op5 op5Var) {
        z65.h(op5Var, "owner");
        oq2.e(this, op5Var);
        openWebSocket$default(this, false, 1, null);
    }

    @Override // defpackage.pq2
    public void onStop(op5 op5Var) {
        z65.h(op5Var, "owner");
        oq2.f(this, op5Var);
        if (!BaseConfig.Companion.getInstance().getKeepSocketActive()) {
            closeWebSocket();
        }
    }

    @Override // im.threads.business.transport.Transport
    public void sendClientOffline(String str) {
        boolean y;
        boolean y2;
        boolean O;
        Object obj;
        boolean J;
        boolean u;
        String T0;
        Object U0;
        z65.h(str, MessageAttributes.CLIENT_ID);
        Preferences preferences = getPreferences();
        String device_address = PreferencesCoreKeys.INSTANCE.getDEVICE_ADDRESS();
        Type type = new TypeToken<String>() { // from class: im.threads.business.transport.threadsGate.ThreadsGateTransport$sendClientOffline$$inlined$get$default$1
        }.getType();
        z65.g(type, "object : TypeToken<T>() {}.type");
        Object obj2 = null;
        try {
            Preferences.Companion companion = Preferences.Companion;
            String preferenceFromRam = companion.getPreferenceFromRam(device_address);
            int length = preferenceFromRam.length();
            String str2 = preferenceFromRam;
            if (length == 0) {
                str2 = preferenceFromRam;
                if (!companion.isRamPreferencesLoaded()) {
                    String string = preferences.getSharedPreferences().getString(device_address, null);
                    if (string == null) {
                        string = "";
                    } else {
                        z65.g(string, "sharedPreferences.getString(key, null) ?: \"\"");
                    }
                    String str3 = string;
                    int length2 = str3.length();
                    str2 = str3;
                    if (length2 > 0) {
                        companion.savePreferenceToRam(device_address, str3);
                        str2 = str3;
                    }
                }
            }
            O = m0b.O(type.toString(), "String", false, 2, null);
            if (O) {
                J = l0b.J(str2, "\"", false, 2, null);
                if (J) {
                    u = l0b.u(str2, "\"", false, 2, null);
                    if (u) {
                        T0 = o0b.T0(str2, 1);
                        U0 = o0b.U0(T0, 1);
                        if (U0 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                        }
                        obj = U0;
                    }
                }
                if (str2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                obj = str2;
            } else {
                Object l = new Gson().l(str2, type);
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
        if (charSequence != null) {
            y = l0b.y(charSequence);
            if (y) {
                return;
            }
            UserInfoBuilder userInfo = getClientUseCase().getUserInfo();
            y2 = l0b.y(str);
            if (!(!y2) || userInfo == null) {
                return;
            }
            sendMessage$default(this, getOutgoingMessageCreator().createMessageClientOffline(str, userInfo.getAppMarker()), false, null, false, false, 14, null);
        }
    }

    @Override // im.threads.business.transport.Transport
    public void sendInitMessages(boolean z) {
        sendInitChatMessage(true);
        sendEnvironmentMessage(true, z);
    }

    @Override // im.threads.business.transport.Transport
    public boolean sendMessage(UserPhrase userPhrase, ConsultInfo consultInfo, String str, String str2) {
        z65.h(userPhrase, "userPhrase");
        UserInfoBuilder userInfo = getClientUseCase().getUserInfo();
        if (userInfo != null) {
            CampaignMessage campaignMessage = userPhrase.getCampaignMessage();
            if (campaignMessage != null) {
                this.campaignsInProcess.put(userPhrase.getId(), campaignMessage);
            }
            mb5 createUserPhraseMessage = getOutgoingMessageCreator().createUserPhraseMessage(userPhrase, consultInfo, str2, str, userInfo);
            String id = userPhrase.getId();
            return sendMessage$default(this, createUserPhraseMessage, true, "MESSAGE:" + id, false, false, 24, null);
        }
        return false;
    }

    @Override // im.threads.business.transport.Transport
    public void sendRatingDone(Survey survey) {
        String str;
        Object Z;
        z65.h(survey, "survey");
        UserInfoBuilder userInfo = getClientUseCase().getUserInfo();
        ArrayList<QuestionDTO> questions = survey.getQuestions();
        if (questions != null && !questions.isEmpty() && userInfo != null) {
            mb5 createRatingDoneMessage = getOutgoingMessageCreator().createRatingDoneMessage(userInfo, survey);
            long sendingId = survey.getSendingId();
            ArrayList<QuestionDTO> questions2 = survey.getQuestions();
            if (questions2 != null) {
                Z = sc1.Z(questions2);
                QuestionDTO questionDTO = (QuestionDTO) Z;
                if (questionDTO != null) {
                    str = questionDTO.getCorrelationId();
                    this.surveysInProcess.put(Long.valueOf(survey.getSendingId()), survey);
                    sendMessage$default(this, createRatingDoneMessage, true, "SURVEY_QUESTION_ANSWER:" + (sendingId + CORRELATION_ID_DIVIDER + str), false, false, 24, null);
                }
            }
            str = null;
            this.surveysInProcess.put(Long.valueOf(survey.getSendingId()), survey);
            sendMessage$default(this, createRatingDoneMessage, true, "SURVEY_QUESTION_ANSWER:" + (sendingId + CORRELATION_ID_DIVIDER + str), false, false, 24, null);
        }
    }

    @Override // im.threads.business.transport.Transport
    public void sendRegisterDevice(boolean z) {
        Object obj;
        boolean y;
        boolean O;
        Object obj2;
        boolean c;
        boolean J;
        boolean u;
        String T0;
        Object U0;
        Preferences preferences = getPreferences();
        String device_address = PreferencesCoreKeys.INSTANCE.getDEVICE_ADDRESS();
        Type type = new TypeToken<String>() { // from class: im.threads.business.transport.threadsGate.ThreadsGateTransport$sendRegisterDevice$$inlined$get$default$1
        }.getType();
        z65.g(type, "object : TypeToken<T>() {}.type");
        try {
            Preferences.Companion companion = Preferences.Companion;
            String preferenceFromRam = companion.getPreferenceFromRam(device_address);
            int length = preferenceFromRam.length();
            String str = preferenceFromRam;
            if (length == 0) {
                str = preferenceFromRam;
                if (!companion.isRamPreferencesLoaded()) {
                    String string = preferences.getSharedPreferences().getString(device_address, null);
                    if (string == null) {
                        string = "";
                    } else {
                        z65.g(string, "sharedPreferences.getString(key, null) ?: \"\"");
                    }
                    String str2 = string;
                    int length2 = str2.length();
                    str = str2;
                    if (length2 > 0) {
                        companion.savePreferenceToRam(device_address, str2);
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
                        obj2 = U0;
                    }
                }
                if (str == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                obj2 = str;
            } else {
                Object l = new Gson().l(str, type);
                obj2 = l;
                if (l == null) {
                    throw new NullPointerException();
                }
            }
            c = z65.c(obj2, "null");
            obj = obj2;
        } catch (Exception unused) {
        }
        if (c) {
            obj = null;
        }
        String str3 = (String) obj;
        isForceRegistration = z;
        if (str3 != null) {
            y = l0b.y(str3);
            if (!y && !z) {
                return;
            }
        }
        openWebSocket$default(this, false, 1, null);
    }

    @Override // im.threads.business.transport.Transport
    public void sendResolveThread(boolean z) {
        mb5 createReopenThreadMessage;
        String str;
        UserInfoBuilder userInfo = getClientUseCase().getUserInfo();
        if (userInfo != null) {
            if (z) {
                createReopenThreadMessage = getOutgoingMessageCreator().createResolveThreadMessage(userInfo);
                str = "CLOSE_THREAD";
            } else {
                createReopenThreadMessage = getOutgoingMessageCreator().createReopenThreadMessage(userInfo);
                str = "REOPEN_THREAD";
            }
            mb5 mb5Var = createReopenThreadMessage;
            UUID randomUUID = UUID.randomUUID();
            sendMessage$default(this, mb5Var, false, ((Object) str) + CORRELATION_ID_DIVIDER + randomUUID, false, false, 24, null);
        }
    }

    @Override // im.threads.business.transport.Transport
    public void sendUserTying(String str) {
        z65.h(str, "input");
        UserInfoBuilder userInfo = getClientUseCase().getUserInfo();
        if (userInfo != null) {
            sendMessage$default(this, getOutgoingMessageCreator().createMessageTyping(userInfo, str), false, null, false, false, 30, null);
        }
    }

    public final void setClient(b77 b77Var) {
        z65.h(b77Var, "<set-?>");
        this.client = b77Var;
    }

    @Override // im.threads.business.transport.Transport
    public synchronized void setLifecycle(d dVar) {
        if (dVar != null) {
            try {
                dVar.d(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        this.lifecycle = dVar;
        if (dVar != null) {
            dVar.a(this);
        }
    }

    public final void setListener(WebSocketListener webSocketListener) {
        z65.h(webSocketListener, "<set-?>");
        this.listener = webSocketListener;
    }

    public final void setWebSocket(o3c o3cVar) {
        this.webSocket = o3cVar;
    }

    @Override // im.threads.business.transport.Transport
    public void updateLocation(double d, double d2) {
        boolean O;
        Object obj;
        boolean J;
        boolean u;
        String T0;
        Object U0;
        Preferences preferences = getPreferences();
        String device_address = PreferencesCoreKeys.INSTANCE.getDEVICE_ADDRESS();
        Type type = new TypeToken<String>() { // from class: im.threads.business.transport.threadsGate.ThreadsGateTransport$updateLocation$$inlined$get$default$1
        }.getType();
        z65.g(type, "object : TypeToken<T>() {}.type");
        Object obj2 = null;
        try {
            Preferences.Companion companion = Preferences.Companion;
            String preferenceFromRam = companion.getPreferenceFromRam(device_address);
            int length = preferenceFromRam.length();
            String str = preferenceFromRam;
            if (length == 0) {
                str = preferenceFromRam;
                if (!companion.isRamPreferencesLoaded()) {
                    String string = preferences.getSharedPreferences().getString(device_address, null);
                    if (string == null) {
                        string = "";
                    } else {
                        z65.g(string, "sharedPreferences.getString(key, null) ?: \"\"");
                    }
                    String str2 = string;
                    int length2 = str2.length();
                    str = str2;
                    if (length2 > 0) {
                        companion.savePreferenceToRam(device_address, str2);
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
        String str3 = (String) obj2;
        UserInfoBuilder userInfo = getClientUseCase().getUserInfo();
        if (str3 != null && str3.length() != 0) {
            if (userInfo != null) {
                sendMessage$default(this, getOutgoingMessageCreator().createMessageUpdateLocation(d, d2, getDeviceInfo().getLocale(BaseConfig.Companion.getInstance().context), userInfo), false, null, false, false, 14, null);
            }
            return;
        }
        this.location = new LatLng(d, d2);
    }

    @Override // im.threads.business.transport.Transport
    public void updatePushToken$threads_release() {
        sendRegisterDevice();
    }

    public ThreadsGateTransport(String str, String str2, boolean z, SocketClientSettings socketClientSettings, SslSocketFactoryConfig sslSocketFactoryConfig, k65 k65Var, Context context) {
        rn5 b;
        rn5 b2;
        rn5 b3;
        rn5 b4;
        rn5 b5;
        rn5 b6;
        rn5 b7;
        rn5 b8;
        rn5 b9;
        rn5 b10;
        rn5 b11;
        z65.h(str, "threadsGateUrl");
        z65.h(str2, "threadsGateProviderUid");
        z65.h(socketClientSettings, "socketSettings");
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.threadsGateUrl = str;
        this.threadsGateProviderUid = str2;
        this.isDebugLoggingEnabled = z;
        this.socketSettings = socketClientSettings;
        this.sslSocketFactoryConfig = sslSocketFactoryConfig;
        this.networkInterceptor = k65Var;
        this.context = context;
        qx1 a = rx1.a(v33.c());
        this.coroutineScope = a;
        this.messageInProcessIds = new ArrayList();
        this.surveysInProcess = new HashMap();
        this.campaignsInProcess = new HashMap();
        b = yn5.b(ThreadsGateTransport$special$$inlined$inject$1.INSTANCE);
        this.outgoingMessageCreator$delegate = b;
        b2 = yn5.b(ThreadsGateTransport$special$$inlined$inject$2.INSTANCE);
        this.preferences$delegate = b2;
        b3 = yn5.b(ThreadsGateTransport$special$$inlined$inject$3.INSTANCE);
        this.authInterceptor$delegate = b3;
        b4 = yn5.b(ThreadsGateTransport$special$$inlined$inject$4.INSTANCE);
        this.chatUpdateProcessor$delegate = b4;
        b5 = yn5.b(ThreadsGateTransport$special$$inlined$inject$5.INSTANCE);
        this.database$delegate = b5;
        b6 = yn5.b(ThreadsGateTransport$special$$inlined$inject$6.INSTANCE);
        this.jsonFormatter$delegate = b6;
        b7 = yn5.b(ThreadsGateTransport$special$$inlined$inject$7.INSTANCE);
        this.clientUseCase$delegate = b7;
        b8 = yn5.b(ThreadsGateTransport$special$$inlined$inject$8.INSTANCE);
        this.messageParser$delegate = b8;
        b9 = yn5.b(ThreadsGateTransport$special$$inlined$inject$9.INSTANCE);
        this.appInfo$delegate = b9;
        b10 = yn5.b(ThreadsGateTransport$special$$inlined$inject$10.INSTANCE);
        this.deviceInfo$delegate = b10;
        b11 = yn5.b(ThreadsGateTransport$special$$inlined$inject$11.INSTANCE);
        this.chatState$delegate = b11;
        this.logoutCorrelationId = mua.a(null);
        buildTransport();
        sh0.d(a, v33.d(), null, new AnonymousClass1(null), 2, null);
    }

    /* compiled from: ThreadsGateTransport.kt */
    @Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0005\b\u0097\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\"\u0010#J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0002J\u001a\u0010\r\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0018\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00100\u000f*\u00020\u000eH\u0002J\u0012\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\u0013*\u00020\u0012H\u0002J\u0018\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0016J\u0018\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u001bH\u0016J \u0010\u001d\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0016J \u0010\u001e\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0016J\"\u0010!\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010 \u001a\u00020\u001f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¨\u0006$"}, d2 = {"Lim/threads/business/transport/threadsGate/ThreadsGateTransport$WebSocketListener;", "Lu3c;", "", "text", "", "postSocketResponseMap", "", ThreadsGateTransport.KEY_CODE, ThreadsGateTransport.KEY_REASON, "Lim/threads/business/models/ChatItem;", "chatItem", "Lim/threads/business/transport/threadsGate/responses/Status;", "receivedStatus", "getMessageStatus", "Lorg/json/JSONObject;", "", "", "toMap", "Lorg/json/JSONArray;", "", "toList", "Lo3c;", "webSocket", "Lik9;", "response", "onOpen", "onMessage", "Llk0;", "bytes", "onClosing", "onClosed", "", "t", "onFailure", "<init>", "(Lim/threads/business/transport/threadsGate/ThreadsGateTransport;)V", "threads_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes3.dex */
    public class WebSocketListener extends u3c {

        /* compiled from: ThreadsGateTransport.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ChatItemType.values().length];
                try {
                    iArr[ChatItemType.MIRROR.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ChatItemType.MESSAGE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[ChatItemType.SURVEY_QUESTION_ANSWER.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[ChatItemType.REOPEN_THREAD.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[ChatItemType.CLOSE_THREAD.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public WebSocketListener() {
        }

        private final Status getMessageStatus(ChatItem chatItem, Status status) {
            UserPhrase userPhrase;
            if (chatItem instanceof UserPhrase) {
                userPhrase = (UserPhrase) chatItem;
            } else {
                userPhrase = null;
            }
            if (userPhrase != null && userPhrase.getSentState().ordinal() > status.getStatus().ordinal()) {
                String backendMessageId = userPhrase.getBackendMessageId();
                if (backendMessageId == null) {
                    backendMessageId = status.getCorrelationId();
                }
                String backendMessageId2 = userPhrase.getBackendMessageId();
                if (backendMessageId2 == null) {
                    backendMessageId2 = status.getMessageId();
                }
                return new Status(backendMessageId, backendMessageId2, userPhrase.getSentState());
            }
            return status;
        }

        private final void postSocketResponseMap(String str) {
            Map<String, ? extends Object> map;
            try {
                map = toMap(new JSONObject(str));
            } catch (JSONException unused) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("text", str);
                map = linkedHashMap;
            }
            ThreadsGateTransport.this.getChatUpdateProcessor().postSocketResponseMap(map);
        }

        private final List<Object> toList(JSONArray jSONArray) {
            ArrayList arrayList = new ArrayList();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                Object obj = jSONArray.get(i);
                z65.g(obj, "this[i]");
                if (obj instanceof JSONArray) {
                    obj = toList((JSONArray) obj);
                } else if (obj instanceof JSONObject) {
                    obj = toMap((JSONObject) obj);
                }
                arrayList.add(obj);
            }
            return arrayList;
        }

        private final Map<String, Object> toMap(JSONObject jSONObject) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator<String> keys = jSONObject.keys();
            z65.g(keys, "this.keys()");
            while (keys.hasNext()) {
                String next = keys.next();
                Object obj = jSONObject.get(next);
                z65.g(obj, "this.get(key)");
                if (obj instanceof JSONArray) {
                    obj = toList((JSONArray) obj);
                } else if (obj instanceof JSONObject) {
                    obj = toMap((JSONObject) obj);
                }
                z65.g(next, ch.qos.logback.core.joran.action.Action.KEY_ATTRIBUTE);
                linkedHashMap.put(next, obj);
            }
            return linkedHashMap;
        }

        @Override // defpackage.u3c
        public void onClosed(o3c o3cVar, int i, String str) {
            z65.h(o3cVar, "webSocket");
            z65.h(str, ThreadsGateTransport.KEY_REASON);
            postSocketResponseMap(i, str);
            Preferences preferences = ThreadsGateTransport.this.getPreferences();
            String device_address = PreferencesCoreKeys.INSTANCE.getDEVICE_ADDRESS();
            if (device_address == null) {
                device_address = null;
            }
            Preferences.Companion.savePreferenceToRam("", device_address);
            sh0.d(preferences.getCoroutineScope(), null, null, new Preferences$save$1(preferences, "", device_address, null), 3, null);
            ThreadsGateTransport.this.setWebSocket(null);
            LoggerEdna.info("[WS] ☚ Websocket closed: " + i + " / " + str);
        }

        @Override // defpackage.u3c
        public void onClosing(o3c o3cVar, int i, String str) {
            z65.h(o3cVar, "webSocket");
            z65.h(str, ThreadsGateTransport.KEY_REASON);
            postSocketResponseMap(i, str);
            LoggerEdna.info("[WS] ☚ Websocket closing: " + i + " / " + str);
            o3cVar.d(1000, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x0054 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // defpackage.u3c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void onFailure(defpackage.o3c r6, java.lang.Throwable r7, defpackage.ik9 r8) {
            /*
                r5 = this;
                java.lang.String r8 = "webSocket"
                defpackage.z65.h(r6, r8)
                java.lang.String r6 = "t"
                defpackage.z65.h(r7, r6)
                java.lang.String r6 = r7.getMessage()
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                java.lang.String r0 = "[WS] ☚❌ On Websocket error : "
                r8.append(r0)
                r8.append(r6)
                java.lang.String r6 = r8.toString()
                im.threads.business.logger.LoggerEdna.info(r6)
                java.lang.String r6 = "[WS] ☚❌ On Websocket error : "
                im.threads.business.logger.LoggerEdna.error(r6, r7)
                java.lang.String r6 = r7.getLocalizedMessage()
                if (r6 == 0) goto L39
                boolean r6 = defpackage.c0b.y(r6)
                if (r6 == 0) goto L34
                goto L39
            L34:
                java.lang.String r6 = r7.getLocalizedMessage()
                goto L3d
            L39:
                java.lang.String r6 = r7.getMessage()
            L3d:
                im.threads.business.transport.threadsGate.ThreadsGateTransport r7 = im.threads.business.transport.threadsGate.ThreadsGateTransport.this
                im.threads.business.chatUpdates.ChatUpdateProcessor r7 = im.threads.business.transport.threadsGate.ThreadsGateTransport.access$getChatUpdateProcessor(r7)
                im.threads.business.transport.TransportException r8 = new im.threads.business.transport.TransportException
                r8.<init>(r6)
                r7.postError(r8)
                im.threads.business.transport.threadsGate.ThreadsGateTransport r6 = im.threads.business.transport.threadsGate.ThreadsGateTransport.this
                java.util.List r6 = im.threads.business.transport.threadsGate.ThreadsGateTransport.access$getMessageInProcessIds$p(r6)
                im.threads.business.transport.threadsGate.ThreadsGateTransport r7 = im.threads.business.transport.threadsGate.ThreadsGateTransport.this
                monitor-enter(r6)
                java.util.List r8 = im.threads.business.transport.threadsGate.ThreadsGateTransport.access$getMessageInProcessIds$p(r7)     // Catch: java.lang.Throwable -> L9a
                java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Throwable -> L9a
            L5c:
                boolean r0 = r8.hasNext()     // Catch: java.lang.Throwable -> L9a
                if (r0 == 0) goto L9c
                java.lang.Object r0 = r8.next()     // Catch: java.lang.Throwable -> L9a
                java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L9a
                im.threads.business.secureDatabase.DatabaseHolder r1 = im.threads.business.transport.threadsGate.ThreadsGateTransport.access$getDatabase(r7)     // Catch: java.lang.Throwable -> L9a
                im.threads.business.models.ChatItem r1 = r1.getChatItemByCorrelationId(r0)     // Catch: java.lang.Throwable -> L9a
                im.threads.business.transport.threadsGate.responses.Status r2 = new im.threads.business.transport.threadsGate.responses.Status     // Catch: java.lang.Throwable -> L9a
                im.threads.business.models.MessageStatus r3 = im.threads.business.models.MessageStatus.FAILED     // Catch: java.lang.Throwable -> L9a
                r4 = 0
                r2.<init>(r0, r4, r3)     // Catch: java.lang.Throwable -> L9a
                im.threads.business.transport.threadsGate.responses.Status r1 = r5.getMessageStatus(r1, r2)     // Catch: java.lang.Throwable -> L9a
                im.threads.business.models.MessageStatus r1 = r1.getStatus()     // Catch: java.lang.Throwable -> L9a
                if (r1 != r3) goto L5c
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L9a
                r1.<init>()     // Catch: java.lang.Throwable -> L9a
                java.lang.String r2 = "Starting process error for messageId: "
                r1.append(r2)     // Catch: java.lang.Throwable -> L9a
                r1.append(r0)     // Catch: java.lang.Throwable -> L9a
                java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L9a
                im.threads.business.logger.LoggerEdna.info(r1)     // Catch: java.lang.Throwable -> L9a
                im.threads.business.transport.threadsGate.ThreadsGateTransport.access$processMessageSendError(r7, r0)     // Catch: java.lang.Throwable -> L9a
                goto L5c
            L9a:
                r7 = move-exception
                goto La3
            L9c:
                r7.closeWebSocket()     // Catch: java.lang.Throwable -> L9a
                kotlin.Unit r7 = kotlin.Unit.a     // Catch: java.lang.Throwable -> L9a
                monitor-exit(r6)
                return
            La3:
                monitor-exit(r6)
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: im.threads.business.transport.threadsGate.ThreadsGateTransport.WebSocketListener.onFailure(o3c, java.lang.Throwable, ik9):void");
        }

        /* JADX WARN: Code restructure failed: missing block: B:108:0x02e1, code lost:
            r6 = defpackage.sc1.I0(r6);
         */
        /* JADX WARN: Code restructure failed: missing block: B:118:0x0321, code lost:
            if (r5 == null) goto L127;
         */
        /* JADX WARN: Code restructure failed: missing block: B:78:0x0246, code lost:
            r5 = defpackage.m0b.y0(r10, new java.lang.String[]{im.threads.business.transport.threadsGate.ThreadsGateTransport.CORRELATION_ID_DIVIDER}, false, 0, 6, null);
         */
        @Override // defpackage.u3c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void onMessage(defpackage.o3c r21, java.lang.String r22) {
            /*
                Method dump skipped, instructions count: 1394
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: im.threads.business.transport.threadsGate.ThreadsGateTransport.WebSocketListener.onMessage(o3c, java.lang.String):void");
        }

        @Override // defpackage.u3c
        public void onOpen(o3c o3cVar, ik9 ik9Var) {
            z65.h(o3cVar, "webSocket");
            z65.h(ik9Var, "response");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put(ThreadsGateTransport.KEY_PROTOCOL, ik9Var.E());
            linkedHashMap.put(ThreadsGateTransport.KEY_CODE, Integer.valueOf(ik9Var.j()));
            linkedHashMap.put("message", ik9Var.r());
            linkedHashMap.put("url", ik9Var.K().l());
            ThreadsGateTransport.this.getChatUpdateProcessor().postSocketResponseMap(linkedHashMap);
        }

        private final void postSocketResponseMap(int i, String str) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put(ThreadsGateTransport.KEY_CODE, Integer.valueOf(i));
            try {
                linkedHashMap.put(ThreadsGateTransport.KEY_REASON, toMap(new JSONObject(str)));
            } catch (JSONException unused) {
                linkedHashMap.put(ThreadsGateTransport.KEY_REASON, str);
            }
            ThreadsGateTransport.this.getChatUpdateProcessor().postSocketResponseMap(linkedHashMap);
        }

        @Override // defpackage.u3c
        public void onMessage(o3c o3cVar, lk0 lk0Var) {
            z65.h(o3cVar, "webSocket");
            z65.h(lk0Var, "bytes");
            String G = lk0Var.G();
            LoggerEdna.info("[WS] ☚ Receiving bytes: " + G);
        }
    }

    private final boolean sendMessage(mb5 mb5Var, boolean z, String str, boolean z2, boolean z3) {
        Object obj;
        boolean O;
        boolean O2;
        boolean O3;
        boolean y;
        boolean y2;
        boolean O4;
        Object obj2;
        boolean c;
        boolean J;
        boolean u;
        String T0;
        Object U0;
        boolean O5;
        synchronized (this.messageInProcessIds) {
            this.messageInProcessIds.add(str);
        }
        if (this.webSocket == null && z2) {
            String pa5Var = mb5Var.toString();
            z65.g(pa5Var, "content.toString()");
            O5 = m0b.O(pa5Var, "CLIENT_OFFLINE", false, 2, null);
            openWebSocket(O5);
        }
        if (this.webSocket == null) {
            return false;
        }
        UserInfoBuilder userInfo = getClientUseCase().getUserInfo();
        String clientId = userInfo != null ? userInfo.getClientId() : null;
        Preferences preferences = getPreferences();
        String device_address = PreferencesCoreKeys.INSTANCE.getDEVICE_ADDRESS();
        Type type = new TypeToken<String>() { // from class: im.threads.business.transport.threadsGate.ThreadsGateTransport$sendMessage$$inlined$get$default$1
        }.getType();
        z65.g(type, "object : TypeToken<T>() {}.type");
        try {
            Preferences.Companion companion = Preferences.Companion;
            String preferenceFromRam = companion.getPreferenceFromRam(device_address);
            int length = preferenceFromRam.length();
            String str2 = preferenceFromRam;
            if (length == 0) {
                str2 = preferenceFromRam;
                if (!companion.isRamPreferencesLoaded()) {
                    String string = preferences.getSharedPreferences().getString(device_address, null);
                    if (string == null) {
                        string = "";
                    } else {
                        z65.g(string, "sharedPreferences.getString(key, null) ?: \"\"");
                    }
                    String str3 = string;
                    int length2 = str3.length();
                    str2 = str3;
                    if (length2 > 0) {
                        companion.savePreferenceToRam(device_address, str3);
                        str2 = str3;
                    }
                }
            }
            O4 = m0b.O(type.toString(), "String", false, 2, null);
            if (O4) {
                J = l0b.J(str2, "\"", false, 2, null);
                if (J) {
                    u = l0b.u(str2, "\"", false, 2, null);
                    if (u) {
                        T0 = o0b.T0(str2, 1);
                        U0 = o0b.U0(T0, 1);
                        if (U0 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                        }
                        obj2 = U0;
                    }
                }
                if (str2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                obj2 = str2;
            } else {
                Object l = new Gson().l(str2, type);
                obj2 = l;
                if (l == null) {
                    throw new NullPointerException();
                }
            }
            c = z65.c(obj2, "null");
            obj = obj2;
        } catch (Exception unused) {
        }
        if (c) {
            obj = null;
        }
        String str4 = (String) obj;
        if (z3 && clientId != null) {
            y = l0b.y(clientId);
            if (!y && str4 != null) {
                y2 = l0b.y(str4);
                if (!y2) {
                    sendInitChatMessage(false);
                    sendEnvironmentMessage(false, false);
                }
            }
        }
        String t = BaseConfig.Companion.getInstance().gson.t(new SendMessageRequest(str, new SendMessageRequest.Data(str4, mb5Var, z)));
        try {
            String pa5Var2 = mb5Var.B(MessageAttributes.TYPE).toString();
            z65.g(pa5Var2, "content[\"type\"].toString()");
            O = m0b.O(pa5Var2, "INIT_CHAT", false, 2, null);
            if (O) {
                getChatState().setInitChatCorrelationId(str);
            }
            String pa5Var3 = mb5Var.B(MessageAttributes.TYPE).toString();
            z65.g(pa5Var3, "content[\"type\"].toString()");
            O2 = m0b.O(pa5Var3, "CLIENT_INFO", false, 2, null);
            if (O2) {
                getChatState().setClientInfoCorrelationId(str);
            }
            String pa5Var4 = mb5Var.B(MessageAttributes.TYPE).toString();
            z65.g(pa5Var4, "content[\"type\"].toString()");
            O3 = m0b.O(pa5Var4, "CLIENT_OFFLINE", false, 2, null);
            if (O3) {
                sh0.d(this.coroutineScope, null, null, new ThreadsGateTransport$sendMessage$3(this, str, null), 3, null);
            }
        } catch (NullPointerException unused2) {
        }
        return sendMessageWithWebsocket(t);
    }

    private final void sendRegisterDevice() {
        getChatState().changeState(ChatStateEnum.REGISTERING_DEVICE);
        sendRegisterDeviceWithoutStateChanging();
    }

    public static /* synthetic */ void getClient$annotations() {
    }

    public static /* synthetic */ void getListener$annotations() {
    }

    public static /* synthetic */ void getWebSocket$annotations() {
    }

    @Override // im.threads.business.transport.Transport
    public void sendClientOffline(String str, Function0<Unit> function0) {
        Object obj;
        boolean y;
        boolean y2;
        boolean O;
        Object obj2;
        boolean c;
        boolean J;
        boolean u;
        String T0;
        Object U0;
        z65.h(str, MessageAttributes.CLIENT_ID);
        z65.h(function0, "callBack");
        Preferences preferences = getPreferences();
        String device_address = PreferencesCoreKeys.INSTANCE.getDEVICE_ADDRESS();
        Type type = new TypeToken<String>() { // from class: im.threads.business.transport.threadsGate.ThreadsGateTransport$sendClientOffline$$inlined$get$default$2
        }.getType();
        z65.g(type, "object : TypeToken<T>() {}.type");
        try {
            Preferences.Companion companion = Preferences.Companion;
            String preferenceFromRam = companion.getPreferenceFromRam(device_address);
            int length = preferenceFromRam.length();
            String str2 = preferenceFromRam;
            if (length == 0) {
                str2 = preferenceFromRam;
                if (!companion.isRamPreferencesLoaded()) {
                    String string = preferences.getSharedPreferences().getString(device_address, null);
                    if (string == null) {
                        string = "";
                    } else {
                        z65.g(string, "sharedPreferences.getString(key, null) ?: \"\"");
                    }
                    String str3 = string;
                    int length2 = str3.length();
                    str2 = str3;
                    if (length2 > 0) {
                        companion.savePreferenceToRam(device_address, str3);
                        str2 = str3;
                    }
                }
            }
            O = m0b.O(type.toString(), "String", false, 2, null);
            if (O) {
                J = l0b.J(str2, "\"", false, 2, null);
                if (J) {
                    u = l0b.u(str2, "\"", false, 2, null);
                    if (u) {
                        T0 = o0b.T0(str2, 1);
                        U0 = o0b.U0(T0, 1);
                        if (U0 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                        }
                        obj2 = U0;
                    }
                }
                if (str2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                obj2 = str2;
            } else {
                Object l = new Gson().l(str2, type);
                obj2 = l;
                if (l == null) {
                    throw new NullPointerException();
                }
            }
            c = z65.c(obj2, "null");
            obj = obj2;
        } catch (Exception unused) {
        }
        if (c) {
            obj = null;
        }
        String str4 = (CharSequence) obj;
        if (str4 != null) {
            y = l0b.y(str4);
            if (y) {
                return;
            }
            UserInfoBuilder userInfo = getClientUseCase().getUserInfo();
            y2 = l0b.y(str);
            if ((!y2) && userInfo != null) {
                sendMessage$default(this, getOutgoingMessageCreator().createMessageClientOffline(str, userInfo.getAppMarker()), false, null, false, false, 14, null);
            }
            qx1 a = rx1.a(v33.d());
            this.logoutScope = a;
            if (a != null) {
                sh0.d(a, v33.d(), null, new ThreadsGateTransport$sendClientOffline$1(this, function0, null), 2, null);
            }
        }
    }
}
