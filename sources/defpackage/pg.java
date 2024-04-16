package defpackage;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
/* compiled from: AndroidDensity.android.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u000e\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¨\u0006\u0004"}, d2 = {"Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "La03;", "a", "ui-unit_release"}, k = 2, mv = {1, 8, 0})
/* renamed from: pg  reason: default package */
/* loaded from: classes.dex */
public final class pg {
    public static final a03 a(Context context) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        return c03.a(context.getResources().getDisplayMetrics().density, context.getResources().getConfiguration().fontScale);
    }
}
