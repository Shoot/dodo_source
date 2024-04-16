package defpackage;

import com.huawei.hms.push.e;
import kotlin.Metadata;
import kotlin.Unit;
/* compiled from: JobSupport.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Ll43;", "Lu95;", "", "cause", "", "R", "Lf43;", e.a, "Lf43;", "handle", "<init>", "(Lf43;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* renamed from: l43  reason: default package */
/* loaded from: classes3.dex */
public final class l43 extends u95 {
    private final f43 e;

    public l43(f43 f43Var) {
        this.e = f43Var;
    }

    @Override // defpackage.wl1
    public void R(Throwable th) {
        this.e.a();
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
        R(th);
        return Unit.a;
    }
}
