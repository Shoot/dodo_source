package com.dodopizza.kustoworker;

import com.dodopizza.kustoworker.CommonUtils;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: KustoInitialized.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0086@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/dodopizza/kustoworker/KustoEvent;", "p1", "Loz3;", "Lcom/dodopizza/kustoworker/CommonUtils$Done;", "invoke", "(Lcom/dodopizza/kustoworker/KustoEvent;Lcv1;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* loaded from: classes2.dex */
public final /* synthetic */ class InitializedKustoImpl$initStorageStream$1 extends j6 implements Function2<KustoEvent, cv1<? super oz3<? extends CommonUtils.Done>>, Object> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public InitializedKustoImpl$initStorageStream$1(InitializedKustoImpl initializedKustoImpl) {
        super(2, initializedKustoImpl, InitializedKustoImpl.class, "handleStorageEvent", "handleStorageEvent(Lcom/dodopizza/kustoworker/KustoEvent;)Lkotlinx/coroutines/flow/Flow;", 4);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(KustoEvent kustoEvent, cv1<? super oz3<? extends CommonUtils.Done>> cv1Var) {
        return invoke2(kustoEvent, (cv1<? super oz3<CommonUtils.Done>>) cv1Var);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(KustoEvent kustoEvent, cv1<? super oz3<CommonUtils.Done>> cv1Var) {
        oz3 handleStorageEvent;
        handleStorageEvent = ((InitializedKustoImpl) this.receiver).handleStorageEvent(kustoEvent);
        return handleStorageEvent;
    }
}
