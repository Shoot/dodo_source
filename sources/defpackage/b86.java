package defpackage;

import ch.qos.logback.core.CoreConstants;
import java.util.Map;
/* compiled from: Maps.java */
/* renamed from: b86  reason: default package */
/* loaded from: classes2.dex */
public final class b86 {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Maps.java */
    /* renamed from: b86$a */
    /* loaded from: classes2.dex */
    private static abstract class a implements x84<Map.Entry<?, ?>, Object> {
        public static final a a = new C0066a("KEY", 0);
        public static final a b = new b("VALUE", 1);
        private static final /* synthetic */ a[] c = a();

        /* compiled from: Maps.java */
        /* renamed from: b86$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        enum C0066a extends a {
            C0066a(String str, int i) {
                super(str, i, null);
            }

            @Override // defpackage.x84
            /* renamed from: i */
            public Object apply(Map.Entry<?, ?> entry) {
                return entry.getKey();
            }
        }

        /* compiled from: Maps.java */
        /* renamed from: b86$a$b */
        /* loaded from: classes2.dex */
        enum b extends a {
            b(String str, int i) {
                super(str, i, null);
            }

            @Override // defpackage.x84
            /* renamed from: i */
            public Object apply(Map.Entry<?, ?> entry) {
                return entry.getValue();
            }
        }

        private a(String str, int i) {
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a, b};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) c.clone();
        }

        /* synthetic */ a(String str, int i, a86 a86Var) {
            this(str, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(Map<?, ?> map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <K> x84<Map.Entry<K, ?>, K> b() {
        return a.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String c(Map<?, ?> map) {
        StringBuilder a2 = hc1.a(map.size());
        a2.append(CoreConstants.CURLY_LEFT);
        boolean z = true;
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            if (!z) {
                a2.append(", ");
            }
            a2.append(entry.getKey());
            a2.append('=');
            a2.append(entry.getValue());
            z = false;
        }
        a2.append(CoreConstants.CURLY_RIGHT);
        return a2.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <V> x84<Map.Entry<?, V>, V> d() {
        return a.b;
    }
}
