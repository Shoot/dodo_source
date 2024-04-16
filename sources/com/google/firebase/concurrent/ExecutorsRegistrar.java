package com.google.firebase.concurrent;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.StrictMode;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
@SuppressLint({"ThreadPoolCreation"})
/* loaded from: classes2.dex */
public class ExecutorsRegistrar implements ComponentRegistrar {
    static final qn5<ScheduledExecutorService> a = new qn5<>(new bs8() { // from class: mm3
        @Override // defpackage.bs8
        public final Object get() {
            ScheduledExecutorService p;
            p = ExecutorsRegistrar.p();
            return p;
        }
    });
    static final qn5<ScheduledExecutorService> b = new qn5<>(new bs8() { // from class: nm3
        @Override // defpackage.bs8
        public final Object get() {
            ScheduledExecutorService q;
            q = ExecutorsRegistrar.q();
            return q;
        }
    });
    static final qn5<ScheduledExecutorService> c = new qn5<>(new bs8() { // from class: om3
        @Override // defpackage.bs8
        public final Object get() {
            ScheduledExecutorService r;
            r = ExecutorsRegistrar.r();
            return r;
        }
    });
    static final qn5<ScheduledExecutorService> d = new qn5<>(new bs8() { // from class: pm3
        @Override // defpackage.bs8
        public final Object get() {
            ScheduledExecutorService s;
            s = ExecutorsRegistrar.s();
            return s;
        }
    });

    private static StrictMode.ThreadPolicy i() {
        StrictMode.ThreadPolicy.Builder detectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            detectNetwork.detectResourceMismatches();
            if (i >= 26) {
                detectNetwork.detectUnbufferedIo();
            }
        }
        return detectNetwork.penaltyLog().build();
    }

    private static ThreadFactory j(String str, int i) {
        return new b(str, i, null);
    }

    private static ThreadFactory k(String str, int i, StrictMode.ThreadPolicy threadPolicy) {
        return new b(str, i, threadPolicy);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService l(im1 im1Var) {
        return a.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService m(im1 im1Var) {
        return c.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService n(im1 im1Var) {
        return b.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Executor o(im1 im1Var) {
        return zpb.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService p() {
        return u(Executors.newFixedThreadPool(4, k("Firebase Background", 10, i())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService q() {
        return u(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), k("Firebase Lite", 0, t())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService r() {
        return u(Executors.newCachedThreadPool(j("Firebase Blocking", 11)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService s() {
        return Executors.newSingleThreadScheduledExecutor(j("Firebase Scheduler", 0));
    }

    private static StrictMode.ThreadPolicy t() {
        return new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build();
    }

    private static ScheduledExecutorService u(ExecutorService executorService) {
        return new o(executorService, d.get());
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<bm1<?>> getComponents() {
        return Arrays.asList(bm1.d(su8.a(d60.class, ScheduledExecutorService.class), su8.a(d60.class, ExecutorService.class), su8.a(d60.class, Executor.class)).f(new rm1() { // from class: qm3
            @Override // defpackage.rm1
            public final Object a(im1 im1Var) {
                ScheduledExecutorService l;
                l = ExecutorsRegistrar.l(im1Var);
                return l;
            }
        }).d(), bm1.d(su8.a(rd0.class, ScheduledExecutorService.class), su8.a(rd0.class, ExecutorService.class), su8.a(rd0.class, Executor.class)).f(new rm1() { // from class: rm3
            @Override // defpackage.rm1
            public final Object a(im1 im1Var) {
                ScheduledExecutorService m;
                m = ExecutorsRegistrar.m(im1Var);
                return m;
            }
        }).d(), bm1.d(su8.a(sp5.class, ScheduledExecutorService.class), su8.a(sp5.class, ExecutorService.class), su8.a(sp5.class, Executor.class)).f(new rm1() { // from class: sm3
            @Override // defpackage.rm1
            public final Object a(im1 im1Var) {
                ScheduledExecutorService n;
                n = ExecutorsRegistrar.n(im1Var);
                return n;
            }
        }).d(), bm1.c(su8.a(bqb.class, Executor.class)).f(new rm1() { // from class: tm3
            @Override // defpackage.rm1
            public final Object a(im1 im1Var) {
                Executor o;
                o = ExecutorsRegistrar.o(im1Var);
                return o;
            }
        }).d());
    }
}
