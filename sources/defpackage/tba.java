package defpackage;

import com.appsflyer.AppsFlyerProperties;
import kotlin.Metadata;
import kotlin.Unit;
/* compiled from: SendingCollector.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Ltba;", "T", "Lpz3;", "value", "", "emit", "(Ljava/lang/Object;Lcv1;)Ljava/lang/Object;", "Llba;", "a", "Llba;", AppsFlyerProperties.CHANNEL, "<init>", "(Llba;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* renamed from: tba  reason: default package */
/* loaded from: classes3.dex */
public final class tba<T> implements pz3<T> {
    private final lba<T> a;

    /* JADX WARN: Multi-variable type inference failed */
    public tba(lba<? super T> lbaVar) {
        this.a = lbaVar;
    }

    @Override // defpackage.pz3
    public Object emit(T t, cv1<? super Unit> cv1Var) {
        Object d;
        Object p = this.a.p(t, cv1Var);
        d = c75.d();
        if (p == d) {
            return p;
        }
        return Unit.a;
    }
}
