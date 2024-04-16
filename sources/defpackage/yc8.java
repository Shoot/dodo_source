package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* compiled from: PlatformTypefaces.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\b\u0010\u0001\u001a\u00020\u0000H\u0000\u001a \u0010\u0007\u001a\u0004\u0018\u00010\u0002*\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0001\u001a\u0018\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0001¨\u0006\r"}, d2 = {"Luc8;", "a", "Landroid/graphics/Typeface;", "Lu34;", "variationSettings", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, c.a, "", Action.NAME_ATTRIBUTE, "Lv34;", "fontWeight", "b", "ui-text_release"}, k = 2, mv = {1, 8, 0})
/* renamed from: yc8  reason: default package */
/* loaded from: classes.dex */
public final class yc8 {
    public static final uc8 a() {
        if (Build.VERSION.SDK_INT >= 28) {
            return new wc8();
        }
        return new xc8();
    }

    public static final String b(String str, v34 v34Var) {
        z65.h(str, Action.NAME_ATTRIBUTE);
        z65.h(v34Var, "fontWeight");
        int B = v34Var.B() / 100;
        if (B >= 0 && B < 2) {
            return str + "-thin";
        } else if (2 <= B && B < 4) {
            return str + "-light";
        } else if (B != 4) {
            if (B == 5) {
                return str + "-medium";
            } else if ((6 > B || B >= 8) && 8 <= B && B < 11) {
                return str + "-black";
            } else {
                return str;
            }
        } else {
            return str;
        }
    }

    public static final Typeface c(Typeface typeface, u34 u34Var, Context context) {
        z65.h(u34Var, "variationSettings");
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        if (Build.VERSION.SDK_INT >= 26) {
            return lob.a.a(typeface, u34Var, context);
        }
        return typeface;
    }
}
