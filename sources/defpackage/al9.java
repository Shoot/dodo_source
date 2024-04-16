package defpackage;

import kotlin.Metadata;
import kotlin.Unit;
/* compiled from: Executors.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001d\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\t¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0004\u001a\u00020\u0003H\u0016R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lal9;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "", "run", "Lkx1;", "a", "Lkx1;", "dispatcher", "Lfn0;", "b", "Lfn0;", "continuation", "<init>", "(Lkx1;Lfn0;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* renamed from: al9  reason: default package */
/* loaded from: classes3.dex */
final class al9 implements Runnable {
    private final kx1 a;
    private final fn0<Unit> b;

    /* JADX WARN: Multi-variable type inference failed */
    public al9(kx1 kx1Var, fn0<? super Unit> fn0Var) {
        this.a = kx1Var;
        this.b = fn0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.b.W(this.a, Unit.a);
    }
}
