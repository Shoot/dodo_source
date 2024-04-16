package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
/* loaded from: classes.dex */
public class FitWindowsFrameLayout extends FrameLayout {
    private py3 a;

    public FitWindowsFrameLayout(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    protected boolean fitSystemWindows(Rect rect) {
        py3 py3Var = this.a;
        if (py3Var != null) {
            py3Var.a(rect);
        }
        return super.fitSystemWindows(rect);
    }

    public void setOnFitSystemWindowsListener(py3 py3Var) {
    }
}
