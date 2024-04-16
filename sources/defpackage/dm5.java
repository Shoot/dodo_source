package defpackage;

import ch.qos.logback.core.joran.action.Action;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
/* compiled from: Effects.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B6\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\"\u0010\u000b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016R3\u0010\u000b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00068\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0003\u0010\nR\u0014\u0010\r\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\fR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Ldm5;", "Lxc9;", "", "a", c.a, "b", "Lkotlin/Function2;", "Lqx1;", "Lcv1;", "", "Lkotlin/jvm/functions/Function2;", "task", "Lqx1;", Action.SCOPE_ATTRIBUTE, "Ll95;", "Ll95;", "job", "Lkotlin/coroutines/CoroutineContext;", "parentCoroutineContext", "<init>", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: dm5  reason: default package */
/* loaded from: classes.dex */
public final class dm5 implements xc9 {
    private final Function2<qx1, cv1<? super Unit>, Object> a;
    private final qx1 b;
    private l95 c;

    /* JADX WARN: Multi-variable type inference failed */
    public dm5(CoroutineContext coroutineContext, Function2<? super qx1, ? super cv1<? super Unit>, ? extends Object> function2) {
        z65.h(coroutineContext, "parentCoroutineContext");
        z65.h(function2, "task");
        this.a = function2;
        this.b = rx1.a(coroutineContext);
    }

    @Override // defpackage.xc9
    public void a() {
        l95 l95Var = this.c;
        if (l95Var != null) {
            s95.e(l95Var, "Old job was still running!", null, 2, null);
        }
        this.c = qh0.d(this.b, null, null, this.a, 3, null);
    }

    @Override // defpackage.xc9
    public void b() {
        l95 l95Var = this.c;
        if (l95Var != null) {
            l95Var.a(new jo5());
        }
        this.c = null;
    }

    @Override // defpackage.xc9
    public void c() {
        l95 l95Var = this.c;
        if (l95Var != null) {
            l95Var.a(new jo5());
        }
        this.c = null;
    }
}
