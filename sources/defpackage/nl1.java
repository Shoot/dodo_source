package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: CompletedOrderInfoInteractor.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\f\u001a\u00020\t\u0012\b\b\u0002\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u0012J\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0002J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0086@¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lnl1;", "", "Lbc7;", "Ljl1;", DateTokenConverter.CONVERTER_KEY, "", "orderId", c.a, "(Ljava/lang/String;Lcv1;)Ljava/lang/Object;", "Lli7;", "a", "Lli7;", "orderService", "Lkx1;", "b", "Lkx1;", "ioDispatcher", "<init>", "(Lli7;Lkx1;)V", "controlling_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: nl1  reason: default package */
/* loaded from: classes.dex */
public final class nl1 {
    private final li7 a;
    private final kx1 b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CompletedOrderInfoInteractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "Ljl1;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.controlling.feature.ordercompleted.presentation.orderinfo.CompletedOrderInfoInteractor$getCompletedOrderInfo$2", f = "CompletedOrderInfoInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: nl1$a */
    /* loaded from: classes.dex */
    public static final class a extends f3b implements Function2<qx1, cv1<? super jl1>, Object> {
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
        public final Object invoke(qx1 qx1Var, cv1<? super jl1> cv1Var) {
            return ((a) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                bc7 g = nl1.this.a.g(this.c);
                String str = this.c;
                if (g != null) {
                    return nl1.this.d(g);
                }
                throw new IllegalStateException(("Order with id " + str + " wasn't found").toString());
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public nl1(li7 li7Var, kx1 kx1Var) {
        z65.h(li7Var, "orderService");
        z65.h(kx1Var, "ioDispatcher");
        this.a = li7Var;
        this.b = kx1Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final jl1 d(bc7 bc7Var) {
        int w;
        List<yf7> u = bc7Var.u();
        w = lc1.w(u, 10);
        ArrayList arrayList = new ArrayList(w);
        for (yf7 yf7Var : u) {
            arrayList.add(yf7Var.p());
        }
        return new jl1(arrayList, bc7Var.D());
    }

    public final Object c(String str, cv1<? super jl1> cv1Var) {
        return qh0.g(this.b, new a(str, null), cv1Var);
    }

    public /* synthetic */ nl1(li7 li7Var, kx1 kx1Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(li7Var, (i & 2) != 0 ? v33.b() : kx1Var);
    }
}
