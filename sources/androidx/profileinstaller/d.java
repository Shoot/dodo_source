package androidx.profileinstaller;

import androidx.annotation.NonNull;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
/* compiled from: Encoding.java */
/* loaded from: classes.dex */
class d {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(int i) {
        return ((i + 7) & (-8)) / 8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte[] b(@NonNull byte[] bArr) throws IOException {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            deflaterOutputStream.write(bArr);
            deflaterOutputStream.close();
            deflater.end();
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable th) {
            deflater.end();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public static RuntimeException c(String str) {
        return new IllegalStateException(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public static byte[] d(@NonNull InputStream inputStream, int i) throws IOException {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int read = inputStream.read(bArr, i2, i - i2);
            if (read >= 0) {
                i2 += read;
            } else {
                throw c("Not enough bytes to read: " + i);
            }
        }
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005b, code lost:
        if (r0.finished() == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0060, code lost:
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0067, code lost:
        throw c("Inflater did not finish");
     */
    @androidx.annotation.NonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] e(@androidx.annotation.NonNull java.io.InputStream r8, int r9, int r10) throws java.io.IOException {
        /*
            java.util.zip.Inflater r0 = new java.util.zip.Inflater
            r0.<init>()
            byte[] r1 = new byte[r10]     // Catch: java.lang.Throwable -> L2e
            r2 = 2048(0x800, float:2.87E-42)
            byte[] r2 = new byte[r2]     // Catch: java.lang.Throwable -> L2e
            r3 = 0
            r4 = 0
            r5 = 0
        Le:
            boolean r6 = r0.finished()     // Catch: java.lang.Throwable -> L2e
            if (r6 != 0) goto L55
            boolean r6 = r0.needsDictionary()     // Catch: java.lang.Throwable -> L2e
            if (r6 != 0) goto L55
            if (r4 >= r9) goto L55
            int r6 = r8.read(r2)     // Catch: java.lang.Throwable -> L2e
            if (r6 < 0) goto L3a
            r0.setInput(r2, r3, r6)     // Catch: java.lang.Throwable -> L2e
            int r7 = r10 - r5
            int r7 = r0.inflate(r1, r5, r7)     // Catch: java.lang.Throwable -> L2e java.util.zip.DataFormatException -> L30
            int r5 = r5 + r7
            int r4 = r4 + r6
            goto Le
        L2e:
            r8 = move-exception
            goto L86
        L30:
            r8 = move-exception
            java.lang.String r8 = r8.getMessage()     // Catch: java.lang.Throwable -> L2e
            java.lang.RuntimeException r8 = c(r8)     // Catch: java.lang.Throwable -> L2e
            throw r8     // Catch: java.lang.Throwable -> L2e
        L3a:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2e
            r8.<init>()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r10 = "Invalid zip data. Stream ended after $totalBytesRead bytes. Expected "
            r8.append(r10)     // Catch: java.lang.Throwable -> L2e
            r8.append(r9)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r9 = " bytes"
            r8.append(r9)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L2e
            java.lang.RuntimeException r8 = c(r8)     // Catch: java.lang.Throwable -> L2e
            throw r8     // Catch: java.lang.Throwable -> L2e
        L55:
            if (r4 != r9) goto L68
            boolean r8 = r0.finished()     // Catch: java.lang.Throwable -> L2e
            if (r8 == 0) goto L61
            r0.end()
            return r1
        L61:
            java.lang.String r8 = "Inflater did not finish"
            java.lang.RuntimeException r8 = c(r8)     // Catch: java.lang.Throwable -> L2e
            throw r8     // Catch: java.lang.Throwable -> L2e
        L68:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2e
            r8.<init>()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r10 = "Didn't read enough bytes during decompression. expected="
            r8.append(r10)     // Catch: java.lang.Throwable -> L2e
            r8.append(r9)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r9 = " actual="
            r8.append(r9)     // Catch: java.lang.Throwable -> L2e
            r8.append(r4)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L2e
            java.lang.RuntimeException r8 = c(r8)     // Catch: java.lang.Throwable -> L2e
            throw r8     // Catch: java.lang.Throwable -> L2e
        L86:
            r0.end()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.profileinstaller.d.e(java.io.InputStream, int, int):byte[]");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public static String f(InputStream inputStream, int i) throws IOException {
        return new String(d(inputStream, i), StandardCharsets.UTF_8);
    }

    static long g(@NonNull InputStream inputStream, int i) throws IOException {
        byte[] d = d(inputStream, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j += (d[i2] & 255) << (i2 * 8);
        }
        return j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int h(@NonNull InputStream inputStream) throws IOException {
        return (int) g(inputStream, 2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long i(@NonNull InputStream inputStream) throws IOException {
        return g(inputStream, 4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int j(@NonNull InputStream inputStream) throws IOException {
        return (int) g(inputStream, 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int k(@NonNull String str) {
        return str.getBytes(StandardCharsets.UTF_8).length;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void l(@NonNull InputStream inputStream, @NonNull OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[512];
        while (true) {
            int read = inputStream.read(bArr);
            if (read > 0) {
                outputStream.write(bArr, 0, read);
            } else {
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void m(@NonNull OutputStream outputStream, byte[] bArr) throws IOException {
        q(outputStream, bArr.length);
        byte[] b = b(bArr);
        q(outputStream, b.length);
        outputStream.write(b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void n(@NonNull OutputStream outputStream, @NonNull String str) throws IOException {
        outputStream.write(str.getBytes(StandardCharsets.UTF_8));
    }

    static void o(@NonNull OutputStream outputStream, long j, int i) throws IOException {
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) ((j >> (i2 * 8)) & 255);
        }
        outputStream.write(bArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void p(@NonNull OutputStream outputStream, int i) throws IOException {
        o(outputStream, i, 2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void q(@NonNull OutputStream outputStream, long j) throws IOException {
        o(outputStream, j, 4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void r(@NonNull OutputStream outputStream, int i) throws IOException {
        o(outputStream, i, 1);
    }
}
