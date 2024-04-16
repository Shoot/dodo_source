package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.widget.PopupWindow;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
/* compiled from: ExpandableIconView.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroid/widget/PopupWindow;", "b", "()Landroid/widget/PopupWindow;"}, k = 3, mv = {1, 9, 0})
/* renamed from: bn3  reason: default package */
/* loaded from: classes.dex */
final class bn3 extends ej5 implements Function0<PopupWindow> {
    final /* synthetic */ cn3 a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bn3(cn3 cn3Var) {
        super(0);
        this.a = cn3Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(cn3 cn3Var) {
        z65.h(cn3Var, "this$0");
        cn3Var.o();
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: b */
    public final PopupWindow invoke() {
        PopupWindow popupWindow = new PopupWindow(this.a.getContext());
        final cn3 cn3Var = this.a;
        popupWindow.setWidth(-2);
        popupWindow.setHeight(-2);
        popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        popupWindow.setFocusable(true);
        popupWindow.setOutsideTouchable(true);
        popupWindow.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: an3
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                bn3.c(cn3.this);
            }
        });
        popupWindow.setAnimationStyle(p19.c);
        return popupWindow;
    }
}
