package com.dodopizza.order.feature.menu.adapters.menuitem;

import android.widget.ImageView;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
/* compiled from: TwoColumnMenuItemBinder.kt */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B3\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00060#\u0012\u0006\u0010\u001c\u001a\u00020\u0019\u0012\u0006\u0010 \u001a\u00020\u001d¢\u0006\u0004\b&\u0010'J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0003H\u0002J \u0010\n\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\bH\u0002J0\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J\"\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0011H\u0002J \u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\bH\u0002J \u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u000fH\u0016R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006("}, d2 = {"Lcom/dodopizza/order/feature/menu/adapters/menuitem/e;", "Lcom/dodopizza/order/feature/menu/adapters/menuitem/b;", "Lcom/dodopizza/order/feature/menu/adapters/menuitem/TwoColumnMenuItemRegularVH;", "Lb93;", "view", "data", "", Image.TYPE_SMALL, "", "timeRemain", "r", "", "isStopped", "Lre6;", "menuItemType", "", "variationsCount", "Lhn6;", "price", "p", "rawPrice", "t", "q", "position", "o", "Lu18;", com.huawei.hms.push.e.a, "Lu18;", "timerFormatter", "Lf5b;", "f", "Lf5b;", "timeProvider", "Lrd6;", "listener", "Lkotlin/Function1;", "Landroid/widget/ImageView;", "animator", "<init>", "(Lrd6;Lkotlin/jvm/functions/Function1;Lu18;Lf5b;)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class e extends com.dodopizza.order.feature.menu.adapters.menuitem.b<TwoColumnMenuItemRegularVH, b93> {
    private final u18 e;
    private final f5b f;

    /* compiled from: TwoColumnMenuItemBinder.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {
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
    /* compiled from: TwoColumnMenuItemBinder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class b extends ej5 implements Function0<Unit> {
        final /* synthetic */ TwoColumnMenuItemRegularVH b;
        final /* synthetic */ b93 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(TwoColumnMenuItemRegularVH twoColumnMenuItemRegularVH, b93 b93Var) {
            super(0);
            this.b = twoColumnMenuItemRegularVH;
            this.c = b93Var;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            e.this.r(this.b, this.c, 0L);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(rd6 rd6Var, Function1<? super ImageView, Unit> function1, u18 u18Var, f5b f5bVar) {
        super(rd6Var, function1);
        z65.h(rd6Var, "listener");
        z65.h(function1, "animator");
        z65.h(u18Var, "timerFormatter");
        z65.h(f5bVar, "timeProvider");
        this.e = u18Var;
        this.f = f5bVar;
    }

    private final void p(TwoColumnMenuItemRegularVH twoColumnMenuItemRegularVH, boolean z, re6 re6Var, int i, hn6 hn6Var) {
        if (z) {
            twoColumnMenuItemRegularVH.showNotAvailable();
            return;
        }
        int i2 = a.$EnumSwitchMapping$0[re6Var.ordinal()];
        if (i2 != 1 && i2 != 2) {
            if (i2 != 3) {
                if (i2 != 4) {
                    if (i > 1) {
                        twoColumnMenuItemRegularVH.showVariable(un6.b(hn6Var));
                        return;
                    } else {
                        twoColumnMenuItemRegularVH.showVariableOneVariation(un6.b(hn6Var));
                        return;
                    }
                }
                twoColumnMenuItemRegularVH.showAssistantStartButton();
                return;
            }
            twoColumnMenuItemRegularVH.showBuildHalves();
            return;
        }
        twoColumnMenuItemRegularVH.setSelectButtonTitle(un6.b(hn6Var));
    }

    private final void q(TwoColumnMenuItemRegularVH twoColumnMenuItemRegularVH, b93 b93Var, long j) {
        if (j > 0) {
            twoColumnMenuItemRegularVH.showEnabledPersonalPriceTimer(this.e, j);
            twoColumnMenuItemRegularVH.launchPersonalPriceTimer(this.e, j, new b(twoColumnMenuItemRegularVH, b93Var));
            return;
        }
        twoColumnMenuItemRegularVH.hidePersonalPriceBadge();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r(TwoColumnMenuItemRegularVH twoColumnMenuItemRegularVH, b93 b93Var, long j) {
        if (j <= 0) {
            p(twoColumnMenuItemRegularVH, b93Var.p(), b93Var.H(), b93Var.G(), (hn6) mh5.c(b93Var.A(), b93Var.h()));
            twoColumnMenuItemRegularVH.hideRawPrice();
            return;
        }
        p(twoColumnMenuItemRegularVH, b93Var.p(), b93Var.H(), b93Var.G(), b93Var.h());
        t(twoColumnMenuItemRegularVH, b93Var.p(), b93Var.A());
    }

    private final void s(TwoColumnMenuItemRegularVH twoColumnMenuItemRegularVH, b93 b93Var) {
        p(twoColumnMenuItemRegularVH, b93Var.p(), b93Var.H(), b93Var.G(), b93Var.h());
        t(twoColumnMenuItemRegularVH, b93Var.p(), b93Var.A());
    }

    private final void t(TwoColumnMenuItemRegularVH twoColumnMenuItemRegularVH, boolean z, hn6 hn6Var) {
        if (hn6Var != null && !z) {
            twoColumnMenuItemRegularVH.showRawPrice(un6.b(hn6Var));
        } else {
            twoColumnMenuItemRegularVH.hideRawPrice();
        }
    }

    @Override // defpackage.oyb
    /* renamed from: o */
    public void b(TwoColumnMenuItemRegularVH twoColumnMenuItemRegularVH, b93 b93Var, int i) {
        z65.h(twoColumnMenuItemRegularVH, "view");
        z65.h(b93Var, "data");
        super.j(twoColumnMenuItemRegularVH, b93Var, i);
        if (b93Var.E()) {
            twoColumnMenuItemRegularVH.showPersonalPriceBadge();
            long C = b93Var.C() - this.f.b();
            r(twoColumnMenuItemRegularVH, b93Var, C);
            q(twoColumnMenuItemRegularVH, b93Var, C);
            return;
        }
        twoColumnMenuItemRegularVH.hidePersonalPriceBadge();
        s(twoColumnMenuItemRegularVH, b93Var);
    }
}
