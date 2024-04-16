package com.facebook.flipper.android;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import javax.net.SocketFactory;
/* loaded from: classes2.dex */
class DelegatingSocketFactory extends SocketFactory {
    private final SocketFactory delegate;

    /* JADX INFO: Access modifiers changed from: package-private */
    public DelegatingSocketFactory(SocketFactory socketFactory) {
        this.delegate = socketFactory;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket() throws IOException {
        return configureSocket(this.delegate.createSocket());
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i) throws IOException {
        return configureSocket(this.delegate.createSocket(str, i));
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i, InetAddress inetAddress, int i2) throws IOException {
        return configureSocket(this.delegate.createSocket(str, i, inetAddress, i2));
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i) throws IOException {
        return configureSocket(this.delegate.createSocket(inetAddress, i));
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) throws IOException {
        return configureSocket(this.delegate.createSocket(inetAddress, i, inetAddress2, i2));
    }

    protected Socket configureSocket(Socket socket) {
        return socket;
    }
}
