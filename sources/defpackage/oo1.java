package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
/* compiled from: CompositionLocal.kt */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a0\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u001a \u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u001a9\u0010\r\u001a\u00020\u000b2\u001a\u0010\n\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\t0\b\"\u0006\u0012\u0002\b\u00030\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0003H\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"T", "Lppa;", "policy", "Lkotlin/Function0;", "defaultFactory", "Lxr8;", "b", DateTokenConverter.CONVERTER_KEY, "", "Lzr8;", "values", "", RemoteMessageConst.Notification.CONTENT, "a", "([Lzr8;Lkotlin/jvm/functions/Function2;Lqn1;I)V", "runtime_release"}, k = 2, mv = {1, 8, 0})
/* renamed from: oo1  reason: default package */
/* loaded from: classes.dex */
public final class oo1 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CompositionLocal.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: oo1$a */
    /* loaded from: classes.dex */
    public static final class a extends ej5 implements Function2<qn1, Integer, Unit> {
        final /* synthetic */ zr8<?>[] a;
        final /* synthetic */ Function2<qn1, Integer, Unit> b;
        final /* synthetic */ int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(zr8<?>[] zr8VarArr, Function2<? super qn1, ? super Integer, Unit> function2, int i) {
            super(2);
            this.a = zr8VarArr;
            this.b = function2;
            this.c = i;
        }

        public final void a(qn1 qn1Var, int i) {
            zr8<?>[] zr8VarArr = this.a;
            oo1.a((zr8[]) Arrays.copyOf(zr8VarArr, zr8VarArr.length), this.b, qn1Var, f99.a(this.c | 1));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(qn1 qn1Var, Integer num) {
            a(qn1Var, num.intValue());
            return Unit.a;
        }
    }

    public static final void a(zr8<?>[] zr8VarArr, Function2<? super qn1, ? super Integer, Unit> function2, qn1 qn1Var, int i) {
        z65.h(zr8VarArr, "values");
        z65.h(function2, RemoteMessageConst.Notification.CONTENT);
        qn1 f = qn1Var.f(-1390796515);
        if (tn1.K()) {
            tn1.V(-1390796515, i, -1, "androidx.compose.runtime.CompositionLocalProvider (CompositionLocal.kt:225)");
        }
        f.q(zr8VarArr);
        function2.invoke(f, Integer.valueOf((i >> 3) & 14));
        f.F();
        if (tn1.K()) {
            tn1.U();
        }
        xw9 i2 = f.i();
        if (i2 != null) {
            i2.a(new a(zr8VarArr, function2, i));
        }
    }

    public static final <T> xr8<T> b(ppa<T> ppaVar, Function0<? extends T> function0) {
        z65.h(ppaVar, "policy");
        z65.h(function0, "defaultFactory");
        return new x93(ppaVar, function0);
    }

    public static /* synthetic */ xr8 c(ppa ppaVar, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            ppaVar = qpa.h();
        }
        return b(ppaVar, function0);
    }

    public static final <T> xr8<T> d(Function0<? extends T> function0) {
        z65.h(function0, "defaultFactory");
        return new lwa(function0);
    }
}
