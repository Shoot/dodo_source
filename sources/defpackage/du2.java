package defpackage;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DelegatingComponentDependenciesRegistry.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\f\u0010\rJ)\u0010\u0006\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\n¨\u0006\u000e"}, d2 = {"Ldu2;", "Lkm1;", "Ljm1;", "T", "Lod5;", "clazz", "a", "(Lod5;)Ljm1;", "Lkotlin/Function0;", "Llm1;", "Lkotlin/jvm/functions/Function0;", "provideDelegate", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "di_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: du2  reason: default package */
/* loaded from: classes.dex */
public final class du2 implements km1 {
    private final Function0<lm1> a;

    /* JADX WARN: Multi-variable type inference failed */
    public du2(Function0<? extends lm1> function0) {
        z65.h(function0, "provideDelegate");
        this.a = function0;
    }

    @Override // defpackage.km1
    public <T extends jm1> T a(od5<? extends T> od5Var) {
        z65.h(od5Var, "clazz");
        return (T) this.a.invoke().getComponentDependenciesRegistry().a(od5Var);
    }
}
