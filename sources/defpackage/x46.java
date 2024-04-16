package defpackage;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.p;
import com.huawei.hms.opendevice.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.dodopizza.app.R;
import ru.dodopizza.app.presentation.selectpizzeria.e;
/* compiled from: MainFragmentTransactionConductor.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J*\u0010\f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\u000f"}, d2 = {"Lx46;", "Lw64;", "Landroidx/fragment/app/Fragment;", "nextFragment", "Landroidx/fragment/app/p;", "fragmentTransaction", "", c.a, "b", "Lhj1;", "command", "currentFragment", "a", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: x46  reason: default package */
/* loaded from: classes3.dex */
public final class x46 implements w64 {
    public static final a a = new a(null);
    private static final List<od5<? extends Object>> b;
    private static final List<od5<? extends Object>> c;

    /* compiled from: MainFragmentTransactionConductor.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\u0004\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\"\u0010\u0006\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005¨\u0006\t"}, d2 = {"Lx46$a;", "", "", "Lod5;", "HORIZONTAL_ANIMATION_GROUP", "Ljava/util/List;", "VERTICAL_ANIMATION_GROUP", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: x46$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        List<od5<? extends Object>> o;
        List<od5<? extends Object>> o2;
        o = kc1.o(bc9.b(b2.class), bc9.b(com.dodopizza.order.feature.halves.constructor.presentation.a.class), bc9.b(nl4.class), bc9.b(com.dodopizza.auth.features.legaldocuments.presentation.a.class), bc9.b(ef7.class), bc9.b(je7.class), bc9.b(ru.dodopizza.app.presentation.pincodelogin.a.class), bc9.b(bd7.class), bc9.b(mv2.class), bc9.b(jj7.class), bc9.b(com.dodopizza.feature.webinfo.presentation.c.class), bc9.b(kt0.class), bc9.b(e.class), bc9.b(ru.dodopizza.app.presentation.addresslist.c.class), bc9.b(j26.class), bc9.b(fy9.class), bc9.b(ii3.class), bc9.b(ob9.class));
        b = o;
        o2 = kc1.o(bc9.b(gr3.class), bc9.b(jo8.class), bc9.b(an8.class), bc9.b(dn8.class), bc9.b(ob.class), bc9.b(vx6.class), bc9.b(f59.class), bc9.b(b4c.class), bc9.b(p38.class), bc9.b(kh7.class), bc9.b(p4a.class), bc9.b(a6a.class), bc9.b(t59.class), bc9.b(a84.class), bc9.b(b02.class), bc9.b(m06.class), bc9.b(h16.class), bc9.b(n16.class), bc9.b(u6a.class), bc9.b(wb9.class), bc9.b(wsa.class));
        c = o2;
    }

    private final void b(Fragment fragment, p pVar) {
        if (c.contains(bc9.b(fragment.getClass()))) {
            pVar.z(R.anim.slide_up2, R.anim.animate_nothing, R.anim.animate_nothing, R.anim.slide_down2);
        }
    }

    private final void c(Fragment fragment, p pVar) {
        if (b.contains(bc9.b(fragment.getClass()))) {
            pVar.z(R.anim.to_left_in, R.anim.to_left_out, R.anim.to_right_in, R.anim.to_right_out);
        }
    }

    @Override // defpackage.w64
    public void a(hj1 hj1Var, Fragment fragment, Fragment fragment2, p pVar) {
        z65.h(hj1Var, "command");
        z65.h(fragment2, "nextFragment");
        z65.h(pVar, "fragmentTransaction");
        c(fragment2, pVar);
        b(fragment2, pVar);
    }
}
