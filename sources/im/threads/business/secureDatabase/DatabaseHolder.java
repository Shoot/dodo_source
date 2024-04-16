package im.threads.business.secureDatabase;

import android.content.Context;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteDiskIOException;
import ch.qos.logback.core.CoreConstants;
import im.threads.business.annotation.OpenForTesting;
import im.threads.business.extensions.MutableLazy;
import im.threads.business.extensions.MutableLazyKt;
import im.threads.business.logger.LoggerEdna;
import im.threads.business.models.ChatItem;
import im.threads.business.models.ConsultInfo;
import im.threads.business.models.FileDescription;
import im.threads.business.models.MessageStatus;
import im.threads.business.models.SpeechMessageUpdate;
import im.threads.business.models.UserPhrase;
import im.threads.business.secureDatabase.DatabaseHolder;
import im.threads.business.transport.MessageAttributes;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
/* compiled from: DatabaseHolder.kt */
@OpenForTesting
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010H\u001a\u00020G¢\u0006\u0004\bN\u0010OJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J'\u0010\u000b\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\b2\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u001c\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010J\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0013J\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00160\u0013J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u00142\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u00142\b\u0010\u001c\u001a\u0004\u0018\u00010\u0019J!\u0010\u001f\u001a\u0004\u0018\u00010\u00022\u0010\u0010\u001e\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0018\u00010\u0013¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020\u00062\b\u0010!\u001a\u0004\u0018\u00010\u0014J\u0016\u0010%\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010$\u0018\u00010\u00130#J\u000e\u0010'\u001a\u00020\u00022\u0006\u0010&\u001a\u00020$J\u000e\u0010(\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u0014J\u0010\u0010+\u001a\u0004\u0018\u00010*2\u0006\u0010)\u001a\u00020\u0019J\u0014\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00160\u00132\u0006\u0010,\u001a\u00020\u0010J\u001a\u00101\u001a\u00020\u00022\b\u0010.\u001a\u0004\u0018\u00010\u00192\b\u00100\u001a\u0004\u0018\u00010/J\u001a\u00102\u001a\u00020\u00022\b\u0010\u001c\u001a\u0004\u0018\u00010\u00192\b\u00100\u001a\u0004\u0018\u00010/J\u0006\u00104\u001a\u000203J\u0017\u00107\u001a\u0002032\b\u00106\u001a\u0004\u0018\u000105¢\u0006\u0004\b7\u00108J\u0010\u00109\u001a\u00020\u00022\b\u0010.\u001a\u0004\u0018\u00010\u0019J\u0010\u0010<\u001a\u00020\u00022\b\u0010;\u001a\u0004\u0018\u00010:J\u0006\u0010=\u001a\u000203J\u0006\u0010>\u001a\u000203J\u0006\u0010?\u001a\u00020\u0010J\u0006\u0010@\u001a\u00020\u0010J\u000e\u0010A\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0013J\u001a\u0010D\u001a\u00020\u00022\b\u0010B\u001a\u0004\u0018\u00010\u00192\b\u0010C\u001a\u0004\u0018\u00010\u0019J#\u0010E\u001a\u0004\u0018\u00010\u00022\b\u0010B\u001a\u0004\u0018\u00010\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\bE\u0010FR\u0014\u0010H\u001a\u00020G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u001c\u0010L\u001a\b\u0012\u0004\u0012\u00020K0J8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010M¨\u0006P"}, d2 = {"Lim/threads/business/secureDatabase/DatabaseHolder;", "", "", "checkAndUpdate", "Lim/threads/business/database/ThreadsDbHelper;", "helper", "", "needMigrateToNewDB", "T", "Lkotlin/Function0;", "block", "tryExecute", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "cleanDatabase", "()Lkotlin/Unit;", "closeInstance", "", "offset", "limit", "", "Lim/threads/business/models/ChatItem;", "getChatItems", "Lim/threads/business/models/UserPhrase;", "getSendingChatItems", "getNotDeliveredChatItems", "", "messageUuid", "getChatItemByCorrelationId", "messageId", "getChatItemByBackendMessageId", "items", "putChatItems", "(Ljava/util/List;)Lkotlin/Unit;", "chatItem", "putChatItem", "Lbma;", "Lim/threads/business/models/FileDescription;", "getAllFileDescriptions", "fileDescription", "updateFileDescription", "updateChatItemByTimeStamp", "id", "Lim/threads/business/models/ConsultInfo;", "getConsultInfo", "count", "getUnsentUserPhrase", MessageAttributes.UUID, "Lim/threads/business/models/MessageStatus;", "messageStatus", "setStateOfUserPhraseByCorrelationId", "setStateOfUserPhraseByBackendMessageId", "Lsk1;", "setAllConsultMessagesWereRead", "", "threadId", "setAllConsultMessagesWereReadInThread", "(Ljava/lang/Long;)Lsk1;", "setMessageWasRead", "Lim/threads/business/models/SpeechMessageUpdate;", "speechMessageUpdate", "saveSpeechMessageUpdate", "setNotSentSurveyDisplayMessageToFalse", "setOldRequestResolveThreadDisplayMessageToFalse", "getMessagesCount", "getUnreadMessagesCount", "getUnreadMessagesUuid", "correlationId", "backendMessageId", "setOrUpdateMessageId", "removeItem", "(Ljava/lang/String;Ljava/lang/String;)Lkotlin/Unit;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "Lim/threads/business/extensions/MutableLazy;", "Lim/threads/business/secureDatabase/ThreadsDbHelper;", "myOpenHelper", "Lim/threads/business/extensions/MutableLazy;", "<init>", "(Landroid/content/Context;)V", "threads_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class DatabaseHolder {
    private final Context context;
    private MutableLazy<ThreadsDbHelper> myOpenHelper;

    public DatabaseHolder(Context context) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.context = context;
        this.myOpenHelper = MutableLazyKt.mutableLazy(new DatabaseHolder$myOpenHelper$1(this));
    }

    private final void checkAndUpdate() {
        im.threads.business.database.ThreadsDbHelper threadsDbHelper = new im.threads.business.database.ThreadsDbHelper(this.context);
        if (needMigrateToNewDB(threadsDbHelper)) {
            putChatItems(threadsDbHelper.getChatItems(0, -1));
            this.myOpenHelper.getValue().putFileDescriptions(threadsDbHelper.getAllFileDescriptions());
            threadsDbHelper.cleanDatabase();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getAllFileDescriptions$lambda$0(DatabaseHolder databaseHolder) {
        z65.h(databaseHolder, "this$0");
        return (List) databaseHolder.tryExecute(new DatabaseHolder$getAllFileDescriptions$1$1(databaseHolder));
    }

    private final boolean needMigrateToNewDB(im.threads.business.database.ThreadsDbHelper threadsDbHelper) {
        try {
            if (!(!threadsDbHelper.getChatItems(0, -1).isEmpty())) {
                if (!(!threadsDbHelper.getAllFileDescriptions().isEmpty())) {
                    return false;
                }
            }
            return true;
        } catch (SQLiteDiskIOException unused) {
            sh0.d(rx1.a(v33.c()), null, null, new DatabaseHolder$needMigrateToNewDB$1(this, null), 3, null);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object setAllConsultMessagesWereRead$lambda$1(DatabaseHolder databaseHolder) {
        z65.h(databaseHolder, "this$0");
        return databaseHolder.tryExecute(new DatabaseHolder$setAllConsultMessagesWereRead$1$1(databaseHolder));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object setAllConsultMessagesWereReadInThread$lambda$2(DatabaseHolder databaseHolder, Long l) {
        z65.h(databaseHolder, "this$0");
        return databaseHolder.tryExecute(new DatabaseHolder$setAllConsultMessagesWereReadInThread$1$1(databaseHolder, l));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object setNotSentSurveyDisplayMessageToFalse$lambda$4(DatabaseHolder databaseHolder) {
        z65.h(databaseHolder, "this$0");
        return databaseHolder.tryExecute(new DatabaseHolder$setNotSentSurveyDisplayMessageToFalse$1$1(databaseHolder));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object setOldRequestResolveThreadDisplayMessageToFalse$lambda$5(DatabaseHolder databaseHolder) {
        z65.h(databaseHolder, "this$0");
        return databaseHolder.tryExecute(new DatabaseHolder$setOldRequestResolveThreadDisplayMessageToFalse$1$1(databaseHolder));
    }

    private final <T> T tryExecute(Function0<? extends T> function0) {
        try {
            return function0.invoke();
        } catch (Exception e) {
            T t = null;
            try {
                try {
                    checkAndUpdate();
                    return function0.invoke();
                } catch (Exception unused) {
                    Class<?> cls = function0.getClass();
                    LoggerEdna.error("Processed error when reading database for block: \"" + cls + "\"", e);
                    return t;
                }
            } catch (SQLiteCantOpenDatabaseException unused2) {
                this.myOpenHelper.reset();
                t = function0.invoke();
                return t;
            } catch (Exception unused3) {
                Class<?> cls2 = function0.getClass();
                LoggerEdna.error("Processed error when reading database for block: \"" + cls2 + "\"", e);
                return t;
            }
        }
    }

    public final Unit cleanDatabase() {
        return (Unit) tryExecute(new DatabaseHolder$cleanDatabase$1(this));
    }

    public final Unit closeInstance() {
        return (Unit) tryExecute(new DatabaseHolder$closeInstance$1(this));
    }

    public final bma<List<FileDescription>> getAllFileDescriptions() {
        bma<List<FileDescription>> k = bma.f(new Callable() { // from class: gm2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List allFileDescriptions$lambda$0;
                allFileDescriptions$lambda$0 = DatabaseHolder.getAllFileDescriptions$lambda$0(DatabaseHolder.this);
                return allFileDescriptions$lambda$0;
            }
        }).k(dw9.b());
        z65.g(k, "fromCallable { tryExecut…scribeOn(Schedulers.io())");
        return k;
    }

    public final ChatItem getChatItemByBackendMessageId(String str) {
        return (ChatItem) tryExecute(new DatabaseHolder$getChatItemByBackendMessageId$1(this, str));
    }

    public final ChatItem getChatItemByCorrelationId(String str) {
        return (ChatItem) tryExecute(new DatabaseHolder$getChatItemByCorrelationId$1(this, str));
    }

    public final List<ChatItem> getChatItems(int i, int i2) {
        List<ChatItem> list = (List) tryExecute(new DatabaseHolder$getChatItems$1(this, i, i2));
        if (list == null) {
            return new ArrayList();
        }
        return list;
    }

    public final ConsultInfo getConsultInfo(String str) {
        z65.h(str, "id");
        return (ConsultInfo) tryExecute(new DatabaseHolder$getConsultInfo$1(this, str));
    }

    public final int getMessagesCount() {
        Integer num = (Integer) tryExecute(new DatabaseHolder$getMessagesCount$1(this));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public final List<UserPhrase> getNotDeliveredChatItems() {
        List<UserPhrase> list = (List) tryExecute(new DatabaseHolder$getNotDeliveredChatItems$1(this));
        if (list == null) {
            return new ArrayList();
        }
        return list;
    }

    public final List<UserPhrase> getSendingChatItems() {
        List<UserPhrase> list = (List) tryExecute(new DatabaseHolder$getSendingChatItems$1(this));
        if (list == null) {
            return new ArrayList();
        }
        return list;
    }

    public final int getUnreadMessagesCount() {
        Integer num = (Integer) tryExecute(new DatabaseHolder$getUnreadMessagesCount$1(this));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public final List<String> getUnreadMessagesUuid() {
        List<String> list = (List) tryExecute(new DatabaseHolder$getUnreadMessagesUuid$1(this));
        if (list == null) {
            return new ArrayList();
        }
        return list;
    }

    public final List<UserPhrase> getUnsentUserPhrase(int i) {
        List<UserPhrase> list = (List) tryExecute(new DatabaseHolder$getUnsentUserPhrase$1(this, i));
        if (list == null) {
            return new ArrayList();
        }
        return list;
    }

    public final boolean putChatItem(ChatItem chatItem) {
        Boolean bool = (Boolean) tryExecute(new DatabaseHolder$putChatItem$1(this, chatItem));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final Unit putChatItems(List<? extends ChatItem> list) {
        return (Unit) tryExecute(new DatabaseHolder$putChatItems$1(this, list));
    }

    public final Unit removeItem(String str, String str2) {
        return (Unit) tryExecute(new DatabaseHolder$removeItem$1(this, str, str2));
    }

    public final void saveSpeechMessageUpdate(SpeechMessageUpdate speechMessageUpdate) {
        tryExecute(new DatabaseHolder$saveSpeechMessageUpdate$1(this, speechMessageUpdate));
    }

    public final sk1 setAllConsultMessagesWereRead() {
        sk1 g = sk1.c(new Callable() { // from class: lm2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Object allConsultMessagesWereRead$lambda$1;
                allConsultMessagesWereRead$lambda$1 = DatabaseHolder.setAllConsultMessagesWereRead$lambda$1(DatabaseHolder.this);
                return allConsultMessagesWereRead$lambda$1;
            }
        }).g(dw9.b());
        z65.g(g, "fromCallable { tryExecut…scribeOn(Schedulers.io())");
        return g;
    }

    public final sk1 setAllConsultMessagesWereReadInThread(final Long l) {
        sk1 g = sk1.c(new Callable() { // from class: km2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Object allConsultMessagesWereReadInThread$lambda$2;
                allConsultMessagesWereReadInThread$lambda$2 = DatabaseHolder.setAllConsultMessagesWereReadInThread$lambda$2(DatabaseHolder.this, l);
                return allConsultMessagesWereReadInThread$lambda$2;
            }
        }).g(dw9.b());
        z65.g(g, "fromCallable { tryExecut…scribeOn(Schedulers.io())");
        return g;
    }

    public final void setMessageWasRead(String str) {
        if (str != null) {
            Unit unit = (Unit) tryExecute(new DatabaseHolder$setMessageWasRead$1$1(this, str));
        }
    }

    public final sk1 setNotSentSurveyDisplayMessageToFalse() {
        sk1 g = sk1.c(new Callable() { // from class: jm2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Object notSentSurveyDisplayMessageToFalse$lambda$4;
                notSentSurveyDisplayMessageToFalse$lambda$4 = DatabaseHolder.setNotSentSurveyDisplayMessageToFalse$lambda$4(DatabaseHolder.this);
                return notSentSurveyDisplayMessageToFalse$lambda$4;
            }
        }).g(dw9.b());
        z65.g(g, "fromCallable { tryExecut…scribeOn(Schedulers.io())");
        return g;
    }

    public final sk1 setOldRequestResolveThreadDisplayMessageToFalse() {
        sk1 g = sk1.c(new Callable() { // from class: im2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Object oldRequestResolveThreadDisplayMessageToFalse$lambda$5;
                oldRequestResolveThreadDisplayMessageToFalse$lambda$5 = DatabaseHolder.setOldRequestResolveThreadDisplayMessageToFalse$lambda$5(DatabaseHolder.this);
                return oldRequestResolveThreadDisplayMessageToFalse$lambda$5;
            }
        }).g(dw9.b());
        z65.g(g, "fromCallable { tryExecut…scribeOn(Schedulers.io())");
        return g;
    }

    public final void setOrUpdateMessageId(String str, String str2) {
        tryExecute(new DatabaseHolder$setOrUpdateMessageId$1(this, str, str2));
    }

    public final void setStateOfUserPhraseByBackendMessageId(String str, MessageStatus messageStatus) {
        tryExecute(new DatabaseHolder$setStateOfUserPhraseByBackendMessageId$1(this, str, messageStatus));
    }

    public final void setStateOfUserPhraseByCorrelationId(String str, MessageStatus messageStatus) {
        tryExecute(new DatabaseHolder$setStateOfUserPhraseByCorrelationId$1(this, str, messageStatus));
    }

    public final void updateChatItemByTimeStamp(ChatItem chatItem) {
        z65.h(chatItem, "chatItem");
        tryExecute(new DatabaseHolder$updateChatItemByTimeStamp$1(this, chatItem));
    }

    public final void updateFileDescription(FileDescription fileDescription) {
        z65.h(fileDescription, "fileDescription");
        tryExecute(new DatabaseHolder$updateFileDescription$1(this, fileDescription));
    }
}
