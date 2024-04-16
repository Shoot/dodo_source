package defpackage;

import com.huawei.hms.opendevice.c;
import defpackage.jm1;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
/* compiled from: SingleComponentDependenciesRegistry.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B+\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011¢\u0006\u0004\b\u0013\u0010\u0014J)\u0010\u0006\u001a\u00028\u0001\"\b\b\u0001\u0010\u0002*\u00020\u00012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00010\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001b\u0010\u0010\u001a\u00028\u00008FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\n\u0010\u000f¨\u0006\u0015"}, d2 = {"Lcma;", "Ljm1;", "T", "Lkm1;", "Lod5;", "clazz", "a", "(Lod5;)Ljm1;", "Lkm1;", "fallbackRegistry", "b", "Lod5;", "componentClass", c.a, "Lrn5;", "()Ljm1;", "component", "Lkotlin/Function0;", "componentCreator", "<init>", "(Lkm1;Lod5;Lkotlin/jvm/functions/Function0;)V", "di_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: cma  reason: default package */
/* loaded from: classes.dex */
public final class cma<T extends jm1> implements km1 {
    private final km1 a;
    private final od5<T> b;
    private final rn5 c;

    public cma(km1 km1Var, od5<T> od5Var, Function0<? extends T> function0) {
        rn5 b;
        z65.h(km1Var, "fallbackRegistry");
        z65.h(od5Var, "componentClass");
        z65.h(function0, "componentCreator");
        this.a = km1Var;
        this.b = od5Var;
        b = yn5.b(function0);
        this.c = b;
    }

    @Override // defpackage.km1
    public <T extends jm1> T a(od5<? extends T> od5Var) {
        z65.h(od5Var, "clazz");
        if (gd5.a(od5Var).isAssignableFrom(gd5.a(this.b))) {
            return (T) pd5.a(od5Var, b());
        }
        return (T) this.a.a(od5Var);
    }

    public final T b() {
        return (T) this.c.getValue();
    }
}
