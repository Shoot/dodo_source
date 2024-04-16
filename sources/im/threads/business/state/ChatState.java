package im.threads.business.state;

import com.google.gson.Gson;
import im.threads.business.preferences.Preferences;
import im.threads.business.preferences.Preferences$save$1;
import im.threads.business.preferences.PreferencesCoreKeys;
import im.threads.business.utils.ClientUseCase;
import kotlin.Metadata;
/* compiled from: ChatState.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b3\u00104J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010\u000b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bJ\u0006\u0010\f\u001a\u00020\bJ\u0006\u0010\r\u001a\u00020\bJ\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000eJ\u0006\u0010\u0010\u001a\u00020\u0006J\u0006\u0010\u0012\u001a\u00020\u0011J\u000f\u0010\u0015\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001b\u0010 \u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0018\u0010\"\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R!\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\u001d\u001a\u0004\b&\u0010'R\"\u0010*\u001a\u00020)8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u00100\u001a\u00020)8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u0010+\u001a\u0004\b1\u0010-\"\u0004\b2\u0010/¨\u00065"}, d2 = {"Lim/threads/business/state/ChatState;", "", "Lim/threads/business/state/ChatStateEvent;", "event", "", "timeout", "", "changeState", "Lim/threads/business/state/ChatStateEnum;", "state", "observeState", "startTimeoutObserver", "getCurrentState", "getLastSuccessfulState", "Lkua;", "getStateFlow", "onLogout", "", "isChatReady", "stopTimeoutObserver$threads_release", "()V", "stopTimeoutObserver", "Lim/threads/business/preferences/Preferences;", "preferences", "Lim/threads/business/preferences/Preferences;", "Lim/threads/business/utils/ClientUseCase;", "clientUseCase", "Lim/threads/business/utils/ClientUseCase;", "socketTimeout$delegate", "Lrn5;", "getSocketTimeout", "()J", "socketTimeout", "Lqx1;", "coroutineScope", "Lqx1;", "Lfr6;", "stateChannel$delegate", "getStateChannel", "()Lfr6;", "stateChannel", "", "initChatCorrelationId", "Ljava/lang/String;", "getInitChatCorrelationId", "()Ljava/lang/String;", "setInitChatCorrelationId", "(Ljava/lang/String;)V", "clientInfoCorrelationId", "getClientInfoCorrelationId", "setClientInfoCorrelationId", "<init>", "(Lim/threads/business/preferences/Preferences;Lim/threads/business/utils/ClientUseCase;)V", "threads_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class ChatState {
    private String clientInfoCorrelationId;
    private final ClientUseCase clientUseCase;
    private qx1 coroutineScope;
    private String initChatCorrelationId;
    private final Preferences preferences;
    private final rn5 socketTimeout$delegate;
    private final rn5 stateChannel$delegate;

    public ChatState(Preferences preferences, ClientUseCase clientUseCase) {
        rn5 b;
        rn5 b2;
        z65.h(preferences, "preferences");
        z65.h(clientUseCase, "clientUseCase");
        this.preferences = preferences;
        this.clientUseCase = clientUseCase;
        b = yn5.b(ChatState$socketTimeout$2.INSTANCE);
        this.socketTimeout$delegate = b;
        b2 = yn5.b(new ChatState$stateChannel$2(this));
        this.stateChannel$delegate = b2;
        this.initChatCorrelationId = "";
        this.clientInfoCorrelationId = "";
    }

    private final long getSocketTimeout() {
        return ((Number) this.socketTimeout$delegate.getValue()).longValue();
    }

    private final fr6<ChatStateEvent> getStateChannel() {
        return (fr6) this.stateChannel$delegate.getValue();
    }

    private final void observeState(ChatStateEnum chatStateEnum, long j) {
        if (chatStateEnum.compareTo(ChatStateEnum.THREAD_OPENED) < 0) {
            startTimeoutObserver(chatStateEnum, j);
        } else {
            stopTimeoutObserver$threads_release();
        }
    }

    private final void startTimeoutObserver(ChatStateEnum chatStateEnum, long j) {
        long currentTimeMillis = System.currentTimeMillis();
        qx1 qx1Var = this.coroutineScope;
        if (qx1Var != null) {
            rx1.d(qx1Var, null, 1, null);
        }
        qx1 a = rx1.a(v33.b());
        this.coroutineScope = a;
        if (a != null) {
            sh0.d(a, null, null, new ChatState$startTimeoutObserver$1(chatStateEnum, this, 500L, currentTimeMillis, j, null), 3, null);
        }
    }

    public final void changeState(ChatStateEnum chatStateEnum) {
        z65.h(chatStateEnum, "state");
        if (chatStateEnum.compareTo(getCurrentState()) >= 0 || chatStateEnum.compareTo(ChatStateEnum.DEVICE_REGISTERED) < 0) {
            Preferences preferences = this.preferences;
            String chat_state = PreferencesCoreKeys.INSTANCE.getCHAT_STATE();
            String str = chatStateEnum instanceof String ? (String) chatStateEnum : new Gson().t(chatStateEnum).toString();
            Preferences.Companion.savePreferenceToRam(chat_state, str);
            sh0.d(preferences.getCoroutineScope(), null, null, new Preferences$save$1(preferences, chat_state, str, null), 3, null);
            getStateChannel().setValue(new ChatStateEvent(chatStateEnum, false, 2, null));
            observeState(chatStateEnum, getSocketTimeout());
        }
    }

    public final String getClientInfoCorrelationId() {
        return this.clientInfoCorrelationId;
    }

    public final ChatStateEnum getCurrentState() {
        return getStateChannel().getValue().getState();
    }

    public final String getInitChatCorrelationId() {
        return this.initChatCorrelationId;
    }

    public final ChatStateEnum getLastSuccessfulState() {
        ChatStateEnum fromValue;
        ChatStateEvent value = getStateChannel().getValue();
        ChatStateEnum state = value.getState();
        ChatStateEnum chatStateEnum = ChatStateEnum.LOGGED_OUT;
        if (state != chatStateEnum && (fromValue = ChatStateEnum.Companion.fromValue(value.getState().getValue() - 1)) != null) {
            return fromValue;
        }
        return chatStateEnum;
    }

    public final kua<ChatStateEvent> getStateFlow() {
        return getStateChannel();
    }

    public final boolean isChatReady() {
        if (getCurrentState().compareTo(ChatStateEnum.THREAD_OPENED) >= 0 && this.clientUseCase.isClientIdNotEmpty()) {
            return true;
        }
        return false;
    }

    public final void onLogout() {
        changeState(ChatStateEnum.LOGGED_OUT);
    }

    public final void setClientInfoCorrelationId(String str) {
        z65.h(str, "<set-?>");
        this.clientInfoCorrelationId = str;
    }

    public final void setInitChatCorrelationId(String str) {
        z65.h(str, "<set-?>");
        this.initChatCorrelationId = str;
    }

    public final void stopTimeoutObserver$threads_release() {
        qx1 qx1Var = this.coroutineScope;
        if (qx1Var != null) {
            rx1.d(qx1Var, null, 1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void changeState(ChatStateEvent chatStateEvent, long j) {
        String str;
        Preferences preferences = this.preferences;
        String chat_state = PreferencesCoreKeys.INSTANCE.getCHAT_STATE();
        ChatStateEnum state = chatStateEvent.getState();
        if (state == null) {
            str = null;
        } else {
            str = state instanceof String ? (String) state : new Gson().t(state).toString();
        }
        Preferences.Companion.savePreferenceToRam(chat_state, str);
        sh0.d(preferences.getCoroutineScope(), null, null, new Preferences$save$1(preferences, chat_state, str, null), 3, null);
        getStateChannel().setValue(chatStateEvent);
        if (chatStateEvent.isTimeout()) {
            return;
        }
        observeState(chatStateEvent.getState(), j);
    }
}
