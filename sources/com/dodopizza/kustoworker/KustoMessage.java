package com.dodopizza.kustoworker;

import java.util.Map;
import kotlin.Metadata;
/* compiled from: KustoPubSub.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0006HÖ\u0001R\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/dodopizza/kustoworker/KustoMessage;", "", "meta", "Lcom/dodopizza/kustoworker/KustoMessageMeta;", "data", "", "", "(Lcom/dodopizza/kustoworker/KustoMessageMeta;Ljava/util/Map;)V", "getData", "()Ljava/util/Map;", "id", "getId", "()Ljava/lang/String;", "getMeta", "()Lcom/dodopizza/kustoworker/KustoMessageMeta;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "kusto-worker_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes2.dex */
public final class KustoMessage {
    private final Map<String, Object> data;
    private final KustoMessageMeta meta;

    public KustoMessage(KustoMessageMeta kustoMessageMeta, Map<String, ? extends Object> map) {
        z65.h(kustoMessageMeta, "meta");
        z65.h(map, "data");
        this.meta = kustoMessageMeta;
        this.data = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ KustoMessage copy$default(KustoMessage kustoMessage, KustoMessageMeta kustoMessageMeta, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            kustoMessageMeta = kustoMessage.meta;
        }
        if ((i & 2) != 0) {
            map = kustoMessage.data;
        }
        return kustoMessage.copy(kustoMessageMeta, map);
    }

    public final KustoMessageMeta component1() {
        return this.meta;
    }

    public final Map<String, Object> component2() {
        return this.data;
    }

    public final KustoMessage copy(KustoMessageMeta kustoMessageMeta, Map<String, ? extends Object> map) {
        z65.h(kustoMessageMeta, "meta");
        z65.h(map, "data");
        return new KustoMessage(kustoMessageMeta, map);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof KustoMessage) {
                KustoMessage kustoMessage = (KustoMessage) obj;
                if (!z65.c(this.meta, kustoMessage.meta) || !z65.c(this.data, kustoMessage.data)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final Map<String, Object> getData() {
        return this.data;
    }

    public final String getId() {
        return this.meta.getId();
    }

    public final KustoMessageMeta getMeta() {
        return this.meta;
    }

    public int hashCode() {
        int i;
        KustoMessageMeta kustoMessageMeta = this.meta;
        int i2 = 0;
        if (kustoMessageMeta != null) {
            i = kustoMessageMeta.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        Map<String, Object> map = this.data;
        if (map != null) {
            i2 = map.hashCode();
        }
        return i3 + i2;
    }

    public String toString() {
        return "KustoMessage(meta=" + this.meta + ", data=" + this.data + ")";
    }
}
