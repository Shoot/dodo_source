package defpackage;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: OrderCompletedInteractor.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0086@¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\f¨\u0006\u0010"}, d2 = {"Loc7;", "", "", "orderId", "", "b", "(Ljava/lang/String;Lcv1;)Ljava/lang/Object;", "Lo69;", "a", "Lo69;", "ratingService", "Lkx1;", "Lkx1;", "ioDispatcher", "<init>", "(Lo69;Lkx1;)V", "controlling_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: oc7  reason: default package */
/* loaded from: classes.dex */
public final class oc7 {
    private final o69 a;
    private final kx1 b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OrderCompletedInteractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.controlling.feature.ordercompleted.presentation.OrderCompletedInteractor$isOrderRatingSent$2", f = "OrderCompletedInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: oc7$a */
    /* loaded from: classes.dex */
    public static final class a extends f3b implements Function2<qx1, cv1<? super Boolean>, Object> {
        int a;
        final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, cv1<? super a> cv1Var) {
            super(2, cv1Var);
            this.c = str;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new a(this.c, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(qx1 qx1Var, cv1<? super Boolean> cv1Var) {
            return ((a) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                return nf0.a(oc7.this.a.a(this.c).i());
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public oc7(o69 o69Var, kx1 kx1Var) {
        z65.h(o69Var, "ratingService");
        z65.h(kx1Var, "ioDispatcher");
        this.a = o69Var;
        this.b = kx1Var;
    }

    public final Object b(String str, cv1<? super Boolean> cv1Var) {
        return qh0.g(this.b, new a(str, null), cv1Var);
    }

    public /* synthetic */ oc7(o69 o69Var, kx1 kx1Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(o69Var, (i & 2) != 0 ? v33.b() : kx1Var);
    }
}
