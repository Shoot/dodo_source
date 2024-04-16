package defpackage;

import com.huawei.hms.push.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Builders.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B4\u0012(\u0010\r\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\bø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007R9\u0010\r\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\b8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u000b\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"Lus9;", "T", "Li1;", "Lpz3;", "collector", "", e.a, "(Lpz3;Lcv1;)Ljava/lang/Object;", "Lkotlin/Function2;", "Lcv1;", "", "a", "Lkotlin/jvm/functions/Function2;", "block", "<init>", "(Lkotlin/jvm/functions/Function2;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* renamed from: us9  reason: default package */
/* loaded from: classes3.dex */
public final class us9<T> extends i1<T> {
    private final Function2<pz3<? super T>, cv1<? super Unit>, Object> a;

    /* JADX WARN: Multi-variable type inference failed */
    public us9(Function2<? super pz3<? super T>, ? super cv1<? super Unit>, ? extends Object> function2) {
        this.a = function2;
    }

    @Override // defpackage.i1
    public Object e(pz3<? super T> pz3Var, cv1<? super Unit> cv1Var) {
        Object d;
        Object invoke = this.a.invoke(pz3Var, cv1Var);
        d = c75.d();
        if (invoke == d) {
            return invoke;
        }
        return Unit.a;
    }
}
