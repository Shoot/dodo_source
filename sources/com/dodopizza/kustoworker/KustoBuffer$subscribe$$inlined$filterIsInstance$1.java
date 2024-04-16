package com.dodopizza.kustoworker;

import kotlin.Metadata;
import kotlin.Unit;
/* compiled from: SafeCollector.common.kt */
@Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Loz3;", "Lpz3;", "collector", "", "collect", "(Lpz3;Lcv1;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes2.dex */
public final class KustoBuffer$subscribe$$inlined$filterIsInstance$1 implements oz3<Object> {
    final /* synthetic */ oz3 $this_unsafeTransform$inlined;

    /* compiled from: Collect.kt */
    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lpz3;", "value", "", "emit", "(Ljava/lang/Object;Lcv1;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 4, 2})
    /* renamed from: com.dodopizza.kustoworker.KustoBuffer$subscribe$$inlined$filterIsInstance$1$2  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass2 implements pz3<Object> {
        final /* synthetic */ pz3 $this_unsafeFlow$inlined;

        @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 2}, xi = 48)
        @nn2(c = "com.dodopizza.kustoworker.KustoBuffer$subscribe$$inlined$filterIsInstance$1$2", f = "KustoPubSub.kt", l = {137}, m = "emit")
        /* renamed from: com.dodopizza.kustoworker.KustoBuffer$subscribe$$inlined$filterIsInstance$1$2$1  reason: invalid class name */
        /* loaded from: classes2.dex */
        public static final class AnonymousClass1 extends ev1 {
            Object L$0;
            Object L$1;
            int label;
            /* synthetic */ Object result;

            public AnonymousClass1(cv1 cv1Var) {
                super(cv1Var);
            }

            @Override // defpackage.e70
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return AnonymousClass2.this.emit(null, this);
            }
        }

        public AnonymousClass2(pz3 pz3Var) {
            this.$this_unsafeFlow$inlined = pz3Var;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
        @Override // defpackage.pz3
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object emit(java.lang.Object r6, defpackage.cv1 r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof com.dodopizza.kustoworker.KustoBuffer$subscribe$$inlined$filterIsInstance$1.AnonymousClass2.AnonymousClass1
                if (r0 == 0) goto L13
                r0 = r7
                com.dodopizza.kustoworker.KustoBuffer$subscribe$$inlined$filterIsInstance$1$2$1 r0 = (com.dodopizza.kustoworker.KustoBuffer$subscribe$$inlined$filterIsInstance$1.AnonymousClass2.AnonymousClass1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                com.dodopizza.kustoworker.KustoBuffer$subscribe$$inlined$filterIsInstance$1$2$1 r0 = new com.dodopizza.kustoworker.KustoBuffer$subscribe$$inlined$filterIsInstance$1$2$1
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.result
                java.lang.Object r1 = defpackage.a75.d()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                defpackage.vk9.b(r7)
                goto L49
            L29:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L31:
                defpackage.vk9.b(r7)
                pz3 r7 = r5.$this_unsafeFlow$inlined
                r2 = 3
                java.lang.String r4 = "T"
                defpackage.z65.n(r2, r4)
                boolean r2 = r6 instanceof java.lang.Object
                if (r2 == 0) goto L49
                r0.label = r3
                java.lang.Object r6 = r7.emit(r6, r0)
                if (r6 != r1) goto L49
                return r1
            L49:
                kotlin.Unit r6 = kotlin.Unit.a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dodopizza.kustoworker.KustoBuffer$subscribe$$inlined$filterIsInstance$1.AnonymousClass2.emit(java.lang.Object, cv1):java.lang.Object");
        }

        public Object emit$$forInline(Object obj, cv1 cv1Var) {
            d35.a(4);
            new AnonymousClass1(cv1Var);
            d35.a(5);
            pz3 pz3Var = this.$this_unsafeFlow$inlined;
            z65.n(3, "T");
            if (obj instanceof Object) {
                d35.a(0);
                pz3Var.emit(obj, cv1Var);
                d35.a(1);
            }
            return Unit.a;
        }
    }

    public KustoBuffer$subscribe$$inlined$filterIsInstance$1(oz3 oz3Var) {
        this.$this_unsafeTransform$inlined = oz3Var;
    }

    @Override // defpackage.oz3
    public Object collect(pz3<? super Object> pz3Var, cv1 cv1Var) {
        Object d;
        oz3 oz3Var = this.$this_unsafeTransform$inlined;
        z65.m();
        Object collect = oz3Var.collect(new AnonymousClass2(pz3Var), cv1Var);
        d = c75.d();
        if (collect == d) {
            return collect;
        }
        return Unit.a;
    }

    public Object collect$$forInline(pz3 pz3Var, cv1 cv1Var) {
        d35.a(4);
        new ev1(cv1Var) { // from class: com.dodopizza.kustoworker.KustoBuffer$subscribe$$inlined$filterIsInstance$1.1
            int label;
            /* synthetic */ Object result;

            @Override // defpackage.e70
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return KustoBuffer$subscribe$$inlined$filterIsInstance$1.this.collect(null, this);
            }
        };
        d35.a(5);
        oz3 oz3Var = this.$this_unsafeTransform$inlined;
        z65.m();
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(pz3Var);
        d35.a(0);
        oz3Var.collect(anonymousClass2, cv1Var);
        d35.a(1);
        return Unit.a;
    }
}
