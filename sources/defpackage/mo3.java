package defpackage;

import com.huawei.hms.opendevice.c;
import defpackage.lo3;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: FSM extends lo3<S, D>
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
/* compiled from: Fsm.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u0001*\u0014\b\u0002\u0010\u0005*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u00020\u0001JO\u0010\u000b\u001a4\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00028\u0001\u0012\u0012\u0012\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t0\u0007j\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\n\"\b\b\u0003\u0010\u0006*\u00028\u0000*\u00028\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ`\u0010\u0010\u001a4\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00028\u0001\u0012\u0012\u0012\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t0\u0007j\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\n\"\b\b\u0003\u0010\u0006*\u00028\u0000*\u00028\u00022\u0006\u0010\r\u001a\u00028\u00032\u0006\u0010\u000e\u001a\u00028\u00012\u0006\u0010\u000f\u001a\u00020\bH\u0016J5\u0010\u0012\u001a\u00020\u0011\"\b\b\u0003\u0010\u0006*\u00028\u0000*\u00028\u00022\u0006\u0010\r\u001a\u00028\u00032\u0006\u0010\u000e\u001a\u00028\u00012\u0006\u0010\u000f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lmo3;", "", "S", "D", "Llo3;", "FSM", "STATE", "Lkotlin/Function2;", "Lok3;", "Lbua;", "Lru/dodopizza/app/infrastracture/functional/StateFunction;", "a", "(Llo3;)Lkotlin/jvm/functions/Function2;", "state", "data", "event", c.a, "", "b", "(Llo3;Ljava/lang/Object;Ljava/lang/Object;Lok3;)Z", "statemachine_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: mo3  reason: default package */
/* loaded from: classes4.dex */
public interface mo3<S, D, FSM extends lo3<S, D>> {

    /* compiled from: Fsm.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: mo3$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* compiled from: Fsm.kt */
        @Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\n\u001a\u0010\u0012\u0006\b\u0001\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\t\"\b\b\u0000\u0010\u0000*\u00028\u0001\"\b\b\u0001\u0010\u0002*\u00020\u0001\"\b\b\u0002\u0010\u0003*\u00020\u0001\"\u0014\b\u0003\u0010\u0005*\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00028\u0002H\n¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"STATE", "", "S", "D", "Llo3;", "FSM", "Lok3;", "<anonymous parameter 0>", "<anonymous parameter 1>", "Lbua;", "a", "(Lok3;Ljava/lang/Object;)Lbua;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: mo3$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        static final class C0442a extends ej5 implements Function2<ok3, D, bua<? extends S, D>> {
            final /* synthetic */ FSM a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0442a(FSM fsm) {
                super(2);
                this.a = fsm;
            }

            public final bua<? extends S, D> a(ok3 ok3Var, D d) {
                z65.h(ok3Var, "<anonymous parameter 0>");
                z65.h(d, "<anonymous parameter 1>");
                return this.a.c();
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(ok3 ok3Var, Object obj) {
                return a(ok3Var, obj);
            }
        }

        public static <S, D, FSM extends lo3<S, D>> boolean a(mo3<S, D, FSM> mo3Var, FSM fsm, ok3 ok3Var) {
            z65.h(fsm, "$receiver");
            z65.h(ok3Var, "event");
            bua<? extends S, D> c = fsm.c();
            return mo3Var.b(fsm, c.a(), c.b(), ok3Var);
        }

        private static <S, D, FSM extends lo3<S, D>, STATE extends S> Function2<ok3, D, bua<? extends S, D>> b(mo3<S, D, FSM> mo3Var, FSM fsm, STATE state, D d, ok3 ok3Var) {
            Map<Class<?>, Function2<ok3, D, bua<? extends S, D>>> map;
            Map<Class<? extends ok3>, Map<Class<?>, Function2<ok3, D, bua<? extends S, D>>>> map2 = fsm.d().a().get(state.getClass());
            if (map2 != null && (map = map2.get(ok3Var.getClass())) != null) {
                return map.get(d.getClass());
            }
            return null;
        }

        public static <S, D, FSM extends lo3<S, D>, STATE extends S> Function2<ok3, D, bua<? extends S, D>> c(mo3<S, D, FSM> mo3Var, FSM fsm, STATE state, D d, ok3 ok3Var) {
            z65.h(fsm, "$receiver");
            z65.h(state, "state");
            z65.h(d, "data");
            z65.h(ok3Var, "event");
            Function2<ok3, D, bua<? extends S, D>> b = b(mo3Var, fsm, state, d, ok3Var);
            if (b == null) {
                return mo3Var.a(fsm);
            }
            return b;
        }

        public static <S, D, FSM extends lo3<S, D>, STATE extends S> Function2<ok3, D, bua<? extends S, D>> d(mo3<S, D, FSM> mo3Var, FSM fsm) {
            z65.h(fsm, "$receiver");
            return new C0442a(fsm);
        }

        public static <S, D, FSM extends lo3<S, D>, STATE extends S> boolean e(mo3<S, D, FSM> mo3Var, FSM fsm, STATE state, D d, ok3 ok3Var) {
            z65.h(fsm, "$receiver");
            z65.h(state, "state");
            z65.h(d, "data");
            z65.h(ok3Var, "event");
            if (b(mo3Var, fsm, state, d, ok3Var) != null) {
                return true;
            }
            return false;
        }

        public static <S, D, FSM extends lo3<S, D>> FSM f(mo3<S, D, FSM> mo3Var, FSM fsm, ok3 ok3Var) {
            z65.h(fsm, "$receiver");
            z65.h(ok3Var, "event");
            bua<? extends S, D> c = fsm.c();
            S a = c.a();
            D b = c.b();
            FSM fsm2 = (FSM) lo3.b(fsm, mo3Var.c(fsm, a, b, ok3Var).invoke(ok3Var, b), null, 2, null);
            z65.f(fsm2, "null cannot be cast to non-null type FSM of ru.dodopizza.app.infrastracture.functional.FSMLogic.DefaultImpls.processEvent$lambda$1");
            return fsm2;
        }

        public static <S, D, FSM extends lo3<S, D>> bua<? extends S, D> g(mo3<S, D, FSM> mo3Var, FSM fsm) {
            z65.h(fsm, "$receiver");
            return fsm.c();
        }

        public static <S, D, FSM extends lo3<S, D>> lo3<S, D> h(mo3<S, D, FSM> mo3Var, FSM fsm, bua<? extends S, D> buaVar) {
            z65.h(fsm, "$receiver");
            z65.h(buaVar, "state");
            return lo3.b(fsm, buaVar, null, 2, null);
        }
    }

    <STATE extends S> Function2<ok3, D, bua<? extends S, D>> a(FSM fsm);

    <STATE extends S> boolean b(FSM fsm, STATE state, D d, ok3 ok3Var);

    <STATE extends S> Function2<ok3, D, bua<? extends S, D>> c(FSM fsm, STATE state, D d, ok3 ok3Var);
}
