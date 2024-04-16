package defpackage;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import defpackage.k17;
import kotlin.Metadata;
import ru.dodopizza.app.R;
/* compiled from: NotificationUtil.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\n"}, d2 = {"Lc37;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lj17;", "channelType", "Lk17$e;", "a", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: c37  reason: default package */
/* loaded from: classes3.dex */
public final class c37 {
    public static final c37 a = new c37();

    private c37() {
    }

    public final k17.e a(Context context, j17 j17Var) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        z65.h(j17Var, "channelType");
        k17.e E = new k17.e(context, j17Var.getId()).M(1).H(R.drawable.ic_pizza_filled).n(iu1.c(context, R.color.textIconDodoColor)).E(2);
        z65.g(E, "setPriority(...)");
        return E;
    }
}
