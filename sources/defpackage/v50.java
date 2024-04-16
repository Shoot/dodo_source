package defpackage;

import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
/* compiled from: BackButtonHandler.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\bR\u0016\u0010\r\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lv50;", "", "Landroid/view/KeyEvent;", "event", "", "a", "(Landroid/view/KeyEvent;)Ljava/lang/Boolean;", "Landroid/view/ViewGroup;", "Landroid/view/ViewGroup;", "viewGroup", "Landroid/view/View$OnClickListener;", "b", "Landroid/view/View$OnClickListener;", "listener", "<init>", "(Landroid/view/ViewGroup;Landroid/view/View$OnClickListener;)V", "sdk_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: v50  reason: default package */
/* loaded from: classes.dex */
public final class v50 {
    private final ViewGroup a;
    private final View.OnClickListener b;

    public v50(ViewGroup viewGroup, View.OnClickListener onClickListener) {
        z65.h(viewGroup, "viewGroup");
        this.a = viewGroup;
        this.b = onClickListener;
    }

    public final Boolean a(KeyEvent keyEvent) {
        if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
            View.OnClickListener onClickListener = this.b;
            if (onClickListener != null) {
                onClickListener.onClick(this.a);
                return Boolean.TRUE;
            }
            return Boolean.FALSE;
        }
        return null;
    }
}
