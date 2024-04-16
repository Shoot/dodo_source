package im.threads.business.utils.messenger;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import im.threads.business.UserInfoBuilder;
import im.threads.business.chatUpdates.ChatUpdateProcessor;
import im.threads.business.config.BaseConfig;
import im.threads.business.logger.LoggerEdna;
import im.threads.business.models.ChatItem;
import im.threads.business.models.ConsultInfo;
import im.threads.business.models.FileDescription;
import im.threads.business.models.MessageStatus;
import im.threads.business.models.UserPhrase;
import im.threads.business.preferences.Preferences;
import im.threads.business.rest.queries.ThreadsApi;
import im.threads.business.secureDatabase.DatabaseHolder;
import im.threads.business.transport.HistoryLoader;
import im.threads.business.transport.HistoryParser;
import im.threads.business.utils.ClientUseCase;
import im.threads.business.utils.ConsultWriter;
import im.threads.business.utils.FilePosterKt;
import im.threads.business.utils.internet.NetworkInteractor;
import im.threads.business.utils.messenger.MessengerImpl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
/* compiled from: MessengerImpl.kt */
@Metadata(d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010&\u001a\u0004\u0018\u00010%\u0012\u0006\u0010)\u001a\u00020(¢\u0006\u0004\bf\u0010gJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001a\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002J\u001a\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002J\b\u0010\n\u001a\u00020\u0004H\u0002J\b\u0010\u000b\u001a\u00020\u0004H\u0002J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002J\b\u0010\u0010\u001a\u00020\u0004H\u0016J\b\u0010\u0011\u001a\u00020\u0004H\u0016J\b\u0010\u0012\u001a\u00020\u0004H\u0016J\u0010\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0014\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u0014H\u0016J\u0016\u0010\u0019\u001a\u00020\u00042\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0016J\u0016\u0010\u001a\u001a\u00020\u000e2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0016J\b\u0010\u001b\u001a\u00020\u0004H\u0016J\u0016\u0010\u001d\u001a\u00020\u00042\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016J\u0010\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u001f\u001a\u00020\u0004H\u0016J\u0010\u0010 \u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\"\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u0002H\u0016J\u0010\u0010#\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010$\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0018\u0010&\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010.\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00100\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010/R\u0016\u00102\u001a\u0002018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R$\u00106\u001a\u0012\u0012\u0004\u0012\u00020\u000204j\b\u0012\u0004\u0012\u00020\u0002`58\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R$\u00108\u001a\u0012\u0012\u0004\u0012\u00020\u000204j\b\u0012\u0004\u0012\u00020\u0002`58\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00107R\u0014\u0010:\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u001b\u0010A\u001a\u00020<8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u001b\u0010F\u001a\u00020B8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bC\u0010>\u001a\u0004\bD\u0010ER\u001b\u0010K\u001a\u00020G8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bH\u0010>\u001a\u0004\bI\u0010JR\u001b\u0010P\u001a\u00020L8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bM\u0010>\u001a\u0004\bN\u0010OR\u001b\u0010U\u001a\u00020Q8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bR\u0010>\u001a\u0004\bS\u0010TR\u001c\u0010V\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010WR\u0016\u0010X\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010/R\"\u0010Z\u001a\u00020Y8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R \u0010b\u001a\b\u0012\u0004\u0012\u00020a0`8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bb\u0010c\u001a\u0004\bd\u0010e¨\u0006h"}, d2 = {"Lim/threads/business/utils/messenger/MessengerImpl;", "Lim/threads/business/utils/messenger/Messenger;", "Lim/threads/business/models/UserPhrase;", "userPhrase", "", "checkAndResendPhrase", "Lim/threads/business/models/ConsultInfo;", "consultInfo", "sendTextMessage", "sendFileMessage", "runResendJob", "proceedUnsentMessages", "Lz33;", "event", "", "subscribe", "onViewStart", "onViewStop", "onViewDestroy", "sendMessage", "Lbma;", "", "Lim/threads/business/models/ChatItem;", "downloadMessagesTillEnd", "chatItems", "saveMessages", "isEqualsToPreviousSaved", "clearSendQueue", "phrases", "recreateUnsentMessagesWith", "queueMessageSending", "resendMessages", "removeUserMessageFromQueue", "chatItem", "proceedSendingQueue", "addMsgToResendQueue", "forceResend", "Lwn1;", "compositeDisposable", "Lwn1;", "Lim/threads/business/utils/ClientUseCase;", "clientUseCase", "Lim/threads/business/utils/ClientUseCase;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "isDownloadingMessages", "Z", "isAllMessagesDownloaded", "", "lastMessageTimestamp", "J", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "unsentMessages", "Ljava/util/ArrayList;", "sendQueue", "Lqx1;", "mainCoroutineScope", "Lqx1;", "Lim/threads/business/utils/internet/NetworkInteractor;", "networkInteractor$delegate", "Lrn5;", "getNetworkInteractor", "()Lim/threads/business/utils/internet/NetworkInteractor;", "networkInteractor", "Lim/threads/business/chatUpdates/ChatUpdateProcessor;", "chatUpdateProcessor$delegate", "getChatUpdateProcessor", "()Lim/threads/business/chatUpdates/ChatUpdateProcessor;", "chatUpdateProcessor", "Lim/threads/business/preferences/Preferences;", "preferences$delegate", "getPreferences", "()Lim/threads/business/preferences/Preferences;", "preferences", "Lim/threads/business/secureDatabase/DatabaseHolder;", "database$delegate", "getDatabase", "()Lim/threads/business/secureDatabase/DatabaseHolder;", "database", "Lim/threads/business/transport/HistoryLoader;", "historyLoader$delegate", "getHistoryLoader", "()Lim/threads/business/transport/HistoryLoader;", "historyLoader", "lastMessages", "Ljava/util/List;", "isViewActive", "", "pageItemsCount", "I", "getPageItemsCount", "()I", "setPageItemsCount", "(I)V", "Lks8;", "", "resendStream", "Lks8;", "getResendStream", "()Lks8;", "<init>", "(Lwn1;Lim/threads/business/utils/ClientUseCase;)V", "threads_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class MessengerImpl implements Messenger {
    private final rn5 chatUpdateProcessor$delegate;
    private final ClientUseCase clientUseCase;
    private wn1 compositeDisposable;
    private final Context context;
    private final rn5 database$delegate;
    private final rn5 historyLoader$delegate;
    private boolean isAllMessagesDownloaded;
    private boolean isDownloadingMessages;
    private boolean isViewActive;
    private long lastMessageTimestamp;
    private List<? extends ChatItem> lastMessages;
    private final qx1 mainCoroutineScope;
    private final rn5 networkInteractor$delegate;
    private int pageItemsCount;
    private final rn5 preferences$delegate;
    private final ks8<String> resendStream;
    private final ArrayList<UserPhrase> sendQueue;
    private final ArrayList<UserPhrase> unsentMessages;

    public MessengerImpl(wn1 wn1Var, ClientUseCase clientUseCase) {
        rn5 b;
        rn5 b2;
        rn5 b3;
        rn5 b4;
        rn5 b5;
        List<? extends ChatItem> l;
        z65.h(clientUseCase, "clientUseCase");
        this.compositeDisposable = wn1Var;
        this.clientUseCase = clientUseCase;
        this.context = BaseConfig.Companion.getInstance().context;
        this.unsentMessages = new ArrayList<>();
        this.sendQueue = new ArrayList<>();
        this.mainCoroutineScope = rx1.a(v33.c());
        b = yn5.b(MessengerImpl$special$$inlined$inject$1.INSTANCE);
        this.networkInteractor$delegate = b;
        b2 = yn5.b(MessengerImpl$special$$inlined$inject$2.INSTANCE);
        this.chatUpdateProcessor$delegate = b2;
        b3 = yn5.b(MessengerImpl$special$$inlined$inject$3.INSTANCE);
        this.preferences$delegate = b3;
        b4 = yn5.b(MessengerImpl$special$$inlined$inject$4.INSTANCE);
        this.database$delegate = b4;
        b5 = yn5.b(MessengerImpl$special$$inlined$inject$5.INSTANCE);
        this.historyLoader$delegate = b5;
        l = kc1.l();
        this.lastMessages = l;
        this.pageItemsCount = 100;
        ks8<String> z = ks8.z();
        z65.g(z, "create()");
        this.resendStream = z;
        runResendJob();
    }

    private final void checkAndResendPhrase(UserPhrase userPhrase) {
        if (userPhrase.getSentState().ordinal() < MessageStatus.SENT.ordinal()) {
            queueMessageSending(userPhrase);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List downloadMessagesTillEnd$lambda$3(MessengerImpl messengerImpl) {
        List<ChatItem> chatItems;
        boolean z;
        z65.h(messengerImpl, "this$0");
        synchronized (messengerImpl) {
            try {
                if (!messengerImpl.isDownloadingMessages) {
                    messengerImpl.isDownloadingMessages = true;
                    LoggerEdna.debug(ThreadsApi.REST_TAG, "downloadMessagesTillEnd");
                    while (!messengerImpl.isAllMessagesDownloaded) {
                        List<ChatItem> chatItems2 = HistoryParser.INSTANCE.getChatItems(HistoryLoader.getHistorySync$default(messengerImpl.getHistoryLoader(), Long.valueOf(messengerImpl.lastMessageTimestamp), Integer.valueOf(messengerImpl.pageItemsCount), false, 4, null));
                        if (chatItems2.isEmpty()) {
                            messengerImpl.isAllMessagesDownloaded = true;
                        } else {
                            messengerImpl.lastMessageTimestamp = chatItems2.get(0).getTimeStamp();
                            if (chatItems2.size() < messengerImpl.pageItemsCount) {
                                z = true;
                            } else {
                                z = false;
                            }
                            messengerImpl.isAllMessagesDownloaded = z;
                            messengerImpl.saveMessages(chatItems2);
                        }
                    }
                }
                LoggerEdna.debug(ThreadsApi.REST_TAG, "Messages are loaded");
                messengerImpl.isDownloadingMessages = false;
                chatItems = messengerImpl.getDatabase().getChatItems(0, -1);
            } catch (Throwable th) {
                throw th;
            }
        }
        return chatItems;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void downloadMessagesTillEnd$lambda$4(Function1 function1, Object obj) {
        z65.h(function1, "$tmp0");
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ChatUpdateProcessor getChatUpdateProcessor() {
        return (ChatUpdateProcessor) this.chatUpdateProcessor$delegate.getValue();
    }

    private final DatabaseHolder getDatabase() {
        return (DatabaseHolder) this.database$delegate.getValue();
    }

    private final HistoryLoader getHistoryLoader() {
        return (HistoryLoader) this.historyLoader$delegate.getValue();
    }

    private final NetworkInteractor getNetworkInteractor() {
        return (NetworkInteractor) this.networkInteractor$delegate.getValue();
    }

    private final Preferences getPreferences() {
        return (Preferences) this.preferences$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void proceedUnsentMessages() {
        try {
            if ((!this.unsentMessages.isEmpty()) && !getNetworkInteractor().hasNoInternet(this.context)) {
                synchronized (this.unsentMessages) {
                    for (UserPhrase userPhrase : this.unsentMessages) {
                        sendMessage(userPhrase);
                    }
                    Unit unit = Unit.a;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private final void runResendJob() {
        sh0.d(this.mainCoroutineScope, v33.b(), null, new MessengerImpl$runResendJob$1(this, null), 2, null);
    }

    private final void sendFileMessage(final UserPhrase userPhrase, final ConsultInfo consultInfo) {
        FileDescription fileDescription;
        final FileDescription fileDescription2 = userPhrase.getFileDescription();
        if (userPhrase.getQuote() != null) {
            fileDescription = userPhrase.getQuote().getFileDescription();
        } else {
            fileDescription = null;
        }
        final FileDescription fileDescription3 = fileDescription;
        sk1 d = sk1.b(new t4() { // from class: gi6
            @Override // defpackage.t4
            public final void run() {
                MessengerImpl.sendFileMessage$lambda$8(MessengerImpl.this, fileDescription2, fileDescription3, userPhrase, consultInfo);
            }
        }).g(dw9.b()).d(ti.c());
        t4 t4Var = new t4() { // from class: hi6
            @Override // defpackage.t4
            public final void run() {
                MessengerImpl.sendFileMessage$lambda$9();
            }
        };
        final MessengerImpl$sendFileMessage$3 messengerImpl$sendFileMessage$3 = new MessengerImpl$sendFileMessage$3(this, userPhrase);
        z33 e = d.e(t4Var, new wr1() { // from class: ii6
            @Override // defpackage.wr1
            public final void accept(Object obj) {
                MessengerImpl.sendFileMessage$lambda$10(Function1.this, obj);
            }
        });
        z65.g(e, "private fun sendFileMess…        }\n        )\n    }");
        subscribe(e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void sendFileMessage$lambda$10(Function1 function1, Object obj) {
        z65.h(function1, "$tmp0");
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void sendFileMessage$lambda$8(MessengerImpl messengerImpl, FileDescription fileDescription, FileDescription fileDescription2, UserPhrase userPhrase, ConsultInfo consultInfo) {
        String str;
        String str2;
        z65.h(messengerImpl, "this$0");
        z65.h(userPhrase, "$userPhrase");
        UserInfoBuilder userInfo = messengerImpl.clientUseCase.getUserInfo();
        String str3 = null;
        if (userInfo != null) {
            str = userInfo.getClientId();
        } else {
            str = null;
        }
        if (fileDescription != null) {
            str2 = FilePosterKt.postFile(fileDescription, str);
        } else {
            str2 = null;
        }
        if (fileDescription2 != null) {
            str3 = FilePosterKt.postFile(fileDescription2, str);
        }
        BaseConfig.Companion.getInstance().transport.sendMessage(userPhrase, consultInfo, str2, str3);
    }

    private final void sendTextMessage(UserPhrase userPhrase, ConsultInfo consultInfo) {
        BaseConfig.Companion.getInstance().transport.sendMessage(userPhrase, consultInfo, null, null);
    }

    private final boolean subscribe(z33 z33Var) {
        wn1 wn1Var = this.compositeDisposable;
        if (wn1Var != null && !wn1Var.i()) {
            this.compositeDisposable = new wn1();
        }
        wn1 wn1Var2 = this.compositeDisposable;
        if (wn1Var2 != null) {
            return wn1Var2.b(z33Var);
        }
        return false;
    }

    @Override // im.threads.business.utils.messenger.Messenger
    public void addMsgToResendQueue(UserPhrase userPhrase) {
        z65.h(userPhrase, "userPhrase");
        if (!this.unsentMessages.contains(userPhrase)) {
            this.unsentMessages.add(userPhrase);
        }
    }

    @Override // im.threads.business.utils.messenger.Messenger
    public void clearSendQueue() {
        this.sendQueue.clear();
    }

    @Override // im.threads.business.utils.messenger.Messenger
    public bma<List<ChatItem>> downloadMessagesTillEnd() {
        bma f = bma.f(new Callable() { // from class: ji6
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List downloadMessagesTillEnd$lambda$3;
                downloadMessagesTillEnd$lambda$3 = MessengerImpl.downloadMessagesTillEnd$lambda$3(MessengerImpl.this);
                return downloadMessagesTillEnd$lambda$3;
            }
        });
        final MessengerImpl$downloadMessagesTillEnd$2 messengerImpl$downloadMessagesTillEnd$2 = new MessengerImpl$downloadMessagesTillEnd$2(this);
        bma<List<ChatItem>> d = f.d(new wr1() { // from class: ki6
            @Override // defpackage.wr1
            public final void accept(Object obj) {
                MessengerImpl.downloadMessagesTillEnd$lambda$4(Function1.this, obj);
            }
        });
        z65.g(d, "override fun downloadMes…gMessages = false }\n    }");
        return d;
    }

    @Override // im.threads.business.utils.messenger.Messenger
    public void forceResend(UserPhrase userPhrase) {
        z65.h(userPhrase, "userPhrase");
        if (userPhrase.getSentState().ordinal() < MessageStatus.SENT.ordinal()) {
            synchronized (this.unsentMessages) {
                pc1.I(this.unsentMessages, new MessengerImpl$forceResend$1$1(userPhrase));
                checkAndResendPhrase(userPhrase);
                Unit unit = Unit.a;
            }
        }
    }

    public final int getPageItemsCount() {
        return this.pageItemsCount;
    }

    @Override // im.threads.business.utils.messenger.Messenger
    public ks8<String> getResendStream() {
        return this.resendStream;
    }

    @Override // im.threads.business.utils.messenger.Messenger
    public boolean isEqualsToPreviousSaved(List<? extends ChatItem> list) {
        z65.h(list, "chatItems");
        return z65.c(list, this.lastMessages);
    }

    @Override // im.threads.business.utils.messenger.Messenger
    public void onViewDestroy() {
        onViewStop();
        rx1.d(this.mainCoroutineScope, null, 1, null);
    }

    @Override // im.threads.business.utils.messenger.Messenger
    public void onViewStart() {
        this.isViewActive = true;
    }

    @Override // im.threads.business.utils.messenger.Messenger
    public void onViewStop() {
        this.isViewActive = false;
    }

    @Override // im.threads.business.utils.messenger.Messenger
    public void proceedSendingQueue(UserPhrase userPhrase) {
        z65.h(userPhrase, "chatItem");
        synchronized (this.sendQueue) {
            try {
                Iterator<UserPhrase> it = this.sendQueue.iterator();
                z65.g(it, "sendQueue.iterator()");
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    UserPhrase next = it.next();
                    z65.g(next, "iterator.next()");
                    if (next.isTheSameItem(userPhrase)) {
                        it.remove();
                        break;
                    }
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!this.sendQueue.isEmpty()) {
            UserPhrase userPhrase2 = this.sendQueue.get(0);
            z65.g(userPhrase2, "sendQueue[0]");
            sendMessage(userPhrase2);
        }
    }

    @Override // im.threads.business.utils.messenger.Messenger
    public void queueMessageSending(UserPhrase userPhrase) {
        z65.h(userPhrase, "userPhrase");
        synchronized (this.sendQueue) {
            this.sendQueue.add(userPhrase);
        }
        if (this.sendQueue.size() == 1) {
            sendMessage(userPhrase);
        } else if (this.sendQueue.size() > 1) {
            resendMessages();
        }
    }

    @Override // im.threads.business.utils.messenger.Messenger
    public void recreateUnsentMessagesWith(List<UserPhrase> list) {
        z65.h(list, "phrases");
        this.unsentMessages.clear();
        this.unsentMessages.addAll(list);
    }

    @Override // im.threads.business.utils.messenger.Messenger
    public void removeUserMessageFromQueue(UserPhrase userPhrase) {
        z65.h(userPhrase, "userPhrase");
        pc1.I(this.sendQueue, new MessengerImpl$removeUserMessageFromQueue$1(userPhrase));
        pc1.I(this.unsentMessages, new MessengerImpl$removeUserMessageFromQueue$2(userPhrase));
    }

    @Override // im.threads.business.utils.messenger.Messenger
    public void resendMessages() {
        sh0.d(this.mainCoroutineScope, v33.b(), null, new MessengerImpl$resendMessages$1(this, null), 2, null);
    }

    @Override // im.threads.business.utils.messenger.Messenger
    public void saveMessages(List<? extends ChatItem> list) {
        z65.h(list, "chatItems");
        getDatabase().putChatItems(list);
    }

    @Override // im.threads.business.utils.messenger.Messenger
    public void sendMessage(UserPhrase userPhrase) {
        ConsultInfo consultInfo;
        String quotedPhraseConsultId;
        z65.h(userPhrase, "userPhrase");
        String id = userPhrase.getId();
        if (id != null) {
            getResendStream().d(id);
        }
        ConsultWriter consultWriter = new ConsultWriter(getPreferences());
        if (userPhrase.getQuote() != null && userPhrase.getQuote().isFromConsult() && (quotedPhraseConsultId = userPhrase.getQuote().getQuotedPhraseConsultId()) != null) {
            consultInfo = consultWriter.getConsultInfo(quotedPhraseConsultId);
        } else {
            consultInfo = null;
        }
        if (!userPhrase.hasFile()) {
            sendTextMessage(userPhrase, consultInfo);
        } else {
            sendFileMessage(userPhrase, consultInfo);
        }
    }

    public final void setPageItemsCount(int i) {
        this.pageItemsCount = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void sendFileMessage$lambda$9() {
    }
}
