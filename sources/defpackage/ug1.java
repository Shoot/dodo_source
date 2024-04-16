package defpackage;

import android.content.res.Resources;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.order.feature.shoppingcart.adapter.good.combo.ComboCartProductViewHolder;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
/* compiled from: ComboCartProductBinder.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001BW\u0012\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00050\u0011\u0012\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00050\u0011\u0012\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00050\u0011\u0012\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00050\u0011¢\u0006\u0004\b\u001c\u0010\u001dJ\u0014\u0010\u0006\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0014\u0010\u0007\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u001a\u0010\u000b\u001a\u00020\u0005*\u00020\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002J\u0014\u0010\f\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J \u0010\u0010\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000eH\u0016R \u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00050\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R \u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00050\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R \u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00050\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0014R \u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00050\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0014¨\u0006\u001e"}, d2 = {"Lug1;", "Loyb;", "Lcom/dodopizza/order/feature/shoppingcart/adapter/good/combo/ComboCartProductViewHolder;", "Lvg1;", "data", "", Image.TYPE_MEDIUM, "k", "", "Leq0;", "products", "n", "l", "view", "", "position", "j", "Lkotlin/Function1;", "Lnq0;", "a", "Lkotlin/jvm/functions/Function1;", "minusCountListener", "b", "plusCountListener", com.huawei.hms.opendevice.c.a, "removeListener", DateTokenConverter.CONVERTER_KEY, "changeListener", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: ug1  reason: default package */
/* loaded from: classes2.dex */
public final class ug1 extends oyb<ComboCartProductViewHolder, vg1> {
    private final Function1<nq0, Unit> a;
    private final Function1<nq0, Unit> b;
    private final Function1<nq0, Unit> c;
    private final Function1<nq0, Unit> d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ComboCartProductBinder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ug1$a */
    /* loaded from: classes2.dex */
    public static final class a extends ej5 implements Function0<Unit> {
        final /* synthetic */ vg1 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(vg1 vg1Var) {
            super(0);
            this.b = vg1Var;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ug1.this.d.invoke(this.b.c());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ComboCartProductBinder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ug1$b */
    /* loaded from: classes2.dex */
    public static final class b extends ej5 implements Function0<Unit> {
        final /* synthetic */ vg1 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(vg1 vg1Var) {
            super(0);
            this.b = vg1Var;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ug1.this.d.invoke(this.b.c());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ComboCartProductBinder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ug1$c */
    /* loaded from: classes2.dex */
    public static final class c extends ej5 implements Function0<Unit> {
        final /* synthetic */ vg1 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(vg1 vg1Var) {
            super(0);
            this.b = vg1Var;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ug1.this.a.invoke(this.b.c());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ComboCartProductBinder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ug1$d */
    /* loaded from: classes2.dex */
    public static final class d extends ej5 implements Function0<Unit> {
        final /* synthetic */ vg1 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(vg1 vg1Var) {
            super(0);
            this.b = vg1Var;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ug1.this.b.invoke(this.b.c());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ComboCartProductBinder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ug1$e */
    /* loaded from: classes2.dex */
    public static final class e extends ej5 implements Function0<Unit> {
        final /* synthetic */ vg1 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(vg1 vg1Var) {
            super(0);
            this.b = vg1Var;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ug1.this.d.invoke(this.b.c());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ComboCartProductBinder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ug1$f */
    /* loaded from: classes2.dex */
    public static final class f extends ej5 implements Function0<Unit> {
        final /* synthetic */ vg1 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(vg1 vg1Var) {
            super(0);
            this.b = vg1Var;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ug1.this.c.invoke(this.b.c());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ComboCartProductBinder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ug1$g */
    /* loaded from: classes2.dex */
    public static final class g extends ej5 implements Function0<Unit> {
        final /* synthetic */ vg1 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(vg1 vg1Var) {
            super(0);
            this.b = vg1Var;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ug1.this.c.invoke(this.b.c());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ug1(Function1<? super nq0, Unit> function1, Function1<? super nq0, Unit> function12, Function1<? super nq0, Unit> function13, Function1<? super nq0, Unit> function14) {
        z65.h(function1, "minusCountListener");
        z65.h(function12, "plusCountListener");
        z65.h(function13, "removeListener");
        z65.h(function14, "changeListener");
        this.a = function1;
        this.b = function12;
        this.c = function13;
        this.d = function14;
    }

    private final void k(ComboCartProductViewHolder comboCartProductViewHolder, vg1 vg1Var) {
        hn6 f2 = kn6.f();
        for (eq0 eq0Var : vg1Var.h()) {
            f2 = rn6.f(f2, eq0Var.d());
        }
        hn6 g2 = rn6.g(f2, Math.max(vg1Var.a(), 1));
        if (rn6.c(g2, vg1Var.g()) > 0) {
            comboCartProductViewHolder.showRawPrice(un6.b(g2));
        } else {
            comboCartProductViewHolder.hideRawPrice();
        }
    }

    private final void l(ComboCartProductViewHolder comboCartProductViewHolder, vg1 vg1Var) {
        int w;
        String i0;
        if (vg1Var.i()) {
            ArrayList<eq0> arrayList = new ArrayList();
            for (Object obj : vg1Var.h()) {
                if (((eq0) obj).h()) {
                    arrayList.add(obj);
                }
            }
            w = lc1.w(arrayList, 10);
            ArrayList arrayList2 = new ArrayList(w);
            for (eq0 eq0Var : arrayList) {
                arrayList2.add(eq0Var.c());
            }
            comboCartProductViewHolder.setChangeButtonRight(new e(vg1Var));
            comboCartProductViewHolder.setRemoveButtonLeft(new f(vg1Var));
            i0 = sc1.i0(arrayList2, null, null, null, 0, null, null, 63, null);
            comboCartProductViewHolder.showStopProducts(i0);
            return;
        }
        comboCartProductViewHolder.hideChangeButtonLeft();
        comboCartProductViewHolder.setRemoveButtonRight(new g(vg1Var));
        comboCartProductViewHolder.showStop();
    }

    private final void m(ComboCartProductViewHolder comboCartProductViewHolder, vg1 vg1Var) {
        if (vg1Var.a() > 0) {
            comboCartProductViewHolder.enableMinusCounter();
        } else {
            comboCartProductViewHolder.disableMinusCounter();
        }
        if (vg1Var.a() < vg1Var.e()) {
            comboCartProductViewHolder.enablePlusCounter();
        } else {
            comboCartProductViewHolder.disablePlusCounter();
        }
    }

    private final void n(ComboCartProductViewHolder comboCartProductViewHolder, List<eq0> list) {
        String b2;
        int w;
        int w2;
        for (eq0 eq0Var : list) {
            if (eq0Var.a() != kl8.b && eq0Var.e() != null) {
                Resources resources = comboCartProductViewHolder.itemView.getContext().getResources();
                b2 = resources.getString(r09.c2, eq0Var.e().getValue(), resources.getString(pb6.a(nb6.a.a(Integer.parseInt(eq0Var.e().a()))).a()));
            } else {
                b2 = eq0Var.b();
            }
            String c2 = eq0Var.c();
            Collection<xq0> g2 = eq0Var.g();
            w = lc1.w(g2, 10);
            ArrayList arrayList = new ArrayList(w);
            for (xq0 xq0Var : g2) {
                arrayList.add(xq0Var.getName());
            }
            Collection<xq0> f2 = eq0Var.f();
            w2 = lc1.w(f2, 10);
            ArrayList arrayList2 = new ArrayList(w2);
            for (xq0 xq0Var2 : f2) {
                arrayList2.add(xq0Var2.getName());
            }
            comboCartProductViewHolder.showComboProductsInfo(c2, b2, arrayList, arrayList2);
        }
    }

    @Override // defpackage.oyb
    /* renamed from: j */
    public void b(ComboCartProductViewHolder comboCartProductViewHolder, vg1 vg1Var, int i) {
        z65.h(comboCartProductViewHolder, "view");
        z65.h(vg1Var, "data");
        comboCartProductViewHolder.showImage(vg1Var.d());
        comboCartProductViewHolder.setTitle(vg1Var.f());
        comboCartProductViewHolder.clearComboProductsInfo();
        if (vg1Var.b()) {
            comboCartProductViewHolder.showDisabledState();
            l(comboCartProductViewHolder, vg1Var);
            comboCartProductViewHolder.hidePriceSector();
            return;
        }
        comboCartProductViewHolder.hideStop();
        comboCartProductViewHolder.setContainerChangeListener(new a(vg1Var));
        comboCartProductViewHolder.setChangeButtonLeft(new b(vg1Var));
        comboCartProductViewHolder.showCounterButton();
        comboCartProductViewHolder.setCounter(String.valueOf(vg1Var.a()));
        comboCartProductViewHolder.setOnMinusCounterClickListener(new c(vg1Var));
        comboCartProductViewHolder.setOnPlusCounterClickListener(new d(vg1Var));
        comboCartProductViewHolder.showPriceSector();
        comboCartProductViewHolder.setFinalPrice(un6.b(vg1Var.g()));
        k(comboCartProductViewHolder, vg1Var);
        m(comboCartProductViewHolder, vg1Var);
        n(comboCartProductViewHolder, vg1Var.h());
    }
}
