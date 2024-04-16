package defpackage;

import android.app.ActivityManager;
import android.database.Cursor;
import android.net.Uri;
import kotlin.Metadata;
/* compiled from: SupportSQLiteCompat.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¨\u0006\f"}, d2 = {"Lu2b;", "", "Landroid/database/Cursor;", "cursor", "Landroid/net/Uri;", "a", "Landroid/app/ActivityManager;", "activityManager", "", "b", "<init>", "()V", "sqlite_release"}, k = 1, mv = {1, 7, 1})
/* renamed from: u2b  reason: default package */
/* loaded from: classes.dex */
public final class u2b {
    public static final u2b a = new u2b();

    private u2b() {
    }

    public static final Uri a(Cursor cursor) {
        z65.h(cursor, "cursor");
        Uri notificationUri = cursor.getNotificationUri();
        z65.g(notificationUri, "cursor.notificationUri");
        return notificationUri;
    }

    public static final boolean b(ActivityManager activityManager) {
        z65.h(activityManager, "activityManager");
        return activityManager.isLowRamDevice();
    }
}
