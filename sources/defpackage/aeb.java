package defpackage;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* compiled from: ThreadMap.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0016\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\u000e\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0002J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001J\u0018\u0010\n\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000eR\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0011¨\u0006\u0015"}, d2 = {"Laeb;", "", "", Action.KEY_ATTRIBUTE, "", "a", "b", "value", "", DateTokenConverter.CONVERTER_KEY, c.a, "I", "size", "", "[J", "keys", "", "[Ljava/lang/Object;", "values", "<init>", "(I[J[Ljava/lang/Object;)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: aeb  reason: default package */
/* loaded from: classes.dex */
public final class aeb {
    private final int a;
    private final long[] b;
    private final Object[] c;

    public aeb(int i, long[] jArr, Object[] objArr) {
        z65.h(jArr, "keys");
        z65.h(objArr, "values");
        this.a = i;
        this.b = jArr;
        this.c = objArr;
    }

    private final int a(long j) {
        int i = this.a - 1;
        if (i == -1) {
            return -1;
        }
        int i2 = 0;
        if (i != 0) {
            while (i2 <= i) {
                int i3 = (i2 + i) >>> 1;
                int i4 = ((this.b[i3] - j) > 0L ? 1 : ((this.b[i3] - j) == 0L ? 0 : -1));
                if (i4 < 0) {
                    i2 = i3 + 1;
                } else if (i4 > 0) {
                    i = i3 - 1;
                } else {
                    return i3;
                }
            }
            return -(i2 + 1);
        }
        long j2 = this.b[0];
        if (j2 == j) {
            return 0;
        }
        if (j2 <= j) {
            return -1;
        }
        return -2;
    }

    public final Object b(long j) {
        int a = a(j);
        if (a >= 0) {
            return this.c[a];
        }
        return null;
    }

    public final aeb c(long j, Object obj) {
        int i = this.a;
        int i2 = 0;
        int i3 = 0;
        for (Object obj2 : this.c) {
            if (obj2 != null) {
                i3++;
            }
        }
        int i4 = i3 + 1;
        long[] jArr = new long[i4];
        Object[] objArr = new Object[i4];
        if (i4 > 1) {
            int i5 = 0;
            while (true) {
                if (i2 >= i4 || i5 >= i) {
                    break;
                }
                long j2 = this.b[i5];
                Object obj3 = this.c[i5];
                if (j2 > j) {
                    jArr[i2] = j;
                    objArr[i2] = obj;
                    i2++;
                    break;
                }
                if (obj3 != null) {
                    jArr[i2] = j2;
                    objArr[i2] = obj3;
                    i2++;
                }
                i5++;
            }
            if (i5 == i) {
                jArr[i3] = j;
                objArr[i3] = obj;
            } else {
                while (i2 < i4) {
                    long j3 = this.b[i5];
                    Object obj4 = this.c[i5];
                    if (obj4 != null) {
                        jArr[i2] = j3;
                        objArr[i2] = obj4;
                        i2++;
                    }
                    i5++;
                }
            }
        } else {
            jArr[0] = j;
            objArr[0] = obj;
        }
        return new aeb(i4, jArr, objArr);
    }

    public final boolean d(long j, Object obj) {
        int a = a(j);
        if (a < 0) {
            return false;
        }
        this.c[a] = obj;
        return true;
    }
}
