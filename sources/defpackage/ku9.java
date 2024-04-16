package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.RecyclerView;
import com.dodopizza.order.feature.checkout.sbp.SbpBankListItemVH;
import com.dodopizza.order.feature.checkout.sbp.presentation.SbpBankListPresenter;
import com.dodopizza.order.feature.checkout.sbp.presentation.b;
import com.huawei.hms.actions.SearchIntents;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.iu9;
import defpackage.k6;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
import ru.dodopizza.app.R;
import ru.dodopizza.app.di.modules.presentation.checkout.CheckoutComponent;
/* compiled from: SbpBankListFragment.kt */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 52\u00020\u00012\u00020\u00022\u00020\u0003:\u00016B\u0007¢\u0006\u0004\b3\u00104J&\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u001a\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\u0016\u0010\u0014\u001a\u00020\r2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00120\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001e\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010#\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b!\u0010\"R\u001b\u0010(\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\u001b\u001a\u0004\b&\u0010'R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00120)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u001b\u00102\u001a\u00020-8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101¨\u00067"}, d2 = {"Lku9;", "Lc70;", "Lvu9;", "Lw50;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "view", "", "onViewCreated", "", "onBackPressed", "", "Lou9;", "fullSbpBankList", "Z0", "Ll6;", Image.TYPE_HIGH, "Ll6;", "dataSet", "Landroidx/recyclerview/widget/RecyclerView;", "i", "Lk79;", "zh", "()Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Landroidx/appcompat/widget/SearchView;", "j", "Ah", "()Landroidx/appcompat/widget/SearchView;", "searchView", "Landroidx/appcompat/widget/AppCompatTextView;", "k", "xh", "()Landroidx/appcompat/widget/AppCompatTextView;", "emptyTitle", "", "l", "Ljava/util/List;", "fullBankList", "Lcom/dodopizza/order/feature/checkout/sbp/presentation/SbpBankListPresenter;", Image.TYPE_MEDIUM, "Lmoxy/ktx/MoxyKtxDelegate;", "yh", "()Lcom/dodopizza/order/feature/checkout/sbp/presentation/SbpBankListPresenter;", "presenter", "<init>", "()V", "n", "a", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: ku9  reason: default package */
/* loaded from: classes4.dex */
public final class ku9 extends c70 implements vu9, w50 {
    private final l6<ou9> h;
    private final k79 i;
    private final k79 j;
    private final k79 k;
    private final List<ou9> l;
    private final MoxyKtxDelegate m;
    static final /* synthetic */ je5<Object>[] o = {bc9.f(new ar8(ku9.class, "recyclerView", "getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0)), bc9.f(new ar8(ku9.class, "searchView", "getSearchView()Landroidx/appcompat/widget/SearchView;", 0)), bc9.f(new ar8(ku9.class, "emptyTitle", "getEmptyTitle()Landroidx/appcompat/widget/AppCompatTextView;", 0)), bc9.f(new ar8(ku9.class, "presenter", "getPresenter()Lcom/dodopizza/order/feature/checkout/sbp/presentation/SbpBankListPresenter;", 0))};
    public static final a n = new a(null);

    /* compiled from: SbpBankListFragment.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lku9$a;", "", "", "sbpUrl", "Lku9;", "a", "EXTRA_SBP_URL", "Ljava/lang/String;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: ku9$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ku9 a(String str) {
            z65.h(str, "sbpUrl");
            return (ku9) y64.d(d70.a(new ku9(), false), bi0.c(bi0.d("extra_sbp_url", str)));
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "", "item", "", "a", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ku9$b */
    /* loaded from: classes4.dex */
    public static final class b extends ej5 implements Function1<Object, Boolean> {
        public static final b a = new b();

        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Object obj) {
            z65.h(obj, "item");
            return Boolean.valueOf(obj instanceof ou9);
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "Landroid/view/ViewGroup;", "parentView", "Landroid/view/LayoutInflater;", "layoutInflater", "Landroidx/recyclerview/widget/RecyclerView$d0;", "a", "(Landroid/view/ViewGroup;Landroid/view/LayoutInflater;)Landroidx/recyclerview/widget/RecyclerView$d0;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ku9$c */
    /* loaded from: classes4.dex */
    public static final class c extends ej5 implements Function2<ViewGroup, LayoutInflater, RecyclerView.d0> {
        public static final c a = new c();

        public c() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final RecyclerView.d0 invoke(ViewGroup viewGroup, LayoutInflater layoutInflater) {
            z65.h(viewGroup, "parentView");
            z65.h(layoutInflater, "layoutInflater");
            Object newInstance = SbpBankListItemVH.class.getDeclaredConstructor(kzb.class).newInstance(new i07(viewGroup, layoutInflater));
            z65.g(newInstance, "newInstance(...)");
            return (RecyclerView.d0) newInstance;
        }
    }

    /* compiled from: SbpBankListFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lou9;", "sbpBankListItemVO", "", "a", "(Lou9;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ku9$d */
    /* loaded from: classes4.dex */
    static final class d extends ej5 implements Function1<ou9, Unit> {
        d() {
            super(1);
        }

        public final void a(ou9 ou9Var) {
            z65.h(ou9Var, "sbpBankListItemVO");
            ku9.this.yh().w(new b.C0170b(ou9Var));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ou9 ou9Var) {
            a(ou9Var);
            return Unit.a;
        }
    }

    /* compiled from: SbpBankListFragment.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\b"}, d2 = {"ku9$e", "Landroidx/appcompat/widget/SearchView$m;", "", SearchIntents.EXTRA_QUERY, "", "b", "newText", "a", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: ku9$e */
    /* loaded from: classes4.dex */
    public static final class e implements SearchView.m {
        e() {
        }

        @Override // androidx.appcompat.widget.SearchView.m
        public boolean a(String str) {
            boolean O;
            ku9.this.h.r();
            l6 l6Var = ku9.this.h;
            ArrayList arrayList = new ArrayList();
            for (Object obj : ku9.this.l) {
                O = m0b.O(qhb.a(((ou9) obj).a()), qhb.a(String.valueOf(str)), false, 2, null);
                if (O) {
                    arrayList.add(obj);
                }
            }
            l6Var.addAll(arrayList);
            un3.o(ku9.this.xh(), ku9.this.h.isEmpty());
            return true;
        }

        @Override // androidx.appcompat.widget.SearchView.m
        public boolean b(String str) {
            return false;
        }
    }

    /* compiled from: SbpBankListFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/dodopizza/order/feature/checkout/sbp/presentation/SbpBankListPresenter;", "a", "()Lcom/dodopizza/order/feature/checkout/sbp/presentation/SbpBankListPresenter;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ku9$f */
    /* loaded from: classes4.dex */
    static final class f extends ej5 implements Function0<SbpBankListPresenter> {
        f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final SbpBankListPresenter invoke() {
            iu9.a c = ((CheckoutComponent) ku9.this.getComponentDependenciesRegistry().a(bc9.b(CheckoutComponent.class))).t2().c(ku9.this.h);
            String string = ku9.this.requireArguments().getString("extra_sbp_url");
            if (string == null) {
                string = "";
            }
            return c.b(string).a().a();
        }
    }

    public ku9() {
        super(R.layout.fragment_sbp_bank_list);
        this.h = new l6<>(null, 1, null);
        this.i = kb0.e(this, R.id.sbp_bank_list_recycler_view);
        this.j = kb0.e(this, R.id.search_view_sbp);
        this.k = kb0.e(this, R.id.sbp_bank_empty_title);
        this.l = new ArrayList();
        f fVar = new f();
        MvpDelegate mvpDelegate = getMvpDelegate();
        z65.g(mvpDelegate, "mvpDelegate");
        this.m = new MoxyKtxDelegate(mvpDelegate, SbpBankListPresenter.class.getName() + ".presenter", fVar);
    }

    private final SearchView Ah() {
        return (SearchView) this.j.a(this, o[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Bh(ku9 ku9Var) {
        z65.h(ku9Var, "this$0");
        un3.o(ku9Var.xh(), false);
        ku9Var.h.r();
        return ku9Var.h.addAll(ku9Var.l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AppCompatTextView xh() {
        return (AppCompatTextView) this.k.a(this, o[2]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SbpBankListPresenter yh() {
        return (SbpBankListPresenter) this.m.getValue(this, o[3]);
    }

    private final RecyclerView zh() {
        return (RecyclerView) this.i.a(this, o[0]);
    }

    @Override // defpackage.vu9
    public void Z0(List<ou9> list) {
        z65.h(list, "fullSbpBankList");
        this.l.addAll(list);
        startPostponedEnterTransition();
    }

    @Override // defpackage.w50
    public boolean onBackPressed() {
        yh().w(b.a.a);
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        z65.h(layoutInflater, "inflater");
        postponeEnterTransition();
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // defpackage.f70, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        z65.h(view, "view");
        super.onViewCreated(view, bundle);
        zh().setAdapter(new k6.a(new k6(this.h), b.a, new nu9(new d()), c.a).b().d());
        Ah().setOnQueryTextListener(new e());
        Ah().setOnCloseListener(new SearchView.l() { // from class: ju9
            @Override // androidx.appcompat.widget.SearchView.l
            public final boolean onClose() {
                boolean Bh;
                Bh = ku9.Bh(ku9.this);
                return Bh;
            }
        });
        ph();
    }
}
