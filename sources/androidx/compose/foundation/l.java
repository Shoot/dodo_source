package androidx.compose.foundation;

import defpackage.sm6;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Focusable.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006J\b\u0010\n\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\bH\u0016R\u0016\u0010\u000e\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Landroidx/compose/foundation/l;", "Lsm6$c;", "Lmo1;", "Lk67;", "Lw68;", "f1", "", "focused", "", "g1", "R0", "L", "n", "Z", "isFocused", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class l extends sm6.c implements mo1, k67 {
    private boolean n;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Focusable.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class a extends ej5 implements Function0<Unit> {
        final /* synthetic */ ea9<w68> a;
        final /* synthetic */ l b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(ea9<w68> ea9Var, l lVar) {
            super(0);
            this.a = ea9Var;
            this.b = lVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Object] */
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.a.a = no1.a(this.b, x68.a());
        }
    }

    private final w68 f1() {
        ea9 ea9Var = new ea9();
        l67.a(this, new a(ea9Var, this));
        return (w68) ea9Var.a;
    }

    @Override // defpackage.k67
    public void L() {
        w68 f1 = f1();
        if (this.n && f1 != null) {
            f1.a();
        }
    }

    public final void g1(boolean z) {
        w68 f1;
        if (z && (f1 = f1()) != null) {
            f1.a();
        }
        this.n = z;
    }

    @Override // defpackage.sm6.c
    public void R0() {
    }
}
