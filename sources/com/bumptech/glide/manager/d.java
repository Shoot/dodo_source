package com.bumptech.glide.manager;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
/* compiled from: FirstFrameWaiter.java */
/* loaded from: classes.dex */
final class d implements e {
    final Set<Activity> a = Collections.newSetFromMap(new WeakHashMap());
    volatile boolean b;

    /* compiled from: FirstFrameWaiter.java */
    /* loaded from: classes.dex */
    class a implements ViewTreeObserver.OnDrawListener {
        final /* synthetic */ View a;

        /* compiled from: FirstFrameWaiter.java */
        /* renamed from: com.bumptech.glide.manager.d$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class RunnableC0105a implements Runnable {
            final /* synthetic */ ViewTreeObserver.OnDrawListener a;

            RunnableC0105a(ViewTreeObserver.OnDrawListener onDrawListener) {
                this.a = onDrawListener;
            }

            @Override // java.lang.Runnable
            public void run() {
                xm4.b().h();
                d.this.b = true;
                d.b(a.this.a, this.a);
                d.this.a.clear();
            }
        }

        a(View view) {
            this.a = view;
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public void onDraw() {
            vub.w(new RunnableC0105a(this));
        }
    }

    static void b(View view, ViewTreeObserver.OnDrawListener onDrawListener) {
        view.getViewTreeObserver().removeOnDrawListener(onDrawListener);
    }

    @Override // com.bumptech.glide.manager.e
    public void a(Activity activity) {
        if (this.b || !this.a.add(activity)) {
            return;
        }
        View decorView = activity.getWindow().getDecorView();
        decorView.getViewTreeObserver().addOnDrawListener(new a(decorView));
    }
}
