package androidx.compose.foundation;

import defpackage.sm6;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Focusable.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\f\u0010\t\u001a\u00020\u0006*\u00020\bH\u0016R\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u0010\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Landroidx/compose/foundation/m;", "Lsm6$c;", "Lyaa;", "Lj24;", "", "focused", "", "f1", "Ljba;", "U", "Ltaa;", "n", "Ltaa;", "semanticsConfigurationCache", "o", "Z", "isFocused", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class m extends sm6.c implements yaa, j24 {
    private taa n = new taa();
    private boolean o;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Focusable.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class a extends ej5 implements Function0<Boolean> {
        a() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(androidx.compose.ui.focus.h.a(m.this));
        }
    }

    @Override // defpackage.yaa
    public void U(jba jbaVar) {
        z65.h(jbaVar, "<this>");
        hba.i(jbaVar, this.o);
        hba.g(jbaVar, null, new a(), 1, null);
    }

    public final void f1(boolean z) {
        this.o = z;
    }

    @Override // defpackage.yaa
    public /* synthetic */ boolean x() {
        return xaa.a(this);
    }

    @Override // defpackage.yaa
    public /* synthetic */ boolean y0() {
        return xaa.b(this);
    }
}
