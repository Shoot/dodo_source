package defpackage;

import androidx.fragment.app.Fragment;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import java.lang.reflect.Modifier;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
/* compiled from: OrderHistoryRouter.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\f\u001a\u00020\u0001\u0012\u0006\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0003\u001a\u00020\u0002H\u0096\u0001J\t\u0010\u0004\u001a\u00020\u0002H\u0096\u0001J\u0016\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007J\u0006\u0010\n\u001a\u00020\u0002R\u0014\u0010\f\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000e¨\u0006\u0012"}, d2 = {"Lpf7;", "Lze7;", "", "b", "a", "Lae7;", "orderHistory", "", "positionInList", DateTokenConverter.CONVERTER_KEY, c.a, "Lze7;", "externalRouter", "Lf63;", "Lf63;", "router", "<init>", "(Lze7;Lf63;)V", "orderhistory_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: pf7  reason: default package */
/* loaded from: classes2.dex */
public final class pf7 implements ze7 {
    private final ze7 a;
    private final f63 b;

    /* compiled from: FragmentScreen.kt */
    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u000f\u0010\u0003\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u000e\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"pf7$a", "Ls64;", "Lk6c;", "a", "()Landroidx/fragment/app/Fragment;", "", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "screenKey", "", "Z", DateTokenConverter.CONVERTER_KEY, "()Z", "singleTop", "infrastructure-base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: pf7$a */
    /* loaded from: classes2.dex */
    public static final class a implements s64, k6c {
        private final String a;
        private final boolean b;
        final /* synthetic */ Function0 c;

        public a(boolean z, Function0 function0) {
            this.c = function0;
            if (Modifier.isFinal(je7.class.getModifiers())) {
                String name = je7.class.getName();
                z65.g(name, "getName(...)");
                this.a = name;
                this.b = z;
                return;
            }
            throw new IllegalArgumentException(("creator`s return type is " + je7.class + " which is an open or an abstract class, while it must be a concrete fragment type to produce a unique screenKey").toString());
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [androidx.fragment.app.Fragment, je7] */
        @Override // defpackage.s64
        public je7 a() {
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

    /* compiled from: OrderHistoryRouter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lje7;", "a", "()Lje7;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: pf7$b */
    /* loaded from: classes2.dex */
    static final class b extends ej5 implements Function0<je7> {
        final /* synthetic */ ae7 a;
        final /* synthetic */ int b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(ae7 ae7Var, int i) {
            super(0);
            this.a = ae7Var;
            this.b = i;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final je7 invoke() {
            return je7.s.a(this.a, this.b);
        }
    }

    public pf7(ze7 ze7Var, f63 f63Var) {
        z65.h(ze7Var, "externalRouter");
        z65.h(f63Var, "router");
        this.a = ze7Var;
        this.b = f63Var;
    }

    @Override // defpackage.ze7
    public void a() {
        this.a.a();
    }

    @Override // defpackage.ze7
    public void b() {
        this.a.b();
    }

    public final void c() {
        this.b.d();
    }

    public final void d(ae7 ae7Var, int i) {
        z65.h(ae7Var, "orderHistory");
        this.b.e(new a(false, new b(ae7Var, i)));
    }
}
