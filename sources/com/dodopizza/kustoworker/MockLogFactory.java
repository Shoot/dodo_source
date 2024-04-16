package com.dodopizza.kustoworker;

import com.dodopizza.persistence.entity.UpsaleStateEntity;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
/* compiled from: MockLogFactory.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0006¨\u0006\b"}, d2 = {"Lcom/dodopizza/kustoworker/MockLogFactory;", "", "()V", "createKustoLogMessage", "Lcom/dodopizza/kustoworker/KustoMessage;", "createLog", "", "", "kusto-worker_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes2.dex */
public final class MockLogFactory {
    public static final MockLogFactory INSTANCE = new MockLogFactory();

    private MockLogFactory() {
    }

    public final KustoMessage createKustoLogMessage() {
        String uuid = UUID.randomUUID().toString();
        z65.g(uuid, "UUID.randomUUID().toString()");
        return new KustoMessage(new KustoMessageMeta(uuid, null, 2, null), createLog());
    }

    public final Map<String, Object> createLog() {
        Map h;
        Map k;
        Map<String, Object> k2;
        h = g86.h();
        k = g86.k(lnb.a("userId", "test"), lnb.a(UpsaleStateEntity.FIELD_NAME_WORKFLOW_ID, "0"));
        k2 = g86.k(lnb.a(RemoteMessageConst.Notification.CONTENT, "test message"), lnb.a("applicationName", "pizza-android"), lnb.a("version", "2.26"), lnb.a("environmentName", "regress-gs"), lnb.a("clientTimestamp", "0"), lnb.a("userInfo", h), lnb.a("level", "debug"), lnb.a("user", k));
        return k2;
    }
}
