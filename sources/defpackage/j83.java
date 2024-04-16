package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
/* compiled from: DrawableDecoderCompat.java */
/* renamed from: j83  reason: default package */
/* loaded from: classes.dex */
public final class j83 {
    private static volatile boolean a = true;

    public static Drawable a(Context context, int i, Resources.Theme theme) {
        return c(context, context, i, theme);
    }

    public static Drawable b(Context context, Context context2, int i) {
        return c(context, context2, i, null);
    }

    private static Drawable c(Context context, Context context2, int i, Resources.Theme theme) {
        try {
            if (a) {
                return e(context2, i, theme);
            }
        } catch (Resources.NotFoundException unused) {
        } catch (IllegalStateException e) {
            if (!context.getPackageName().equals(context2.getPackageName())) {
                return iu1.e(context2, i);
            }
            throw e;
        } catch (NoClassDefFoundError unused2) {
            a = false;
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        return d(context2, i, theme);
    }

    private static Drawable d(Context context, int i, Resources.Theme theme) {
        return ek9.f(context.getResources(), i, theme);
    }

    private static Drawable e(Context context, int i, Resources.Theme theme) {
        if (theme != null) {
            yu1 yu1Var = new yu1(context, theme);
            yu1Var.a(theme.getResources().getConfiguration());
            context = yu1Var;
        }
        return on.b(context, i);
    }
}
