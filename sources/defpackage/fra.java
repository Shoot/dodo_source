package defpackage;

import com.dodopizza.order.feature.promoaction.SpecialOfferDialogFeatureDependency;
import com.dodopizza.order.feature.promoaction.presentation.SpecialOfferDialogPresenter;
import kotlin.Metadata;
/* compiled from: SpecialOfferComponent.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u0000 \u00032\u00020\u0001:\u0002\u0003\u0004J\b\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0005"}, d2 = {"Lfra;", "", "Lcom/dodopizza/order/feature/promoaction/presentation/SpecialOfferDialogPresenter;", "a", "b", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: fra  reason: default package */
/* loaded from: classes2.dex */
public interface fra {
    public static final a a = a.a;

    /* compiled from: SpecialOfferComponent.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0005\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lfra$a;", "", "Lfra$b;", "a", "()Lfra$b;", "factory", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: fra$a */
    /* loaded from: classes2.dex */
    public static final class a {
        static final /* synthetic */ a a = new a();

        private a() {
        }

        public final b a() {
            b a2 = oj2.a();
            z65.g(a2, "factory(...)");
            return a2;
        }
    }

    /* compiled from: SpecialOfferComponent.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J$\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¨\u0006\n"}, d2 = {"Lfra$b;", "", "Ltra;", "specialOffer", "Lcq8;", "sender", "Lcom/dodopizza/order/feature/promoaction/SpecialOfferDialogFeatureDependency;", "dependencies", "Lfra;", "a", "order_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: fra$b */
    /* loaded from: classes2.dex */
    public interface b {
        fra a(tra traVar, cq8 cq8Var, SpecialOfferDialogFeatureDependency specialOfferDialogFeatureDependency);
    }

    SpecialOfferDialogPresenter a();
}
