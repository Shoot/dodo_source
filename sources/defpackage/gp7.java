package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: Paginator.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 &2\u00020\u0001:\u0001\u000bB+\b\u0000\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0015\u001a\u00020\u0012\u0012\b\u0010#\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b$\u0010%J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u000e\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005J\u000e\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0005R\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0018\u001a\u00020\u00168\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017R\u0016\u0010\u001b\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001dR\u0014\u0010!\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010 ¨\u0006'"}, d2 = {"Lgp7;", "", "", DateTokenConverter.CONVERTER_KEY, e.a, "", "isLoading", "f", "isNoMoreItems", "g", "Landroidx/recyclerview/widget/RecyclerView;", "a", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Ll87;", "b", "Ll87;", "loadMoreListener", "", com.huawei.hms.opendevice.c.a, "I", "loadingTriggerThreshold", "Lm8c;", "Lm8c;", "wrapperAdapter", "Lfp7;", "Lfp7;", "paginateState", "Landroidx/recyclerview/widget/RecyclerView$j;", "Landroidx/recyclerview/widget/RecyclerView$j;", "mDataObserver", "Landroidx/recyclerview/widget/RecyclerView$u;", "Landroidx/recyclerview/widget/RecyclerView$u;", "mOnScrollListener", "Las5;", "loadingItemCreator", "<init>", "(Landroidx/recyclerview/widget/RecyclerView;Ll87;ILas5;)V", Image.TYPE_HIGH, "android_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: gp7  reason: default package */
/* loaded from: classes.dex */
public final class gp7 {
    public static final a h = new a(null);
    private final RecyclerView a;
    private final l87 b;
    private final int c;
    private m8c d;
    private volatile fp7 e;
    private final RecyclerView.j f;
    private final RecyclerView.u g;

    /* compiled from: Paginator.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lgp7$a;", "", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Lip7;", "a", "<init>", "()V", "android_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: gp7$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ip7 a(RecyclerView recyclerView) {
            z65.h(recyclerView, "recyclerView");
            return new ip7(recyclerView);
        }
    }

    /* compiled from: Paginator.kt */
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016J\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016J\"\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\u0018\u0010\f\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016J \u0010\u000f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¨\u0006\u0010"}, d2 = {"gp7$b", "Landroidx/recyclerview/widget/RecyclerView$j;", "", "a", "", "positionStart", "itemCount", DateTokenConverter.CONVERTER_KEY, "b", "", "payload", com.huawei.hms.opendevice.c.a, "f", "fromPosition", "toPosition", e.a, "android_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: gp7$b */
    /* loaded from: classes.dex */
    public static final class b extends RecyclerView.j {
        b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void a() {
            m8c m8cVar = gp7.this.d;
            if (m8cVar == null) {
                z65.z("wrapperAdapter");
                m8cVar = null;
            }
            m8cVar.notifyDataSetChanged();
            gp7.this.e();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void b(int i, int i2) {
            m8c m8cVar = gp7.this.d;
            if (m8cVar == null) {
                z65.z("wrapperAdapter");
                m8cVar = null;
            }
            m8cVar.notifyItemRangeChanged(i, i2);
            gp7.this.e();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void c(int i, int i2, Object obj) {
            m8c m8cVar = gp7.this.d;
            if (m8cVar == null) {
                z65.z("wrapperAdapter");
                m8cVar = null;
            }
            m8cVar.notifyItemRangeChanged(i, i2, obj);
            gp7.this.e();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void d(int i, int i2) {
            m8c m8cVar = gp7.this.d;
            if (m8cVar == null) {
                z65.z("wrapperAdapter");
                m8cVar = null;
            }
            m8cVar.notifyItemRangeInserted(i, i2);
            gp7.this.e();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void e(int i, int i2, int i3) {
            m8c m8cVar = gp7.this.d;
            if (m8cVar == null) {
                z65.z("wrapperAdapter");
                m8cVar = null;
            }
            m8cVar.notifyItemMoved(i, i2);
            gp7.this.e();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void f(int i, int i2) {
            m8c m8cVar = gp7.this.d;
            if (m8cVar == null) {
                z65.z("wrapperAdapter");
                m8cVar = null;
            }
            m8cVar.notifyItemRangeRemoved(i, i2);
            gp7.this.e();
        }
    }

    /* compiled from: Paginator.kt */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\b"}, d2 = {"gp7$c", "Landroidx/recyclerview/widget/RecyclerView$u;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "newState", "", "onScrollStateChanged", "android_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: gp7$c */
    /* loaded from: classes.dex */
    public static final class c extends RecyclerView.u {
        c() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            z65.h(recyclerView, "recyclerView");
            super.onScrollStateChanged(recyclerView, i);
            if (i == 0) {
                gp7.this.d();
            }
        }
    }

    public gp7(RecyclerView recyclerView, l87 l87Var, int i, as5 as5Var) {
        boolean z;
        z65.h(recyclerView, "recyclerView");
        z65.h(l87Var, "loadMoreListener");
        this.a = recyclerView;
        this.b = l87Var;
        this.c = i;
        this.e = fp7.a;
        b bVar = new b();
        this.f = bVar;
        c cVar = new c();
        this.g = cVar;
        recyclerView.addOnScrollListener(cVar);
        if (as5Var != null) {
            Object b2 = mh5.b(recyclerView.getAdapter(), "Adapter must be set");
            z65.g(b2, "notNullOrError(...)");
            RecyclerView.h hVar = (RecyclerView.h) b2;
            m8c m8cVar = new m8c(hVar, as5Var);
            this.d = m8cVar;
            if (this.e != fp7.d) {
                z = true;
            } else {
                z = false;
            }
            m8cVar.i(z);
            hVar.registerAdapterDataObserver(bVar);
            m8c m8cVar2 = this.d;
            if (m8cVar2 == null) {
                z65.z("wrapperAdapter");
                m8cVar2 = null;
            }
            recyclerView.setAdapter(m8cVar2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d() {
        if (rx9.a.b(this.a, this.c) && this.e == fp7.a) {
            this.b.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e() {
        boolean z;
        m8c m8cVar = this.d;
        if (m8cVar == null) {
            z65.z("wrapperAdapter");
            m8cVar = null;
        }
        if (this.e != fp7.d) {
            z = true;
        } else {
            z = false;
        }
        m8cVar.i(z);
        d();
    }

    public final void f(boolean z) {
        if (this.e != fp7.d) {
            if (z) {
                this.e = fp7.b;
                m8c m8cVar = this.d;
                if (m8cVar == null) {
                    z65.z("wrapperAdapter");
                    m8cVar = null;
                }
                m8cVar.i(true);
                return;
            }
            this.e = fp7.a;
        }
    }

    public final void g(boolean z) {
        if (z) {
            this.e = fp7.d;
            m8c m8cVar = this.d;
            if (m8cVar == null) {
                z65.z("wrapperAdapter");
                m8cVar = null;
            }
            m8cVar.i(false);
            return;
        }
        this.e = fp7.a;
    }
}
