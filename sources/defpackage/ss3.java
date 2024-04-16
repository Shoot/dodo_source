package defpackage;

import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: FieldValue.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0016\u0018\u0000 \t2\u00020\u0001:\u0001\u0004B\u0019\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0005\u001a\u0004\b\t\u0010\u0007¨\u0006\r"}, d2 = {"Lss3;", "", "", "toString", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "id", c.a, "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "formbuilder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: ss3  reason: default package */
/* loaded from: classes.dex */
public class ss3 {
    public static final a c = new a(null);
    private static final ss3 d = new ss3(null, "", 1, null);
    private final String a;
    private final String b;

    /* compiled from: FieldValue.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lss3$a;", "", "", "value", "Lss3;", "b", "EMPTY_ITEM", "Lss3;", "a", "()Lss3;", "<init>", "()V", "formbuilder_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: ss3$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ss3 a() {
            return ss3.d;
        }

        public final ss3 b(String str) {
            z65.h(str, "value");
            return new ss3(null, str, 1, null);
        }
    }

    public ss3(String str, String str2) {
        z65.h(str, "id");
        z65.h(str2, "value");
        this.a = str;
        this.b = str2;
    }

    public final String b() {
        return this.a;
    }

    public final String c() {
        return this.b;
    }

    public String toString() {
        return this.b;
    }

    public /* synthetic */ ss3(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, str2);
    }
}
