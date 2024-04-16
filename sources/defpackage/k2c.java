package defpackage;

import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/* compiled from: VpnChecker.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0006R\u001c\u0010\f\u001a\n \t*\u0004\u0018\u00010\b0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lk2c;", "Lj2c;", "", "a", "", "", "Ljava/util/List;", "vpnNetworkNames", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "b", "Lorg/slf4j/Logger;", "logger", "<init>", "()V", "infrastructure-base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: k2c  reason: default package */
/* loaded from: classes4.dex */
public final class k2c implements j2c {
    private final List<String> a;
    private final Logger b;

    public k2c() {
        List<String> o;
        o = kc1.o("tun", "ipsec", "tap", "ppp", "pptp", "utun");
        this.a = o;
        this.b = LoggerFactory.getLogger("VpnChecker");
    }

    @Override // defpackage.j2c
    public boolean a() {
        Iterator z;
        boolean H;
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            z65.g(networkInterfaces, "getNetworkInterfaces(...)");
            z = mc1.z(networkInterfaces);
            while (z.hasNext()) {
                NetworkInterface networkInterface = (NetworkInterface) z.next();
                if (networkInterface.isUp()) {
                    List<String> list = this.a;
                    if (!(list instanceof Collection) || !list.isEmpty()) {
                        for (String str : list) {
                            String name = networkInterface.getName();
                            z65.g(name, "getName(...)");
                            H = l0b.H(name, str, true);
                            if (H) {
                                return true;
                            }
                        }
                        continue;
                    }
                }
            }
            return false;
        } catch (SocketException unused) {
            this.b.info("Failed to check vpn state");
            return false;
        }
    }
}
