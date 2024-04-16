package com.dodopizza.kustoworker;

import kotlin.Metadata;
/* compiled from: KustoPubSub.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/dodopizza/kustoworker/MessageReceived;", "Lcom/dodopizza/kustoworker/KustoEvent;", "message", "Lcom/dodopizza/kustoworker/KustoMessage;", "(Lcom/dodopizza/kustoworker/KustoMessage;)V", "getMessage", "()Lcom/dodopizza/kustoworker/KustoMessage;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "kusto-worker_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes2.dex */
public final class MessageReceived extends KustoEvent {
    private final KustoMessage message;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageReceived(KustoMessage kustoMessage) {
        super(null);
        z65.h(kustoMessage, "message");
        this.message = kustoMessage;
    }

    public static /* synthetic */ MessageReceived copy$default(MessageReceived messageReceived, KustoMessage kustoMessage, int i, Object obj) {
        if ((i & 1) != 0) {
            kustoMessage = messageReceived.message;
        }
        return messageReceived.copy(kustoMessage);
    }

    public final KustoMessage component1() {
        return this.message;
    }

    public final MessageReceived copy(KustoMessage kustoMessage) {
        z65.h(kustoMessage, "message");
        return new MessageReceived(kustoMessage);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof MessageReceived) || !z65.c(this.message, ((MessageReceived) obj).message)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final KustoMessage getMessage() {
        return this.message;
    }

    public int hashCode() {
        KustoMessage kustoMessage = this.message;
        if (kustoMessage != null) {
            return kustoMessage.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "MessageReceived(message=" + this.message + ")";
    }
}
