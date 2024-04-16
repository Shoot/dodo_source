package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PersonalPrice.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003B\u0011\b\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lz23;", "", "", "a", "I", "i", "()I", "value", "<init>", "(Ljava/lang/String;II)V", "b", c.a, DateTokenConverter.CONVERTER_KEY, "common"}, k = 1, mv = {1, 9, 0})
/* renamed from: z23  reason: default package */
/* loaded from: classes.dex */
public final class z23 {
    public static final a b;
    public static final z23 c = new z23("FINAL_PRICE", 0, 1);
    public static final z23 d = new z23("PERCENTAGE", 1, 2);
    private static final /* synthetic */ z23[] e;
    private static final /* synthetic */ kj3 f;
    private final int a;

    /* compiled from: PersonalPrice.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lz23$a;", "", "", "value", "Lz23;", "a", "<init>", "()V", "common"}, k = 1, mv = {1, 9, 0})
    /* renamed from: z23$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final z23 a(int i) {
            z23[] values;
            for (z23 z23Var : z23.values()) {
                if (z23Var.i() == i) {
                    return z23Var;
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
    }

    static {
        z23[] a2 = a();
        e = a2;
        f = lj3.a(a2);
        b = new a(null);
    }

    private z23(String str, int i, int i2) {
        this.a = i2;
    }

    private static final /* synthetic */ z23[] a() {
        return new z23[]{c, d};
    }

    public static z23 valueOf(String str) {
        return (z23) Enum.valueOf(z23.class, str);
    }

    public static z23[] values() {
        return (z23[]) e.clone();
    }

    public final int i() {
        return this.a;
    }
}
