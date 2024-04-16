package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.e;
import com.dodopizza.order.feature.menu.adapters.promotion.InfiniteUpsellPromotionProductCardViewHolder;
import com.dodopizza.persistence.entity.menu.ShoppingInfoEntity;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.atb;
import defpackage.k6;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: InfiniteUpsellFragment.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\u0017B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001a\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\u0016\u0010\u000f\u001a\u00020\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0018"}, d2 = {"Lz05;", "Lpsb;", "Landroidx/recyclerview/widget/RecyclerView;", "upsellProductsRV", "", "nh", "mh", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "", "Latb;", "upsellProducts", "L1", "Ll6;", Image.TYPE_MEDIUM, "Ll6;", "upsellAdapter", "<init>", "()V", "n", "a", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: z05  reason: default package */
/* loaded from: classes2.dex */
public final class z05 extends psb {
    public static final a n = new a(null);
    public static final int o = 8;
    private final l6<atb> m = new l6<>(null, 1, null);

    /* compiled from: InfiniteUpsellFragment.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\u000b"}, d2 = {"Lz05$a;", "", "Lz05;", "a", "", "GRID_ROW_COUNT", "I", "GRID_ROW_PADDING_DP", "HORIZONTAL_PADDINGS_DP", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: z05$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final z05 a() {
            return new z05();
        }
    }

    /* compiled from: InfiniteUpsellFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", ShoppingInfoEntity.FIELD_PRODUCT_ID, "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: z05$b */
    /* loaded from: classes2.dex */
    static final class b extends ej5 implements Function1<String, Unit> {
        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(String str) {
            z65.h(str, ShoppingInfoEntity.FIELD_PRODUCT_ID);
            z05.this.ph().z(str);
        }
    }

    /* compiled from: InfiniteUpsellFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Latb$a;", "product", "", "position", "", "a", "(Latb$a;I)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: z05$c */
    /* loaded from: classes2.dex */
    static final class c extends ej5 implements Function2<atb.a, Integer, Unit> {
        c() {
            super(2);
        }

        public final void a(atb.a aVar, int i) {
            z65.h(aVar, "product");
            z05.this.ph().D(aVar, i);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(atb.a aVar, Integer num) {
            a(aVar, num.intValue());
            return Unit.a;
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "", "item", "", "a", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: z05$d */
    /* loaded from: classes2.dex */
    public static final class d extends ej5 implements Function1<Object, Boolean> {
        public static final d a = new d();

        public d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Object obj) {
            z65.h(obj, "item");
            return Boolean.valueOf(obj instanceof atb.a);
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "Landroid/view/ViewGroup;", "parentView", "Landroid/view/LayoutInflater;", "layoutInflater", "Landroidx/recyclerview/widget/RecyclerView$d0;", "a", "(Landroid/view/ViewGroup;Landroid/view/LayoutInflater;)Landroidx/recyclerview/widget/RecyclerView$d0;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: z05$e */
    /* loaded from: classes2.dex */
    public static final class e extends ej5 implements Function2<ViewGroup, LayoutInflater, RecyclerView.d0> {
        public static final e a = new e();

        public e() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final RecyclerView.d0 invoke(ViewGroup viewGroup, LayoutInflater layoutInflater) {
            z65.h(viewGroup, "parentView");
            z65.h(layoutInflater, "layoutInflater");
            Object newInstance = InfiniteUpsellPromotionProductCardViewHolder.class.getDeclaredConstructor(kzb.class).newInstance(new i07(viewGroup, layoutInflater));
            z65.g(newInstance, "newInstance(...)");
            return (RecyclerView.d0) newInstance;
        }
    }

    /* compiled from: InfiniteUpsellFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "Latb;", "old", "new", "Landroidx/recyclerview/widget/e$e;", "a", "(Ljava/util/List;Ljava/util/List;)Landroidx/recyclerview/widget/e$e;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: z05$f */
    /* loaded from: classes2.dex */
    static final class f extends ej5 implements Function2<List<? extends atb>, List<? extends atb>, e.C0047e> {
        public static final f a = new f();

        f() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final e.C0047e invoke(List<? extends atb> list, List<? extends atb> list2) {
            z65.h(list, "old");
            z65.h(list2, "new");
            e.C0047e b = androidx.recyclerview.widget.e.b(new mtb(list, list2));
            z65.g(b, "calculateDiff(...)");
            return b;
        }
    }

    @Override // defpackage.psb, defpackage.otb
    public void L1(Collection<? extends atb> collection) {
        List<? extends atb> F0;
        z65.h(collection, "upsellProducts");
        l6<atb> l6Var = this.m;
        F0 = sc1.F0(collection);
        l6Var.Z(F0, f.a);
    }

    @Override // defpackage.psb
    public void mh(RecyclerView recyclerView) {
        z65.h(recyclerView, "upsellProductsRV");
        recyclerView.addItemDecoration(new li4(8));
    }

    @Override // defpackage.psb
    public void nh(RecyclerView recyclerView) {
        z65.h(recyclerView, "upsellProductsRV");
        recyclerView.setLayoutManager(new GridLayoutManager(requireContext(), 3));
    }

    @Override // defpackage.psb, defpackage.f70, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        z65.h(view, "view");
        super.onViewCreated(view, bundle);
        RecyclerView rh = rh();
        rh.setPadding((int) kx9.a(16), 0, (int) kx9.a(16), 0);
        rh.setAdapter(new k6.a(new k6(this.m), d.a, new y05(oh(), new b(), new c()), e.a).b().d());
    }
}
