package im.threads.business.core;

import android.annotation.SuppressLint;
import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
/* compiled from: ContextHolder.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lim/threads/business/core/ContextHolder;", "", "()V", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint({"StaticFieldLeak"})
/* loaded from: classes3.dex */
public final class ContextHolder {
    public static final ContextHolder INSTANCE = new ContextHolder();
    public static Context context;

    private ContextHolder() {
    }

    public final Context getContext() {
        Context context2 = context;
        if (context2 != null) {
            return context2;
        }
        z65.z(CoreConstants.CONTEXT_SCOPE_VALUE);
        return null;
    }

    public final void setContext(Context context2) {
        z65.h(context2, "<set-?>");
        context = context2;
    }
}
