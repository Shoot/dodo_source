package com.dodopizza.kustoworker;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.dodopizza.kustoworker.KustoStorage;
import com.dodopizza.kustoworker.session.AppData;
import com.dodopizza.kustoworker.session.DeviceData;
import com.dodopizza.kustoworker.session.OsData;
import com.dodopizza.kustoworker.session.SessionData;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
/* compiled from: KustoInitialized.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/dodopizza/kustoworker/Kusto;", "", "sendMessage", "", "message", "Lcom/dodopizza/kustoworker/KustoMessage;", "Companion", "kusto-worker_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes2.dex */
public interface Kusto {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: KustoInitialized.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0006\u0010\u0007\u001a\u00020\u0006J.\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nJ$\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nJ.\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nJ\u001a\u0010\u0010\u001a\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nR\u0014\u0010\u0011\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0013\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lcom/dodopizza/kustoworker/Kusto$Companion;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lcom/dodopizza/kustoworker/session/SessionData;", "createSession", "Lcom/dodopizza/kustoworker/Kusto;", "instance", "Lcom/dodopizza/kustoworker/KustoWorkerParams;", "params", "Lkotlin/Function1;", "Lcom/dodopizza/kustoworker/InitializedKusto;", "", "upgradeKustoSession", "init", "initDebug", "upgradeSession", "DEFAULT_KUSTO_PARAMS", "Lcom/dodopizza/kustoworker/KustoWorkerParams;", KustoStorage.KustoTable.TABLE_NAME, "Lcom/dodopizza/kustoworker/Kusto;", "<init>", "()V", "kusto-worker_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes2.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final KustoWorkerParams DEFAULT_KUSTO_PARAMS = new KustoWorkerParams(10, 1000, false);
        private static Kusto kusto = NoopKustoImpl.INSTANCE;

        private Companion() {
        }

        private final SessionData createSession(Context context) {
            String uuid = UUID.randomUUID().toString();
            z65.g(uuid, "UUID.randomUUID().toString()");
            return new SessionData(uuid, AppData.Companion.create(context), OsData.Companion.create(), DeviceData.Companion.create(), null, null, null, 112, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void init$default(Companion companion, Context context, KustoWorkerParams kustoWorkerParams, Function1 function1, int i, Object obj) {
            if ((i & 2) != 0) {
                kustoWorkerParams = DEFAULT_KUSTO_PARAMS;
            }
            if ((i & 4) != 0) {
                function1 = Kusto$Companion$init$1.INSTANCE;
            }
            companion.init(context, kustoWorkerParams, function1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void initDebug$default(Companion companion, Context context, KustoWorkerParams kustoWorkerParams, Function1 function1, int i, Object obj) {
            if ((i & 2) != 0) {
                kustoWorkerParams = DEFAULT_KUSTO_PARAMS;
            }
            if ((i & 4) != 0) {
                function1 = Kusto$Companion$initDebug$1.INSTANCE;
            }
            companion.initDebug(context, kustoWorkerParams, function1);
        }

        public final void init(Context context, KustoWorkerParams kustoWorkerParams, Function1<? super InitializedKusto, Unit> function1) {
            z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
            z65.h(kustoWorkerParams, "params");
            z65.h(function1, "upgradeKustoSession");
            InitializedKustoImpl initializedKustoImpl = new InitializedKustoImpl(context, createSession(context), new KustoPubSub(), kustoWorkerParams);
            function1.invoke(initializedKustoImpl);
            kusto = initializedKustoImpl;
        }

        public final void initDebug(Context context, KustoWorkerParams kustoWorkerParams, Function1<? super InitializedKusto, Unit> function1) {
            z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
            z65.h(kustoWorkerParams, "params");
            z65.h(function1, "upgradeKustoSession");
            init(context, KustoWorkerParams.copy$default(kustoWorkerParams, 0, 0L, true, 3, null), function1);
        }

        public final Kusto instance() {
            return kusto;
        }

        public final void upgradeSession(Function1<? super InitializedKusto, Unit> function1) {
            z65.h(function1, "upgradeKustoSession");
            Kusto kusto2 = kusto;
            if (kusto2 instanceof InitializedKusto) {
                function1.invoke(kusto2);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void init$default(Companion companion, Context context, Function1 function1, int i, Object obj) {
            if ((i & 2) != 0) {
                function1 = Kusto$Companion$init$2.INSTANCE;
            }
            companion.init(context, function1);
        }

        public final void init(Context context, Function1<? super InitializedKusto, Unit> function1) {
            z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
            z65.h(function1, "upgradeKustoSession");
            init(context, DEFAULT_KUSTO_PARAMS, function1);
        }
    }

    void sendMessage(KustoMessage kustoMessage);
}
