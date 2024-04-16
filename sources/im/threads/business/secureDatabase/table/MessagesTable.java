package im.threads.business.secureDatabase.table;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.net.Uri;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.huawei.hms.opendevice.c;
import com.inappstory.sdk.stories.statistic.StatisticManager;
import im.threads.business.config.BaseConfig;
import im.threads.business.formatters.SpeechStatus;
import im.threads.business.logger.LoggerEdna;
import im.threads.business.models.ChatItem;
import im.threads.business.models.ConsultConnectionMessage;
import im.threads.business.models.ConsultInfo;
import im.threads.business.models.ConsultPhrase;
import im.threads.business.models.ConsultRole;
import im.threads.business.models.FileDescription;
import im.threads.business.models.MessageStatus;
import im.threads.business.models.QuestionDTO;
import im.threads.business.models.QuickReply;
import im.threads.business.models.Quote;
import im.threads.business.models.RequestResolveThread;
import im.threads.business.models.SimpleSystemMessage;
import im.threads.business.models.SpeechMessageUpdate;
import im.threads.business.models.Survey;
import im.threads.business.models.UserPhrase;
import im.threads.business.models.enums.ModificationStateEnum;
import im.threads.business.secureDatabase.table.Table;
import im.threads.business.transport.MessageAttributes;
import im.threads.business.utils.FileDownloader;
import im.threads.business.utils.FileProvider;
import im.threads.business.utils.FileUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
/* compiled from: MessagesTable.kt */
@Metadata(d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001kB%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u001a\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015J\u001a\u0010\u0016\u001a\u0004\u0018\u00010\u00132\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u001a\u0010\u0016\u001a\u0004\u0018\u00010\u00132\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0015J$\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00130\u001b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001dJ\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0002J\u0018\u0010#\u001a\u00020$2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0010\u0010%\u001a\u00020 2\u0006\u0010&\u001a\u00020$H\u0002J\u0018\u0010'\u001a\u0004\u0018\u00010(2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020\u0015J\u0010\u0010*\u001a\u0004\u0018\u00010$2\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010+\u001a\u00020\u001d2\u0006\u0010\r\u001a\u00020\u000eJ\u0014\u0010,\u001a\b\u0012\u0004\u0012\u00020-0\u001b2\u0006\u0010\r\u001a\u00020\u000eJ\u0012\u0010.\u001a\u0004\u0018\u00010/2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0010\u00100\u001a\u00020 2\u0006\u00101\u001a\u00020/H\u0002J\u0014\u00102\u001a\b\u0012\u0004\u0012\u00020-0\u001b2\u0006\u0010\r\u001a\u00020\u000eJ\u0010\u00103\u001a\u00020 2\u0006\u00104\u001a\u000205H\u0002J\u0018\u00106\u001a\u0002072\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0018\u00106\u001a\u0004\u0018\u0001072\u0006\u0010\r\u001a\u00020\u000e2\u0006\u00108\u001a\u000209J\u000e\u0010:\u001a\u00020\u001d2\u0006\u0010\r\u001a\u00020\u000eJ\u0016\u0010;\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u001b2\u0006\u0010\r\u001a\u00020\u000eJ\u001c\u0010<\u001a\b\u0012\u0004\u0012\u00020-0\u001b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010=\u001a\u00020\u001dJ\u0018\u0010>\u001a\u00020-2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0010\u0010?\u001a\u00020 2\u0006\u0010&\u001a\u00020-H\u0002J\u0018\u0010@\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010A\u001a\u00020 H\u0002J\u0018\u0010B\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010A\u001a\u00020 H\u0002J\u0018\u0010C\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010D\u001a\u000207H\u0002J\u0012\u0010E\u001a\u0004\u0018\u00010F2\u0006\u0010G\u001a\u00020HH\u0002J\u001a\u0010I\u001a\u0004\u0018\u00010\u00152\u000e\u0010J\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u001bH\u0002J\u0018\u0010K\u001a\u00020L2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010M\u001a\u0004\u0018\u00010\u0013J \u0010N\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0010\u0010O\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0018\u00010\u001bJ\"\u0010P\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010Q\u001a\u0004\u0018\u00010\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015J\u000e\u0010R\u001a\u00020\u001d2\u0006\u0010\r\u001a\u00020\u000eJ\u0016\u0010S\u001a\u00020\u001d2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010T\u001a\u000209J\u0016\u0010U\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010V\u001a\u00020\u0015J\u000e\u0010W\u001a\u00020\u001d2\u0006\u0010\r\u001a\u00020\u000eJ\u0018\u0010W\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010X\u001a\u000209H\u0002J\u000e\u0010Y\u001a\u00020\u001d2\u0006\u0010\r\u001a\u00020\u000eJ\u0018\u0010Y\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010V\u001a\u00020\u0015H\u0002J\"\u0010Z\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010Q\u001a\u0004\u0018\u00010\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015J \u0010[\u001a\u00020\f2\u0006\u0010G\u001a\u00020H2\u0006\u0010\\\u001a\u00020\u001d2\u0006\u0010]\u001a\u00020FH\u0002J\"\u0010^\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010_\u001a\u0004\u0018\u00010`J\"\u0010a\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010V\u001a\u0004\u0018\u00010\u00152\b\u0010_\u001a\u0004\u0018\u00010`J\u0016\u0010b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010c\u001a\u00020dJ\u0018\u0010e\u001a\b\u0012\u0004\u0012\u00020\u00150\u001b2\b\u0010f\u001a\u0004\u0018\u00010\u0015H\u0002J\u0016\u0010g\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010M\u001a\u00020\u0013J \u0010h\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010i\u001a\u00020\u001d2\u0006\u0010j\u001a\u00020\u001dH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006l"}, d2 = {"Lim/threads/business/secureDatabase/table/MessagesTable;", "Lim/threads/business/secureDatabase/table/Table;", "fileDescriptionTable", "Lim/threads/business/secureDatabase/table/FileDescriptionsTable;", "quotesTable", "Lim/threads/business/secureDatabase/table/QuotesTable;", "quickRepliesTable", "Lim/threads/business/secureDatabase/table/QuickRepliesTable;", "questionsTable", "Lim/threads/business/secureDatabase/table/QuestionsTable;", "(Lim/threads/business/secureDatabase/table/FileDescriptionsTable;Lim/threads/business/secureDatabase/table/QuotesTable;Lim/threads/business/secureDatabase/table/QuickRepliesTable;Lim/threads/business/secureDatabase/table/QuestionsTable;)V", "cleanTable", "", "sqlHelper", "Landroid/database/sqlite/SQLiteOpenHelper;", "createTable", "db", "Landroid/database/sqlite/SQLiteDatabase;", "getChatItemByBackendMessageId", "Lim/threads/business/models/ChatItem;", "messageId", "", "getChatItemByCorrelationId", c.a, "Landroid/database/Cursor;", "messageUuid", "getChatItems", "", "offset", "", "limit", "getConsultConnectionMessageCV", "Landroid/content/ContentValues;", "consultConnectionMessage", "Lim/threads/business/models/ConsultConnectionMessage;", "getConsultPhrase", "Lim/threads/business/models/ConsultPhrase;", "getConsultPhraseCV", "phrase", "getLastConsultInfo", "Lim/threads/business/models/ConsultInfo;", "id", "getLastConsultPhrase", "getMessagesCount", "getNotDeliveredChatItems", "Lim/threads/business/models/UserPhrase;", "getRequestResolveThread", "Lim/threads/business/models/RequestResolveThread;", "getRequestResolveThreadCV", "requestResolveThread", "getSendingChatItems", "getSimpleSystemMessageCV", "simpleSystemMessage", "Lim/threads/business/models/SimpleSystemMessage;", "getSurvey", "Lim/threads/business/models/Survey;", "sendingId", "", "getUnreadMessagesCount", "getUnreadMessagesUuid", "getUnsentUserPhrase", "count", "getUserPhrase", "getUserPhraseCV", "insertOrUpdateMessage", "cv", "insertOrUpdateMessageByTimeStamp", "insertOrUpdateSurvey", "survey", "isFileDownloaded", "Landroid/net/Uri;", "fileDescription", "Lim/threads/business/models/FileDescription;", "listToString", StatisticManager.LIST, "putChatItem", "", "chatItem", "putChatItems", "chatItems", "removeItem", "correlationId", "setAllMessagesWereRead", "setAllMessagesWereReadInThread", "threadId", "setMessageWasRead", MessageAttributes.UUID, "setNotSentSurveyDisplayMessageToFalse", "currentSurveySendingId", "setOldRequestResolveThreadDisplayMessageToFalse", "setOrUpdateMessageId", "setProgressAndFileUri", "progress", "uri", "setUserPhraseStateByBackendMessageId", "messageStatus", "Lim/threads/business/models/MessageStatus;", "setUserPhraseStateByCorrelationId", "speechMessageUpdated", "speechMessageUpdate", "Lim/threads/business/models/SpeechMessageUpdate;", "stringToList", "text", "updateChatItemByTimeStamp", "upgradeTable", "oldVersion", "newVersion", "MessageType", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MessagesTable extends Table {
    private final FileDescriptionsTable fileDescriptionTable;
    private final QuestionsTable questionsTable;
    private final QuickRepliesTable quickRepliesTable;
    private final QuotesTable quotesTable;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: MessagesTable.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lim/threads/business/secureDatabase/table/MessagesTable$MessageType;", "", "(Ljava/lang/String;I)V", GrsBaseInfo.CountryCodeSource.UNKNOWN, "CONSULT_CONNECTED", "SYSTEM_MESSAGE", "CONSULT_PHRASE", "USER_PHRASE", "SURVEY", "REQUEST_RESOLVE_THREAD", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public enum MessageType {
        UNKNOWN,
        CONSULT_CONNECTED,
        SYSTEM_MESSAGE,
        CONSULT_PHRASE,
        USER_PHRASE,
        SURVEY,
        REQUEST_RESOLVE_THREAD
    }

    public MessagesTable(FileDescriptionsTable fileDescriptionsTable, QuotesTable quotesTable, QuickRepliesTable quickRepliesTable, QuestionsTable questionsTable) {
        z65.h(fileDescriptionsTable, "fileDescriptionTable");
        z65.h(quotesTable, "quotesTable");
        z65.h(quickRepliesTable, "quickRepliesTable");
        z65.h(questionsTable, "questionsTable");
        this.fileDescriptionTable = fileDescriptionsTable;
        this.quotesTable = quotesTable;
        this.quickRepliesTable = quickRepliesTable;
        this.questionsTable = questionsTable;
    }

    private final ContentValues getConsultConnectionMessageCV(ConsultConnectionMessage consultConnectionMessage) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("COLUMN_NAME", consultConnectionMessage.getName());
        contentValues.put("COLUMN_TIMESTAMP", Long.valueOf(consultConnectionMessage.getTimeStamp()));
        contentValues.put("COLUMN_AVATAR_PATH", consultConnectionMessage.getAvatarPath());
        contentValues.put("COLUMN_MESSAGE_TYPE", Integer.valueOf(MessageType.CONSULT_CONNECTED.ordinal()));
        contentValues.put("COLUMN_SEX", Boolean.valueOf(consultConnectionMessage.getSex()));
        contentValues.put("COLUMN_CONNECTION_TYPE", consultConnectionMessage.getConnectionType());
        contentValues.put("COLUMN_CONSULT_ID", consultConnectionMessage.getConsultId());
        contentValues.put("COLUMN_CONSULT_STATUS", consultConnectionMessage.getStatus());
        contentValues.put("COLUMN_CONSULT_TITLE", consultConnectionMessage.getTitle());
        contentValues.put("COLUMN_CONSULT_ORG_UNIT", consultConnectionMessage.getOrgUnit());
        contentValues.put("COLUMN_CONSULT_ROLE", consultConnectionMessage.getRole());
        contentValues.put("COLUMN_MESSAGE_CORRELATION_ID", consultConnectionMessage.getUuid());
        contentValues.put("COLUMN_DISPLAY_MESSAGE", Boolean.valueOf(consultConnectionMessage.getDisplay()));
        contentValues.put("COLUMN_PHRASE", consultConnectionMessage.getText());
        contentValues.put("COLUMN_THREAD_ID", consultConnectionMessage.getThreadId());
        return contentValues;
    }

    private final ConsultPhrase getConsultPhrase(SQLiteOpenHelper sQLiteOpenHelper, Cursor cursor) {
        List<QuickReply> list;
        Table.Companion companion = Table.Companion;
        String cursorGetString = companion.cursorGetString(cursor, "COLUMN_MESSAGE_CORRELATION_ID");
        FileDescription fileDescription = this.fileDescriptionTable.getFileDescription(sQLiteOpenHelper, companion.cursorGetString(cursor, "COLUMN_MESSAGE_CORRELATION_ID"));
        ModificationStateEnum fromString = ModificationStateEnum.Companion.fromString(companion.cursorGetString(cursor, "COLUMN_MODIFICATION_STATE"));
        Quote quote = this.quotesTable.getQuote(sQLiteOpenHelper, companion.cursorGetString(cursor, "COLUMN_MESSAGE_CORRELATION_ID"));
        String cursorGetString2 = companion.cursorGetString(cursor, "COLUMN_NAME");
        String cursorGetString3 = companion.cursorGetString(cursor, "COLUMN_PHRASE");
        String cursorGetString4 = companion.cursorGetString(cursor, "COLUMN_FORMATTED_PHRASE");
        long cursorGetLong = companion.cursorGetLong(cursor, "COLUMN_TIMESTAMP");
        String cursorGetString5 = companion.cursorGetString(cursor, "COLUMN_CONSULT_ID");
        String cursorGetString6 = companion.cursorGetString(cursor, "COLUMN_AVATAR_PATH");
        boolean cursorGetBool = companion.cursorGetBool(cursor, "COLUMN_IS_READ");
        String cursorGetString7 = companion.cursorGetString(cursor, "COLUMN_CONSULT_STATUS");
        boolean cursorGetBool2 = companion.cursorGetBool(cursor, "COLUMN_SEX");
        Long valueOf = Long.valueOf(companion.cursorGetLong(cursor, "COLUMN_THREAD_ID"));
        String cursorGetString8 = companion.cursorGetString(cursor, "COLUMN_MESSAGE_CORRELATION_ID");
        if (cursorGetString8 != null) {
            list = this.quickRepliesTable.getQuickReplies(sQLiteOpenHelper, cursorGetString8);
        } else {
            list = null;
        }
        return new ConsultPhrase(cursorGetString, fileDescription, fromString, quote, cursorGetString2, cursorGetString3, cursorGetString4, cursorGetLong, cursorGetString5, cursorGetString6, cursorGetBool, cursorGetString7, cursorGetBool2, valueOf, list, Boolean.valueOf(companion.cursorGetBool(cursor, "COLUMN_BLOCK_INPUT")), SpeechStatus.Companion.fromString(companion.cursorGetString(cursor, "COLUMN_SPEECH_STATUS")), ConsultRole.Companion.consultRoleFromString(companion.cursorGetString(cursor, "COLUMN_CONSULT_ROLE")), companion.cursorGetBool(cursor, "COLUMN_IS_PERSONAL_OFFER"));
    }

    private final ContentValues getConsultPhraseCV(ConsultPhrase consultPhrase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("COLUMN_MESSAGE_CORRELATION_ID", consultPhrase.getId());
        contentValues.put("COLUMN_PHRASE", consultPhrase.getPhraseText());
        contentValues.put("COLUMN_FORMATTED_PHRASE", consultPhrase.getFormattedPhrase());
        contentValues.put("COLUMN_TIMESTAMP", Long.valueOf(consultPhrase.getTimeStamp()));
        contentValues.put("COLUMN_MESSAGE_TYPE", Integer.valueOf(MessageType.CONSULT_PHRASE.ordinal()));
        contentValues.put("COLUMN_AVATAR_PATH", consultPhrase.getAvatarPath());
        contentValues.put("COLUMN_CONSULT_ID", consultPhrase.getConsultId());
        contentValues.put("COLUMN_IS_READ", Boolean.valueOf(consultPhrase.getRead()));
        contentValues.put("COLUMN_CONSULT_STATUS", consultPhrase.getStatus());
        contentValues.put("COLUMN_NAME", consultPhrase.getConsultName());
        contentValues.put("COLUMN_SEX", Boolean.valueOf(consultPhrase.getSex()));
        contentValues.put("COLUMN_THREAD_ID", consultPhrase.getThreadId());
        contentValues.put("COLUMN_BLOCK_INPUT", consultPhrase.isBlockInput());
        contentValues.put("COLUMN_SPEECH_STATUS", consultPhrase.getSpeechStatus().toString());
        contentValues.put("COLUMN_CONSULT_ROLE", consultPhrase.getRole().name());
        contentValues.put("COLUMN_MODIFICATION_STATE", consultPhrase.getModified().getState());
        contentValues.put("COLUMN_IS_PERSONAL_OFFER", Boolean.valueOf(consultPhrase.isPersonalOffer()));
        return contentValues;
    }

    private final RequestResolveThread getRequestResolveThread(Cursor cursor) {
        Table.Companion companion = Table.Companion;
        RequestResolveThread requestResolveThread = new RequestResolveThread(companion.cursorGetString(cursor, "COLUMN_MESSAGE_CORRELATION_ID"), companion.cursorGetLong(cursor, "COLUMN_SURVEY_HIDE_AFTER"), companion.cursorGetLong(cursor, "COLUMN_TIMESTAMP"), companion.cursorGetLong(cursor, "COLUMN_THREAD_ID"), companion.cursorGetBool(cursor, "COLUMN_IS_READ"));
        if (!companion.cursorGetBool(cursor, "COLUMN_DISPLAY_MESSAGE")) {
            return null;
        }
        return requestResolveThread;
    }

    private final ContentValues getRequestResolveThreadCV(RequestResolveThread requestResolveThread) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("COLUMN_MESSAGE_CORRELATION_ID", requestResolveThread.getUuid());
        contentValues.put("COLUMN_MESSAGE_TYPE", Integer.valueOf(MessageType.REQUEST_RESOLVE_THREAD.ordinal()));
        contentValues.put("COLUMN_SURVEY_HIDE_AFTER", Long.valueOf(requestResolveThread.getHideAfter()));
        contentValues.put("COLUMN_TIMESTAMP", Long.valueOf(requestResolveThread.getTimeStamp()));
        contentValues.put("COLUMN_THREAD_ID", requestResolveThread.getThreadId());
        contentValues.put("COLUMN_DISPLAY_MESSAGE", Boolean.TRUE);
        contentValues.put("COLUMN_IS_READ", Boolean.valueOf(requestResolveThread.isRead()));
        return contentValues;
    }

    private final ContentValues getSimpleSystemMessageCV(SimpleSystemMessage simpleSystemMessage) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("COLUMN_MESSAGE_CORRELATION_ID", simpleSystemMessage.getUuid());
        contentValues.put("COLUMN_MESSAGE_TYPE", Integer.valueOf(MessageType.SYSTEM_MESSAGE.ordinal()));
        contentValues.put("COLUMN_CONNECTION_TYPE", simpleSystemMessage.getType());
        contentValues.put("COLUMN_TIMESTAMP", Long.valueOf(simpleSystemMessage.getTimeStamp()));
        contentValues.put("COLUMN_PHRASE", simpleSystemMessage.getText());
        contentValues.put("COLUMN_THREAD_ID", simpleSystemMessage.getThreadId());
        return contentValues;
    }

    private final UserPhrase getUserPhrase(SQLiteOpenHelper sQLiteOpenHelper, Cursor cursor) {
        Table.Companion companion = Table.Companion;
        return new UserPhrase(companion.cursorGetString(cursor, "COLUMN_MESSAGE_CORRELATION_ID"), companion.cursorGetString(cursor, "COLUMN_PHRASE"), this.quotesTable.getQuote(sQLiteOpenHelper, companion.cursorGetString(cursor, "COLUMN_MESSAGE_CORRELATION_ID")), companion.cursorGetLong(cursor, "COLUMN_TIMESTAMP"), this.fileDescriptionTable.getFileDescription(sQLiteOpenHelper, companion.cursorGetString(cursor, "COLUMN_MESSAGE_CORRELATION_ID")), MessageStatus.Companion.fromOrdinal(companion.cursorGetInt(cursor, "COLUMN_MESSAGE_SEND_STATE")), Long.valueOf(companion.cursorGetLong(cursor, "COLUMN_THREAD_ID")));
    }

    private final ContentValues getUserPhraseCV(UserPhrase userPhrase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("COLUMN_MESSAGE_CORRELATION_ID", userPhrase.getId());
        contentValues.put("COLUMN_PHRASE", userPhrase.getPhraseText());
        contentValues.put("COLUMN_TIMESTAMP", Long.valueOf(userPhrase.getTimeStamp()));
        contentValues.put("COLUMN_MESSAGE_TYPE", Integer.valueOf(MessageType.USER_PHRASE.ordinal()));
        contentValues.put("COLUMN_MESSAGE_SEND_STATE", Integer.valueOf(userPhrase.getSentState().getValue()));
        contentValues.put("COLUMN_THREAD_ID", userPhrase.getThreadId());
        contentValues.put("COLUMN_MESSAGE_ID", userPhrase.getBackendMessageId());
        return contentValues;
    }

    private final void insertOrUpdateMessage(SQLiteOpenHelper sQLiteOpenHelper, ContentValues contentValues) {
        Cursor rawQuery = sQLiteOpenHelper.getReadableDatabase().rawQuery("select COLUMN_MESSAGE_CORRELATION_ID from TABLE_MESSAGES where COLUMN_MESSAGE_CORRELATION_ID = ?", new String[]{contentValues.getAsString("COLUMN_MESSAGE_CORRELATION_ID")});
        try {
            if (rawQuery.getCount() > 0) {
                sQLiteOpenHelper.getWritableDatabase().update("TABLE_MESSAGES", contentValues, "COLUMN_MESSAGE_CORRELATION_ID = ? ", new String[]{contentValues.getAsString("COLUMN_MESSAGE_CORRELATION_ID")});
            } else {
                sQLiteOpenHelper.getWritableDatabase().insert("TABLE_MESSAGES", null, contentValues);
            }
            aa1.a(rawQuery, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                aa1.a(rawQuery, th);
                throw th2;
            }
        }
    }

    private final void insertOrUpdateMessageByTimeStamp(SQLiteOpenHelper sQLiteOpenHelper, ContentValues contentValues) {
        Cursor rawQuery = sQLiteOpenHelper.getReadableDatabase().rawQuery("select COLUMN_MESSAGE_CORRELATION_ID from TABLE_MESSAGES where COLUMN_MESSAGE_CORRELATION_ID = ?", new String[]{contentValues.getAsString("COLUMN_MESSAGE_CORRELATION_ID")});
        try {
            if (rawQuery.getCount() > 0) {
                sQLiteOpenHelper.getWritableDatabase().update("TABLE_MESSAGES", contentValues, "COLUMN_TIMESTAMP = ? ", new String[]{contentValues.getAsString("COLUMN_MESSAGE_CORRELATION_ID")});
            } else {
                sQLiteOpenHelper.getWritableDatabase().insert("TABLE_MESSAGES", null, contentValues);
            }
            aa1.a(rawQuery, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                aa1.a(rawQuery, th);
                throw th2;
            }
        }
    }

    private final void insertOrUpdateSurvey(SQLiteOpenHelper sQLiteOpenHelper, Survey survey) {
        String valueOf = String.valueOf(survey.getSendingId());
        MessageType messageType = MessageType.SURVEY;
        String[] strArr = {valueOf, String.valueOf(messageType.ordinal())};
        ContentValues contentValues = new ContentValues();
        contentValues.put("COLUMN_MESSAGE_TYPE", Integer.valueOf(messageType.ordinal()));
        contentValues.put("COLUMN_MESSAGE_CORRELATION_ID", survey.getUuid());
        contentValues.put("COLUMN_SURVEY_SENDING_ID", Long.valueOf(survey.getSendingId()));
        contentValues.put("COLUMN_SURVEY_HIDE_AFTER", survey.getHideAfter());
        contentValues.put("COLUMN_TIMESTAMP", Long.valueOf(survey.getTimeStamp()));
        contentValues.put("COLUMN_MESSAGE_SEND_STATE", Integer.valueOf(survey.getSentState().getValue()));
        contentValues.put("COLUMN_DISPLAY_MESSAGE", Boolean.valueOf(survey.isDisplayMessage()));
        contentValues.put("COLUMN_IS_READ", Boolean.valueOf(survey.isRead()));
        if (survey.isRead()) {
            contentValues.put("COLUMN_MESSAGE_SEND_STATE", Integer.valueOf(MessageStatus.READ.getValue()));
        } else {
            contentValues.put("COLUMN_MESSAGE_SEND_STATE", Integer.valueOf(survey.getSentState().getValue()));
        }
        Cursor rawQuery = sQLiteOpenHelper.getReadableDatabase().rawQuery("select COLUMN_SURVEY_SENDING_ID from TABLE_MESSAGES where COLUMN_SURVEY_SENDING_ID = ? and COLUMN_MESSAGE_TYPE = ? ", strArr);
        try {
            if (rawQuery.getCount() > 0) {
                sQLiteOpenHelper.getWritableDatabase().update("TABLE_MESSAGES", contentValues, "COLUMN_SURVEY_SENDING_ID = ? ", new String[]{String.valueOf(survey.getSendingId())});
            } else {
                sQLiteOpenHelper.getWritableDatabase().insert("TABLE_MESSAGES", null, contentValues);
            }
            aa1.a(rawQuery, null);
            QuestionsTable questionsTable = this.questionsTable;
            ArrayList<QuestionDTO> questions = survey.getQuestions();
            if (questions == null) {
                questions = new ArrayList<>();
            }
            questionsTable.putQuestions(sQLiteOpenHelper, questions, survey.getSendingId());
        } finally {
        }
    }

    private final Uri isFileDownloaded(FileDescription fileDescription) {
        String incomingName = fileDescription.getIncomingName();
        if (incomingName == null || incomingName.length() == 0) {
            return null;
        }
        FileDownloader.Companion companion = FileDownloader.Companion;
        BaseConfig.Companion companion2 = BaseConfig.Companion;
        File file = new File(companion.getDownloadDir(companion2.getInstance().context), FileUtils.generateFileName(fileDescription));
        if (!file.exists()) {
            return null;
        }
        return new FileProvider().getUriForFile(companion2.getInstance().context, file);
    }

    private final String listToString(List<String> list) {
        if (list == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        String str = "";
        for (String str2 : list) {
            sb.append(str);
            sb.append(str2);
            str = ";";
        }
        return sb.toString();
    }

    private final void setProgressAndFileUri(FileDescription fileDescription, int i, Uri uri) {
        fileDescription.setDownloadProgress(i);
        fileDescription.setFileUri(uri);
    }

    private final List<String> stringToList(String str) {
        List<String> o;
        List<String> l;
        if (str == null) {
            l = kc1.l();
            return l;
        }
        String[] strArr = (String[]) new ec9(";").j(str, 0).toArray(new String[0]);
        o = kc1.o(Arrays.copyOf(strArr, strArr.length));
        return o;
    }

    @Override // im.threads.business.secureDatabase.table.Table
    public void cleanTable(SQLiteOpenHelper sQLiteOpenHelper) {
        z65.h(sQLiteOpenHelper, "sqlHelper");
        sQLiteOpenHelper.getWritableDatabase().execSQL("delete from TABLE_MESSAGES");
    }

    @Override // im.threads.business.secureDatabase.table.Table
    public void createTable(SQLiteDatabase sQLiteDatabase) {
        z65.h(sQLiteDatabase, "db");
        sQLiteDatabase.execSQL("create table TABLE_MESSAGES ( TABLE_ID integer primary key autoincrement, COLUMN_TIMESTAMP integer,  COLUMN_PHRASE text,  COLUMN_FORMATTED_PHRASE text,  COLUMN_MESSAGE_TYPE integer,  COLUMN_NAME text,  COLUMN_AVATAR_PATH text,  COLUMN_MESSAGE_CORRELATION_ID text,  COLUMN_MESSAGE_ID text,  COLUMN_SEX integer,  COLUMN_MESSAGE_SEND_STATE integer, COLUMN_CONSULT_ID text, COLUMN_CONSULT_STATUS text, COLUMN_CONSULT_TITLE text, COLUMN_CONSULT_ORG_UNIT text, COLUMN_CONSULT_ROLE text, COLUMN_CONNECTION_TYPE text, COLUMN_IS_READ integer, COLUMN_DISPLAY_MESSAGE integer, COLUMN_SURVEY_SENDING_ID integer, COLUMN_SURVEY_HIDE_AFTER integer, COLUMN_THREAD_ID integer, COLUMN_BLOCK_INPUT integer, COLUMN_SPEECH_STATUS text, COLUMN_MODIFICATION_STATE text, COLUMN_IS_PERSONAL_OFFER integer)");
    }

    public final ChatItem getChatItemByBackendMessageId(SQLiteOpenHelper sQLiteOpenHelper, String str) {
        z65.h(sQLiteOpenHelper, "sqlHelper");
        if (str == null) {
            return null;
        }
        Cursor rawQuery = sQLiteOpenHelper.getReadableDatabase().rawQuery("select * from TABLE_MESSAGES where COLUMN_MESSAGE_ID = '" + str + "' order by COLUMN_TIMESTAMP desc", null);
        try {
            if (rawQuery.moveToFirst()) {
                z65.g(rawQuery, c.a);
                ChatItem chatItemByCorrelationId = getChatItemByCorrelationId(sQLiteOpenHelper, rawQuery);
                aa1.a(rawQuery, null);
                return chatItemByCorrelationId;
            }
            Unit unit = Unit.a;
            aa1.a(rawQuery, null);
            return null;
        } finally {
        }
    }

    public final ChatItem getChatItemByCorrelationId(SQLiteOpenHelper sQLiteOpenHelper, String str) {
        z65.h(sQLiteOpenHelper, "sqlHelper");
        Cursor rawQuery = sQLiteOpenHelper.getReadableDatabase().rawQuery("select * from TABLE_MESSAGES where COLUMN_MESSAGE_CORRELATION_ID = ? order by COLUMN_TIMESTAMP desc", new String[]{str});
        try {
            if (rawQuery.moveToFirst()) {
                z65.g(rawQuery, c.a);
                ChatItem chatItemByCorrelationId = getChatItemByCorrelationId(sQLiteOpenHelper, rawQuery);
                aa1.a(rawQuery, null);
                return chatItemByCorrelationId;
            }
            Unit unit = Unit.a;
            aa1.a(rawQuery, null);
            return null;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                aa1.a(rawQuery, th);
                throw th2;
            }
        }
    }

    public final List<ChatItem> getChatItems(SQLiteOpenHelper sQLiteOpenHelper, int i, int i2) {
        z65.h(sQLiteOpenHelper, "sqlHelper");
        ArrayList arrayList = new ArrayList();
        pza pzaVar = pza.a;
        String format = String.format(Locale.US, "select * from (select * from %s order by %s desc limit %s offset %s) order by %s asc", Arrays.copyOf(new Object[]{"TABLE_MESSAGES", "COLUMN_TIMESTAMP", Integer.valueOf(i2), Integer.valueOf(i), "COLUMN_TIMESTAMP"}, 5));
        z65.g(format, "format(locale, format, *args)");
        Cursor rawQuery = sQLiteOpenHelper.getReadableDatabase().rawQuery(format, null);
        try {
            if (rawQuery.getCount() == 0) {
                aa1.a(rawQuery, null);
                return arrayList;
            }
            rawQuery.moveToFirst();
            while (!rawQuery.isAfterLast()) {
                z65.g(rawQuery, c.a);
                ChatItem chatItemByCorrelationId = getChatItemByCorrelationId(sQLiteOpenHelper, rawQuery);
                if (chatItemByCorrelationId != null) {
                    arrayList.add(chatItemByCorrelationId);
                }
                rawQuery.moveToNext();
            }
            Unit unit = Unit.a;
            aa1.a(rawQuery, null);
            return arrayList;
        } finally {
        }
    }

    public final ConsultInfo getLastConsultInfo(SQLiteOpenHelper sQLiteOpenHelper, String str) {
        z65.h(sQLiteOpenHelper, "sqlHelper");
        z65.h(str, "id");
        Cursor rawQuery = sQLiteOpenHelper.getReadableDatabase().rawQuery("select COLUMN_AVATAR_PATH, COLUMN_NAME, COLUMN_CONSULT_STATUS from TABLE_MESSAGES where COLUMN_CONSULT_ID =  ?  order by COLUMN_TIMESTAMP desc", new String[]{str});
        try {
            if (rawQuery.moveToFirst()) {
                Table.Companion companion = Table.Companion;
                z65.g(rawQuery, c.a);
                ConsultInfo consultInfo = new ConsultInfo(companion.cursorGetString(rawQuery, "COLUMN_NAME"), str, companion.cursorGetString(rawQuery, "COLUMN_CONSULT_STATUS"), companion.cursorGetString(rawQuery, "COLUMN_CONSULT_ORG_UNIT"), companion.cursorGetString(rawQuery, "COLUMN_AVATAR_PATH"), companion.cursorGetString(rawQuery, "COLUMN_CONSULT_ROLE"));
                aa1.a(rawQuery, null);
                return consultInfo;
            }
            Unit unit = Unit.a;
            aa1.a(rawQuery, null);
            return null;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                aa1.a(rawQuery, th);
                throw th2;
            }
        }
    }

    public final ConsultPhrase getLastConsultPhrase(SQLiteOpenHelper sQLiteOpenHelper) {
        z65.h(sQLiteOpenHelper, "sqlHelper");
        int ordinal = MessageType.CONSULT_PHRASE.ordinal();
        Cursor rawQuery = sQLiteOpenHelper.getReadableDatabase().rawQuery("select * from TABLE_MESSAGES where COLUMN_MESSAGE_TYPE = " + ordinal + " order by COLUMN_TIMESTAMP desc", new String[0]);
        try {
            if (rawQuery.moveToFirst()) {
                z65.g(rawQuery, c.a);
                ConsultPhrase consultPhrase = getConsultPhrase(sQLiteOpenHelper, rawQuery);
                aa1.a(rawQuery, null);
                return consultPhrase;
            }
            Unit unit = Unit.a;
            aa1.a(rawQuery, null);
            return null;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                aa1.a(rawQuery, th);
                throw th2;
            }
        }
    }

    public final int getMessagesCount(SQLiteOpenHelper sQLiteOpenHelper) {
        z65.h(sQLiteOpenHelper, "sqlHelper");
        SQLiteDatabase readableDatabase = sQLiteOpenHelper.getReadableDatabase();
        pza pzaVar = pza.a;
        String format = String.format(Locale.US, "select count(%s) from %s", Arrays.copyOf(new Object[]{"TABLE_ID", "TABLE_MESSAGES"}, 2));
        z65.g(format, "format(locale, format, *args)");
        Cursor rawQuery = readableDatabase.rawQuery(format, null);
        try {
            if (rawQuery.getCount() == 0) {
                aa1.a(rawQuery, null);
                return 0;
            }
            rawQuery.moveToFirst();
            int i = rawQuery.getInt(0);
            aa1.a(rawQuery, null);
            return i;
        } finally {
        }
    }

    public final List<UserPhrase> getNotDeliveredChatItems(SQLiteOpenHelper sQLiteOpenHelper) {
        z65.h(sQLiteOpenHelper, "sqlHelper");
        ArrayList arrayList = new ArrayList();
        int value = MessageStatus.DELIVERED.getValue();
        Cursor rawQuery = sQLiteOpenHelper.getReadableDatabase().rawQuery("select * from (select * from TABLE_MESSAGES  where COLUMN_MESSAGE_SEND_STATE < " + value + " order by COLUMN_TIMESTAMP desc) order by COLUMN_TIMESTAMP asc", new String[0]);
        try {
            if (rawQuery.moveToFirst()) {
                while (!rawQuery.isAfterLast()) {
                    z65.g(rawQuery, c.a);
                    arrayList.add(getUserPhrase(sQLiteOpenHelper, rawQuery));
                    rawQuery.moveToNext();
                }
            }
            Unit unit = Unit.a;
            aa1.a(rawQuery, null);
            return arrayList;
        } finally {
        }
    }

    public final List<UserPhrase> getSendingChatItems(SQLiteOpenHelper sQLiteOpenHelper) {
        z65.h(sQLiteOpenHelper, "sqlHelper");
        ArrayList arrayList = new ArrayList();
        pza pzaVar = pza.a;
        Locale locale = Locale.US;
        int value = MessageStatus.SENDING.getValue();
        String format = String.format(locale, "select * from (select * from %s  where COLUMN_MESSAGE_SEND_STATE = " + value + " order by %s desc) order by %s asc", Arrays.copyOf(new Object[]{"TABLE_MESSAGES", "COLUMN_TIMESTAMP", "COLUMN_TIMESTAMP"}, 3));
        z65.g(format, "format(locale, format, *args)");
        Cursor rawQuery = sQLiteOpenHelper.getReadableDatabase().rawQuery(format, new String[0]);
        try {
            if (rawQuery.moveToFirst()) {
                while (!rawQuery.isAfterLast()) {
                    z65.g(rawQuery, c.a);
                    arrayList.add(getUserPhrase(sQLiteOpenHelper, rawQuery));
                    rawQuery.moveToNext();
                }
            }
            Unit unit = Unit.a;
            aa1.a(rawQuery, null);
            return arrayList;
        } finally {
        }
    }

    public final Survey getSurvey(SQLiteOpenHelper sQLiteOpenHelper, long j) {
        z65.h(sQLiteOpenHelper, "sqlHelper");
        Cursor rawQuery = sQLiteOpenHelper.getReadableDatabase().rawQuery("select * from TABLE_MESSAGES where COLUMN_SURVEY_SENDING_ID = ? order by COLUMN_TIMESTAMP desc", new String[]{String.valueOf(j)});
        try {
            if (rawQuery.moveToFirst()) {
                z65.g(rawQuery, c.a);
                Survey survey = getSurvey(sQLiteOpenHelper, rawQuery);
                aa1.a(rawQuery, null);
                return survey;
            }
            Unit unit = Unit.a;
            aa1.a(rawQuery, null);
            return null;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                aa1.a(rawQuery, th);
                throw th2;
            }
        }
    }

    public final int getUnreadMessagesCount(SQLiteOpenHelper sQLiteOpenHelper) {
        z65.h(sQLiteOpenHelper, "sqlHelper");
        int ordinal = MessageType.CONSULT_PHRASE.ordinal();
        int ordinal2 = MessageType.SURVEY.ordinal();
        int value = MessageStatus.FAILED.getValue();
        int ordinal3 = MessageType.REQUEST_RESOLVE_THREAD.ordinal();
        Cursor rawQuery = sQLiteOpenHelper.getReadableDatabase().rawQuery("select COLUMN_MESSAGE_CORRELATION_ID from TABLE_MESSAGES where (COLUMN_MESSAGE_TYPE = " + ordinal + " or (COLUMN_MESSAGE_TYPE = " + ordinal2 + " and COLUMN_MESSAGE_SEND_STATE = " + value + ") or COLUMN_MESSAGE_TYPE = " + ordinal3 + ") and COLUMN_IS_READ = 0 order by COLUMN_TIMESTAMP asc", null);
        try {
            int count = rawQuery.getCount();
            aa1.a(rawQuery, null);
            return count;
        } finally {
        }
    }

    public final List<String> getUnreadMessagesUuid(SQLiteOpenHelper sQLiteOpenHelper) {
        z65.h(sQLiteOpenHelper, "sqlHelper");
        String str = "select COLUMN_MESSAGE_CORRELATION_ID from TABLE_MESSAGES where (COLUMN_MESSAGE_TYPE = " + MessageType.CONSULT_PHRASE.ordinal() + " or (COLUMN_MESSAGE_TYPE = " + MessageType.SURVEY.ordinal() + " and COLUMN_MESSAGE_SEND_STATE = " + MessageStatus.FAILED.getValue() + ") or COLUMN_MESSAGE_TYPE = " + MessageType.REQUEST_RESOLVE_THREAD.ordinal() + ") and COLUMN_IS_READ = 0 order by COLUMN_TIMESTAMP asc";
        HashSet hashSet = new HashSet();
        Cursor rawQuery = sQLiteOpenHelper.getReadableDatabase().rawQuery(str, null);
        try {
            rawQuery.moveToFirst();
            while (!rawQuery.isAfterLast()) {
                Table.Companion companion = Table.Companion;
                z65.g(rawQuery, c.a);
                hashSet.add(companion.cursorGetString(rawQuery, "COLUMN_MESSAGE_CORRELATION_ID"));
                rawQuery.moveToNext();
            }
            Unit unit = Unit.a;
            aa1.a(rawQuery, null);
            return new ArrayList(hashSet);
        } finally {
        }
    }

    public final List<UserPhrase> getUnsentUserPhrase(SQLiteOpenHelper sQLiteOpenHelper, int i) {
        z65.h(sQLiteOpenHelper, "sqlHelper");
        ArrayList arrayList = new ArrayList();
        for (ChatItem chatItem : getChatItems(sQLiteOpenHelper, 0, i)) {
            if ((chatItem instanceof UserPhrase) && ((UserPhrase) chatItem).getSentState() == MessageStatus.FAILED) {
                arrayList.add(chatItem);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:86:0x0174, code lost:
        if (r5 == null) goto L85;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean putChatItem(android.database.sqlite.SQLiteOpenHelper r10, im.threads.business.models.ChatItem r11) {
        /*
            Method dump skipped, instructions count: 444
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: im.threads.business.secureDatabase.table.MessagesTable.putChatItem(android.database.sqlite.SQLiteOpenHelper, im.threads.business.models.ChatItem):boolean");
    }

    public final void putChatItems(SQLiteOpenHelper sQLiteOpenHelper, List<? extends ChatItem> list) {
        z65.h(sQLiteOpenHelper, "sqlHelper");
        try {
            try {
                sQLiteOpenHelper.getWritableDatabase().beginTransaction();
                if (list != null) {
                    for (ChatItem chatItem : list) {
                        putChatItem(sQLiteOpenHelper, chatItem);
                    }
                }
                sQLiteOpenHelper.getWritableDatabase().setTransactionSuccessful();
            } catch (Exception e) {
                LoggerEdna.error("putMessagesSync", e);
            }
            sQLiteOpenHelper.getWritableDatabase().endTransaction();
        } catch (Throwable th) {
            sQLiteOpenHelper.getWritableDatabase().endTransaction();
            throw th;
        }
    }

    public final void removeItem(SQLiteOpenHelper sQLiteOpenHelper, String str, String str2) {
        z65.h(sQLiteOpenHelper, "sqlHelper");
        if (str != null) {
            SQLiteDatabase writableDatabase = sQLiteOpenHelper.getWritableDatabase();
            if (writableDatabase.delete("TABLE_MESSAGES", "COLUMN_MESSAGE_CORRELATION_ID = '" + str + "'", null) != 0) {
                return;
            }
        }
        if (str2 != null) {
            SQLiteDatabase writableDatabase2 = sQLiteOpenHelper.getWritableDatabase();
            writableDatabase2.delete("TABLE_MESSAGES", "COLUMN_MESSAGE_ID = '" + str2 + "'", null);
        }
    }

    public final int setAllMessagesWereRead(SQLiteOpenHelper sQLiteOpenHelper) {
        z65.h(sQLiteOpenHelper, "sqlHelper");
        ContentValues contentValues = new ContentValues();
        contentValues.put("COLUMN_IS_READ", Boolean.TRUE);
        int ordinal = MessageType.CONSULT_PHRASE.ordinal();
        int ordinal2 = MessageType.SURVEY.ordinal();
        int value = MessageStatus.FAILED.getValue();
        int ordinal3 = MessageType.REQUEST_RESOLVE_THREAD.ordinal();
        return sQLiteOpenHelper.getWritableDatabase().update("TABLE_MESSAGES", contentValues, "(COLUMN_MESSAGE_TYPE = " + ordinal + " or (COLUMN_MESSAGE_TYPE = " + ordinal2 + " and COLUMN_MESSAGE_SEND_STATE = " + value + ") or COLUMN_MESSAGE_TYPE = " + ordinal3 + ") and COLUMN_IS_READ = 0", null);
    }

    public final int setAllMessagesWereReadInThread(SQLiteOpenHelper sQLiteOpenHelper, long j) {
        z65.h(sQLiteOpenHelper, "sqlHelper");
        ContentValues contentValues = new ContentValues();
        contentValues.put("COLUMN_IS_READ", Boolean.TRUE);
        int ordinal = MessageType.CONSULT_PHRASE.ordinal();
        int ordinal2 = MessageType.SURVEY.ordinal();
        int value = MessageStatus.FAILED.getValue();
        int ordinal3 = MessageType.REQUEST_RESOLVE_THREAD.ordinal();
        return sQLiteOpenHelper.getWritableDatabase().update("TABLE_MESSAGES", contentValues, "(COLUMN_MESSAGE_TYPE = " + ordinal + " or (COLUMN_MESSAGE_TYPE = " + ordinal2 + " and COLUMN_MESSAGE_SEND_STATE = " + value + ") or COLUMN_MESSAGE_TYPE = " + ordinal3 + ") and COLUMN_IS_READ = 0 and COLUMN_THREAD_ID = " + j, null);
    }

    public final void setMessageWasRead(SQLiteOpenHelper sQLiteOpenHelper, String str) {
        z65.h(sQLiteOpenHelper, "sqlHelper");
        z65.h(str, MessageAttributes.UUID);
        ContentValues contentValues = new ContentValues();
        contentValues.put("COLUMN_IS_READ", Boolean.TRUE);
        sQLiteOpenHelper.getWritableDatabase().update("TABLE_MESSAGES", contentValues, "COLUMN_MESSAGE_CORRELATION_ID = ?  and COLUMN_IS_READ = 0", new String[]{str});
    }

    public final int setNotSentSurveyDisplayMessageToFalse(SQLiteOpenHelper sQLiteOpenHelper) {
        z65.h(sQLiteOpenHelper, "sqlHelper");
        ContentValues contentValues = new ContentValues();
        contentValues.put("COLUMN_DISPLAY_MESSAGE", Boolean.FALSE);
        int ordinal = MessageType.SURVEY.ordinal();
        int value = MessageStatus.FAILED.getValue();
        return sQLiteOpenHelper.getWritableDatabase().update("TABLE_MESSAGES", contentValues, "COLUMN_MESSAGE_TYPE = " + ordinal + " and COLUMN_MESSAGE_SEND_STATE = " + value, null);
    }

    public final int setOldRequestResolveThreadDisplayMessageToFalse(SQLiteOpenHelper sQLiteOpenHelper) {
        z65.h(sQLiteOpenHelper, "sqlHelper");
        ContentValues contentValues = new ContentValues();
        contentValues.put("COLUMN_DISPLAY_MESSAGE", Boolean.FALSE);
        int ordinal = MessageType.REQUEST_RESOLVE_THREAD.ordinal();
        return sQLiteOpenHelper.getWritableDatabase().update("TABLE_MESSAGES", contentValues, "COLUMN_MESSAGE_TYPE = " + ordinal, null);
    }

    public final void setOrUpdateMessageId(SQLiteOpenHelper sQLiteOpenHelper, String str, String str2) {
        List y0;
        String str3;
        z65.h(sQLiteOpenHelper, "sqlHelper");
        if (str != null && str2 != null) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("COLUMN_MESSAGE_ID", str2);
            y0 = m0b.y0(str, new String[]{":"}, false, 0, 6, null);
            if (y0.size() > 1) {
                str3 = (String) y0.get(1);
            } else {
                str3 = (String) y0.get(0);
            }
            sQLiteOpenHelper.getWritableDatabase().update("TABLE_MESSAGES", contentValues, "COLUMN_MESSAGE_CORRELATION_ID = '" + str3 + "'", null);
        }
    }

    public final void setUserPhraseStateByBackendMessageId(SQLiteOpenHelper sQLiteOpenHelper, String str, MessageStatus messageStatus) {
        Integer num;
        z65.h(sQLiteOpenHelper, "sqlHelper");
        ContentValues contentValues = new ContentValues();
        if (messageStatus != null) {
            num = Integer.valueOf(messageStatus.getValue());
        } else {
            num = null;
        }
        contentValues.put("COLUMN_MESSAGE_SEND_STATE", num);
        sQLiteOpenHelper.getWritableDatabase().update("TABLE_MESSAGES", contentValues, "COLUMN_MESSAGE_ID = ?", new String[]{str});
    }

    public final void setUserPhraseStateByCorrelationId(SQLiteOpenHelper sQLiteOpenHelper, String str, MessageStatus messageStatus) {
        Integer num;
        z65.h(sQLiteOpenHelper, "sqlHelper");
        ContentValues contentValues = new ContentValues();
        if (messageStatus != null) {
            num = Integer.valueOf(messageStatus.getValue());
        } else {
            num = null;
        }
        contentValues.put("COLUMN_MESSAGE_SEND_STATE", num);
        sQLiteOpenHelper.getWritableDatabase().update("TABLE_MESSAGES", contentValues, "COLUMN_MESSAGE_CORRELATION_ID = ?", new String[]{str});
    }

    public final void speechMessageUpdated(SQLiteOpenHelper sQLiteOpenHelper, SpeechMessageUpdate speechMessageUpdate) {
        z65.h(sQLiteOpenHelper, "sqlHelper");
        z65.h(speechMessageUpdate, "speechMessageUpdate");
        ContentValues contentValues = new ContentValues();
        String uuid = speechMessageUpdate.getUuid();
        contentValues.put("COLUMN_SPEECH_STATUS", speechMessageUpdate.getSpeechStatus().toString());
        this.fileDescriptionTable.putFileDescription(sQLiteOpenHelper, speechMessageUpdate.getFileDescription(), speechMessageUpdate.getUuid(), false);
        sQLiteOpenHelper.getWritableDatabase().update("TABLE_MESSAGES", contentValues, "COLUMN_MESSAGE_CORRELATION_ID = ?", new String[]{uuid});
    }

    public final void updateChatItemByTimeStamp(SQLiteOpenHelper sQLiteOpenHelper, ChatItem chatItem) {
        Quote quote;
        z65.h(sQLiteOpenHelper, "sqlHelper");
        z65.h(chatItem, "chatItem");
        if (chatItem instanceof UserPhrase) {
            UserPhrase userPhrase = (UserPhrase) chatItem;
            insertOrUpdateMessageByTimeStamp(sQLiteOpenHelper, getUserPhraseCV(userPhrase));
            FileDescription fileDescription = userPhrase.getFileDescription();
            if (fileDescription != null) {
                Uri isFileDownloaded = isFileDownloaded(fileDescription);
                if (isFileDownloaded != null) {
                    setProgressAndFileUri(fileDescription, 100, isFileDownloaded);
                }
                FileDescriptionsTable fileDescriptionsTable = this.fileDescriptionTable;
                String id = userPhrase.getId();
                if (id == null) {
                    id = "";
                }
                fileDescriptionsTable.putFileDescription(sQLiteOpenHelper, fileDescription, id, false);
            }
            String id2 = userPhrase.getId();
            if (id2 != null && (quote = userPhrase.getQuote()) != null) {
                this.quotesTable.putQuote(sQLiteOpenHelper, id2, quote);
            }
        }
    }

    @Override // im.threads.business.secureDatabase.table.Table
    public void upgradeTable(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        z65.h(sQLiteDatabase, "db");
        if (i < i2) {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS TABLE_MESSAGES");
        }
    }

    private final ChatItem getChatItemByCorrelationId(SQLiteOpenHelper sQLiteOpenHelper, Cursor cursor) {
        Table.Companion companion = Table.Companion;
        int cursorGetInt = companion.cursorGetInt(cursor, "COLUMN_MESSAGE_TYPE");
        if (cursorGetInt == MessageType.CONSULT_CONNECTED.ordinal()) {
            return new ConsultConnectionMessage(companion.cursorGetString(cursor, "COLUMN_MESSAGE_CORRELATION_ID"), companion.cursorGetString(cursor, "COLUMN_CONSULT_ID"), companion.cursorGetString(cursor, "COLUMN_CONNECTION_TYPE"), companion.cursorGetString(cursor, "COLUMN_NAME"), companion.cursorGetBool(cursor, "COLUMN_SEX"), companion.cursorGetLong(cursor, "COLUMN_TIMESTAMP"), companion.cursorGetString(cursor, "COLUMN_AVATAR_PATH"), companion.cursorGetString(cursor, "COLUMN_CONSULT_STATUS"), companion.cursorGetString(cursor, "COLUMN_CONSULT_TITLE"), companion.cursorGetString(cursor, "COLUMN_CONSULT_ORG_UNIT"), companion.cursorGetString(cursor, "COLUMN_CONSULT_ROLE"), companion.cursorGetBool(cursor, "COLUMN_DISPLAY_MESSAGE"), companion.cursorGetString(cursor, "COLUMN_PHRASE"), companion.cursorGetLong(cursor, "COLUMN_THREAD_ID"));
        }
        if (cursorGetInt == MessageType.SYSTEM_MESSAGE.ordinal()) {
            return new SimpleSystemMessage(companion.cursorGetString(cursor, "COLUMN_MESSAGE_CORRELATION_ID"), companion.cursorGetString(cursor, "COLUMN_CONNECTION_TYPE"), companion.cursorGetLong(cursor, "COLUMN_TIMESTAMP"), companion.cursorGetString(cursor, "COLUMN_PHRASE"), companion.cursorGetLong(cursor, "COLUMN_THREAD_ID"));
        }
        if (cursorGetInt == MessageType.CONSULT_PHRASE.ordinal()) {
            return getConsultPhrase(sQLiteOpenHelper, cursor);
        }
        if (cursorGetInt == MessageType.USER_PHRASE.ordinal()) {
            return getUserPhrase(sQLiteOpenHelper, cursor);
        }
        if (cursorGetInt == MessageType.SURVEY.ordinal()) {
            return getSurvey(sQLiteOpenHelper, cursor);
        }
        if (cursorGetInt == MessageType.REQUEST_RESOLVE_THREAD.ordinal()) {
            return getRequestResolveThread(cursor);
        }
        return null;
    }

    private final void setOldRequestResolveThreadDisplayMessageToFalse(SQLiteOpenHelper sQLiteOpenHelper, String str) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("COLUMN_DISPLAY_MESSAGE", Boolean.FALSE);
        int ordinal = MessageType.REQUEST_RESOLVE_THREAD.ordinal();
        sQLiteOpenHelper.getWritableDatabase().update("TABLE_MESSAGES", contentValues, "COLUMN_MESSAGE_TYPE = " + ordinal + " and COLUMN_MESSAGE_CORRELATION_ID != ?", new String[]{str});
    }

    private final Survey getSurvey(SQLiteOpenHelper sQLiteOpenHelper, Cursor cursor) {
        Table.Companion companion = Table.Companion;
        long cursorGetLong = companion.cursorGetLong(cursor, "COLUMN_SURVEY_SENDING_ID");
        Survey survey = new Survey(companion.cursorGetString(cursor, "COLUMN_MESSAGE_CORRELATION_ID"), cursorGetLong, Long.valueOf(companion.cursorGetLong(cursor, "COLUMN_SURVEY_HIDE_AFTER")), companion.cursorGetLong(cursor, "COLUMN_TIMESTAMP"), MessageStatus.Companion.fromOrdinal(companion.cursorGetInt(cursor, "COLUMN_MESSAGE_SEND_STATE")), companion.cursorGetBool(cursor, "COLUMN_IS_READ"), companion.cursorGetBool(cursor, "COLUMN_DISPLAY_MESSAGE"));
        survey.setQuestions(new ArrayList<>(this.questionsTable.getQuestions(sQLiteOpenHelper, cursorGetLong)));
        return survey;
    }

    private final void setNotSentSurveyDisplayMessageToFalse(SQLiteOpenHelper sQLiteOpenHelper, long j) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("COLUMN_DISPLAY_MESSAGE", Boolean.FALSE);
        int ordinal = MessageType.SURVEY.ordinal();
        int value = MessageStatus.FAILED.getValue();
        sQLiteOpenHelper.getWritableDatabase().update("TABLE_MESSAGES", contentValues, "COLUMN_MESSAGE_TYPE = " + ordinal + " and COLUMN_MESSAGE_SEND_STATE = " + value + " and COLUMN_SURVEY_SENDING_ID != ?", new String[]{String.valueOf(j)});
    }
}
