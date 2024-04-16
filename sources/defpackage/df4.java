package defpackage;

import kotlin.Metadata;
import kotlin.Unit;
/* compiled from: GetDataAvailabilityInteractor.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002R\u0014\u0010\u0007\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0006¨\u0006\n"}, d2 = {"Ldf4;", "", "Loz3;", "Lvv6;", "a", "Lvc6;", "Lvc6;", "memoryDataSource", "<init>", "(Lvc6;)V", "core_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: df4  reason: default package */
/* loaded from: classes.dex */
public final class df4 {
    private final vc6 a;

    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Loz3;", "Lpz3;", "collector", "", "collect", "(Lpz3;Lcv1;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0})
    /* renamed from: df4$a */
    /* loaded from: classes.dex */
    public static final class a implements oz3<vv6> {
        final /* synthetic */ oz3 a;

        /* compiled from: Emitters.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lcv1;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: df4$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0284a<T> implements pz3 {
            final /* synthetic */ pz3 a;

            /* compiled from: Emitters.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @nn2(c = "com.dodopizza.core.feature.network.presentation.GetDataAvailabilityInteractor$getNetworkAvailabilityState$$inlined$filter$1$2", f = "GetDataAvailabilityInteractor.kt", l = {223}, m = "emit")
            /* renamed from: df4$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0285a extends ev1 {
                /* synthetic */ Object a;
                int b;

                public C0285a(cv1 cv1Var) {
                    super(cv1Var);
                }

                @Override // defpackage.e70
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return C0284a.this.emit(null, this);
                }
            }

            public C0284a(pz3 pz3Var) {
                this.a = pz3Var;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
            @Override // defpackage.pz3
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r6, defpackage.cv1 r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof defpackage.df4.a.C0284a.C0285a
                    if (r0 == 0) goto L13
                    r0 = r7
                    df4$a$a$a r0 = (defpackage.df4.a.C0284a.C0285a) r0
                    int r1 = r0.b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.b = r1
                    goto L18
                L13:
                    df4$a$a$a r0 = new df4$a$a$a
                    r0.<init>(r7)
                L18:
                    java.lang.Object r7 = r0.a
                    java.lang.Object r1 = defpackage.a75.d()
                    int r2 = r0.b
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    defpackage.vk9.b(r7)
                    goto L4a
                L29:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L31:
                    defpackage.vk9.b(r7)
                    pz3 r7 = r5.a
                    r2 = r6
                    vv6 r2 = (defpackage.vv6) r2
                    vv6 r4 = defpackage.vv6.a
                    if (r2 == r4) goto L41
                    vv6 r4 = defpackage.vv6.b
                    if (r2 != r4) goto L4a
                L41:
                    r0.b = r3
                    java.lang.Object r6 = r7.emit(r6, r0)
                    if (r6 != r1) goto L4a
                    return r1
                L4a:
                    kotlin.Unit r6 = kotlin.Unit.a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.df4.a.C0284a.emit(java.lang.Object, cv1):java.lang.Object");
            }
        }

        public a(oz3 oz3Var) {
            this.a = oz3Var;
        }

        @Override // defpackage.oz3
        public Object collect(pz3<? super vv6> pz3Var, cv1 cv1Var) {
            Object d;
            Object collect = this.a.collect(new C0284a(pz3Var), cv1Var);
            d = c75.d();
            if (collect == d) {
                return collect;
            }
            return Unit.a;
        }
    }

    public df4(vc6 vc6Var) {
        z65.h(vc6Var, "memoryDataSource");
        this.a = vc6Var;
    }

    public final oz3<vv6> a() {
        return wz3.B(wz3.o(new a(this.a.a())), v33.b());
    }
}
