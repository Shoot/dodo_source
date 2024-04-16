package defpackage;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.MapStyleOptions;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.ka1;
import defpackage.n66;
import defpackage.rg4;
import defpackage.u68;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: PizzeriasClusterMapController.kt */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 42\u00020\u0001:\u00015B\u0007¢\u0006\u0004\b2\u00103J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\t\u001a\u00020\u0004H\u0002J\b\u0010\n\u001a\u00020\u0004H\u0002J\u0018\u0010\u000f\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u000e\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rJ\u0018\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\u0010\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001a\u0010\u001a\u001a\u00020\u00042\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00130\u0017J\u000e\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u0018J\u0014\u0010\u001f\u001a\u00020\u00042\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00180\u001dJ\b\u0010 \u001a\u00020\u0004H\u0016J\u000e\u0010#\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020!R\u001e\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010+\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010.\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u00101\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100¨\u00066"}, d2 = {"Lea8;", "Ln66;", "Lcom/google/android/gms/maps/model/LatLngBounds;", "bounds", "", "T", "Ln66$b;", "coordinate", "N", "U", "P", "Lrg4;", "deliveryMap", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "p", "M", "Lcom/google/android/gms/maps/model/LatLng;", "latLng", "", "pinStatusChange", "B", "z", "Lkotlin/Function1;", "Ld88;", "listener", "R", "pizzeria", "O", "", "pizzerias", "J", "i", "Lcom/google/android/gms/maps/model/MapStyleOptions;", "mapStyleOptions", "K", "Lka1;", "j", "Lka1;", "clusterManager", "Lcb8;", "k", "Lcb8;", "clusterRender", "l", "Lrg4;", "map", Image.TYPE_MEDIUM, "Z", "neededMinPadding", "<init>", "()V", "n", "a", "geo_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: ea8  reason: default package */
/* loaded from: classes2.dex */
public final class ea8 extends n66 {
    public static final a n = new a(null);
    private ka1<d88> j;
    private cb8 k;
    private rg4 l;
    private boolean m;

    /* compiled from: PizzeriasClusterMapController.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lea8$a;", "", "", "CLUSTER_PUDDINGS", "I", "<init>", "()V", "geo_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: ea8$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L(ea8 ea8Var, rg4 rg4Var) {
        u68 value;
        LatLng latLng;
        z65.h(ea8Var, "this$0");
        z65.h(rg4Var, "$deliveryMap");
        fr6<u68> o = ea8Var.o();
        do {
            value = o.getValue();
            latLng = rg4Var.e().a;
            z65.g(latLng, "target");
        } while (!o.d(value, new u68.a(latLng)));
        ka1<d88> ka1Var = ea8Var.j;
        if (ka1Var != null) {
            ka1Var.b();
        }
    }

    private final void N(n66.b bVar) {
        rg4 rg4Var = this.l;
        if (rg4Var != null) {
            u(bVar);
            D();
            rg4Var.j(bVar.a(this.m));
        }
    }

    private final void P() {
        ka1<d88> ka1Var = this.j;
        if (ka1Var != null) {
            ka1Var.m(new ka1.c() { // from class: ca8
                @Override // defpackage.ka1.c
                public final boolean a(ia1 ia1Var) {
                    boolean Q;
                    Q = ea8.Q(ea8.this, ia1Var);
                    return Q;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Q(ea8 ea8Var, ia1 ia1Var) {
        z65.h(ea8Var, "this$0");
        LatLngBounds.a h = LatLngBounds.h();
        z65.g(h, "builder(...)");
        Collection<d88> c = ia1Var.c();
        z65.g(c, "getItems(...)");
        for (d88 d88Var : c) {
            h.b(uv5.a(d88Var.x()));
        }
        LatLngBounds a2 = h.a();
        z65.g(a2, "build(...)");
        ea8Var.T(a2);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean S(ea8 ea8Var, Function1 function1, d88 d88Var) {
        z65.h(ea8Var, "this$0");
        z65.h(function1, "$listener");
        z65.e(d88Var);
        ea8Var.O(d88Var);
        return ((Boolean) function1.invoke(d88Var)).booleanValue();
    }

    private final void T(LatLngBounds latLngBounds) {
        rg4 rg4Var = this.l;
        if (rg4Var != null) {
            rg4Var.j(vm0.a(latLngBounds, 100));
        }
    }

    private final void U() {
        cb8 cb8Var = this.k;
        if (cb8Var != null) {
            cb8Var.T();
        }
    }

    @Override // defpackage.n66
    public void B(LatLng latLng, boolean z) {
        z65.h(latLng, "latLng");
        j().set(z);
        N(new n66.b.C0451b(latLng));
    }

    public final void J(Collection<d88> collection) {
        z65.h(collection, "pizzerias");
        U();
        i();
        ka1<d88> ka1Var = this.j;
        if (ka1Var != null) {
            ka1Var.e(collection);
        }
        ka1<d88> ka1Var2 = this.j;
        if (ka1Var2 != null) {
            ka1Var2.h();
        }
    }

    public final void K(MapStyleOptions mapStyleOptions) {
        z65.h(mapStyleOptions, "mapStyleOptions");
        rg4 rg4Var = this.l;
        if (rg4Var != null) {
            rg4Var.l(mapStyleOptions);
        }
    }

    public final void M(Context context) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.k = null;
        rg4 rg4Var = this.l;
        if (rg4Var != null) {
            ka1<d88> ka1Var = new ka1<>(context, rg4Var);
            cb8 cb8Var = new cb8(context, rg4Var, ka1Var);
            this.k = cb8Var;
            ka1Var.o(cb8Var);
            this.j = ka1Var;
            P();
        }
    }

    public final void O(d88 d88Var) {
        z65.h(d88Var, "pizzeria");
        cb8 cb8Var = this.k;
        if (cb8Var != null) {
            cb8Var.S(d88Var);
        }
    }

    public final void R(final Function1<? super d88, Boolean> function1) {
        z65.h(function1, "listener");
        ka1<d88> ka1Var = this.j;
        if (ka1Var != null) {
            ka1Var.n(new ka1.e() { // from class: da8
                @Override // defpackage.ka1.e
                public final boolean a(ja1 ja1Var) {
                    boolean S;
                    S = ea8.S(ea8.this, function1, (d88) ja1Var);
                    return S;
                }
            });
        }
    }

    @Override // defpackage.n66
    public void i() {
        ka1<d88> ka1Var = this.j;
        if (ka1Var != null) {
            ka1Var.f();
        }
        super.i();
    }

    @Override // defpackage.n66
    public void p(final rg4 rg4Var, Context context) {
        z65.h(rg4Var, "deliveryMap");
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        if (this.j == null || this.k == null) {
            super.p(rg4Var, context);
            this.l = rg4Var;
            ka1<d88> ka1Var = new ka1<>(context, rg4Var);
            cb8 cb8Var = new cb8(context, rg4Var, ka1Var);
            this.k = cb8Var;
            ka1Var.o(cb8Var);
            this.j = ka1Var;
            rg4Var.m(new rg4.c() { // from class: ba8
                @Override // defpackage.rg4.c
                public final void b() {
                    ea8.L(ea8.this, rg4Var);
                }
            });
            P();
        }
    }

    @Override // defpackage.n66
    public void z(LatLngBounds latLngBounds) {
        z65.h(latLngBounds, "bounds");
        j().set(true);
        N(new n66.b.a(latLngBounds));
    }
}
