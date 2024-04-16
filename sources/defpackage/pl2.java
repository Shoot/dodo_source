package defpackage;

import android.content.Context;
import java.io.File;
import kotlin.Metadata;
/* compiled from: DataStoreFile.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0012\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¨\u0006\u0005"}, d2 = {"Landroid/content/Context;", "", "fileName", "Ljava/io/File;", "a", "datastore_release"}, k = 2, mv = {1, 5, 1})
/* renamed from: pl2  reason: default package */
/* loaded from: classes.dex */
public final class pl2 {
    public static final File a(Context context, String str) {
        z65.h(context, "<this>");
        z65.h(str, "fileName");
        return new File(context.getApplicationContext().getFilesDir(), z65.q("datastore/", str));
    }
}
