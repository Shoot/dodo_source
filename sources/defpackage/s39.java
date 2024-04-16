package defpackage;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.net.SyslogConstants;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: RSBlock.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0081\b\u0018\u0000 \u000b2\u00020\u0001:\u0001\tB\u0017\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000e\u0010\f¨\u0006\u0012"}, d2 = {"Ls39;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "I", c.a, "()I", "totalCount", "b", "dataCount", "<init>", "(II)V", "qrcode-kotlin_release"}, k = 1, mv = {1, 7, 1})
/* renamed from: s39  reason: default package */
/* loaded from: classes3.dex */
public final class s39 {
    public static final a c = new a(null);
    private static final int[][] d = {new int[]{1, 26, 19}, new int[]{1, 26, 16}, new int[]{1, 26, 13}, new int[]{1, 26, 9}, new int[]{1, 44, 34}, new int[]{1, 44, 28}, new int[]{1, 44, 22}, new int[]{1, 44, 16}, new int[]{1, 70, 55}, new int[]{1, 70, 44}, new int[]{2, 35, 17}, new int[]{2, 35, 13}, new int[]{1, 100, 80}, new int[]{2, 50, 32}, new int[]{2, 50, 24}, new int[]{4, 25, 9}, new int[]{1, 134, 108}, new int[]{2, 67, 43}, new int[]{2, 33, 15, 2, 34, 16}, new int[]{2, 33, 11, 2, 34, 12}, new int[]{2, 86, 68}, new int[]{4, 43, 27}, new int[]{4, 43, 19}, new int[]{4, 43, 15}, new int[]{2, 98, 78}, new int[]{4, 49, 31}, new int[]{2, 32, 14, 4, 33, 15}, new int[]{4, 39, 13, 1, 40, 14}, new int[]{2, 121, 97}, new int[]{2, 60, 38, 2, 61, 39}, new int[]{4, 40, 18, 2, 41, 19}, new int[]{4, 40, 14, 2, 41, 15}, new int[]{2, 146, 116}, new int[]{3, 58, 36, 2, 59, 37}, new int[]{4, 36, 16, 4, 37, 17}, new int[]{4, 36, 12, 4, 37, 13}, new int[]{2, 86, 68, 2, 87, 69}, new int[]{4, 69, 43, 1, 70, 44}, new int[]{6, 43, 19, 2, 44, 20}, new int[]{6, 43, 15, 2, 44, 16}, new int[]{4, 101, 81}, new int[]{1, 80, 50, 4, 81, 51}, new int[]{4, 50, 22, 4, 51, 23}, new int[]{3, 36, 12, 8, 37, 13}, new int[]{2, 116, 92, 2, 117, 93}, new int[]{6, 58, 36, 2, 59, 37}, new int[]{4, 46, 20, 6, 47, 21}, new int[]{7, 42, 14, 4, 43, 15}, new int[]{4, 133, 107}, new int[]{8, 59, 37, 1, 60, 38}, new int[]{8, 44, 20, 4, 45, 21}, new int[]{12, 33, 11, 4, 34, 12}, new int[]{3, 145, 115, 1, 146, 116}, new int[]{4, 64, 40, 5, 65, 41}, new int[]{11, 36, 16, 5, 37, 17}, new int[]{11, 36, 12, 5, 37, 13}, new int[]{5, 109, 87, 1, 110, 88}, new int[]{5, 65, 41, 5, 66, 42}, new int[]{5, 54, 24, 7, 55, 25}, new int[]{11, 36, 12, 7, 37, 13}, new int[]{5, 122, 98, 1, 123, 99}, new int[]{7, 73, 45, 3, 74, 46}, new int[]{15, 43, 19, 2, 44, 20}, new int[]{3, 45, 15, 13, 46, 16}, new int[]{1, 135, 107, 5, SyslogConstants.LOG_LOCAL1, 108}, new int[]{10, 74, 46, 1, 75, 47}, new int[]{1, 50, 22, 15, 51, 23}, new int[]{2, 42, 14, 17, 43, 15}, new int[]{5, 150, 120, 1, 151, 121}, new int[]{9, 69, 43, 4, 70, 44}, new int[]{17, 50, 22, 1, 51, 23}, new int[]{2, 42, 14, 19, 43, 15}, new int[]{3, 141, 113, 4, 142, 114}, new int[]{3, 70, 44, 11, 71, 45}, new int[]{17, 47, 21, 4, 48, 22}, new int[]{9, 39, 13, 16, 40, 14}, new int[]{3, 135, 107, 5, SyslogConstants.LOG_LOCAL1, 108}, new int[]{3, 67, 41, 13, 68, 42}, new int[]{15, 54, 24, 5, 55, 25}, new int[]{15, 43, 15, 10, 44, 16}, new int[]{4, SyslogConstants.LOG_LOCAL2, 116, 4, 145, 117}, new int[]{17, 68, 42}, new int[]{17, 50, 22, 6, 51, 23}, new int[]{19, 46, 16, 6, 47, 17}, new int[]{2, 139, 111, 7, 140, 112}, new int[]{17, 74, 46}, new int[]{7, 54, 24, 16, 55, 25}, new int[]{34, 37, 13}, new int[]{4, 151, 121, 5, SyslogConstants.LOG_LOCAL3, 122}, new int[]{4, 75, 47, 14, 76, 48}, new int[]{11, 54, 24, 14, 55, 25}, new int[]{16, 45, 15, 14, 46, 16}, new int[]{6, 147, 117, 4, 148, 118}, new int[]{6, 73, 45, 14, 74, 46}, new int[]{11, 54, 24, 16, 55, 25}, new int[]{30, 46, 16, 2, 47, 17}, new int[]{8, 132, 106, 4, 133, 107}, new int[]{8, 75, 47, 13, 76, 48}, new int[]{7, 54, 24, 22, 55, 25}, new int[]{22, 45, 15, 13, 46, 16}, new int[]{10, 142, 114, 2, 143, 115}, new int[]{19, 74, 46, 4, 75, 47}, new int[]{28, 50, 22, 6, 51, 23}, new int[]{33, 46, 16, 4, 47, 17}, new int[]{8, SyslogConstants.LOG_LOCAL3, 122, 4, 153, 123}, new int[]{22, 73, 45, 3, 74, 46}, new int[]{8, 53, 23, 26, 54, 24}, new int[]{12, 45, 15, 28, 46, 16}, new int[]{3, 147, 117, 10, 148, 118}, new int[]{3, 73, 45, 23, 74, 46}, new int[]{4, 54, 24, 31, 55, 25}, new int[]{11, 45, 15, 31, 46, 16}, new int[]{7, 146, 116, 7, 147, 117}, new int[]{21, 73, 45, 7, 74, 46}, new int[]{1, 53, 23, 37, 54, 24}, new int[]{19, 45, 15, 26, 46, 16}, new int[]{5, 145, 115, 10, 146, 116}, new int[]{19, 75, 47, 10, 76, 48}, new int[]{15, 54, 24, 25, 55, 25}, new int[]{23, 45, 15, 25, 46, 16}, new int[]{13, 145, 115, 3, 146, 116}, new int[]{2, 74, 46, 29, 75, 47}, new int[]{42, 54, 24, 1, 55, 25}, new int[]{23, 45, 15, 28, 46, 16}, new int[]{17, 145, 115}, new int[]{10, 74, 46, 23, 75, 47}, new int[]{10, 54, 24, 35, 55, 25}, new int[]{19, 45, 15, 35, 46, 16}, new int[]{17, 145, 115, 1, 146, 116}, new int[]{14, 74, 46, 21, 75, 47}, new int[]{29, 54, 24, 19, 55, 25}, new int[]{11, 45, 15, 46, 46, 16}, new int[]{13, 145, 115, 6, 146, 116}, new int[]{14, 74, 46, 23, 75, 47}, new int[]{44, 54, 24, 7, 55, 25}, new int[]{59, 46, 16, 1, 47, 17}, new int[]{12, 151, 121, 7, SyslogConstants.LOG_LOCAL3, 122}, new int[]{12, 75, 47, 26, 76, 48}, new int[]{39, 54, 24, 14, 55, 25}, new int[]{22, 45, 15, 41, 46, 16}, new int[]{6, 151, 121, 14, SyslogConstants.LOG_LOCAL3, 122}, new int[]{6, 75, 47, 34, 76, 48}, new int[]{46, 54, 24, 10, 55, 25}, new int[]{2, 45, 15, 64, 46, 16}, new int[]{17, SyslogConstants.LOG_LOCAL3, 122, 4, 153, 123}, new int[]{29, 74, 46, 14, 75, 47}, new int[]{49, 54, 24, 10, 55, 25}, new int[]{24, 45, 15, 46, 46, 16}, new int[]{4, SyslogConstants.LOG_LOCAL3, 122, 18, 153, 123}, new int[]{13, 74, 46, 32, 75, 47}, new int[]{48, 54, 24, 14, 55, 25}, new int[]{42, 45, 15, 32, 46, 16}, new int[]{20, 147, 117, 4, 148, 118}, new int[]{40, 75, 47, 7, 76, 48}, new int[]{43, 54, 24, 22, 55, 25}, new int[]{10, 45, 15, 67, 46, 16}, new int[]{19, 148, 118, 6, 149, 119}, new int[]{18, 75, 47, 31, 76, 48}, new int[]{34, 54, 24, 34, 55, 25}, new int[]{20, 45, 15, 61, 46, 16}};
    private final int a;
    private final int b;

    /* compiled from: RSBlock.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Ls39$a;", "", "", "typeNumber", "Lgk3;", "errorCorrectionLevel", "", "Ls39;", "a", "(ILgk3;)[Ls39;", "", "RS_BLOCK_TABLE", "[[I", "<init>", "()V", "qrcode-kotlin_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: s39$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final s39[] a(int i, gk3 gk3Var) {
            s39 s39Var;
            z65.h(gk3Var, "errorCorrectionLevel");
            int[] iArr = s39.d[((i - 1) * 4) + gk3Var.ordinal()];
            if (iArr.length == 3) {
                s39 s39Var2 = new s39(iArr[1], iArr[2]);
                int i2 = iArr[0];
                s39[] s39VarArr = new s39[i2];
                for (int i3 = 0; i3 < i2; i3++) {
                    s39VarArr[i3] = s39Var2;
                }
                return s39VarArr;
            }
            int i4 = iArr[0] + iArr[3];
            s39 s39Var3 = new s39(iArr[1], iArr[2]);
            s39 s39Var4 = new s39(iArr[4], iArr[5]);
            s39[] s39VarArr2 = new s39[i4];
            for (int i5 = 0; i5 < i4; i5++) {
                if (i5 < iArr[0]) {
                    s39Var = s39Var3;
                } else {
                    s39Var = s39Var4;
                }
                s39VarArr2[i5] = s39Var;
            }
            return s39VarArr2;
        }
    }

    public s39(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final int b() {
        return this.b;
    }

    public final int c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s39)) {
            return false;
        }
        s39 s39Var = (s39) obj;
        if (this.a == s39Var.a && this.b == s39Var.b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.a * 31) + this.b;
    }

    public String toString() {
        return "RSBlock(totalCount=" + this.a + ", dataCount=" + this.b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
