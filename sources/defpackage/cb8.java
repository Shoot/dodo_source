package defpackage;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.maps.model.MarkerOptions;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
/* compiled from: PizzeriasRender.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B%\u0012\u0006\u0010\u0019\u001a\u00020\u0016\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00020\u001f¢\u0006\u0004\b!\u0010\"J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0014J\u0010\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0014J\u000e\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0011\u001a\u00020\u000bJ\u0018\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006#"}, d2 = {"Lcb8;", "Lkp2;", "Ld88;", "pizzeria", "Lsb0;", "O", "Ljb7;", "P", "item", "Lcom/google/android/gms/maps/model/MarkerOptions;", "markerOptions", "", "Q", "", "clusterSize", "C", "S", "T", "clusterItem", "Lm86;", "marker", "R", "Landroid/content/Context;", Image.TYPE_SMALL, "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "t", "Ld88;", "selectedPizzeria", "Lrg4;", "map", "Lka1;", "clusterManager", "<init>", "(Landroid/content/Context;Lrg4;Lka1;)V", "geo_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: cb8  reason: default package */
/* loaded from: classes2.dex */
public final class cb8 extends kp2<d88> {
    private final Context s;
    private d88 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cb8(Context context, rg4 rg4Var, ka1<d88> ka1Var) {
        super(context, rg4Var, ka1Var);
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        z65.h(rg4Var, "map");
        z65.h(ka1Var, "clusterManager");
        this.s = context;
    }

    private final sb0 O(d88 d88Var) {
        int i;
        if (z65.c(d88Var, this.t)) {
            i = yw8.a;
        } else if (ov9.f(d88Var.H(), d88Var.L()) && P(d88Var) != jb7.e) {
            i = yw8.c;
        } else {
            i = yw8.b;
        }
        return yb0.a.a(this.s, i);
    }

    private final jb7 P(d88 d88Var) {
        boolean contains = d88Var.G().contains(ib7.d);
        boolean contains2 = d88Var.G().contains(ib7.e);
        boolean contains3 = d88Var.G().contains(ib7.c);
        if (contains2) {
            if (contains3 && contains) {
                return jb7.a;
            }
            if (contains3) {
                return jb7.b;
            }
            if (contains) {
                return jb7.c;
            }
            return jb7.f;
        } else if (contains) {
            return jb7.d;
        } else {
            if (!contains && contains3) {
                return jb7.e;
            }
            return jb7.f;
        }
    }

    @Override // defpackage.kp2
    protected int C(int i) {
        return iu1.c(this.s, nw8.b);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.kp2
    /* renamed from: Q */
    public void H(d88 d88Var, MarkerOptions markerOptions) {
        z65.h(d88Var, "item");
        z65.h(markerOptions, "markerOptions");
        markerOptions.C(O(d88Var));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.kp2
    /* renamed from: R */
    public void J(d88 d88Var, m86 m86Var) {
        z65.h(d88Var, "clusterItem");
        z65.h(m86Var, "marker");
        m86Var.k(d88Var.getId());
    }

    public final void S(d88 d88Var) {
        m86 E;
        z65.h(d88Var, "pizzeria");
        d88 d88Var2 = this.t;
        this.t = d88Var;
        if (d88Var2 != null && (E = E(d88Var2)) != null) {
            E.g(O(d88Var2));
        }
        this.t = d88Var;
        m86 E2 = E(d88Var);
        if (E2 != null) {
            E2.g(yb0.a.a(this.s, yw8.a));
        }
    }

    public final void T() {
        m86 E;
        d88 d88Var = this.t;
        this.t = null;
        if (d88Var != null && (E = E(d88Var)) != null) {
            E.g(O(d88Var));
        }
    }
}
