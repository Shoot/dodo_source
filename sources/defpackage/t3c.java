package defpackage;

import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import org.java_websocket.exceptions.InvalidDataException;
/* compiled from: WebSocketListener.java */
/* renamed from: t3c  reason: default package */
/* loaded from: classes3.dex */
public interface t3c {
    InetSocketAddress getLocalSocketAddress(n3c n3cVar);

    InetSocketAddress getRemoteSocketAddress(n3c n3cVar);

    v68 onPreparePing(n3c n3cVar);

    void onWebsocketClose(n3c n3cVar, int i, String str, boolean z);

    void onWebsocketCloseInitiated(n3c n3cVar, int i, String str);

    void onWebsocketClosing(n3c n3cVar, int i, String str, boolean z);

    void onWebsocketError(n3c n3cVar, Exception exc);

    void onWebsocketHandshakeReceivedAsClient(n3c n3cVar, i91 i91Var, kda kdaVar) throws InvalidDataException;

    lda onWebsocketHandshakeReceivedAsServer(n3c n3cVar, m73 m73Var, i91 i91Var) throws InvalidDataException;

    void onWebsocketHandshakeSentAsClient(n3c n3cVar, i91 i91Var) throws InvalidDataException;

    void onWebsocketMessage(n3c n3cVar, String str);

    void onWebsocketMessage(n3c n3cVar, ByteBuffer byteBuffer);

    void onWebsocketOpen(n3c n3cVar, qm4 qm4Var);

    void onWebsocketPing(n3c n3cVar, i74 i74Var);

    void onWebsocketPong(n3c n3cVar, i74 i74Var);

    void onWriteDemand(n3c n3cVar);
}
