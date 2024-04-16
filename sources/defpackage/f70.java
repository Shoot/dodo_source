package defpackage;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.d;
import kotlin.Metadata;
import moxy.MvpAppCompatFragment;
/* compiled from: BaseFragment.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\b&\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0016¢\u0006\u0004\b\u001a\u0010\u001bB\u0013\b\u0016\u0012\b\b\u0001\u0010\u001c\u001a\u00020\f¢\u0006\u0004\b\u001a\u0010\u001dJ\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0017J\b\u0010\t\u001a\u00020\u0007H\u0017J\b\u0010\u000b\u001a\u00020\nH\u0014J\b\u0010\r\u001a\u00020\fH\u0014J\b\u0010\u000e\u001a\u00020\fH\u0014J\u0010\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0003H\u0014J\u0012\u0010\u0012\u001a\u00020\u00072\b\b\u0001\u0010\u0011\u001a\u00020\fH\u0004J\u0012\u0010\u0013\u001a\u00020\u00072\b\b\u0001\u0010\u0011\u001a\u00020\fH\u0004R\u001a\u0010\u0019\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001e"}, d2 = {"Lf70;", "Lmoxy/MvpAppCompatFragment;", "Llm1;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "", "onViewCreated", "onResume", "", "lh", "", "hh", "gh", "rootView", "ih", "colorId", "kh", "jh", "Lkm1;", "b", "Lkm1;", "getComponentDependenciesRegistry", "()Lkm1;", "componentDependenciesRegistry", "<init>", "()V", "layoutId", "(I)V", "presentation_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: f70  reason: default package */
/* loaded from: classes2.dex */
public abstract class f70 extends MvpAppCompatFragment implements lm1 {
    private final km1 b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BaseFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroid/view/View;", "thisView", "Lc5c;", "insets", "Landroid/graphics/Rect;", "initialPadding", "a", "(Landroid/view/View;Lc5c;Landroid/graphics/Rect;)Lc5c;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: f70$a */
    /* loaded from: classes2.dex */
    public static final class a extends ej5 implements y84<View, c5c, Rect, c5c> {
        public static final a a = new a();

        a() {
            super(3);
        }

        @Override // defpackage.y84
        /* renamed from: a */
        public final c5c invoke(View view, c5c c5cVar, Rect rect) {
            z65.h(view, "thisView");
            z65.h(c5cVar, "insets");
            z65.h(rect, "initialPadding");
            p45.l(view, 0, rect.top + c5cVar.l(), 0, rect.bottom + c5cVar.i(), 5, null);
            c5c c = c5cVar.c();
            z65.g(c, "consumeSystemWindowInsets(...)");
            return c;
        }
    }

    public f70() {
        this.b = eu2.d(this);
    }

    public km1 getComponentDependenciesRegistry() {
        return this.b;
    }

    protected int gh() {
        return fw8.a;
    }

    protected int hh() {
        return fw8.a;
    }

    protected void ih(View view) {
        z65.h(view, "rootView");
        p45.d(view, a.a);
    }

    protected final void jh(int i) {
        y60 y60Var;
        if (lh()) {
            d activity = getActivity();
            if (activity instanceof y60) {
                y60Var = (y60) activity;
            } else {
                y60Var = null;
            }
            if (y60Var != null) {
                y60Var.E1(i);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void kh(int i) {
        y60 y60Var;
        if (lh()) {
            d activity = getActivity();
            if (activity instanceof y60) {
                y60Var = (y60) activity;
            } else {
                y60Var = null;
            }
            if (y60Var != null) {
                y60Var.c2(i);
            }
        }
    }

    protected boolean lh() {
        return true;
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        int hh = hh();
        int gh = gh();
        kh(hh);
        jh(gh);
        syb.r0(requireView());
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        z65.h(view, "view");
        super.onViewCreated(view, bundle);
        jb0.a.a(this);
        View requireView = requireView();
        z65.g(requireView, "requireView(...)");
        ih(requireView);
    }

    public f70(int i) {
        super(i);
        this.b = eu2.d(this);
    }
}
