package defpackage;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import defpackage.q6a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
import ru.dodopizza.app.R;
import ru.dodopizza.app.di.locality.LocalityComponent;
import ru.dodopizza.app.presentation.selectordertype.SelectOrderTypePresenter;
/* compiled from: SelectOrderTypeFragment.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \"2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001#B\u0007¢\u0006\u0004\b \u0010!J\u001a\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\n\u001a\u00020\bH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016R\u001b\u0010\u0012\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0017\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001a\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0019\u0010\u0016R\u001b\u0010\u001f\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0014\u001a\u0004\b\u001d\u0010\u001e¨\u0006$"}, d2 = {"Lu6a;", "Lf70;", "Ly6a;", "Lw50;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "", "onViewCreated", "Wg", "", "onBackPressed", "Lru/dodopizza/app/presentation/selectordertype/SelectOrderTypePresenter;", c.a, "Lmoxy/ktx/MoxyKtxDelegate;", "rh", "()Lru/dodopizza/app/presentation/selectordertype/SelectOrderTypePresenter;", "presenter", DateTokenConverter.CONVERTER_KEY, "Lk79;", "oh", "()Landroid/view/View;", "delivery", e.a, "qh", "inTheStoreCard", "Landroidx/appcompat/widget/AppCompatImageView;", "f", "ph", "()Landroidx/appcompat/widget/AppCompatImageView;", "dineInPicture", "<init>", "()V", "g", "a", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: u6a  reason: default package */
/* loaded from: classes4.dex */
public final class u6a extends f70 implements y6a, w50 {
    private final MoxyKtxDelegate c;
    private final k79 d;
    private final k79 e;
    private final k79 f;
    static final /* synthetic */ je5<Object>[] h = {bc9.f(new ar8(u6a.class, "presenter", "getPresenter()Lru/dodopizza/app/presentation/selectordertype/SelectOrderTypePresenter;", 0)), bc9.f(new ar8(u6a.class, "delivery", "getDelivery()Landroid/view/View;", 0)), bc9.f(new ar8(u6a.class, "inTheStoreCard", "getInTheStoreCard()Landroid/view/View;", 0)), bc9.f(new ar8(u6a.class, "dineInPicture", "getDineInPicture()Landroidx/appcompat/widget/AppCompatImageView;", 0))};
    public static final a g = new a(null);

    /* compiled from: SelectOrderTypeFragment.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lu6a$a;", "", "Lr6a;", "data", "Lu6a;", "a", "", "EXTRA_DATA", "Ljava/lang/String;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: u6a$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final u6a a(r6a r6aVar) {
            z65.h(r6aVar, "data");
            return (u6a) y64.d(new u6a(), bi0.c(bi0.d("extra_data", r6aVar)));
        }
    }

    /* compiled from: SelectOrderTypeFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lru/dodopizza/app/presentation/selectordertype/SelectOrderTypePresenter;", "a", "()Lru/dodopizza/app/presentation/selectordertype/SelectOrderTypePresenter;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: u6a$b */
    /* loaded from: classes4.dex */
    static final class b extends ej5 implements Function0<SelectOrderTypePresenter> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final SelectOrderTypePresenter invoke() {
            q6a.a I1 = ((LocalityComponent) u6a.this.getComponentDependenciesRegistry().a(bc9.b(LocalityComponent.class))).I1();
            Bundle arguments = u6a.this.getArguments();
            Object obj = (arguments == null || (obj = arguments.get("extra_data")) == null) ? null : null;
            if (obj != null && !(obj instanceof r6a)) {
                throw new ClassCastException("Property extra_data has different class type");
            } else if (obj != null) {
                return I1.a((r6a) obj).a();
            } else {
                throw new IllegalArgumentException("Argument with key = extra_data not found in bundle");
            }
        }
    }

    public u6a() {
        super(R.layout.fragment_select_order_type);
        b bVar = new b();
        MvpDelegate mvpDelegate = getMvpDelegate();
        z65.g(mvpDelegate, "mvpDelegate");
        this.c = new MoxyKtxDelegate(mvpDelegate, SelectOrderTypePresenter.class.getName() + ".presenter", bVar);
        this.d = kb0.e(this, R.id.delivery_card);
        this.e = kb0.e(this, R.id.in_the_store_card);
        this.f = kb0.e(this, R.id.dine_in_picture);
    }

    private final View oh() {
        return (View) this.d.a(this, h[1]);
    }

    private final AppCompatImageView ph() {
        return (AppCompatImageView) this.f.a(this, h[3]);
    }

    private final View qh() {
        return (View) this.e.a(this, h[2]);
    }

    private final SelectOrderTypePresenter rh() {
        return (SelectOrderTypePresenter) this.c.getValue(this, h[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void sh(u6a u6aVar, View view) {
        z65.h(u6aVar, "this$0");
        u6aVar.rh().q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void th(u6a u6aVar, View view) {
        z65.h(u6aVar, "this$0");
        u6aVar.rh().r();
    }

    @Override // defpackage.y6a
    public void Wg() {
        ph().setImageResource(R.drawable.ic_order_type_restaurant_ar);
    }

    @Override // defpackage.w50
    public boolean onBackPressed() {
        return true;
    }

    @Override // defpackage.f70, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        z65.h(view, "view");
        super.onViewCreated(view, bundle);
        oh().setOnClickListener(new View.OnClickListener() { // from class: s6a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                u6a.sh(u6a.this, view2);
            }
        });
        qh().setOnClickListener(new View.OnClickListener() { // from class: t6a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                u6a.th(u6a.this, view2);
            }
        });
    }
}
