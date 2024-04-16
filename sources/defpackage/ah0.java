package defpackage;

import com.huawei.hms.support.api.entity.core.JosStatusCodes;
import im.threads.ui.fragments.ChatFragment;
import java.util.concurrent.atomic.AtomicReferenceArray;
/* compiled from: BufferRecycler.java */
/* renamed from: ah0  reason: default package */
/* loaded from: classes2.dex */
public class ah0 {
    private static final int[] c = {JosStatusCodes.RTN_CODE_COMMON_ERROR, JosStatusCodes.RTN_CODE_COMMON_ERROR, 2000, 2000};
    private static final int[] d = {4000, 4000, ChatFragment.REQUEST_PERMISSION_BOTTOM_GALLERY_GALLERY, ChatFragment.REQUEST_PERMISSION_BOTTOM_GALLERY_GALLERY};
    protected final AtomicReferenceArray<byte[]> a;
    protected final AtomicReferenceArray<char[]> b;

    public ah0() {
        this(4, 4);
    }

    public final byte[] a(int i) {
        return b(i, 0);
    }

    public byte[] b(int i, int i2) {
        int f = f(i);
        if (i2 < f) {
            i2 = f;
        }
        byte[] andSet = this.a.getAndSet(i, null);
        if (andSet == null || andSet.length < i2) {
            return e(i2);
        }
        return andSet;
    }

    public final char[] c(int i) {
        return d(i, 0);
    }

    public char[] d(int i, int i2) {
        int h = h(i);
        if (i2 < h) {
            i2 = h;
        }
        char[] andSet = this.b.getAndSet(i, null);
        if (andSet == null || andSet.length < i2) {
            return g(i2);
        }
        return andSet;
    }

    protected byte[] e(int i) {
        return new byte[i];
    }

    protected int f(int i) {
        return c[i];
    }

    protected char[] g(int i) {
        return new char[i];
    }

    protected int h(int i) {
        return d[i];
    }

    public void i(int i, byte[] bArr) {
        this.a.set(i, bArr);
    }

    public void j(int i, char[] cArr) {
        this.b.set(i, cArr);
    }

    protected ah0(int i, int i2) {
        this.a = new AtomicReferenceArray<>(i);
        this.b = new AtomicReferenceArray<>(i2);
    }
}
