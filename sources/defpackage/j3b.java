package defpackage;

import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import com.huawei.hms.opendevice.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
/* compiled from: SuspendingPointerInputFilter.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aB\u0010\b\u001a\u00020\u0000*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\"\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a4\u0010\f\u001a\u00020\u000b2\"\u0010\n\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\"\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Lsm6;", "", "key1", "Lkotlin/Function2;", "Lie8;", "Lcv1;", "", "block", c.a, "(Lsm6;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Lsm6;", "pointerInputHandler", "Lk3b;", "a", "(Lkotlin/jvm/functions/Function2;)Lk3b;", "Lkd8;", "Lkd8;", "EmptyPointerEvent", "ui_release"}, k = 2, mv = {1, 8, 0})
/* renamed from: j3b */
/* loaded from: classes.dex */
public final class j3b {
    private static final kd8 a;

    static {
        List l;
        l = kc1.l();
        a = new kd8(l);
    }

    public static final k3b a(Function2<? super ie8, ? super cv1<? super Unit>, ? extends Object> function2) {
        z65.h(function2, "pointerInputHandler");
        return new l3b(function2);
    }

    public static final /* synthetic */ kd8 b() {
        return a;
    }

    public static final sm6 c(sm6 sm6Var, Object obj, Function2<? super ie8, ? super cv1<? super Unit>, ? extends Object> function2) {
        z65.h(sm6Var, "<this>");
        z65.h(function2, "block");
        return sm6Var.f(new SuspendPointerInputElement(obj, null, null, function2, 6, null));
    }
}
