package im.threads.business.database.table;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.huawei.hms.opendevice.c;
import im.threads.business.database.table.Table;
import im.threads.business.models.QuestionDTO;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: QuestionsTable.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rJ \u0010\u000e\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¨\u0006\u0013"}, d2 = {"Lim/threads/business/database/table/QuestionsTable;", "Lim/threads/business/database/table/Table;", "()V", "cleanTable", "", "sqlHelper", "Landroid/database/sqlite/SQLiteOpenHelper;", "createTable", "db", "Landroid/database/sqlite/SQLiteDatabase;", "getQuestion", "Lim/threads/business/models/QuestionDTO;", "surveySendingId", "", "upgradeTable", "oldVersion", "", "newVersion", "Companion", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class QuestionsTable extends Table {
    private static final String COLUMN_QUESTION_ID = "COLUMN_QUESTION_ID";
    private static final String COLUMN_QUESTION_RATE = "COLUMN_QUESTION_RATE";
    private static final String COLUMN_QUESTION_SCALE = "COLUMN_QUESTION_SCALE";
    private static final String COLUMN_QUESTION_SENDING_ID = "COLUMN_QUESTION_SENDING_ID";
    private static final String COLUMN_QUESTION_SIMPLE = "COLUMN_QUESTION_SIMPLE";
    private static final String COLUMN_QUESTION_SURVEY_SENDING_ID_EXT = "COLUMN_QUESTION_SURVEY_SENDING_ID_EXT";
    private static final String COLUMN_QUESTION_TEXT = "COLUMN_QUESTION_TEXT";
    private static final String COLUMN_QUESTION_TIMESTAMP = "COLUMN_TIMESTAMP";
    public static final Companion Companion = new Companion(null);
    private static final String TABLE_QUESTIONS = "TABLE_QUESTIONS";

    /* compiled from: QuestionsTable.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lim/threads/business/database/table/QuestionsTable$Companion;", "", "()V", QuestionsTable.COLUMN_QUESTION_ID, "", QuestionsTable.COLUMN_QUESTION_RATE, QuestionsTable.COLUMN_QUESTION_SCALE, QuestionsTable.COLUMN_QUESTION_SENDING_ID, QuestionsTable.COLUMN_QUESTION_SIMPLE, QuestionsTable.COLUMN_QUESTION_SURVEY_SENDING_ID_EXT, QuestionsTable.COLUMN_QUESTION_TEXT, "COLUMN_QUESTION_TIMESTAMP", QuestionsTable.TABLE_QUESTIONS, "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // im.threads.business.database.table.Table
    public void cleanTable(SQLiteOpenHelper sQLiteOpenHelper) {
        z65.h(sQLiteOpenHelper, "sqlHelper");
        sQLiteOpenHelper.getWritableDatabase().execSQL("delete from TABLE_QUESTIONS");
    }

    @Override // im.threads.business.database.table.Table
    public void createTable(SQLiteDatabase sQLiteDatabase) {
        z65.h(sQLiteDatabase, "db");
        sQLiteDatabase.execSQL("CREATE TABLE TABLE_QUESTIONS(COLUMN_QUESTION_ID text,COLUMN_QUESTION_SURVEY_SENDING_ID_EXT text,COLUMN_QUESTION_SENDING_ID text,COLUMN_TIMESTAMP integer,COLUMN_QUESTION_SIMPLE text,COLUMN_QUESTION_SCALE text,COLUMN_QUESTION_RATE text,COLUMN_QUESTION_TEXT text)");
    }

    public final QuestionDTO getQuestion(SQLiteOpenHelper sQLiteOpenHelper, long j) {
        z65.h(sQLiteOpenHelper, "sqlHelper");
        Cursor rawQuery = sQLiteOpenHelper.getWritableDatabase().rawQuery("select * from TABLE_QUESTIONS where COLUMN_QUESTION_SURVEY_SENDING_ID_EXT = ?", new String[]{String.valueOf(j)});
        try {
            if (!rawQuery.moveToFirst()) {
                aa1.a(rawQuery, null);
                return null;
            }
            QuestionDTO questionDTO = new QuestionDTO();
            Table.Companion companion = Table.Companion;
            z65.g(rawQuery, c.a);
            questionDTO.setPhraseTimeStamp(companion.cGetLong(rawQuery, COLUMN_QUESTION_TIMESTAMP));
            questionDTO.setId(companion.cGetLong(rawQuery, COLUMN_QUESTION_ID));
            questionDTO.setSendingId(companion.cGetLong(rawQuery, COLUMN_QUESTION_SENDING_ID));
            questionDTO.setSimple(companion.cGetBool(rawQuery, COLUMN_QUESTION_SIMPLE));
            questionDTO.setText(companion.cGetString(rawQuery, COLUMN_QUESTION_TEXT));
            questionDTO.setScale(companion.cGetInt(rawQuery, COLUMN_QUESTION_SCALE));
            if (companion.cIsNull(rawQuery, COLUMN_QUESTION_RATE)) {
                questionDTO.setRate(0);
            } else {
                questionDTO.setRate(Integer.valueOf(companion.cGetInt(rawQuery, COLUMN_QUESTION_RATE)));
            }
            aa1.a(rawQuery, null);
            return questionDTO;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                aa1.a(rawQuery, th);
                throw th2;
            }
        }
    }

    @Override // im.threads.business.database.table.Table
    public void upgradeTable(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        z65.h(sQLiteDatabase, "db");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS TABLE_QUESTIONS");
    }
}
