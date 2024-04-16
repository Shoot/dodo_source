package defpackage;

import ch.qos.logback.core.CoreConstants;
import com.huawei.hms.opendevice.c;
import defpackage.tmb;
import im.threads.business.transport.MessageAttributes;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: QRCodeSquare.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u0000 \u00162\u00020\u0001:\u0001\nB\u0017\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0017"}, d2 = {"Lhu8;", "", "", "toString", "", "hashCode", "other", "", "equals", "Liu8;", "a", "Liu8;", "()Liu8;", MessageAttributes.TYPE, "Leu8;", "b", "Leu8;", "getRegion", "()Leu8;", tmb.f.REGION_JSON_NAME, "<init>", "(Liu8;Leu8;)V", c.a, "qrcode-kotlin_release"}, k = 1, mv = {1, 7, 1})
/* renamed from: hu8  reason: default package */
/* loaded from: classes3.dex */
public final class hu8 {
    public static final a c = new a(null);
    private final iu8 a;
    private final eu8 b;

    /* compiled from: QRCodeSquare.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lhu8$a;", "", "Lhu8;", "a", "()Lhu8;", "<init>", "()V", "qrcode-kotlin_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: hu8$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final hu8 a() {
            return new hu8(iu8.MARGIN, eu8.MARGIN);
        }
    }

    public hu8(iu8 iu8Var, eu8 eu8Var) {
        z65.h(iu8Var, MessageAttributes.TYPE);
        z65.h(eu8Var, tmb.f.REGION_JSON_NAME);
        this.a = iu8Var;
        this.b = eu8Var;
    }

    public final iu8 a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hu8)) {
            return false;
        }
        hu8 hu8Var = (hu8) obj;
        if (this.a == hu8Var.a && this.b == hu8Var.b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        return "QRCodeSquareInfo(type=" + this.a + ", region=" + this.b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
