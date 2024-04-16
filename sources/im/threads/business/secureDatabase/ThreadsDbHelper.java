package im.threads.business.secureDatabase;

import android.annotation.SuppressLint;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import ch.qos.logback.core.CoreConstants;
import im.threads.business.logger.LoggerEdna;
import im.threads.business.models.ChatItem;
import im.threads.business.models.ConsultInfo;
import im.threads.business.models.ConsultPhrase;
import im.threads.business.models.FileDescription;
import im.threads.business.models.MessageStatus;
import im.threads.business.models.SpeechMessageUpdate;
import im.threads.business.models.Survey;
import im.threads.business.models.UserPhrase;
import im.threads.business.secureDatabase.table.FileDescriptionsTable;
import im.threads.business.secureDatabase.table.MessagesTable;
import im.threads.business.secureDatabase.table.QuestionsTable;
import im.threads.business.secureDatabase.table.QuickRepliesTable;
import im.threads.business.secureDatabase.table.QuotesTable;
import im.threads.business.transport.MessageAttributes;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: ThreadsDbHelper.kt */
@Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 V2\u00020\u00012\u00020\u0002:\u0001VB\u000f\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0013H\u0016J\u0010\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u0016H\u0016J\u0014\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u0014\u0010\u001c\u001a\u0004\u0018\u00010\u00192\b\u0010\u001d\u001a\u0004\u0018\u00010\u001bH\u0016J\u001e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00190\u00162\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020 H\u0016J\u0012\u0010\"\u001a\u0004\u0018\u00010#2\u0006\u0010$\u001a\u00020\u001bH\u0016J\n\u0010%\u001a\u0004\u0018\u00010&H\u0016J\b\u0010'\u001a\u00020 H\u0016J\u000e\u0010(\u001a\b\u0012\u0004\u0012\u00020)0\u0016H\u0016J\u000e\u0010*\u001a\b\u0012\u0004\u0012\u00020)0\u0016H\u0016J\u0012\u0010+\u001a\u0004\u0018\u00010,2\u0006\u0010-\u001a\u00020.H\u0016J\b\u0010/\u001a\u00020 H\u0016J\u0010\u00100\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u0016H\u0016J\u0016\u00101\u001a\b\u0012\u0004\u0012\u00020)0\u00162\u0006\u00102\u001a\u00020 H\u0016J\u0010\u00103\u001a\u00020\u00132\u0006\u00104\u001a\u000205H\u0016J \u00106\u001a\u00020\u00132\u0006\u00104\u001a\u0002052\u0006\u00107\u001a\u00020 2\u0006\u00108\u001a\u00020 H\u0016J\u0012\u00109\u001a\u00020:2\b\u0010;\u001a\u0004\u0018\u00010\u0019H\u0016J\u001a\u0010<\u001a\u00020\u00132\u0010\u0010=\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0018\u00010\u0016H\u0016J\u0018\u0010>\u001a\u00020\u00132\u000e\u0010?\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u0016H\u0016J\u001c\u0010@\u001a\u00020\u00132\b\u0010A\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\b\u0010B\u001a\u00020 H\u0016J\u0017\u0010C\u001a\u00020 2\b\u0010D\u001a\u0004\u0018\u00010.H\u0016¢\u0006\u0002\u0010EJ\u0010\u0010F\u001a\u00020\u00132\u0006\u0010G\u001a\u00020\u001bH\u0016J\b\u0010H\u001a\u00020 H\u0016J\b\u0010I\u001a\u00020 H\u0016J\u001c\u0010J\u001a\u00020\u00132\b\u0010A\u001a\u0004\u0018\u00010\u001b2\b\u0010K\u001a\u0004\u0018\u00010\u001bH\u0016J\u001c\u0010L\u001a\u00020\u00132\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\u0010M\u001a\u0004\u0018\u00010NH\u0016J\u001c\u0010O\u001a\u00020\u00132\b\u0010G\u001a\u0004\u0018\u00010\u001b2\b\u0010M\u001a\u0004\u0018\u00010NH\u0016J\u0010\u0010P\u001a\u00020\u00132\b\u0010Q\u001a\u0004\u0018\u00010RJ\u0010\u0010S\u001a\u00020\u00132\u0006\u0010;\u001a\u00020\u0019H\u0016J\u0010\u0010T\u001a\u00020\u00132\u0006\u0010U\u001a\u00020\u0017H\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006W"}, d2 = {"Lim/threads/business/secureDatabase/ThreadsDbHelper;", "Landroid/database/sqlite/SQLiteOpenHelper;", "Lim/threads/business/secureDatabase/DBHelper;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "fileDescriptionTable", "Lim/threads/business/secureDatabase/table/FileDescriptionsTable;", "messagesTable", "Lim/threads/business/secureDatabase/table/MessagesTable;", "questionsTable", "Lim/threads/business/secureDatabase/table/QuestionsTable;", "quickRepliesTable", "Lim/threads/business/secureDatabase/table/QuickRepliesTable;", "quotesTable", "Lim/threads/business/secureDatabase/table/QuotesTable;", "cleanDatabase", "", "closeInstance", "getAllFileDescriptions", "", "Lim/threads/business/models/FileDescription;", "getChatItemByBackendMessageId", "Lim/threads/business/models/ChatItem;", "messageId", "", "getChatItemByCorrelationId", "messageUuid", "getChatItems", "offset", "", "limit", "getLastConsultInfo", "Lim/threads/business/models/ConsultInfo;", "id", "getLastConsultPhrase", "Lim/threads/business/models/ConsultPhrase;", "getMessagesCount", "getNotDeliveredChatItems", "Lim/threads/business/models/UserPhrase;", "getSendingChatItems", "getSurvey", "Lim/threads/business/models/Survey;", "sendingId", "", "getUnreadMessagesCount", "getUnreadMessagesUuid", "getUnsendUserPhrase", "count", "onCreate", "db", "Landroid/database/sqlite/SQLiteDatabase;", "onUpgrade", "oldVersion", "newVersion", "putChatItem", "", "chatItem", "putChatItems", "items", "putFileDescriptions", "fileDescriptions", "removeItem", "correlationId", "setAllConsultMessagesWereRead", "setAllConsultMessagesWereReadWithThreadId", "threadId", "(Ljava/lang/Long;)I", "setMessageWasRead", MessageAttributes.UUID, "setNotSentSurveyDisplayMessageToFalse", "setOldRequestResolveThreadDisplayMessageToFalse", "setOrUpdateMessageId", "backendMessageId", "setUserPhraseStateByBackendMessageId", "messageStatus", "Lim/threads/business/models/MessageStatus;", "setUserPhraseStateByCorrelationId", "speechMessageUpdated", "speechMessageUpdate", "Lim/threads/business/models/SpeechMessageUpdate;", "updateChatItemByTimeStamp", "updateFileDescription", "fileDescription", "Companion", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ThreadsDbHelper extends SQLiteOpenHelper implements DBHelper {
    public static final Companion Companion = new Companion(null);
    private static final int VERSION = 11;
    @SuppressLint({"StaticFieldLeak"})
    private static ThreadsDbHelper dbInstance;
    private final Context context;
    private FileDescriptionsTable fileDescriptionTable;
    private MessagesTable messagesTable;
    private QuestionsTable questionsTable;
    private QuickRepliesTable quickRepliesTable;
    private QuotesTable quotesTable;

    /* compiled from: ThreadsDbHelper.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\tH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lim/threads/business/secureDatabase/ThreadsDbHelper$Companion;", "", "()V", "VERSION", "", "dbInstance", "Lim/threads/business/secureDatabase/ThreadsDbHelper;", "getInstance", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "isDatabaseAlive", "", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final boolean isDatabaseAlive(Context context) {
            Cursor cursor;
            boolean z;
            SQLiteDatabase readableDatabase;
            try {
                ThreadsDbHelper threadsDbHelper = ThreadsDbHelper.dbInstance;
                if (threadsDbHelper != null && (readableDatabase = threadsDbHelper.getReadableDatabase()) != null) {
                    cursor = readableDatabase.rawQuery("SELECT * FROM TABLE_QUOTE", null);
                } else {
                    cursor = null;
                }
                if (cursor != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (cursor != null) {
                    cursor.close();
                }
                return z;
            } catch (Exception e) {
                LoggerEdna.error("Cannot read database. Database will be deleted", e);
                context.deleteDatabase(null);
                return false;
            }
        }

        public final synchronized ThreadsDbHelper getInstance(Context context) {
            ThreadsDbHelper threadsDbHelper;
            try {
                z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
                if (ThreadsDbHelper.dbInstance == null) {
                    ThreadsDbHelper.dbInstance = new ThreadsDbHelper(context, null);
                    if (!isDatabaseAlive(context)) {
                        ThreadsDbHelper.dbInstance = new ThreadsDbHelper(context, null);
                    }
                }
                threadsDbHelper = ThreadsDbHelper.dbInstance;
                z65.e(threadsDbHelper);
            } catch (Throwable th) {
                throw th;
            }
            return threadsDbHelper;
        }
    }

    public /* synthetic */ ThreadsDbHelper(Context context, DefaultConstructorMarker defaultConstructorMarker) {
        this(context);
    }

    @Override // im.threads.business.secureDatabase.DBHelper
    public void cleanDatabase() {
        this.fileDescriptionTable.cleanTable(this);
        this.messagesTable.cleanTable(this);
        this.quotesTable.cleanTable(this);
        this.quickRepliesTable.cleanTable(this);
        this.questionsTable.cleanTable(this);
    }

    @Override // im.threads.business.secureDatabase.DBHelper
    public void closeInstance() {
        close();
    }

    @Override // im.threads.business.secureDatabase.DBHelper
    public List<FileDescription> getAllFileDescriptions() {
        return this.fileDescriptionTable.getAllFileDescriptions(this);
    }

    @Override // im.threads.business.secureDatabase.DBHelper
    public ChatItem getChatItemByBackendMessageId(String str) {
        return this.messagesTable.getChatItemByBackendMessageId(this, str);
    }

    @Override // im.threads.business.secureDatabase.DBHelper
    public ChatItem getChatItemByCorrelationId(String str) {
        return this.messagesTable.getChatItemByCorrelationId(this, str);
    }

    @Override // im.threads.business.secureDatabase.DBHelper
    public List<ChatItem> getChatItems(int i, int i2) {
        return this.messagesTable.getChatItems(this, i, i2);
    }

    public final Context getContext() {
        return this.context;
    }

    @Override // im.threads.business.secureDatabase.DBHelper
    public ConsultInfo getLastConsultInfo(String str) {
        z65.h(str, "id");
        return this.messagesTable.getLastConsultInfo(this, str);
    }

    @Override // im.threads.business.secureDatabase.DBHelper
    public ConsultPhrase getLastConsultPhrase() {
        return this.messagesTable.getLastConsultPhrase(this);
    }

    @Override // im.threads.business.secureDatabase.DBHelper
    public int getMessagesCount() {
        return this.messagesTable.getMessagesCount(this);
    }

    @Override // im.threads.business.secureDatabase.DBHelper
    public List<UserPhrase> getNotDeliveredChatItems() {
        return this.messagesTable.getNotDeliveredChatItems(this);
    }

    @Override // im.threads.business.secureDatabase.DBHelper
    public List<UserPhrase> getSendingChatItems() {
        return this.messagesTable.getSendingChatItems(this);
    }

    @Override // im.threads.business.secureDatabase.DBHelper
    public Survey getSurvey(long j) {
        return this.messagesTable.getSurvey(this, j);
    }

    @Override // im.threads.business.secureDatabase.DBHelper
    public int getUnreadMessagesCount() {
        return this.messagesTable.getUnreadMessagesCount(this);
    }

    @Override // im.threads.business.secureDatabase.DBHelper
    public List<String> getUnreadMessagesUuid() {
        return this.messagesTable.getUnreadMessagesUuid(this);
    }

    @Override // im.threads.business.secureDatabase.DBHelper
    public List<UserPhrase> getUnsendUserPhrase(int i) {
        return this.messagesTable.getUnsentUserPhrase(this, i);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        z65.h(sQLiteDatabase, "db");
        this.messagesTable.createTable(sQLiteDatabase);
        this.quotesTable.createTable(sQLiteDatabase);
        this.quickRepliesTable.createTable(sQLiteDatabase);
        this.fileDescriptionTable.createTable(sQLiteDatabase);
        this.questionsTable.createTable(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        z65.h(sQLiteDatabase, "db");
        if (i < 11) {
            this.messagesTable.upgradeTable(sQLiteDatabase, i, i2);
            this.quotesTable.upgradeTable(sQLiteDatabase, i, i2);
            this.quickRepliesTable.upgradeTable(sQLiteDatabase, i, i2);
            this.fileDescriptionTable.upgradeTable(sQLiteDatabase, i, i2);
            this.questionsTable.upgradeTable(sQLiteDatabase, i, i2);
            onCreate(sQLiteDatabase);
        }
    }

    @Override // im.threads.business.secureDatabase.DBHelper
    public boolean putChatItem(ChatItem chatItem) {
        return this.messagesTable.putChatItem(this, chatItem);
    }

    @Override // im.threads.business.secureDatabase.DBHelper
    public void putChatItems(List<? extends ChatItem> list) {
        this.messagesTable.putChatItems(this, list);
    }

    @Override // im.threads.business.secureDatabase.DBHelper
    public void putFileDescriptions(List<FileDescription> list) {
        z65.h(list, "fileDescriptions");
        this.fileDescriptionTable.putFileDescriptions(this, list);
    }

    @Override // im.threads.business.secureDatabase.DBHelper
    public void removeItem(String str, String str2) {
        this.messagesTable.removeItem(this, str, str2);
    }

    @Override // im.threads.business.secureDatabase.DBHelper
    public int setAllConsultMessagesWereRead() {
        return this.messagesTable.setAllMessagesWereRead(this);
    }

    @Override // im.threads.business.secureDatabase.DBHelper
    public int setAllConsultMessagesWereReadWithThreadId(Long l) {
        if (l != null) {
            l.longValue();
            return this.messagesTable.setAllMessagesWereReadInThread(this, l.longValue());
        }
        return 0;
    }

    @Override // im.threads.business.secureDatabase.DBHelper
    public void setMessageWasRead(String str) {
        z65.h(str, MessageAttributes.UUID);
        this.messagesTable.setMessageWasRead(this, str);
    }

    @Override // im.threads.business.secureDatabase.DBHelper
    public int setNotSentSurveyDisplayMessageToFalse() {
        return this.messagesTable.setNotSentSurveyDisplayMessageToFalse(this);
    }

    @Override // im.threads.business.secureDatabase.DBHelper
    public int setOldRequestResolveThreadDisplayMessageToFalse() {
        return this.messagesTable.setOldRequestResolveThreadDisplayMessageToFalse(this);
    }

    @Override // im.threads.business.secureDatabase.DBHelper
    public void setOrUpdateMessageId(String str, String str2) {
        this.messagesTable.setOrUpdateMessageId(this, str, str2);
    }

    @Override // im.threads.business.secureDatabase.DBHelper
    public void setUserPhraseStateByBackendMessageId(String str, MessageStatus messageStatus) {
        this.messagesTable.setUserPhraseStateByBackendMessageId(this, str, messageStatus);
    }

    @Override // im.threads.business.secureDatabase.DBHelper
    public void setUserPhraseStateByCorrelationId(String str, MessageStatus messageStatus) {
        this.messagesTable.setUserPhraseStateByCorrelationId(this, str, messageStatus);
    }

    public final void speechMessageUpdated(SpeechMessageUpdate speechMessageUpdate) {
        MessagesTable messagesTable = this.messagesTable;
        z65.e(speechMessageUpdate);
        messagesTable.speechMessageUpdated(this, speechMessageUpdate);
    }

    @Override // im.threads.business.secureDatabase.DBHelper
    public void updateChatItemByTimeStamp(ChatItem chatItem) {
        z65.h(chatItem, "chatItem");
        this.messagesTable.updateChatItemByTimeStamp(this, chatItem);
    }

    @Override // im.threads.business.secureDatabase.DBHelper
    public void updateFileDescription(FileDescription fileDescription) {
        z65.h(fileDescription, "fileDescription");
        this.fileDescriptionTable.updateFileDescriptionByName(this, fileDescription);
    }

    private ThreadsDbHelper(Context context) {
        super(context, (String) null, (SQLiteDatabase.CursorFactory) null, 11);
        this.context = context;
        this.fileDescriptionTable = new FileDescriptionsTable();
        this.questionsTable = new QuestionsTable();
        this.quotesTable = new QuotesTable(this.fileDescriptionTable);
        this.quickRepliesTable = new QuickRepliesTable();
        this.messagesTable = new MessagesTable(this.fileDescriptionTable, this.quotesTable, this.quickRepliesTable, this.questionsTable);
    }
}
