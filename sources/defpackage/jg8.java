package defpackage;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PreDrawListener.java */
/* renamed from: jg8  reason: default package */
/* loaded from: classes2.dex */
public class jg8 implements ViewTreeObserver.OnPreDrawListener {
    @SuppressLint({"ThreadPoolCreation"})
    private final Handler a = new Handler(Looper.getMainLooper());
    private final AtomicReference<View> b;
    private final Runnable c;
    private final Runnable d;

    private jg8(View view, Runnable runnable, Runnable runnable2) {
        this.b = new AtomicReference<>(view);
        this.c = runnable;
        this.d = runnable2;
    }

    public static void a(View view, Runnable runnable, Runnable runnable2) {
        view.getViewTreeObserver().addOnPreDrawListener(new jg8(view, runnable, runnable2));
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        View andSet = this.b.getAndSet(null);
        if (andSet == null) {
            return true;
        }
        andSet.getViewTreeObserver().removeOnPreDrawListener(this);
        this.a.post(this.c);
        this.a.postAtFrontOfQueue(this.d);
        return true;
    }
}
