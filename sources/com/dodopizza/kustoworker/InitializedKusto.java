package com.dodopizza.kustoworker;

import ch.qos.logback.core.joran.action.Action;
import com.dodopizza.kustoworker.session.SessionData;
import kotlin.Metadata;
/* compiled from: KustoInitialized.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J\u0018\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0001H&J\u0018\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0001H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u000e"}, d2 = {"Lcom/dodopizza/kustoworker/InitializedKusto;", "", "session", "Lcom/dodopizza/kustoworker/session/SessionData;", "getSession", "()Lcom/dodopizza/kustoworker/session/SessionData;", "setAppName", "", "value", "", "setEnvironmentName", "setSessionParam", Action.KEY_ATTRIBUTE, "setUserParam", "kusto-worker_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes2.dex */
public interface InitializedKusto {
    SessionData getSession();

    void setAppName(String str);

    void setEnvironmentName(String str);

    void setSessionParam(String str, Object obj);

    void setUserParam(String str, Object obj);
}
