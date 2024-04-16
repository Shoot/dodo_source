package defpackage;

import com.dodopizza.loyalty.products.presentation.adapter.LoyaltyProductViewHolder;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: LoyaltyProductBinder.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000fB\u001b\u0012\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u000e¢\u0006\u0004\b\u0014\u0010\u0015J \u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J.\u0010\r\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016R#\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0017"}, d2 = {"Lz16;", "Loyb;", "Lcom/dodopizza/loyalty/products/presentation/adapter/LoyaltyProductViewHolder;", "Le26;", "view", "data", "", "position", "", "g", "", "", "changes", "f", "Lkotlin/Function1;", "a", "Lkotlin/jvm/functions/Function1;", Image.TYPE_HIGH, "()Lkotlin/jvm/functions/Function1;", "listener", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "b", "loyalty_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: z16  reason: default package */
/* loaded from: classes2.dex */
public final class z16 extends oyb<LoyaltyProductViewHolder, e26> {
    public static final a b = new a(null);
    private final Function1<e26, Unit> a;

    /* compiled from: LoyaltyProductBinder.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Lz16$a;", "", "", "DISABLE_STATE", "Ljava/lang/String;", "ENABLE_STATE", "<init>", "()V", "loyalty_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: z16$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LoyaltyProductBinder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: z16$b */
    /* loaded from: classes2.dex */
    public static final class b extends ej5 implements Function0<Unit> {
        final /* synthetic */ e26 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(e26 e26Var) {
            super(0);
            this.b = e26Var;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            z16.this.h().invoke(this.b);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public z16(Function1<? super e26, Unit> function1) {
        z65.h(function1, "listener");
        this.a = function1;
    }

    @Override // defpackage.oyb
    /* renamed from: f */
    public void a(LoyaltyProductViewHolder loyaltyProductViewHolder, e26 e26Var, int i, List<? extends Object> list) {
        z65.h(loyaltyProductViewHolder, "view");
        z65.h(e26Var, "data");
        z65.h(list, "changes");
        for (Object obj : list) {
            if (z65.c(obj, "disable_state")) {
                loyaltyProductViewHolder.disableGetProductButton();
            } else if (z65.c(obj, "enable_state")) {
                if (e26Var.g()) {
                    loyaltyProductViewHolder.disableGetProductButton();
                } else {
                    loyaltyProductViewHolder.enableGetProductButton();
                }
            }
        }
    }

    @Override // defpackage.oyb
    /* renamed from: g */
    public void b(LoyaltyProductViewHolder loyaltyProductViewHolder, e26 e26Var, int i) {
        z65.h(loyaltyProductViewHolder, "view");
        z65.h(e26Var, "data");
        loyaltyProductViewHolder.setName(e26Var.c());
        loyaltyProductViewHolder.setDescription(e26Var.a());
        loyaltyProductViewHolder.setClickListener(new b(e26Var));
        loyaltyProductViewHolder.setPrice(e26Var.d());
        loyaltyProductViewHolder.setImage(e26Var.b());
        if (e26Var.g()) {
            loyaltyProductViewHolder.showNotAvailable();
            return;
        }
        loyaltyProductViewHolder.showAvailable(e26Var.d());
        if (e26Var.f()) {
            loyaltyProductViewHolder.enableGetProductButton();
        } else {
            loyaltyProductViewHolder.disableGetProductButton();
        }
    }

    public final Function1<e26, Unit> h() {
        return this.a;
    }
}
