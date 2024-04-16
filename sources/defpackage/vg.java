package defpackage;

import android.content.Context;
import android.os.Build;
import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
/* compiled from: AndroidFontResolveInterceptor.android.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¨\u0006\u0004"}, d2 = {"Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lug;", "a", "ui-text_release"}, k = 2, mv = {1, 8, 0})
/* renamed from: vg  reason: default package */
/* loaded from: classes.dex */
public final class vg {
    public static final ug a(Context context) {
        int i;
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        if (Build.VERSION.SDK_INT >= 31) {
            i = context.getResources().getConfiguration().fontWeightAdjustment;
        } else {
            i = 0;
        }
        return new ug(i);
    }
}
