package com.appsflyer.internal;

import ch.qos.logback.core.CoreConstants;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\b\u0000\u0018\u0000 \u00012\u00020\u0014:\u0001\u0001B/\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0011\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u000b\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000b\u0010\u000eR\u0012\u0010\u0005\u001a\u00020\u0002X\u0087\u0002¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R \u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0087\u0002¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0011\u0010\b\u001a\u00020\nX\u0007¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/appsflyer/internal/AFc1nSDK;", "AFa1wSDK", "", CoreConstants.VALUE_OF, "[B", "AFInAppEventParameterName", "", "", "AFInAppEventType", "Ljava/util/Map;", "", "values", "I", "", "()Z", "p0", "p1", "p2", "<init>", "([BLjava/util/Map;I)V", ""}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AFc1nSDK {
    public Map<String, String> AFInAppEventType;
    public byte[] valueOf;
    public int values;
    public static final AFa1wSDK AFa1wSDK = new AFa1wSDK(null);
    public static String AFKeystoreWrapper = "https://%smonitorsdk.%s/remote-debug/exception-manager";

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0000\b\u0086\u0003\u0018\u00002\u00020\u0007B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0004\u001a\u00020\u0001X\u0087\u0002¢\u0006\u0006\n\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/appsflyer/internal/AFc1nSDK$AFa1wSDK;", "", "AFKeystoreWrapper", "Ljava/lang/String;", CoreConstants.VALUE_OF, "<init>", "()V", ""}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class AFa1wSDK {
        private AFa1wSDK() {
        }

        public /* synthetic */ AFa1wSDK(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public AFc1nSDK(byte[] bArr, Map<String, String> map, int i) {
        z65.h(bArr, "");
        this.valueOf = bArr;
        this.AFInAppEventType = map;
        this.values = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x018c, code lost:
        if (r10 == null) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean values() {
        /*
            Method dump skipped, instructions count: 599
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFc1nSDK.values():boolean");
    }
}
