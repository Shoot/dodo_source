package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.order.feature.personaloffer.presentantion.adapter.PersonalOfferViewHolder;
import com.huawei.hms.push.e;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
/* compiled from: PersonalOfferBinder.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u001a\u0012\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001aN\u0010\n\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00052\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00030\u00062\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00030\u00062\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00030\u0006\u001a\u0012\u0010\f\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u000b\u001a\u0018\u0010\u0010\u001a\u00020\u0003*\u00020\u00002\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u001a\u001a\u0010\u0014\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011¨\u0006\u0015"}, d2 = {"Lcom/dodopizza/order/feature/personaloffer/presentantion/adapter/PersonalOfferViewHolder;", "Lk08;", "data", "", com.huawei.hms.opendevice.c.a, "Lp67;", "Lkotlin/Function1;", "applyOfferListener", "resetOfferListener", "moreAboutOfferListener", "a", "Lbwb;", "b", "", "Ljk7;", "types", DateTokenConverter.CONVERTER_KEY, "", "label", "iconRes", e.a, "order_release"}, k = 2, mv = {1, 9, 0})
/* renamed from: g08  reason: default package */
/* loaded from: classes2.dex */
public final class g08 {

    /* compiled from: PersonalOfferBinder.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: g08$a */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[j08.values().length];
            try {
                iArr[j08.c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[j08.e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: PersonalOfferBinder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: g08$b */
    /* loaded from: classes2.dex */
    static final class b extends ej5 implements Function0<Unit> {
        final /* synthetic */ Function1<p67, Unit> a;
        final /* synthetic */ p67 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(Function1<? super p67, Unit> function1, p67 p67Var) {
            super(0);
            this.a = function1;
            this.b = p67Var;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.a.invoke(this.b);
        }
    }

    /* compiled from: PersonalOfferBinder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: g08$c */
    /* loaded from: classes2.dex */
    static final class c extends ej5 implements Function0<Unit> {
        final /* synthetic */ Function1<p67, Unit> a;
        final /* synthetic */ p67 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(Function1<? super p67, Unit> function1, p67 p67Var) {
            super(0);
            this.a = function1;
            this.b = p67Var;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.a.invoke(this.b);
        }
    }

    /* compiled from: PersonalOfferBinder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: g08$d */
    /* loaded from: classes2.dex */
    static final class d extends ej5 implements Function0<Unit> {
        final /* synthetic */ Function1<p67, Unit> a;
        final /* synthetic */ p67 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(Function1<? super p67, Unit> function1, p67 p67Var) {
            super(0);
            this.a = function1;
            this.b = p67Var;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.a.invoke(this.b);
        }
    }

    public static final void a(PersonalOfferViewHolder personalOfferViewHolder, p67 p67Var, Function1<? super p67, Unit> function1, Function1<? super p67, Unit> function12, Function1<? super p67, Unit> function13) {
        z65.h(personalOfferViewHolder, "<this>");
        z65.h(p67Var, "data");
        z65.h(function1, "applyOfferListener");
        z65.h(function12, "resetOfferListener");
        z65.h(function13, "moreAboutOfferListener");
        if (p67Var.h().d()) {
            personalOfferViewHolder.showDisabledButton();
        } else if (p67Var.b() == bs5.b) {
            personalOfferViewHolder.showButton();
            personalOfferViewHolder.showLoading();
        } else if (p67Var.b() == bs5.c) {
            personalOfferViewHolder.showButton();
            personalOfferViewHolder.hideLoading();
            personalOfferViewHolder.disableButton();
            personalOfferViewHolder.showApplyButton();
        } else if (m08.b(p67Var)) {
            personalOfferViewHolder.showButton();
            personalOfferViewHolder.hideLoading();
            personalOfferViewHolder.enableButton();
            personalOfferViewHolder.showWatchButton();
            personalOfferViewHolder.setOnClickListener(new b(function13, p67Var));
        } else if (p67Var.i()) {
            personalOfferViewHolder.showButton();
            personalOfferViewHolder.hideLoading();
            personalOfferViewHolder.enableButton();
            personalOfferViewHolder.showAppliedButton();
            personalOfferViewHolder.setOnClickListener(new c(function12, p67Var));
        } else {
            personalOfferViewHolder.showButton();
            personalOfferViewHolder.hideLoading();
            personalOfferViewHolder.enableButton();
            personalOfferViewHolder.showApplyButton();
            personalOfferViewHolder.setOnClickListener(new d(function1, p67Var));
        }
    }

    public static final void b(PersonalOfferViewHolder personalOfferViewHolder, bwb bwbVar) {
        z65.h(personalOfferViewHolder, "<this>");
        z65.h(bwbVar, "data");
        if (bwbVar.d()) {
            personalOfferViewHolder.showFutureExpireTitle(bwbVar.a());
        } else if (bwbVar.b() == null) {
            personalOfferViewHolder.hideExpireTitle();
        } else if (bwbVar.c()) {
            personalOfferViewHolder.showExpiringTitle(bwbVar.b().longValue());
        } else {
            personalOfferViewHolder.showExpireTitle(bwbVar.b().longValue());
        }
    }

    public static final void c(PersonalOfferViewHolder personalOfferViewHolder, k08 k08Var) {
        z65.h(personalOfferViewHolder, "<this>");
        z65.h(k08Var, "data");
        int i = a.$EnumSwitchMapping$0[k08Var.n().ordinal()];
        if (i != 1) {
            if (i != 2) {
                personalOfferViewHolder.showImageWithDiscountPlaceholder(k08Var.d());
                return;
            } else {
                personalOfferViewHolder.showImageWithCashbackPlaceholder(k08Var.d());
                return;
            }
        }
        personalOfferViewHolder.showImageWithGiftPlaceholder(k08Var.d());
    }

    public static final void d(PersonalOfferViewHolder personalOfferViewHolder, List<? extends jk7> list) {
        Pair pair;
        z65.h(personalOfferViewHolder, "<this>");
        z65.h(list, "types");
        jk7 jk7Var = jk7.e;
        if (list.contains(jk7Var) && list.contains(jk7.f) && list.contains(jk7.g)) {
            pair = new Pair(Integer.valueOf(r09.personal_offer_type_badge_label_all_type), -1);
        } else if (list.contains(jk7Var) && list.contains(jk7.f)) {
            pair = new Pair(Integer.valueOf(r09.personal_offer_type_badge_label_delivery_and_pickup), -1);
        } else if (list.contains(jk7Var) && list.contains(jk7.g)) {
            pair = new Pair(Integer.valueOf(r09.personal_offer_type_badge_label_pizzeria_and_delivery), -1);
        } else {
            jk7 jk7Var2 = jk7.f;
            if (list.contains(jk7Var2) && list.contains(jk7.g)) {
                pair = new Pair(Integer.valueOf(r09.personal_offer_type_badge_label_pizzeria_and_pickup), -1);
            } else if (list.contains(jk7Var)) {
                pair = new Pair(Integer.valueOf(r09.personal_offer_type_badge_label_delivery), Integer.valueOf(bx8.ic_delivery));
            } else if (list.contains(jk7Var2)) {
                pair = new Pair(Integer.valueOf(r09.personal_offer_type_badge_label_carryout), Integer.valueOf(bx8.ic_take_away));
            } else if (list.contains(jk7.g)) {
                pair = new Pair(Integer.valueOf(r09.personal_offer_type_badge_label_pizzeria), Integer.valueOf(bx8.ic_restaurant));
            } else {
                pair = new Pair(-1, -1);
            }
        }
        int intValue = ((Number) pair.a()).intValue();
        int intValue2 = ((Number) pair.b()).intValue();
        if (intValue > 0) {
            e(personalOfferViewHolder, intValue, intValue2);
        } else {
            personalOfferViewHolder.hideOfferTypeBadge();
        }
    }

    public static final void e(PersonalOfferViewHolder personalOfferViewHolder, int i, int i2) {
        z65.h(personalOfferViewHolder, "<this>");
        personalOfferViewHolder.setOfferTypeLabel(i);
        personalOfferViewHolder.showOfferTypeBadge();
        if (i2 > 0) {
            personalOfferViewHolder.enableOfferTypeIcon(true);
            personalOfferViewHolder.setOfferTypeIcon(i2);
            return;
        }
        personalOfferViewHolder.enableOfferTypeIcon(false);
    }
}
