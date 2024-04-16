package defpackage;

import com.huawei.hms.opendevice.c;
import defpackage.ox1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
/* compiled from: EnterNameInteractor.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0007\u001a\f\u0012\u0004\u0012\u00020\u00050\u0004j\u0002`\u00062\u0006\u0010\u0003\u001a\u00020\u0002J\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lji3;", "Lox1;", "Loi3;", "data", "Lwx;", "", "Lcom/dodopizza/async/AsyncJob;", c.a, "f", "Lt52;", "a", "Lt52;", "customerService", "Lgc;", "b", "Lgc;", "analytics", "<init>", "(Lt52;Lgc;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: ji3  reason: default package */
/* loaded from: classes4.dex */
public final class ji3 implements ox1 {
    private final t52 a;
    private final gc b;

    /* compiled from: EnterNameInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.entername.EnterNameInteractor$applyEnterUserData$1", f = "EnterNameInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ji3$a */
    /* loaded from: classes4.dex */
    static final class a extends f3b implements Function1<cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ oi3 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(oi3 oi3Var, cv1<? super a> cv1Var) {
            super(1, cv1Var);
            this.c = oi3Var;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new a(this.c, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super Unit> cv1Var) {
            return ((a) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ji3.this.a.w(this.c.c());
                ji3.this.a.x(this.c.d());
                if (this.c.d()) {
                    ji3.this.b.a(new yx6(xx6.b, zx6.d));
                } else {
                    ji3.this.b.a(new yx6(xx6.c, zx6.d));
                }
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: EnterNameInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Loi3;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.entername.EnterNameInteractor$getEnterUserData$1", f = "EnterNameInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ji3$b */
    /* loaded from: classes4.dex */
    static final class b extends f3b implements Function1<cv1<? super oi3>, Object> {
        int a;

        b(cv1<? super b> cv1Var) {
            super(1, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new b(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super oi3> cv1Var) {
            return ((b) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                n42 f = ji3.this.a.f();
                return new oi3(f.h(), f.n());
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public ji3(t52 t52Var, gc gcVar) {
        z65.h(t52Var, "customerService");
        z65.h(gcVar, "analytics");
        this.a = t52Var;
        this.b = gcVar;
    }

    public final wx<Unit> c(oi3 oi3Var) {
        z65.h(oi3Var, "data");
        return e(new a(oi3Var, null));
    }

    public <T> wx<T> d(Function1<? super cv1<? super T>, ? extends Object> function1) {
        return ox1.a.a(this, function1);
    }

    public wx<Unit> e(Function1<? super cv1<? super Unit>, ? extends Object> function1) {
        return ox1.a.c(this, function1);
    }

    public final wx<oi3> f() {
        return d(new b(null));
    }
}
