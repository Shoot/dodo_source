package com.dodopizza.order.feature.product.card.presentation.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: ExpandableFoodValueInfoIconView.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0002\u001c\u000eB\u001b\b\u0016\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\u0007\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0005H\u0016J\u001e\u0010\f\u001a\u00020\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u0003R\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u001d"}, d2 = {"Lcom/dodopizza/order/feature/product/card/presentation/view/ExpandableFoodValueInfoIconView;", "Lcn3;", "Lcom/dodopizza/order/feature/product/card/presentation/view/ExpandableFoodValueInfoIconView$c;", "", "r", "", Image.TYPE_SMALL, "p", "o", "", "foodValues", "inCenter", "t", "", com.huawei.hms.opendevice.c.a, "I", "iconResId", "Landroid/view/ViewGroup;", DateTokenConverter.CONVERTER_KEY, "Landroid/view/ViewGroup;", "layoutContainer", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", e.a, "b", "order_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class ExpandableFoodValueInfoIconView extends cn3 {
    public static final b e = new b(null);
    public static final int f = 8;
    private static final Function1<fl8, c> g = a.a;
    private final int c;
    private final ViewGroup d;

    /* compiled from: ExpandableFoodValueInfoIconView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lfl8;", "product", "Lcom/dodopizza/order/feature/product/card/presentation/view/ExpandableFoodValueInfoIconView$c;", "a", "(Lfl8;)Lcom/dodopizza/order/feature/product/card/presentation/view/ExpandableFoodValueInfoIconView$c;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    static final class a extends ej5 implements Function1<fl8, c> {
        public static final a a = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final c invoke(fl8 fl8Var) {
            z65.h(fl8Var, "product");
            return new c(fl8Var.getName(), fl8Var.i(), fl8Var.b(), fl8Var.c());
        }
    }

    /* compiled from: ExpandableFoodValueInfoIconView.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/dodopizza/order/feature/product/card/presentation/view/ExpandableFoodValueInfoIconView$b;", "", "Lkotlin/Function1;", "Lfl8;", "Lcom/dodopizza/order/feature/product/card/presentation/view/ExpandableFoodValueInfoIconView$c;", "toFoodValueModel", "Lkotlin/jvm/functions/Function1;", "a", "()Lkotlin/jvm/functions/Function1;", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Function1<fl8, c> a() {
            return ExpandableFoodValueInfoIconView.g;
        }
    }

    /* compiled from: ExpandableFoodValueInfoIconView.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u000e\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\n\u001a\u0004\b\t\u0010\fR\u0017\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\n\u001a\u0004\b\u000f\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/dodopizza/order/feature/product/card/presentation/view/ExpandableFoodValueInfoIconView$c;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "()Ljava/lang/String;", Action.NAME_ATTRIBUTE, "Lrl8;", "b", "Lrl8;", com.huawei.hms.opendevice.c.a, "()Lrl8;", "foodValue", "allergens", "allergensCanContain", "<init>", "(Ljava/lang/String;Lrl8;Ljava/lang/String;Ljava/lang/String;)V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class c {
        private final String a;
        private final rl8 b;
        private final String c;
        private final String d;

        public c(String str, rl8 rl8Var, String str2, String str3) {
            z65.h(str, Action.NAME_ATTRIBUTE);
            z65.h(rl8Var, "foodValue");
            z65.h(str2, "allergens");
            z65.h(str3, "allergensCanContain");
            this.a = str;
            this.b = rl8Var;
            this.c = str2;
            this.d = str3;
        }

        public final String a() {
            return this.c;
        }

        public final String b() {
            return this.d;
        }

        public final rl8 c() {
            return this.b;
        }

        public final String d() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (z65.c(this.a, cVar.a) && z65.c(this.b, cVar.b) && z65.c(this.c, cVar.c) && z65.c(this.d, cVar.d)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
        }

        public String toString() {
            String str = this.a;
            rl8 rl8Var = this.b;
            String str2 = this.c;
            String str3 = this.d;
            return "FoodValueModel(name=" + str + ", foodValue=" + rl8Var + ", allergens=" + str2 + ", allergensCanContain=" + str3 + ")";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExpandableFoodValueInfoIconView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.c = bx8.ic_info;
        s();
        View inflate = LayoutInflater.from(getContext()).inflate(gz8.food_value_content_layout, (ViewGroup) null);
        z65.e(inflate);
        d(inflate);
        View findViewById = inflate.findViewById(gy8.layout_container);
        z65.g(findViewById, "findViewById(...)");
        this.d = (ViewGroup) findViewById;
        View findViewById2 = inflate.findViewById(gy8.k0);
        z65.g(findViewById2, "findViewById(...)");
        oma.a(findViewById2, new com.dodopizza.order.feature.product.card.presentation.view.a(this));
    }

    private final boolean r(c cVar) {
        Double i;
        i = j0b.i(cVar.c().d());
        if (((Number) mh5.c(i, Double.valueOf(0.0d))).doubleValue() == 0.0d && cVar.a().length() <= 0 && cVar.b().length() <= 0) {
            return false;
        }
        return true;
    }

    private final void s() {
        setImageDrawable(iu1.e(getContext(), this.c));
    }

    public static /* synthetic */ void u(ExpandableFoodValueInfoIconView expandableFoodValueInfoIconView, List list, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        expandableFoodValueInfoIconView.t(list, z);
    }

    @Override // defpackage.cn3
    public void o() {
        s();
    }

    @Override // defpackage.cn3
    public void p() {
        super.p();
        s();
    }

    public final void t(List<c> list, boolean z) {
        boolean z2;
        int i;
        z65.h(list, "foodValues");
        this.d.removeAllViews();
        List<c> list2 = list;
        int i2 = 0;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            for (c cVar : list2) {
                if (r(cVar)) {
                    z2 = true;
                    break;
                }
            }
        }
        z2 = false;
        if (z2) {
            i = 0;
        } else {
            i = 8;
        }
        setVisibility(i);
        for (Object obj : list2) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                kc1.v();
            }
            c cVar2 = (c) obj;
            ViewGroup viewGroup = this.d;
            t44 t44Var = new t44(getContext());
            rl8 c2 = cVar2.c();
            t44Var.setName(cVar2.d());
            t44Var.setEnergyValue(c2.c());
            t44Var.setProteinsValue(c2.d());
            t44Var.setFatsValue(c2.b());
            t44Var.setCarbohydratesValue(c2.a());
            t44Var.setWeightValue(c2.e());
            t44Var.b(cVar2.a(), cVar2.b());
            if (i2 != list.size() - 1) {
                t44Var.c();
            }
            viewGroup.addView(t44Var);
            i2 = i3;
        }
        l(z);
    }
}
