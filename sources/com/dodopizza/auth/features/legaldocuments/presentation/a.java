package com.dodopizza.auth.features.legaldocuments.presentation;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.auth.features.legaldocuments.LegalDocumentsFeatureDependencies;
import com.dodopizza.auth.features.legaldocuments.presentation.LegalDocumentLinkViewHolder;
import com.dodopizza.auth.features.legaldocuments.presentation.LegalDocumentTextViewHolder;
import com.dodopizza.auth.features.legaldocuments.presentation.a;
import defpackage.k6;
import defpackage.po5;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
/* compiled from: LegalDocumentsFragment.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u0000 *2\u00020\u00012\u00020\u0002:\u0001+B\t\b\u0000¢\u0006\u0004\b(\u0010)J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\u001a\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\u0016\u0010\r\u001a\u00020\u00052\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016R\u001b\u0010\u0013\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0018\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0017R(\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0000@\u0000X\u0081.¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R#\u0010'\u001a\n \"*\u0004\u0018\u00010\u001a0\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&¨\u0006,"}, d2 = {"Lcom/dodopizza/auth/features/legaldocuments/presentation/a;", "Lf70;", "Lvo5;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "Landroid/view/View;", "view", "onViewCreated", "", "", "items", "Cf", "Landroidx/appcompat/widget/Toolbar;", com.huawei.hms.opendevice.c.a, "Lk79;", "rh", "()Landroidx/appcompat/widget/Toolbar;", "toolbar", "Landroidx/recyclerview/widget/RecyclerView;", DateTokenConverter.CONVERTER_KEY, "qh", "()Landroidx/recyclerview/widget/RecyclerView;", "recycler", "Las8;", "Lcom/dodopizza/auth/features/legaldocuments/presentation/LegalDocumentsPresenter;", com.huawei.hms.push.e.a, "Las8;", "ph", "()Las8;", "setPresenterProvider$auth_release", "(Las8;)V", "presenterProvider", "kotlin.jvm.PlatformType", "f", "Lmoxy/ktx/MoxyKtxDelegate;", "oh", "()Lcom/dodopizza/auth/features/legaldocuments/presentation/LegalDocumentsPresenter;", "presenter", "<init>", "()V", "g", "a", "auth_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class a extends f70 implements vo5 {
    private final k79 c;
    private final k79 d;
    public as8<LegalDocumentsPresenter> e;
    private final MoxyKtxDelegate f;
    static final /* synthetic */ je5<Object>[] h = {bc9.f(new ar8(a.class, "toolbar", "getToolbar()Landroidx/appcompat/widget/Toolbar;", 0)), bc9.f(new ar8(a.class, "recycler", "getRecycler()Landroidx/recyclerview/widget/RecyclerView;", 0)), bc9.f(new ar8(a.class, "presenter", "getPresenter()Lcom/dodopizza/auth/features/legaldocuments/presentation/LegalDocumentsPresenter;", 0))};
    public static final C0112a g = new C0112a(null);

    /* compiled from: LegalDocumentsFragment.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/dodopizza/auth/features/legaldocuments/presentation/a$a;", "", "Lqo5;", "data", "Lcom/dodopizza/auth/features/legaldocuments/presentation/a;", "a", "", "ARG_KEY_DATA", "Ljava/lang/String;", "<init>", "()V", "auth_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: com.dodopizza.auth.features.legaldocuments.presentation.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0112a {
        private C0112a() {
        }

        public /* synthetic */ C0112a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a a(qo5 qo5Var) {
            z65.h(qo5Var, "data");
            return (a) y64.d(new a(), bi0.c(bi0.d("data", qo5Var)));
        }
    }

    /* compiled from: LegalDocumentsFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/dodopizza/auth/features/legaldocuments/presentation/LegalDocumentsPresenter;", "kotlin.jvm.PlatformType", "a", "()Lcom/dodopizza/auth/features/legaldocuments/presentation/LegalDocumentsPresenter;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes.dex */
    static final class b extends ej5 implements Function0<LegalDocumentsPresenter> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final LegalDocumentsPresenter invoke() {
            return a.this.ph().get();
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "", "item", "", "a", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes.dex */
    public static final class c extends ej5 implements Function1<Object, Boolean> {
        public static final c a = new c();

        public c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Object obj) {
            z65.h(obj, "item");
            return Boolean.valueOf(obj instanceof jq5);
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "Landroid/view/ViewGroup;", "parentView", "Landroid/view/LayoutInflater;", "layoutInflater", "Landroidx/recyclerview/widget/RecyclerView$d0;", "a", "(Landroid/view/ViewGroup;Landroid/view/LayoutInflater;)Landroidx/recyclerview/widget/RecyclerView$d0;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes.dex */
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
            Object newInstance = LegalDocumentLinkViewHolder.class.getDeclaredConstructor(kzb.class).newInstance(new i07(viewGroup, layoutInflater));
            z65.g(newInstance, "newInstance(...)");
            return (RecyclerView.d0) newInstance;
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "", "item", "", "a", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes.dex */
    public static final class e extends ej5 implements Function1<Object, Boolean> {
        public static final e a = new e();

        public e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Object obj) {
            z65.h(obj, "item");
            return Boolean.valueOf(obj instanceof dcb);
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "Landroid/view/ViewGroup;", "parentView", "Landroid/view/LayoutInflater;", "layoutInflater", "Landroidx/recyclerview/widget/RecyclerView$d0;", "a", "(Landroid/view/ViewGroup;Landroid/view/LayoutInflater;)Landroidx/recyclerview/widget/RecyclerView$d0;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes.dex */
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
            Object newInstance = LegalDocumentTextViewHolder.class.getDeclaredConstructor(kzb.class).newInstance(new i07(viewGroup, layoutInflater));
            z65.g(newInstance, "newInstance(...)");
            return (RecyclerView.d0) newInstance;
        }
    }

    /* compiled from: LegalDocumentsFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljq5;", "item", "", "a", "(Ljq5;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes.dex */
    static final class g extends ej5 implements Function1<jq5, Unit> {
        g() {
            super(1);
        }

        public final void a(jq5 jq5Var) {
            z65.h(jq5Var, "item");
            a.this.oh().r(jq5Var);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(jq5 jq5Var) {
            a(jq5Var);
            return Unit.a;
        }
    }

    public a() {
        super(tz8.fragment_legal_documents);
        this.c = kb0.e(this, wx8.d);
        this.d = kb0.e(this, wx8.c);
        b bVar = new b();
        MvpDelegate mvpDelegate = getMvpDelegate();
        z65.g(mvpDelegate, "mvpDelegate");
        this.f = new MoxyKtxDelegate(mvpDelegate, LegalDocumentsPresenter.class.getName() + ".presenter", bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LegalDocumentsPresenter oh() {
        return (LegalDocumentsPresenter) this.f.getValue(this, h[2]);
    }

    private final RecyclerView qh() {
        return (RecyclerView) this.d.a(this, h[1]);
    }

    private final Toolbar rh() {
        return (Toolbar) this.c.a(this, h[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void sh(a aVar, View view) {
        z65.h(aVar, "this$0");
        aVar.oh().onBackPressed();
    }

    @Override // defpackage.vo5
    public void Cf(List<? extends Object> list) {
        z65.h(list, "items");
        qh().setAdapter(new k6.a(new k6.a(new k6(list), c.a, new LegalDocumentLinkViewHolder.a(new g()), d.a).b(), e.a, new LegalDocumentTextViewHolder.a(), f.a).b().d());
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        po5.b a = po5.a.a();
        Bundle arguments = getArguments();
        Object obj = (arguments == null || (obj = arguments.get("data")) == null) ? null : null;
        if (obj != null && !(obj instanceof qo5)) {
            throw new ClassCastException("Property data has different class type");
        } else if (obj != null) {
            a.a((qo5) obj, (LegalDocumentsFeatureDependencies) getComponentDependenciesRegistry().a(bc9.b(LegalDocumentsFeatureDependencies.class))).a(this);
            super.onCreate(bundle);
        } else {
            throw new IllegalArgumentException("Argument with key = data not found in bundle");
        }
    }

    @Override // defpackage.f70, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        z65.h(view, "view");
        super.onViewCreated(view, bundle);
        rh().setNavigationOnClickListener(new View.OnClickListener() { // from class: ro5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                a.sh(a.this, view2);
            }
        });
        qh().setLayoutManager(new LinearLayoutManager(getContext()));
    }

    public final as8<LegalDocumentsPresenter> ph() {
        as8<LegalDocumentsPresenter> as8Var = this.e;
        if (as8Var != null) {
            return as8Var;
        }
        z65.z("presenterProvider");
        return null;
    }
}
