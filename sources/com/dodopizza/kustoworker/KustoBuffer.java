package com.dodopizza.kustoworker;

import com.appsflyer.AppsFlyerProperties;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: KustoBuffer.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0019\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/dodopizza/kustoworker/KustoBuffer;", "", "Lcom/dodopizza/kustoworker/Channel;", AppsFlyerProperties.CHANNEL, "Loz3;", "", "Lcom/dodopizza/kustoworker/KustoMessage;", "consumeMessages", "Lcom/dodopizza/kustoworker/KustoPubSub;", "pubSub", "Lcom/dodopizza/kustoworker/KustoPubSub;", "", "size", "I", "<init>", "(Lcom/dodopizza/kustoworker/KustoPubSub;I)V", "Companion", "kusto-worker_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes2.dex */
public final class KustoBuffer {
    public static final Companion Companion = new Companion(null);
    private final KustoPubSub pubSub;
    private final int size;

    /* compiled from: KustoBuffer.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ8\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b0\u0003\"\b\b\u0000\u0010\u0002*\u00020\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006¨\u0006\f"}, d2 = {"Lcom/dodopizza/kustoworker/KustoBuffer$Companion;", "", "T", "Loz3;", "", "maxChunkSize", "", "throttleInterval", "", "bufferedChunks", "<init>", "()V", "kusto-worker_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ oz3 bufferedChunks$default(Companion companion, oz3 oz3Var, int i, long j, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                j = 5000;
            }
            return companion.bufferedChunks(oz3Var, i, j);
        }

        public final <T> oz3<List<T>> bufferedChunks(oz3<? extends T> oz3Var, int i, long j) {
            z65.h(oz3Var, "$this$bufferedChunks");
            return wz3.z(new KustoBuffer$Companion$bufferedChunks$1(oz3Var, i, j, null));
        }
    }

    public KustoBuffer(KustoPubSub kustoPubSub, int i) {
        z65.h(kustoPubSub, "pubSub");
        this.pubSub = kustoPubSub;
        this.size = i;
    }

    public final oz3<List<KustoMessage>> consumeMessages(Channel channel) {
        Object i;
        z65.h(channel, AppsFlyerProperties.CHANNEL);
        Companion companion = Companion;
        i = g86.i(this.pubSub.getChannels(), channel);
        final sha c = wz3.c((cr6) i);
        final oz3<Object> oz3Var = new oz3<Object>() { // from class: com.dodopizza.kustoworker.KustoBuffer$consumeMessages$$inlined$subscribe$1

            /* compiled from: Collect.kt */
            @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lpz3;", "value", "", "emit", "(Ljava/lang/Object;Lcv1;)Ljava/lang/Object;", "kotlinx-coroutines-core", "com/dodopizza/kustoworker/KustoBuffer$subscribe$$inlined$filterIsInstance$1$2"}, k = 1, mv = {1, 4, 2})
            /* renamed from: com.dodopizza.kustoworker.KustoBuffer$consumeMessages$$inlined$subscribe$1$2  reason: invalid class name */
            /* loaded from: classes2.dex */
            public static final class AnonymousClass2 implements pz3<Object> {
                final /* synthetic */ pz3 $this_unsafeFlow$inlined;

                @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 2}, xi = 48)
                @nn2(c = "com.dodopizza.kustoworker.KustoBuffer$consumeMessages$$inlined$subscribe$1$2", f = "KustoBuffer.kt", l = {137}, m = "emit")
                /* renamed from: com.dodopizza.kustoworker.KustoBuffer$consumeMessages$$inlined$subscribe$1$2$1  reason: invalid class name */
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
                public java.lang.Object emit(java.lang.Object r5, defpackage.cv1 r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof com.dodopizza.kustoworker.KustoBuffer$consumeMessages$$inlined$subscribe$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.dodopizza.kustoworker.KustoBuffer$consumeMessages$$inlined$subscribe$1$2$1 r0 = (com.dodopizza.kustoworker.KustoBuffer$consumeMessages$$inlined$subscribe$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.dodopizza.kustoworker.KustoBuffer$consumeMessages$$inlined$subscribe$1$2$1 r0 = new com.dodopizza.kustoworker.KustoBuffer$consumeMessages$$inlined$subscribe$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = defpackage.a75.d()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        defpackage.vk9.b(r6)
                        goto L43
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        defpackage.vk9.b(r6)
                        pz3 r6 = r4.$this_unsafeFlow$inlined
                        boolean r2 = r5 instanceof com.dodopizza.kustoworker.MessageReceived
                        if (r2 == 0) goto L43
                        r0.label = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L43
                        return r1
                    L43:
                        kotlin.Unit r5 = kotlin.Unit.a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.dodopizza.kustoworker.KustoBuffer$consumeMessages$$inlined$subscribe$1.AnonymousClass2.emit(java.lang.Object, cv1):java.lang.Object");
                }
            }

            @Override // defpackage.oz3
            public Object collect(pz3<? super Object> pz3Var, cv1 cv1Var) {
                Object d;
                Object collect = oz3.this.collect(new AnonymousClass2(pz3Var), cv1Var);
                d = c75.d();
                if (collect == d) {
                    return collect;
                }
                return Unit.a;
            }
        };
        return Companion.bufferedChunks$default(companion, new oz3<KustoMessage>() { // from class: com.dodopizza.kustoworker.KustoBuffer$consumeMessages$$inlined$map$1

            /* compiled from: Collect.kt */
            @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lpz3;", "value", "", "emit", "(Ljava/lang/Object;Lcv1;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 4, 2})
            /* renamed from: com.dodopizza.kustoworker.KustoBuffer$consumeMessages$$inlined$map$1$2  reason: invalid class name */
            /* loaded from: classes2.dex */
            public static final class AnonymousClass2 implements pz3<MessageReceived> {
                final /* synthetic */ pz3 $this_unsafeFlow$inlined;

                @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 2}, xi = 48)
                @nn2(c = "com.dodopizza.kustoworker.KustoBuffer$consumeMessages$$inlined$map$1$2", f = "KustoBuffer.kt", l = {137}, m = "emit")
                /* renamed from: com.dodopizza.kustoworker.KustoBuffer$consumeMessages$$inlined$map$1$2$1  reason: invalid class name */
                /* loaded from: classes2.dex */
                public static final class AnonymousClass1 extends ev1 {
                    Object L$0;
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
                public java.lang.Object emit(com.dodopizza.kustoworker.MessageReceived r5, defpackage.cv1 r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof com.dodopizza.kustoworker.KustoBuffer$consumeMessages$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.dodopizza.kustoworker.KustoBuffer$consumeMessages$$inlined$map$1$2$1 r0 = (com.dodopizza.kustoworker.KustoBuffer$consumeMessages$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.dodopizza.kustoworker.KustoBuffer$consumeMessages$$inlined$map$1$2$1 r0 = new com.dodopizza.kustoworker.KustoBuffer$consumeMessages$$inlined$map$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = defpackage.a75.d()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        defpackage.vk9.b(r6)
                        goto L45
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        defpackage.vk9.b(r6)
                        pz3 r6 = r4.$this_unsafeFlow$inlined
                        com.dodopizza.kustoworker.MessageReceived r5 = (com.dodopizza.kustoworker.MessageReceived) r5
                        com.dodopizza.kustoworker.KustoMessage r5 = r5.getMessage()
                        r0.label = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L45
                        return r1
                    L45:
                        kotlin.Unit r5 = kotlin.Unit.a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.dodopizza.kustoworker.KustoBuffer$consumeMessages$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, cv1):java.lang.Object");
                }
            }

            @Override // defpackage.oz3
            public Object collect(pz3<? super KustoMessage> pz3Var, cv1 cv1Var) {
                Object d;
                Object collect = oz3.this.collect(new AnonymousClass2(pz3Var), cv1Var);
                d = c75.d();
                if (collect == d) {
                    return collect;
                }
                return Unit.a;
            }
        }, this.size, 0L, 2, null);
    }

    public /* synthetic */ KustoBuffer(KustoPubSub kustoPubSub, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(kustoPubSub, (i2 & 2) != 0 ? 10 : i);
    }
}
