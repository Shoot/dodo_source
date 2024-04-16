package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.e0;
/* compiled from: AppCompatPopupWindow.java */
/* renamed from: ln  reason: default package */
/* loaded from: classes.dex */
class ln extends PopupWindow {
    private static final boolean b = false;
    private boolean a;

    public ln(@NonNull Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        a(context, attributeSet, i, i2);
    }

    private void a(Context context, AttributeSet attributeSet, int i, int i2) {
        e0 v = e0.v(context, attributeSet, n29.a2, i, i2);
        int i3 = n29.c2;
        if (v.s(i3)) {
            b(v.a(i3, false));
        }
        setBackgroundDrawable(v.g(n29.b2));
        v.w();
    }

    private void b(boolean z) {
        if (b) {
            this.a = z;
        } else {
            tf8.a(this, z);
        }
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i, int i2) {
        if (b && this.a) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2);
    }

    @Override // android.widget.PopupWindow
    public void update(View view, int i, int i2, int i3, int i4) {
        if (b && this.a) {
            i2 -= view.getHeight();
        }
        super.update(view, i, i2, i3, i4);
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i, int i2, int i3) {
        if (b && this.a) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2, i3);
    }
}
