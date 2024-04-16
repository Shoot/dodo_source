package im.threads.business.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import ch.qos.logback.core.CoreConstants;
import im.threads.business.database.table.FileDescriptionsTable;
import im.threads.business.database.table.MessagesTable;
import im.threads.business.database.table.QuestionsTable;
import im.threads.business.database.table.QuickRepliesTable;
import im.threads.business.database.table.QuotesTable;
import im.threads.business.models.ChatItem;
import im.threads.business.models.FileDescription;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: ThreadsDbHelper.kt */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 %2\u00020\u00012\u00020\u0002:\u0001%B\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\u001e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00072\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016J\b\u0010\u001e\u001a\u00020\u0018H\u0002J\u0010\u0010\u001f\u001a\u00020\u00182\u0006\u0010 \u001a\u00020!H\u0016J \u0010\"\u001a\u00020\u00182\u0006\u0010 \u001a\u00020!2\u0006\u0010#\u001a\u00020\u001c2\u0006\u0010$\u001a\u00020\u001cH\u0016R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082.¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lim/threads/business/database/ThreadsDbHelper;", "Landroid/database/sqlite/SQLiteOpenHelper;", "Lim/threads/business/database/DBHelper;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "(Landroid/content/Context;)V", "allFileDescriptions", "", "Lim/threads/business/models/FileDescription;", "getAllFileDescriptions", "()Ljava/util/List;", "fileDescriptionTable", "Lim/threads/business/database/table/FileDescriptionsTable;", "isTablesPrepared", "", "messagesTable", "Lim/threads/business/database/table/MessagesTable;", "questionsTable", "Lim/threads/business/database/table/QuestionsTable;", "quickRepliesTable", "Lim/threads/business/database/table/QuickRepliesTable;", "quotesTable", "Lim/threads/business/database/table/QuotesTable;", "cleanDatabase", "", "getChatItems", "Lim/threads/business/models/ChatItem;", "offset", "", "limit", "initTables", "onCreate", "db", "Landroid/database/sqlite/SQLiteDatabase;", "onUpgrade", "oldVersion", "newVersion", "Companion", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ThreadsDbHelper extends SQLiteOpenHelper implements DBHelper {
    public static final Companion Companion = new Companion(null);
    private static final int VERSION = 17;
    private FileDescriptionsTable fileDescriptionTable;
    private boolean isTablesPrepared;
    private MessagesTable messagesTable;
    private QuestionsTable questionsTable;
    private QuickRepliesTable quickRepliesTable;
    private QuotesTable quotesTable;

    /* compiled from: ThreadsDbHelper.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lim/threads/business/database/ThreadsDbHelper$Companion;", "", "()V", "VERSION", "", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public ThreadsDbHelper(Context context) {
        super(context, "messages.db", (SQLiteDatabase.CursorFactory) null, 17);
        initTables();
    }

    private final void initTables() {
        if (!this.isTablesPrepared) {
            this.fileDescriptionTable = new FileDescriptionsTable();
            this.questionsTable = new QuestionsTable();
            FileDescriptionsTable fileDescriptionsTable = this.fileDescriptionTable;
            QuestionsTable questionsTable = null;
            if (fileDescriptionsTable == null) {
                z65.z("fileDescriptionTable");
                fileDescriptionsTable = null;
            }
            this.quotesTable = new QuotesTable(fileDescriptionsTable);
            this.quickRepliesTable = new QuickRepliesTable();
            FileDescriptionsTable fileDescriptionsTable2 = this.fileDescriptionTable;
            if (fileDescriptionsTable2 == null) {
                z65.z("fileDescriptionTable");
                fileDescriptionsTable2 = null;
            }
            QuotesTable quotesTable = this.quotesTable;
            if (quotesTable == null) {
                z65.z("quotesTable");
                quotesTable = null;
            }
            QuickRepliesTable quickRepliesTable = this.quickRepliesTable;
            if (quickRepliesTable == null) {
                z65.z("quickRepliesTable");
                quickRepliesTable = null;
            }
            QuestionsTable questionsTable2 = this.questionsTable;
            if (questionsTable2 == null) {
                z65.z("questionsTable");
            } else {
                questionsTable = questionsTable2;
            }
            this.messagesTable = new MessagesTable(fileDescriptionsTable2, quotesTable, quickRepliesTable, questionsTable);
            this.isTablesPrepared = true;
        }
    }

    @Override // im.threads.business.database.DBHelper
    public void cleanDatabase() {
        FileDescriptionsTable fileDescriptionsTable = this.fileDescriptionTable;
        QuestionsTable questionsTable = null;
        if (fileDescriptionsTable == null) {
            z65.z("fileDescriptionTable");
            fileDescriptionsTable = null;
        }
        fileDescriptionsTable.cleanTable(this);
        MessagesTable messagesTable = this.messagesTable;
        if (messagesTable == null) {
            z65.z("messagesTable");
            messagesTable = null;
        }
        messagesTable.cleanTable(this);
        QuotesTable quotesTable = this.quotesTable;
        if (quotesTable == null) {
            z65.z("quotesTable");
            quotesTable = null;
        }
        quotesTable.cleanTable(this);
        QuickRepliesTable quickRepliesTable = this.quickRepliesTable;
        if (quickRepliesTable == null) {
            z65.z("quickRepliesTable");
            quickRepliesTable = null;
        }
        quickRepliesTable.cleanTable(this);
        QuestionsTable questionsTable2 = this.questionsTable;
        if (questionsTable2 == null) {
            z65.z("questionsTable");
        } else {
            questionsTable = questionsTable2;
        }
        questionsTable.cleanTable(this);
    }

    @Override // im.threads.business.database.DBHelper
    public List<FileDescription> getAllFileDescriptions() {
        FileDescriptionsTable fileDescriptionsTable = this.fileDescriptionTable;
        if (fileDescriptionsTable == null) {
            z65.z("fileDescriptionTable");
            fileDescriptionsTable = null;
        }
        return fileDescriptionsTable.getAllFileDescriptions(this);
    }

    @Override // im.threads.business.database.DBHelper
    public List<ChatItem> getChatItems(int i, int i2) {
        MessagesTable messagesTable = this.messagesTable;
        if (messagesTable == null) {
            z65.z("messagesTable");
            messagesTable = null;
        }
        return messagesTable.getChatItems(this, i, i2);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        z65.h(sQLiteDatabase, "db");
        initTables();
        MessagesTable messagesTable = this.messagesTable;
        QuestionsTable questionsTable = null;
        if (messagesTable == null) {
            z65.z("messagesTable");
            messagesTable = null;
        }
        messagesTable.createTable(sQLiteDatabase);
        QuotesTable quotesTable = this.quotesTable;
        if (quotesTable == null) {
            z65.z("quotesTable");
            quotesTable = null;
        }
        quotesTable.createTable(sQLiteDatabase);
        QuickRepliesTable quickRepliesTable = this.quickRepliesTable;
        if (quickRepliesTable == null) {
            z65.z("quickRepliesTable");
            quickRepliesTable = null;
        }
        quickRepliesTable.createTable(sQLiteDatabase);
        FileDescriptionsTable fileDescriptionsTable = this.fileDescriptionTable;
        if (fileDescriptionsTable == null) {
            z65.z("fileDescriptionTable");
            fileDescriptionsTable = null;
        }
        fileDescriptionsTable.createTable(sQLiteDatabase);
        QuestionsTable questionsTable2 = this.questionsTable;
        if (questionsTable2 == null) {
            z65.z("questionsTable");
        } else {
            questionsTable = questionsTable2;
        }
        questionsTable.createTable(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        z65.h(sQLiteDatabase, "db");
        initTables();
        if (i < 17) {
            MessagesTable messagesTable = this.messagesTable;
            QuestionsTable questionsTable = null;
            if (messagesTable == null) {
                z65.z("messagesTable");
                messagesTable = null;
            }
            messagesTable.upgradeTable(sQLiteDatabase, i, i2);
            QuotesTable quotesTable = this.quotesTable;
            if (quotesTable == null) {
                z65.z("quotesTable");
                quotesTable = null;
            }
            quotesTable.upgradeTable(sQLiteDatabase, i, i2);
            QuickRepliesTable quickRepliesTable = this.quickRepliesTable;
            if (quickRepliesTable == null) {
                z65.z("quickRepliesTable");
                quickRepliesTable = null;
            }
            quickRepliesTable.upgradeTable(sQLiteDatabase, i, i2);
            FileDescriptionsTable fileDescriptionsTable = this.fileDescriptionTable;
            if (fileDescriptionsTable == null) {
                z65.z("fileDescriptionTable");
                fileDescriptionsTable = null;
            }
            fileDescriptionsTable.upgradeTable(sQLiteDatabase, i, i2);
            QuestionsTable questionsTable2 = this.questionsTable;
            if (questionsTable2 == null) {
                z65.z("questionsTable");
            } else {
                questionsTable = questionsTable2;
            }
            questionsTable.upgradeTable(sQLiteDatabase, i, i2);
            onCreate(sQLiteDatabase);
        }
    }
}
