package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.m0;
/* compiled from: AbstractParser.java */
/* loaded from: classes2.dex */
public abstract class b<MessageType extends m0> implements dr7<MessageType> {
    private static final o a = o.b();

    private MessageType c(MessageType messagetype) throws InvalidProtocolBufferException {
        if (messagetype != null && !messagetype.isInitialized()) {
            throw d(messagetype).a().l(messagetype);
        }
        return messagetype;
    }

    private UninitializedMessageException d(MessageType messagetype) {
        if (messagetype instanceof a) {
            return ((a) messagetype).n();
        }
        return new UninitializedMessageException(messagetype);
    }

    @Override // defpackage.dr7
    /* renamed from: e */
    public MessageType b(h hVar, o oVar) throws InvalidProtocolBufferException {
        return c(f(hVar, oVar));
    }

    public MessageType f(h hVar, o oVar) throws InvalidProtocolBufferException {
        i T = hVar.T();
        MessageType messagetype = (MessageType) a(T, oVar);
        try {
            T.a(0);
            return messagetype;
        } catch (InvalidProtocolBufferException e) {
            throw e.l(messagetype);
        }
    }
}
