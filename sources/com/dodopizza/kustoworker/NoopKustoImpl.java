package com.dodopizza.kustoworker;

import kotlin.Metadata;
/* compiled from: KustoInitialized.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/dodopizza/kustoworker/NoopKustoImpl;", "Lcom/dodopizza/kustoworker/Kusto;", "()V", "sendMessage", "", "message", "Lcom/dodopizza/kustoworker/KustoMessage;", "kusto-worker_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes2.dex */
public final class NoopKustoImpl implements Kusto {
    public static final NoopKustoImpl INSTANCE = new NoopKustoImpl();

    private NoopKustoImpl() {
    }

    @Override // com.dodopizza.kustoworker.Kusto
    public void sendMessage(KustoMessage kustoMessage) {
        z65.h(kustoMessage, "message");
    }
}
