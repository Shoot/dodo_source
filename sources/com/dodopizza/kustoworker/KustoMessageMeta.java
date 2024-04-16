package com.dodopizza.kustoworker;

import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: KustoPubSub.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/dodopizza/kustoworker/KustoMessageMeta;", "", "id", "", "createdAt", "Ljava/util/Date;", "(Ljava/lang/String;Ljava/util/Date;)V", "getCreatedAt", "()Ljava/util/Date;", "getId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "kusto-worker_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes2.dex */
public final class KustoMessageMeta {
    private final Date createdAt;
    private final String id;

    public KustoMessageMeta(String str, Date date) {
        z65.h(str, "id");
        z65.h(date, "createdAt");
        this.id = str;
        this.createdAt = date;
    }

    public static /* synthetic */ KustoMessageMeta copy$default(KustoMessageMeta kustoMessageMeta, String str, Date date, int i, Object obj) {
        if ((i & 1) != 0) {
            str = kustoMessageMeta.id;
        }
        if ((i & 2) != 0) {
            date = kustoMessageMeta.createdAt;
        }
        return kustoMessageMeta.copy(str, date);
    }

    public final String component1() {
        return this.id;
    }

    public final Date component2() {
        return this.createdAt;
    }

    public final KustoMessageMeta copy(String str, Date date) {
        z65.h(str, "id");
        z65.h(date, "createdAt");
        return new KustoMessageMeta(str, date);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof KustoMessageMeta) {
                KustoMessageMeta kustoMessageMeta = (KustoMessageMeta) obj;
                if (!z65.c(this.id, kustoMessageMeta.id) || !z65.c(this.createdAt, kustoMessageMeta.createdAt)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final Date getCreatedAt() {
        return this.createdAt;
    }

    public final String getId() {
        return this.id;
    }

    public int hashCode() {
        int i;
        String str = this.id;
        int i2 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        Date date = this.createdAt;
        if (date != null) {
            i2 = date.hashCode();
        }
        return i3 + i2;
    }

    public String toString() {
        return "KustoMessageMeta(id=" + this.id + ", createdAt=" + this.createdAt + ")";
    }

    public /* synthetic */ KustoMessageMeta(String str, Date date, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? new Date() : date);
    }
}
