package defpackage;

import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteStatement;
import android.os.CancellationSignal;
import android.util.Pair;
import com.huawei.hms.actions.SearchIntents;
import com.huawei.hms.opendevice.c;
import com.inappstory.sdk.stories.api.models.Image;
import java.io.IOException;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: FrameworkSQLiteDatabase.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 22\u00020\u0001:\u0001!B\u000f\u0012\u0006\u0010#\u001a\u00020\u001e¢\u0006\u0004\b0\u00101J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\u0006H\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0016J)\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u00022\u0010\u0010\u0012\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00110\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0015H\u0016J\u001a\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0017J\u0010\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J)\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0010\u0010\u0012\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00110\u0010H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u001d\u001a\u00020\u0006H\u0016J\u000e\u0010 \u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u001eR\u0014\u0010#\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0016\u0010(\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0014\u0010*\u001a\u00020\u000b8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010%R(\u0010/\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020,\u0018\u00010+8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.¨\u00063"}, d2 = {"Lm74;", "Ly2b;", "", "sql", "Lc3b;", "R0", "", "beginTransaction", "Z", "g0", "X", "", Image.TYPE_HIGH, SearchIntents.EXTRA_QUERY, "Landroid/database/Cursor;", "m1", "", "", "bindArgs", "H0", "(Ljava/lang/String;[Ljava/lang/Object;)Landroid/database/Cursor;", "Lb3b;", "t", "Landroid/os/CancellationSignal;", "cancellationSignal", "d1", "C", "Y", "(Ljava/lang/String;[Ljava/lang/Object;)V", "close", "Landroid/database/sqlite/SQLiteDatabase;", "sqLiteDatabase", c.a, "a", "Landroid/database/sqlite/SQLiteDatabase;", "delegate", "isOpen", "()Z", "getPath", "()Ljava/lang/String;", "path", "M1", "isWriteAheadLoggingEnabled", "", "Landroid/util/Pair;", "A", "()Ljava/util/List;", "attachedDbs", "<init>", "(Landroid/database/sqlite/SQLiteDatabase;)V", "b", "sqlite-framework_release"}, k = 1, mv = {1, 7, 1})
/* renamed from: m74  reason: default package */
/* loaded from: classes.dex */
public final class m74 implements y2b {
    public static final a b = new a(null);
    private static final String[] c = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};
    private static final String[] d = new String[0];
    private final SQLiteDatabase a;

    /* compiled from: FrameworkSQLiteDatabase.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001c\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005¨\u0006\t"}, d2 = {"Lm74$a;", "", "", "", "CONFLICT_VALUES", "[Ljava/lang/String;", "EMPTY_STRING_ARRAY", "<init>", "()V", "sqlite-framework_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: m74$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FrameworkSQLiteDatabase.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a\u00020\b2\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Landroid/database/sqlite/SQLiteDatabase;", "<anonymous parameter 0>", "Landroid/database/sqlite/SQLiteCursorDriver;", "masterQuery", "", "editTable", "Landroid/database/sqlite/SQLiteQuery;", "sqLiteQuery", "Landroid/database/sqlite/SQLiteCursor;", "a", "(Landroid/database/sqlite/SQLiteDatabase;Landroid/database/sqlite/SQLiteCursorDriver;Ljava/lang/String;Landroid/database/sqlite/SQLiteQuery;)Landroid/database/sqlite/SQLiteCursor;"}, k = 3, mv = {1, 7, 1})
    /* renamed from: m74$b */
    /* loaded from: classes.dex */
    public static final class b extends ej5 implements a94<SQLiteDatabase, SQLiteCursorDriver, String, SQLiteQuery, SQLiteCursor> {
        final /* synthetic */ b3b a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(b3b b3bVar) {
            super(4);
            this.a = b3bVar;
        }

        @Override // defpackage.a94
        /* renamed from: a */
        public final SQLiteCursor q(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            b3b b3bVar = this.a;
            z65.e(sQLiteQuery);
            b3bVar.b(new q74(sQLiteQuery));
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    public m74(SQLiteDatabase sQLiteDatabase) {
        z65.h(sQLiteDatabase, "delegate");
        this.a = sQLiteDatabase;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Cursor e(a94 a94Var, SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        z65.h(a94Var, "$tmp0");
        return (Cursor) a94Var.q(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Cursor i(b3b b3bVar, SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        z65.h(b3bVar, "$query");
        z65.e(sQLiteQuery);
        b3bVar.b(new q74(sQLiteQuery));
        return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
    }

    @Override // defpackage.y2b
    public List<Pair<String, String>> A() {
        return this.a.getAttachedDbs();
    }

    @Override // defpackage.y2b
    public void C(String str) throws SQLException {
        z65.h(str, "sql");
        this.a.execSQL(str);
    }

    @Override // defpackage.y2b
    public Cursor H0(String str, Object[] objArr) {
        z65.h(str, SearchIntents.EXTRA_QUERY);
        z65.h(objArr, "bindArgs");
        return t(new ula(str, objArr));
    }

    @Override // defpackage.y2b
    public boolean M1() {
        return t2b.d(this.a);
    }

    @Override // defpackage.y2b
    public c3b R0(String str) {
        z65.h(str, "sql");
        SQLiteStatement compileStatement = this.a.compileStatement(str);
        z65.g(compileStatement, "delegate.compileStatement(sql)");
        return new r74(compileStatement);
    }

    @Override // defpackage.y2b
    public void X() {
        this.a.setTransactionSuccessful();
    }

    @Override // defpackage.y2b
    public void Y(String str, Object[] objArr) throws SQLException {
        z65.h(str, "sql");
        z65.h(objArr, "bindArgs");
        this.a.execSQL(str, objArr);
    }

    @Override // defpackage.y2b
    public void Z() {
        this.a.beginTransactionNonExclusive();
    }

    @Override // defpackage.y2b
    public void beginTransaction() {
        this.a.beginTransaction();
    }

    public final boolean c(SQLiteDatabase sQLiteDatabase) {
        z65.h(sQLiteDatabase, "sqLiteDatabase");
        return z65.c(this.a, sQLiteDatabase);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.a.close();
    }

    @Override // defpackage.y2b
    public Cursor d1(final b3b b3bVar, CancellationSignal cancellationSignal) {
        z65.h(b3bVar, SearchIntents.EXTRA_QUERY);
        SQLiteDatabase sQLiteDatabase = this.a;
        String a2 = b3bVar.a();
        String[] strArr = d;
        z65.e(cancellationSignal);
        return t2b.e(sQLiteDatabase, a2, strArr, null, cancellationSignal, new SQLiteDatabase.CursorFactory() { // from class: k74
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase2, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                Cursor i;
                i = m74.i(b3b.this, sQLiteDatabase2, sQLiteCursorDriver, str, sQLiteQuery);
                return i;
            }
        });
    }

    @Override // defpackage.y2b
    public void g0() {
        this.a.endTransaction();
    }

    @Override // defpackage.y2b
    public String getPath() {
        return this.a.getPath();
    }

    @Override // defpackage.y2b
    public boolean h() {
        return this.a.inTransaction();
    }

    @Override // defpackage.y2b
    public boolean isOpen() {
        return this.a.isOpen();
    }

    @Override // defpackage.y2b
    public Cursor m1(String str) {
        z65.h(str, SearchIntents.EXTRA_QUERY);
        return t(new ula(str));
    }

    @Override // defpackage.y2b
    public Cursor t(b3b b3bVar) {
        z65.h(b3bVar, SearchIntents.EXTRA_QUERY);
        final b bVar = new b(b3bVar);
        Cursor rawQueryWithFactory = this.a.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: l74
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                Cursor e;
                e = m74.e(a94.this, sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
                return e;
            }
        }, b3bVar.a(), d, null);
        z65.g(rawQueryWithFactory, "delegate.rawQueryWithFac…EMPTY_STRING_ARRAY, null)");
        return rawQueryWithFactory;
    }
}
