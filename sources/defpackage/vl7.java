package defpackage;

import android.content.Context;
import androidx.appcompat.app.d;
import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
/* compiled from: OrderUtils.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u000e\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¨\u0006\u0005"}, d2 = {"Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "a", "b", "activeorder_release"}, k = 2, mv = {1, 9, 0})
/* renamed from: vl7  reason: default package */
/* loaded from: classes.dex */
public final class vl7 {
    public static final boolean a(Context context) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        int l = d.l();
        if (l != -1) {
            if (l == 1) {
                return false;
            }
            if (l != 2) {
                if (l != 3) {
                    return false;
                }
                return b(context);
            }
            return true;
        }
        return b(context);
    }

    private static final boolean b(Context context) {
        int i = context.getResources().getConfiguration().uiMode & 48;
        if (i == 16 || i != 32) {
            return false;
        }
        return true;
    }
}
