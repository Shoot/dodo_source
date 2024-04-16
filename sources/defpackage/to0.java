package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.DecelerateInterpolator;
import kotlin.Metadata;
/* compiled from: CardAnimation.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\n"}, d2 = {"Lto0;", "", "Landroid/view/View;", "view", "Lflb;", "transitionInfo", "", "a", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: to0  reason: default package */
/* loaded from: classes4.dex */
public final class to0 {

    /* compiled from: CardAnimation.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"to0$a", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "", "onPreDraw", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: to0$a */
    /* loaded from: classes4.dex */
    public static final class a implements ViewTreeObserver.OnPreDrawListener {
        final /* synthetic */ View a;
        final /* synthetic */ flb b;

        a(View view, flb flbVar) {
            this.a = view;
            this.b = flbVar;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            this.a.getViewTreeObserver().removeOnPreDrawListener(this);
            int[] iArr = new int[2];
            this.a.getLocationOnScreen(iArr);
            int b = this.b.b() - iArr[0];
            int c = this.b.c() - iArr[1];
            float d = this.b.d() / this.a.getWidth();
            float a = this.b.a() / this.a.getHeight();
            this.a.setPivotX(0.0f);
            this.a.setPivotY(0.0f);
            this.a.setScaleX(d);
            this.a.setScaleY(a);
            this.a.setTranslationX(b);
            this.a.setTranslationY(c);
            this.a.setAlpha(0.0f);
            this.a.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).translationX(0.0f).translationY(0.0f).setDuration(150L).setInterpolator(new DecelerateInterpolator());
            return true;
        }
    }

    public final void a(View view, flb flbVar) {
        z65.h(view, "view");
        z65.h(flbVar, "transitionInfo");
        view.clearAnimation();
        view.getViewTreeObserver().addOnPreDrawListener(new a(view, flbVar));
    }
}
