package defpackage;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Collect.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001b\u0010\u0002\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u0000H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001e\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0006\u001a\u00020\u0005\u001aG\u0010\r\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u00002\"\u0010\f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\tH\u0086@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a1\u0010\u0011\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Loz3;", "", "a", "(Loz3;Lcv1;)Ljava/lang/Object;", "T", "Lqx1;", Action.SCOPE_ATTRIBUTE, "Ll95;", DateTokenConverter.CONVERTER_KEY, "Lkotlin/Function2;", "Lcv1;", "", "action", "b", "(Loz3;Lkotlin/jvm/functions/Function2;Lcv1;)Ljava/lang/Object;", "Lpz3;", "flow", c.a, "(Lpz3;Loz3;Lcv1;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xs = "kotlinx/coroutines/flow/FlowKt")
/* renamed from: zz3  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class zz3 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Collect.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"T", "Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @nn2(c = "kotlinx.coroutines.flow.FlowKt__CollectKt$launchIn$1", f = "Collect.kt", l = {50}, m = "invokeSuspend")
    /* renamed from: zz3$a */
    /* loaded from: classes3.dex */
    public static final class a extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ oz3<T> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(oz3<? extends T> oz3Var, cv1<? super a> cv1Var) {
            super(2, cv1Var);
            this.b = oz3Var;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new a(this.b, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
            return ((a) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            Object d;
            d = c75.d();
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    vk9.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                vk9.b(obj);
                oz3<T> oz3Var = this.b;
                this.a = 1;
                if (wz3.k(oz3Var, this) == d) {
                    return d;
                }
            }
            return Unit.a;
        }
    }

    public static final Object a(oz3<?> oz3Var, cv1<? super Unit> cv1Var) {
        Object d;
        Object collect = oz3Var.collect(g07.a, cv1Var);
        d = c75.d();
        if (collect == d) {
            return collect;
        }
        return Unit.a;
    }

    public static final <T> Object b(oz3<? extends T> oz3Var, Function2<? super T, ? super cv1<? super Unit>, ? extends Object> function2, cv1<? super Unit> cv1Var) {
        oz3 b;
        Object d;
        b = a04.b(wz3.D(oz3Var, function2), 0, null, 2, null);
        Object k = wz3.k(b, cv1Var);
        d = c75.d();
        if (k == d) {
            return k;
        }
        return Unit.a;
    }

    public static final <T> Object c(pz3<? super T> pz3Var, oz3<? extends T> oz3Var, cv1<? super Unit> cv1Var) {
        Object d;
        wz3.s(pz3Var);
        Object collect = oz3Var.collect(pz3Var, cv1Var);
        d = c75.d();
        if (collect == d) {
            return collect;
        }
        return Unit.a;
    }

    public static final <T> l95 d(oz3<? extends T> oz3Var, qx1 qx1Var) {
        l95 d;
        d = sh0.d(qx1Var, null, null, new a(oz3Var, null), 3, null);
        return d;
    }
}
