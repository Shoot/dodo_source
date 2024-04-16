package cloud.mindbox.mobile_sdk.models;

import ch.qos.logback.core.CoreConstants;
import java.util.HashMap;
import kotlin.Metadata;
/* compiled from: Event.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001Ba\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012(\b\u0002\u0010\t\u001a\"\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\nj\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u0001`\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J)\u0010\u001c\u001a\"\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\nj\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u0001`\u000bHÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003Jg\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032(\b\u0002\u0010\t\u001a\"\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\nj\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u0001`\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0007HÖ\u0001R1\u0010\t\u001a\"\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\nj\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u0001`\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013¨\u0006%"}, d2 = {"Lcloud/mindbox/mobile_sdk/models/Event;", "", "uid", "", "eventType", "Lcloud/mindbox/mobile_sdk/models/EventType;", "transactionId", "", "enqueueTimestamp", "additionalFields", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "body", "(JLcloud/mindbox/mobile_sdk/models/EventType;Ljava/lang/String;JLjava/util/HashMap;Ljava/lang/String;)V", "getAdditionalFields", "()Ljava/util/HashMap;", "getBody", "()Ljava/lang/String;", "getEnqueueTimestamp", "()J", "getEventType", "()Lcloud/mindbox/mobile_sdk/models/EventType;", "getTransactionId", "getUid", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "sdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Event {
    private final HashMap<String, String> additionalFields;
    private final String body;
    private final long enqueueTimestamp;
    private final EventType eventType;
    private final String transactionId;
    private final long uid;

    public Event(long j, EventType eventType, String str, long j2, HashMap<String, String> hashMap, String str2) {
        z65.h(eventType, "eventType");
        z65.h(str, "transactionId");
        this.uid = j;
        this.eventType = eventType;
        this.transactionId = str;
        this.enqueueTimestamp = j2;
        this.additionalFields = hashMap;
        this.body = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Event copy$default(Event event, long j, EventType eventType, String str, long j2, HashMap hashMap, String str2, int i, Object obj) {
        long j3;
        EventType eventType2;
        String str3;
        long j4;
        HashMap<String, String> hashMap2;
        String str4;
        if ((i & 1) != 0) {
            j3 = event.uid;
        } else {
            j3 = j;
        }
        if ((i & 2) != 0) {
            eventType2 = event.eventType;
        } else {
            eventType2 = eventType;
        }
        if ((i & 4) != 0) {
            str3 = event.transactionId;
        } else {
            str3 = str;
        }
        if ((i & 8) != 0) {
            j4 = event.enqueueTimestamp;
        } else {
            j4 = j2;
        }
        if ((i & 16) != 0) {
            hashMap2 = event.additionalFields;
        } else {
            hashMap2 = hashMap;
        }
        if ((i & 32) != 0) {
            str4 = event.body;
        } else {
            str4 = str2;
        }
        return event.copy(j3, eventType2, str3, j4, hashMap2, str4);
    }

    public final long component1() {
        return this.uid;
    }

    public final EventType component2() {
        return this.eventType;
    }

    public final String component3() {
        return this.transactionId;
    }

    public final long component4() {
        return this.enqueueTimestamp;
    }

    public final HashMap<String, String> component5() {
        return this.additionalFields;
    }

    public final String component6() {
        return this.body;
    }

    public final Event copy(long j, EventType eventType, String str, long j2, HashMap<String, String> hashMap, String str2) {
        z65.h(eventType, "eventType");
        z65.h(str, "transactionId");
        return new Event(j, eventType, str, j2, hashMap, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Event)) {
            return false;
        }
        Event event = (Event) obj;
        if (this.uid == event.uid && z65.c(this.eventType, event.eventType) && z65.c(this.transactionId, event.transactionId) && this.enqueueTimestamp == event.enqueueTimestamp && z65.c(this.additionalFields, event.additionalFields) && z65.c(this.body, event.body)) {
            return true;
        }
        return false;
    }

    public final HashMap<String, String> getAdditionalFields() {
        return this.additionalFields;
    }

    public final String getBody() {
        return this.body;
    }

    public final long getEnqueueTimestamp() {
        return this.enqueueTimestamp;
    }

    public final EventType getEventType() {
        return this.eventType;
    }

    public final String getTransactionId() {
        return this.transactionId;
    }

    public final long getUid() {
        return this.uid;
    }

    public int hashCode() {
        int hashCode;
        int a = ((((((ax1.a(this.uid) * 31) + this.eventType.hashCode()) * 31) + this.transactionId.hashCode()) * 31) + ax1.a(this.enqueueTimestamp)) * 31;
        HashMap<String, String> hashMap = this.additionalFields;
        int i = 0;
        if (hashMap == null) {
            hashCode = 0;
        } else {
            hashCode = hashMap.hashCode();
        }
        int i2 = (a + hashCode) * 31;
        String str = this.body;
        if (str != null) {
            i = str.hashCode();
        }
        return i2 + i;
    }

    public String toString() {
        return "Event(uid=" + this.uid + ", eventType=" + this.eventType + ", transactionId=" + this.transactionId + ", enqueueTimestamp=" + this.enqueueTimestamp + ", additionalFields=" + this.additionalFields + ", body=" + this.body + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ Event(long r12, cloud.mindbox.mobile_sdk.models.EventType r14, java.lang.String r15, long r16, java.util.HashMap r18, java.lang.String r19, int r20, kotlin.jvm.internal.DefaultConstructorMarker r21) {
        /*
            r11 = this;
            r0 = r20 & 1
            if (r0 == 0) goto L8
            r0 = 0
            r3 = r0
            goto L9
        L8:
            r3 = r12
        L9:
            r0 = r20 & 4
            if (r0 == 0) goto L1c
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "randomUUID().toString()"
            defpackage.z65.g(r0, r1)
            r6 = r0
            goto L1d
        L1c:
            r6 = r15
        L1d:
            r0 = r20 & 8
            if (r0 == 0) goto L27
            long r0 = java.lang.System.currentTimeMillis()
            r7 = r0
            goto L29
        L27:
            r7 = r16
        L29:
            r0 = r20 & 16
            r1 = 0
            if (r0 == 0) goto L30
            r9 = r1
            goto L32
        L30:
            r9 = r18
        L32:
            r0 = r20 & 32
            if (r0 == 0) goto L38
            r10 = r1
            goto L3a
        L38:
            r10 = r19
        L3a:
            r2 = r11
            r5 = r14
            r2.<init>(r3, r5, r6, r7, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cloud.mindbox.mobile_sdk.models.Event.<init>(long, cloud.mindbox.mobile_sdk.models.EventType, java.lang.String, long, java.util.HashMap, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
