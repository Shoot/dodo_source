package defpackage;

import java.io.IOException;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
/* compiled from: InetSocketAddressSerializer.java */
/* renamed from: w05  reason: default package */
/* loaded from: classes2.dex */
public class w05 extends bxa<InetSocketAddress> {
    public w05() {
        super(InetSocketAddress.class);
    }

    @Override // defpackage.cxa, defpackage.gc5
    /* renamed from: G */
    public void f(InetSocketAddress inetSocketAddress, ua5 ua5Var, bda bdaVar) throws IOException {
        String trim;
        String substring;
        InetAddress address = inetSocketAddress.getAddress();
        if (address == null) {
            trim = inetSocketAddress.getHostName();
        } else {
            trim = address.toString().trim();
        }
        int indexOf = trim.indexOf(47);
        if (indexOf >= 0) {
            if (indexOf == 0) {
                if (address instanceof Inet6Address) {
                    substring = "[" + trim.substring(1) + "]";
                } else {
                    substring = trim.substring(1);
                }
                trim = substring;
            } else {
                trim = trim.substring(0, indexOf);
            }
        }
        ua5Var.q1(trim + ":" + inetSocketAddress.getPort());
    }

    @Override // defpackage.bxa, defpackage.gc5
    /* renamed from: H */
    public void i(InetSocketAddress inetSocketAddress, ua5 ua5Var, bda bdaVar, bob bobVar) throws IOException {
        c9c g = bobVar.g(ua5Var, bobVar.f(inetSocketAddress, InetSocketAddress.class, nc5.VALUE_STRING));
        f(inetSocketAddress, ua5Var, bdaVar);
        bobVar.h(ua5Var, g);
    }
}
