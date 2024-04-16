package defpackage;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.dodopizza.app.presentation.foodmenu.FoodMenuPresenter;
/* compiled from: MenuPreloadHelper.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \b2\u00020\u0001:\u0001\u000eB\u0017\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0013\u001a\u00020\u0011¢\u0006\u0004\b\u0017\u0010\u0018J\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002J\u001e\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002J\b\u0010\u000b\u001a\u00020\u0007H\u0002J\u0014\u0010\f\u001a\u00020\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004R\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0012R\u001e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0015¨\u0006\u0019"}, d2 = {"Log6;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "Lye6;", "menuItems", "", DateTokenConverter.CONVERTER_KEY, "menuItemVOs", c.a, e.a, "b", "Landroidx/recyclerview/widget/RecyclerView;", "a", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Lru/dodopizza/app/presentation/foodmenu/FoodMenuPresenter;", "Lru/dodopizza/app/presentation/foodmenu/FoodMenuPresenter;", "presenter", "Lx99;", "Lx99;", "preloader", "<init>", "(Landroidx/recyclerview/widget/RecyclerView;Lru/dodopizza/app/presentation/foodmenu/FoodMenuPresenter;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: og6  reason: default package */
/* loaded from: classes4.dex */
public final class og6 {
    public static final a d = new a(null);
    private final RecyclerView a;
    private final FoodMenuPresenter b;
    private x99<ye6> c;

    /* compiled from: MenuPreloadHelper.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Log6$a;", "", "", "ON_SCROLL_PRELOAD_SIZE", "I", "PER_CATEGORY_PRELOAD_SIZE", "", "SCROLL_STATE_IDLE_DELAY", "J", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: og6$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: MenuPreloadHelper.kt */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\b"}, d2 = {"og6$b", "Landroidx/recyclerview/widget/RecyclerView$u;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "newState", "", "onScrollStateChanged", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: og6$b */
    /* loaded from: classes4.dex */
    public static final class b extends RecyclerView.u {
        final /* synthetic */ Runnable a;

        b(Runnable runnable) {
            this.a = runnable;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            z65.h(recyclerView, "recyclerView");
            if (i == 0) {
                recyclerView.getHandler().postDelayed(this.a, 1500L);
            } else {
                recyclerView.getHandler().removeCallbacks(this.a);
            }
        }
    }

    public og6(RecyclerView recyclerView, FoodMenuPresenter foodMenuPresenter) {
        z65.h(recyclerView, "recyclerView");
        z65.h(foodMenuPresenter, "presenter");
        this.a = recyclerView;
        this.b = foodMenuPresenter;
    }

    private final void c(Context context, List<? extends ye6> list) {
        List B0;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            kl8 z = ((ye6) obj).z();
            Object obj2 = linkedHashMap.get(z);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(z, obj2);
            }
            ((List) obj2).add(obj);
        }
        ArrayList<ye6> arrayList = new ArrayList();
        for (List list2 : linkedHashMap.values()) {
            B0 = sc1.B0(list2, 2);
            pc1.C(arrayList, B0);
        }
        for (ye6 ye6Var : arrayList) {
            com.bumptech.glide.b.t(context).t(ye6Var.y()).b0(yj8.LOW).P0();
        }
    }

    private final void d(Context context, List<? extends ye6> list) {
        x99<ye6> x99Var = this.c;
        if (x99Var != null) {
            this.a.removeOnScrollListener(x99Var);
        }
        uy3 uy3Var = new uy3(Integer.MIN_VALUE, Integer.MIN_VALUE);
        x99<ye6> x99Var2 = new x99<>(com.bumptech.glide.b.t(context), new pg6(context, list), uy3Var, 10);
        this.a.addOnScrollListener(x99Var2);
        this.c = x99Var2;
    }

    private final void e() {
        this.a.addOnScrollListener(new b(new Runnable() { // from class: ng6
            @Override // java.lang.Runnable
            public final void run() {
                og6.f(og6.this);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(og6 og6Var) {
        LinearLayoutManager linearLayoutManager;
        z65.h(og6Var, "this$0");
        RecyclerView.p layoutManager = og6Var.a.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            linearLayoutManager = (LinearLayoutManager) layoutManager;
        } else {
            linearLayoutManager = null;
        }
        if (linearLayoutManager != null) {
            int d2 = linearLayoutManager.d2();
            int i2 = linearLayoutManager.i2();
            if (d2 != -1 && i2 != -1) {
                og6Var.b.A0(d2, i2);
            }
        }
    }

    public final void b(List<? extends ye6> list) {
        z65.h(list, "menuItemVOs");
        Context context = this.a.getContext();
        pw6 pw6Var = pw6.a;
        z65.e(context);
        if (!pw6Var.e(context)) {
            c(context, list);
            e();
        }
        d(context, list);
    }
}
