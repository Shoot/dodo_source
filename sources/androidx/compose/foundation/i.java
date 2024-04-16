package androidx.compose.foundation;

import defpackage.sm6;
import kotlin.Metadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Focusable.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u0014\u0010\u000b\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Landroidx/compose/foundation/i;", "Lsm6$c;", "Lmo1;", "Lg24;", "Landroidx/compose/ui/focus/e;", "focusProperties", "", "e0", "Lu35;", "f1", "()Lu35;", "inputModeManager", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class i extends sm6.c implements mo1, g24 {
    private final u35 f1() {
        return (u35) no1.a(this, ro1.e());
    }

    @Override // defpackage.g24
    public void e0(androidx.compose.ui.focus.e eVar) {
        z65.h(eVar, "focusProperties");
        eVar.h(!t35.f(f1().a(), t35.b.b()));
    }
}
