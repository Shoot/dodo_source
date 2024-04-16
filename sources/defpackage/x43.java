package defpackage;

import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Distinct.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002BI\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000b\u0012\u001c\u0010\u0014\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\"\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR*\u0010\u0014\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\u00110\u00108\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"Lx43;", "T", "Loz3;", "Lpz3;", "collector", "", "collect", "(Lpz3;Lcv1;)Ljava/lang/Object;", "a", "Loz3;", "upstream", "Lkotlin/Function1;", "", "b", "Lkotlin/jvm/functions/Function1;", "keySelector", "Lkotlin/Function2;", "", c.a, "Lkotlin/jvm/functions/Function2;", "areEquivalent", "<init>", "(Loz3;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* renamed from: x43  reason: default package */
/* loaded from: classes3.dex */
public final class x43<T> implements oz3<T> {
    private final oz3<T> a;
    public final Function1<T, Object> b;
    public final Function2<Object, Object, Boolean> c;

    /* compiled from: Distinct.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "value", "", "emit", "(Ljava/lang/Object;Lcv1;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* renamed from: x43$a */
    /* loaded from: classes3.dex */
    static final class a<T> implements pz3 {
        final /* synthetic */ x43<T> a;
        final /* synthetic */ ea9<Object> b;
        final /* synthetic */ pz3<T> c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Distinct.kt */
        @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
        @nn2(c = "kotlinx.coroutines.flow.DistinctFlowImpl$collect$2", f = "Distinct.kt", l = {81}, m = "emit")
        /* renamed from: x43$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0734a extends ev1 {
            /* synthetic */ Object a;
            final /* synthetic */ a<T> b;
            int c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0734a(a<? super T> aVar, cv1<? super C0734a> cv1Var) {
                super(cv1Var);
                this.b = aVar;
            }

            @Override // defpackage.e70
            public final Object invokeSuspend(Object obj) {
                this.a = obj;
                this.c |= Integer.MIN_VALUE;
                return this.b.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        a(x43<T> x43Var, ea9<Object> ea9Var, pz3<? super T> pz3Var) {
            this.a = x43Var;
            this.b = ea9Var;
            this.c = pz3Var;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
        @Override // defpackage.pz3
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(T r6, defpackage.cv1<? super kotlin.Unit> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof defpackage.x43.a.C0734a
                if (r0 == 0) goto L13
                r0 = r7
                x43$a$a r0 = (defpackage.x43.a.C0734a) r0
                int r1 = r0.c
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.c = r1
                goto L18
            L13:
                x43$a$a r0 = new x43$a$a
                r0.<init>(r5, r7)
            L18:
                java.lang.Object r7 = r0.a
                java.lang.Object r1 = defpackage.a75.d()
                int r2 = r0.c
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                defpackage.vk9.b(r7)
                goto L67
            L29:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L31:
                defpackage.vk9.b(r7)
                x43<T> r7 = r5.a
                kotlin.jvm.functions.Function1<T, java.lang.Object> r7 = r7.b
                java.lang.Object r7 = r7.invoke(r6)
                ea9<java.lang.Object> r2 = r5.b
                T r2 = r2.a
                r3b r4 = defpackage.t37.a
                if (r2 == r4) goto L58
                x43<T> r4 = r5.a
                kotlin.jvm.functions.Function2<java.lang.Object, java.lang.Object, java.lang.Boolean> r4 = r4.c
                java.lang.Object r2 = r4.invoke(r2, r7)
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                boolean r2 = r2.booleanValue()
                if (r2 != 0) goto L55
                goto L58
            L55:
                kotlin.Unit r6 = kotlin.Unit.a
                return r6
            L58:
                ea9<java.lang.Object> r2 = r5.b
                r2.a = r7
                pz3<T> r7 = r5.c
                r0.c = r3
                java.lang.Object r6 = r7.emit(r6, r0)
                if (r6 != r1) goto L67
                return r1
            L67:
                kotlin.Unit r6 = kotlin.Unit.a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.x43.a.emit(java.lang.Object, cv1):java.lang.Object");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public x43(oz3<? extends T> oz3Var, Function1<? super T, ? extends Object> function1, Function2<Object, Object, Boolean> function2) {
        this.a = oz3Var;
        this.b = function1;
        this.c = function2;
    }

    @Override // defpackage.oz3
    public Object collect(pz3<? super T> pz3Var, cv1<? super Unit> cv1Var) {
        Object d;
        ea9 ea9Var = new ea9();
        ea9Var.a = (T) t37.a;
        Object collect = this.a.collect(new a(this, ea9Var, pz3Var), cv1Var);
        d = c75.d();
        if (collect == d) {
            return collect;
        }
        return Unit.a;
    }
}
