package im.threads.ui.core;

import android.app.PendingIntent;
import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
/* compiled from: PendingIntentCreator.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&¨\u0006\b"}, d2 = {"Lim/threads/ui/core/PendingIntentCreator;", "", "create", "Landroid/app/PendingIntent;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "appMarker", "", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface PendingIntentCreator {
    PendingIntent create(Context context, String str);
}
