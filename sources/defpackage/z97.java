package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.annotation.NonNull;
/* compiled from: OneShotPreDrawListener.java */
/* renamed from: z97  reason: default package */
/* loaded from: classes.dex */
public final class z97 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    private final View a;
    private ViewTreeObserver b;
    private final Runnable c;

    private z97(View view, Runnable runnable) {
        this.a = view;
        this.b = view.getViewTreeObserver();
        this.c = runnable;
    }

    @NonNull
    public static z97 a(@NonNull View view, @NonNull Runnable runnable) {
        if (view != null) {
            if (runnable != null) {
                z97 z97Var = new z97(view, runnable);
                view.getViewTreeObserver().addOnPreDrawListener(z97Var);
                view.addOnAttachStateChangeListener(z97Var);
                return z97Var;
            }
            throw new NullPointerException("runnable == null");
        }
        throw new NullPointerException("view == null");
    }

    public void b() {
        if (this.b.isAlive()) {
            this.b.removeOnPreDrawListener(this);
        } else {
            this.a.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.a.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        b();
        this.c.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(@NonNull View view) {
        this.b = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(@NonNull View view) {
        b();
    }
}
