package defpackage;

import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
/* compiled from: ImagePickerAnalytics.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\n"}, d2 = {"Lbv4;", "", "Lbv4$a;", "imageSource", "Lqd;", "sender", "Ldc;", "a", "<init>", "()V", "feature-base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: bv4  reason: default package */
/* loaded from: classes.dex */
public final class bv4 {
    public static final bv4 a = new bv4();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ImagePickerAnalytics.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lbv4$a;", "", "", "a", "Ljava/lang/String;", "i", "()Ljava/lang/String;", "analyticsName", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "b", c.a, "feature-base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: bv4$a */
    /* loaded from: classes.dex */
    public static final class a {
        public static final a b = new a("CAMERA", 0, "camera");
        public static final a c = new a("GALLERY", 1, "gallery");
        private static final /* synthetic */ a[] d;
        private static final /* synthetic */ kj3 e;
        private final String a;

        static {
            a[] a = a();
            d = a;
            e = lj3.a(a);
        }

        private a(String str, int i, String str2) {
            this.a = str2;
        }

        private static final /* synthetic */ a[] a() {
            return new a[]{b, c};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) d.clone();
        }

        public final String i() {
            return this.a;
        }
    }

    /* compiled from: ImagePickerAnalytics.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lbc;", "a", "(Lbc;)Lbc;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: bv4$b */
    /* loaded from: classes.dex */
    static final class b extends ej5 implements Function1<bc, bc> {
        final /* synthetic */ a a;
        final /* synthetic */ qd b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(a aVar, qd qdVar) {
            super(1);
            this.a = aVar;
            this.b = qdVar;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final bc invoke(bc bcVar) {
            z65.h(bcVar, "$this$eventProducer");
            bc.e(bcVar, "image_source", this.a.i(), false, 4, null);
            return vc.z(bcVar, this.b);
        }
    }

    private bv4() {
    }

    public final dc a(a aVar, qd qdVar) {
        z65.h(aVar, "imageSource");
        z65.h(qdVar, "sender");
        return ec.a("pick_image_type_click", new b(aVar, qdVar));
    }
}
