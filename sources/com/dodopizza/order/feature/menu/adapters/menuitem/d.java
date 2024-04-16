package com.dodopizza.order.feature.menu.adapters.menuitem;

import android.widget.ImageView;
import com.dodopizza.order.feature.menu.adapters.menuitem.MenuItemVH;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: VH extends com.dodopizza.order.feature.menu.adapters.menuitem.MenuItemVH
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
/* compiled from: MenuItemBinder.kt */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003:\u0002./B5\b\u0004\u0012\u0006\u0010(\u001a\u00020'\u0012\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u00070)\u0012\u0006\u0010\"\u001a\u00020\u001f\u0012\u0006\u0010&\u001a\u00020#¢\u0006\u0004\b,\u0010-J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ'\u0010\f\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ7\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J)\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001b\u0010\rJ'\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%\u0082\u0001\u000201¨\u00062"}, d2 = {"Lcom/dodopizza/order/feature/menu/adapters/menuitem/d;", "Lcom/dodopizza/order/feature/menu/adapters/menuitem/MenuItemVH;", "VH", "Lcom/dodopizza/order/feature/menu/adapters/menuitem/b;", "Lrc9;", "view", "data", "", Image.TYPE_SMALL, "(Lcom/dodopizza/order/feature/menu/adapters/menuitem/MenuItemVH;Lrc9;)V", "", "timeRemain", "r", "(Lcom/dodopizza/order/feature/menu/adapters/menuitem/MenuItemVH;Lrc9;J)V", "", "isStopped", "Lre6;", "menuItemType", "", "variationsCount", "Lhn6;", "price", "p", "(Lcom/dodopizza/order/feature/menu/adapters/menuitem/MenuItemVH;ZLre6;ILhn6;)V", "rawPrice", "t", "(Lcom/dodopizza/order/feature/menu/adapters/menuitem/MenuItemVH;ZLhn6;)V", "q", "position", "o", "(Lcom/dodopizza/order/feature/menu/adapters/menuitem/MenuItemVH;Lrc9;I)V", "Lu18;", com.huawei.hms.push.e.a, "Lu18;", "timerFormatter", "Lf5b;", "f", "Lf5b;", "timeProvider", "Lrd6;", "listener", "Lkotlin/Function1;", "Landroid/widget/ImageView;", "animator", "<init>", "(Lrd6;Lkotlin/jvm/functions/Function1;Lu18;Lf5b;)V", "a", "b", "Lcom/dodopizza/order/feature/menu/adapters/menuitem/d$a;", "Lcom/dodopizza/order/feature/menu/adapters/menuitem/d$b;", "order_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public abstract class d<VH extends MenuItemVH> extends com.dodopizza.order.feature.menu.adapters.menuitem.b<VH, rc9> {
    private final u18 e;
    private final f5b f;

    /* compiled from: MenuItemBinder.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B3\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/dodopizza/order/feature/menu/adapters/menuitem/d$a;", "Lcom/dodopizza/order/feature/menu/adapters/menuitem/d;", "Lcom/dodopizza/order/feature/menu/adapters/menuitem/MenuItemVH$MenuItemBigImageVH;", "Lrd6;", "listener", "Lkotlin/Function1;", "Landroid/widget/ImageView;", "", "animator", "Lu18;", "timerFormatter", "Lf5b;", "timeProvider", "<init>", "(Lrd6;Lkotlin/jvm/functions/Function1;Lu18;Lf5b;)V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class a extends d<MenuItemVH.MenuItemBigImageVH> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(rd6 rd6Var, Function1<? super ImageView, Unit> function1, u18 u18Var, f5b f5bVar) {
            super(rd6Var, function1, u18Var, f5bVar, null);
            z65.h(rd6Var, "listener");
            z65.h(function1, "animator");
            z65.h(u18Var, "timerFormatter");
            z65.h(f5bVar, "timeProvider");
        }
    }

    /* compiled from: MenuItemBinder.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B3\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/dodopizza/order/feature/menu/adapters/menuitem/d$b;", "Lcom/dodopizza/order/feature/menu/adapters/menuitem/d;", "Lcom/dodopizza/order/feature/menu/adapters/menuitem/MenuItemVH$MenuItemRegularVH;", "Lrd6;", "listener", "Lkotlin/Function1;", "Landroid/widget/ImageView;", "", "animator", "Lu18;", "timerFormatter", "Lf5b;", "timeProvider", "<init>", "(Lrd6;Lkotlin/jvm/functions/Function1;Lu18;Lf5b;)V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class b extends d<MenuItemVH.MenuItemRegularVH> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(rd6 rd6Var, Function1<? super ImageView, Unit> function1, u18 u18Var, f5b f5bVar) {
            super(rd6Var, function1, u18Var, f5bVar, null);
            z65.h(rd6Var, "listener");
            z65.h(function1, "animator");
            z65.h(u18Var, "timerFormatter");
            z65.h(f5bVar, "timeProvider");
        }
    }

    /* compiled from: MenuItemBinder.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[re6.values().length];
            try {
                iArr[re6.a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[re6.d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[re6.c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[re6.f.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MenuItemBinder.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "VH", "Lcom/dodopizza/order/feature/menu/adapters/menuitem/MenuItemVH;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.dodopizza.order.feature.menu.adapters.menuitem.d$d  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0179d extends ej5 implements Function0<Unit> {
        final /* synthetic */ d<VH> a;
        final /* synthetic */ VH b;
        final /* synthetic */ rc9 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0179d(d<VH> dVar, VH vh, rc9 rc9Var) {
            super(0);
            this.a = dVar;
            this.b = vh;
            this.c = rc9Var;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.a.r(this.b, this.c, 0L);
        }
    }

    public /* synthetic */ d(rd6 rd6Var, Function1 function1, u18 u18Var, f5b f5bVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(rd6Var, function1, u18Var, f5bVar);
    }

    private final void p(VH vh, boolean z, re6 re6Var, int i, hn6 hn6Var) {
        if (z) {
            vh.showNotAvailable();
            return;
        }
        int i2 = c.$EnumSwitchMapping$0[re6Var.ordinal()];
        if (i2 != 1 && i2 != 2) {
            if (i2 != 3) {
                if (i2 != 4) {
                    if (i > 1) {
                        vh.showVariable(un6.b(hn6Var));
                        return;
                    } else {
                        vh.showVariableOneVariation(un6.b(hn6Var));
                        return;
                    }
                }
                vh.showAssistantStartButton();
                return;
            }
            vh.showBuildHalves();
            return;
        }
        vh.setSelectButtonTitle(un6.b(hn6Var));
    }

    private final void q(VH vh, rc9 rc9Var, long j) {
        if (j > 0) {
            vh.showEnabledPersonalPriceTimer(this.e, j);
            vh.launchPersonalPriceTimer(this.e, j, new C0179d(this, vh, rc9Var));
            return;
        }
        vh.hidePersonalPriceBadge();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r(VH vh, rc9 rc9Var, long j) {
        if (j <= 0) {
            p(vh, rc9Var.p(), rc9Var.H(), rc9Var.G(), (hn6) mh5.c(rc9Var.A(), rc9Var.h()));
            vh.hideRawPrice();
            return;
        }
        p(vh, rc9Var.p(), rc9Var.H(), rc9Var.G(), rc9Var.h());
        t(vh, rc9Var.p(), rc9Var.A());
    }

    private final void s(VH vh, rc9 rc9Var) {
        p(vh, rc9Var.p(), rc9Var.H(), rc9Var.G(), rc9Var.h());
        t(vh, rc9Var.p(), rc9Var.A());
    }

    private final void t(VH vh, boolean z, hn6 hn6Var) {
        if (hn6Var != null && !z) {
            vh.showRawPrice(un6.b(hn6Var));
        } else {
            vh.hideRawPrice();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.oyb
    public /* bridge */ /* synthetic */ void b(Object obj, Object obj2, int i) {
        o((MenuItemVH) obj, (rc9) obj2, i);
    }

    public void o(VH vh, rc9 rc9Var, int i) {
        z65.h(vh, "view");
        z65.h(rc9Var, "data");
        super.j(vh, rc9Var, i);
        if (rc9Var.E()) {
            vh.showPersonalPriceBadge();
            long C = rc9Var.C() - this.f.b();
            r(vh, rc9Var, C);
            q(vh, rc9Var, C);
            return;
        }
        vh.hidePersonalPriceBadge();
        s(vh, rc9Var);
    }

    private d(rd6 rd6Var, Function1<? super ImageView, Unit> function1, u18 u18Var, f5b f5bVar) {
        super(rd6Var, function1);
        this.e = u18Var;
        this.f = f5bVar;
    }

    static {
    }
}
