package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.dodopizza.orderhistory.feature.orderhistory.presentation.orderhistorydetails.selectcheck.adapter.SelectCheckVH;
import defpackage.k6;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: SelectCheckDialog.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 \u001d2\u00020\u0001:\u0002\u001e\u001fB\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ&\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016R$\u0010\u0014\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001b\u0010\u001a\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006 "}, d2 = {"Lk4a;", "Lr53;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "view", "", "onViewCreated", "Lk4a$b;", com.huawei.hms.push.e.a, "Lk4a$b;", "ph", "()Lk4a$b;", "rh", "(Lk4a$b;)V", "onCheckSelectedListener", "Landroidx/recyclerview/widget/RecyclerView;", "f", "Lk79;", "qh", "()Landroidx/recyclerview/widget/RecyclerView;", "recycler", "<init>", "()V", "g", "a", "b", "orderhistory_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: k4a  reason: default package */
/* loaded from: classes2.dex */
public final class k4a extends r53 {
    private b e;
    private final k79 f = kb0.e(this, hy8.C);
    static final /* synthetic */ je5<Object>[] h = {bc9.f(new ar8(k4a.class, "recycler", "getRecycler()Landroidx/recyclerview/widget/RecyclerView;", 0))};
    public static final a g = new a(null);

    /* compiled from: SelectCheckDialog.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0014\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lk4a$a;", "", "", "Lz21;", "checks", "Lk4a;", "a", "", "EXTRA_CHECKS", "Ljava/lang/String;", "<init>", "()V", "orderhistory_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: k4a$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final k4a a(List<z21> list) {
            z65.h(list, "checks");
            return (k4a) y64.d(new k4a(), bi0.c(bi0.d("extra_checks", list)));
        }
    }

    /* compiled from: SelectCheckDialog.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, d2 = {"Lk4a$b;", "", "Lz21;", "check", "", "a", "orderhistory_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: k4a$b */
    /* loaded from: classes2.dex */
    public interface b {
        void a(z21 z21Var);
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "", "item", "", "a", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: k4a$c */
    /* loaded from: classes2.dex */
    public static final class c extends ej5 implements Function1<Object, Boolean> {
        public static final c a = new c();

        public c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Object obj) {
            z65.h(obj, "item");
            return Boolean.valueOf(obj instanceof z21);
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "Landroid/view/ViewGroup;", "parentView", "Landroid/view/LayoutInflater;", "layoutInflater", "Landroidx/recyclerview/widget/RecyclerView$d0;", "a", "(Landroid/view/ViewGroup;Landroid/view/LayoutInflater;)Landroidx/recyclerview/widget/RecyclerView$d0;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: k4a$d */
    /* loaded from: classes2.dex */
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
            Object newInstance = SelectCheckVH.class.getDeclaredConstructor(kzb.class).newInstance(new i07(viewGroup, layoutInflater));
            z65.g(newInstance, "newInstance(...)");
            return (RecyclerView.d0) newInstance;
        }
    }

    /* compiled from: SelectCheckDialog.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lz21;", "id", "", "a", "(Lz21;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: k4a$e */
    /* loaded from: classes2.dex */
    static final class e extends ej5 implements Function1<z21, Unit> {
        e() {
            super(1);
        }

        public final void a(z21 z21Var) {
            z65.h(z21Var, "id");
            b ph = k4a.this.ph();
            if (ph != null) {
                ph.a(z21Var);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(z21 z21Var) {
            a(z21Var);
            return Unit.a;
        }
    }

    private final RecyclerView qh() {
        return (RecyclerView) this.f.a(this, h[0]);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        z65.h(layoutInflater, "inflater");
        return layoutInflater.inflate(hz8.dialog_select_check, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        List l;
        Object obj;
        z65.h(view, "view");
        super.onViewCreated(view, bundle);
        RecyclerView qh = qh();
        l = kc1.l();
        Bundle arguments = getArguments();
        if (arguments != null && (obj = arguments.get("extra_checks")) != null) {
            l = obj;
        }
        if (l != null && !(l instanceof List)) {
            throw new ClassCastException("Property extra_checks has different class type");
        } else if (l != null) {
            qh.setAdapter(new k6.a(new k6(l), c.a, new j4a(new e()), d.a).b().d());
            RecyclerView qh2 = qh();
            v99 v99Var = v99.a;
            Context requireContext = requireContext();
            z65.g(requireContext, "requireContext(...)");
            qh2.addItemDecoration(v99Var.c(requireContext));
        } else {
            throw new IllegalArgumentException("Argument with key = extra_checks not found in bundle");
        }
    }

    public final b ph() {
        return this.e;
    }

    public final void rh(b bVar) {
        this.e = bVar;
    }
}
