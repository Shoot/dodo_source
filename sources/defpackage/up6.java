package defpackage;

import com.huawei.hms.opendevice.c;
import java.util.List;
import kotlin.Metadata;
/* compiled from: MultiParagraph.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\u001a\u001e\u0010\u0005\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0000\u001a\u001e\u0010\b\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0000\u001a\u001e\u0010\n\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\t\u001a\u00020\u0003H\u0000¨\u0006\u000b"}, d2 = {"", "Lcq7;", "paragraphInfoList", "", "index", "a", "", "y", c.a, "lineIndex", "b", "ui-text_release"}, k = 2, mv = {1, 8, 0})
/* renamed from: up6  reason: default package */
/* loaded from: classes.dex */
public final class up6 {
    public static final int a(List<cq7> list, int i) {
        char c;
        z65.h(list, "paragraphInfoList");
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            cq7 cq7Var = list.get(i3);
            if (cq7Var.f() > i) {
                c = 1;
            } else if (cq7Var.b() <= i) {
                c = 65535;
            } else {
                c = 0;
            }
            if (c < 0) {
                i2 = i3 + 1;
            } else if (c > 0) {
                size = i3 - 1;
            } else {
                return i3;
            }
        }
        return -(i2 + 1);
    }

    public static final int b(List<cq7> list, int i) {
        char c;
        z65.h(list, "paragraphInfoList");
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            cq7 cq7Var = list.get(i3);
            if (cq7Var.g() > i) {
                c = 1;
            } else if (cq7Var.c() <= i) {
                c = 65535;
            } else {
                c = 0;
            }
            if (c < 0) {
                i2 = i3 + 1;
            } else if (c > 0) {
                size = i3 - 1;
            } else {
                return i3;
            }
        }
        return -(i2 + 1);
    }

    public static final int c(List<cq7> list, float f) {
        char c;
        z65.h(list, "paragraphInfoList");
        int size = list.size() - 1;
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) >>> 1;
            cq7 cq7Var = list.get(i2);
            if (cq7Var.h() > f) {
                c = 1;
            } else if (cq7Var.a() <= f) {
                c = 65535;
            } else {
                c = 0;
            }
            if (c < 0) {
                i = i2 + 1;
            } else if (c > 0) {
                size = i2 - 1;
            } else {
                return i2;
            }
        }
        return -(i + 1);
    }
}
