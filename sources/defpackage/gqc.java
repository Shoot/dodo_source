package defpackage;

import com.google.android.gms.internal.measurement.r0;
import com.google.android.gms.internal.measurement.s0;
import com.google.android.gms.internal.measurement.t0;
import com.google.android.gms.internal.measurement.zzc;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* renamed from: gqc  reason: default package */
/* loaded from: classes2.dex */
public final class gqc {
    private final exc a;
    private xzc b;
    wmc c;
    private final kmc d;

    public gqc() {
        this(new exc());
    }

    public final wmc a() {
        return this.c;
    }

    public final void b(s0 s0Var) throws zzc {
        ioc iocVar;
        try {
            this.b = this.a.b.d();
            if (!(this.a.a(this.b, (t0[]) s0Var.J().toArray(new t0[0])) instanceof doc)) {
                for (r0 r0Var : s0Var.H().J()) {
                    List<t0> J = r0Var.J();
                    String I = r0Var.I();
                    Iterator<t0> it = J.iterator();
                    while (it.hasNext()) {
                        bpc a = this.a.a(this.b, it.next());
                        if (a instanceof yoc) {
                            xzc xzcVar = this.b;
                            if (!xzcVar.g(I)) {
                                iocVar = null;
                            } else {
                                bpc a2 = xzcVar.a(I);
                                if (a2 instanceof ioc) {
                                    iocVar = (ioc) a2;
                                } else {
                                    throw new IllegalStateException("Invalid function name: " + I);
                                }
                            }
                            if (iocVar != null) {
                                iocVar.b(this.b, Collections.singletonList(a));
                            } else {
                                throw new IllegalStateException("Rule function is undefined: " + I);
                            }
                        } else {
                            throw new IllegalArgumentException("Invalid rule definition");
                        }
                    }
                }
                return;
            }
            throw new IllegalStateException("Program loading failed");
        } catch (Throwable th) {
            throw new zzc(th);
        }
    }

    public final void c(String str, Callable<? extends ioc> callable) {
        this.a.b(str, callable);
    }

    public final boolean d(dnc dncVar) throws zzc {
        try {
            this.c.c(dncVar);
            this.a.c.h("runtime.counter", new znc(Double.valueOf(0.0d)));
            this.d.c(this.b.d(), this.c);
            if (!g()) {
                if (!f()) {
                    return false;
                }
                return true;
            }
            return true;
        } catch (Throwable th) {
            throw new zzc(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ ioc e() throws Exception {
        return new qbd(this.d);
    }

    public final boolean f() {
        if (!this.c.f().isEmpty()) {
            return true;
        }
        return false;
    }

    public final boolean g() {
        if (!this.c.d().equals(this.c.a())) {
            return true;
        }
        return false;
    }

    private gqc(exc excVar) {
        this.a = excVar;
        this.b = excVar.b.d();
        this.c = new wmc();
        this.d = new kmc();
        excVar.b("internal.registerCallback", new Callable() { // from class: plc
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return gqc.this.e();
            }
        });
        excVar.b("internal.eventLogger", new Callable() { // from class: nuc
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new y2d(gqc.this.c);
            }
        });
    }
}
