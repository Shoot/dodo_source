package defpackage;

import android.app.Activity;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.SparseIntArray;
import android.view.FrameMetrics;
import android.view.Window;
import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: FrameMetricsAggregator.java */
/* renamed from: e74  reason: default package */
/* loaded from: classes.dex */
public class e74 {
    private final b a;

    /* compiled from: FrameMetricsAggregator.java */
    /* renamed from: e74$a */
    /* loaded from: classes.dex */
    private static class a extends b {
        private static HandlerThread e;
        private static Handler f;
        int a;
        SparseIntArray[] b = new SparseIntArray[9];
        private final ArrayList<WeakReference<Activity>> c = new ArrayList<>();
        Window.OnFrameMetricsAvailableListener d = new Window$OnFrameMetricsAvailableListenerC0300a();

        /* compiled from: FrameMetricsAggregator.java */
        /* renamed from: e74$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class Window$OnFrameMetricsAvailableListenerC0300a implements Window.OnFrameMetricsAvailableListener {
            Window$OnFrameMetricsAvailableListenerC0300a() {
            }

            @Override // android.view.Window.OnFrameMetricsAvailableListener
            public void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i) {
                a aVar = a.this;
                if ((aVar.a & 1) != 0) {
                    aVar.e(aVar.b[0], frameMetrics.getMetric(8));
                }
                a aVar2 = a.this;
                if ((aVar2.a & 2) != 0) {
                    aVar2.e(aVar2.b[1], frameMetrics.getMetric(1));
                }
                a aVar3 = a.this;
                if ((aVar3.a & 4) != 0) {
                    aVar3.e(aVar3.b[2], frameMetrics.getMetric(3));
                }
                a aVar4 = a.this;
                if ((aVar4.a & 8) != 0) {
                    aVar4.e(aVar4.b[3], frameMetrics.getMetric(4));
                }
                a aVar5 = a.this;
                if ((aVar5.a & 16) != 0) {
                    aVar5.e(aVar5.b[4], frameMetrics.getMetric(5));
                }
                a aVar6 = a.this;
                if ((aVar6.a & 64) != 0) {
                    aVar6.e(aVar6.b[6], frameMetrics.getMetric(7));
                }
                a aVar7 = a.this;
                if ((aVar7.a & 32) != 0) {
                    aVar7.e(aVar7.b[5], frameMetrics.getMetric(6));
                }
                a aVar8 = a.this;
                if ((aVar8.a & 128) != 0) {
                    aVar8.e(aVar8.b[7], frameMetrics.getMetric(0));
                }
                a aVar9 = a.this;
                if ((aVar9.a & 256) != 0) {
                    aVar9.e(aVar9.b[8], frameMetrics.getMetric(2));
                }
            }
        }

        a(int i) {
            this.a = i;
        }

        @Override // defpackage.e74.b
        public void a(Activity activity) {
            if (e == null) {
                HandlerThread handlerThread = new HandlerThread("FrameMetricsAggregator");
                e = handlerThread;
                handlerThread.start();
                f = new Handler(e.getLooper());
            }
            for (int i = 0; i <= 8; i++) {
                SparseIntArray[] sparseIntArrayArr = this.b;
                if (sparseIntArrayArr[i] == null && (this.a & (1 << i)) != 0) {
                    sparseIntArrayArr[i] = new SparseIntArray();
                }
            }
            activity.getWindow().addOnFrameMetricsAvailableListener(this.d, f);
            this.c.add(new WeakReference<>(activity));
        }

        @Override // defpackage.e74.b
        public SparseIntArray[] b() {
            return this.b;
        }

        @Override // defpackage.e74.b
        public SparseIntArray[] c(Activity activity) {
            Iterator<WeakReference<Activity>> it = this.c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                WeakReference<Activity> next = it.next();
                if (next.get() == activity) {
                    this.c.remove(next);
                    break;
                }
            }
            activity.getWindow().removeOnFrameMetricsAvailableListener(this.d);
            return this.b;
        }

        @Override // defpackage.e74.b
        public SparseIntArray[] d() {
            SparseIntArray[] sparseIntArrayArr = this.b;
            this.b = new SparseIntArray[9];
            return sparseIntArrayArr;
        }

        void e(SparseIntArray sparseIntArray, long j) {
            if (sparseIntArray != null) {
                int i = (int) ((500000 + j) / 1000000);
                if (j >= 0) {
                    sparseIntArray.put(i, sparseIntArray.get(i) + 1);
                }
            }
        }
    }

    public e74() {
        this(1);
    }

    public void a(@NonNull Activity activity) {
        this.a.a(activity);
    }

    public SparseIntArray[] b() {
        return this.a.b();
    }

    public SparseIntArray[] c(@NonNull Activity activity) {
        return this.a.c(activity);
    }

    public SparseIntArray[] d() {
        return this.a.d();
    }

    public e74(int i) {
        if (Build.VERSION.SDK_INT >= 24) {
            this.a = new a(i);
        } else {
            this.a = new b();
        }
    }

    /* compiled from: FrameMetricsAggregator.java */
    /* renamed from: e74$b */
    /* loaded from: classes.dex */
    private static class b {
        b() {
        }

        public SparseIntArray[] b() {
            return null;
        }

        public SparseIntArray[] c(Activity activity) {
            return null;
        }

        public SparseIntArray[] d() {
            return null;
        }

        public void a(Activity activity) {
        }
    }
}
