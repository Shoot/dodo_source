package com.dodopizza.kustoworker;

import com.appsflyer.AppsFlyerProperties;
import kotlin.Metadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: KustoPubSub.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0086@"}, d2 = {"Lcom/dodopizza/kustoworker/Channel;", AppsFlyerProperties.CHANNEL, "Lcom/dodopizza/kustoworker/KustoEvent;", "event", "Lcv1;", "Lcom/dodopizza/kustoworker/CommonUtils$Done;", "continuation", "", "publish"}, k = 3, mv = {1, 4, 2})
@nn2(c = "com.dodopizza.kustoworker.KustoPubSub", f = "KustoPubSub.kt", l = {39}, m = "publish")
/* loaded from: classes2.dex */
public final class KustoPubSub$publish$1 extends ev1 {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ KustoPubSub this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KustoPubSub$publish$1(KustoPubSub kustoPubSub, cv1 cv1Var) {
        super(cv1Var);
        this.this$0 = kustoPubSub;
    }

    @Override // defpackage.e70
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.publish(null, null, this);
    }
}
