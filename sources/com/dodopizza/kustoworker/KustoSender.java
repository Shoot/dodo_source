package com.dodopizza.kustoworker;

import com.dodopizza.kustoworker.client.KustoClient;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
/* compiled from: KustoSender.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/dodopizza/kustoworker/KustoSender;", "", "kustoClient", "Lcom/dodopizza/kustoworker/client/KustoClient;", "(Lcom/dodopizza/kustoworker/client/KustoClient;)V", "sendMessages", "Lcom/dodopizza/kustoworker/MessagesSent;", "messages", "", "Lcom/dodopizza/kustoworker/KustoMessage;", "kusto-worker_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes2.dex */
public final class KustoSender {
    private final KustoClient kustoClient;

    public KustoSender(KustoClient kustoClient) {
        z65.h(kustoClient, "kustoClient");
        this.kustoClient = kustoClient;
    }

    public final MessagesSent sendMessages(List<KustoMessage> list) {
        int w;
        int w2;
        z65.h(list, "messages");
        List<KustoMessage> list2 = list;
        w = lc1.w(list2, 10);
        ArrayList arrayList = new ArrayList(w);
        for (KustoMessage kustoMessage : list2) {
            arrayList.add(kustoMessage.getData());
        }
        this.kustoClient.sendRequest(new KustoClient.KustoRequest(arrayList));
        w2 = lc1.w(list2, 10);
        ArrayList arrayList2 = new ArrayList(w2);
        for (KustoMessage kustoMessage2 : list2) {
            arrayList2.add(kustoMessage2.getMeta());
        }
        return new MessagesSent(arrayList2);
    }
}
