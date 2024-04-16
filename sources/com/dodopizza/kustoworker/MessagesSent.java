package com.dodopizza.kustoworker;

import java.util.List;
import kotlin.Metadata;
/* compiled from: KustoPubSub.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/dodopizza/kustoworker/MessagesSent;", "Lcom/dodopizza/kustoworker/KustoEvent;", "messages", "", "Lcom/dodopizza/kustoworker/KustoMessageMeta;", "(Ljava/util/List;)V", "getMessages", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "kusto-worker_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes2.dex */
public final class MessagesSent extends KustoEvent {
    private final List<KustoMessageMeta> messages;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessagesSent(List<KustoMessageMeta> list) {
        super(null);
        z65.h(list, "messages");
        this.messages = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MessagesSent copy$default(MessagesSent messagesSent, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = messagesSent.messages;
        }
        return messagesSent.copy(list);
    }

    public final List<KustoMessageMeta> component1() {
        return this.messages;
    }

    public final MessagesSent copy(List<KustoMessageMeta> list) {
        z65.h(list, "messages");
        return new MessagesSent(list);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof MessagesSent) || !z65.c(this.messages, ((MessagesSent) obj).messages)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final List<KustoMessageMeta> getMessages() {
        return this.messages;
    }

    public int hashCode() {
        List<KustoMessageMeta> list = this.messages;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "MessagesSent(messages=" + this.messages + ")";
    }
}
