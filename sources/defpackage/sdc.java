package defpackage;

import com.huawei.hms.opendevice.c;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
/* compiled from: -JvmPlatform.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0010\u0012\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0000*\u00020\u0001H\u0000\u001a\f\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0000*\n\u0010\b\"\u00020\u00072\u00020\u0007*\n\u0010\n\"\u00020\t2\u00020\t*\n\u0010\f\"\u00020\u000b2\u00020\u000b*\n\u0010\u000e\"\u00020\r2\u00020\r*\n\u0010\u0010\"\u00020\u000f2\u00020\u000f*\n\u0010\u0011\"\u00020\u00042\u00020\u0004*\n\u0010\u0013\"\u00020\u00122\u00020\u0012¨\u0006\u0014"}, d2 = {"", "", c.a, "a", "Ljava/util/concurrent/locks/ReentrantLock;", "Lokio/Lock;", "b", "Ljava/lang/ArrayIndexOutOfBoundsException;", "ArrayIndexOutOfBoundsException", "Ljava/io/Closeable;", "Closeable", "Ljava/io/EOFException;", "EOFException", "Ljava/io/FileNotFoundException;", "FileNotFoundException", "Ljava/io/IOException;", "IOException", "Lock", "Ljava/net/ProtocolException;", "ProtocolException", "okio"}, k = 2, mv = {1, 9, 0})
/* renamed from: sdc  reason: default package */
/* loaded from: classes3.dex */
public final class sdc {
    public static final byte[] a(String str) {
        z65.h(str, "<this>");
        byte[] bytes = str.getBytes(rw0.b);
        z65.g(bytes, "getBytes(...)");
        return bytes;
    }

    public static final ReentrantLock b() {
        return new ReentrantLock();
    }

    public static final String c(byte[] bArr) {
        z65.h(bArr, "<this>");
        return new String(bArr, rw0.b);
    }
}
