package defpackage;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import defpackage.bz7;
import kotlin.Metadata;
/* compiled from: CompositionLocalMap.kt */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a \u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0000\u001a'\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a'\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0000¢\u0006\u0004\b\b\u0010\u0007\u001a+\u0010\r\u001a\u00020\u00012\u0012\u0010\u000b\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\n0\t2\u0006\u0010\f\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"T", "Lbz7;", "Llo1;", Action.KEY_ATTRIBUTE, "", "b", c.a, "(Lbz7;Llo1;)Ljava/lang/Object;", DateTokenConverter.CONVERTER_KEY, "", "Lzr8;", "values", "parentScope", "a", "([Lzr8;Lbz7;Lqn1;I)Lbz7;", "runtime_release"}, k = 2, mv = {1, 8, 0})
/* renamed from: qo1  reason: default package */
/* loaded from: classes.dex */
public final class qo1 {
    public static final bz7 a(zr8<?>[] zr8VarArr, bz7 bz7Var, qn1 qn1Var, int i) {
        z65.h(zr8VarArr, "values");
        z65.h(bz7Var, "parentScope");
        qn1Var.w(-300354947);
        if (tn1.K()) {
            tn1.V(-300354947, i, -1, "androidx.compose.runtime.compositionLocalMapOf (CompositionLocalMap.kt:91)");
        }
        bz7.a f = cz7.a().f();
        for (zr8<?> zr8Var : zr8VarArr) {
            qn1Var.w(680845765);
            if (zr8Var.a() || !b(bz7Var, zr8Var.b())) {
                lo1<?> b = zr8Var.b();
                z65.f(b, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
                f.put(b, zr8Var.b().b(zr8Var.c(), qn1Var, 8));
            }
            qn1Var.J();
        }
        bz7 a = f.a();
        if (tn1.K()) {
            tn1.U();
        }
        qn1Var.J();
        return a;
    }

    public static final <T> boolean b(bz7 bz7Var, lo1<T> lo1Var) {
        z65.h(bz7Var, "<this>");
        z65.h(lo1Var, Action.KEY_ATTRIBUTE);
        return bz7Var.containsKey(lo1Var);
    }

    public static final <T> T c(bz7 bz7Var, lo1<T> lo1Var) {
        z65.h(bz7Var, "<this>");
        z65.h(lo1Var, Action.KEY_ATTRIBUTE);
        cua cuaVar = (cua) bz7Var.get(lo1Var);
        if (cuaVar != null) {
            return (T) cuaVar.getValue();
        }
        return null;
    }

    public static final <T> T d(bz7 bz7Var, lo1<T> lo1Var) {
        z65.h(bz7Var, "<this>");
        z65.h(lo1Var, Action.KEY_ATTRIBUTE);
        if (b(bz7Var, lo1Var)) {
            return (T) c(bz7Var, lo1Var);
        }
        return lo1Var.a().getValue();
    }
}
