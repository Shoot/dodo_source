package defpackage;

import defpackage.sm6;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
/* compiled from: SemanticsModifier.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B+\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000f\u001a\u00020\u0006\u0012\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0011¢\u0006\u0004\b\u001d\u0010\u001eJ\f\u0010\u0005\u001a\u00020\u0004*\u00020\u0003H\u0016R\"\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\"\u0010\u000f\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\b\u001a\u0004\b\u000f\u0010\n\"\u0004\b\u0010\u0010\fR.\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\nR\u0014\u0010\u001c\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\n¨\u0006\u001f"}, d2 = {"Lyw1;", "Lsm6$c;", "Lyaa;", "Ljba;", "", "U", "", "n", "Z", "getMergeDescendants", "()Z", "f1", "(Z)V", "mergeDescendants", "o", "isClearingSemantics", "setClearingSemantics", "Lkotlin/Function1;", "p", "Lkotlin/jvm/functions/Function1;", "getProperties", "()Lkotlin/jvm/functions/Function1;", "g1", "(Lkotlin/jvm/functions/Function1;)V", "properties", "x", "shouldClearDescendantSemantics", "y0", "shouldMergeDescendantSemantics", "<init>", "(ZZLkotlin/jvm/functions/Function1;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: yw1  reason: default package */
/* loaded from: classes.dex */
public final class yw1 extends sm6.c implements yaa {
    private boolean n;
    private boolean o;
    private Function1<? super jba, Unit> p;

    public yw1(boolean z, boolean z2, Function1<? super jba, Unit> function1) {
        z65.h(function1, "properties");
        this.n = z;
        this.o = z2;
        this.p = function1;
    }

    @Override // defpackage.yaa
    public void U(jba jbaVar) {
        z65.h(jbaVar, "<this>");
        this.p.invoke(jbaVar);
    }

    public final void f1(boolean z) {
        this.n = z;
    }

    public final void g1(Function1<? super jba, Unit> function1) {
        z65.h(function1, "<set-?>");
        this.p = function1;
    }

    @Override // defpackage.yaa
    public boolean x() {
        return this.o;
    }

    @Override // defpackage.yaa
    public boolean y0() {
        return this.n;
    }
}
