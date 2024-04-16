package im.threads.business.database.table;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.huawei.hms.opendevice.c;
import im.threads.business.database.table.Table;
import im.threads.business.formatters.SpeechStatus;
import im.threads.business.models.ChatItem;
import im.threads.business.models.ConsultConnectionMessage;
import im.threads.business.models.ConsultPhrase;
import im.threads.business.models.ConsultRole;
import im.threads.business.models.MessageStatus;
import im.threads.business.models.RequestResolveThread;
import im.threads.business.models.SimpleSystemMessage;
import im.threads.business.models.Survey;
import im.threads.business.models.UserPhrase;
import im.threads.business.models.enums.ModificationStateEnum;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: MessagesTable.kt */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 &2\u00020\u0001:\u0002&'B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u001a\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J$\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u00172\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0019J\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0018\u0010\u001f\u001a\u00020 2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0018\u0010!\u001a\u00020\"2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J \u0010#\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010$\u001a\u00020\u00192\u0006\u0010%\u001a\u00020\u0019H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lim/threads/business/database/table/MessagesTable;", "Lim/threads/business/database/table/Table;", "fileDescriptionTable", "Lim/threads/business/database/table/FileDescriptionsTable;", "quotesTable", "Lim/threads/business/database/table/QuotesTable;", "quickRepliesTable", "Lim/threads/business/database/table/QuickRepliesTable;", "questionsTable", "Lim/threads/business/database/table/QuestionsTable;", "(Lim/threads/business/database/table/FileDescriptionsTable;Lim/threads/business/database/table/QuotesTable;Lim/threads/business/database/table/QuickRepliesTable;Lim/threads/business/database/table/QuestionsTable;)V", "cleanTable", "", "sqlHelper", "Landroid/database/sqlite/SQLiteOpenHelper;", "createTable", "db", "Landroid/database/sqlite/SQLiteDatabase;", "getChatItem", "Lim/threads/business/models/ChatItem;", c.a, "Landroid/database/Cursor;", "getChatItems", "", "offset", "", "limit", "getConsultPhrase", "Lim/threads/business/models/ConsultPhrase;", "getRequestResolveThread", "Lim/threads/business/models/RequestResolveThread;", "getSurvey", "Lim/threads/business/models/Survey;", "getUserPhrase", "Lim/threads/business/models/UserPhrase;", "upgradeTable", "oldVersion", "newVersion", "Companion", "MessageType", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MessagesTable extends Table {
    private static final String COLUMN_AVATAR_PATH = "COLUMN_AVATAR_PATH";
    private static final String COLUMN_BLOCK_INPUT = "COLUMN_BLOCK_INPUT";
    private static final String COLUMN_CONNECTION_TYPE = "COLUMN_CONNECTION_TYPE";
    private static final String COLUMN_CONSULT_ID = "COLUMN_CONSULT_ID";
    private static final String COLUMN_CONSULT_ORG_UNIT = "COLUMN_CONSULT_ORG_UNIT";
    private static final String COLUMN_CONSULT_STATUS = "COLUMN_CONSULT_STATUS";
    private static final String COLUMN_CONSULT_TITLE = "COLUMN_CONSULT_TITLE";
    private static final String COLUMN_DISPLAY_MESSAGE = "COLUMN_DISPLAY_MESSAGE";
    private static final String COLUMN_FORMATTED_PHRASE = "COLUMN_FORMATTED_PHRASE";
    private static final String COLUMN_IS_READ = "COLUMN_IS_READ";
    private static final String COLUMN_MESSAGE_SEND_STATE = "COLUMN_MESSAGE_SEND_STATE";
    private static final String COLUMN_MESSAGE_TYPE = "COLUMN_MESSAGE_TYPE";
    private static final String COLUMN_MESSAGE_UUID = "COLUMN_MESSAGE_UUID";
    private static final String COLUMN_MODIFICATION_STATE = "COLUMN_MODIFICATION_STATE";
    private static final String COLUMN_NAME = "COLUMN_NAME";
    private static final String COLUMN_PHRASE = "COLUMN_PHRASE";
    private static final String COLUMN_ROLE = "COLUMN_ROLE";
    private static final String COLUMN_SEX = "COLUMN_SEX";
    private static final String COLUMN_SPEECH_STATUS = "COLUMN_SPEECH_STATUS";
    private static final String COLUMN_SURVEY_HIDE_AFTER = "COLUMN_SURVEY_HIDE_AFTER";
    private static final String COLUMN_SURVEY_SENDING_ID = "COLUMN_SURVEY_SENDING_ID";
    private static final String COLUMN_TABLE_ID = "TABLE_ID";
    private static final String COLUMN_THREAD_ID = "COLUMN_THREAD_ID";
    private static final String COLUMN_TIMESTAMP = "COLUMN_TIMESTAMP";
    public static final Companion Companion = new Companion(null);
    private static final String TABLE_MESSAGES = "TABLE_MESSAGES";
    private final FileDescriptionsTable fileDescriptionTable;
    private final QuestionsTable questionsTable;
    private final QuickRepliesTable quickRepliesTable;
    private final QuotesTable quotesTable;

    /* compiled from: MessagesTable.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0019\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lim/threads/business/database/table/MessagesTable$Companion;", "", "()V", MessagesTable.COLUMN_AVATAR_PATH, "", MessagesTable.COLUMN_BLOCK_INPUT, MessagesTable.COLUMN_CONNECTION_TYPE, MessagesTable.COLUMN_CONSULT_ID, MessagesTable.COLUMN_CONSULT_ORG_UNIT, MessagesTable.COLUMN_CONSULT_STATUS, MessagesTable.COLUMN_CONSULT_TITLE, MessagesTable.COLUMN_DISPLAY_MESSAGE, MessagesTable.COLUMN_FORMATTED_PHRASE, MessagesTable.COLUMN_IS_READ, MessagesTable.COLUMN_MESSAGE_SEND_STATE, MessagesTable.COLUMN_MESSAGE_TYPE, MessagesTable.COLUMN_MESSAGE_UUID, MessagesTable.COLUMN_MODIFICATION_STATE, MessagesTable.COLUMN_NAME, MessagesTable.COLUMN_PHRASE, MessagesTable.COLUMN_ROLE, MessagesTable.COLUMN_SEX, MessagesTable.COLUMN_SPEECH_STATUS, MessagesTable.COLUMN_SURVEY_HIDE_AFTER, MessagesTable.COLUMN_SURVEY_SENDING_ID, "COLUMN_TABLE_ID", MessagesTable.COLUMN_THREAD_ID, MessagesTable.COLUMN_TIMESTAMP, MessagesTable.TABLE_MESSAGES, "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: MessagesTable.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lim/threads/business/database/table/MessagesTable$MessageType;", "", "(Ljava/lang/String;I)V", GrsBaseInfo.CountryCodeSource.UNKNOWN, "CONSULT_CONNECTED", "SYSTEM_MESSAGE", "CONSULT_PHRASE", "USER_PHRASE", "SURVEY", "REQUEST_RESOLVE_THREAD", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
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

    private final ChatItem getChatItem(SQLiteOpenHelper sQLiteOpenHelper, Cursor cursor) {
        Table.Companion companion = Table.Companion;
        int cGetInt = companion.cGetInt(cursor, COLUMN_MESSAGE_TYPE);
        if (cGetInt == MessageType.CONSULT_CONNECTED.ordinal()) {
            return new ConsultConnectionMessage(companion.cGetString(cursor, COLUMN_MESSAGE_UUID), companion.cGetString(cursor, COLUMN_CONSULT_ID), companion.cGetString(cursor, COLUMN_CONNECTION_TYPE), companion.cGetString(cursor, COLUMN_NAME), companion.cGetBool(cursor, COLUMN_SEX), companion.cGetLong(cursor, COLUMN_TIMESTAMP), companion.cGetString(cursor, COLUMN_AVATAR_PATH), companion.cGetString(cursor, COLUMN_CONSULT_STATUS), companion.cGetString(cursor, COLUMN_CONSULT_TITLE), companion.cGetString(cursor, COLUMN_CONSULT_ORG_UNIT), companion.cGetBool(cursor, COLUMN_DISPLAY_MESSAGE), companion.cGetString(cursor, COLUMN_PHRASE), companion.cGetLong(cursor, COLUMN_THREAD_ID));
        }
        if (cGetInt == MessageType.SYSTEM_MESSAGE.ordinal()) {
            return new SimpleSystemMessage(companion.cGetString(cursor, COLUMN_MESSAGE_UUID), companion.cGetString(cursor, COLUMN_CONNECTION_TYPE), companion.cGetLong(cursor, COLUMN_TIMESTAMP), companion.cGetString(cursor, COLUMN_PHRASE), companion.cGetLong(cursor, COLUMN_THREAD_ID));
        }
        if (cGetInt == MessageType.CONSULT_PHRASE.ordinal()) {
            return getConsultPhrase(sQLiteOpenHelper, cursor);
        }
        if (cGetInt == MessageType.USER_PHRASE.ordinal()) {
            return getUserPhrase(sQLiteOpenHelper, cursor);
        }
        if (cGetInt == MessageType.SURVEY.ordinal()) {
            return getSurvey(sQLiteOpenHelper, cursor);
        }
        if (cGetInt == MessageType.REQUEST_RESOLVE_THREAD.ordinal()) {
            return getRequestResolveThread(cursor);
        }
        return null;
    }

    private final ConsultPhrase getConsultPhrase(SQLiteOpenHelper sQLiteOpenHelper, Cursor cursor) {
        Table.Companion companion = Table.Companion;
        return new ConsultPhrase(companion.cGetString(cursor, COLUMN_MESSAGE_UUID), this.fileDescriptionTable.getFileDescription(sQLiteOpenHelper, companion.cGetString(cursor, COLUMN_MESSAGE_UUID)), ModificationStateEnum.Companion.fromString(companion.cGetString(cursor, COLUMN_MODIFICATION_STATE)), this.quotesTable.getQuote(sQLiteOpenHelper, companion.cGetString(cursor, COLUMN_MESSAGE_UUID)), companion.cGetString(cursor, COLUMN_NAME), companion.cGetString(cursor, COLUMN_PHRASE), companion.cGetString(cursor, COLUMN_FORMATTED_PHRASE), companion.cGetLong(cursor, COLUMN_TIMESTAMP), companion.cGetString(cursor, COLUMN_CONSULT_ID), companion.cGetString(cursor, COLUMN_AVATAR_PATH), companion.cGetBool(cursor, COLUMN_IS_READ), companion.cGetString(cursor, COLUMN_CONSULT_STATUS), companion.cGetBool(cursor, COLUMN_SEX), Long.valueOf(companion.cGetLong(cursor, COLUMN_THREAD_ID)), this.quickRepliesTable.getQuickReplies(sQLiteOpenHelper, companion.cGetString(cursor, COLUMN_MESSAGE_UUID)), Boolean.valueOf(companion.cGetBool(cursor, COLUMN_BLOCK_INPUT)), SpeechStatus.Companion.fromString(companion.cGetString(cursor, COLUMN_SPEECH_STATUS)), ConsultRole.Companion.consultRoleFromString(companion.cGetString(cursor, COLUMN_ROLE)), false, 262144, null);
    }

    private final RequestResolveThread getRequestResolveThread(Cursor cursor) {
        Table.Companion companion = Table.Companion;
        RequestResolveThread requestResolveThread = new RequestResolveThread(companion.cGetString(cursor, COLUMN_MESSAGE_UUID), companion.cGetLong(cursor, COLUMN_SURVEY_HIDE_AFTER), companion.cGetLong(cursor, COLUMN_TIMESTAMP), companion.cGetLong(cursor, COLUMN_THREAD_ID), companion.cGetBool(cursor, COLUMN_IS_READ));
        if (!companion.cGetBool(cursor, COLUMN_DISPLAY_MESSAGE)) {
            return null;
        }
        return requestResolveThread;
    }

    private final Survey getSurvey(SQLiteOpenHelper sQLiteOpenHelper, Cursor cursor) {
        List p;
        Table.Companion companion = Table.Companion;
        long cGetLong = companion.cGetLong(cursor, COLUMN_SURVEY_SENDING_ID);
        Survey survey = new Survey(companion.cGetString(cursor, COLUMN_MESSAGE_UUID), cGetLong, Long.valueOf(companion.cGetLong(cursor, COLUMN_SURVEY_HIDE_AFTER)), companion.cGetLong(cursor, COLUMN_TIMESTAMP), MessageStatus.Companion.fromOrdinal(companion.cGetInt(cursor, COLUMN_MESSAGE_SEND_STATE)), companion.cGetBool(cursor, COLUMN_IS_READ), companion.cGetBool(cursor, COLUMN_DISPLAY_MESSAGE));
        p = kc1.p(this.questionsTable.getQuestion(sQLiteOpenHelper, cGetLong));
        survey.setQuestions(new ArrayList<>(p));
        return survey;
    }

    private final UserPhrase getUserPhrase(SQLiteOpenHelper sQLiteOpenHelper, Cursor cursor) {
        Table.Companion companion = Table.Companion;
        return new UserPhrase(companion.cGetString(cursor, COLUMN_MESSAGE_UUID), companion.cGetString(cursor, COLUMN_PHRASE), this.quotesTable.getQuote(sQLiteOpenHelper, companion.cGetString(cursor, COLUMN_MESSAGE_UUID)), companion.cGetLong(cursor, COLUMN_TIMESTAMP), this.fileDescriptionTable.getFileDescription(sQLiteOpenHelper, companion.cGetString(cursor, COLUMN_MESSAGE_UUID)), MessageStatus.Companion.fromOrdinal(companion.cGetInt(cursor, COLUMN_MESSAGE_SEND_STATE)), Long.valueOf(companion.cGetLong(cursor, COLUMN_THREAD_ID)));
    }

    @Override // im.threads.business.database.table.Table
    public void cleanTable(SQLiteOpenHelper sQLiteOpenHelper) {
        z65.h(sQLiteOpenHelper, "sqlHelper");
        sQLiteOpenHelper.getWritableDatabase().execSQL("delete from TABLE_MESSAGES");
    }

    @Override // im.threads.business.database.table.Table
    public void createTable(SQLiteDatabase sQLiteDatabase) {
        z65.h(sQLiteDatabase, "db");
        pza pzaVar = pza.a;
        String format = String.format(Locale.US, "create table %s ( %s integer primary key autoincrement, %s integer,  %s text,  %s text,  %s integer,  %s text,  %s text,  %s text,  %s integer,  %s integer,%s text,%s text,%s text, COLUMN_CONSULT_ORG_UNIT text,%s text,%s integer , COLUMN_DISPLAY_MESSAGE integer, COLUMN_SURVEY_SENDING_ID integer, COLUMN_SURVEY_HIDE_AFTER integer, COLUMN_THREAD_ID integer, COLUMN_BLOCK_INPUT integer, COLUMN_SPEECH_STATUS text, COLUMN_MODIFICATION_STATE text)", Arrays.copyOf(new Object[]{TABLE_MESSAGES, COLUMN_TABLE_ID, COLUMN_TIMESTAMP, COLUMN_PHRASE, COLUMN_FORMATTED_PHRASE, COLUMN_MESSAGE_TYPE, COLUMN_NAME, COLUMN_AVATAR_PATH, COLUMN_MESSAGE_UUID, COLUMN_SEX, COLUMN_MESSAGE_SEND_STATE, COLUMN_CONSULT_ID, COLUMN_CONSULT_STATUS, COLUMN_CONSULT_TITLE, COLUMN_CONNECTION_TYPE, COLUMN_IS_READ}, 16));
        z65.g(format, "format(locale, format, *args)");
        sQLiteDatabase.execSQL(format);
    }

    public final List<ChatItem> getChatItems(SQLiteOpenHelper sQLiteOpenHelper, int i, int i2) {
        z65.h(sQLiteOpenHelper, "sqlHelper");
        ArrayList arrayList = new ArrayList();
        pza pzaVar = pza.a;
        String format = String.format(Locale.US, "select * from (select * from %s order by %s desc limit %s offset %s) order by %s asc", Arrays.copyOf(new Object[]{TABLE_MESSAGES, COLUMN_TIMESTAMP, Integer.valueOf(i2), Integer.valueOf(i), COLUMN_TIMESTAMP}, 5));
        z65.g(format, "format(locale, format, *args)");
        Cursor rawQuery = sQLiteOpenHelper.getWritableDatabase().rawQuery(format, null);
        try {
            if (rawQuery.getCount() == 0) {
                aa1.a(rawQuery, null);
                return arrayList;
            }
            rawQuery.moveToFirst();
            while (!rawQuery.isAfterLast()) {
                z65.g(rawQuery, c.a);
                ChatItem chatItem = getChatItem(sQLiteOpenHelper, rawQuery);
                if (chatItem != null) {
                    arrayList.add(chatItem);
                }
                rawQuery.moveToNext();
            }
            Unit unit = Unit.a;
            aa1.a(rawQuery, null);
            return arrayList;
        } finally {
        }
    }

    @Override // im.threads.business.database.table.Table
    public void upgradeTable(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        z65.h(sQLiteDatabase, "db");
        if (i < 2) {
            sQLiteDatabase.execSQL("ALTER TABLE TABLE_MESSAGES ADD COLUMN COLUMN_DISPLAY_MESSAGE INTEGER DEFAULT 0");
        }
        if (i < i2) {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS TABLE_MESSAGES");
        }
    }
}
