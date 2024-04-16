package ru.dodopizza.app.presentation.addresslist;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.appcompat.app.b;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.a41;
import defpackage.k6;
import defpackage.n8;
import defpackage.o8;
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
import ru.dodopizza.app.di.locality.LocalityComponent;
import ru.dodopizza.app.presentation.addresslist.AddressListPresenter;
import ru.dodopizza.app.presentation.addresslist.adapter.AddressVH;
import ru.dodopizza.app.presentation.addresslist.adapter.EnterNewAddressVH;
import ru.dodopizza.app.presentation.addresslist.b;
import ru.dodopizza.app.presentation.addresslist.c;
import ru.dodopizza.app.presentation.addresslist.i;
/* compiled from: AddressListFragment.kt */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 82\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u00019B\u0007¢\u0006\u0004\b6\u00107J\u001a\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\r\u001a\u00020\tH\u0016J\b\u0010\u000e\u001a\u00020\tH\u0016J\u0010\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0010\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u000fH\u0016J\b\u0010\u0014\u001a\u00020\tH\u0016J\b\u0010\u0015\u001a\u00020\tH\u0016J\b\u0010\u0016\u001a\u00020\tH\u0016J\u0010\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016R\u001b\u0010\u001f\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010$\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u001c\u001a\u0004\b\"\u0010#R\u001b\u0010*\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020,0+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u001b\u00105\u001a\u0002008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104¨\u0006:"}, d2 = {"Lru/dodopizza/app/presentation/addresslist/c;", "Lf70;", "Lru/dodopizza/app/presentation/addresslist/h;", "Lw50;", "La41;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "", "onViewCreated", "", "onBackPressed", "A8", "L4", "Lou2;", "deliverablePlaceWithoutLocality", "bg", "loadedDeliverablePlace", "r7", "Ye", "postponeEnterTransition", "startPostponedEnterTransition", "Lru/dodopizza/app/presentation/addresslist/i$b;", "request", "q7", "Landroidx/recyclerview/widget/RecyclerView;", com.huawei.hms.opendevice.c.a, "Lk79;", "uh", "()Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Landroidx/appcompat/widget/Toolbar;", DateTokenConverter.CONVERTER_KEY, "vh", "()Landroidx/appcompat/widget/Toolbar;", "toolbar", "Ls8;", com.huawei.hms.push.e.a, "Lrn5;", "sh", "()Ls8;", "args", "Ll6;", "Ln8;", "f", "Ll6;", "addresses", "Lru/dodopizza/app/presentation/addresslist/AddressListPresenter;", "g", "Lmoxy/ktx/MoxyKtxDelegate;", "th", "()Lru/dodopizza/app/presentation/addresslist/AddressListPresenter;", "presenter", "<init>", "()V", Image.TYPE_HIGH, "a", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class c extends f70 implements ru.dodopizza.app.presentation.addresslist.h, w50, a41 {
    private final k79 c;
    private final k79 d;
    private final rn5 e;
    private final l6<n8> f;
    private final MoxyKtxDelegate g;
    static final /* synthetic */ je5<Object>[] i = {bc9.f(new ar8(c.class, "recyclerView", "getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0)), bc9.f(new ar8(c.class, "toolbar", "getToolbar()Landroidx/appcompat/widget/Toolbar;", 0)), bc9.f(new ar8(c.class, "presenter", "getPresenter()Lru/dodopizza/app/presentation/addresslist/AddressListPresenter;", 0))};
    public static final a h = new a(null);

    /* compiled from: AddressListFragment.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lru/dodopizza/app/presentation/addresslist/c$a;", "", "Ls8;", "data", "Lru/dodopizza/app/presentation/addresslist/c;", "a", "", "EXTRA_KEY_ARGUMENTS", "Ljava/lang/String;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final c a(s8 s8Var) {
            z65.h(s8Var, "data");
            return (c) y64.d(new c(), bi0.c(bi0.d("extra_key_arguments", s8Var)));
        }
    }

    /* compiled from: AddressListFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ls8;", "a", "()Ls8;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    static final class b extends ej5 implements Function0<s8> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final s8 invoke() {
            Bundle arguments = c.this.getArguments();
            Object obj = (arguments == null || (obj = arguments.get("extra_key_arguments")) == null) ? null : null;
            if (obj != null && !(obj instanceof s8)) {
                throw new ClassCastException("Property extra_key_arguments has different class type");
            } else if (obj != null) {
                return (s8) obj;
            } else {
                throw new IllegalArgumentException("Argument with key = extra_key_arguments not found in bundle");
            }
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "", "item", "", "a", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.dodopizza.app.presentation.addresslist.c$c  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0512c extends ej5 implements Function1<Object, Boolean> {
        public static final C0512c a = new C0512c();

        public C0512c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Object obj) {
            z65.h(obj, "item");
            return Boolean.valueOf(obj instanceof n8.a);
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "Landroid/view/ViewGroup;", "parentView", "Landroid/view/LayoutInflater;", "layoutInflater", "Landroidx/recyclerview/widget/RecyclerView$d0;", "a", "(Landroid/view/ViewGroup;Landroid/view/LayoutInflater;)Landroidx/recyclerview/widget/RecyclerView$d0;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class d extends ej5 implements Function2<ViewGroup, LayoutInflater, RecyclerView.d0> {
        public static final d a = new d();

        public d() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final RecyclerView.d0 invoke(ViewGroup viewGroup, LayoutInflater layoutInflater) {
            z65.h(viewGroup, "parentView");
            z65.h(layoutInflater, "layoutInflater");
            Object newInstance = AddressVH.class.getDeclaredConstructor(kzb.class).newInstance(new i07(viewGroup, layoutInflater));
            z65.g(newInstance, "newInstance(...)");
            return (RecyclerView.d0) newInstance;
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "", "item", "", "a", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class e extends ej5 implements Function1<Object, Boolean> {
        public static final e a = new e();

        public e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Object obj) {
            z65.h(obj, "item");
            return Boolean.valueOf(obj instanceof n8.b);
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "Landroid/view/ViewGroup;", "parentView", "Landroid/view/LayoutInflater;", "layoutInflater", "Landroidx/recyclerview/widget/RecyclerView$d0;", "a", "(Landroid/view/ViewGroup;Landroid/view/LayoutInflater;)Landroidx/recyclerview/widget/RecyclerView$d0;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class f extends ej5 implements Function2<ViewGroup, LayoutInflater, RecyclerView.d0> {
        public static final f a = new f();

        public f() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final RecyclerView.d0 invoke(ViewGroup viewGroup, LayoutInflater layoutInflater) {
            z65.h(viewGroup, "parentView");
            z65.h(layoutInflater, "layoutInflater");
            Object newInstance = EnterNewAddressVH.class.getDeclaredConstructor(kzb.class).newInstance(new i07(viewGroup, layoutInflater));
            z65.g(newInstance, "newInstance(...)");
            return (RecyclerView.d0) newInstance;
        }
    }

    /* compiled from: AddressListFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ln8$a;", "vo", "", "a", "(Ln8$a;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    static final class g extends ej5 implements Function1<n8.a, Unit> {
        g() {
            super(1);
        }

        public final void a(n8.a aVar) {
            z65.h(aVar, "vo");
            c.this.th().w(new b.C0511b(aVar.d(), c.this.f.size(), aVar.a()));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(n8.a aVar) {
            a(aVar);
            return Unit.a;
        }
    }

    /* compiled from: AddressListFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    static final class h extends ej5 implements Function0<Unit> {
        h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            c.this.th().w(b.c.a);
        }
    }

    /* compiled from: AddressListFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lru/dodopizza/app/presentation/addresslist/AddressListPresenter;", "a", "()Lru/dodopizza/app/presentation/addresslist/AddressListPresenter;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    static final class i extends ej5 implements Function0<AddressListPresenter> {
        i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final AddressListPresenter invoke() {
            o8.a d = ((LocalityComponent) c.this.getComponentDependenciesRegistry().a(bc9.b(LocalityComponent.class))).E3().c(c.this.f).d(c.this.sh());
            c cVar = c.this;
            return d.b(cVar.xh(cVar)).a().a();
        }
    }

    /* compiled from: AddressListFragment.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ln8;", "address", "", "", "a", "(Ln8;)Ljava/util/List;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    static final class j extends ej5 implements Function1<n8, List<? extends String>> {
        final /* synthetic */ ou2 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(ou2 ou2Var) {
            super(1);
            this.a = ou2Var;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final List<String> invoke(n8 n8Var) {
            n8.a aVar;
            List<String> e;
            z65.h(n8Var, "address");
            if (n8Var instanceof n8.a) {
                aVar = (n8.a) n8Var;
            } else {
                aVar = null;
            }
            if (aVar != null) {
                aVar.k(this.a);
            }
            e = jc1.e("without_location");
            return e;
        }
    }

    /* compiled from: AddressListFragment.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ln8;", "address", "", "", "a", "(Ln8;)Ljava/util/List;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    static final class k extends ej5 implements Function1<n8, List<? extends String>> {
        public static final k a = new k();

        k() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final List<String> invoke(n8 n8Var) {
            n8.a aVar;
            List<String> e;
            z65.h(n8Var, "address");
            if (n8Var instanceof n8.a) {
                aVar = (n8.a) n8Var;
            } else {
                aVar = null;
            }
            if (aVar != null) {
                aVar.i();
            }
            e = jc1.e("loading_changed");
            return e;
        }
    }

    /* compiled from: AddressListFragment.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ln8;", "address", "", "", "a", "(Ln8;)Ljava/util/List;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    static final class l extends ej5 implements Function1<n8, List<? extends String>> {
        final /* synthetic */ ou2 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(ou2 ou2Var) {
            super(1);
            this.a = ou2Var;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final List<String> invoke(n8 n8Var) {
            n8.a aVar;
            List<String> e;
            z65.h(n8Var, "address");
            if (n8Var instanceof n8.a) {
                aVar = (n8.a) n8Var;
            } else {
                aVar = null;
            }
            if (aVar != null) {
                aVar.j(this.a);
            }
            e = jc1.e("loading_changed");
            return e;
        }
    }

    public c() {
        super(R.layout.fragment_address_list);
        rn5 b2;
        this.c = kb0.e(this, R.id.address_list);
        this.d = kb0.e(this, R.id.toolbar);
        b2 = yn5.b(new b());
        this.e = b2;
        this.f = new l6<>(null, 1, null);
        i iVar = new i();
        MvpDelegate mvpDelegate = getMvpDelegate();
        z65.g(mvpDelegate, "mvpDelegate");
        this.g = new MoxyKtxDelegate(mvpDelegate, AddressListPresenter.class.getName() + ".presenter", iVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final s8 sh() {
        return (s8) this.e.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AddressListPresenter th() {
        return (AddressListPresenter) this.g.getValue(this, i[2]);
    }

    private final RecyclerView uh() {
        return (RecyclerView) this.c.a(this, i[0]);
    }

    private final Toolbar vh() {
        return (Toolbar) this.d.a(this, i[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void wh(c cVar, View view) {
        z65.h(cVar, "this$0");
        cVar.th().w(b.a.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void yh(c cVar, i.b bVar, DialogInterface dialogInterface, int i2) {
        z65.h(cVar, "this$0");
        z65.h(bVar, "$request");
        cVar.th().T(new AddressListPresenter.a.b(bVar));
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void zh(c cVar, DialogInterface dialogInterface, int i2) {
        z65.h(cVar, "this$0");
        cVar.th().T(AddressListPresenter.a.C0508a.a);
        dialogInterface.dismiss();
    }

    @Override // ru.dodopizza.app.presentation.addresslist.h
    public void A8() {
        Toast.makeText(getContext(), (int) R.string.addresses_loading_failed, 1).show();
    }

    @Override // ru.dodopizza.app.presentation.addresslist.h
    public void L4() {
        startPostponedEnterTransition();
    }

    @Override // ru.dodopizza.app.presentation.addresslist.h
    public void Ye() {
        this.f.w1(k.a);
    }

    @Override // ru.dodopizza.app.presentation.addresslist.h
    public void bg(ou2 ou2Var) {
        z65.h(ou2Var, "deliverablePlaceWithoutLocality");
        this.f.w1(new j(ou2Var));
    }

    @Override // defpackage.w50
    public boolean onBackPressed() {
        th().w(b.a.a);
        return true;
    }

    @Override // defpackage.f70, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        z65.h(view, "view");
        super.onViewCreated(view, bundle);
        postponeEnterTransition();
        vh().setNavigationOnClickListener(new View.OnClickListener() { // from class: p8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                c.wh(c.this, view2);
            }
        });
        uh().setLayoutManager(new LinearLayoutManager(getContext()));
        RecyclerView uh = uh();
        v99 v99Var = v99.a;
        Context requireContext = requireContext();
        z65.g(requireContext, "requireContext(...)");
        uh.addItemDecoration(v99Var.c(requireContext));
        uh().setAdapter(new k6.a(new k6.a(new k6(this.f), C0512c.a, new z6(new g()), d.a).b(), e.a, new ri3(new h()), f.a).b().d());
    }

    @Override // androidx.fragment.app.Fragment
    public void postponeEnterTransition() {
        super.postponeEnterTransition();
        Fragment parentFragment = getParentFragment();
        if (parentFragment != null) {
            parentFragment.postponeEnterTransition();
        }
    }

    @Override // ru.dodopizza.app.presentation.addresslist.h
    public void q7(final i.b bVar) {
        z65.h(bVar, "request");
        new b.a(requireContext()).d(false).r(R.string.selectlocation_cart_will_be_cleared_title).g(R.string.selectlocation_cart_will_be_cleared_message).n(R.string.selectlocation_cart_will_be_cleared_ok_button, new DialogInterface.OnClickListener() { // from class: q8
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                c.yh(c.this, bVar, dialogInterface, i2);
            }
        }).j(R.string.selectlocation_cart_will_be_cleared_cancel_button, new DialogInterface.OnClickListener() { // from class: r8
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                c.zh(c.this, dialogInterface, i2);
            }
        }).u();
    }

    @Override // ru.dodopizza.app.presentation.addresslist.h
    public void r7(ou2 ou2Var) {
        z65.h(ou2Var, "loadedDeliverablePlace");
        this.f.w1(new l(ou2Var));
    }

    @Override // androidx.fragment.app.Fragment
    public void startPostponedEnterTransition() {
        super.startPostponedEnterTransition();
        Fragment parentFragment = getParentFragment();
        if (parentFragment != null) {
            parentFragment.startPostponedEnterTransition();
        }
    }

    public f63 xh(f70 f70Var) {
        return a41.a.a(this, f70Var);
    }
}
