package defpackage;

import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
/* compiled from: AlignmentLine.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u001c\u0010\u0004\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0000\"\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b\"\u0017\u0010\u000b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\n\u0010\u0007\u001a\u0004\b\n\u0010\b¨\u0006\f"}, d2 = {"Lhb;", "", "position1", "position2", c.a, "Lyo4;", "a", "Lyo4;", "()Lyo4;", "FirstBaseline", "b", "LastBaseline", "ui_release"}, k = 2, mv = {1, 8, 0})
/* renamed from: ib  reason: default package */
/* loaded from: classes.dex */
public final class ib {
    private static final yo4 a = new yo4(a.a);
    private static final yo4 b = new yo4(b.a);

    /* compiled from: AlignmentLine.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: ib$a */
    /* loaded from: classes.dex */
    /* synthetic */ class a extends m94 implements Function2<Integer, Integer, Integer> {
        public static final a a = new a();

        a() {
            super(2, ja6.class, "min", "min(II)I", 1);
        }

        public final Integer b(int i, int i2) {
            return Integer.valueOf(Math.min(i, i2));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Integer invoke(Integer num, Integer num2) {
            return b(num.intValue(), num2.intValue());
        }
    }

    /* compiled from: AlignmentLine.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: ib$b */
    /* loaded from: classes.dex */
    /* synthetic */ class b extends m94 implements Function2<Integer, Integer, Integer> {
        public static final b a = new b();

        b() {
            super(2, ja6.class, "max", "max(II)I", 1);
        }

        public final Integer b(int i, int i2) {
            return Integer.valueOf(Math.max(i, i2));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Integer invoke(Integer num, Integer num2) {
            return b(num.intValue(), num2.intValue());
        }
    }

    public static final yo4 a() {
        return a;
    }

    public static final yo4 b() {
        return b;
    }

    public static final int c(hb hbVar, int i, int i2) {
        z65.h(hbVar, "<this>");
        return hbVar.a().invoke(Integer.valueOf(i), Integer.valueOf(i2)).intValue();
    }
}
