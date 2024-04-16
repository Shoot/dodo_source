package defpackage;

import com.dodopizza.controlling.feature.ordercompleted.OrderCompletedFeatureDependencies;
import com.dodopizza.controlling.feature.ordercompleted.presentation.orderinfo.CompletedOrderInfoPresenter;
import kotlin.Metadata;
/* compiled from: CompletedOrderInfoComponent.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\ba\u0018\u0000 \u00032\u00020\u0001:\u0002\u0003\u0004J\b\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0005"}, d2 = {"Lkl1;", "", "Lcom/dodopizza/controlling/feature/ordercompleted/presentation/orderinfo/CompletedOrderInfoPresenter;", "a", "b", "controlling_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: kl1  reason: default package */
/* loaded from: classes.dex */
public interface kl1 {
    public static final a a = a.a;

    /* compiled from: CompletedOrderInfoComponent.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lkl1$a;", "", "Lkl1$b;", "b", "Lkl1$b;", "a", "()Lkl1$b;", "factory", "<init>", "()V", "controlling_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: kl1$a */
    /* loaded from: classes.dex */
    public static final class a {
        static final /* synthetic */ a a = new a();
        private static final b b;

        static {
            b a2 = yc2.a();
            z65.g(a2, "factory(...)");
            b = a2;
        }

        private a() {
        }

        public final b a() {
            return b;
        }
    }

    /* compiled from: CompletedOrderInfoComponent.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u001a\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¨\u0006\b"}, d2 = {"Lkl1$b;", "", "Lll1;", "data", "Lcom/dodopizza/controlling/feature/ordercompleted/OrderCompletedFeatureDependencies;", "dependencies", "Lkl1;", "a", "controlling_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: kl1$b */
    /* loaded from: classes.dex */
    public interface b {
        kl1 a(ll1 ll1Var, OrderCompletedFeatureDependencies orderCompletedFeatureDependencies);
    }

    CompletedOrderInfoPresenter a();
}
