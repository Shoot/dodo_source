package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.core.os.OperationCanceledException;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
/* compiled from: AsyncTaskLoader.java */
/* renamed from: jy  reason: default package */
/* loaded from: classes.dex */
public abstract class jy<D> extends wr5<D> {
    private final Executor i;
    volatile jy<D>.a j;
    volatile jy<D>.a k;
    long l;
    long m;
    Handler n;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AsyncTaskLoader.java */
    /* renamed from: jy$a */
    /* loaded from: classes.dex */
    public final class a extends qm6<Void, Void, D> implements Runnable {
        private final CountDownLatch k = new CountDownLatch(1);
        boolean l;

        a() {
        }

        @Override // defpackage.qm6
        protected void h(D d) {
            try {
                jy.this.x(this, d);
            } finally {
                this.k.countDown();
            }
        }

        @Override // defpackage.qm6
        protected void i(D d) {
            try {
                jy.this.y(this, d);
            } finally {
                this.k.countDown();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // defpackage.qm6
        /* renamed from: n */
        public D b(Void... voidArr) {
            try {
                return (D) jy.this.C();
            } catch (OperationCanceledException e) {
                if (f()) {
                    return null;
                }
                throw e;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            this.l = false;
            jy.this.z();
        }
    }

    public jy(@NonNull Context context) {
        this(context, qm6.h);
    }

    public abstract D A();

    protected D C() {
        return A();
    }

    @Override // defpackage.wr5
    @Deprecated
    public void g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.g(str, fileDescriptor, printWriter, strArr);
        if (this.j != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.j);
            printWriter.print(" waiting=");
            printWriter.println(this.j.l);
        }
        if (this.k != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.k);
            printWriter.print(" waiting=");
            printWriter.println(this.k.l);
        }
        if (this.l != 0) {
            printWriter.print(str);
            printWriter.print("mUpdateThrottle=");
            tgb.c(this.l, printWriter);
            printWriter.print(" mLastLoadCompleteTime=");
            tgb.b(this.m, SystemClock.uptimeMillis(), printWriter);
            printWriter.println();
        }
    }

    @Override // defpackage.wr5
    protected boolean k() {
        if (this.j == null) {
            return false;
        }
        if (!this.d) {
            this.g = true;
        }
        if (this.k != null) {
            if (this.j.l) {
                this.j.l = false;
                this.n.removeCallbacks(this.j);
            }
            this.j = null;
            return false;
        } else if (this.j.l) {
            this.j.l = false;
            this.n.removeCallbacks(this.j);
            this.j = null;
            return false;
        } else {
            boolean a2 = this.j.a(false);
            if (a2) {
                this.k = this.j;
                w();
            }
            this.j = null;
            return a2;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.wr5
    public void m() {
        super.m();
        b();
        this.j = new a();
        z();
    }

    void x(jy<D>.a aVar, D d) {
        B(d);
        if (this.k == aVar) {
            s();
            this.m = SystemClock.uptimeMillis();
            this.k = null;
            e();
            z();
        }
    }

    void y(jy<D>.a aVar, D d) {
        if (this.j != aVar) {
            x(aVar, d);
        } else if (i()) {
            B(d);
        } else {
            c();
            this.m = SystemClock.uptimeMillis();
            this.j = null;
            f(d);
        }
    }

    void z() {
        if (this.k == null && this.j != null) {
            if (this.j.l) {
                this.j.l = false;
                this.n.removeCallbacks(this.j);
            }
            if (this.l > 0 && SystemClock.uptimeMillis() < this.m + this.l) {
                this.j.l = true;
                this.n.postAtTime(this.j, this.m + this.l);
                return;
            }
            this.j.c(this.i, null);
        }
    }

    private jy(@NonNull Context context, @NonNull Executor executor) {
        super(context);
        this.m = -10000L;
        this.i = executor;
    }

    public void w() {
    }

    public void B(D d) {
    }
}
