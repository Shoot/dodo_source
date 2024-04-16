package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import defpackage.mo3;
import java.util.Iterator;
import java.util.LinkedList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: StateMachine.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 $*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012 \u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00050\u0004:\u0001\u0014BK\u0012.\u0010 \u001a*\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001e\u0012\u0004\u0012\u00020\n0\u001dj\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u001f\u0012\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\r¢\u0006\u0004\b\"\u0010#J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\u000b\u001a\u00020\nH\u0002J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u001a\u0010\u000f\u001a\u00020\n2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\rJ\u000e\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006J\u0014\u0010\u0012\u001a\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\rR\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R<\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00052\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00058\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006%"}, d2 = {"Lqua;", "", "S", "D", "Lmo3;", "Llo3;", "Lok3;", "event", "", "o", "", "j", DateTokenConverter.CONVERTER_KEY, "Lbua;", "state", "n", "i", "g", "k", "Ljava/util/LinkedList;", "a", "Ljava/util/LinkedList;", "queuedEvents", "<set-?>", "b", "Llo3;", "f", "()Llo3;", "stateData", "Lkotlin/Function1;", "Lko3;", "Lru/dodopizza/app/infrastracture/functional/GraphBuilder;", "graphBuilder", "initialState", "<init>", "(Lkotlin/jvm/functions/Function1;Lbua;)V", c.a, "statemachine_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: qua  reason: default package */
/* loaded from: classes4.dex */
public final class qua<S, D> implements mo3<S, D, lo3<S, D>> {
    public static final a c = new a(null);
    private final LinkedList<ok3> a;
    private lo3<S, D> b;

    /* compiled from: StateMachine.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lqua$a;", "", "", "EVENTS_LIMIT", "I", "<init>", "()V", "statemachine_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: qua$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public qua(Function1<? super ko3<S, D>, Unit> function1, bua<S, D> buaVar) {
        z65.h(function1, "graphBuilder");
        z65.h(buaVar, "initialState");
        this.a = new LinkedList<>();
        ko3 ko3Var = new ko3();
        function1.invoke(ko3Var);
        this.b = ko3Var.a(buaVar);
    }

    private final boolean d(ok3 ok3Var) {
        if (this.a.size() >= 5) {
            this.a.removeFirst();
        }
        return this.a.add(ok3Var);
    }

    private final void j() {
        Iterator<ok3> it = this.a.iterator();
        while (it.hasNext()) {
            ok3 next = it.next();
            z65.e(next);
            if (o(next)) {
                this.a.remove(next);
                return;
            }
        }
    }

    private final boolean o(ok3 ok3Var) {
        if (e(this.b, ok3Var)) {
            this.b = h(this.b, ok3Var);
            return true;
        }
        return false;
    }

    @Override // defpackage.mo3
    public <STATE extends S> Function2<ok3, D, bua<? extends S, D>> a(lo3<S, D> lo3Var) {
        return mo3.a.d(this, lo3Var);
    }

    @Override // defpackage.mo3
    public <STATE extends S> boolean b(lo3<S, D> lo3Var, STATE state, D d, ok3 ok3Var) {
        return mo3.a.e(this, lo3Var, state, d, ok3Var);
    }

    @Override // defpackage.mo3
    public <STATE extends S> Function2<ok3, D, bua<? extends S, D>> c(lo3<S, D> lo3Var, STATE state, D d, ok3 ok3Var) {
        return mo3.a.c(this, lo3Var, state, d, ok3Var);
    }

    public boolean e(lo3<S, D> lo3Var, ok3 ok3Var) {
        return mo3.a.a(this, lo3Var, ok3Var);
    }

    public final lo3<S, D> f() {
        return this.b;
    }

    public final void g(ok3 ok3Var) {
        z65.h(ok3Var, "event");
        if (!o(ok3Var)) {
            d(ok3Var);
        }
    }

    public lo3<S, D> h(lo3<S, D> lo3Var, ok3 ok3Var) {
        return mo3.a.f(this, lo3Var, ok3Var);
    }

    public final void i(ok3 ok3Var) {
        z65.h(ok3Var, "event");
        this.b = h(this.b, ok3Var);
    }

    public final bua<? extends S, D> k() {
        return l(this.b);
    }

    public bua<? extends S, D> l(lo3<S, D> lo3Var) {
        return mo3.a.g(this, lo3Var);
    }

    public lo3<S, D> m(lo3<S, D> lo3Var, bua<? extends S, D> buaVar) {
        return mo3.a.h(this, lo3Var, buaVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void n(bua<S, D> buaVar) {
        z65.h(buaVar, "state");
        this.b = m(this.b, buaVar);
        j();
    }
}
