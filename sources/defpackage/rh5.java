package defpackage;

import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
/* compiled from: KustoAnalyticsSettings.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f¨\u0006\u0010"}, d2 = {"Lrh5;", "", "", "toString", "", "hashCode", "other", "", "equals", "", "a", "J", "()J", "timeoutToSendEventsMillis", "<init>", "(J)V", "analytics-kusto_release"}, k = 1, mv = {1, 7, 1})
/* renamed from: rh5  reason: default package */
/* loaded from: classes.dex */
public final class rh5 {
    private final long a;

    public rh5(long j) {
        this.a = j;
    }

    public final long a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof rh5) && this.a == ((rh5) obj).a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ax1.a(this.a);
    }

    public String toString() {
        return "KustoAnalyticsSettings(timeoutToSendEventsMillis=" + this.a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
