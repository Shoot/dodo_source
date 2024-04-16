package com.dodopizza.kustoworker;

import android.content.Context;
import android.util.Log;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.net.SyslogConstants;
import com.dodopizza.kustoworker.CommonUtils;
import com.dodopizza.kustoworker.client.KustoClient;
import com.dodopizza.kustoworker.session.AppData;
import com.dodopizza.kustoworker.session.SessionData;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: KustoInitialized.kt */
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 @2\u00020\u00012\u00020\u0002:\u0001@B'\u0012\u0006\u0010.\u001a\u00020-\u0012\u0006\u00103\u001a\u000202\u0012\u0006\u0010:\u001a\u000209\u0012\u0006\u0010=\u001a\u00020<¢\u0006\u0004\b>\u0010?J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002J\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0002J\u0010\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0010H\u0016J\u0018\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0015H\u0016J\u0018\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0015H\u0016J\u0010\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0003H\u0016J\u0010\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0003H\u0016R\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0017\u0010.\u001a\u00020-8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\"\u00103\u001a\u0002028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u0014\u0010:\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;¨\u0006A"}, d2 = {"Lcom/dodopizza/kustoworker/InitializedKustoImpl;", "Lcom/dodopizza/kustoworker/Kusto;", "Lcom/dodopizza/kustoworker/InitializedKusto;", "", "message", "", "writeDebugLog", "Loz3;", "Lcom/dodopizza/kustoworker/CommonUtils$Done;", "initSenderStream", "initStorageStream", "Lcom/dodopizza/kustoworker/KustoEvent;", "kustoEvent", "handleStorageEvent", "replayFromStorage", "", "Lcom/dodopizza/kustoworker/KustoMessage;", "messages", "sendWithConfirmation", "sendMessage", Action.KEY_ATTRIBUTE, "", "value", "setSessionParam", "setUserParam", "setAppName", "setEnvironmentName", "", "maxBatchSize", "I", "", "throttleInterval", "J", "", "debug", "Z", "Lcom/dodopizza/kustoworker/KustoSender;", "kustoSender", "Lcom/dodopizza/kustoworker/KustoSender;", "Lcom/dodopizza/kustoworker/KustoStorage;", "kustoStorage", "Lcom/dodopizza/kustoworker/KustoStorage;", "Lqx1;", "coroutineScope", "Lqx1;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Lcom/dodopizza/kustoworker/session/SessionData;", "session", "Lcom/dodopizza/kustoworker/session/SessionData;", "getSession", "()Lcom/dodopizza/kustoworker/session/SessionData;", "setSession", "(Lcom/dodopizza/kustoworker/session/SessionData;)V", "Lcom/dodopizza/kustoworker/KustoPubSub;", "kustoPubSub", "Lcom/dodopizza/kustoworker/KustoPubSub;", "Lcom/dodopizza/kustoworker/KustoWorkerParams;", "params", "<init>", "(Landroid/content/Context;Lcom/dodopizza/kustoworker/session/SessionData;Lcom/dodopizza/kustoworker/KustoPubSub;Lcom/dodopizza/kustoworker/KustoWorkerParams;)V", "Companion", "kusto-worker_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes2.dex */
public final class InitializedKustoImpl implements Kusto, InitializedKusto {
    public static final Companion Companion = new Companion(null);
    private static final String LOG_TAG = "kusto";
    private final Context context;
    private final qx1 coroutineScope;
    private final boolean debug;
    private final KustoPubSub kustoPubSub;
    private final KustoSender kustoSender;
    private final KustoStorage kustoStorage;
    private final int maxBatchSize;
    private volatile SessionData session;
    private final long throttleInterval;

    /* compiled from: KustoInitialized.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/dodopizza/kustoworker/InitializedKustoImpl$Companion;", "", "()V", "LOG_TAG", "", "getKustoClientHost", "isDebug", "", "kusto-worker_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String getKustoClientHost(boolean z) {
            if (z) {
                return "https://frontlogger.dev.dodois.dev";
            }
            return "https://frontlogger.dodois.io/";
        }
    }

    public InitializedKustoImpl(Context context, SessionData sessionData, KustoPubSub kustoPubSub, KustoWorkerParams kustoWorkerParams) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        z65.h(sessionData, "session");
        z65.h(kustoPubSub, "kustoPubSub");
        z65.h(kustoWorkerParams, "params");
        this.context = context;
        this.session = sessionData;
        this.kustoPubSub = kustoPubSub;
        this.maxBatchSize = kustoWorkerParams.getMaxBatchSize();
        this.throttleInterval = kustoWorkerParams.getThrottleInterval();
        boolean debug = kustoWorkerParams.getDebug();
        this.debug = debug;
        this.kustoSender = new KustoSender(new KustoClient(Companion.getKustoClientHost(debug)));
        this.kustoStorage = new KustoStorage(context);
        qx1 a = rx1.a(v33.b());
        this.coroutineScope = a;
        writeDebugLog("Init storage stream");
        wz3.C(initStorageStream(), a);
        wz3.C(initSenderStream(), a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final oz3<CommonUtils.Done> handleStorageEvent(KustoEvent kustoEvent) {
        final oz3 A = wz3.A(kustoEvent);
        return wz3.h(new oz3<CommonUtils.Done>() { // from class: com.dodopizza.kustoworker.InitializedKustoImpl$handleStorageEvent$$inlined$map$1

            /* compiled from: Collect.kt */
            @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lpz3;", "value", "", "emit", "(Ljava/lang/Object;Lcv1;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 4, 2})
            /* renamed from: com.dodopizza.kustoworker.InitializedKustoImpl$handleStorageEvent$$inlined$map$1$2  reason: invalid class name */
            /* loaded from: classes2.dex */
            public static final class AnonymousClass2 implements pz3<KustoEvent> {
                final /* synthetic */ pz3 $this_unsafeFlow$inlined;
                final /* synthetic */ InitializedKustoImpl this$0;

                @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 2}, xi = 48)
                @nn2(c = "com.dodopizza.kustoworker.InitializedKustoImpl$handleStorageEvent$$inlined$map$1$2", f = "KustoInitialized.kt", l = {SyslogConstants.LOG_LOCAL2}, m = "emit")
                /* renamed from: com.dodopizza.kustoworker.InitializedKustoImpl$handleStorageEvent$$inlined$map$1$2$1  reason: invalid class name */
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

                public AnonymousClass2(pz3 pz3Var, InitializedKustoImpl initializedKustoImpl) {
                    this.$this_unsafeFlow$inlined = pz3Var;
                    this.this$0 = initializedKustoImpl;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
                @Override // defpackage.pz3
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public java.lang.Object emit(com.dodopizza.kustoworker.KustoEvent r9, defpackage.cv1 r10) {
                    /*
                        Method dump skipped, instructions count: 259
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.dodopizza.kustoworker.InitializedKustoImpl$handleStorageEvent$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, cv1):java.lang.Object");
                }
            }

            @Override // defpackage.oz3
            public Object collect(pz3<? super CommonUtils.Done> pz3Var, cv1 cv1Var) {
                Object d;
                Object collect = oz3.this.collect(new AnonymousClass2(pz3Var, this), cv1Var);
                d = c75.d();
                if (collect == d) {
                    return collect;
                }
                return Unit.a;
            }
        }, new InitializedKustoImpl$handleStorageEvent$2(this, null));
    }

    private final oz3<CommonUtils.Done> initSenderStream() {
        return wz3.x(wz3.x(wz3.A(Channel.Sender), new InitializedKustoImpl$initSenderStream$1(this, null)), new InitializedKustoImpl$initSenderStream$2(this, null));
    }

    private final oz3<CommonUtils.Done> initStorageStream() {
        return wz3.x(this.kustoPubSub.subscribeAll(Channel.Storage), new InitializedKustoImpl$initStorageStream$1(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final oz3<CommonUtils.Done> replayFromStorage() {
        return wz3.h(wz3.x(wz3.A(Integer.valueOf(this.maxBatchSize)), new InitializedKustoImpl$replayFromStorage$1(this, null)), new InitializedKustoImpl$replayFromStorage$2(this, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final oz3<CommonUtils.Done> sendWithConfirmation(List<KustoMessage> list) {
        final oz3 A = wz3.A(list);
        final KustoSender kustoSender = this.kustoSender;
        final oz3<MessagesSent> oz3Var = new oz3<MessagesSent>() { // from class: com.dodopizza.kustoworker.InitializedKustoImpl$sendWithConfirmation$$inlined$map$1

            /* compiled from: Collect.kt */
            @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lpz3;", "value", "", "emit", "(Ljava/lang/Object;Lcv1;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 4, 2})
            /* renamed from: com.dodopizza.kustoworker.InitializedKustoImpl$sendWithConfirmation$$inlined$map$1$2  reason: invalid class name */
            /* loaded from: classes2.dex */
            public static final class AnonymousClass2 implements pz3<List<? extends KustoMessage>> {
                final /* synthetic */ pz3 $this_unsafeFlow$inlined;
                final /* synthetic */ KustoSender receiver$0$inlined;

                @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 2}, xi = 48)
                @nn2(c = "com.dodopizza.kustoworker.InitializedKustoImpl$sendWithConfirmation$$inlined$map$1$2", f = "KustoInitialized.kt", l = {137}, m = "emit")
                /* renamed from: com.dodopizza.kustoworker.InitializedKustoImpl$sendWithConfirmation$$inlined$map$1$2$1  reason: invalid class name */
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

                public AnonymousClass2(pz3 pz3Var, KustoSender kustoSender) {
                    this.$this_unsafeFlow$inlined = pz3Var;
                    this.receiver$0$inlined = kustoSender;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                @Override // defpackage.pz3
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public java.lang.Object emit(java.util.List<? extends com.dodopizza.kustoworker.KustoMessage> r5, defpackage.cv1 r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof com.dodopizza.kustoworker.InitializedKustoImpl$sendWithConfirmation$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.dodopizza.kustoworker.InitializedKustoImpl$sendWithConfirmation$$inlined$map$1$2$1 r0 = (com.dodopizza.kustoworker.InitializedKustoImpl$sendWithConfirmation$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.dodopizza.kustoworker.InitializedKustoImpl$sendWithConfirmation$$inlined$map$1$2$1 r0 = new com.dodopizza.kustoworker.InitializedKustoImpl$sendWithConfirmation$$inlined$map$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = defpackage.a75.d()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        defpackage.vk9.b(r6)
                        goto L47
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        defpackage.vk9.b(r6)
                        pz3 r6 = r4.$this_unsafeFlow$inlined
                        java.util.List r5 = (java.util.List) r5
                        com.dodopizza.kustoworker.KustoSender r2 = r4.receiver$0$inlined
                        com.dodopizza.kustoworker.MessagesSent r5 = r2.sendMessages(r5)
                        r0.label = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L47
                        return r1
                    L47:
                        kotlin.Unit r5 = kotlin.Unit.a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.dodopizza.kustoworker.InitializedKustoImpl$sendWithConfirmation$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, cv1):java.lang.Object");
                }
            }

            @Override // defpackage.oz3
            public Object collect(pz3<? super MessagesSent> pz3Var, cv1 cv1Var) {
                Object d;
                Object collect = oz3.this.collect(new AnonymousClass2(pz3Var, kustoSender), cv1Var);
                d = c75.d();
                if (collect == d) {
                    return collect;
                }
                return Unit.a;
            }
        };
        final KustoPubSub kustoPubSub = this.kustoPubSub;
        return wz3.h(wz3.F(new oz3<CommonUtils.Done>() { // from class: com.dodopizza.kustoworker.InitializedKustoImpl$sendWithConfirmation$$inlined$map$2

            /* compiled from: Collect.kt */
            @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lpz3;", "value", "", "emit", "(Ljava/lang/Object;Lcv1;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 4, 2})
            /* renamed from: com.dodopizza.kustoworker.InitializedKustoImpl$sendWithConfirmation$$inlined$map$2$2  reason: invalid class name */
            /* loaded from: classes2.dex */
            public static final class AnonymousClass2 implements pz3<MessagesSent> {
                final /* synthetic */ pz3 $this_unsafeFlow$inlined;
                final /* synthetic */ KustoPubSub receiver$0$inlined;

                @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 2}, xi = 48)
                @nn2(c = "com.dodopizza.kustoworker.InitializedKustoImpl$sendWithConfirmation$$inlined$map$2$2", f = "KustoInitialized.kt", l = {SyslogConstants.LOG_LOCAL1, 137}, m = "emit")
                /* renamed from: com.dodopizza.kustoworker.InitializedKustoImpl$sendWithConfirmation$$inlined$map$2$2$1  reason: invalid class name */
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

                public AnonymousClass2(pz3 pz3Var, KustoPubSub kustoPubSub) {
                    this.$this_unsafeFlow$inlined = pz3Var;
                    this.receiver$0$inlined = kustoPubSub;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
                /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
                /* JADX WARN: Removed duplicated region for block: B:22:0x005e A[RETURN] */
                @Override // defpackage.pz3
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public java.lang.Object emit(com.dodopizza.kustoworker.MessagesSent r7, defpackage.cv1 r8) {
                    /*
                        r6 = this;
                        boolean r0 = r8 instanceof com.dodopizza.kustoworker.InitializedKustoImpl$sendWithConfirmation$$inlined$map$2.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r8
                        com.dodopizza.kustoworker.InitializedKustoImpl$sendWithConfirmation$$inlined$map$2$2$1 r0 = (com.dodopizza.kustoworker.InitializedKustoImpl$sendWithConfirmation$$inlined$map$2.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.dodopizza.kustoworker.InitializedKustoImpl$sendWithConfirmation$$inlined$map$2$2$1 r0 = new com.dodopizza.kustoworker.InitializedKustoImpl$sendWithConfirmation$$inlined$map$2$2$1
                        r0.<init>(r8)
                    L18:
                        java.lang.Object r8 = r0.result
                        java.lang.Object r1 = defpackage.a75.d()
                        int r2 = r0.label
                        r3 = 2
                        r4 = 1
                        if (r2 == 0) goto L3c
                        if (r2 == r4) goto L34
                        if (r2 != r3) goto L2c
                        defpackage.vk9.b(r8)
                        goto L5f
                    L2c:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r8)
                        throw r7
                    L34:
                        java.lang.Object r7 = r0.L$0
                        pz3 r7 = (defpackage.pz3) r7
                        defpackage.vk9.b(r8)
                        goto L53
                    L3c:
                        defpackage.vk9.b(r8)
                        pz3 r8 = r6.$this_unsafeFlow$inlined
                        com.dodopizza.kustoworker.KustoEvent r7 = (com.dodopizza.kustoworker.KustoEvent) r7
                        com.dodopizza.kustoworker.KustoPubSub r2 = r6.receiver$0$inlined
                        r0.L$0 = r8
                        r0.label = r4
                        java.lang.Object r7 = r2.publishStorageStream(r7, r0)
                        if (r7 != r1) goto L50
                        return r1
                    L50:
                        r5 = r8
                        r8 = r7
                        r7 = r5
                    L53:
                        r2 = 0
                        r0.L$0 = r2
                        r0.label = r3
                        java.lang.Object r7 = r7.emit(r8, r0)
                        if (r7 != r1) goto L5f
                        return r1
                    L5f:
                        kotlin.Unit r7 = kotlin.Unit.a
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.dodopizza.kustoworker.InitializedKustoImpl$sendWithConfirmation$$inlined$map$2.AnonymousClass2.emit(java.lang.Object, cv1):java.lang.Object");
                }
            }

            @Override // defpackage.oz3
            public Object collect(pz3<? super CommonUtils.Done> pz3Var, cv1 cv1Var) {
                Object d;
                Object collect = oz3.this.collect(new AnonymousClass2(pz3Var, kustoPubSub), cv1Var);
                d = c75.d();
                if (collect == d) {
                    return collect;
                }
                return Unit.a;
            }
        }, new InitializedKustoImpl$sendWithConfirmation$3(this, list, null)), new InitializedKustoImpl$sendWithConfirmation$4(this, list, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void writeDebugLog(String str) {
        if (this.debug) {
            Log.d("kusto", str);
        }
    }

    public final Context getContext() {
        return this.context;
    }

    @Override // com.dodopizza.kustoworker.InitializedKusto
    public SessionData getSession() {
        return this.session;
    }

    @Override // com.dodopizza.kustoworker.Kusto
    public void sendMessage(KustoMessage kustoMessage) {
        z65.h(kustoMessage, "message");
        sh0.d(this.coroutineScope, null, null, new InitializedKustoImpl$sendMessage$1(this, new MessageReceived(kustoMessage), null), 3, null);
    }

    @Override // com.dodopizza.kustoworker.InitializedKusto
    public void setAppName(String str) {
        z65.h(str, "value");
        setSession(SessionData.copy$default(getSession(), null, AppData.copy$default(getSession().getAppData(), str, null, null, null, 14, null), null, null, null, null, null, 125, null));
    }

    @Override // com.dodopizza.kustoworker.InitializedKusto
    public void setEnvironmentName(String str) {
        z65.h(str, "value");
        setSession(SessionData.copy$default(getSession(), null, null, null, null, str, null, null, 111, null));
    }

    public void setSession(SessionData sessionData) {
        z65.h(sessionData, "<set-?>");
        this.session = sessionData;
    }

    @Override // com.dodopizza.kustoworker.InitializedKusto
    public void setSessionParam(String str, Object obj) {
        Map p;
        z65.h(str, Action.KEY_ATTRIBUTE);
        z65.h(obj, "value");
        SessionData session = getSession();
        p = g86.p(getSession().getCustomData(), lnb.a(str, obj));
        setSession(SessionData.copy$default(session, null, null, null, null, null, null, p, 63, null));
    }

    @Override // com.dodopizza.kustoworker.InitializedKusto
    public void setUserParam(String str, Object obj) {
        Map p;
        z65.h(str, Action.KEY_ATTRIBUTE);
        z65.h(obj, "value");
        SessionData session = getSession();
        p = g86.p(getSession().getUserData(), lnb.a(str, obj));
        setSession(SessionData.copy$default(session, null, null, null, null, null, p, null, 95, null));
    }
}
