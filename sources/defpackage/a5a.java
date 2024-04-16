package defpackage;

import androidx.fragment.app.Fragment;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.lang.reflect.Modifier;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
/* compiled from: SelectCountryScreen.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u000e\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¨\u0006\u0004"}, d2 = {"Ln4a;", "data", "Lyw9;", "a", "onboarding_release"}, k = 2, mv = {1, 9, 0})
/* renamed from: a5a  reason: default package */
/* loaded from: classes2.dex */
public final class a5a {

    /* compiled from: FragmentScreen.kt */
    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u000f\u0010\u0003\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u000e\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"a5a$a", "Ls64;", "Lk6c;", "a", "()Landroidx/fragment/app/Fragment;", "", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "screenKey", "", "Z", DateTokenConverter.CONVERTER_KEY, "()Z", "singleTop", "infrastructure-base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: a5a$a */
    /* loaded from: classes2.dex */
    public static final class a implements s64, k6c {
        private final String a;
        private final boolean b;
        final /* synthetic */ Function0 c;

        public a(boolean z, Function0 function0) {
            this.c = function0;
            if (Modifier.isFinal(p4a.class.getModifiers())) {
                String name = p4a.class.getName();
                z65.g(name, "getName(...)");
                this.a = name;
                this.b = z;
                return;
            }
            throw new IllegalArgumentException(("creator`s return type is " + p4a.class + " which is an open or an abstract class, while it must be a concrete fragment type to produce a unique screenKey").toString());
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [androidx.fragment.app.Fragment, p4a] */
        @Override // defpackage.s64
        public p4a a() {
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
    /* compiled from: SelectCountryScreen.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lp4a;", "a", "()Lp4a;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: a5a$b */
    /* loaded from: classes2.dex */
    public static final class b extends ej5 implements Function0<p4a> {
        final /* synthetic */ n4a a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(n4a n4aVar) {
            super(0);
            this.a = n4aVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final p4a invoke() {
            return p4a.i.a(this.a);
        }
    }

    public static final yw9 a(n4a n4aVar) {
        z65.h(n4aVar, "data");
        return new a(false, new b(n4aVar));
    }
}
