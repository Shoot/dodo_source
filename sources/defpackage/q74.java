package defpackage;

import android.database.sqlite.SQLiteProgram;
import kotlin.Metadata;
/* compiled from: FrameworkSQLiteProgram.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0010\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\tH\u0016J\u0018\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u000bH\u0016J\u0018\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\rH\u0016J\b\u0010\u000f\u001a\u00020\u0004H\u0016R\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lq74;", "La3b;", "", "index", "", "z1", "", "value", "c1", "", "O", "", "L0", "", "h1", "close", "Landroid/database/sqlite/SQLiteProgram;", "a", "Landroid/database/sqlite/SQLiteProgram;", "delegate", "<init>", "(Landroid/database/sqlite/SQLiteProgram;)V", "sqlite-framework_release"}, k = 1, mv = {1, 7, 1})
/* renamed from: q74  reason: default package */
/* loaded from: classes.dex */
public class q74 implements a3b {
    private final SQLiteProgram a;

    public q74(SQLiteProgram sQLiteProgram) {
        z65.h(sQLiteProgram, "delegate");
        this.a = sQLiteProgram;
    }

    @Override // defpackage.a3b
    public void L0(int i, String str) {
        z65.h(str, "value");
        this.a.bindString(i, str);
    }

    @Override // defpackage.a3b
    public void O(int i, double d) {
        this.a.bindDouble(i, d);
    }

    @Override // defpackage.a3b
    public void c1(int i, long j) {
        this.a.bindLong(i, j);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.a.close();
    }

    @Override // defpackage.a3b
    public void h1(int i, byte[] bArr) {
        z65.h(bArr, "value");
        this.a.bindBlob(i, bArr);
    }

    @Override // defpackage.a3b
    public void z1(int i) {
        this.a.bindNull(i);
    }
}
