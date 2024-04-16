package defpackage;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
/* compiled from: MindboxInjector.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u001b\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\f\u0010\rJ$\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0086\u0002¢\u0006\u0004\b\u0006\u0010\u0007R \u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00028\u00000\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\n¨\u0006\u000e"}, d2 = {"Lbk6;", "T", "", "thisRef", "Lje5;", "property", "a", "(Ljava/lang/Object;Lje5;)Ljava/lang/Object;", "Lkotlin/Function1;", "Lgo;", "Lkotlin/jvm/functions/Function1;", "initializer", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "sdk_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: bk6  reason: default package */
/* loaded from: classes.dex */
public final class bk6<T> {
    private final Function1<go, T> a;

    /* JADX WARN: Multi-variable type inference failed */
    public bk6(Function1<? super go, ? extends T> function1) {
        z65.h(function1, "initializer");
        this.a = function1;
    }

    public final T a(Object obj, je5<?> je5Var) {
        z65.h(obj, "thisRef");
        z65.h(je5Var, "property");
        return this.a.invoke(sj6.a.a());
    }
}
