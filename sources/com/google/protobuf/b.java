package com.google.protobuf;

import com.google.protobuf.k0;
/* compiled from: AbstractParser.java */
/* loaded from: classes.dex */
public abstract class b<MessageType extends k0> implements er7<MessageType> {
    private static final m a = m.b();

    private MessageType c(MessageType messagetype) throws InvalidProtocolBufferException {
        if (messagetype != null && !messagetype.isInitialized()) {
            throw d(messagetype).a().l(messagetype);
        }
        return messagetype;
    }

    private UninitializedMessageException d(MessageType messagetype) {
        if (messagetype instanceof a) {
            return ((a) messagetype).t();
        }
        return new UninitializedMessageException(messagetype);
    }

    @Override // defpackage.er7
    /* renamed from: e */
    public MessageType a(f fVar, m mVar) throws InvalidProtocolBufferException {
        return c(f(fVar, mVar));
    }

    public MessageType f(f fVar, m mVar) throws InvalidProtocolBufferException {
        g Q = fVar.Q();
        MessageType messagetype = (MessageType) b(Q, mVar);
        try {
            Q.a(0);
            return messagetype;
        } catch (InvalidProtocolBufferException e) {
            throw e.l(messagetype);
        }
    }
}
