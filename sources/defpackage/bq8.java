package defpackage;

import androidx.fragment.app.Fragment;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import java.lang.reflect.Modifier;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
/* compiled from: PromoCodeResultRouterImpl.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016J \u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016J\u0018\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016R\u0014\u0010\u0014\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0013¨\u0006\u0017"}, d2 = {"Lbq8;", "Laq8;", "Lla9;", "status", "", e.a, "b", "", "errorTitle", "errorMessage", DateTokenConverter.CONVERTER_KEY, "codeCountry", "a", "", "coinsReward", "", "expirationDays", c.a, "Lf63;", "Lf63;", "router", "<init>", "(Lf63;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: bq8  reason: default package */
/* loaded from: classes4.dex */
public final class bq8 implements aq8 {
    private final f63 a;

    /* compiled from: FragmentScreen.kt */
    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u000f\u0010\u0003\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u000e\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"bq8$a", "Ls64;", "Lk6c;", "a", "()Landroidx/fragment/app/Fragment;", "", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "screenKey", "", "Z", DateTokenConverter.CONVERTER_KEY, "()Z", "singleTop", "infrastructure-base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: bq8$a */
    /* loaded from: classes4.dex */
    public static final class a implements s64, k6c {
        private final String a;
        private final boolean b;
        final /* synthetic */ Function0 c;

        public a(boolean z, Function0 function0) {
            this.c = function0;
            if (Modifier.isFinal(qa9.class.getModifiers())) {
                String name = qa9.class.getName();
                z65.g(name, "getName(...)");
                this.a = name;
                this.b = z;
                return;
            }
            throw new IllegalArgumentException(("creator`s return type is " + qa9.class + " which is an open or an abstract class, while it must be a concrete fragment type to produce a unique screenKey").toString());
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [androidx.fragment.app.Fragment, qa9] */
        @Override // defpackage.s64
        public qa9 a() {
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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PromoCodeResultRouterImpl.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lqa9;", "a", "()Lqa9;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: bq8$b */
    /* loaded from: classes4.dex */
    public static final class b extends ej5 implements Function0<qa9> {
        final /* synthetic */ la9 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(la9 la9Var) {
            super(0);
            this.a = la9Var;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final qa9 invoke() {
            return qa9.k.a(this.a);
        }
    }

    public bq8(f63 f63Var) {
        z65.h(f63Var, "router");
        this.a = f63Var;
    }

    private final void e(la9 la9Var) {
        this.a.n(new a(false, new b(la9Var)));
    }

    @Override // defpackage.aq8
    public void a(String str, String str2, String str3) {
        z65.h(str, "codeCountry");
        z65.h(str2, "errorTitle");
        z65.h(str3, "errorMessage");
        e(new oy1(str, str2, str3));
    }

    @Override // defpackage.aq8
    public void b() {
        e(vqb.a);
    }

    @Override // defpackage.aq8
    public void c(double d, int i) {
        e(new t1b(d, i));
    }

    @Override // defpackage.aq8
    public void d(String str, String str2) {
        z65.h(str, "errorTitle");
        z65.h(str2, "errorMessage");
        e(new ci0(str, str2));
    }
}
