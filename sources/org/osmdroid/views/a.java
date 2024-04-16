package org.osmdroid.views;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.animation.LinearInterpolator;
import java.lang.Thread;
/* compiled from: CustomZoomButtonsController.java */
/* loaded from: classes3.dex */
public class a {
    private final MapView b;
    private final ValueAnimator c;
    private m42 d;
    private e e;
    private boolean f;
    private boolean g;
    private float h;
    private boolean i;
    private boolean m;
    private long n;
    private Thread o;
    private final Runnable p;
    private final Object a = new Object();
    private f j = f.NEVER;
    private int k = 500;
    private int l = 3500;

    /* compiled from: CustomZoomButtonsController.java */
    /* renamed from: org.osmdroid.views.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    class C0468a implements ValueAnimator.AnimatorUpdateListener {
        C0468a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (a.this.i) {
                a.this.c.cancel();
                return;
            }
            a.this.h = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
            a.this.l();
        }
    }

    /* compiled from: CustomZoomButtonsController.java */
    /* loaded from: classes3.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            while (true) {
                long n = (a.this.n + a.this.l) - a.this.n();
                if (n <= 0) {
                    a.this.t();
                    return;
                }
                try {
                    Thread.sleep(n, 0);
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CustomZoomButtonsController.java */
    /* loaded from: classes3.dex */
    public class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.c.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CustomZoomButtonsController.java */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class d {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[f.values().length];
            a = iArr;
            try {
                iArr[f.ALWAYS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[f.NEVER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[f.SHOW_AND_FADEOUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: CustomZoomButtonsController.java */
    /* loaded from: classes3.dex */
    public interface e {
        void onZoom(boolean z);
    }

    /* compiled from: CustomZoomButtonsController.java */
    /* loaded from: classes3.dex */
    public enum f {
        ALWAYS,
        NEVER,
        SHOW_AND_FADEOUT
    }

    public a(MapView mapView) {
        this.b = mapView;
        this.d = new m42(mapView);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.c = ofFloat;
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.setDuration(this.k);
        ofFloat.addUpdateListener(new C0468a());
        this.p = new b();
    }

    private boolean j() {
        if (!this.m) {
            return false;
        }
        this.m = false;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        if (this.i) {
            return;
        }
        this.b.postInvalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long n() {
        return System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t() {
        if (this.i) {
            return;
        }
        this.c.setStartDelay(0L);
        this.b.post(new c());
    }

    private void u() {
        this.c.cancel();
    }

    public void i() {
        if (this.i || this.j != f.SHOW_AND_FADEOUT) {
            return;
        }
        float f2 = this.h;
        boolean z = false;
        if (!this.m) {
            if (f2 == 0.0f) {
                z = true;
            }
            this.m = z;
        } else {
            this.m = false;
        }
        u();
        this.h = 1.0f;
        this.n = n();
        l();
        Thread thread = this.o;
        if (thread == null || thread.getState() == Thread.State.TERMINATED) {
            synchronized (this.a) {
                try {
                    Thread thread2 = this.o;
                    if (thread2 != null) {
                        if (thread2.getState() == Thread.State.TERMINATED) {
                        }
                    }
                    Thread thread3 = new Thread(this.p);
                    this.o = thread3;
                    thread3.setName(getClass().getName() + "#active");
                    this.o.start();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void k(Canvas canvas) {
        this.d.a(canvas, this.h, this.f, this.g);
    }

    public boolean m(MotionEvent motionEvent) {
        e eVar;
        e eVar2;
        if (this.h == 0.0f || j()) {
            return false;
        }
        if (this.d.i(motionEvent, true)) {
            if (this.f && (eVar2 = this.e) != null) {
                eVar2.onZoom(true);
            }
            return true;
        } else if (!this.d.i(motionEvent, false)) {
            return false;
        } else {
            if (this.g && (eVar = this.e) != null) {
                eVar.onZoom(false);
            }
            return true;
        }
    }

    public void o() {
        this.i = true;
        u();
    }

    public void p(e eVar) {
        this.e = eVar;
    }

    public void q(f fVar) {
        this.j = fVar;
        int i = d.a[fVar.ordinal()];
        if (i != 1) {
            if (i == 2 || i == 3) {
                this.h = 0.0f;
                return;
            }
            return;
        }
        this.h = 1.0f;
    }

    public void r(boolean z) {
        this.f = z;
    }

    public void s(boolean z) {
        this.g = z;
    }
}
