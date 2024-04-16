package defpackage;

import android.annotation.SuppressLint;
import com.huawei.hms.actions.SearchIntents;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: SimpleSQLiteQuery.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\t\u0018\u0000 \u00132\u00020\u0001:\u0001\u0007B#\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0012\u0010\r\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u000b\u0018\u00010\n¢\u0006\u0004\b\u0010\u0010\u0011B\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0012J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR \u0010\r\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u000b\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u000e¨\u0006\u0014"}, d2 = {"Lula;", "Lb3b;", "La3b;", "statement", "", "b", "", "a", "Ljava/lang/String;", SearchIntents.EXTRA_QUERY, "", "", "[Ljava/lang/Object;", "bindArgs", "()Ljava/lang/String;", "sql", "<init>", "(Ljava/lang/String;[Ljava/lang/Object;)V", "(Ljava/lang/String;)V", c.a, "sqlite_release"}, k = 1, mv = {1, 7, 1})
/* renamed from: ula  reason: default package */
/* loaded from: classes.dex */
public final class ula implements b3b {
    public static final a c = new a(null);
    private final String a;
    private final Object[] b;

    /* compiled from: SimpleSQLiteQuery.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\"\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H\u0002J+\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\n\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0001\u0018\u00010\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lula$a;", "", "La3b;", "statement", "", "index", "arg", "", "a", "", "bindArgs", "b", "(La3b;[Ljava/lang/Object;)V", "<init>", "()V", "sqlite_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: ula$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final void a(a3b a3bVar, int i, Object obj) {
            long j;
            if (obj == null) {
                a3bVar.z1(i);
            } else if (obj instanceof byte[]) {
                a3bVar.h1(i, (byte[]) obj);
            } else if (obj instanceof Float) {
                a3bVar.O(i, ((Number) obj).floatValue());
            } else if (obj instanceof Double) {
                a3bVar.O(i, ((Number) obj).doubleValue());
            } else if (obj instanceof Long) {
                a3bVar.c1(i, ((Number) obj).longValue());
            } else if (obj instanceof Integer) {
                a3bVar.c1(i, ((Number) obj).intValue());
            } else if (obj instanceof Short) {
                a3bVar.c1(i, ((Number) obj).shortValue());
            } else if (obj instanceof Byte) {
                a3bVar.c1(i, ((Number) obj).byteValue());
            } else if (obj instanceof String) {
                a3bVar.L0(i, (String) obj);
            } else if (obj instanceof Boolean) {
                if (((Boolean) obj).booleanValue()) {
                    j = 1;
                } else {
                    j = 0;
                }
                a3bVar.c1(i, j);
            } else {
                throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i + " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
            }
        }

        @SuppressLint({"SyntheticAccessor"})
        public final void b(a3b a3bVar, Object[] objArr) {
            z65.h(a3bVar, "statement");
            if (objArr == null) {
                return;
            }
            int length = objArr.length;
            int i = 0;
            while (i < length) {
                Object obj = objArr[i];
                i++;
                a(a3bVar, i, obj);
            }
        }
    }

    public ula(String str, Object[] objArr) {
        z65.h(str, SearchIntents.EXTRA_QUERY);
        this.a = str;
        this.b = objArr;
    }

    @Override // defpackage.b3b
    public String a() {
        return this.a;
    }

    @Override // defpackage.b3b
    public void b(a3b a3bVar) {
        z65.h(a3bVar, "statement");
        c.b(a3bVar, this.b);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ula(String str) {
        this(str, null);
        z65.h(str, SearchIntents.EXTRA_QUERY);
    }
}
