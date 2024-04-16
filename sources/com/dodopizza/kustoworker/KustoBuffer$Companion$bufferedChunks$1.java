package com.dodopizza.kustoworker;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: KustoBuffer.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "T", "Lpz3;", "", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
@nn2(c = "com.dodopizza.kustoworker.KustoBuffer$Companion$bufferedChunks$1", f = "KustoBuffer.kt", l = {19}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class KustoBuffer$Companion$bufferedChunks$1<T> extends f3b implements Function2<pz3<? super List<? extends T>>, cv1<? super Unit>, Object> {
    final /* synthetic */ int $maxChunkSize;
    final /* synthetic */ oz3 $this_bufferedChunks;
    final /* synthetic */ long $throttleInterval;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: KustoBuffer.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "T", "Lqx1;", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
    @nn2(c = "com.dodopizza.kustoworker.KustoBuffer$Companion$bufferedChunks$1$1", f = "KustoBuffer.kt", l = {24, 34, 42, 45}, m = "invokeSuspend")
    /* renamed from: com.dodopizza.kustoworker.KustoBuffer$Companion$bufferedChunks$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
        final /* synthetic */ pz3 $this_flow;
        long J$0;
        long J$1;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(pz3 pz3Var, cv1 cv1Var) {
            super(2, cv1Var);
            this.$this_flow = pz3Var;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            z65.h(cv1Var, "completion");
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_flow, cv1Var);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
            return ((AnonymousClass1) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0099 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:18:0x009a  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x00a6  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x00bd  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00ea  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x0107 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:42:0x0108  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x010e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00db -> B:22:0x00b3). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x0108 -> B:43:0x010a). Please submit an issue!!! */
        @Override // defpackage.e70
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r19) {
            /*
                Method dump skipped, instructions count: 273
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dodopizza.kustoworker.KustoBuffer$Companion$bufferedChunks$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KustoBuffer$Companion$bufferedChunks$1(oz3 oz3Var, int i, long j, cv1 cv1Var) {
        super(2, cv1Var);
        this.$this_bufferedChunks = oz3Var;
        this.$maxChunkSize = i;
        this.$throttleInterval = j;
    }

    @Override // defpackage.e70
    public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
        z65.h(cv1Var, "completion");
        KustoBuffer$Companion$bufferedChunks$1 kustoBuffer$Companion$bufferedChunks$1 = new KustoBuffer$Companion$bufferedChunks$1(this.$this_bufferedChunks, this.$maxChunkSize, this.$throttleInterval, cv1Var);
        kustoBuffer$Companion$bufferedChunks$1.L$0 = obj;
        return kustoBuffer$Companion$bufferedChunks$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, cv1<? super Unit> cv1Var) {
        return ((KustoBuffer$Companion$bufferedChunks$1) create(obj, cv1Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.e70
    public final Object invokeSuspend(Object obj) {
        Object d;
        d = c75.d();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                vk9.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            vk9.b(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1((pz3) this.L$0, null);
            this.label = 1;
            if (rx1.e(anonymousClass1, this) == d) {
                return d;
            }
        }
        return Unit.a;
    }
}
