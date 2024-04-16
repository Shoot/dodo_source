package defpackage;

import androidx.fragment.app.Fragment;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import defpackage.d56;
import java.lang.reflect.Modifier;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
/* compiled from: MainScreen.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0012\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000\u001a\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\u0007"}, d2 = {"Ln56;", "initialTab", "Lyw9;", "b", "Lvo2;", "data", "a", "app_prodRelease"}, k = 2, mv = {1, 9, 0})
/* renamed from: h56  reason: default package */
/* loaded from: classes4.dex */
public final class h56 {

    /* compiled from: BackToScreen.kt */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002R\u001a\u0010\b\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\r\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"h56$a", "Lyw9;", "Lh6c;", "", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "screenKey", "", "Ljava/lang/Object;", "getData", "()Ljava/lang/Object;", "data", "infrastructure-base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: h56$a */
    /* loaded from: classes4.dex */
    public static final class a implements yw9, h6c {
        private final String a;
        private final Object b;

        public a(Object obj) {
            if (Modifier.isFinal(d56.class.getModifiers())) {
                String name = d56.class.getName();
                z65.g(name, "getName(...)");
                this.a = name;
                this.b = obj;
                return;
            }
            throw new IllegalArgumentException(("creator`s return type is " + d56.class + " which is an open or an abstract class, while it must be a concrete fragment type to produce a unique screenKey").toString());
        }

        @Override // defpackage.yw9
        public String b() {
            return this.a;
        }

        @Override // defpackage.h6c
        public Object getData() {
            return this.b;
        }
    }

    /* compiled from: FragmentScreen.kt */
    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u000f\u0010\u0003\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u000e\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"h56$b", "Ls64;", "Lk6c;", "a", "()Landroidx/fragment/app/Fragment;", "", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "screenKey", "", "Z", DateTokenConverter.CONVERTER_KEY, "()Z", "singleTop", "infrastructure-base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: h56$b */
    /* loaded from: classes4.dex */
    public static final class b implements s64, k6c {
        private final String a;
        private final boolean b;
        final /* synthetic */ Function0 c;

        public b(boolean z, Function0 function0) {
            this.c = function0;
            if (Modifier.isFinal(d56.class.getModifiers())) {
                String name = d56.class.getName();
                z65.g(name, "getName(...)");
                this.a = name;
                this.b = z;
                return;
            }
            throw new IllegalArgumentException(("creator`s return type is " + d56.class + " which is an open or an abstract class, while it must be a concrete fragment type to produce a unique screenKey").toString());
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [d56, androidx.fragment.app.Fragment] */
        @Override // defpackage.s64
        public d56 a() {
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
    /* compiled from: MainScreen.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ld56;", "a", "()Ld56;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: h56$c */
    /* loaded from: classes4.dex */
    public static final class c extends ej5 implements Function0<d56> {
        final /* synthetic */ n56 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(n56 n56Var) {
            super(0);
            this.a = n56Var;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final d56 invoke() {
            d56.a aVar = d56.i;
            n56 n56Var = this.a;
            if (n56Var == null) {
                n56Var = n56.a;
            }
            return aVar.a(n56Var);
        }
    }

    public static final yw9 a(vo2 vo2Var) {
        z65.h(vo2Var, "data");
        return new a(vo2Var);
    }

    public static final yw9 b(n56 n56Var) {
        return new b(false, new c(n56Var));
    }

    public static /* synthetic */ yw9 c(n56 n56Var, int i, Object obj) {
        if ((i & 1) != 0) {
            n56Var = null;
        }
        return b(n56Var);
    }
}
