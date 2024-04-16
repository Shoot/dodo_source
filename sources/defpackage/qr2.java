package defpackage;

import defpackage.t3b;
import java.util.concurrent.Executor;
import java.util.logging.Logger;
/* compiled from: DefaultScheduler.java */
/* renamed from: qr2  reason: default package */
/* loaded from: classes2.dex */
public class qr2 implements wv9 {
    private static final Logger f = Logger.getLogger(lmb.class.getName());
    private final t7c a;
    private final Executor b;
    private final a60 c;
    private final el3 d;
    private final t3b e;

    public qr2(Executor executor, a60 a60Var, t7c t7cVar, el3 el3Var, t3b t3bVar) {
        this.b = executor;
        this.c = a60Var;
        this.a = t7cVar;
        this.d = el3Var;
        this.e = t3bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object d(wlb wlbVar, wk3 wk3Var) {
        this.d.B1(wlbVar, wk3Var);
        this.a.a(wlbVar, 1);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(final wlb wlbVar, omb ombVar, wk3 wk3Var) {
        try {
            vlb vlbVar = this.c.get(wlbVar.b());
            if (vlbVar == null) {
                String format = String.format("Transport backend '%s' is not registered", wlbVar.b());
                f.warning(format);
                ombVar.a(new IllegalArgumentException(format));
                return;
            }
            final wk3 a = vlbVar.a(wk3Var);
            this.e.b(new t3b.a() { // from class: or2
                @Override // defpackage.t3b.a
                public final Object execute() {
                    Object d;
                    d = qr2.this.d(wlbVar, a);
                    return d;
                }
            });
            ombVar.a(null);
        } catch (Exception e) {
            Logger logger = f;
            logger.warning("Error scheduling event " + e.getMessage());
            ombVar.a(e);
        }
    }

    @Override // defpackage.wv9
    public void a(final wlb wlbVar, final wk3 wk3Var, final omb ombVar) {
        this.b.execute(new Runnable() { // from class: nr2
            @Override // java.lang.Runnable
            public final void run() {
                qr2.this.e(wlbVar, ombVar, wk3Var);
            }
        });
    }
}
