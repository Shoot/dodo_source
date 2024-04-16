package defpackage;

import com.facebook.flipper.plugins.databases.DatabaseDriver;
import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.List;
import kotlin.Metadata;
/* compiled from: NullProxySelector.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J&\u0010\f\u001a\u00020\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¨\u0006\u000f"}, d2 = {"Lr37;", "Ljava/net/ProxySelector;", "Ljava/net/URI;", "uri", "", "Ljava/net/Proxy;", DatabaseDriver.DatabaseExecuteSqlResponse.TYPE_SELECT, "Ljava/net/SocketAddress;", "sa", "Ljava/io/IOException;", "ioe", "", "connectFailed", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 9, 0})
/* renamed from: r37  reason: default package */
/* loaded from: classes3.dex */
public final class r37 extends ProxySelector {
    public static final r37 a = new r37();

    private r37() {
    }

    @Override // java.net.ProxySelector
    public List<Proxy> select(URI uri) {
        List<Proxy> e;
        if (uri != null) {
            e = jc1.e(Proxy.NO_PROXY);
            return e;
        }
        throw new IllegalArgumentException("uri must not be null".toString());
    }

    @Override // java.net.ProxySelector
    public void connectFailed(URI uri, SocketAddress socketAddress, IOException iOException) {
    }
}
