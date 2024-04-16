package defpackage;

import org.java_websocket.exceptions.InvalidDataException;
/* compiled from: WebSocketAdapter.java */
/* renamed from: p3c  reason: default package */
/* loaded from: classes3.dex */
public abstract class p3c implements t3c {
    private v68 pingFrame;

    @Override // defpackage.t3c
    public v68 onPreparePing(n3c n3cVar) {
        if (this.pingFrame == null) {
            this.pingFrame = new v68();
        }
        return this.pingFrame;
    }

    @Override // defpackage.t3c
    public lda onWebsocketHandshakeReceivedAsServer(n3c n3cVar, m73 m73Var, i91 i91Var) throws InvalidDataException {
        return new om4();
    }

    @Override // defpackage.t3c
    public void onWebsocketPing(n3c n3cVar, i74 i74Var) {
        n3cVar.sendFrame(new cf8((v68) i74Var));
    }

    @Override // defpackage.t3c
    public void onWebsocketHandshakeSentAsClient(n3c n3cVar, i91 i91Var) throws InvalidDataException {
    }

    @Override // defpackage.t3c
    public void onWebsocketPong(n3c n3cVar, i74 i74Var) {
    }

    @Override // defpackage.t3c
    public void onWebsocketHandshakeReceivedAsClient(n3c n3cVar, i91 i91Var, kda kdaVar) throws InvalidDataException {
    }
}
