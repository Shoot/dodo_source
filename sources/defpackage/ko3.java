package defpackage;

import com.huawei.hms.opendevice.c;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
/* compiled from: Fsm.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0002:\u0001\tB\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0014\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0002J&\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006R\u007f\u0010\u0013\u001aj\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u000b\u0012X\u0012V\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\r0\u000b\u0012D\u0012B\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b\u00124\u00122\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00028\u0001\u0012\u0012\u0012\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060\u000ej\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u000f0\f0\f0\n8\u0006¢\u0006\f\n\u0004\b\t\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lko3;", "STATE", "", "DATA", "Lk94;", "b", "Lbua;", "startState", "Llo3;", "a", "", "Ljava/lang/Class;", "", "Lok3;", "Lkotlin/Function2;", "Lru/dodopizza/app/infrastracture/functional/StateFunction;", "Ljava/util/Map;", c.a, "()Ljava/util/Map;", "stateActions", "<init>", "()V", "statemachine_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: ko3  reason: default package */
/* loaded from: classes4.dex */
public final class ko3<STATE, DATA> {
    private final Map<Class<? extends STATE>, Map<Class<? extends ok3>, Map<Class<?>, Function2<ok3, DATA, bua<? extends STATE, DATA>>>>> a = new LinkedHashMap();

    /* compiled from: Fsm.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0004\u0018\u0000*\b\b\u0002\u0010\u0001*\u00028\u0000*\b\b\u0003\u0010\u0002*\u00028\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u000f\u0010\u0010JZ\u0010\n\u001aV\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\u0012D\u0012B\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u00124\u00122\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u0003\u0012\u0012\u0012\u0010\u0012\u0006\b\u0001\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\b0\u0007j\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003`\t0\u00040\u0004Rk\u0010\u000e\u001aV\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\u0012D\u0012B\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u00124\u00122\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u0003\u0012\u0012\u0012\u0010\u0012\u0006\b\u0001\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\b0\u0007j\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003`\t0\u00040\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lko3$a;", "S", "D", "", "", "Ljava/lang/Class;", "Lok3;", "Lkotlin/Function2;", "Lbua;", "Lru/dodopizza/app/infrastracture/functional/StateFunction;", "a", "Ljava/util/Map;", "b", "()Ljava/util/Map;", "functions", "<init>", "(Lko3;)V", "statemachine_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: ko3$a */
    /* loaded from: classes4.dex */
    public final class a<S extends STATE, D extends DATA> {
        private final Map<Class<? extends ok3>, Map<Class<?>, Function2<ok3, D, bua<? extends S, D>>>> a = new LinkedHashMap();

        public a() {
        }

        public final Map<Class<? extends ok3>, Map<Class<?>, Function2<ok3, D, bua<? extends S, D>>>> a() {
            return this.a;
        }

        public final Map<Class<? extends ok3>, Map<Class<?>, Function2<ok3, D, bua<? extends S, D>>>> b() {
            return this.a;
        }
    }

    private final k94<STATE, DATA> b() {
        return new k94<>(this.a);
    }

    public final lo3<STATE, DATA> a(bua<STATE, DATA> buaVar) {
        z65.h(buaVar, "startState");
        return new lo3<>(buaVar, b());
    }

    public final Map<Class<? extends STATE>, Map<Class<? extends ok3>, Map<Class<?>, Function2<ok3, DATA, bua<? extends STATE, DATA>>>>> c() {
        return this.a;
    }
}
