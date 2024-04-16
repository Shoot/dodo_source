package androidx.compose.foundation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: Clickable.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B<\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u001cJE\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0014\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u001a\u001a\u00020\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001d"}, d2 = {"Landroidx/compose/foundation/f;", "Landroidx/compose/foundation/a;", "Loq6;", "interactionSource", "", "enabled", "", "onClickLabel", "Lgn9;", "role", "Lkotlin/Function0;", "", "onClick", "r1", "(Loq6;ZLjava/lang/String;Lgn9;Lkotlin/jvm/functions/Function0;)V", "Landroidx/compose/foundation/h;", "v", "Landroidx/compose/foundation/h;", "q1", "()Landroidx/compose/foundation/h;", "clickableSemanticsNode", "Landroidx/compose/foundation/g;", "w", "Landroidx/compose/foundation/g;", "p1", "()Landroidx/compose/foundation/g;", "clickablePointerInputNode", "<init>", "(Loq6;ZLjava/lang/String;Lgn9;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class f extends a {
    private final h v;
    private final g w;

    public /* synthetic */ f(oq6 oq6Var, boolean z, String str, gn9 gn9Var, Function0 function0, DefaultConstructorMarker defaultConstructorMarker) {
        this(oq6Var, z, str, gn9Var, function0);
    }

    @Override // androidx.compose.foundation.a
    /* renamed from: p1 */
    public g m1() {
        return this.w;
    }

    public h q1() {
        return this.v;
    }

    public final void r1(oq6 oq6Var, boolean z, String str, gn9 gn9Var, Function0<Unit> function0) {
        z65.h(oq6Var, "interactionSource");
        z65.h(function0, "onClick");
        o1(oq6Var, z, str, gn9Var, function0);
        q1().h1(z, str, gn9Var, function0, null, null);
        m1().s1(z, oq6Var, function0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private f(oq6 oq6Var, boolean z, String str, gn9 gn9Var, Function0<Unit> function0) {
        super(oq6Var, z, str, gn9Var, function0, null);
        z65.h(oq6Var, "interactionSource");
        z65.h(function0, "onClick");
        this.v = (h) f1(new h(z, str, gn9Var, function0, null, null, null));
        this.w = (g) f1(new g(z, oq6Var, function0, n1()));
    }
}
