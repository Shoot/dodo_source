package defpackage;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.p;
import com.huawei.hms.opendevice.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.dodopizza.app.R;
/* compiled from: OnboardingTransactionConductor.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J*\u0010\f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\u000f"}, d2 = {"Lx97;", "Lw64;", "Landroidx/fragment/app/Fragment;", "nextFragment", "Landroidx/fragment/app/p;", "fragmentTransaction", "", c.a, "b", "Lhj1;", "command", "currentFragment", "a", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: x97  reason: default package */
/* loaded from: classes4.dex */
public final class x97 implements w64 {
    public static final a a = new a(null);
    private static final List<od5<? extends Object>> b;
    private static final List<od5<p4a>> c;

    /* compiled from: OnboardingTransactionConductor.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\"\u0010\u0004\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R \u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0005¨\u0006\n"}, d2 = {"Lx97$a;", "", "", "Lod5;", "HORIZONTAL_ANIMATION_GROUP", "Ljava/util/List;", "Lp4a;", "VERTICAL_ANIMATION_GROUP", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: x97$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        List<od5<? extends Object>> o;
        List<od5<p4a>> e;
        o = kc1.o(bc9.b(com.dodopizza.geo.feature.suggestions.presentation.a.class), bc9.b(com.dodopizza.geo.feature.deliveryaddressmap.presentation.a.class), bc9.b(ru.dodopizza.app.presentation.selectlocation.landing.smsinput.a.class), bc9.b(oj5.class), bc9.b(jk5.class));
        b = o;
        e = jc1.e(bc9.b(p4a.class));
        c = e;
    }

    private final void b(Fragment fragment, p pVar) {
        boolean Q;
        Q = sc1.Q(c, bc9.b(fragment.getClass()));
        if (Q) {
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
