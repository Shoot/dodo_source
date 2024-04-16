package im.threads.business.secureDatabase;

import im.threads.business.models.ChatItem;
import im.threads.business.models.ConsultInfo;
import im.threads.business.models.ConsultPhrase;
import im.threads.business.models.FileDescription;
import im.threads.business.models.MessageStatus;
import im.threads.business.models.Survey;
import im.threads.business.models.UserPhrase;
import im.threads.business.transport.MessageAttributes;
import java.util.List;
import kotlin.Metadata;
/* compiled from: DBHelper.kt */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\u0012\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0006H&J\u0014\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH&J\u0014\u0010\f\u001a\u0004\u0018\u00010\t2\b\u0010\r\u001a\u0004\u0018\u00010\u000bH&J \u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00062\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H&J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u000bH&J\n\u0010\u0015\u001a\u0004\u0018\u00010\u0016H&J\b\u0010\u0017\u001a\u00020\u0010H&J\u0010\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0006H&J\u0010\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0006H&J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH&J\b\u0010\u001f\u001a\u00020\u0010H&J\u0012\u0010 \u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\u0006H&J\u001a\u0010!\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0018\u00010\u00062\u0006\u0010\"\u001a\u00020\u0010H&J\u0012\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\tH&J\u001a\u0010&\u001a\u00020\u00032\u0010\u0010'\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u0006H&J\u0018\u0010(\u001a\u00020\u00032\u000e\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H&J\u001c\u0010*\u001a\u00020\u00032\b\u0010+\u001a\u0004\u0018\u00010\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH&J\b\u0010,\u001a\u00020\u0010H&J\u0017\u0010-\u001a\u00020\u00102\b\u0010.\u001a\u0004\u0018\u00010\u001eH&¢\u0006\u0002\u0010/J\u0010\u00100\u001a\u00020\u00032\u0006\u00101\u001a\u00020\u000bH&J\b\u00102\u001a\u00020\u0010H&J\b\u00103\u001a\u00020\u0010H&J\u001c\u00104\u001a\u00020\u00032\b\u0010+\u001a\u0004\u0018\u00010\u000b2\b\u00105\u001a\u0004\u0018\u00010\u000bH&J\u001c\u00106\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u00107\u001a\u0004\u0018\u000108H&J\u001c\u00109\u001a\u00020\u00032\b\u00101\u001a\u0004\u0018\u00010\u000b2\b\u00107\u001a\u0004\u0018\u000108H&J\u0010\u0010:\u001a\u00020\u00032\u0006\u0010%\u001a\u00020\tH&J\u0010\u0010;\u001a\u00020\u00032\u0006\u0010<\u001a\u00020\u0007H&¨\u0006="}, d2 = {"Lim/threads/business/secureDatabase/DBHelper;", "", "cleanDatabase", "", "closeInstance", "getAllFileDescriptions", "", "Lim/threads/business/models/FileDescription;", "getChatItemByBackendMessageId", "Lim/threads/business/models/ChatItem;", "messageId", "", "getChatItemByCorrelationId", "messageUuid", "getChatItems", "offset", "", "limit", "getLastConsultInfo", "Lim/threads/business/models/ConsultInfo;", "id", "getLastConsultPhrase", "Lim/threads/business/models/ConsultPhrase;", "getMessagesCount", "getNotDeliveredChatItems", "Lim/threads/business/models/UserPhrase;", "getSendingChatItems", "getSurvey", "Lim/threads/business/models/Survey;", "sendingId", "", "getUnreadMessagesCount", "getUnreadMessagesUuid", "getUnsendUserPhrase", "count", "putChatItem", "", "chatItem", "putChatItems", "items", "putFileDescriptions", "fileDescriptions", "removeItem", "correlationId", "setAllConsultMessagesWereRead", "setAllConsultMessagesWereReadWithThreadId", "threadId", "(Ljava/lang/Long;)I", "setMessageWasRead", MessageAttributes.UUID, "setNotSentSurveyDisplayMessageToFalse", "setOldRequestResolveThreadDisplayMessageToFalse", "setOrUpdateMessageId", "backendMessageId", "setUserPhraseStateByBackendMessageId", "messageStatus", "Lim/threads/business/models/MessageStatus;", "setUserPhraseStateByCorrelationId", "updateChatItemByTimeStamp", "updateFileDescription", "fileDescription", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface DBHelper {
    void cleanDatabase();

    void closeInstance();

    List<FileDescription> getAllFileDescriptions();

    ChatItem getChatItemByBackendMessageId(String str);

    ChatItem getChatItemByCorrelationId(String str);

    List<ChatItem> getChatItems(int i, int i2);

    ConsultInfo getLastConsultInfo(String str);

    ConsultPhrase getLastConsultPhrase();

    int getMessagesCount();

    List<UserPhrase> getNotDeliveredChatItems();

    List<UserPhrase> getSendingChatItems();

    Survey getSurvey(long j);

    int getUnreadMessagesCount();

    List<String> getUnreadMessagesUuid();

    List<UserPhrase> getUnsendUserPhrase(int i);

    boolean putChatItem(ChatItem chatItem);

    void putChatItems(List<? extends ChatItem> list);

    void putFileDescriptions(List<FileDescription> list);

    void removeItem(String str, String str2);

    int setAllConsultMessagesWereRead();

    int setAllConsultMessagesWereReadWithThreadId(Long l);

    void setMessageWasRead(String str);

    int setNotSentSurveyDisplayMessageToFalse();

    int setOldRequestResolveThreadDisplayMessageToFalse();

    void setOrUpdateMessageId(String str, String str2);

    void setUserPhraseStateByBackendMessageId(String str, MessageStatus messageStatus);

    void setUserPhraseStateByCorrelationId(String str, MessageStatus messageStatus);

    void updateChatItemByTimeStamp(ChatItem chatItem);

    void updateFileDescription(FileDescription fileDescription);
}
