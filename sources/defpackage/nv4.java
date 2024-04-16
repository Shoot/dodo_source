package defpackage;

import android.graphics.Bitmap;
import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: ImageRetryStrategy.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lnv4;", "", "<init>", "()V", "a", "b", com.huawei.hms.opendevice.c.a, "Lnv4$a;", "Lnv4$b;", "Lnv4$c;", "sdk_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: nv4  reason: default package */
/* loaded from: classes.dex */
public abstract class nv4 {

    /* compiled from: ImageRetryStrategy.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u0011"}, d2 = {"Lnv4$a;", "Lnv4;", "", "toString", "", "hashCode", "", "other", "", "equals", "Landroid/graphics/Bitmap;", "a", "Landroid/graphics/Bitmap;", "()Landroid/graphics/Bitmap;", "defaultImage", "<init>", "(Landroid/graphics/Bitmap;)V", "sdk_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: nv4$a */
    /* loaded from: classes.dex */
    public static final class a extends nv4 {
        private final Bitmap a;

        public a() {
            this(null, 1, null);
        }

        public final Bitmap a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof a) && z65.c(this.a, ((a) obj).a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            Bitmap bitmap = this.a;
            if (bitmap == null) {
                return 0;
            }
            return bitmap.hashCode();
        }

        public String toString() {
            return "ApplyDefault(defaultImage=" + this.a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        public /* synthetic */ a(Bitmap bitmap, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : bitmap);
        }

        public a(Bitmap bitmap) {
            super(null);
            this.a = bitmap;
        }
    }

    /* compiled from: ImageRetryStrategy.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u000f\u001a\u00020\n\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\r\u0010\u0011\u001a\u0004\b\u000b\u0010\u0012¨\u0006\u0016"}, d2 = {"Lnv4$b;", "Lnv4;", "", "toString", "", "hashCode", "", "other", "", "equals", "", "a", "J", "b", "()J", "delay", "Landroid/graphics/Bitmap;", "Landroid/graphics/Bitmap;", "()Landroid/graphics/Bitmap;", "defaultImage", "<init>", "(JLandroid/graphics/Bitmap;)V", "sdk_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: nv4$b */
    /* loaded from: classes.dex */
    public static final class b extends nv4 {
        private final long a;
        private final Bitmap b;

        public b() {
            this(0L, null, 3, null);
        }

        public final Bitmap a() {
            return this.b;
        }

        public final long b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (this.a == bVar.a && z65.c(this.b, bVar.b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode;
            int a = ax1.a(this.a) * 31;
            Bitmap bitmap = this.b;
            if (bitmap == null) {
                hashCode = 0;
            } else {
                hashCode = bitmap.hashCode();
            }
            return a + hashCode;
        }

        public String toString() {
            return "ApplyDefaultAndRetry(delay=" + this.a + ", defaultImage=" + this.b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        public /* synthetic */ b(long j, Bitmap bitmap, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? null : bitmap);
        }

        public b(long j, Bitmap bitmap) {
            super(null);
            this.a = j;
            this.b = bitmap;
        }
    }

    /* compiled from: ImageRetryStrategy.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u0011"}, d2 = {"Lnv4$c;", "Lnv4;", "", "toString", "", "hashCode", "", "other", "", "equals", "", "a", "J", "()J", "delay", "<init>", "(J)V", "sdk_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: nv4$c */
    /* loaded from: classes.dex */
    public static final class c extends nv4 {
        private final long a;

        public c() {
            this(0L, 1, null);
        }

        public final long a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof c) && this.a == ((c) obj).a) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return ax1.a(this.a);
        }

        public String toString() {
            return "Retry(delay=" + this.a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        public /* synthetic */ c(long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? 0L : j);
        }

        public c(long j) {
            super(null);
            this.a = j;
        }
    }

    private nv4() {
    }

    public /* synthetic */ nv4(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
