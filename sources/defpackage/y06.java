package defpackage;

import com.inappstory.sdk.stories.api.models.Image;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.dodopizza.app.presentation.profile.adapter.loyaltymissions.LoyaltyMissionViewHolder;
/* compiled from: LoyaltyMissionBinder.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0011B/\u0012\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0010\u0012\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0010¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u0007\u001a\u00020\u0006*\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J \u0010\u000b\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0016J.\u0010\u000f\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016R \u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R \u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012¨\u0006\u0019"}, d2 = {"Ly06;", "Loyb;", "Lru/dodopizza/app/presentation/profile/adapter/loyaltymissions/LoyaltyMissionViewHolder;", "Lul6;", "Lkn3;", "data", "", "j", "view", "", "position", "i", "", "", "changes", Image.TYPE_HIGH, "Lkotlin/Function1;", "a", "Lkotlin/jvm/functions/Function1;", "onCardClicked", "b", "onButtonClicked", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", com.huawei.hms.opendevice.c.a, "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: y06  reason: default package */
/* loaded from: classes4.dex */
public final class y06 extends oyb<LoyaltyMissionViewHolder, ul6> {
    public static final a c = new a(null);
    private final Function1<ul6, Unit> a;
    private final Function1<ul6, Unit> b;

    /* compiled from: LoyaltyMissionBinder.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Ly06$a;", "", "", "UPDATE", "Ljava/lang/String;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: y06$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LoyaltyMissionBinder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: y06$b */
    /* loaded from: classes4.dex */
    public static final class b extends ej5 implements Function0<Unit> {
        final /* synthetic */ ul6 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(ul6 ul6Var) {
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
            y06.this.b.invoke(this.b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LoyaltyMissionBinder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: y06$c */
    /* loaded from: classes4.dex */
    public static final class c extends ej5 implements Function0<Unit> {
        public static final c a = new c();

        c() {
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
    /* compiled from: LoyaltyMissionBinder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: y06$d */
    /* loaded from: classes4.dex */
    public static final class d extends ej5 implements Function0<Unit> {
        final /* synthetic */ ul6 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(ul6 ul6Var) {
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
            y06.this.a.invoke(this.b);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public y06(Function1<? super ul6, Unit> function1, Function1<? super ul6, Unit> function12) {
        z65.h(function1, "onCardClicked");
        z65.h(function12, "onButtonClicked");
        this.a = function1;
        this.b = function12;
    }

    private final void j(LoyaltyMissionViewHolder loyaltyMissionViewHolder, kn3 kn3Var) {
        if (kn3Var == null) {
            loyaltyMissionViewHolder.hideExpireTitle();
        } else if (kn3Var.b()) {
            loyaltyMissionViewHolder.showExpiringTitle(kn3Var.a());
        } else {
            loyaltyMissionViewHolder.showExpireTitle(kn3Var.a());
        }
    }

    @Override // defpackage.oyb
    /* renamed from: h */
    public void a(LoyaltyMissionViewHolder loyaltyMissionViewHolder, ul6 ul6Var, int i, List<? extends Object> list) {
        z65.h(loyaltyMissionViewHolder, "view");
        z65.h(ul6Var, "data");
        z65.h(list, "changes");
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            it.next();
            b(loyaltyMissionViewHolder, ul6Var, i);
        }
    }

    @Override // defpackage.oyb
    /* renamed from: i */
    public void b(LoyaltyMissionViewHolder loyaltyMissionViewHolder, ul6 ul6Var, int i) {
        boolean y;
        boolean y2;
        boolean y3;
        boolean y4;
        z65.h(loyaltyMissionViewHolder, "view");
        z65.h(ul6Var, "data");
        loyaltyMissionViewHolder.showMissionImage(ul6Var.c());
        loyaltyMissionViewHolder.setMissionReward(ul6Var.d());
        j(loyaltyMissionViewHolder, ul6Var.b());
        loyaltyMissionViewHolder.setMissionTitle(ul6Var.f());
        loyaltyMissionViewHolder.setButtonClickListener(new b(ul6Var));
        if (ul6Var.j()) {
            loyaltyMissionViewHolder.setCardClickListener(c.a);
            loyaltyMissionViewHolder.showAcceptingButton();
            loyaltyMissionViewHolder.hideStatusDescription();
            return;
        }
        loyaltyMissionViewHolder.setCardClickListener(new d(ul6Var));
        wl6 e = ul6Var.e();
        if (e instanceof gf4) {
            loyaltyMissionViewHolder.showGetStartedButton();
            loyaltyMissionViewHolder.hideStatusDescription();
        } else if (e instanceof ul1) {
            loyaltyMissionViewHolder.showCompletedButton();
            y4 = l0b.y(((ul1) ul6Var.e()).b());
            if (!y4) {
                loyaltyMissionViewHolder.showDoneStatusDescription(((ul1) ul6Var.e()).b());
            } else {
                loyaltyMissionViewHolder.hideStatusDescription();
            }
        } else if (e instanceof dp8) {
            int a2 = ((dp8) ul6Var.e()).a();
            int c2 = ((dp8) ul6Var.e()).c();
            if (a2 == c2) {
                loyaltyMissionViewHolder.showDoneProgressButton(a2);
                y3 = l0b.y(((dp8) ul6Var.e()).b());
                if (!y3) {
                    loyaltyMissionViewHolder.showDoneStatusDescription(((dp8) ul6Var.e()).b());
                    return;
                } else {
                    loyaltyMissionViewHolder.hideStatusDescription();
                    return;
                }
            }
            loyaltyMissionViewHolder.showProgressButton(a2, c2);
            loyaltyMissionViewHolder.hideStatusDescription();
        } else if (e instanceof zl9) {
            loyaltyMissionViewHolder.showRetryButton();
            y2 = l0b.y(((zl9) ul6Var.e()).a());
            if (!y2) {
                loyaltyMissionViewHolder.showAlertStatusDescription(((zl9) ul6Var.e()).a());
            } else {
                loyaltyMissionViewHolder.hideStatusDescription();
            }
        } else if (e instanceof zxb) {
            loyaltyMissionViewHolder.showVerifyingButton();
            y = l0b.y(((zxb) ul6Var.e()).b());
            if (!y) {
                loyaltyMissionViewHolder.showWaitingStatusDescription(((zxb) ul6Var.e()).b());
            } else {
                loyaltyMissionViewHolder.hideStatusDescription();
            }
        } else if (e instanceof tl1) {
            loyaltyMissionViewHolder.showCompletedButton();
            loyaltyMissionViewHolder.hideStatusDescription();
        }
    }
}
