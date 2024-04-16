package com.dodopizza.kustoworker;

import com.dodopizza.kustoworker.CommonUtils;
import com.dodopizza.kustoworker.KustoBuffer;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: KustoInitialized.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/dodopizza/kustoworker/CommonUtils$Done;", "it", "Loz3;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
@nn2(c = "com.dodopizza.kustoworker.InitializedKustoImpl$initSenderStream$2", f = "KustoInitialized.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class InitializedKustoImpl$initSenderStream$2 extends f3b implements Function2<CommonUtils.Done, cv1<? super oz3<? extends CommonUtils.Done>>, Object> {
    int label;
    final /* synthetic */ InitializedKustoImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: KustoInitialized.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "event", "Lcom/dodopizza/kustoworker/KustoMessage;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 2})
    @nn2(c = "com.dodopizza.kustoworker.InitializedKustoImpl$initSenderStream$2$2", f = "KustoInitialized.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.dodopizza.kustoworker.InitializedKustoImpl$initSenderStream$2$2  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass2 extends f3b implements Function2<KustoMessage, cv1<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        AnonymousClass2(cv1 cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            z65.h(cv1Var, "completion");
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(cv1Var);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KustoMessage kustoMessage, cv1<? super Unit> cv1Var) {
            return ((AnonymousClass2) create(kustoMessage, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.label == 0) {
                vk9.b(obj);
                InitializedKustoImpl initializedKustoImpl = InitializedKustoImpl$initSenderStream$2.this.this$0;
                initializedKustoImpl.writeDebugLog("Message " + ((KustoMessage) this.L$0).getMeta().getId() + " enqueued in buffer");
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: KustoInitialized.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0086@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "Lcom/dodopizza/kustoworker/KustoMessage;", "p1", "Loz3;", "Lcom/dodopizza/kustoworker/CommonUtils$Done;", "invoke", "(Ljava/util/List;Lcv1;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
    /* renamed from: com.dodopizza.kustoworker.InitializedKustoImpl$initSenderStream$2$3  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final /* synthetic */ class AnonymousClass3 extends j6 implements Function2<List<? extends KustoMessage>, cv1<? super oz3<? extends CommonUtils.Done>>, Object> {
        AnonymousClass3(InitializedKustoImpl initializedKustoImpl) {
            super(2, initializedKustoImpl, InitializedKustoImpl.class, "sendWithConfirmation", "sendWithConfirmation(Ljava/util/List;)Lkotlinx/coroutines/flow/Flow;", 4);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(List<? extends KustoMessage> list, cv1<? super oz3<? extends CommonUtils.Done>> cv1Var) {
            return invoke2((List<KustoMessage>) list, (cv1<? super oz3<CommonUtils.Done>>) cv1Var);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Object invoke2(List<KustoMessage> list, cv1<? super oz3<CommonUtils.Done>> cv1Var) {
            oz3 sendWithConfirmation;
            sendWithConfirmation = ((InitializedKustoImpl) this.receiver).sendWithConfirmation(list);
            return sendWithConfirmation;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializedKustoImpl$initSenderStream$2(InitializedKustoImpl initializedKustoImpl, cv1 cv1Var) {
        super(2, cv1Var);
        this.this$0 = initializedKustoImpl;
    }

    @Override // defpackage.e70
    public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
        z65.h(cv1Var, "completion");
        return new InitializedKustoImpl$initSenderStream$2(this.this$0, cv1Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CommonUtils.Done done, cv1<? super oz3<? extends CommonUtils.Done>> cv1Var) {
        return ((InitializedKustoImpl$initSenderStream$2) create(done, cv1Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.e70
    public final Object invokeSuspend(Object obj) {
        KustoPubSub kustoPubSub;
        Object i;
        int i2;
        long j;
        c75.d();
        if (this.label == 0) {
            vk9.b(obj);
            this.this$0.writeDebugLog("Init sender stream");
            KustoBuffer.Companion companion = KustoBuffer.Companion;
            kustoPubSub = this.this$0.kustoPubSub;
            i = g86.i(kustoPubSub.getChannels(), Channel.Sender);
            final sha c = wz3.c((cr6) i);
            final oz3<Object> oz3Var = new oz3<Object>() { // from class: com.dodopizza.kustoworker.InitializedKustoImpl$initSenderStream$2$invokeSuspend$$inlined$subscribe$1

                /* compiled from: Collect.kt */
                @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lpz3;", "value", "", "emit", "(Ljava/lang/Object;Lcv1;)Ljava/lang/Object;", "kotlinx-coroutines-core", "com/dodopizza/kustoworker/InitializedKustoImpl$initSenderStream$2$subscribe$$inlined$filterIsInstance$1$2"}, k = 1, mv = {1, 4, 2})
                /* renamed from: com.dodopizza.kustoworker.InitializedKustoImpl$initSenderStream$2$invokeSuspend$$inlined$subscribe$1$2  reason: invalid class name */
                /* loaded from: classes2.dex */
                public static final class AnonymousClass2 implements pz3<Object> {
                    final /* synthetic */ pz3 $this_unsafeFlow$inlined;

                    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 2}, xi = 48)
                    @nn2(c = "com.dodopizza.kustoworker.InitializedKustoImpl$initSenderStream$2$invokeSuspend$$inlined$subscribe$1$2", f = "KustoInitialized.kt", l = {137}, m = "emit")
                    /* renamed from: com.dodopizza.kustoworker.InitializedKustoImpl$initSenderStream$2$invokeSuspend$$inlined$subscribe$1$2$1  reason: invalid class name */
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
                            boolean r0 = r6 instanceof com.dodopizza.kustoworker.InitializedKustoImpl$initSenderStream$2$invokeSuspend$$inlined$subscribe$1.AnonymousClass2.AnonymousClass1
                            if (r0 == 0) goto L13
                            r0 = r6
                            com.dodopizza.kustoworker.InitializedKustoImpl$initSenderStream$2$invokeSuspend$$inlined$subscribe$1$2$1 r0 = (com.dodopizza.kustoworker.InitializedKustoImpl$initSenderStream$2$invokeSuspend$$inlined$subscribe$1.AnonymousClass2.AnonymousClass1) r0
                            int r1 = r0.label
                            r2 = -2147483648(0xffffffff80000000, float:-0.0)
                            r3 = r1 & r2
                            if (r3 == 0) goto L13
                            int r1 = r1 - r2
                            r0.label = r1
                            goto L18
                        L13:
                            com.dodopizza.kustoworker.InitializedKustoImpl$initSenderStream$2$invokeSuspend$$inlined$subscribe$1$2$1 r0 = new com.dodopizza.kustoworker.InitializedKustoImpl$initSenderStream$2$invokeSuspend$$inlined$subscribe$1$2$1
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
                        throw new UnsupportedOperationException("Method not decompiled: com.dodopizza.kustoworker.InitializedKustoImpl$initSenderStream$2$invokeSuspend$$inlined$subscribe$1.AnonymousClass2.emit(java.lang.Object, cv1):java.lang.Object");
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
            oz3 F = wz3.F(new oz3<KustoMessage>() { // from class: com.dodopizza.kustoworker.InitializedKustoImpl$initSenderStream$2$invokeSuspend$$inlined$map$1

                /* compiled from: Collect.kt */
                @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lpz3;", "value", "", "emit", "(Ljava/lang/Object;Lcv1;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 4, 2})
                /* renamed from: com.dodopizza.kustoworker.InitializedKustoImpl$initSenderStream$2$invokeSuspend$$inlined$map$1$2  reason: invalid class name */
                /* loaded from: classes2.dex */
                public static final class AnonymousClass2 implements pz3<MessageReceived> {
                    final /* synthetic */ pz3 $this_unsafeFlow$inlined;

                    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 2}, xi = 48)
                    @nn2(c = "com.dodopizza.kustoworker.InitializedKustoImpl$initSenderStream$2$invokeSuspend$$inlined$map$1$2", f = "KustoInitialized.kt", l = {137}, m = "emit")
                    /* renamed from: com.dodopizza.kustoworker.InitializedKustoImpl$initSenderStream$2$invokeSuspend$$inlined$map$1$2$1  reason: invalid class name */
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
                            boolean r0 = r6 instanceof com.dodopizza.kustoworker.InitializedKustoImpl$initSenderStream$2$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1
                            if (r0 == 0) goto L13
                            r0 = r6
                            com.dodopizza.kustoworker.InitializedKustoImpl$initSenderStream$2$invokeSuspend$$inlined$map$1$2$1 r0 = (com.dodopizza.kustoworker.InitializedKustoImpl$initSenderStream$2$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                            int r1 = r0.label
                            r2 = -2147483648(0xffffffff80000000, float:-0.0)
                            r3 = r1 & r2
                            if (r3 == 0) goto L13
                            int r1 = r1 - r2
                            r0.label = r1
                            goto L18
                        L13:
                            com.dodopizza.kustoworker.InitializedKustoImpl$initSenderStream$2$invokeSuspend$$inlined$map$1$2$1 r0 = new com.dodopizza.kustoworker.InitializedKustoImpl$initSenderStream$2$invokeSuspend$$inlined$map$1$2$1
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
                        throw new UnsupportedOperationException("Method not decompiled: com.dodopizza.kustoworker.InitializedKustoImpl$initSenderStream$2$invokeSuspend$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, cv1):java.lang.Object");
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
            }, new AnonymousClass2(null));
            i2 = this.this$0.maxBatchSize;
            j = this.this$0.throttleInterval;
            return wz3.x(companion.bufferedChunks(F, i2, j), new AnonymousClass3(this.this$0));
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
