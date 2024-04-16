package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.e;
import com.dodopizza.order.feature.assistant.AssistantFeatureDependencies;
import com.dodopizza.order.feature.assistant.result.presentation.AssistantGeneratorAddedIngredientViewHolder;
import com.dodopizza.order.feature.assistant.result.presentation.AssistantGeneratorBaseIngredientViewHolder;
import com.dodopizza.order.feature.assistant.result.presentation.AssistantGeneratorResultPresenter;
import com.google.android.material.button.MaterialButton;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.k6;
import defpackage.nt;
import defpackage.ot;
import defpackage.tn6;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
/* compiled from: AssistantGeneratorResultFragment.kt */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 [2\u00020\u00012\u00020\u0002:\u0001\\B\u0007¢\u0006\u0004\bY\u0010ZJ\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\u001a\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0016R\u001b\u0010\u0014\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001c\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0011\u001a\u0004\b\u001b\u0010\u0013R\u001b\u0010\u001f\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0011\u001a\u0004\b\u001e\u0010\u0013R\u001b\u0010$\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u0011\u001a\u0004\b\"\u0010#R\u001b\u0010)\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\u0011\u001a\u0004\b'\u0010(R\u001b\u0010.\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010\u0011\u001a\u0004\b,\u0010-R\u001b\u00103\u001a\u00020/8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u0010\u0011\u001a\u0004\b1\u00102R\u001b\u00106\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u0010\u0011\u001a\u0004\b5\u0010#R\u001b\u00109\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b7\u0010\u0011\u001a\u0004\b8\u0010#R\u001b\u0010<\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b:\u0010\u0011\u001a\u0004\b;\u0010\u0013R\"\u0010D\u001a\u00020=8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR(\u0010M\u001a\b\u0012\u0004\u0012\u00020F0E8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR#\u0010S\u001a\n N*\u0004\u0018\u00010F0F8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010RR\u001a\u0010X\u001a\b\u0012\u0004\u0012\u00020U0T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010W¨\u0006]"}, d2 = {"Lut;", "La70;", "Lcu;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "Landroid/view/View;", "view", "onViewCreated", "", "onBackPressed", "Lau;", "resultVO", "i7", "Landroid/widget/TextView;", Image.TYPE_HIGH, "Lk79;", "Dh", "()Landroid/widget/TextView;", "title", "Landroid/widget/ImageView;", "i", "wh", "()Landroid/widget/ImageView;", "pizzaImage", "j", "xh", "pizzaName", "k", "vh", "pizzaDescription", "Landroid/widget/Button;", "l", "qh", "()Landroid/widget/Button;", "addToCartButton", "Lcom/google/android/material/button/MaterialButton;", Image.TYPE_MEDIUM, "Ch", "()Lcom/google/android/material/button/MaterialButton;", "startOverButton", "Landroidx/recyclerview/widget/RecyclerView;", "n", "sh", "()Landroidx/recyclerview/widget/RecyclerView;", "ingredientList", "Landroid/widget/ImageButton;", "o", "rh", "()Landroid/widget/ImageButton;", "backButton", "p", "Bh", "shareButton", "q", "Ah", "regenerateButton", "r", "th", "message", "Ltn6;", Image.TYPE_SMALL, "Ltn6;", "uh", "()Ltn6;", "setMoneyFormatter", "(Ltn6;)V", "moneyFormatter", "Las8;", "Lcom/dodopizza/order/feature/assistant/result/presentation/AssistantGeneratorResultPresenter;", "t", "Las8;", "zh", "()Las8;", "setPresenterProvider", "(Las8;)V", "presenterProvider", "kotlin.jvm.PlatformType", "u", "Lmoxy/ktx/MoxyKtxDelegate;", "yh", "()Lcom/dodopizza/order/feature/assistant/result/presentation/AssistantGeneratorResultPresenter;", "presenter", "Ll6;", "Lnt$c;", "v", "Ll6;", "ingredients", "<init>", "()V", "w", "a", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: ut  reason: default package */
/* loaded from: classes2.dex */
public final class ut extends a70 implements cu {
    private final k79 h;
    private final k79 i;
    private final k79 j;
    private final k79 k;
    private final k79 l;
    private final k79 m;
    private final k79 n;
    private final k79 o;
    private final k79 p;
    private final k79 q;
    private final k79 r;
    public tn6 s;
    public as8<AssistantGeneratorResultPresenter> t;
    private final MoxyKtxDelegate u;
    private final l6<nt.c> v;
    static final /* synthetic */ je5<Object>[] x = {bc9.f(new ar8(ut.class, "title", "getTitle()Landroid/widget/TextView;", 0)), bc9.f(new ar8(ut.class, "pizzaImage", "getPizzaImage()Landroid/widget/ImageView;", 0)), bc9.f(new ar8(ut.class, "pizzaName", "getPizzaName()Landroid/widget/TextView;", 0)), bc9.f(new ar8(ut.class, "pizzaDescription", "getPizzaDescription()Landroid/widget/TextView;", 0)), bc9.f(new ar8(ut.class, "addToCartButton", "getAddToCartButton()Landroid/widget/Button;", 0)), bc9.f(new ar8(ut.class, "startOverButton", "getStartOverButton()Lcom/google/android/material/button/MaterialButton;", 0)), bc9.f(new ar8(ut.class, "ingredientList", "getIngredientList()Landroidx/recyclerview/widget/RecyclerView;", 0)), bc9.f(new ar8(ut.class, "backButton", "getBackButton()Landroid/widget/ImageButton;", 0)), bc9.f(new ar8(ut.class, "shareButton", "getShareButton()Landroid/widget/Button;", 0)), bc9.f(new ar8(ut.class, "regenerateButton", "getRegenerateButton()Landroid/widget/Button;", 0)), bc9.f(new ar8(ut.class, "message", "getMessage()Landroid/widget/TextView;", 0)), bc9.f(new ar8(ut.class, "presenter", "getPresenter()Lcom/dodopizza/order/feature/assistant/result/presentation/AssistantGeneratorResultPresenter;", 0))};
    public static final a w = new a(null);
    public static final int y = 8;

    /* compiled from: AssistantGeneratorResultFragment.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lut$a;", "", "Lst;", "data", "Lut;", "a", "", "EXTRA_KEY_DATA", "Ljava/lang/String;", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: ut$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ut a(st stVar) {
            z65.h(stVar, "data");
            return (ut) y64.d(new ut(), bi0.c(bi0.d("data", stVar)));
        }
    }

    /* compiled from: AssistantGeneratorResultFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ut$b */
    /* loaded from: classes2.dex */
    static final class b extends ej5 implements Function1<View, Unit> {
        b() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            ut.this.yh().w();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: AssistantGeneratorResultFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ut$c */
    /* loaded from: classes2.dex */
    static final class c extends ej5 implements Function1<View, Unit> {
        c() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            ut.this.yh().A();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: AssistantGeneratorResultFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ut$d */
    /* loaded from: classes2.dex */
    static final class d extends ej5 implements Function1<View, Unit> {
        d() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            ut.this.yh().onBackPressed();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: AssistantGeneratorResultFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ut$e */
    /* loaded from: classes2.dex */
    static final class e extends ej5 implements Function1<View, Unit> {
        e() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            ut.this.yh().z();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: AssistantGeneratorResultFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ut$f */
    /* loaded from: classes2.dex */
    static final class f extends ej5 implements Function1<View, Unit> {
        f() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            ut.this.yh().x();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: AssistantGeneratorResultFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ut$g */
    /* loaded from: classes2.dex */
    /* synthetic */ class g extends m94 implements Function1<nt.a, Unit> {
        g(Object obj) {
            super(1, obj, AssistantGeneratorResultPresenter.class, "onRemoveIngredientClick", "onRemoveIngredientClick(Lcom/dodopizza/order/domain/assistant/generator/AssistantGeneratorResult$AddedIngredient;)V", 0);
        }

        public final void b(nt.a aVar) {
            z65.h(aVar, "p0");
            ((AssistantGeneratorResultPresenter) this.receiver).y(aVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(nt.a aVar) {
            b(aVar);
            return Unit.a;
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "", "item", "", "a", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ut$h */
    /* loaded from: classes2.dex */
    public static final class h extends ej5 implements Function1<Object, Boolean> {
        public static final h a = new h();

        public h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Object obj) {
            z65.h(obj, "item");
            return Boolean.valueOf(obj instanceof nt.b);
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "Landroid/view/ViewGroup;", "parentView", "Landroid/view/LayoutInflater;", "layoutInflater", "Landroidx/recyclerview/widget/RecyclerView$d0;", "a", "(Landroid/view/ViewGroup;Landroid/view/LayoutInflater;)Landroidx/recyclerview/widget/RecyclerView$d0;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ut$i */
    /* loaded from: classes2.dex */
    public static final class i extends ej5 implements Function2<ViewGroup, LayoutInflater, RecyclerView.d0> {
        public static final i a = new i();

        public i() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final RecyclerView.d0 invoke(ViewGroup viewGroup, LayoutInflater layoutInflater) {
            z65.h(viewGroup, "parentView");
            z65.h(layoutInflater, "layoutInflater");
            Object newInstance = AssistantGeneratorBaseIngredientViewHolder.class.getDeclaredConstructor(kzb.class).newInstance(new i07(viewGroup, layoutInflater));
            z65.g(newInstance, "newInstance(...)");
            return (RecyclerView.d0) newInstance;
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "", "item", "", "a", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ut$j */
    /* loaded from: classes2.dex */
    public static final class j extends ej5 implements Function1<Object, Boolean> {
        public static final j a = new j();

        public j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Object obj) {
            z65.h(obj, "item");
            return Boolean.valueOf(obj instanceof nt.a);
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "Landroid/view/ViewGroup;", "parentView", "Landroid/view/LayoutInflater;", "layoutInflater", "Landroidx/recyclerview/widget/RecyclerView$d0;", "a", "(Landroid/view/ViewGroup;Landroid/view/LayoutInflater;)Landroidx/recyclerview/widget/RecyclerView$d0;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ut$k */
    /* loaded from: classes2.dex */
    public static final class k extends ej5 implements Function2<ViewGroup, LayoutInflater, RecyclerView.d0> {
        public static final k a = new k();

        public k() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final RecyclerView.d0 invoke(ViewGroup viewGroup, LayoutInflater layoutInflater) {
            z65.h(viewGroup, "parentView");
            z65.h(layoutInflater, "layoutInflater");
            Object newInstance = AssistantGeneratorAddedIngredientViewHolder.class.getDeclaredConstructor(kzb.class).newInstance(new i07(viewGroup, layoutInflater));
            z65.g(newInstance, "newInstance(...)");
            return (RecyclerView.d0) newInstance;
        }
    }

    /* compiled from: AssistantGeneratorResultFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/dodopizza/order/feature/assistant/result/presentation/AssistantGeneratorResultPresenter;", "kotlin.jvm.PlatformType", "a", "()Lcom/dodopizza/order/feature/assistant/result/presentation/AssistantGeneratorResultPresenter;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ut$l */
    /* loaded from: classes2.dex */
    static final class l extends ej5 implements Function0<AssistantGeneratorResultPresenter> {
        l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final AssistantGeneratorResultPresenter invoke() {
            return ut.this.zh().get();
        }
    }

    /* compiled from: AssistantGeneratorResultFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "Lnt$c;", "old", "new", "Landroidx/recyclerview/widget/e$e;", "a", "(Ljava/util/List;Ljava/util/List;)Landroidx/recyclerview/widget/e$e;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ut$m */
    /* loaded from: classes2.dex */
    static final class m extends ej5 implements Function2<List<? extends nt.c>, List<? extends nt.c>, e.C0047e> {
        public static final m a = new m();

        m() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final e.C0047e invoke(List<? extends nt.c> list, List<? extends nt.c> list2) {
            z65.h(list, "old");
            z65.h(list2, "new");
            e.C0047e b = androidx.recyclerview.widget.e.b(new ht(list, list2));
            z65.g(b, "calculateDiff(...)");
            return b;
        }
    }

    public ut() {
        super(gz8.fragment_assistant_generator_result);
        this.h = kb0.e(this, gy8.S5);
        this.i = kb0.e(this, gy8.pizza_image);
        this.j = kb0.e(this, gy8.pizza_name);
        this.k = kb0.e(this, gy8.pizza_description);
        this.l = kb0.e(this, gy8.add_to_cart);
        this.m = kb0.e(this, gy8.start_over);
        this.n = kb0.e(this, gy8.pizza_ingredients);
        this.o = kb0.e(this, gy8.m);
        this.p = kb0.e(this, gy8.share_button);
        this.q = kb0.e(this, gy8.regenerate_button);
        this.r = kb0.e(this, gy8.s1);
        l lVar = new l();
        MvpDelegate mvpDelegate = getMvpDelegate();
        z65.g(mvpDelegate, "mvpDelegate");
        this.u = new MoxyKtxDelegate(mvpDelegate, AssistantGeneratorResultPresenter.class.getName() + ".presenter", lVar);
        this.v = new l6<>(null, 1, null);
    }

    private final Button Ah() {
        return (Button) this.q.a(this, x[9]);
    }

    private final Button Bh() {
        return (Button) this.p.a(this, x[8]);
    }

    private final MaterialButton Ch() {
        return (MaterialButton) this.m.a(this, x[5]);
    }

    private final TextView Dh() {
        return (TextView) this.h.a(this, x[0]);
    }

    private final Button qh() {
        return (Button) this.l.a(this, x[4]);
    }

    private final ImageButton rh() {
        return (ImageButton) this.o.a(this, x[7]);
    }

    private final RecyclerView sh() {
        return (RecyclerView) this.n.a(this, x[6]);
    }

    private final TextView th() {
        return (TextView) this.r.a(this, x[10]);
    }

    private final TextView vh() {
        return (TextView) this.k.a(this, x[3]);
    }

    private final ImageView wh() {
        return (ImageView) this.i.a(this, x[1]);
    }

    private final TextView xh() {
        return (TextView) this.j.a(this, x[2]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AssistantGeneratorResultPresenter yh() {
        return (AssistantGeneratorResultPresenter) this.u.getValue(this, x[11]);
    }

    @Override // defpackage.cu
    public void i7(au auVar) {
        String string;
        String string2;
        z65.h(auVar, "resultVO");
        com.bumptech.glide.b.u(wh()).t(auVar.c().c()).a0(bx8.c).o0(new gi4(kx9.a(24), kx9.a(24), 0.0f, 0.0f)).G0(wh());
        TextView Dh = Dh();
        if (auVar.d() != null) {
            string = getString(r09.assistant_result_title_authorized_user, auVar.d());
        } else {
            string = getString(r09.assistant_result_title_unauthorized_user);
        }
        Dh.setText(string);
        MaterialButton Ch = Ch();
        if (auVar.e()) {
            string2 = getString(r09.assistant_result_button_start_over);
        } else {
            string2 = getString(r09.assistant_result_button_create_your_own);
        }
        Ch.setText(string2);
        xh().setText(auVar.c().getName());
        vh().setText(auVar.c().b());
        th().setText(auVar.b());
        qh().setText(getString(r09.assistant_result_button_add_to_cart, tn6.a.b(uh(), auVar.c().e(), null, 2, null)));
        this.v.Z(auVar.a(), m.a);
    }

    @Override // defpackage.w50
    public boolean onBackPressed() {
        yh().onBackPressed();
        return true;
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        ot.b a2 = ot.a.a();
        Bundle arguments = getArguments();
        Object obj = (arguments == null || (obj = arguments.get("data")) == null) ? null : null;
        if (obj != null && !(obj instanceof st)) {
            throw new ClassCastException("Property data has different class type");
        } else if (obj != null) {
            a2.a((st) obj, (AssistantFeatureDependencies) getComponentDependenciesRegistry().a(bc9.b(AssistantFeatureDependencies.class))).a(this);
            super.onCreate(bundle);
        } else {
            throw new IllegalArgumentException("Argument with key = data not found in bundle");
        }
    }

    @Override // defpackage.a70, defpackage.f70, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        z65.h(view, "view");
        super.onViewCreated(view, bundle);
        oma.a(qh(), new b());
        oma.a(Ch(), new c());
        oma.a(rh(), new d());
        oma.a(Bh(), new e());
        oma.a(Ah(), new f());
        sh().addItemDecoration(new cj8());
        sh().addItemDecoration(new zo4(8, 16, 12));
        RecyclerView sh = sh();
        k6 k6Var = new k6(this.v);
        new k6.a(k6Var, h.a, new ct(), i.a).b();
        AssistantGeneratorResultPresenter yh = yh();
        z65.g(yh, "<get-presenter>(...)");
        new k6.a(k6Var, j.a, new bt(new g(yh)), k.a).b();
        sh.setAdapter(k6Var.d());
    }

    public final tn6 uh() {
        tn6 tn6Var = this.s;
        if (tn6Var != null) {
            return tn6Var;
        }
        z65.z("moneyFormatter");
        return null;
    }

    public final as8<AssistantGeneratorResultPresenter> zh() {
        as8<AssistantGeneratorResultPresenter> as8Var = this.t;
        if (as8Var != null) {
            return as8Var;
        }
        z65.z("presenterProvider");
        return null;
    }
}
