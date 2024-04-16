package defpackage;

import ch.qos.logback.core.CoreConstants;
import defpackage.pr8;
import java.lang.annotation.Annotation;
/* compiled from: AtProtobuf.java */
/* renamed from: qy  reason: default package */
/* loaded from: classes2.dex */
public final class qy {
    private int a;
    private pr8.a b = pr8.a.DEFAULT;

    /* compiled from: AtProtobuf.java */
    /* renamed from: qy$a */
    /* loaded from: classes2.dex */
    private static final class a implements pr8 {
        private final int a;
        private final pr8.a b;

        a(int i, pr8.a aVar) {
            this.a = i;
            this.b = aVar;
        }

        @Override // java.lang.annotation.Annotation
        public Class<? extends Annotation> annotationType() {
            return pr8.class;
        }

        @Override // java.lang.annotation.Annotation
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof pr8)) {
                return false;
            }
            pr8 pr8Var = (pr8) obj;
            if (this.a == pr8Var.tag() && this.b.equals(pr8Var.intEncoding())) {
                return true;
            }
            return false;
        }

        @Override // java.lang.annotation.Annotation
        public int hashCode() {
            return (14552422 ^ this.a) + (this.b.hashCode() ^ 2041407134);
        }

        @Override // defpackage.pr8
        public pr8.a intEncoding() {
            return this.b;
        }

        @Override // defpackage.pr8
        public int tag() {
            return this.a;
        }

        @Override // java.lang.annotation.Annotation
        public String toString() {
            return "@com.google.firebase.encoders.proto.Protobuf" + CoreConstants.LEFT_PARENTHESIS_CHAR + "tag=" + this.a + "intEncoding=" + this.b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    public static qy b() {
        return new qy();
    }

    public pr8 a() {
        return new a(this.a, this.b);
    }

    public qy c(int i) {
        this.a = i;
        return this;
    }
}
