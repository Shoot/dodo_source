package defpackage;

import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PizzeriaStatus.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lh98;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", c.a, "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: h98  reason: default package */
/* loaded from: classes4.dex */
public final class h98 {
    public static final a a;
    public static final h98 b = new h98("CLOSED", 0);
    public static final h98 c = new h98("OPEN", 1);
    private static final /* synthetic */ h98[] d;
    private static final /* synthetic */ kj3 e;

    /* compiled from: PizzeriaStatus.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lh98$a;", "", "", "value", "Lh98;", "a", "(Ljava/lang/Integer;)Lh98;", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: h98$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final h98 a(Integer num) {
            if (num != null && num.intValue() == 1) {
                return h98.c;
            }
            return h98.b;
        }
    }

    static {
        h98[] a2 = a();
        d = a2;
        e = lj3.a(a2);
        a = new a(null);
    }

    private h98(String str, int i) {
    }

    private static final /* synthetic */ h98[] a() {
        return new h98[]{b, c};
    }

    public static h98 valueOf(String str) {
        return (h98) Enum.valueOf(h98.class, str);
    }

    public static h98[] values() {
        return (h98[]) d.clone();
    }
}
