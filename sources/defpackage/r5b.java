package defpackage;

import android.widget.HorizontalScrollView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.material.tabs.TabLayout;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
/* compiled from: TabLayoutRecyclerViewMediator.kt */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u000fBo\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0015\u001a\u00020\u0012\u0012\u0006\u0010\u0019\u001a\u00020\u0016\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\t0\u001a\u0012\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\t0\u001a\u0012\u0018\u0010#\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00020 \u0012\u0006\u0010'\u001a\u00020$\u0012\u0010\b\u0002\u0010*\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010(¢\u0006\u0004\b6\u00107J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0006\u0010\u0007\u001a\u00020\u0002J\u0006\u0010\b\u001a\u00020\u0002J\u0016\u0010\r\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\t0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\t0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001cR&\u0010#\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010'\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u001c\u0010*\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010)R\u0016\u0010,\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010+R\u0016\u0010-\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010+R\u0016\u0010.\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010+R\u0018\u00101\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u00100R\u0018\u00105\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104¨\u00068"}, d2 = {"Lr5b;", "", "", "j", "Lcom/google/android/material/tabs/TabLayout$g;", "tab", "l", Image.TYPE_HIGH, "i", "", "position", "", "notify", "k", "Landroidx/recyclerview/widget/RecyclerView;", "a", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Lcom/google/android/material/tabs/TabLayout;", "b", "Lcom/google/android/material/tabs/TabLayout;", "tabLayout", "Landroid/widget/HorizontalScrollView;", com.huawei.hms.opendevice.c.a, "Landroid/widget/HorizontalScrollView;", "tabsScroll", "", DateTokenConverter.CONVERTER_KEY, "Ljava/util/List;", "headerIndexToItemIndexList", e.a, "itemIndexToHeaderIndexList", "Lkotlin/Function2;", "f", "Lkotlin/jvm/functions/Function2;", "tabConfigurationStrategy", "Lr5b$a;", "g", "Lr5b$a;", "onTabChangedListener", "Lkotlin/Function0;", "Lkotlin/jvm/functions/Function0;", "onTabLayoutPopulated", "Z", "isProgrammaticallyScrolled", "tabProgrammaticallySelected", "notifyOnTabSelected", "Landroidx/recyclerview/widget/RecyclerView$u;", "Landroidx/recyclerview/widget/RecyclerView$u;", "scrollListener", "Lcom/google/android/material/tabs/TabLayout$d;", Image.TYPE_MEDIUM, "Lcom/google/android/material/tabs/TabLayout$d;", "tabSelectedListener", "<init>", "(Landroidx/recyclerview/widget/RecyclerView;Lcom/google/android/material/tabs/TabLayout;Landroid/widget/HorizontalScrollView;Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function2;Lr5b$a;Lkotlin/jvm/functions/Function0;)V", "infrastructure-base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: r5b  reason: default package */
/* loaded from: classes4.dex */
public final class r5b {
    private final RecyclerView a;
    private final TabLayout b;
    private final HorizontalScrollView c;
    private final List<Integer> d;
    private final List<Integer> e;
    private final Function2<TabLayout.g, Integer, Unit> f;
    private final a g;
    private final Function0<Unit> h;
    private boolean i;
    private boolean j;
    private boolean k;
    private RecyclerView.u l;
    private TabLayout.d m;

    /* compiled from: TabLayoutRecyclerViewMediator.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0004\u001a\u00020\u0002H&¨\u0006\u0005"}, d2 = {"Lr5b$a;", "", "", "W3", "W8", "infrastructure-base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: r5b$a */
    /* loaded from: classes4.dex */
    public interface a {
        void W3();

        void W8();
    }

    /* compiled from: TabLayoutRecyclerViewMediator.kt */
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J \u0010\f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004H\u0016J\u0018\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0004H\u0016¨\u0006\u000f"}, d2 = {"r5b$b", "Landroidx/recyclerview/widget/RecyclerView$u;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "a", "(Landroidx/recyclerview/widget/RecyclerView;)Ljava/lang/Integer;", "position", "", "b", "dx", "dy", "onScrolled", "newState", "onScrollStateChanged", "infrastructure-base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: r5b$b */
    /* loaded from: classes4.dex */
    public static final class b extends RecyclerView.u {
        b() {
        }

        private final Integer a(RecyclerView recyclerView) {
            LinearLayoutManager linearLayoutManager;
            RecyclerView.p layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof LinearLayoutManager) {
                linearLayoutManager = (LinearLayoutManager) layoutManager;
            } else {
                linearLayoutManager = null;
            }
            if (linearLayoutManager == null) {
                return null;
            }
            Integer valueOf = Integer.valueOf(linearLayoutManager.h2());
            if (valueOf.intValue() == -1) {
                valueOf = null;
            }
            if (valueOf == null) {
                return null;
            }
            return Integer.valueOf(((Number) r5b.this.e.get(valueOf.intValue())).intValue());
        }

        private final void b(int i) {
            r5b.this.j = true;
            r5b.this.b.L(i, 0.0f, true, true);
            r5b.this.b.I(r5b.this.b.x(i), true);
            s5b.b(r5b.this.c, r5b.this.b.x(i));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            z65.h(recyclerView, "recyclerView");
            if (i == 0) {
                r5b.this.i = false;
                Integer a = a(recyclerView);
                if (a != null) {
                    r5b r5bVar = r5b.this;
                    int intValue = a.intValue();
                    if (r5bVar.b.getSelectedTabPosition() != intValue) {
                        b(intValue);
                    }
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            Integer a;
            z65.h(recyclerView, "recyclerView");
            if (!r5b.this.i && (a = a(recyclerView)) != null) {
                b(a.intValue());
            }
        }
    }

    /* compiled from: TabLayoutRecyclerViewMediator.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"r5b$c", "Lcom/google/android/material/tabs/TabLayout$d;", "Lcom/google/android/material/tabs/TabLayout$g;", "tab", "", "a", com.huawei.hms.opendevice.c.a, "b", "infrastructure-base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: r5b$c */
    /* loaded from: classes4.dex */
    public static final class c implements TabLayout.d {
        c() {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void a(TabLayout.g gVar) {
            z65.h(gVar, "tab");
            r5b.this.l(gVar);
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void b(TabLayout.g gVar) {
            z65.h(gVar, "tab");
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void c(TabLayout.g gVar) {
            z65.h(gVar, "tab");
            r5b.this.l(gVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public r5b(RecyclerView recyclerView, TabLayout tabLayout, HorizontalScrollView horizontalScrollView, List<Integer> list, List<Integer> list2, Function2<? super TabLayout.g, ? super Integer, Unit> function2, a aVar, Function0<Unit> function0) {
        z65.h(recyclerView, "recyclerView");
        z65.h(tabLayout, "tabLayout");
        z65.h(horizontalScrollView, "tabsScroll");
        z65.h(list, "headerIndexToItemIndexList");
        z65.h(list2, "itemIndexToHeaderIndexList");
        z65.h(function2, "tabConfigurationStrategy");
        z65.h(aVar, "onTabChangedListener");
        this.a = recyclerView;
        this.b = tabLayout;
        this.c = horizontalScrollView;
        this.d = list;
        this.e = list2;
        this.f = function2;
        this.g = aVar;
        this.h = function0;
        this.j = true;
        this.k = true;
    }

    private final void j() {
        this.b.D();
        int size = this.d.size();
        for (int i = 0; i < size; i++) {
            TabLayout.g A = this.b.A();
            Function2<TabLayout.g, Integer, Unit> function2 = this.f;
            z65.e(A);
            function2.invoke(A, Integer.valueOf(i));
            this.b.g(A, false);
        }
        Function0<Unit> function0 = this.h;
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l(TabLayout.g gVar) {
        LinearLayoutManager linearLayoutManager;
        if (!this.j) {
            if (this.k) {
                this.g.W3();
            }
            this.k = true;
            this.i = true;
            RecyclerView.p layoutManager = this.a.getLayoutManager();
            if (layoutManager instanceof LinearLayoutManager) {
                linearLayoutManager = (LinearLayoutManager) layoutManager;
            } else {
                linearLayoutManager = null;
            }
            if (linearLayoutManager != null) {
                linearLayoutManager.I2(this.d.get(gVar.g()).intValue(), 0);
            }
        } else {
            this.j = false;
            this.g.W8();
        }
        s5b.b(this.c, gVar);
    }

    public final void h() {
        b bVar = new b();
        this.l = bVar;
        this.a.addOnScrollListener(bVar);
        c cVar = new c();
        this.m = cVar;
        this.b.d(cVar);
        j();
    }

    public final void i() {
        RecyclerView.u uVar = this.l;
        if (uVar != null) {
            this.a.removeOnScrollListener(uVar);
        }
        TabLayout.d dVar = this.m;
        if (dVar != null) {
            this.b.F(dVar);
        }
        this.l = null;
        this.m = null;
    }

    public final void k(int i, boolean z) {
        this.k = z;
        this.b.L(i, 0.0f, true, true);
        TabLayout tabLayout = this.b;
        tabLayout.I(tabLayout.x(i), true);
        s5b.b(this.c, this.b.x(i));
    }
}
