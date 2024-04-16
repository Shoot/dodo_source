package defpackage;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
/* compiled from: ValueHolders.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n¢\u0006\u0004\b\f\u0010\rR\u001b\u0010\u0007\u001a\u00028\u00008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006¨\u0006\u000e"}, d2 = {"Lgo5;", "T", "Lcua;", "a", "Lrn5;", "g", "()Ljava/lang/Object;", "current", "getValue", "value", "Lkotlin/Function0;", "valueProducer", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: go5  reason: default package */
/* loaded from: classes.dex */
public final class go5<T> implements cua<T> {
    private final rn5 a;

    public go5(Function0<? extends T> function0) {
        rn5 b;
        z65.h(function0, "valueProducer");
        b = yn5.b(function0);
        this.a = b;
    }

    private final T g() {
        return (T) this.a.getValue();
    }

    @Override // defpackage.cua
    public T getValue() {
        return g();
    }
}
