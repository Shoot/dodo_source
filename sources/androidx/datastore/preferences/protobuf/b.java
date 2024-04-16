package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.l0;
/* compiled from: AbstractParser.java */
/* loaded from: classes.dex */
public abstract class b<MessageType extends l0> implements gr7<MessageType> {
    private static final n a = n.b();

    private MessageType c(MessageType messagetype) throws InvalidProtocolBufferException {
        if (messagetype != null && !messagetype.isInitialized()) {
            throw d(messagetype).a().k(messagetype);
        }
        return messagetype;
    }

    private UninitializedMessageException d(MessageType messagetype) {
        if (messagetype instanceof a) {
            return ((a) messagetype).n();
        }
        return new UninitializedMessageException(messagetype);
    }

    @Override // defpackage.gr7
    /* renamed from: e */
    public MessageType a(g gVar, n nVar) throws InvalidProtocolBufferException {
        return c(f(gVar, nVar));
    }

    public MessageType f(g gVar, n nVar) throws InvalidProtocolBufferException {
        h T = gVar.T();
        MessageType messagetype = (MessageType) b(T, nVar);
        try {
            T.a(0);
            return messagetype;
        } catch (InvalidProtocolBufferException e) {
            throw e.k(messagetype);
        }
    }
}
