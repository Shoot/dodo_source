package defpackage;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: Result.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087@\u0018\u0000 \u001c*\u0006\b\u0000\u0010\u0001 \u00012\u00060\u0002j\u0002`\u0003:\u0002\u0012\u001cB\u0013\b\u0001\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\r8\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u0012\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0019\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u001b\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0018\u0088\u0001\u0016\u0092\u0001\u0004\u0018\u00010\r¨\u0006\u001e"}, d2 = {"Lsk9;", "T", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/Object;)Ljava/lang/Throwable;", "", "j", "(Ljava/lang/Object;)Ljava/lang/String;", "", e.a, "(Ljava/lang/Object;)I", "", "other", "", c.a, "(Ljava/lang/Object;Ljava/lang/Object;)Z", "a", "Ljava/lang/Object;", "getValue$annotations", "()V", "value", "i", "(Ljava/lang/Object;)Z", "isSuccess", "f", "isFailure", "b", "(Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
/* renamed from: sk9  reason: default package */
/* loaded from: classes3.dex */
public final class sk9<T> implements Serializable {
    public static final a b = new a(null);
    private final Object a;

    /* compiled from: Result.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lsk9$a;", "", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
    /* renamed from: sk9$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: Result.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0006\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0096\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\tH\u0016R\u0014\u0010\u000e\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lsk9$b;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "other", "", "equals", "", "hashCode", "", "toString", "", "a", "Ljava/lang/Throwable;", "exception", "<init>", "(Ljava/lang/Throwable;)V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
    /* renamed from: sk9$b */
    /* loaded from: classes3.dex */
    public static final class b implements Serializable {
        public final Throwable a;

        public b(Throwable th) {
            z65.h(th, "exception");
            this.a = th;
        }

        public boolean equals(Object obj) {
            if ((obj instanceof b) && z65.c(this.a, ((b) obj).a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            return "Failure(" + this.a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    private /* synthetic */ sk9(Object obj) {
        this.a = obj;
    }

    public static final /* synthetic */ sk9 a(Object obj) {
        return new sk9(obj);
    }

    public static boolean c(Object obj, Object obj2) {
        if (!(obj2 instanceof sk9) || !z65.c(obj, ((sk9) obj2).k())) {
            return false;
        }
        return true;
    }

    public static final Throwable d(Object obj) {
        if (obj instanceof b) {
            return ((b) obj).a;
        }
        return null;
    }

    public static int e(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public static final boolean f(Object obj) {
        return obj instanceof b;
    }

    public static final boolean i(Object obj) {
        return !(obj instanceof b);
    }

    public static String j(Object obj) {
        if (obj instanceof b) {
            return ((b) obj).toString();
        }
        return "Success(" + obj + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public boolean equals(Object obj) {
        return c(this.a, obj);
    }

    public int hashCode() {
        return e(this.a);
    }

    public final /* synthetic */ Object k() {
        return this.a;
    }

    public String toString() {
        return j(this.a);
    }

    public static <T> Object b(Object obj) {
        return obj;
    }
}
