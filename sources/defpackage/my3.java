package defpackage;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: FirstDrawDoneListener.java */
/* renamed from: my3  reason: default package */
/* loaded from: classes2.dex */
public class my3 implements ViewTreeObserver.OnDrawListener {
    @SuppressLint({"ThreadPoolCreation"})
    private final Handler a = new Handler(Looper.getMainLooper());
    private final AtomicReference<View> b;
    private final Runnable c;

    /* compiled from: FirstDrawDoneListener.java */
    /* renamed from: my3$a */
    /* loaded from: classes2.dex */
    class a implements View.OnAttachStateChangeListener {
        a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            view.getViewTreeObserver().addOnDrawListener(my3.this);
            view.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            view.removeOnAttachStateChangeListener(this);
        }
    }

    private my3(View view, Runnable runnable) {
        this.b = new AtomicReference<>(view);
        this.c = runnable;
    }

    private static boolean b(View view) {
        if (view.getViewTreeObserver().isAlive() && c(view)) {
            return true;
        }
        return false;
    }

    private static boolean c(View view) {
        return view.isAttachedToWindow();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(View view) {
        view.getViewTreeObserver().removeOnDrawListener(this);
    }

    public static void e(View view, Runnable runnable) {
        my3 my3Var = new my3(view, runnable);
        if (Build.VERSION.SDK_INT < 26 && !b(view)) {
            view.addOnAttachStateChangeListener(new a());
        } else {
            view.getViewTreeObserver().addOnDrawListener(my3Var);
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public void onDraw() {
        final View andSet = this.b.getAndSet(null);
        if (andSet == null) {
            return;
        }
        andSet.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: ly3
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                my3.this.d(andSet);
            }
        });
        this.a.postAtFrontOfQueue(this.c);
    }
}
