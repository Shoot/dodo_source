package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
/* compiled from: AndroidFontLoader.android.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¨\u0006\n"}, d2 = {"Lzj9;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lxj9;", "font", "Landroid/graphics/Typeface;", "a", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: zj9  reason: default package */
/* loaded from: classes.dex */
final class zj9 {
    public static final zj9 a = new zj9();

    private zj9() {
    }

    public final Typeface a(Context context, xj9 xj9Var) {
        Typeface font;
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        z65.h(xj9Var, "font");
        font = context.getResources().getFont(xj9Var.d());
        z65.g(font, "context.resources.getFont(font.resId)");
        return font;
    }
}
