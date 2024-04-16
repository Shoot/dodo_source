package androidx.compose.ui.platform;

import android.view.PointerIcon;
import android.view.View;
import com.huawei.hms.push.constant.RemoteMessageConst;
import kotlin.Metadata;
/* compiled from: AndroidComposeView.android.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¨\u0006\n"}, d2 = {"Landroidx/compose/ui/platform/k;", "", "Landroid/view/View;", "view", "Lpd8;", RemoteMessageConst.Notification.ICON, "", "a", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class k {
    public static final k a = new k();

    private k() {
    }

    public final void a(View view, pd8 pd8Var) {
        PointerIcon systemIcon;
        PointerIcon pointerIcon;
        z65.h(view, "view");
        if (pd8Var instanceof oi) {
            systemIcon = ((oi) pd8Var).a();
        } else if (pd8Var instanceof pi) {
            systemIcon = PointerIcon.getSystemIcon(view.getContext(), ((pi) pd8Var).a());
            z65.g(systemIcon, "getSystemIcon(view.context, icon.type)");
        } else {
            systemIcon = PointerIcon.getSystemIcon(view.getContext(), 1000);
            z65.g(systemIcon, "getSystemIcon(\n         …DEFAULT\n                )");
        }
        pointerIcon = view.getPointerIcon();
        if (!z65.c(pointerIcon, systemIcon)) {
            view.setPointerIcon(systemIcon);
        }
    }
}
