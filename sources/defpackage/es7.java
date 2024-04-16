package defpackage;

import com.huawei.hms.opendevice.c;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
/* compiled from: PathParser.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\bR\u0014\u0010\f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000bR\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Les7;", "", "", "pathData", "a", "", "Lzr7;", "b", "Ljava/util/List;", "nodes", "Lmz3;", "Lmz3;", "floatResult", "", c.a, "[F", "nodeData", "<init>", "()V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: es7  reason: default package */
/* loaded from: classes.dex */
public final class es7 {
    private final List<zr7> a = new ArrayList();
    private final mz3 b = new mz3(0.0f, false, 3, null);
    private float[] c = new float[64];

    public final es7 a(String str) {
        int i;
        char charAt;
        z65.h(str, "pathData");
        this.a.clear();
        int length = str.length();
        int i2 = 0;
        while (i2 < length && z65.j(str.charAt(i2), 32) <= 0) {
            i2++;
        }
        while (length > i2 && z65.j(str.charAt(length - 1), 32) <= 0) {
            length--;
        }
        int i3 = 0;
        while (i2 < length) {
            while (true) {
                i = i2 + 1;
                charAt = str.charAt(i2);
                int i4 = charAt | ' ';
                if ((i4 - 97) * (i4 - 122) <= 0 && i4 != 101) {
                    break;
                } else if (i >= length) {
                    charAt = 0;
                    break;
                } else {
                    i2 = i;
                }
            }
            if (charAt != 0) {
                if ((charAt | ' ') != 122) {
                    i3 = 0;
                    while (true) {
                        if (i < length && z65.j(str.charAt(i), 32) <= 0) {
                            i++;
                        } else {
                            i = zo3.a.a(str, i, length, this.b);
                            if (this.b.b()) {
                                int i5 = i3 + 1;
                                this.c[i3] = this.b.a();
                                float[] fArr = this.c;
                                if (i5 >= fArr.length) {
                                    float[] fArr2 = new float[i5 * 2];
                                    this.c = fArr2;
                                    xr.e(fArr, fArr2, 0, 0, fArr.length);
                                }
                                i3 = i5;
                            }
                            while (i < length && str.charAt(i) == ',') {
                                i++;
                            }
                            if (i >= length || !this.b.b()) {
                                break;
                            }
                        }
                    }
                }
                as7.a(charAt, this.a, this.c, i3);
            }
            i2 = i;
        }
        return this;
    }

    public final List<zr7> b() {
        return this.a;
    }
}
