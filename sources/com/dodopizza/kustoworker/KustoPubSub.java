package com.dodopizza.kustoworker;

import com.appsflyer.AppsFlyerProperties;
import com.dodopizza.kustoworker.CommonUtils;
import java.util.Map;
import kotlin.Metadata;
/* compiled from: KustoPubSub.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002J#\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\n\b\u0000\u0010\u0007\u0018\u0001*\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\bJ#\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0005H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0005H\u0086@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eR)\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00100\u000f8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"Lcom/dodopizza/kustoworker/KustoPubSub;", "", "Lcom/dodopizza/kustoworker/Channel;", AppsFlyerProperties.CHANNEL, "Loz3;", "Lcom/dodopizza/kustoworker/KustoEvent;", "subscribeAll", "T", "subscribe", "event", "Lcom/dodopizza/kustoworker/CommonUtils$Done;", "publish", "(Lcom/dodopizza/kustoworker/Channel;Lcom/dodopizza/kustoworker/KustoEvent;Lcv1;)Ljava/lang/Object;", "publishStorageStream", "(Lcom/dodopizza/kustoworker/KustoEvent;Lcv1;)Ljava/lang/Object;", "", "Lcr6;", "channels", "Ljava/util/Map;", "getChannels", "()Ljava/util/Map;", "<init>", "()V", "kusto-worker_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes2.dex */
public final class KustoPubSub {
    private final Map<Channel, cr6<KustoEvent>> channels;

    public KustoPubSub() {
        Map<Channel, cr6<KustoEvent>> k;
        Channel channel = Channel.Sender;
        zg0 zg0Var = zg0.SUSPEND;
        k = g86.k(lnb.a(channel, uha.a(0, 100, zg0Var)), lnb.a(Channel.Storage, uha.a(0, 100, zg0Var)));
        this.channels = k;
    }

    public final Map<Channel, cr6<KustoEvent>> getChannels() {
        return this.channels;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object publish(com.dodopizza.kustoworker.Channel r5, com.dodopizza.kustoworker.KustoEvent r6, defpackage.cv1<? super com.dodopizza.kustoworker.CommonUtils.Done> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.dodopizza.kustoworker.KustoPubSub$publish$1
            if (r0 == 0) goto L13
            r0 = r7
            com.dodopizza.kustoworker.KustoPubSub$publish$1 r0 = (com.dodopizza.kustoworker.KustoPubSub$publish$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.dodopizza.kustoworker.KustoPubSub$publish$1 r0 = new com.dodopizza.kustoworker.KustoPubSub$publish$1
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = defpackage.a75.d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            defpackage.vk9.b(r7)
            goto L45
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.vk9.b(r7)
            java.util.Map<com.dodopizza.kustoworker.Channel, cr6<com.dodopizza.kustoworker.KustoEvent>> r7 = r4.channels
            java.lang.Object r5 = defpackage.d86.i(r7, r5)
            cr6 r5 = (defpackage.cr6) r5
            r0.label = r3
            java.lang.Object r5 = r5.emit(r6, r0)
            if (r5 != r1) goto L45
            return r1
        L45:
            kotlin.Unit r5 = kotlin.Unit.a
            com.dodopizza.kustoworker.CommonUtils$Done r5 = com.dodopizza.kustoworker.CommonUtils.Done.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dodopizza.kustoworker.KustoPubSub.publish(com.dodopizza.kustoworker.Channel, com.dodopizza.kustoworker.KustoEvent, cv1):java.lang.Object");
    }

    public final Object publishStorageStream(KustoEvent kustoEvent, cv1<? super CommonUtils.Done> cv1Var) {
        return publish(Channel.Storage, kustoEvent, cv1Var);
    }

    public final /* synthetic */ <T extends KustoEvent> oz3<T> subscribe(Channel channel) {
        Object i;
        z65.h(channel, AppsFlyerProperties.CHANNEL);
        i = g86.i(getChannels(), channel);
        sha c = wz3.c((cr6) i);
        z65.m();
        return new KustoPubSub$subscribe$$inlined$filterIsInstance$1(c);
    }

    public final oz3<KustoEvent> subscribeAll(Channel channel) {
        Object i;
        z65.h(channel, AppsFlyerProperties.CHANNEL);
        i = g86.i(this.channels, channel);
        return wz3.c((cr6) i);
    }
}
