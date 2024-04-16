package com.dodopizza.order.feature.halves.constructor.presentation;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.order.feature.halves.constructor.presentation.e;
import com.google.android.flexbox.FlexboxLayout;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: IngredientsDialog.kt */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 72\u00020\u0001:\u00018B\u0007¢\u0006\u0004\b5\u00106J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0016\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002J\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0012\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016J\u001a\u0010\u0015\u001a\u00020\u00022\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00020\u0012J\u001a\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016R\u001b\u0010\u001d\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010 \u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001f\u0010\u001cR\u001b\u0010%\u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u001a\u001a\u0004\b#\u0010$R\u001b\u0010(\u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\u001a\u001a\u0004\b'\u0010$R\u001b\u0010-\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010\u001a\u001a\u0004\b+\u0010,R\u0016\u00101\u001a\u00020.8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b/\u00100R$\u00104\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103¨\u00069"}, d2 = {"Lcom/dodopizza/order/feature/halves/constructor/presentation/e;", "Lip6;", "", "ka", "", "Lul8;", "ingredients", "", "ph", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Llm8;", RemoteMessageConst.Notification.TAG, "Lom8;", "hh", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Lkotlin/Function1;", "Lmm8;", "listener", "nh", "Landroid/view/View;", "view", "onViewCreated", DateTokenConverter.CONVERTER_KEY, "Lk79;", "ih", "()Landroid/view/View;", "closeButton", com.huawei.hms.push.e.a, "jh", "okayButton", "Landroid/widget/TextView;", "f", "lh", "()Landroid/widget/TextView;", "pizzaName", "g", "kh", "pizzaIngredients", "Lcom/google/android/flexbox/FlexboxLayout;", Image.TYPE_HIGH, "mh", "()Lcom/google/android/flexbox/FlexboxLayout;", "tagsContainer", "Lwj4;", "i", "Lwj4;", "data", "j", "Lkotlin/jvm/functions/Function1;", "onTagClickListener", "<init>", "()V", "k", "a", "order_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class e extends ip6 {
    private final k79 d;
    private final k79 e;
    private final k79 f;
    private final k79 g;
    private final k79 h;
    private wj4 i;
    private Function1<? super mm8, Unit> j;
    static final /* synthetic */ je5<Object>[] l = {bc9.f(new ar8(e.class, "closeButton", "getCloseButton()Landroid/view/View;", 0)), bc9.f(new ar8(e.class, "okayButton", "getOkayButton()Landroid/view/View;", 0)), bc9.f(new ar8(e.class, "pizzaName", "getPizzaName()Landroid/widget/TextView;", 0)), bc9.f(new ar8(e.class, "pizzaIngredients", "getPizzaIngredients()Landroid/widget/TextView;", 0)), bc9.f(new ar8(e.class, "tagsContainer", "getTagsContainer()Lcom/google/android/flexbox/FlexboxLayout;", 0))};
    public static final a k = new a(null);
    public static final int m = 8;

    /* compiled from: IngredientsDialog.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/dodopizza/order/feature/halves/constructor/presentation/e$a;", "", "Lwj4;", "data", "Lcom/dodopizza/order/feature/halves/constructor/presentation/e;", "a", "", "EXTRA_INGREDIENTS_DATA", "Ljava/lang/String;", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final e a(wj4 wj4Var) {
            z65.h(wj4Var, "data");
            return (e) y64.d(new e(), bi0.c(bi0.d("data", wj4Var)));
        }
    }

    /* compiled from: IngredientsDialog.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    static final class b extends ej5 implements Function1<View, Unit> {
        b() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            e.this.dismiss();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: IngredientsDialog.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    static final class c extends ej5 implements Function1<View, Unit> {
        c() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            e.this.dismiss();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: IngredientsDialog.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lul8;", "it", "", "a", "(Lul8;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class d extends ej5 implements Function1<ul8, CharSequence> {
        public static final d a = new d();

        d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final CharSequence invoke(ul8 ul8Var) {
            CharSequence R0;
            z65.h(ul8Var, "it");
            R0 = m0b.R0(ul8Var.getName());
            return yza.a(qhb.a(R0.toString()));
        }
    }

    public e() {
        super(gz8.dialog_halves_ingredients);
        this.d = kb0.e(this, gy8.F);
        this.e = kb0.e(this, gy8.okay_button);
        this.f = kb0.e(this, gy8.pizza_name);
        this.g = kb0.e(this, gy8.pizza_ingredients);
        this.h = kb0.e(this, gy8.tags_container);
    }

    private final om8 hh(Context context, lm8 lm8Var) {
        om8 om8Var = new om8(context, null, 0, 6, null);
        om8Var.setContent(lm8Var);
        return om8Var;
    }

    private final View ih() {
        return (View) this.d.a(this, l[0]);
    }

    private final View jh() {
        return (View) this.e.a(this, l[1]);
    }

    private final void ka() {
        List<lm8> d2;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        wj4 wj4Var = this.i;
        if (wj4Var == null) {
            z65.z("data");
            wj4Var = null;
        }
        if (wj4Var.d().isEmpty()) {
            un3.e(mh());
            return;
        }
        mh().removeAllViews();
        un3.k(mh());
        wj4 wj4Var2 = this.i;
        if (wj4Var2 == null) {
            z65.z("data");
            wj4Var2 = null;
        }
        if (wj4Var2.p()) {
            String string = getResources().getString(r09.sold_out_tag);
            z65.g(string, "getString(...)");
            d2 = jc1.e(new lm8(null, string, null, 0, false, 29, null));
        } else {
            wj4 wj4Var3 = this.i;
            if (wj4Var3 == null) {
                z65.z("data");
                wj4Var3 = null;
            }
            d2 = wj4Var3.d();
        }
        for (final lm8 lm8Var : d2) {
            Context context = mh().getContext();
            z65.g(context, "getContext(...)");
            om8 hh = hh(context, lm8Var);
            mh().addView(hh);
            ViewGroup.LayoutParams layoutParams = hh.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            } else {
                marginLayoutParams = null;
            }
            if (marginLayoutParams != null) {
                Resources resources = getResources();
                int i = vw8.product_tag_margin;
                marginLayoutParams.bottomMargin = (int) resources.getDimension(i);
                marginLayoutParams.rightMargin = (int) getResources().getDimension(i);
            }
            hh.setOnClickListener(new View.OnClickListener() { // from class: p25
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    e.oh(e.this, lm8Var, view);
                }
            });
        }
    }

    private final TextView kh() {
        return (TextView) this.g.a(this, l[3]);
    }

    private final TextView lh() {
        return (TextView) this.f.a(this, l[2]);
    }

    private final FlexboxLayout mh() {
        return (FlexboxLayout) this.h.a(this, l[4]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void oh(e eVar, lm8 lm8Var, View view) {
        z65.h(eVar, "this$0");
        z65.h(lm8Var, "$tag");
        Function1<? super mm8, Unit> function1 = eVar.j;
        if (function1 != null) {
            String b2 = lm8Var.b();
            wj4 wj4Var = eVar.i;
            wj4 wj4Var2 = null;
            if (wj4Var == null) {
                z65.z("data");
                wj4Var = null;
            }
            String b3 = wj4Var.b();
            wj4 wj4Var3 = eVar.i;
            if (wj4Var3 == null) {
                z65.z("data");
                wj4Var3 = null;
            }
            String c2 = wj4Var3.c();
            wj4 wj4Var4 = eVar.i;
            if (wj4Var4 == null) {
                z65.z("data");
            } else {
                wj4Var2 = wj4Var4;
            }
            function1.invoke(new mm8(b2, b3, c2, String.valueOf(wj4Var2.h().a()), zc.e));
        }
    }

    private final String ph(Collection<ul8> collection) {
        String i0;
        String valueOf;
        i0 = sc1.i0(collection, null, null, null, 0, null, d.a, 31, null);
        if (i0.length() > 0) {
            StringBuilder sb = new StringBuilder();
            char charAt = i0.charAt(0);
            if (Character.isLowerCase(charAt)) {
                Locale locale = Locale.getDefault();
                z65.g(locale, "getDefault(...)");
                valueOf = nw0.d(charAt, locale);
            } else {
                valueOf = String.valueOf(charAt);
            }
            sb.append((Object) valueOf);
            String substring = i0.substring(1);
            z65.g(substring, "substring(...)");
            sb.append(substring);
            return sb.toString();
        }
        return i0;
    }

    public final void nh(Function1<? super mm8, Unit> function1) {
        z65.h(function1, "listener");
        this.j = function1;
    }

    @Override // moxy.MvpBottomSheetDialogFragment, androidx.fragment.app.c, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        Bundle arguments = getArguments();
        Object obj = (arguments == null || (obj = arguments.get("data")) == null) ? null : null;
        if (obj != null && !(obj instanceof wj4)) {
            throw new ClassCastException("Property data has different class type");
        } else if (obj != null) {
            this.i = (wj4) obj;
            super.onCreate(bundle);
        } else {
            throw new IllegalArgumentException("Argument with key = data not found in bundle");
        }
    }

    @Override // defpackage.ip6, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        z65.h(view, "view");
        super.onViewCreated(view, bundle);
        oma.a(jh(), new b());
        oma.a(ih(), new c());
        TextView lh = lh();
        wj4 wj4Var = this.i;
        wj4 wj4Var2 = null;
        if (wj4Var == null) {
            z65.z("data");
            wj4Var = null;
        }
        lh.setText(wj4Var.c());
        TextView kh = kh();
        wj4 wj4Var3 = this.i;
        if (wj4Var3 == null) {
            z65.z("data");
        } else {
            wj4Var2 = wj4Var3;
        }
        kh.setText(ph(wj4Var2.a()));
        ka();
    }
}
