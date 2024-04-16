package defpackage;

import kotlin.Metadata;
/* compiled from: UrlTypes.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\r\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lytb;", "", "", "value", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "ENDPOINT_ID", "OPERATION", "DEVICE_UUID", "TRANSACTION_ID", "DATE_TIME_OFFSET", "UNIQ_KEY", "sdk_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: ytb  reason: default package */
/* loaded from: classes.dex */
public enum ytb {
    ENDPOINT_ID("endpointId"),
    OPERATION("operation"),
    DEVICE_UUID("deviceUUID"),
    TRANSACTION_ID("transactionId"),
    DATE_TIME_OFFSET("dateTimeOffset"),
    UNIQ_KEY("uniqKey");
    
    private final String value;

    ytb(String str) {
        this.value = str;
    }

    public final String getValue() {
        return this.value;
    }
}
