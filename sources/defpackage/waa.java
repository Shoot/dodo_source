package defpackage;

import androidx.compose.ui.semantics.AppendedSemanticsElement;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
/* compiled from: SemanticsModifier.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\b\u0010\u0001\u001a\u00020\u0000H\u0000\u001a(\u0010\t\u001a\u00020\u0002*\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\"\u001a\u0010\r\u001a\u00060\nj\u0002`\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0001\u0010\f¨\u0006\u000e"}, d2 = {"", "a", "Lsm6;", "", "mergeDescendants", "Lkotlin/Function1;", "Ljba;", "", "properties", "b", "Ljava/util/concurrent/atomic/AtomicInteger;", "Landroidx/compose/ui/platform/AtomicInt;", "Ljava/util/concurrent/atomic/AtomicInteger;", "lastIdentifier", "ui_release"}, k = 2, mv = {1, 8, 0})
/* renamed from: waa  reason: default package */
/* loaded from: classes.dex */
public final class waa {
    private static AtomicInteger a = new AtomicInteger(0);

    public static final int a() {
        return a.addAndGet(1);
    }

    public static final sm6 b(sm6 sm6Var, boolean z, Function1<? super jba, Unit> function1) {
        z65.h(sm6Var, "<this>");
        z65.h(function1, "properties");
        return sm6Var.f(new AppendedSemanticsElement(z, function1));
    }

    public static /* synthetic */ sm6 c(sm6 sm6Var, boolean z, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return b(sm6Var, z, function1);
    }
}
