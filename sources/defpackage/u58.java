package defpackage;

import android.net.NetworkInfo;
import defpackage.evb;
import defpackage.s58;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PicassoExecutorService.java */
/* renamed from: u58  reason: default package */
/* loaded from: classes3.dex */
public class u58 extends ThreadPoolExecutor {

    /* compiled from: PicassoExecutorService.java */
    /* renamed from: u58$a */
    /* loaded from: classes3.dex */
    private static final class a extends FutureTask<zb0> implements Comparable<a> {
        private final zb0 a;

        a(zb0 zb0Var) {
            super(zb0Var, null);
            this.a = zb0Var;
        }

        @Override // java.lang.Comparable
        /* renamed from: a */
        public int compareTo(a aVar) {
            s58.f r = this.a.r();
            s58.f r2 = aVar.a.r();
            if (r == r2) {
                return this.a.a - aVar.a.a;
            }
            return r2.ordinal() - r.ordinal();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public u58() {
        super(3, 3, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new evb.c());
    }

    private void b(int i) {
        setCorePoolSize(i);
        setMaximumPoolSize(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void a(NetworkInfo networkInfo) {
        if (networkInfo != null && networkInfo.isConnectedOrConnecting()) {
            int type = networkInfo.getType();
            if (type != 0) {
                if (type != 1 && type != 6 && type != 9) {
                    b(3);
                    return;
                } else {
                    b(4);
                    return;
                }
            }
            int subtype = networkInfo.getSubtype();
            switch (subtype) {
                case 1:
                case 2:
                    b(1);
                    return;
                case 3:
                case 4:
                case 5:
                case 6:
                    break;
                default:
                    switch (subtype) {
                        case 12:
                            break;
                        case 13:
                        case 14:
                        case 15:
                            b(3);
                            return;
                        default:
                            b(3);
                            return;
                    }
            }
            b(2);
            return;
        }
        b(3);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public Future<?> submit(Runnable runnable) {
        a aVar = new a((zb0) runnable);
        execute(aVar);
        return aVar;
    }
}
