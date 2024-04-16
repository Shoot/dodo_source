package defpackage;

import kotlin.Metadata;
import kotlin.Unit;
/* compiled from: SafeCollector.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\"D\u0010\t\u001a,\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00008\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lkotlin/Function3;", "Lpz3;", "", "Lcv1;", "", "a", "Ly84;", "getEmitFun$annotations", "()V", "emitFun", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* renamed from: rs9  reason: default package */
/* loaded from: classes3.dex */
public final class rs9 {
    private static final y84<pz3<Object>, Object, cv1<? super Unit>, Object> a = (y84) unb.e(a.a, 3);

    /* compiled from: SafeCollector.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* renamed from: rs9$a */
    /* loaded from: classes3.dex */
    /* synthetic */ class a extends m94 implements y84<pz3<? super Object>, Object, cv1<? super Unit>, Object> {
        public static final a a = new a();

        a() {
            super(3, pz3.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // defpackage.y84
        /* renamed from: b */
        public final Object invoke(pz3<Object> pz3Var, Object obj, cv1<? super Unit> cv1Var) {
            return pz3Var.emit(obj, cv1Var);
        }
    }

    public static final /* synthetic */ y84 a() {
        return a;
    }
}
