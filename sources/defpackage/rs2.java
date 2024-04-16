package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import java.lang.ref.WeakReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DeferredRequestCreator.java */
/* renamed from: rs2  reason: default package */
/* loaded from: classes3.dex */
public class rs2 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    private final pi9 a;
    final WeakReference<ImageView> b;
    gm0 c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public rs2(pi9 pi9Var, ImageView imageView, gm0 gm0Var) {
        this.a = pi9Var;
        this.b = new WeakReference<>(imageView);
        this.c = gm0Var;
        imageView.addOnAttachStateChangeListener(this);
        if (imageView.getWindowToken() != null) {
            onViewAttachedToWindow(imageView);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        this.a.c();
        this.c = null;
        ImageView imageView = this.b.get();
        if (imageView == null) {
            return;
        }
        this.b.clear();
        imageView.removeOnAttachStateChangeListener(this);
        ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(this);
        }
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        ImageView imageView = this.b.get();
        if (imageView == null) {
            return true;
        }
        ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
        if (!viewTreeObserver.isAlive()) {
            return true;
        }
        int width = imageView.getWidth();
        int height = imageView.getHeight();
        if (width > 0 && height > 0) {
            imageView.removeOnAttachStateChangeListener(this);
            viewTreeObserver.removeOnPreDrawListener(this);
            this.b.clear();
            this.a.r().n(width, height).k(imageView, this.c);
        }
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        view.getViewTreeObserver().addOnPreDrawListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        view.getViewTreeObserver().removeOnPreDrawListener(this);
    }
}
