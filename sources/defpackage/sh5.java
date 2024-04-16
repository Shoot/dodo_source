package defpackage;

import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* compiled from: KustoClientSettings.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u0017\u0010\r\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\b\u0010\u000b\u001a\u0004\b\u0003\u0010\f¨\u0006\u0010"}, d2 = {"Lsh5;", "", "", "a", "J", "b", "()J", "connectTimeoutSeconds", c.a, "readTimeoutSeconds", "", "Ljava/lang/String;", "()Ljava/lang/String;", "baseUrl", "<init>", "(JJLjava/lang/String;)V", "analytics-kusto_release"}, k = 1, mv = {1, 7, 1})
/* renamed from: sh5  reason: default package */
/* loaded from: classes.dex */
public final class sh5 {
    private final long a;
    private final long b;
    private final String c;

    public sh5(long j, long j2, String str) {
        z65.h(str, "baseUrl");
        this.a = j;
        this.b = j2;
        this.c = str;
    }

    public final String a() {
        return this.c;
    }

    public final long b() {
        return this.a;
    }

    public final long c() {
        return this.b;
    }
}
