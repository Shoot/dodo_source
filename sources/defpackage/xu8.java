package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/* compiled from: QueryHandler.java */
/* renamed from: xu8  reason: default package */
/* loaded from: classes3.dex */
public class xu8 {
    private final vc6 a;
    private Timer d;
    private boolean c = false;
    private final List<uu8> b = new ArrayList();

    /* compiled from: QueryHandler.java */
    /* renamed from: xu8$a */
    /* loaded from: classes3.dex */
    private class a extends TimerTask {
        Logger a;
        long b;

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            if (xu8.this.c && xu8.this.a.d()) {
                synchronized (this) {
                    for (uu8 uu8Var : new ArrayList(xu8.this.b)) {
                        long currentTimeMillis = System.currentTimeMillis();
                        if (uu8Var.c() < currentTimeMillis && uu8Var.d()) {
                            try {
                                uu8Var.a();
                                uu8Var.e(uu8Var.b() + currentTimeMillis);
                            } catch (Exception e) {
                                uu8Var.e(currentTimeMillis + this.b);
                                Logger logger = this.a;
                                logger.error("Query failed with error " + e.getMessage(), (Throwable) e);
                            }
                        }
                    }
                }
            }
        }

        private a() {
            this.a = LoggerFactory.getLogger("QueryHandler.Scheduler");
            this.b = 30000L;
        }
    }

    public xu8(vc6 vc6Var) {
        this.a = vc6Var;
    }

    public synchronized void d(uu8 uu8Var) {
        this.b.add(uu8Var);
    }

    public synchronized void e() {
        Timer timer = this.d;
        if (timer != null) {
            timer.cancel();
            this.d = null;
        }
    }

    public synchronized void f() {
        this.c = true;
        if (this.d == null) {
            a aVar = new a();
            Timer timer = new Timer();
            this.d = timer;
            timer.schedule(aVar, 0L, 300L);
        }
    }
}
