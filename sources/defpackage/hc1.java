package defpackage;

import ch.qos.logback.core.util.FileSize;
/* compiled from: Collections2.java */
/* renamed from: hc1  reason: default package */
/* loaded from: classes2.dex */
public final class hc1 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static StringBuilder a(int i) {
        yb1.b(i, "size");
        return new StringBuilder((int) Math.min(i * 8, (long) FileSize.GB_COEFFICIENT));
    }
}
