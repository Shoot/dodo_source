package defpackage;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
/* compiled from: ColorResources.android.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ*\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u0007ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"Led1;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "id", "Luc1;", "a", "(Landroid/content/Context;I)J", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: ed1  reason: default package */
/* loaded from: classes.dex */
final class ed1 {
    public static final ed1 a = new ed1();

    private ed1() {
    }

    public final long a(Context context, int i) {
        int color;
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        color = context.getResources().getColor(i, context.getTheme());
        return yc1.b(color);
    }
}
