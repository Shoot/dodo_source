package com.dodopizza.controlling.feature.mysteryshoppercard.presentation;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.controlling.feature.mysteryshoppercard.MysteryShopperCardFeatureDependencies;
import com.dodopizza.controlling.feature.mysteryshoppercard.presentation.b;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.rr6;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
/* compiled from: MysteryShopperCardFragment.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 .2\u00020\u00012\u00020\u0002:\u0001/B\u0007¢\u0006\u0004\b,\u0010-J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0012\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\u001a\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\u0010\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\b\u0010\u0011\u001a\u00020\fH\u0016R\u001b\u0010\u0017\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001c\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010!\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001f\u0010 R\u001b\u0010&\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u0019\u001a\u0004\b$\u0010%R\u001b\u0010+\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010\u0019\u001a\u0004\b)\u0010*¨\u00060"}, d2 = {"Lcom/dodopizza/controlling/feature/mysteryshoppercard/presentation/a;", "Lf70;", "Lzr6;", "Lcom/dodopizza/controlling/feature/mysteryshoppercard/presentation/b$a;", "bodyItem", "Landroid/view/View;", "sh", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/LayoutInflater;", "onGetLayoutInflater", "view", "", "onViewCreated", "Lcom/dodopizza/controlling/feature/mysteryshoppercard/presentation/b;", "mysteryShopperCheckupVO", "Uc", "Ac", "Lcom/dodopizza/controlling/feature/mysteryshoppercard/presentation/MysteryShopperCardPresenter;", com.huawei.hms.opendevice.c.a, "Lmoxy/ktx/MoxyKtxDelegate;", "rh", "()Lcom/dodopizza/controlling/feature/mysteryshoppercard/presentation/MysteryShopperCardPresenter;", "presenter", DateTokenConverter.CONVERTER_KEY, "Lk79;", "ph", "()Landroid/view/View;", "mysteryShopperCard", "Landroid/widget/Button;", e.a, "oh", "()Landroid/widget/Button;", "mysteryShopperButton", "Landroid/widget/TextView;", "f", "qh", "()Landroid/widget/TextView;", "mysteryShopperTitle", "Landroid/view/ViewGroup;", "g", "nh", "()Landroid/view/ViewGroup;", "mysteryShopperBody", "<init>", "()V", Image.TYPE_HIGH, "a", "controlling_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class a extends f70 implements zr6 {
    private final MoxyKtxDelegate c;
    private final k79 d;
    private final k79 e;
    private final k79 f;
    private final k79 g;
    static final /* synthetic */ je5<Object>[] i = {bc9.f(new ar8(a.class, "presenter", "getPresenter()Lcom/dodopizza/controlling/feature/mysteryshoppercard/presentation/MysteryShopperCardPresenter;", 0)), bc9.f(new ar8(a.class, "mysteryShopperCard", "getMysteryShopperCard()Landroid/view/View;", 0)), bc9.f(new ar8(a.class, "mysteryShopperButton", "getMysteryShopperButton()Landroid/widget/Button;", 0)), bc9.f(new ar8(a.class, "mysteryShopperTitle", "getMysteryShopperTitle()Landroid/widget/TextView;", 0)), bc9.f(new ar8(a.class, "mysteryShopperBody", "getMysteryShopperBody()Landroid/view/ViewGroup;", 0))};
    public static final C0117a h = new C0117a(null);

    /* compiled from: MysteryShopperCardFragment.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/dodopizza/controlling/feature/mysteryshoppercard/presentation/a$a;", "", "Lsr6;", "data", "", "themeResId", "Landroid/os/Bundle;", "a", "", "EXTRA_KEY_DATA", "Ljava/lang/String;", "EXTRA_KEY_THEME", "<init>", "()V", "controlling_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: com.dodopizza.controlling.feature.mysteryshoppercard.presentation.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0117a {
        private C0117a() {
        }

        public /* synthetic */ C0117a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Bundle a(sr6 sr6Var, int i) {
            z65.h(sr6Var, "data");
            return bi0.c(bi0.d("data", sr6Var), bi0.d("theme", Integer.valueOf(i)));
        }
    }

    /* compiled from: MysteryShopperCardFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes.dex */
    static final class b extends ej5 implements Function1<View, Unit> {
        b() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            a.this.rh().v();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: MysteryShopperCardFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/dodopizza/controlling/feature/mysteryshoppercard/presentation/MysteryShopperCardPresenter;", "a", "()Lcom/dodopizza/controlling/feature/mysteryshoppercard/presentation/MysteryShopperCardPresenter;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes.dex */
    static final class c extends ej5 implements Function0<MysteryShopperCardPresenter> {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final MysteryShopperCardPresenter invoke() {
            rr6.b a = rr6.a.a();
            MysteryShopperCardFeatureDependencies mysteryShopperCardFeatureDependencies = (MysteryShopperCardFeatureDependencies) a.this.getComponentDependenciesRegistry().a(bc9.b(MysteryShopperCardFeatureDependencies.class));
            Bundle arguments = a.this.getArguments();
            Object obj = (arguments == null || (obj = arguments.get("data")) == null) ? null : null;
            if (obj != null && !(obj instanceof sr6)) {
                throw new ClassCastException("Property data has different class type");
            } else if (obj != null) {
                return a.a((sr6) obj, mysteryShopperCardFeatureDependencies).a();
            } else {
                throw new IllegalArgumentException("Argument with key = data not found in bundle");
            }
        }
    }

    public a() {
        super(wz8.fragment_mystery_shopper_card);
        c cVar = new c();
        MvpDelegate mvpDelegate = getMvpDelegate();
        z65.g(mvpDelegate, "mvpDelegate");
        this.c = new MoxyKtxDelegate(mvpDelegate, MysteryShopperCardPresenter.class.getName() + ".presenter", cVar);
        this.d = kb0.e(this, zx8.mystery_shopper_checkup_card);
        this.e = kb0.e(this, zx8.mystery_shopper_checkup_button);
        this.f = kb0.e(this, zx8.mystery_shopper_checkup_title);
        this.g = kb0.e(this, zx8.mystery_shopper_checkup_body);
    }

    private final ViewGroup nh() {
        return (ViewGroup) this.g.a(this, i[4]);
    }

    private final Button oh() {
        return (Button) this.e.a(this, i[2]);
    }

    private final View ph() {
        return (View) this.d.a(this, i[1]);
    }

    private final TextView qh() {
        return (TextView) this.f.a(this, i[3]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MysteryShopperCardPresenter rh() {
        return (MysteryShopperCardPresenter) this.c.getValue(this, i[0]);
    }

    private final View sh(b.a aVar) {
        View inflate = getLayoutInflater().inflate(wz8.mystery_shopper_checkup_body_item, nh(), false);
        ((TextView) inflate.findViewById(zx8.mystery_shopper_checkup_body_item_text)).setText(aVar.b());
        ImageView imageView = (ImageView) inflate.findViewById(zx8.mystery_shopper_checkup_body_item_icon);
        if (aVar.a() != null) {
            com.bumptech.glide.b.u(imageView).t(aVar.a()).G0(imageView);
            z65.e(imageView);
            un3.k(imageView);
        } else {
            z65.e(imageView);
            un3.e(imageView);
        }
        z65.e(inflate);
        return inflate;
    }

    @Override // defpackage.zr6
    public void Ac() {
        un3.e(ph());
    }

    @Override // defpackage.zr6
    public void Uc(com.dodopizza.controlling.feature.mysteryshoppercard.presentation.b bVar) {
        z65.h(bVar, "mysteryShopperCheckupVO");
        qh().setText(bVar.d());
        oh().setEnabled(bVar.b());
        oh().setText(bVar.c());
        nh().removeAllViews();
        for (b.a aVar : bVar.a()) {
            nh().addView(sh(aVar));
        }
        un3.k(ph());
    }

    @Override // androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        z65.g(onGetLayoutInflater, "onGetLayoutInflater(...)");
        Bundle arguments = getArguments();
        Object obj = (arguments == null || (obj = arguments.get("theme")) == null) ? null : null;
        if (obj != null && !(obj instanceof Integer)) {
            throw new ClassCastException("Property theme has different class type");
        } else if (obj != null) {
            return tdb.a(onGetLayoutInflater, ((Integer) obj).intValue());
        } else {
            throw new IllegalArgumentException("Argument with key = theme not found in bundle");
        }
    }

    @Override // defpackage.f70, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        z65.h(view, "view");
        super.onViewCreated(view, bundle);
        oma.a(oh(), new b());
    }
}
