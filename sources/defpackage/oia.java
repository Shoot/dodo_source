package defpackage;

import androidx.fragment.app.Fragment;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.ym;
import java.lang.reflect.Modifier;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import ru.dodopizza.app.R;
import ru.dodopizza.app.presentation.phonenumberlogin.e;
/* compiled from: ShoppingCartDelegateImp.kt */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010+\u001a\u00020)\u0012\u0006\u0010.\u001a\u00020,¢\u0006\u0004\b2\u00103J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016J \u0010\u0013\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0010\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0014H\u0016J\u0010\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0014H\u0016J\b\u0010\u0017\u001a\u00020\u0002H\u0016J\b\u0010\u0018\u001a\u00020\u0002H\u0016J\u0010\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J \u0010\u001c\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0010\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001dH\u0016J\b\u0010 \u001a\u00020\u0002H\u0016J$\u0010'\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020!2\u0012\u0010&\u001a\u000e\u0012\u0006\u0012\u0004\u0018\u00010$0#j\u0002`%H\u0016J\b\u0010(\u001a\u00020\u0002H\u0016R\u0014\u0010+\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010*R\u0014\u0010.\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010-R\u0014\u00100\u001a\u00020!8\u0002X\u0082D¢\u0006\u0006\n\u0004\b'\u0010/R\u0014\u00101\u001a\u00020!8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\t\u0010/¨\u00064"}, d2 = {"Loia;", "Lnia;", "", e.a, Image.TYPE_HIGH, "Lhn6;", "priceBelowMinPrice", "Lqd;", "sender", DateTokenConverter.CONVERTER_KEY, "Lkl8;", "category", "g", "b", "", "cartItemId", "menuItemId", "Lym$d;", "screen", "l", "Lyw9;", "o", "i", "p", Image.TYPE_MEDIUM, "Ldc;", "event", "a", "n", "Lb61;", "state", "f", "j", "", "resultCode", "Lwk9;", "", "Lru/dodopizza/app/infrastracture/navigation/ResultListener;", "listener", c.a, "k", "Lf63;", "Lf63;", "router", "Lgc;", "Lgc;", "analytics", "I", "resultLogin", "resultCartError", "<init>", "(Lf63;Lgc;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: oia  reason: default package */
/* loaded from: classes4.dex */
public final class oia implements nia {
    private final f63 a;
    private final gc b;
    private final int c;
    private final int d;

    /* compiled from: FragmentScreen.kt */
    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u000f\u0010\u0003\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u000e\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"oia$a", "Ls64;", "Lk6c;", "a", "()Landroidx/fragment/app/Fragment;", "", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "screenKey", "", "Z", DateTokenConverter.CONVERTER_KEY, "()Z", "singleTop", "infrastructure-base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: oia$a */
    /* loaded from: classes4.dex */
    public static final class a implements s64, k6c {
        private final String a;
        private final boolean b;
        final /* synthetic */ Function0 c;

        public a(boolean z, Function0 function0) {
            this.c = function0;
            if (Modifier.isFinal(y31.class.getModifiers())) {
                String name = y31.class.getName();
                z65.g(name, "getName(...)");
                this.a = name;
                this.b = z;
                return;
            }
            throw new IllegalArgumentException(("creator`s return type is " + y31.class + " which is an open or an abstract class, while it must be a concrete fragment type to produce a unique screenKey").toString());
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [y31, androidx.fragment.app.Fragment] */
        @Override // defpackage.s64
        public y31 a() {
            return (Fragment) this.c.invoke();
        }

        @Override // defpackage.yw9
        public String b() {
            return this.a;
        }

        @Override // defpackage.k6c
        public boolean d() {
            return this.b;
        }
    }

    /* compiled from: ShoppingCartDelegateImp.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ly31;", "a", "()Ly31;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: oia$b */
    /* loaded from: classes4.dex */
    static final class b extends ej5 implements Function0<y31> {
        final /* synthetic */ b61 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(b61 b61Var) {
            super(0);
            this.a = b61Var;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final y31 invoke() {
            return y31.h.a(this.a);
        }
    }

    public oia(f63 f63Var, gc gcVar) {
        z65.h(f63Var, "router");
        z65.h(gcVar, "analytics");
        this.a = f63Var;
        this.b = gcVar;
        this.c = R.id.register_success_result;
        this.d = R.id.checkout_cart_errors;
    }

    @Override // defpackage.n6c
    public void a(dc dcVar) {
        z65.h(dcVar, "event");
        this.b.a(dcVar);
    }

    @Override // defpackage.n6c
    public void b(qd qdVar) {
        z65.h(qdVar, "sender");
        this.b.a(dd.d(qdVar));
    }

    @Override // defpackage.o6c
    public void c(int i, wk9<Object> wk9Var) {
        z65.h(wk9Var, "listener");
        this.a.m(i, wk9Var);
    }

    @Override // defpackage.n6c
    public void d(hn6 hn6Var, qd qdVar) {
        z65.h(hn6Var, "priceBelowMinPrice");
        z65.h(qdVar, "sender");
        this.b.a(dd.c(hn6Var, qdVar));
    }

    @Override // defpackage.nia
    public void e() {
        this.a.j(this.c);
    }

    @Override // defpackage.o6c
    public void f(b61 b61Var) {
        z65.h(b61Var, "state");
        this.a.n(new a(false, new b(b61Var)));
    }

    @Override // defpackage.n6c
    public void g(kl8 kl8Var) {
        z65.h(kl8Var, "category");
        this.b.a(dd.b(kl8Var));
    }

    @Override // defpackage.nia
    public void h() {
        this.a.j(this.d);
    }

    @Override // defpackage.o6c
    public void i(yw9 yw9Var) {
        z65.h(yw9Var, "screen");
        this.a.n(yw9Var);
    }

    @Override // defpackage.o6c
    public void j() {
        this.a.c(i56.a(n56.a));
    }

    @Override // defpackage.o6c
    public void k() {
        this.a.e(new ni3(new ei3(ck1.o)));
    }

    @Override // defpackage.o6c
    public void l(String str, String str2, ym.d dVar) {
        z65.h(str, "cartItemId");
        z65.h(str2, "menuItemId");
        z65.h(dVar, "screen");
        this.a.e(ru.dodopizza.app.presentation.product.card.variable.b.a(new uwb(str, str2, null, 0, dVar, false, 44, null)));
    }

    @Override // defpackage.m6c
    public void m() {
        this.a.e(new y38(new ru.dodopizza.app.presentation.phonenumberlogin.e(e.a.b)));
    }

    @Override // defpackage.o6c
    public void n(String str, String str2, ym.d dVar) {
        z65.h(str, "menuItemId");
        z65.h(str2, "cartItemId");
        z65.h(dVar, "screen");
        this.a.e(ru.dodopizza.app.presentation.product.card.combo.c.a(new th1(str, str2, dVar, 0, null, false, 56, null)));
    }

    @Override // defpackage.o6c
    public void o(yw9 yw9Var) {
        z65.h(yw9Var, "screen");
        this.a.e(yw9Var);
    }

    @Override // defpackage.m6c
    public void p() {
        this.a.e(new y38(new ru.dodopizza.app.presentation.phonenumberlogin.e(e.a.d)));
    }
}
