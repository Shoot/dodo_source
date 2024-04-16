package defpackage;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import java.util.List;
import kotlin.Metadata;
/* compiled from: SupportSQLiteCompat.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ(\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0007J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\u000e"}, d2 = {"Lx2b;", "", "Landroid/database/Cursor;", "cursor", "Landroid/content/ContentResolver;", "cr", "", "Landroid/net/Uri;", "uris", "", "b", "a", "<init>", "()V", "sqlite_release"}, k = 1, mv = {1, 7, 1})
/* renamed from: x2b  reason: default package */
/* loaded from: classes.dex */
public final class x2b {
    public static final x2b a = new x2b();

    private x2b() {
    }

    public static final List<Uri> a(Cursor cursor) {
        z65.h(cursor, "cursor");
        List<Uri> notificationUris = cursor.getNotificationUris();
        z65.e(notificationUris);
        return notificationUris;
    }

    public static final void b(Cursor cursor, ContentResolver contentResolver, List<? extends Uri> list) {
        z65.h(cursor, "cursor");
        z65.h(contentResolver, "cr");
        z65.h(list, "uris");
        cursor.setNotificationUris(contentResolver, list);
    }
}
