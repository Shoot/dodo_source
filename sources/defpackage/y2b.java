package defpackage;

import android.database.Cursor;
import android.database.SQLException;
import android.os.CancellationSignal;
import android.util.Pair;
import com.huawei.hms.actions.SearchIntents;
import com.inappstory.sdk.stories.api.models.Image;
import java.io.Closeable;
import java.util.List;
import kotlin.Metadata;
/* compiled from: SupportSQLiteDatabase.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0007\u001a\u00020\u0006H&J\b\u0010\b\u001a\u00020\u0006H&J\b\u0010\t\u001a\u00020\u0006H&J\b\u0010\n\u001a\u00020\u0006H&J\b\u0010\f\u001a\u00020\u000bH&J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H&J)\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u00022\u0010\u0010\u0012\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00110\u0010H&¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0015H&J\u001a\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H'J\u0010\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&J)\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0010\u0010\u0012\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00110\u0010H&¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010!\u001a\u0004\u0018\u00010\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0014\u0010#\u001a\u00020\u000b8gX¦\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\u001eR(\u0010(\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020%\u0018\u00010$8fX¦\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006)À\u0006\u0001"}, d2 = {"Ly2b;", "Ljava/io/Closeable;", "", "sql", "Lc3b;", "R0", "", "beginTransaction", "Z", "g0", "X", "", Image.TYPE_HIGH, SearchIntents.EXTRA_QUERY, "Landroid/database/Cursor;", "m1", "", "", "bindArgs", "H0", "(Ljava/lang/String;[Ljava/lang/Object;)Landroid/database/Cursor;", "Lb3b;", "t", "Landroid/os/CancellationSignal;", "cancellationSignal", "d1", "C", "Y", "(Ljava/lang/String;[Ljava/lang/Object;)V", "isOpen", "()Z", "getPath", "()Ljava/lang/String;", "path", "M1", "isWriteAheadLoggingEnabled", "", "Landroid/util/Pair;", "A", "()Ljava/util/List;", "attachedDbs", "sqlite_release"}, k = 1, mv = {1, 7, 1})
/* renamed from: y2b  reason: default package */
/* loaded from: classes.dex */
public interface y2b extends Closeable {
    List<Pair<String, String>> A();

    void C(String str) throws SQLException;

    Cursor H0(String str, Object[] objArr);

    boolean M1();

    c3b R0(String str);

    void X();

    void Y(String str, Object[] objArr) throws SQLException;

    void Z();

    void beginTransaction();

    Cursor d1(b3b b3bVar, CancellationSignal cancellationSignal);

    void g0();

    String getPath();

    boolean h();

    boolean isOpen();

    Cursor m1(String str);

    Cursor t(b3b b3bVar);
}
