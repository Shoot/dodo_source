package defpackage;

import com.huawei.hms.push.e;
import java.io.RandomAccessFile;
import kotlin.Metadata;
/* compiled from: JvmFileHandle.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0003\u001a\u00020\u0002H\u0014J(\u0010\n\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0014J\b\u0010\f\u001a\u00020\u000bH\u0014R\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0015"}, d2 = {"Lhd5;", "Lwt3;", "", "l", "fileOffset", "", "array", "", "arrayOffset", "byteCount", "k", "", "j", "Ljava/io/RandomAccessFile;", e.a, "Ljava/io/RandomAccessFile;", "randomAccessFile", "", "readWrite", "<init>", "(ZLjava/io/RandomAccessFile;)V", "okio"}, k = 1, mv = {1, 9, 0})
/* renamed from: hd5  reason: default package */
/* loaded from: classes3.dex */
public final class hd5 extends wt3 {
    private final RandomAccessFile e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hd5(boolean z, RandomAccessFile randomAccessFile) {
        super(z);
        z65.h(randomAccessFile, "randomAccessFile");
        this.e = randomAccessFile;
    }

    @Override // defpackage.wt3
    protected synchronized void j() {
        this.e.close();
    }

    @Override // defpackage.wt3
    protected synchronized int k(long j, byte[] bArr, int i, int i2) {
        z65.h(bArr, "array");
        this.e.seek(j);
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                break;
            }
            int read = this.e.read(bArr, i, i2 - i3);
            if (read == -1) {
                if (i3 == 0) {
                    return -1;
                }
            } else {
                i3 += read;
            }
        }
        return i3;
    }

    @Override // defpackage.wt3
    protected synchronized long l() {
        return this.e.length();
    }
}
