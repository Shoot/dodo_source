package im.threads.business.models;

import ch.qos.logback.core.joran.action.Action;
import im.threads.business.transport.MessageAttributes;
import kotlin.Metadata;
/* compiled from: Optional.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0006\"\u0004\b\u0012\u0010\b¨\u0006\u0013"}, d2 = {"Lim/threads/business/models/Optional;", "", "()V", Action.NAME_ATTRIBUTE, "", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "size", "", "getSize", "()Ljava/lang/Long;", "setSize", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", MessageAttributes.TYPE, "getType", "setType", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Optional {
    private String name;
    private Long size;
    private String type;

    public final String getName() {
        return this.name;
    }

    public final Long getSize() {
        return this.size;
    }

    public final String getType() {
        return this.type;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setSize(Long l) {
        this.size = l;
    }

    public final void setType(String str) {
        this.type = str;
    }
}
