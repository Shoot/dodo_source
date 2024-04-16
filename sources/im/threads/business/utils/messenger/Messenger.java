package im.threads.business.utils.messenger;

import im.threads.business.models.ChatItem;
import im.threads.business.models.UserPhrase;
import java.util.List;
import kotlin.Metadata;
/* compiled from: Messenger.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0014\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006H&J\u0016\u0010\u000b\u001a\u00020\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H&J\u0016\u0010\r\u001a\u00020\f2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H&J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0002H&J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0013\u001a\u00020\u0004H&J\u0010\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0015\u001a\u00020\u0004H&J\u0016\u0010\u0017\u001a\u00020\u00042\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H&J\b\u0010\u0018\u001a\u00020\u0004H&J\b\u0010\u0019\u001a\u00020\u0004H&J\b\u0010\u001a\u001a\u00020\u0004H&R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lim/threads/business/utils/messenger/Messenger;", "", "Lim/threads/business/models/UserPhrase;", "userPhrase", "", "sendMessage", "Lbma;", "", "Lim/threads/business/models/ChatItem;", "downloadMessagesTillEnd", "chatItems", "saveMessages", "", "isEqualsToPreviousSaved", "queueMessageSending", "chatItem", "proceedSendingQueue", "addMsgToResendQueue", "forceResend", "resendMessages", "removeUserMessageFromQueue", "clearSendQueue", "phrases", "recreateUnsentMessagesWith", "onViewStart", "onViewStop", "onViewDestroy", "Lks8;", "", "getResendStream", "()Lks8;", "resendStream", "threads_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes3.dex */
public interface Messenger {
    void addMsgToResendQueue(UserPhrase userPhrase);

    void clearSendQueue();

    bma<List<ChatItem>> downloadMessagesTillEnd();

    void forceResend(UserPhrase userPhrase);

    ks8<String> getResendStream();

    boolean isEqualsToPreviousSaved(List<? extends ChatItem> list);

    void onViewDestroy();

    void onViewStart();

    void onViewStop();

    void proceedSendingQueue(UserPhrase userPhrase);

    void queueMessageSending(UserPhrase userPhrase);

    void recreateUnsentMessagesWith(List<UserPhrase> list);

    void removeUserMessageFromQueue(UserPhrase userPhrase);

    void resendMessages();

    void saveMessages(List<? extends ChatItem> list);

    void sendMessage(UserPhrase userPhrase);
}
