package defpackage;

import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
/* compiled from: ActualJvm.jvm.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0012\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0000\u001a%\u0010\t\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0000¢\u0006\u0004\b\t\u0010\n\u001a+\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0000¢\u0006\u0004\b\f\u0010\r*\u001e\b\u0000\u0010\u0010\u001a\u0004\b\u0000\u0010\u000e\"\b\u0012\u0004\u0012\u00028\u00000\u000f2\b\u0012\u0004\u0012\u00028\u00000\u000f*\f\b\u0000\u0010\u0011\"\u00020\u00002\u00020\u0000¨\u0006\u0012"}, d2 = {"", "instance", "", "a", "Lqn1;", "composer", "Lkotlin/Function0;", "", "composable", "b", "(Lqn1;Lkotlin/jvm/functions/Function2;)V", "T", c.a, "(Lqn1;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "V", "Ljava/util/concurrent/atomic/AtomicReference;", "AtomicReference", "TestOnly", "runtime_release"}, k = 2, mv = {1, 8, 0})
/* renamed from: f6  reason: default package */
/* loaded from: classes.dex */
public final class f6 {
    public static final int a(Object obj) {
        return System.identityHashCode(obj);
    }

    public static final void b(qn1 qn1Var, Function2<? super qn1, ? super Integer, Unit> function2) {
        z65.h(qn1Var, "composer");
        z65.h(function2, "composable");
        ((Function2) unb.e(function2, 2)).invoke(qn1Var, 1);
    }

    public static final <T> T c(qn1 qn1Var, Function2<? super qn1, ? super Integer, ? extends T> function2) {
        z65.h(qn1Var, "composer");
        z65.h(function2, "composable");
        return (T) ((Function2) unb.e(function2, 2)).invoke(qn1Var, 1);
    }
}
