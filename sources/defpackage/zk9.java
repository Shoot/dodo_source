package defpackage;

import com.huawei.hms.push.e;
import defpackage.sk9;
import kotlin.Metadata;
import kotlin.Unit;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: JobSupport.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lzk9;", "Lu95;", "", "cause", "", "R", "Lcv1;", e.a, "Lcv1;", "continuation", "<init>", "(Lcv1;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* renamed from: zk9  reason: default package */
/* loaded from: classes3.dex */
public final class zk9 extends u95 {
    private final cv1<Unit> e;

    /* JADX WARN: Multi-variable type inference failed */
    public zk9(cv1<? super Unit> cv1Var) {
        this.e = cv1Var;
    }

    @Override // defpackage.wl1
    public void R(Throwable th) {
        cv1<Unit> cv1Var = this.e;
        sk9.a aVar = sk9.b;
        cv1Var.resumeWith(sk9.b(Unit.a));
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
        R(th);
        return Unit.a;
    }
}
