package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.r;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: SnapOnScrollListener.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0012\u001a\u00020\t\u0012\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u001a\b\u0002\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0017¢\u0006\u0004\b \u0010!J$\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0002J\u0014\u0010\n\u001a\u00020\u0005*\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J \u0010\r\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005H\u0016J\u0018\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0005H\u0016R\u0014\u0010\u0012\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R#\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R)\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001e\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001f\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u001d¨\u0006\""}, d2 = {"Lxoa;", "Landroidx/recyclerview/widget/RecyclerView$u;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Lkotlin/Function1;", "", "", "updatePosition", Image.TYPE_HIGH, "Landroidx/recyclerview/widget/r;", "g", "dx", "dy", "onScrolled", "newState", "onScrollStateChanged", "a", "Landroidx/recyclerview/widget/r;", "snapHelper", "b", "Lkotlin/jvm/functions/Function1;", e.a, "()Lkotlin/jvm/functions/Function1;", "Lkotlin/Function2;", com.huawei.hms.opendevice.c.a, "Lkotlin/jvm/functions/Function2;", "f", "()Lkotlin/jvm/functions/Function2;", DateTokenConverter.CONVERTER_KEY, "I", "scrolledSnapPosition", "stateChangedSnapPosition", "<init>", "(Landroidx/recyclerview/widget/r;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)V", "android_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: xoa  reason: default package */
/* loaded from: classes.dex */
public final class xoa extends RecyclerView.u {
    private final r a;
    private final Function1<Integer, Unit> b;
    private final Function2<Integer, Integer, Unit> c;
    private int d;
    private int e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SnapOnScrollListener.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: xoa$a */
    /* loaded from: classes.dex */
    public static final class a extends ej5 implements Function1<Integer, Unit> {
        public static final a a = new a();

        a() {
            super(1);
        }

        public final void invoke(int i) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
            invoke(num.intValue());
            return Unit.a;
        }
    }

    /* compiled from: SnapOnScrollListener.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "position", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: xoa$c */
    /* loaded from: classes.dex */
    static final class c extends ej5 implements Function1<Integer, Unit> {
        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
            invoke(num.intValue());
            return Unit.a;
        }

        public final void invoke(int i) {
            if (xoa.this.e != i) {
                xoa.this.e().invoke(Integer.valueOf(i));
                xoa.this.e = i;
            }
        }
    }

    /* compiled from: SnapOnScrollListener.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "position", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: xoa$d */
    /* loaded from: classes.dex */
    static final class d extends ej5 implements Function1<Integer, Unit> {
        d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
            invoke(num.intValue());
            return Unit.a;
        }

        public final void invoke(int i) {
            if (xoa.this.d != i) {
                xoa.this.f().invoke(Integer.valueOf(xoa.this.d), Integer.valueOf(i));
                xoa.this.d = i;
            }
        }
    }

    public /* synthetic */ xoa(r rVar, Function1 function1, Function2 function2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(rVar, (i & 2) != 0 ? a.a : function1, (i & 4) != 0 ? b.a : function2);
    }

    private final int g(r rVar, RecyclerView recyclerView) {
        View h;
        RecyclerView.p layoutManager = recyclerView.getLayoutManager();
        if (layoutManager == null || (h = rVar.h(layoutManager)) == null) {
            return -1;
        }
        return layoutManager.n0(h);
    }

    private final void h(RecyclerView recyclerView, Function1<? super Integer, Unit> function1) {
        function1.invoke(Integer.valueOf(g(this.a, recyclerView)));
    }

    public final Function1<Integer, Unit> e() {
        return this.b;
    }

    public final Function2<Integer, Integer, Unit> f() {
        return this.c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.u
    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        z65.h(recyclerView, "recyclerView");
        h(recyclerView, new c());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.u
    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        z65.h(recyclerView, "recyclerView");
        h(recyclerView, new d());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public xoa(r rVar, Function1<? super Integer, Unit> function1, Function2<? super Integer, ? super Integer, Unit> function2) {
        z65.h(rVar, "snapHelper");
        z65.h(function1, "onScrollStateChanged");
        z65.h(function2, "onScrolled");
        this.a = rVar;
        this.b = function1;
        this.c = function2;
        this.d = -1;
        this.e = -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SnapOnScrollListener.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "<anonymous parameter 0>", "<anonymous parameter 1>", "", "a", "(II)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: xoa$b */
    /* loaded from: classes.dex */
    public static final class b extends ej5 implements Function2<Integer, Integer, Unit> {
        public static final b a = new b();

        b() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Integer num, Integer num2) {
            a(num.intValue(), num2.intValue());
            return Unit.a;
        }

        public final void a(int i, int i2) {
        }
    }
}
