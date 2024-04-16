package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import android.util.SparseArray;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.MarkerOptions;
import defpackage.ja1;
import defpackage.ka1;
import defpackage.rg4;
import im.threads.ui.fragments.ChatFragment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.slf4j.Marker;
/* compiled from: DefaultClusterRenderer.java */
/* renamed from: kp2  reason: default package */
/* loaded from: classes.dex */
public class kp2<T extends ja1> implements la1<T> {
    private static final int[] q = {10, 20, 50, 100, ChatFragment.REQUEST_PERMISSION_BOTTOM_GALLERY_GALLERY, 500, 1000};
    private static final TimeInterpolator r = new DecelerateInterpolator();
    private final rg4 a;
    private final et4 b;
    private final ka1<T> c;
    private final float d;
    private ShapeDrawable f;
    private Set<? extends ia1<T>> k;
    private float m;
    private ka1.c<T> o;
    private ka1.e<T> p;
    private Set<i> g = Collections.newSetFromMap(new ConcurrentHashMap());
    private SparseArray<sb0> h = new SparseArray<>();
    private g<T> i = new g<>(null);
    private int j = 4;
    private g<ia1<T>> l = new g<>(null);
    private final kp2<T>.k n = new k(this, null);
    private boolean e = true;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DefaultClusterRenderer.java */
    /* renamed from: kp2$a */
    /* loaded from: classes.dex */
    public class a implements rg4.g {
        a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.rg4.g
        public boolean a(m86 m86Var) {
            if (kp2.this.p != null && kp2.this.p.a((ja1) kp2.this.i.b(m86Var))) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: DefaultClusterRenderer.java */
    /* renamed from: kp2$b */
    /* loaded from: classes.dex */
    class b implements rg4.e {
        b() {
        }

        @Override // defpackage.rg4.e
        public void g(m86 m86Var) {
            kp2.t(kp2.this);
        }
    }

    /* compiled from: DefaultClusterRenderer.java */
    /* renamed from: kp2$c */
    /* loaded from: classes.dex */
    class c implements rg4.g {
        c() {
        }

        @Override // defpackage.rg4.g
        public boolean a(m86 m86Var) {
            if (kp2.this.o != null && kp2.this.o.a((ia1) kp2.this.l.b(m86Var))) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: DefaultClusterRenderer.java */
    /* renamed from: kp2$d */
    /* loaded from: classes.dex */
    class d implements rg4.e {
        d() {
        }

        @Override // defpackage.rg4.e
        public void g(m86 m86Var) {
            kp2.w(kp2.this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DefaultClusterRenderer.java */
    @TargetApi(12)
    /* renamed from: kp2$e */
    /* loaded from: classes.dex */
    public class e extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {
        private final i a;
        private final m86 b;
        private final LatLng c;
        private final LatLng d;
        private boolean e;
        private p86 f;

        /* synthetic */ e(kp2 kp2Var, i iVar, LatLng latLng, LatLng latLng2, a aVar) {
            this(iVar, latLng, latLng2);
        }

        public void a() {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.setInterpolator(kp2.r);
            ofFloat.addUpdateListener(this);
            ofFloat.addListener(this);
            ofFloat.start();
        }

        public void b(p86 p86Var) {
            this.f = p86Var;
            this.e = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.e) {
                kp2.this.i.d(this.b);
                kp2.this.l.d(this.b);
                this.f.h(this.b);
            }
            this.a.b = this.d;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float animatedFraction = valueAnimator.getAnimatedFraction();
            LatLng latLng = this.d;
            double d = latLng.a;
            LatLng latLng2 = this.c;
            double d2 = latLng2.a;
            double d3 = animatedFraction;
            double d4 = ((d - d2) * d3) + d2;
            double d5 = latLng.b - latLng2.b;
            if (Math.abs(d5) > 180.0d) {
                d5 -= Math.signum(d5) * 360.0d;
            }
            this.b.h(new LatLng(d4, (d5 * d3) + this.c.b));
        }

        private e(i iVar, LatLng latLng, LatLng latLng2) {
            this.a = iVar;
            this.b = iVar.a;
            this.c = latLng;
            this.d = latLng2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DefaultClusterRenderer.java */
    /* renamed from: kp2$f */
    /* loaded from: classes.dex */
    public class f {
        private final ia1<T> a;
        private final Set<i> b;
        private final LatLng c;

        public f(ia1<T> ia1Var, Set<i> set, LatLng latLng) {
            this.a = ia1Var;
            this.b = set;
            this.c = latLng;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(kp2<T>.h hVar) {
            i iVar;
            i iVar2;
            if (!kp2.this.N(this.a)) {
                for (T t : this.a.c()) {
                    m86 a = kp2.this.i.a(t);
                    if (a == null) {
                        MarkerOptions markerOptions = new MarkerOptions();
                        LatLng latLng = this.c;
                        if (latLng != null) {
                            markerOptions.G(latLng);
                        } else {
                            markerOptions.G(t.getPosition());
                        }
                        kp2.this.H(t, markerOptions);
                        a = kp2.this.c.k().h(markerOptions);
                        iVar2 = new i(a, null);
                        kp2.this.i.c(t, a);
                        LatLng latLng2 = this.c;
                        if (latLng2 != null) {
                            hVar.b(iVar2, latLng2, t.getPosition());
                        }
                    } else {
                        iVar2 = new i(a, null);
                        kp2.this.K(t, a);
                    }
                    kp2.this.J(t, a);
                    this.b.add(iVar2);
                }
                return;
            }
            m86 a2 = kp2.this.l.a(this.a);
            if (a2 == null) {
                MarkerOptions markerOptions2 = new MarkerOptions();
                LatLng latLng3 = this.c;
                if (latLng3 == null) {
                    latLng3 = this.a.getPosition();
                }
                MarkerOptions G = markerOptions2.G(latLng3);
                kp2.this.I(this.a, G);
                a2 = kp2.this.c.j().h(G);
                kp2.this.l.c(this.a, a2);
                iVar = new i(a2, null);
                LatLng latLng4 = this.c;
                if (latLng4 != null) {
                    hVar.b(iVar, latLng4, this.a.getPosition());
                }
            } else {
                iVar = new i(a2, null);
                kp2.this.M(this.a, a2);
            }
            kp2.this.L(this.a, a2);
            this.b.add(iVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DefaultClusterRenderer.java */
    @SuppressLint({"HandlerLeak"})
    /* renamed from: kp2$h */
    /* loaded from: classes.dex */
    public class h extends Handler implements MessageQueue.IdleHandler {
        private final Lock a;
        private final Condition b;
        private Queue<kp2<T>.f> c;
        private Queue<kp2<T>.f> d;
        private Queue<m86> e;
        private Queue<m86> f;
        private Queue<kp2<T>.e> g;
        private boolean h;

        /* synthetic */ h(kp2 kp2Var, a aVar) {
            this();
        }

        @TargetApi(11)
        private void e() {
            if (!this.f.isEmpty()) {
                g(this.f.poll());
            } else if (!this.g.isEmpty()) {
                this.g.poll().a();
            } else if (!this.d.isEmpty()) {
                this.d.poll().b(this);
            } else if (!this.c.isEmpty()) {
                this.c.poll().b(this);
            } else if (!this.e.isEmpty()) {
                g(this.e.poll());
            }
        }

        private void g(m86 m86Var) {
            kp2.this.i.d(m86Var);
            kp2.this.l.d(m86Var);
            kp2.this.c.l().h(m86Var);
        }

        public void a(boolean z, kp2<T>.f fVar) {
            this.a.lock();
            sendEmptyMessage(0);
            if (z) {
                this.d.add(fVar);
            } else {
                this.c.add(fVar);
            }
            this.a.unlock();
        }

        public void b(i iVar, LatLng latLng, LatLng latLng2) {
            this.a.lock();
            this.g.add(new e(kp2.this, iVar, latLng, latLng2, null));
            this.a.unlock();
        }

        @TargetApi(11)
        public void c(i iVar, LatLng latLng, LatLng latLng2) {
            this.a.lock();
            kp2<T>.e eVar = new e(kp2.this, iVar, latLng, latLng2, null);
            eVar.b(kp2.this.c.l());
            this.g.add(eVar);
            this.a.unlock();
        }

        public boolean d() {
            boolean z;
            try {
                this.a.lock();
                if (this.c.isEmpty() && this.d.isEmpty() && this.f.isEmpty() && this.e.isEmpty()) {
                    if (this.g.isEmpty()) {
                        z = false;
                        return z;
                    }
                }
                z = true;
                return z;
            } finally {
                this.a.unlock();
            }
        }

        public void f(boolean z, m86 m86Var) {
            this.a.lock();
            sendEmptyMessage(0);
            if (z) {
                this.f.add(m86Var);
            } else {
                this.e.add(m86Var);
            }
            this.a.unlock();
        }

        public void h() {
            while (d()) {
                sendEmptyMessage(0);
                this.a.lock();
                try {
                    try {
                        if (d()) {
                            this.b.await();
                        }
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                } finally {
                    this.a.unlock();
                }
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (!this.h) {
                Looper.myQueue().addIdleHandler(this);
                this.h = true;
            }
            removeMessages(0);
            this.a.lock();
            for (int i = 0; i < 10; i++) {
                try {
                    e();
                } catch (Throwable th) {
                    this.a.unlock();
                    throw th;
                }
            }
            if (!d()) {
                this.h = false;
                Looper.myQueue().removeIdleHandler(this);
                this.b.signalAll();
            } else {
                sendEmptyMessageDelayed(0, 10L);
            }
            this.a.unlock();
        }

        @Override // android.os.MessageQueue.IdleHandler
        public boolean queueIdle() {
            sendEmptyMessage(0);
            return true;
        }

        private h() {
            super(Looper.getMainLooper());
            ReentrantLock reentrantLock = new ReentrantLock();
            this.a = reentrantLock;
            this.b = reentrantLock.newCondition();
            this.c = new LinkedList();
            this.d = new LinkedList();
            this.e = new LinkedList();
            this.f = new LinkedList();
            this.g = new LinkedList();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DefaultClusterRenderer.java */
    /* renamed from: kp2$i */
    /* loaded from: classes.dex */
    public static class i {
        private final m86 a;
        private LatLng b;

        /* synthetic */ i(m86 m86Var, a aVar) {
            this(m86Var);
        }

        public boolean equals(Object obj) {
            if (obj instanceof i) {
                return this.a.equals(((i) obj).a);
            }
            return false;
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        private i(m86 m86Var) {
            this.a = m86Var;
            this.b = m86Var.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DefaultClusterRenderer.java */
    /* renamed from: kp2$j */
    /* loaded from: classes.dex */
    public class j implements Runnable {
        final Set<? extends ia1<T>> a;
        private Runnable b;
        private gp8 c;
        private ura d;
        private float e;

        /* synthetic */ j(kp2 kp2Var, Set set, a aVar) {
            this(set);
        }

        public void a(Runnable runnable) {
            this.b = runnable;
        }

        public void b(float f) {
            this.e = f;
            this.d = new ura(Math.pow(2.0d, Math.min(f, kp2.this.m)) * 256.0d);
        }

        public void c(gp8 gp8Var) {
            this.c = gp8Var;
        }

        @Override // java.lang.Runnable
        @SuppressLint({"NewApi"})
        public void run() {
            boolean z;
            LatLngBounds a;
            ArrayList arrayList;
            if (this.a.equals(kp2.this.k)) {
                this.b.run();
                return;
            }
            ArrayList arrayList2 = null;
            h hVar = new h(kp2.this, null);
            float f = this.e;
            if (f > kp2.this.m) {
                z = true;
            } else {
                z = false;
            }
            float f2 = f - kp2.this.m;
            Set<i> set = kp2.this.g;
            try {
                a = this.c.a().e;
            } catch (Exception e) {
                e.printStackTrace();
                a = LatLngBounds.h().b(new LatLng(0.0d, 0.0d)).a();
            }
            if (kp2.this.k != null && kp2.this.e) {
                arrayList = new ArrayList();
                for (ia1<T> ia1Var : kp2.this.k) {
                    if (kp2.this.N(ia1Var) && a.k(ia1Var.getPosition())) {
                        arrayList.add(this.d.b(ia1Var.getPosition()));
                    }
                }
            } else {
                arrayList = null;
            }
            Set newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
            for (ia1<T> ia1Var2 : this.a) {
                boolean k = a.k(ia1Var2.getPosition());
                if (z && k && kp2.this.e) {
                    dd8 z2 = kp2.this.z(arrayList, this.d.b(ia1Var2.getPosition()));
                    if (z2 != null) {
                        hVar.a(true, new f(ia1Var2, newSetFromMap, this.d.a(z2)));
                    } else {
                        hVar.a(true, new f(ia1Var2, newSetFromMap, null));
                    }
                } else {
                    hVar.a(k, new f(ia1Var2, newSetFromMap, null));
                }
            }
            hVar.h();
            set.removeAll(newSetFromMap);
            if (kp2.this.e) {
                arrayList2 = new ArrayList();
                for (ia1<T> ia1Var3 : this.a) {
                    if (kp2.this.N(ia1Var3) && a.k(ia1Var3.getPosition())) {
                        arrayList2.add(this.d.b(ia1Var3.getPosition()));
                    }
                }
            }
            for (i iVar : set) {
                boolean k2 = a.k(iVar.b);
                if (!z && f2 > -3.0f && k2 && kp2.this.e) {
                    dd8 z3 = kp2.this.z(arrayList2, this.d.b(iVar.b));
                    if (z3 != null) {
                        hVar.c(iVar, iVar.b, this.d.a(z3));
                    } else {
                        hVar.f(true, iVar.a);
                    }
                } else {
                    hVar.f(k2, iVar.a);
                }
            }
            hVar.h();
            kp2.this.g = newSetFromMap;
            kp2.this.k = this.a;
            kp2.this.m = f;
            this.b.run();
        }

        private j(Set<? extends ia1<T>> set) {
            this.a = set;
        }
    }

    /* compiled from: DefaultClusterRenderer.java */
    @SuppressLint({"HandlerLeak"})
    /* renamed from: kp2$k */
    /* loaded from: classes.dex */
    private class k extends Handler {
        private boolean a;
        private kp2<T>.j b;

        /* compiled from: DefaultClusterRenderer.java */
        /* renamed from: kp2$k$a */
        /* loaded from: classes.dex */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                k.this.sendEmptyMessage(1);
            }
        }

        private k() {
            this.a = false;
            this.b = null;
        }

        public void a(Set<? extends ia1<T>> set) {
            synchronized (this) {
                this.b = new j(kp2.this, set, null);
            }
            sendEmptyMessage(0);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            kp2<T>.j jVar;
            if (message.what == 1) {
                this.a = false;
                if (this.b != null) {
                    sendEmptyMessage(0);
                    return;
                }
                return;
            }
            removeMessages(0);
            if (this.a || this.b == null) {
                return;
            }
            gp8 h = kp2.this.a.h();
            synchronized (this) {
                jVar = this.b;
                this.b = null;
                this.a = true;
            }
            jVar.a(new a());
            jVar.c(h);
            jVar.b(kp2.this.a.e().b);
            new Thread(jVar).start();
        }

        /* synthetic */ k(kp2 kp2Var, a aVar) {
            this();
        }
    }

    public kp2(Context context, rg4 rg4Var, ka1<T> ka1Var) {
        this.a = rg4Var;
        this.d = context.getResources().getDisplayMetrics().density;
        et4 et4Var = new et4(context);
        this.b = et4Var;
        et4Var.g(G(context));
        et4Var.i(j19.amu_ClusterIcon_TextAppearance);
        et4Var.e(F());
        this.c = ka1Var;
    }

    private LayerDrawable F() {
        this.f = new ShapeDrawable(new OvalShape());
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.getPaint().setColor(-2130706433);
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{shapeDrawable, this.f});
        int i2 = (int) (this.d * 3.0f);
        layerDrawable.setLayerInset(1, i2, i2, i2, i2);
        return layerDrawable;
    }

    private psa G(Context context) {
        psa psaVar = new psa(context);
        psaVar.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        psaVar.setId(my8.amu_text);
        int i2 = (int) (this.d * 12.0f);
        psaVar.setPadding(i2, i2, i2, i2);
        return psaVar;
    }

    static /* synthetic */ ka1.f t(kp2 kp2Var) {
        kp2Var.getClass();
        return null;
    }

    static /* synthetic */ ka1.d w(kp2 kp2Var) {
        kp2Var.getClass();
        return null;
    }

    private static double y(dd8 dd8Var, dd8 dd8Var2) {
        double d2 = dd8Var.a;
        double d3 = dd8Var2.a;
        double d4 = (d2 - d3) * (d2 - d3);
        double d5 = dd8Var.b;
        double d6 = dd8Var2.b;
        return d4 + ((d5 - d6) * (d5 - d6));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public dd8 z(List<dd8> list, dd8 dd8Var) {
        dd8 dd8Var2 = null;
        if (list != null && !list.isEmpty()) {
            int f2 = this.c.i().f();
            double d2 = f2 * f2;
            for (dd8 dd8Var3 : list) {
                double y = y(dd8Var3, dd8Var);
                if (y < d2) {
                    dd8Var2 = dd8Var3;
                    d2 = y;
                }
            }
        }
        return dd8Var2;
    }

    protected int A(ia1<T> ia1Var) {
        int a2 = ia1Var.a();
        int i2 = 0;
        if (a2 <= q[0]) {
            return a2;
        }
        while (true) {
            int[] iArr = q;
            if (i2 < iArr.length - 1) {
                int i3 = i2 + 1;
                if (a2 < iArr[i3]) {
                    return iArr[i2];
                }
                i2 = i3;
            } else {
                return iArr[iArr.length - 1];
            }
        }
    }

    protected String B(int i2) {
        if (i2 < q[0]) {
            return String.valueOf(i2);
        }
        return i2 + Marker.ANY_NON_NULL_MARKER;
    }

    protected int C(int i2) {
        float min = 300.0f - Math.min(i2, 300.0f);
        return Color.HSVToColor(new float[]{((min * min) / 90000.0f) * 220.0f, 1.0f, 0.6f});
    }

    protected sb0 D(ia1<T> ia1Var) {
        int A = A(ia1Var);
        sb0 sb0Var = this.h.get(A);
        if (sb0Var == null) {
            this.f.getPaint().setColor(C(A));
            sb0 b2 = tb0.b(this.b.d(B(A)));
            this.h.put(A, b2);
            return b2;
        }
        return sb0Var;
    }

    public m86 E(T t) {
        return this.i.a(t);
    }

    protected void H(T t, MarkerOptions markerOptions) {
        if (t.getTitle() != null && t.a() != null) {
            markerOptions.J(t.getTitle());
            markerOptions.I(t.a());
        } else if (t.getTitle() != null) {
            markerOptions.J(t.getTitle());
        } else if (t.a() != null) {
            markerOptions.J(t.a());
        }
    }

    protected void I(ia1<T> ia1Var, MarkerOptions markerOptions) {
        markerOptions.C(D(ia1Var));
    }

    protected void K(T t, m86 m86Var) {
        boolean z = true;
        boolean z2 = false;
        if (t.getTitle() != null && t.a() != null) {
            if (!t.getTitle().equals(m86Var.d())) {
                m86Var.l(t.getTitle());
                z2 = true;
            }
            if (!t.a().equals(m86Var.b())) {
                m86Var.j(t.a());
            } else {
                z = z2;
            }
        } else if (t.a() != null && !t.a().equals(m86Var.d())) {
            m86Var.l(t.a());
        } else if (t.getTitle() != null && !t.getTitle().equals(m86Var.d())) {
            m86Var.l(t.getTitle());
        } else {
            z = false;
        }
        if (!m86Var.a().equals(t.getPosition())) {
            m86Var.h(t.getPosition());
        } else if (!z) {
            return;
        }
        if (m86Var.e()) {
            m86Var.m();
        }
    }

    protected void M(ia1<T> ia1Var, m86 m86Var) {
        m86Var.g(D(ia1Var));
    }

    protected boolean N(ia1<T> ia1Var) {
        if (ia1Var.a() > this.j) {
            return true;
        }
        return false;
    }

    @Override // defpackage.la1
    public void a() {
        this.c.k().j(new a());
        this.c.k().i(new b());
        this.c.j().j(new c());
        this.c.j().i(new d());
    }

    @Override // defpackage.la1
    public void b(ka1.c<T> cVar) {
        this.o = cVar;
    }

    @Override // defpackage.la1
    public void e() {
        this.c.k().j(null);
        this.c.k().i(null);
        this.c.j().j(null);
        this.c.j().i(null);
    }

    @Override // defpackage.la1
    public void f(ka1.e<T> eVar) {
        this.p = eVar;
    }

    @Override // defpackage.la1
    public void g(Set<? extends ia1<T>> set) {
        this.n.a(set);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DefaultClusterRenderer.java */
    /* renamed from: kp2$g */
    /* loaded from: classes.dex */
    public static class g<T> {
        private Map<T, m86> a;
        private Map<m86, T> b;

        private g() {
            this.a = new HashMap();
            this.b = new HashMap();
        }

        public m86 a(T t) {
            return this.a.get(t);
        }

        public T b(m86 m86Var) {
            return this.b.get(m86Var);
        }

        public void c(T t, m86 m86Var) {
            this.a.put(t, m86Var);
            this.b.put(m86Var, t);
        }

        public void d(m86 m86Var) {
            T t = this.b.get(m86Var);
            this.b.remove(m86Var);
            this.a.remove(t);
        }

        /* synthetic */ g(a aVar) {
            this();
        }
    }

    @Override // defpackage.la1
    public void c(ka1.d<T> dVar) {
    }

    @Override // defpackage.la1
    public void d(ka1.f<T> fVar) {
    }

    protected void J(T t, m86 m86Var) {
    }

    protected void L(ia1<T> ia1Var, m86 m86Var) {
    }
}
