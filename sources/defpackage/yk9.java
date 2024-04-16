package defpackage;

import com.huawei.hms.push.e;
import defpackage.sk9;
import kotlin.Metadata;
import kotlin.Unit;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: JobSupport.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0015\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0096\u0002R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lyk9;", "T", "Lu95;", "", "cause", "", "R", "Lgn0;", e.a, "Lgn0;", "continuation", "<init>", "(Lgn0;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* renamed from: yk9  reason: default package */
/* loaded from: classes3.dex */
public final class yk9<T> extends u95 {
    private final gn0<T> e;

    /* JADX WARN: Multi-variable type inference failed */
    public yk9(gn0<? super T> gn0Var) {
        this.e = gn0Var;
    }

    @Override // defpackage.wl1
    public void R(Throwable th) {
        Object t0 = S().t0();
        if (t0 instanceof il1) {
            gn0<T> gn0Var = this.e;
            sk9.a aVar = sk9.b;
            gn0Var.resumeWith(sk9.b(vk9.a(((il1) t0).a)));
            return;
        }
        gn0<T> gn0Var2 = this.e;
        sk9.a aVar2 = sk9.b;
        gn0Var2.resumeWith(sk9.b(w95.h(t0)));
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
        R(th);
        return Unit.a;
    }
}
