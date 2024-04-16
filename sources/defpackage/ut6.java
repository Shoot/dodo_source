package defpackage;

import androidx.fragment.app.Fragment;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.lang.reflect.Modifier;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
/* compiled from: NativeChatScreen.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0010\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u0000\"\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0004\u0010\u0006¨\u0006\b"}, d2 = {"Lgt6;", "data", "Lyw9;", "b", "a", "Lyw9;", "()Lyw9;", "NATIVE_CHAT_SCREEN", "chat_release"}, k = 2, mv = {1, 9, 0})
/* renamed from: ut6  reason: default package */
/* loaded from: classes.dex */
public final class ut6 {
    private static final yw9 a = c(null, 1, null);

    /* compiled from: FragmentScreen.kt */
    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u000f\u0010\u0003\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u000e\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"ut6$a", "Ls64;", "Lk6c;", "a", "()Landroidx/fragment/app/Fragment;", "", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "screenKey", "", "Z", DateTokenConverter.CONVERTER_KEY, "()Z", "singleTop", "infrastructure-base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: ut6$a */
    /* loaded from: classes.dex */
    public static final class a implements s64, k6c {
        private final String a;
        private final boolean b;
        final /* synthetic */ Function0 c;

        public a(boolean z, Function0 function0) {
            this.c = function0;
            if (Modifier.isFinal(mt6.class.getModifiers())) {
                String name = mt6.class.getName();
                z65.g(name, "getName(...)");
                this.a = name;
                this.b = z;
                return;
            }
            throw new IllegalArgumentException(("creator`s return type is " + mt6.class + " which is an open or an abstract class, while it must be a concrete fragment type to produce a unique screenKey").toString());
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [androidx.fragment.app.Fragment, mt6] */
        @Override // defpackage.s64
        public mt6 a() {
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
    /* compiled from: NativeChatScreen.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lmt6;", "a", "()Lmt6;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ut6$b */
    /* loaded from: classes.dex */
    public static final class b extends ej5 implements Function0<mt6> {
        final /* synthetic */ gt6 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(gt6 gt6Var) {
            super(0);
            this.a = gt6Var;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final mt6 invoke() {
            return mt6.j.a(this.a);
        }
    }

    public static final yw9 a() {
        return a;
    }

    public static final yw9 b(gt6 gt6Var) {
        z65.h(gt6Var, "data");
        return new a(true, new b(gt6Var));
    }

    public static /* synthetic */ yw9 c(gt6 gt6Var, int i, Object obj) {
        if ((i & 1) != 0) {
            gt6Var = new gt6(null, null, false, 7, null);
        }
        return b(gt6Var);
    }
}
