package im.threads.business.secureDatabase.table;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import im.threads.business.models.QuestionDTO;
import im.threads.business.secureDatabase.table.Table;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
/* compiled from: QuestionsTable.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0016J\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000eJ$\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u000eJ \u0010\u0011\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¨\u0006\u0015"}, d2 = {"Lim/threads/business/secureDatabase/table/QuestionsTable;", "Lim/threads/business/secureDatabase/table/Table;", "()V", "cleanTable", "", "sqlHelper", "Landroid/database/sqlite/SQLiteOpenHelper;", "createTable", "db", "Landroid/database/sqlite/SQLiteDatabase;", "getQuestions", "", "Lim/threads/business/models/QuestionDTO;", "surveySendingId", "", "putQuestions", "questions", "upgradeTable", "oldVersion", "", "newVersion", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class QuestionsTable extends Table {
    @Override // im.threads.business.secureDatabase.table.Table
    public void cleanTable(SQLiteOpenHelper sQLiteOpenHelper) {
        z65.h(sQLiteOpenHelper, "sqlHelper");
        sQLiteOpenHelper.getWritableDatabase().execSQL("delete from TABLE_QUESTIONS");
    }

    @Override // im.threads.business.secureDatabase.table.Table
    public void createTable(SQLiteDatabase sQLiteDatabase) {
        z65.h(sQLiteDatabase, "db");
        sQLiteDatabase.execSQL("CREATE TABLE TABLE_QUESTIONS(COLUMN_QUESTION_ID text,COLUMN_QUESTION_SURVEY_SENDING_ID_EXT text,COLUMN_QUESTION_SENDING_ID text,COLUMN_TIMESTAMP integer,COLUMN_QUESTION_SIMPLE text,COLUMN_QUESTION_SCALE text,COLUMN_QUESTION_RATE text,COLUMN_QUESTION_TEXT text)");
    }

    public final List<QuestionDTO> getQuestions(SQLiteOpenHelper sQLiteOpenHelper, long j) {
        z65.h(sQLiteOpenHelper, "sqlHelper");
        Cursor rawQuery = sQLiteOpenHelper.getReadableDatabase().rawQuery("select * from TABLE_QUESTIONS where COLUMN_QUESTION_SURVEY_SENDING_ID_EXT = " + j, new String[0]);
        try {
            ArrayList arrayList = new ArrayList();
            if (!rawQuery.moveToFirst()) {
                aa1.a(rawQuery, null);
                return arrayList;
            }
            do {
                QuestionDTO questionDTO = new QuestionDTO();
                Table.Companion companion = Table.Companion;
                z65.g(rawQuery, "it");
                questionDTO.setPhraseTimeStamp(companion.cursorGetLong(rawQuery, "COLUMN_TIMESTAMP"));
                questionDTO.setId(companion.cursorGetLong(rawQuery, "COLUMN_QUESTION_ID"));
                questionDTO.setSendingId(companion.cursorGetLong(rawQuery, "COLUMN_QUESTION_SENDING_ID"));
                questionDTO.setSimple(companion.cursorGetBool(rawQuery, "COLUMN_QUESTION_SIMPLE"));
                questionDTO.setText(companion.cursorGetString(rawQuery, "COLUMN_QUESTION_TEXT"));
                questionDTO.setScale(companion.cursorGetInt(rawQuery, "COLUMN_QUESTION_SCALE"));
                if (companion.isCursorNull(rawQuery, "COLUMN_QUESTION_RATE")) {
                    questionDTO.setRate(null);
                } else {
                    questionDTO.setRate(Integer.valueOf(companion.cursorGetInt(rawQuery, "COLUMN_QUESTION_RATE")));
                }
                arrayList.add(questionDTO);
            } while (rawQuery.moveToNext());
            aa1.a(rawQuery, null);
            return arrayList;
        } finally {
        }
    }

    public final void putQuestions(SQLiteOpenHelper sQLiteOpenHelper, List<QuestionDTO> list, long j) {
        List<QuestionDTO> I0;
        z65.h(sQLiteOpenHelper, "sqlHelper");
        z65.h(list, "questions");
        if (!list.isEmpty()) {
            I0 = sc1.I0(getQuestions(sQLiteOpenHelper, j));
            for (QuestionDTO questionDTO : list) {
                Iterator it = I0.iterator();
                int i = 0;
                while (true) {
                    if (it.hasNext()) {
                        QuestionDTO questionDTO2 = (QuestionDTO) it.next();
                        if (questionDTO2.getId() == questionDTO.getId() && z65.c(questionDTO2.getText(), questionDTO.getText())) {
                            break;
                        }
                        i++;
                    } else {
                        i = -1;
                        break;
                    }
                }
                if (i < 0) {
                    I0.add(questionDTO);
                } else {
                    I0.set(i, questionDTO);
                }
            }
            sQLiteOpenHelper.getWritableDatabase().beginTransaction();
            SQLiteDatabase writableDatabase = sQLiteOpenHelper.getWritableDatabase();
            writableDatabase.delete("TABLE_QUESTIONS", "COLUMN_QUESTION_SENDING_ID = " + j, null);
            for (QuestionDTO questionDTO3 : I0) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("COLUMN_QUESTION_SURVEY_SENDING_ID_EXT", Long.valueOf(j));
                contentValues.put("COLUMN_QUESTION_ID", Long.valueOf(questionDTO3.getId()));
                contentValues.put("COLUMN_QUESTION_SENDING_ID", Long.valueOf(questionDTO3.getSendingId()));
                contentValues.put("COLUMN_QUESTION_SCALE", Integer.valueOf(questionDTO3.getScale()));
                if (questionDTO3.hasRate()) {
                    contentValues.put("COLUMN_QUESTION_RATE", questionDTO3.getRate());
                }
                contentValues.put("COLUMN_QUESTION_TEXT", questionDTO3.getText());
                contentValues.put("COLUMN_QUESTION_SIMPLE", Boolean.valueOf(questionDTO3.getSimple()));
                contentValues.put("COLUMN_TIMESTAMP", Long.valueOf(questionDTO3.getPhraseTimeStamp()));
                sQLiteOpenHelper.getWritableDatabase().insert("TABLE_QUESTIONS", null, contentValues);
            }
            sQLiteOpenHelper.getWritableDatabase().setTransactionSuccessful();
            sQLiteOpenHelper.getWritableDatabase().endTransaction();
        }
    }

    @Override // im.threads.business.secureDatabase.table.Table
    public void upgradeTable(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        z65.h(sQLiteDatabase, "db");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS TABLE_QUESTIONS");
    }
}
