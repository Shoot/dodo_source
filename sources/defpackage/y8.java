package defpackage;

import androidx.fragment.app.Fragment;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.kustoworker.KustoStorage;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.a6a;
import defpackage.j6a;
import defpackage.p6;
import java.lang.reflect.Modifier;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
/* compiled from: AddressListRouter.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010\u0015\u001a\u00020\u0012\u0012\u0006\u0010\u0019\u001a\u00020\u0016¢\u0006\u0004\b#\u0010$J\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0002J\f\u0010\u0006\u001a\u00020\u0005*\u00020\u0002H\u0002J\u0006\u0010\b\u001a\u00020\u0007J\u0006\u0010\t\u001a\u00020\u0007J\u0010\u0010\f\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\nJ\u0006\u0010\r\u001a\u00020\u0007R\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010 \u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006%"}, d2 = {"Ly8;", "", "Lz8;", "Ls6;", "j", "Lck1;", "k", "", "i", Image.TYPE_HIGH, "Lsu2;", "result", "f", "g", "Lf63;", "a", "Lf63;", "router", "Ldt5;", "b", "Ldt5;", "currentLocality", "Lfq0;", com.huawei.hms.opendevice.c.a, "Lfq0;", "cartContentService", "", DateTokenConverter.CONVERTER_KEY, "I", "resultId", com.huawei.hms.push.e.a, "Lz8;", KustoStorage.KustoTable.COLUMN_SOURCE, "Ls8;", "addressListFragmentData", "<init>", "(Lf63;Ls8;Ldt5;Lfq0;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: y8  reason: default package */
/* loaded from: classes4.dex */
public final class y8 {
    private final f63 a;
    private final dt5 b;
    private final fq0 c;
    private final int d;
    private final z8 e;

    /* compiled from: AddressListRouter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: y8$a */
    /* loaded from: classes4.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[z8.values().length];
            try {
                iArr[z8.a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[z8.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[z8.c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: FragmentScreen.kt */
    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u000f\u0010\u0003\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u000e\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"y8$b", "Ls64;", "Lk6c;", "a", "()Landroidx/fragment/app/Fragment;", "", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "screenKey", "", "Z", DateTokenConverter.CONVERTER_KEY, "()Z", "singleTop", "infrastructure-base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: y8$b */
    /* loaded from: classes4.dex */
    public static final class b implements s64, k6c {
        private final String a;
        private final boolean b;
        final /* synthetic */ Function0 c;

        public b(boolean z, Function0 function0) {
            this.c = function0;
            if (Modifier.isFinal(p6.class.getModifiers())) {
                String name = p6.class.getName();
                z65.g(name, "getName(...)");
                this.a = name;
                this.b = z;
                return;
            }
            throw new IllegalArgumentException(("creator`s return type is " + p6.class + " which is an open or an abstract class, while it must be a concrete fragment type to produce a unique screenKey").toString());
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [p6, androidx.fragment.app.Fragment] */
        @Override // defpackage.s64
        public p6 a() {
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

    /* compiled from: AddressListRouter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lp6;", "a", "()Lp6;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: y8$c */
    /* loaded from: classes4.dex */
    static final class c extends ej5 implements Function0<p6> {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final p6 invoke() {
            p6.a aVar = p6.h;
            y8 y8Var = y8.this;
            return aVar.a(new q6(true, y8Var.j(y8Var.e)));
        }
    }

    /* compiled from: FragmentScreen.kt */
    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u000f\u0010\u0003\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u000e\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"y8$d", "Ls64;", "Lk6c;", "a", "()Landroidx/fragment/app/Fragment;", "", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "screenKey", "", "Z", DateTokenConverter.CONVERTER_KEY, "()Z", "singleTop", "infrastructure-base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: y8$d */
    /* loaded from: classes4.dex */
    public static final class d implements s64, k6c {
        private final String a;
        private final boolean b;
        final /* synthetic */ Function0 c;

        public d(boolean z, Function0 function0) {
            this.c = function0;
            if (Modifier.isFinal(a6a.class.getModifiers())) {
                String name = a6a.class.getName();
                z65.g(name, "getName(...)");
                this.a = name;
                this.b = z;
                return;
            }
            throw new IllegalArgumentException(("creator`s return type is " + a6a.class + " which is an open or an abstract class, while it must be a concrete fragment type to produce a unique screenKey").toString());
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [androidx.fragment.app.Fragment, a6a] */
        @Override // defpackage.s64
        public a6a a() {
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

    /* compiled from: AddressListRouter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"La6a;", "a", "()La6a;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: y8$e */
    /* loaded from: classes4.dex */
    static final class e extends ej5 implements Function0<a6a> {
        final /* synthetic */ boolean b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(boolean z) {
            super(0);
            this.b = z;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final a6a invoke() {
            a6a.a aVar = a6a.k;
            j6a.a aVar2 = j6a.h;
            dt5 dt5Var = y8.this.b;
            boolean z = this.b;
            int i = y8.this.d;
            y8 y8Var = y8.this;
            return aVar.a(aVar2.c(dt5Var, z, i, y8Var.k(y8Var.e)));
        }
    }

    public y8(f63 f63Var, s8 s8Var, dt5 dt5Var, fq0 fq0Var) {
        z65.h(f63Var, "router");
        z65.h(s8Var, "addressListFragmentData");
        z65.h(dt5Var, "currentLocality");
        z65.h(fq0Var, "cartContentService");
        this.a = f63Var;
        this.b = dt5Var;
        this.c = fq0Var;
        this.d = s8Var.a();
        this.e = s8Var.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final s6 j(z8 z8Var) {
        int i = a.$EnumSwitchMapping$0[z8Var.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return s6.e;
                }
                throw new NoWhenBranchMatchedException();
            }
            return s6.b;
        }
        return s6.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ck1 k(z8 z8Var) {
        int i = a.$EnumSwitchMapping$0[z8Var.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return ck1.q;
                }
                throw new NoWhenBranchMatchedException();
            }
            return ck1.o;
        }
        return ck1.e;
    }

    public final void f(su2 su2Var) {
        this.a.i(this.d, su2Var);
    }

    public final void g() {
        this.a.f(h56.c(null, 1, null));
    }

    public final void h() {
        z8 z8Var = this.e;
        if (z8Var == z8.b) {
            this.a.g(new b(false, new c()));
        } else {
            this.a.g(new xw2(new q6(true, j(z8Var))));
        }
    }

    public final void i() {
        this.a.g(new d(false, new e(this.c.a().p())));
    }
}
