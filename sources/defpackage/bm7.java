package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import ch.qos.logback.core.CoreConstants;
import defpackage.uf8;
import kotlin.Metadata;
/* compiled from: OrderedView.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0006H%J\u001a\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0006H\u0014¨\u0006\u0012"}, d2 = {"Lbm7;", "Landroid/widget/LinearLayout;", "Landroid/util/AttributeSet;", "attrs", "", "a", "", "getLayoutId", "Landroid/view/View;", "view", "b", "extraSpace", "", "onCreateDrawableState", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "android_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: bm7  reason: default package */
/* loaded from: classes.dex */
public abstract class bm7 extends LinearLayout {
    public bm7(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(attributeSet);
    }

    private final void a(AttributeSet attributeSet) {
        setClickable(true);
        setFocusable(true);
        View inflate = LayoutInflater.from(getContext()).inflate(getLayoutId(), this);
        inflate.setClickable(false);
        z65.e(inflate);
        b(inflate, attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void b(View view, AttributeSet attributeSet) {
        z65.h(view, "view");
    }

    protected abstract int getLayoutId();

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i) {
        ViewGroup viewGroup;
        boolean z;
        uf8 uf8Var;
        ViewParent parent = getParent();
        if (parent instanceof ViewGroup) {
            viewGroup = (ViewGroup) parent;
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            int[] onCreateDrawableState = super.onCreateDrawableState(i);
            z65.g(onCreateDrawableState, "onCreateDrawableState(...)");
            return onCreateDrawableState;
        } else if (viewGroup.getChildCount() == 0) {
            int[] onCreateDrawableState2 = super.onCreateDrawableState(i);
            z65.g(onCreateDrawableState2, "onCreateDrawableState(...)");
            return onCreateDrawableState2;
        } else {
            int childCount = viewGroup.getChildCount();
            boolean z2 = false;
            if (viewGroup.getChildAt(0) == this) {
                z = true;
            } else {
                z = false;
            }
            if (viewGroup.getChildAt(childCount - 1) == this) {
                z2 = true;
            }
            if (z && z2) {
                uf8Var = uf8.d.b;
            } else if (z) {
                uf8Var = uf8.a.b;
            } else if (z2) {
                uf8Var = uf8.b.b;
            } else {
                uf8Var = uf8.c.b;
            }
            int[] onCreateDrawableState3 = super.onCreateDrawableState(i + uf8Var.a().length);
            View.mergeDrawableStates(onCreateDrawableState3, uf8Var.a());
            z65.e(onCreateDrawableState3);
            return onCreateDrawableState3;
        }
    }
}
