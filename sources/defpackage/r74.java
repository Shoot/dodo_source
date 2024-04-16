package defpackage;

import android.database.sqlite.SQLiteStatement;
import kotlin.Metadata;
/* compiled from: FrameworkSQLiteStatement.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lr74;", "Lq74;", "Lc3b;", "", "I", "", "D0", "Landroid/database/sqlite/SQLiteStatement;", "b", "Landroid/database/sqlite/SQLiteStatement;", "delegate", "<init>", "(Landroid/database/sqlite/SQLiteStatement;)V", "sqlite-framework_release"}, k = 1, mv = {1, 7, 1})
/* renamed from: r74  reason: default package */
/* loaded from: classes.dex */
public final class r74 extends q74 implements c3b {
    private final SQLiteStatement b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r74(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        z65.h(sQLiteStatement, "delegate");
        this.b = sQLiteStatement;
    }

    @Override // defpackage.c3b
    public long D0() {
        return this.b.executeInsert();
    }

    @Override // defpackage.c3b
    public int I() {
        return this.b.executeUpdateDelete();
    }
}
