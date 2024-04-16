package defpackage;

import android.util.Base64;
import androidx.annotation.NonNull;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.UUID;
/* compiled from: RandomFidGenerator.java */
/* renamed from: d49  reason: default package */
/* loaded from: classes2.dex */
public class d49 {
    private static final byte a = Byte.parseByte("01110000", 2);
    private static final byte b = Byte.parseByte("00001111", 2);

    private static String b(byte[] bArr) {
        return new String(Base64.encode(bArr, 11), Charset.defaultCharset()).substring(0, 22);
    }

    private static byte[] c(UUID uuid, byte[] bArr) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        wrap.putLong(uuid.getMostSignificantBits());
        wrap.putLong(uuid.getLeastSignificantBits());
        return wrap.array();
    }

    @NonNull
    public String a() {
        byte[] c = c(UUID.randomUUID(), new byte[17]);
        byte b2 = c[0];
        c[16] = b2;
        c[0] = (byte) ((b2 & b) | a);
        return b(c);
    }
}
