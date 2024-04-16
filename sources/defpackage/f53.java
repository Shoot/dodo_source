package defpackage;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import kotlin.Metadata;
/* compiled from: Dns.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Lf53;", "", "", "hostname", "", "Ljava/net/InetAddress;", "a", "okhttp"}, k = 1, mv = {1, 9, 0})
/* renamed from: f53  reason: default package */
/* loaded from: classes3.dex */
public interface f53 {
    public static final a a = a.a;
    public static final f53 b = new a.C0309a();

    /* compiled from: Dns.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0001¨\u0006\b"}, d2 = {"Lf53$a;", "", "Lf53;", "SYSTEM", "Lf53;", "<init>", "()V", "a", "okhttp"}, k = 1, mv = {1, 9, 0})
    /* renamed from: f53$a */
    /* loaded from: classes3.dex */
    public static final class a {
        static final /* synthetic */ a a = new a();

        /* compiled from: Dns.kt */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"Lf53$a$a;", "Lf53;", "", "hostname", "", "Ljava/net/InetAddress;", "a", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 9, 0})
        /* renamed from: f53$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        private static final class C0309a implements f53 {
            @Override // defpackage.f53
            public List<InetAddress> a(String str) {
                List<InetAddress> U;
                z65.h(str, "hostname");
                try {
                    InetAddress[] allByName = InetAddress.getAllByName(str);
                    z65.g(allByName, "getAllByName(...)");
                    U = yr.U(allByName);
                    return U;
                } catch (NullPointerException e) {
                    UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of " + str);
                    unknownHostException.initCause(e);
                    throw unknownHostException;
                }
            }
        }

        private a() {
        }
    }

    List<InetAddress> a(String str) throws UnknownHostException;
}
