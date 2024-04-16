package defpackage;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
/* compiled from: ComposableLambda.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0018\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000\u001a\u0010\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000\u001a\u0010\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000\u001a\u0016\u0010\t\u001a\u00020\b*\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0000\u001a(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0007\u001a \u0010\u0012\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¨\u0006\u0013"}, d2 = {"", "bits", "slot", "a", "f", DateTokenConverter.CONVERTER_KEY, "Ld99;", "other", "", e.a, "Lqn1;", "composer", Action.KEY_ATTRIBUTE, "tracked", "", "block", "Len1;", "b", c.a, "runtime_release"}, k = 2, mv = {1, 8, 0})
/* renamed from: gn1  reason: default package */
/* loaded from: classes.dex */
public final class gn1 {
    public static final int a(int i, int i2) {
        return i << (((i2 % 10) * 3) + 1);
    }

    public static final en1 b(qn1 qn1Var, int i, boolean z, Object obj) {
        fn1 fn1Var;
        z65.h(qn1Var, "composer");
        z65.h(obj, "block");
        qn1Var.w(i);
        Object x = qn1Var.x();
        if (x == qn1.a.a()) {
            fn1Var = new fn1(i, z);
            qn1Var.p(fn1Var);
        } else {
            z65.f(x, "null cannot be cast to non-null type androidx.compose.runtime.internal.ComposableLambdaImpl");
            fn1Var = (fn1) x;
        }
        fn1Var.g(obj);
        qn1Var.J();
        return fn1Var;
    }

    public static final en1 c(int i, boolean z, Object obj) {
        z65.h(obj, "block");
        fn1 fn1Var = new fn1(i, z);
        fn1Var.g(obj);
        return fn1Var;
    }

    public static final int d(int i) {
        return a(2, i);
    }

    public static final boolean e(d99 d99Var, d99 d99Var2) {
        z65.h(d99Var2, "other");
        if (d99Var != null) {
            if ((d99Var instanceof e99) && (d99Var2 instanceof e99)) {
                e99 e99Var = (e99) d99Var;
                if (!e99Var.r() || z65.c(d99Var, d99Var2) || z65.c(e99Var.j(), ((e99) d99Var2).j())) {
                }
            }
            return false;
        }
        return true;
    }

    public static final int f(int i) {
        return a(1, i);
    }
}
