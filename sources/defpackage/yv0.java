package defpackage;

import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.e;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: ChannelFlow.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0002B3\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0013\u0010\u0014J&\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0014J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0016J!\u0010\u0010\u001a\u00020\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0094@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Lyv0;", "T", "Lxv0;", "Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "capacity", "Lzg0;", "onBufferOverflow", "Luv0;", "i", "Loz3;", "j", "Lpz3;", "collector", "", "q", "(Lpz3;Lcv1;)Ljava/lang/Object;", "flow", "<init>", "(Loz3;Lkotlin/coroutines/CoroutineContext;ILzg0;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* renamed from: yv0  reason: default package */
/* loaded from: classes3.dex */
public final class yv0<T> extends xv0<T, T> {
    public /* synthetic */ yv0(oz3 oz3Var, CoroutineContext coroutineContext, int i, zg0 zg0Var, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(oz3Var, (i2 & 2) != 0 ? e.a : coroutineContext, (i2 & 4) != 0 ? -3 : i, (i2 & 8) != 0 ? zg0.SUSPEND : zg0Var);
    }

    @Override // defpackage.uv0
    protected uv0<T> i(CoroutineContext coroutineContext, int i, zg0 zg0Var) {
        return new yv0(this.d, coroutineContext, i, zg0Var);
    }

    @Override // defpackage.uv0
    public oz3<T> j() {
        return (oz3<T>) this.d;
    }

    @Override // defpackage.xv0
    protected Object q(pz3<? super T> pz3Var, cv1<? super Unit> cv1Var) {
        Object d;
        Object collect = this.d.collect(pz3Var, cv1Var);
        d = c75.d();
        if (collect == d) {
            return collect;
        }
        return Unit.a;
    }

    public yv0(oz3<? extends T> oz3Var, CoroutineContext coroutineContext, int i, zg0 zg0Var) {
        super(oz3Var, coroutineContext, i, zg0Var);
    }
}
