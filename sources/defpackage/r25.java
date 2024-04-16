package defpackage;

import kotlin.Metadata;
import kotlin.Unit;
/* compiled from: InitialValueFlow.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0015\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0097Aø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Lr25;", "", "T", "Loz3;", "Lpz3;", "collector", "", "collect", "(Lpz3;Lcv1;)Ljava/lang/Object;", "a", "Loz3;", "flow", "<init>", "(Loz3;)V", "flowbinding-common_release"}, k = 1, mv = {1, 5, 1})
/* renamed from: r25  reason: default package */
/* loaded from: classes3.dex */
public final class r25<T> implements oz3<T> {
    private final oz3<T> a;

    /* JADX WARN: Multi-variable type inference failed */
    public r25(oz3<? extends T> oz3Var) {
        z65.h(oz3Var, "flow");
        this.a = oz3Var;
    }

    @Override // defpackage.oz3
    public Object collect(pz3<? super T> pz3Var, cv1<? super Unit> cv1Var) {
        return this.a.collect(pz3Var, cv1Var);
    }
}
