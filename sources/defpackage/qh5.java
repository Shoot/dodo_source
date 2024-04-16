package defpackage;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import java.io.File;
import kotlin.Metadata;
/* compiled from: KustoAnalyticsImpl.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\u001a\u000e\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000*\"\u0010\u0007\"\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¨\u0006\b"}, d2 = {"Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Ljava/io/File;", "a", "", "", "", "EventParams", "analytics-kusto_release"}, k = 2, mv = {1, 7, 1})
/* renamed from: qh5  reason: default package */
/* loaded from: classes.dex */
public final class qh5 {
    public static final File a(Context context) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        File filesDir = context.getFilesDir();
        z65.g(filesDir, "context.filesDir");
        return filesDir;
    }
}
