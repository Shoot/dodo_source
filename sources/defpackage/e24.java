package defpackage;

import androidx.compose.ui.focus.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
/* compiled from: BackwardsCompatNode.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0011\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0002H\u0096\u0002R\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Le24;", "Lkotlin/Function1;", "Landroidx/compose/ui/focus/e;", "", "focusProperties", "a", "Ld24;", "Ld24;", "getModifier", "()Ld24;", "modifier", "<init>", "(Ld24;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: e24  reason: default package */
/* loaded from: classes.dex */
final class e24 implements Function1<e, Unit> {
    private final d24 a;

    public e24(d24 d24Var) {
        z65.h(d24Var, "modifier");
        this.a = d24Var;
    }

    public void a(e eVar) {
        z65.h(eVar, "focusProperties");
        this.a.c(new c24(eVar));
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(e eVar) {
        a(eVar);
        return Unit.a;
    }
}
