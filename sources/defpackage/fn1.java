package defpackage;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.push.e;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
/* compiled from: ComposableLambda.jvm.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0016\u001a\u00020\u000b\u0012\u0006\u0010\u0019\u001a\u00020\u0017¢\u0006\u0004\b\"\u0010#J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u000e\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007J\u001b\u0010\r\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0096\u0002J%\u0010\u000f\u001a\u0004\u0018\u00010\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0096\u0002J/\u0010\n\u001a\u0004\u0018\u00010\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0096\u0002J9\u0010\u0012\u001a\u0004\u0018\u00010\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0096\u0002R\u0017\u0010\u0016\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0018R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u001aR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u001dR\u001e\u0010!\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010 ¨\u0006$"}, d2 = {"Lfn1;", "Len1;", "", "f", "Lqn1;", "composer", e.a, "", "block", "g", com.huawei.hms.opendevice.c.a, "", "changed", "a", "p1", "b", "p2", "p3", DateTokenConverter.CONVERTER_KEY, "I", "getKey", "()I", Action.KEY_ATTRIBUTE, "", "Z", "tracked", "Ljava/lang/Object;", "_block", "Ld99;", "Ld99;", Action.SCOPE_ATTRIBUTE, "", "Ljava/util/List;", "scopes", "<init>", "(IZ)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: fn1  reason: default package */
/* loaded from: classes.dex */
public final class fn1 implements en1 {
    private final int a;
    private final boolean b;
    private Object c;
    private d99 d;
    private List<d99> e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ComposableLambda.jvm.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lqn1;", "nc", "", "<anonymous parameter 1>", "", "a", "(Lqn1;I)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: fn1$a */
    /* loaded from: classes.dex */
    public static final class a extends ej5 implements Function2<qn1, Integer, Unit> {
        final /* synthetic */ Object b;
        final /* synthetic */ int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Object obj, int i) {
            super(2);
            this.b = obj;
            this.c = i;
        }

        public final void a(qn1 qn1Var, int i) {
            z65.h(qn1Var, "nc");
            fn1.this.b(this.b, qn1Var, f99.a(this.c) | 1);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(qn1 qn1Var, Integer num) {
            a(qn1Var, num.intValue());
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ComposableLambda.jvm.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lqn1;", "nc", "", "<anonymous parameter 1>", "", "a", "(Lqn1;I)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: fn1$b */
    /* loaded from: classes.dex */
    public static final class b extends ej5 implements Function2<qn1, Integer, Unit> {
        final /* synthetic */ Object b;
        final /* synthetic */ Object c;
        final /* synthetic */ int d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Object obj, Object obj2, int i) {
            super(2);
            this.b = obj;
            this.c = obj2;
            this.d = i;
        }

        public final void a(qn1 qn1Var, int i) {
            z65.h(qn1Var, "nc");
            fn1.this.c(this.b, this.c, qn1Var, f99.a(this.d) | 1);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(qn1 qn1Var, Integer num) {
            a(qn1Var, num.intValue());
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ComposableLambda.jvm.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lqn1;", "nc", "", "<anonymous parameter 1>", "", "a", "(Lqn1;I)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: fn1$c */
    /* loaded from: classes.dex */
    public static final class c extends ej5 implements Function2<qn1, Integer, Unit> {
        final /* synthetic */ Object b;
        final /* synthetic */ Object c;
        final /* synthetic */ Object d;
        final /* synthetic */ int e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Object obj, Object obj2, Object obj3, int i) {
            super(2);
            this.b = obj;
            this.c = obj2;
            this.d = obj3;
            this.e = i;
        }

        public final void a(qn1 qn1Var, int i) {
            z65.h(qn1Var, "nc");
            fn1.this.d(this.b, this.c, this.d, qn1Var, f99.a(this.e) | 1);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(qn1 qn1Var, Integer num) {
            a(qn1Var, num.intValue());
            return Unit.a;
        }
    }

    public fn1(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    private final void e(qn1 qn1Var) {
        d99 v;
        if (this.b && (v = qn1Var.v()) != null) {
            qn1Var.C(v);
            if (gn1.e(this.d, v)) {
                this.d = v;
                return;
            }
            List<d99> list = this.e;
            if (list == null) {
                ArrayList arrayList = new ArrayList();
                this.e = arrayList;
                arrayList.add(v);
                return;
            }
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (gn1.e(list.get(i), v)) {
                    list.set(i, v);
                    return;
                }
            }
            list.add(v);
        }
    }

    private final void f() {
        if (this.b) {
            d99 d99Var = this.d;
            if (d99Var != null) {
                d99Var.invalidate();
                this.d = null;
            }
            List<d99> list = this.e;
            if (list != null) {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    list.get(i).invalidate();
                }
                list.clear();
            }
        }
    }

    public Object a(qn1 qn1Var, int i) {
        int f;
        z65.h(qn1Var, com.huawei.hms.opendevice.c.a);
        qn1 f2 = qn1Var.f(this.a);
        e(f2);
        if (f2.K(this)) {
            f = gn1.d(0);
        } else {
            f = gn1.f(0);
        }
        int i2 = i | f;
        Object obj = this.c;
        z65.f(obj, "null cannot be cast to non-null type kotlin.Function2<@[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        Object invoke = ((Function2) unb.e(obj, 2)).invoke(f2, Integer.valueOf(i2));
        xw9 i3 = f2.i();
        if (i3 != null) {
            z65.f(this, "null cannot be cast to non-null type kotlin.Function2<androidx.compose.runtime.Composer, kotlin.Int, kotlin.Unit>");
            i3.a((Function2) unb.e(this, 2));
        }
        return invoke;
    }

    public Object b(Object obj, qn1 qn1Var, int i) {
        int f;
        z65.h(qn1Var, com.huawei.hms.opendevice.c.a);
        qn1 f2 = qn1Var.f(this.a);
        e(f2);
        if (f2.K(this)) {
            f = gn1.d(1);
        } else {
            f = gn1.f(1);
        }
        Object obj2 = this.c;
        z65.f(obj2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        Object invoke = ((y84) unb.e(obj2, 3)).invoke(obj, f2, Integer.valueOf(f | i));
        xw9 i2 = f2.i();
        if (i2 != null) {
            i2.a(new a(obj, i));
        }
        return invoke;
    }

    public Object c(Object obj, Object obj2, qn1 qn1Var, int i) {
        int f;
        z65.h(qn1Var, com.huawei.hms.opendevice.c.a);
        qn1 f2 = qn1Var.f(this.a);
        e(f2);
        if (f2.K(this)) {
            f = gn1.d(2);
        } else {
            f = gn1.f(2);
        }
        Object obj3 = this.c;
        z65.f(obj3, "null cannot be cast to non-null type kotlin.Function4<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        Object q = ((a94) unb.e(obj3, 4)).q(obj, obj2, f2, Integer.valueOf(f | i));
        xw9 i2 = f2.i();
        if (i2 != null) {
            i2.a(new b(obj, obj2, i));
        }
        return q;
    }

    public Object d(Object obj, Object obj2, Object obj3, qn1 qn1Var, int i) {
        int f;
        z65.h(qn1Var, com.huawei.hms.opendevice.c.a);
        qn1 f2 = qn1Var.f(this.a);
        e(f2);
        if (f2.K(this)) {
            f = gn1.d(3);
        } else {
            f = gn1.f(3);
        }
        Object obj4 = this.c;
        z65.f(obj4, "null cannot be cast to non-null type kotlin.Function5<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        Object f0 = ((c94) unb.e(obj4, 5)).f0(obj, obj2, obj3, f2, Integer.valueOf(f | i));
        xw9 i2 = f2.i();
        if (i2 != null) {
            i2.a(new c(obj, obj2, obj3, i));
        }
        return f0;
    }

    @Override // defpackage.c94
    public /* bridge */ /* synthetic */ Object f0(Object obj, Object obj2, Object obj3, qn1 qn1Var, Integer num) {
        return d(obj, obj2, obj3, qn1Var, num.intValue());
    }

    public final void g(Object obj) {
        boolean z;
        z65.h(obj, "block");
        if (!z65.c(this.c, obj)) {
            if (this.c == null) {
                z = true;
            } else {
                z = false;
            }
            this.c = obj;
            if (!z) {
                f();
            }
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(qn1 qn1Var, Integer num) {
        return a(qn1Var, num.intValue());
    }

    @Override // defpackage.a94
    public /* bridge */ /* synthetic */ Object q(Object obj, Object obj2, qn1 qn1Var, Integer num) {
        return c(obj, obj2, qn1Var, num.intValue());
    }

    @Override // defpackage.y84
    public /* bridge */ /* synthetic */ Object invoke(Object obj, qn1 qn1Var, Integer num) {
        return b(obj, qn1Var, num.intValue());
    }
}
