package defpackage;

import com.huawei.hms.push.e;
import kotlin.Metadata;
import kotlin.Unit;
/* compiled from: JobSupport.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002R\u0018\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lx61;", "Lm95;", "", "cause", "", "R", "Lgn0;", e.a, "Lgn0;", "child", "<init>", "(Lgn0;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* renamed from: x61  reason: default package */
/* loaded from: classes3.dex */
public final class x61 extends m95 {
    public final gn0<?> e;

    public x61(gn0<?> gn0Var) {
        this.e = gn0Var;
    }

    @Override // defpackage.wl1
    public void R(Throwable th) {
        gn0<?> gn0Var = this.e;
        gn0Var.D(gn0Var.r(S()));
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
        R(th);
        return Unit.a;
    }
}
