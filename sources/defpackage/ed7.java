package defpackage;

import defpackage.ox1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
/* compiled from: OrderDetailsInteractor.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0007\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Led7;", "Ldd7;", "Lox1;", "", "orderId", "Lwx;", "Lld7;", "a", "Lli7;", "Lli7;", "orderService", "Lmd7;", "b", "Lmd7;", "orderDetailsVOFactory", "<init>", "(Lli7;Lmd7;)V", "activeorder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: ed7  reason: default package */
/* loaded from: classes.dex */
public final class ed7 implements dd7, ox1 {
    private final li7 a;
    private final md7 b;

    /* compiled from: OrderDetailsInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lld7;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.activeorder.feature.orderdetails.presentation.OrderDetailsInteractorImpl$getOrder$1", f = "OrderDetailsInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ed7$a */
    /* loaded from: classes.dex */
    static final class a extends f3b implements Function1<cv1<? super ld7>, Object> {
        int a;
        final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, cv1<? super a> cv1Var) {
            super(1, cv1Var);
            this.c = str;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new a(this.c, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super ld7> cv1Var) {
            return ((a) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                bc7 g = ed7.this.a.g(this.c);
                String str = this.c;
                return ed7.this.b.a((bc7) mh5.b(g, "Order with id " + str + " not found"));
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public ed7(li7 li7Var, md7 md7Var) {
        z65.h(li7Var, "orderService");
        z65.h(md7Var, "orderDetailsVOFactory");
        this.a = li7Var;
        this.b = md7Var;
    }

    @Override // defpackage.dd7
    public wx<ld7> a(String str) {
        z65.h(str, "orderId");
        return d(new a(str, null));
    }

    public <T> wx<T> d(Function1<? super cv1<? super T>, ? extends Object> function1) {
        return ox1.a.a(this, function1);
    }
}
