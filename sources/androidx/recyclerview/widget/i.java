package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
/* compiled from: LayoutState.java */
/* loaded from: classes.dex */
class i {
    int b;
    int c;
    int d;
    int e;
    boolean h;
    boolean i;
    boolean a = true;
    int f = 0;
    int g = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a(RecyclerView.a0 a0Var) {
        int i = this.c;
        if (i >= 0 && i < a0Var.b()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public View b(RecyclerView.w wVar) {
        View o = wVar.o(this.c);
        this.c += this.d;
        return o;
    }

    public String toString() {
        return "LayoutState{mAvailable=" + this.b + ", mCurrentPosition=" + this.c + ", mItemDirection=" + this.d + ", mLayoutDirection=" + this.e + ", mStartLine=" + this.f + ", mEndLine=" + this.g + CoreConstants.CURLY_RIGHT;
    }
}
