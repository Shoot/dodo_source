package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.sk9;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
/* compiled from: DispatchedTask.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b \u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00060\u0002j\u0002`\u0003B\u000f\u0012\u0006\u0010\u0019\u001a\u00020\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H ¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\u000b\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\bH\u0010¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000e\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00012\b\u0010\r\u001a\u0004\u0018\u00010\u0004H\u0010¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0010\u001a\u0004\u0018\u00010\b2\b\u0010\r\u001a\u0004\u0018\u00010\u0004H\u0010¢\u0006\u0004\b\u0010\u0010\u0011J\u0006\u0010\u0012\u001a\u00020\nJ\u001a\u0010\u0015\u001a\u00020\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\bR\u0016\u0010\u0019\u001a\u00020\u00168\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a8 X \u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u001b¨\u0006\u001f"}, d2 = {"Lq33;", "T", "Lw6b;", "Lkotlinx/coroutines/SchedulerTask;", "", Image.TYPE_HIGH, "()Ljava/lang/Object;", "takenState", "", "cause", "", "a", "(Ljava/lang/Object;Ljava/lang/Throwable;)V", "state", "f", "(Ljava/lang/Object;)Ljava/lang/Object;", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/Object;)Ljava/lang/Throwable;", "run", "exception", "finallyException", "g", "", c.a, "I", "resumeMode", "Lcv1;", "()Lcv1;", "delegate", "<init>", "(I)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* renamed from: q33  reason: default package */
/* loaded from: classes3.dex */
public abstract class q33<T> extends w6b {
    public int c;

    public q33(int i) {
        this.c = i;
    }

    public abstract cv1<T> c();

    public Throwable d(Object obj) {
        il1 il1Var;
        if (obj instanceof il1) {
            il1Var = (il1) obj;
        } else {
            il1Var = null;
        }
        if (il1Var == null) {
            return null;
        }
        return il1Var.a;
    }

    public final void g(Throwable th, Throwable th2) {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            vl3.a(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        z65.e(th);
        nx1.a(c().getContext(), new vx1("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract Object h();

    @Override // java.lang.Runnable
    public final void run() {
        Object b;
        jqb<?> jqbVar;
        l95 l95Var;
        Object b2;
        b7b b7bVar = this.b;
        try {
            n33 n33Var = (n33) c();
            cv1<T> cv1Var = n33Var.e;
            Object obj = n33Var.g;
            CoroutineContext context = cv1Var.getContext();
            Object c = wdb.c(context, obj);
            if (c != wdb.a) {
                jqbVar = jx1.g(cv1Var, context, c);
            } else {
                jqbVar = null;
            }
            CoroutineContext context2 = cv1Var.getContext();
            Object h = h();
            Throwable d = d(h);
            if (d == null && r33.b(this.c)) {
                l95Var = (l95) context2.c(l95.M);
            } else {
                l95Var = null;
            }
            if (l95Var != null && !l95Var.b()) {
                CancellationException q = l95Var.q();
                a(h, q);
                sk9.a aVar = sk9.b;
                cv1Var.resumeWith(sk9.b(vk9.a(q)));
            } else if (d != null) {
                sk9.a aVar2 = sk9.b;
                cv1Var.resumeWith(sk9.b(vk9.a(d)));
            } else {
                sk9.a aVar3 = sk9.b;
                cv1Var.resumeWith(sk9.b(f(h)));
            }
            Unit unit = Unit.a;
            if (jqbVar == null || jqbVar.h1()) {
                wdb.a(context, c);
            }
            try {
                b7bVar.a();
                b2 = sk9.b(Unit.a);
            } catch (Throwable th) {
                sk9.a aVar4 = sk9.b;
                b2 = sk9.b(vk9.a(th));
            }
            g(null, sk9.d(b2));
        } catch (Throwable th2) {
            try {
                sk9.a aVar5 = sk9.b;
                b7bVar.a();
                b = sk9.b(Unit.a);
            } catch (Throwable th3) {
                sk9.a aVar6 = sk9.b;
                b = sk9.b(vk9.a(th3));
            }
            g(th2, sk9.d(b));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T f(Object obj) {
        return obj;
    }

    public void a(Object obj, Throwable th) {
    }
}
