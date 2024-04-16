package com.dodopizza.presentation.presenters;

import com.dodopizza.presentation.presenters.a;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import moxy.MvpView;
/* compiled from: MoxyFSMPresenter.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u0003*\b\b\u0002\u0010\u0005*\u00020\u00032\b\u0012\u0004\u0012\u00028\u00000\u0006B\u0007¢\u0006\u0004\b%\u0010&J0\u0010\u000b\u001a*\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\b\u0012\u0004\u0012\u00020\t0\u0007j\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002`\nH&J\u0014\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\fH&J\b\u0010\u000e\u001a\u00020\tH\u0014J\u001d\u0010\u0011\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00028\u00012\u0006\u0010\u0010\u001a\u00028\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0013\u001a\u00020\t2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\fJ\u000e\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0014J\u000e\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0014J\u0014\u0010\u0018\u001a\u0010\u0012\u0006\b\u0001\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\fR'\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001f\u0010!\u001a\u0010\u0012\u0006\b\u0001\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0011\u0010$\u001a\u00028\u00018F¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006'"}, d2 = {"Lcom/dodopizza/presentation/presenters/MoxyFSMPresenter;", "Lmoxy/MvpView;", "V", "", "S", "D", "Lcom/dodopizza/presentation/presenters/BasePresenter;", "Lkotlin/Function1;", "Lko3;", "", "Lru/dodopizza/app/infrastracture/functional/GraphBuilder;", "v", "Lbua;", "t", "onFirstViewAttach", "state", "data", "z", "(Ljava/lang/Object;Ljava/lang/Object;)V", "y", "Lok3;", "event", "w", "q", "x", "Lqua;", "a", "Lrn5;", "u", "()Lqua;", "stateMachine", "r", "()Lbua;", "currentState", Image.TYPE_SMALL, "()Ljava/lang/Object;", "currentStateName", "<init>", "()V", "statemachine_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public abstract class MoxyFSMPresenter<V extends MvpView, S, D> extends BasePresenter<V> {
    private final rn5 a;

    /* compiled from: MoxyFSMPresenter.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0003*\u00020\u0002\"\b\b\u0002\u0010\u0004*\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lmoxy/MvpView;", "V", "", "S", "D", "Lqua;", "a", "()Lqua;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    static final class a extends ej5 implements Function0<qua<S, D>> {
        final /* synthetic */ MoxyFSMPresenter<V, S, D> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(MoxyFSMPresenter<V, S, D> moxyFSMPresenter) {
            super(0);
            this.a = moxyFSMPresenter;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final qua<S, D> invoke() {
            return new qua<>(this.a.v(), this.a.t());
        }
    }

    public MoxyFSMPresenter() {
        rn5 b;
        b = yn5.b(new a(this));
        this.a = b;
    }

    private final qua<S, D> u() {
        return (qua) this.a.getValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // moxy.MvpPresenter
    public void onFirstViewAttach() {
        w(a.C0211a.a);
    }

    public final void q(ok3 ok3Var) {
        z65.h(ok3Var, "event");
        u().g(ok3Var);
    }

    public final bua<? extends S, D> r() {
        return u().f().c();
    }

    public final S s() {
        return r().c();
    }

    public abstract bua<S, D> t();

    public abstract Function1<ko3<S, D>, Unit> v();

    public final void w(ok3 ok3Var) {
        z65.h(ok3Var, "event");
        u().i(ok3Var);
    }

    public final bua<? extends S, D> x() {
        return u().k();
    }

    public final void y(bua<S, D> buaVar) {
        z65.h(buaVar, "state");
        u().n(buaVar);
    }

    public final void z(S s, D d) {
        z65.h(s, "state");
        z65.h(d, "data");
        y(new bua<>(s, d));
    }
}
