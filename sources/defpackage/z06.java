package defpackage;

import com.inappstory.sdk.stories.api.models.Image;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import ru.dodopizza.app.presentation.profile.adapter.loyaltymissionsV2024.LoyaltyMissionViewHolderV2024;
/* compiled from: LoyaltyMissionBinderV2024.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B/\u0012\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0010\u0012\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0010¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u0007\u001a\u00020\u0006*\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J \u0010\u000b\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0016J.\u0010\u000f\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016R \u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R \u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012¨\u0006\u0018"}, d2 = {"Lz06;", "Loyb;", "Lru/dodopizza/app/presentation/profile/adapter/loyaltymissionsV2024/LoyaltyMissionViewHolderV2024;", "Lul6;", "Lkn3;", "data", "", "j", "view", "", "position", "i", "", "", "changes", Image.TYPE_HIGH, "Lkotlin/Function1;", "a", "Lkotlin/jvm/functions/Function1;", "onCardClicked", "b", "onButtonClicked", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: z06  reason: default package */
/* loaded from: classes4.dex */
public final class z06 extends oyb<LoyaltyMissionViewHolderV2024, ul6> {
    private final Function1<ul6, Unit> a;
    private final Function1<ul6, Unit> b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LoyaltyMissionBinderV2024.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: z06$a */
    /* loaded from: classes4.dex */
    public static final class a extends ej5 implements Function0<Unit> {
        final /* synthetic */ ul6 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(ul6 ul6Var) {
            super(0);
            this.b = ul6Var;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            z06.this.b.invoke(this.b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LoyaltyMissionBinderV2024.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: z06$b */
    /* loaded from: classes4.dex */
    public static final class b extends ej5 implements Function0<Unit> {
        public static final b a = new b();

        b() {
            super(0);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LoyaltyMissionBinderV2024.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: z06$c */
    /* loaded from: classes4.dex */
    public static final class c extends ej5 implements Function0<Unit> {
        final /* synthetic */ ul6 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(ul6 ul6Var) {
            super(0);
            this.b = ul6Var;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            z06.this.a.invoke(this.b);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public z06(Function1<? super ul6, Unit> function1, Function1<? super ul6, Unit> function12) {
        z65.h(function1, "onCardClicked");
        z65.h(function12, "onButtonClicked");
        this.a = function1;
        this.b = function12;
    }

    private final void j(LoyaltyMissionViewHolderV2024 loyaltyMissionViewHolderV2024, kn3 kn3Var) {
        if (kn3Var == null) {
            loyaltyMissionViewHolderV2024.hideExpireTitle();
        } else if (kn3Var.b()) {
            loyaltyMissionViewHolderV2024.showExpiringTitle(kn3Var.a());
        } else {
            loyaltyMissionViewHolderV2024.showExpireTitle(kn3Var.a());
        }
    }

    @Override // defpackage.oyb
    /* renamed from: h */
    public void a(LoyaltyMissionViewHolderV2024 loyaltyMissionViewHolderV2024, ul6 ul6Var, int i, List<? extends Object> list) {
        z65.h(loyaltyMissionViewHolderV2024, "view");
        z65.h(ul6Var, "data");
        z65.h(list, "changes");
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            it.next();
            b(loyaltyMissionViewHolderV2024, ul6Var, i);
        }
    }

    @Override // defpackage.oyb
    /* renamed from: i */
    public void b(LoyaltyMissionViewHolderV2024 loyaltyMissionViewHolderV2024, ul6 ul6Var, int i) {
        boolean y;
        boolean y2;
        z65.h(loyaltyMissionViewHolderV2024, "view");
        z65.h(ul6Var, "data");
        loyaltyMissionViewHolderV2024.showMissionImage(ul6Var.c());
        loyaltyMissionViewHolderV2024.setMissionReward(ul6Var.d());
        j(loyaltyMissionViewHolderV2024, ul6Var.b());
        loyaltyMissionViewHolderV2024.setMissionTitle(ul6Var.f());
        y = l0b.y(ul6Var.a());
        if (!y) {
            loyaltyMissionViewHolderV2024.setMissionDescription(ul6Var.a());
        } else {
            loyaltyMissionViewHolderV2024.hideMissionDescription();
        }
        loyaltyMissionViewHolderV2024.setButtonClickListener(new a(ul6Var));
        if (ul6Var.j()) {
            loyaltyMissionViewHolderV2024.setCardClickListener(b.a);
            loyaltyMissionViewHolderV2024.showAcceptingButton();
            loyaltyMissionViewHolderV2024.hideStatusDescription();
            return;
        }
        loyaltyMissionViewHolderV2024.setCardClickListener(new c(ul6Var));
        wl6 e = ul6Var.e();
        if (e instanceof gf4) {
            loyaltyMissionViewHolderV2024.showGetStartedButton();
            loyaltyMissionViewHolderV2024.hideStatusDescription();
        } else if ((e instanceof ul1) || (e instanceof tl1)) {
            loyaltyMissionViewHolderV2024.showCompletedButton();
            loyaltyMissionViewHolderV2024.showCompletedExpirationTitle();
            loyaltyMissionViewHolderV2024.hideStatusDescription();
        } else if (e instanceof dp8) {
            loyaltyMissionViewHolderV2024.showProgressButton(((dp8) ul6Var.e()).a(), ((dp8) ul6Var.e()).c());
            loyaltyMissionViewHolderV2024.hideStatusDescription();
        } else if (e instanceof zl9) {
            loyaltyMissionViewHolderV2024.showRetryButton();
            y2 = l0b.y(((zl9) ul6Var.e()).a());
            if (!y2) {
                loyaltyMissionViewHolderV2024.showModeratorMessage(((zl9) ul6Var.e()).a());
            } else {
                loyaltyMissionViewHolderV2024.hideStatusDescription();
            }
        } else if (e instanceof zxb) {
            loyaltyMissionViewHolderV2024.showVerifyingButton();
            loyaltyMissionViewHolderV2024.hideStatusDescription();
        }
    }
}
