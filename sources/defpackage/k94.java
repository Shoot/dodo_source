package defpackage;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
/* compiled from: Fsm.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003Bw\u0012n\u0010\u0015\u001aj\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0005\u0012X\u0012V\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\u0012D\u0012B\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u00124\u00122\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u0001\u0012\u0012\u0012\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b0\u0007j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\t0\u00040\u00040\u0004¢\u0006\u0004\b\u0016\u0010\u0017Jq\u0010\n\u001aj\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0005\u0012X\u0012V\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\u0012D\u0012B\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u00124\u00122\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u0001\u0012\u0012\u0012\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b0\u0007j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\t0\u00040\u00040\u0004HÆ\u0003J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÖ\u0003R\u007f\u0010\u0015\u001aj\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0005\u0012X\u0012V\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\u0012D\u0012B\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u00124\u00122\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u0001\u0012\u0012\u0012\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b0\u0007j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\t0\u00040\u00040\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Lk94;", "S", "D", "", "", "Ljava/lang/Class;", "Lok3;", "Lkotlin/Function2;", "Lbua;", "Lru/dodopizza/app/infrastracture/functional/StateFunction;", "a", "", "toString", "", "hashCode", "other", "", "equals", "Ljava/util/Map;", "getHandled", "()Ljava/util/Map;", "handled", "<init>", "(Ljava/util/Map;)V", "statemachine_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: k94  reason: default package */
/* loaded from: classes4.dex */
public final class k94<S, D> {
    private final Map<Class<? extends S>, Map<Class<? extends ok3>, Map<Class<?>, Function2<ok3, D, bua<? extends S, D>>>>> a;

    /* JADX WARN: Multi-variable type inference failed */
    public k94(Map<Class<? extends S>, ? extends Map<Class<? extends ok3>, ? extends Map<Class<?>, ? extends Function2<? super ok3, ? super D, ? extends bua<? extends S, D>>>>> map) {
        z65.h(map, "handled");
        this.a = map;
    }

    public final Map<Class<? extends S>, Map<Class<? extends ok3>, Map<Class<?>, Function2<ok3, D, bua<? extends S, D>>>>> a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof k94) && z65.c(this.a, ((k94) obj).a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        Map<Class<? extends S>, Map<Class<? extends ok3>, Map<Class<?>, Function2<ok3, D, bua<? extends S, D>>>>> map = this.a;
        return "FunctionIndex(handled=" + map + ")";
    }
}
