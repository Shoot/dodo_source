package org.bouncycastle.asn1;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class v1 {
    private static final long a = Runtime.getRuntime().maxMemory();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(int i) {
        int i2 = 1;
        if (i > 127) {
            int i3 = 1;
            while (true) {
                i >>>= 8;
                if (i == 0) {
                    break;
                }
                i3++;
            }
            for (int i4 = (i3 - 1) * 8; i4 >= 0; i4 -= 8) {
                i2++;
            }
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(int i) throws IOException {
        if (i >= 31) {
            if (i < 128) {
                return 2;
            }
            byte[] bArr = new byte[5];
            int i2 = 4;
            bArr[4] = (byte) (i & 127);
            do {
                i >>= 7;
                i2--;
                bArr[i2] = (byte) ((i & 127) | 128);
            } while (i > 127);
            return 6 - i2;
        }
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int c(InputStream inputStream) {
        long j;
        if (inputStream instanceof u1) {
            return ((u1) inputStream).a();
        }
        if (inputStream instanceof h) {
            return ((h) inputStream).i();
        }
        if (inputStream instanceof ByteArrayInputStream) {
            return ((ByteArrayInputStream) inputStream).available();
        }
        if (inputStream instanceof FileInputStream) {
            try {
                FileChannel channel = ((FileInputStream) inputStream).getChannel();
                if (channel != null) {
                    j = channel.size();
                } else {
                    j = 2147483647L;
                }
                if (j < 2147483647L) {
                    return (int) j;
                }
            } catch (IOException unused) {
            }
        }
        long j2 = a;
        if (j2 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) j2;
    }
}
