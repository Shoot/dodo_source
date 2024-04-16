package defpackage;

import android.database.Cursor;
import android.os.Bundle;
import kotlin.Metadata;
/* compiled from: SupportSQLiteCompat.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¨\u0006\n"}, d2 = {"Lw2b;", "", "Landroid/database/Cursor;", "cursor", "Landroid/os/Bundle;", "extras", "", "a", "<init>", "()V", "sqlite_release"}, k = 1, mv = {1, 7, 1})
/* renamed from: w2b  reason: default package */
/* loaded from: classes.dex */
public final class w2b {
    public static final w2b a = new w2b();

    private w2b() {
    }

    public static final void a(Cursor cursor, Bundle bundle) {
        z65.h(cursor, "cursor");
        z65.h(bundle, "extras");
        cursor.setExtras(bundle);
    }
}
