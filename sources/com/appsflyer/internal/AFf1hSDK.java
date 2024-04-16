package com.appsflyer.internal;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
/* loaded from: classes.dex */
public final class AFf1hSDK extends FilterInputStream {
    private long[] AFInAppEventParameterName;
    private byte[] AFInAppEventType;
    private long[] AFKeystoreWrapper;
    private int AFLogger;
    private int afDebugLog;
    private int afErrorLog;
    private short valueOf;
    private final int values;

    public AFf1hSDK(InputStream inputStream, int i, int i2, short s, int i3, int i4) throws IOException {
        super(inputStream);
        this.AFLogger = Integer.MAX_VALUE;
        int min = Math.min(Math.max((int) s, 4), 8);
        this.values = min;
        this.AFInAppEventType = new byte[min];
        this.AFInAppEventParameterName = new long[4];
        this.AFKeystoreWrapper = new long[4];
        this.afErrorLog = min;
        this.afDebugLog = min;
        this.AFInAppEventParameterName = AFf1gSDK.AFKeystoreWrapper(i ^ i4, min ^ i4);
        this.AFKeystoreWrapper = AFf1gSDK.AFKeystoreWrapper(i2 ^ i4, i3 ^ i4);
    }

    private int AFInAppEventType() throws IOException {
        int i;
        if (this.AFLogger == Integer.MAX_VALUE) {
            this.AFLogger = ((FilterInputStream) this).in.read();
        }
        if (this.afErrorLog == this.values) {
            byte[] bArr = this.AFInAppEventType;
            int i2 = this.AFLogger;
            bArr[0] = (byte) i2;
            if (i2 >= 0) {
                int i3 = 1;
                do {
                    int read = ((FilterInputStream) this).in.read(this.AFInAppEventType, i3, this.values - i3);
                    if (read <= 0) {
                        break;
                    }
                    i3 += read;
                } while (i3 < this.values);
                if (i3 >= this.values) {
                    AFKeystoreWrapper();
                    int read2 = ((FilterInputStream) this).in.read();
                    this.AFLogger = read2;
                    this.afErrorLog = 0;
                    if (read2 < 0) {
                        int i4 = this.values;
                        i = i4 - (this.AFInAppEventType[i4 - 1] & 255);
                    } else {
                        i = this.values;
                    }
                    this.afDebugLog = i;
                } else {
                    throw new IllegalStateException("unexpected block size");
                }
            } else {
                throw new IllegalStateException("unexpected block size");
            }
        }
        return this.afDebugLog;
    }

    private void AFKeystoreWrapper() {
        long[] jArr = this.AFInAppEventParameterName;
        long[] jArr2 = this.AFKeystoreWrapper;
        short s = this.valueOf;
        long j = jArr2[(s + 2) % 4];
        int i = (s + 3) % 4;
        jArr2[i] = ((jArr[i] * 2147483085) + j) / 2147483647L;
        jArr[i] = ((jArr[s % 4] * 2147483085) + j) % 2147483647L;
        for (int i2 = 0; i2 < this.values; i2++) {
            byte[] bArr = this.AFInAppEventType;
            bArr[i2] = (byte) (bArr[i2] ^ ((this.AFInAppEventParameterName[this.valueOf] >> (i2 << 3)) & 255));
        }
        this.valueOf = (short) ((this.valueOf + 1) % 4);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() throws IOException {
        AFInAppEventType();
        return this.afDebugLog - this.afErrorLog;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        AFInAppEventType();
        int i = this.afErrorLog;
        if (i >= this.afDebugLog) {
            return -1;
        }
        byte[] bArr = this.AFInAppEventType;
        this.afErrorLog = i + 1;
        return bArr[i] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws IOException {
        long j2 = 0;
        while (j2 < j && read() != -1) {
            j2++;
        }
        return j2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            AFInAppEventType();
            int i5 = this.afErrorLog;
            if (i5 >= this.afDebugLog) {
                if (i4 == i) {
                    return -1;
                }
                return i2 - (i3 - i4);
            }
            byte[] bArr2 = this.AFInAppEventType;
            this.afErrorLog = i5 + 1;
            bArr[i4] = bArr2[i5];
        }
        return i2;
    }
}
