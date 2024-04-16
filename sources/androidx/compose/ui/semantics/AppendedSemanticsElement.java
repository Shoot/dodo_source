package androidx.compose.ui.semantics;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
/* compiled from: SemanticsModifier.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B#\u0012\u0006\u0010\u0014\u001a\u00020\u000e\u0012\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00060\u0015¢\u0006\u0004\b \u0010!J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0016J\t\u0010\t\u001a\u00020\bHÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003R\u0017\u0010\u0014\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R#\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00060\u00158\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006\""}, d2 = {"Landroidx/compose/ui/semantics/AppendedSemanticsElement;", "Lfn6;", "Lyw1;", "Lvaa;", "t", "node", "", "u", "", "toString", "", "hashCode", "", "other", "", "equals", c.a, "Z", "getMergeDescendants", "()Z", "mergeDescendants", "Lkotlin/Function1;", "Ljba;", DateTokenConverter.CONVERTER_KEY, "Lkotlin/jvm/functions/Function1;", "getProperties", "()Lkotlin/jvm/functions/Function1;", "properties", "Ltaa;", "n", "()Ltaa;", "semanticsConfiguration", "<init>", "(ZLkotlin/jvm/functions/Function1;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class AppendedSemanticsElement extends fn6<yw1> implements vaa {
    private final boolean c;
    private final Function1<jba, Unit> d;

    /* JADX WARN: Multi-variable type inference failed */
    public AppendedSemanticsElement(boolean z, Function1<? super jba, Unit> function1) {
        z65.h(function1, "properties");
        this.c = z;
        this.d = function1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppendedSemanticsElement)) {
            return false;
        }
        AppendedSemanticsElement appendedSemanticsElement = (AppendedSemanticsElement) obj;
        if (this.c == appendedSemanticsElement.c && z65.c(this.d, appendedSemanticsElement.d)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z = this.c;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return (r0 * 31) + this.d.hashCode();
    }

    @Override // defpackage.vaa
    public taa n() {
        taa taaVar = new taa();
        taaVar.B(this.c);
        this.d.invoke(taaVar);
        return taaVar;
    }

    @Override // defpackage.fn6
    /* renamed from: t */
    public yw1 o() {
        return new yw1(this.c, false, this.d);
    }

    public String toString() {
        return "AppendedSemanticsElement(mergeDescendants=" + this.c + ", properties=" + this.d + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // defpackage.fn6
    /* renamed from: u */
    public void s(yw1 yw1Var) {
        z65.h(yw1Var, "node");
        yw1Var.f1(this.c);
        yw1Var.g1(this.d);
    }
}
