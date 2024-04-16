package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: OrderStateVO.kt */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u000e\u0003\n\u000e\u0011\u0005\u0015\u000f\u0019\u001d#$%&'B_\b\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0002\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0013\u0012\u0006\u0010 \u001a\u00020\u001c¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0003\u0010\fR\u001a\u0010\u0010\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006R\u001a\u0010\u0012\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0004\u001a\u0004\b\n\u0010\u0006R\u001a\u0010\u0017\u001a\u00020\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\u00020\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u000e\u0010\u0016R\u001a\u0010\u001a\u001a\u00020\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0014\u001a\u0004\b\u0019\u0010\u0016R\u001a\u0010\u001b\u001a\u00020\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u0011\u0010\u0016R\u001a\u0010 \u001a\u00020\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001f\u0082\u0001\u000e()*+,-./012345¨\u00066"}, d2 = {"Lti7;", "Lpi7;", "", "a", "I", com.huawei.hms.push.e.a, "()I", "titleRes", "", "", "b", "[Ljava/lang/String;", "()[Ljava/lang/String;", "titleArgs", com.huawei.hms.opendevice.c.a, "g", "progress", DateTokenConverter.CONVERTER_KEY, "progressMax", "", "Z", "f", "()Z", "showTimer", "showGreenCheckMark", Image.TYPE_HIGH, "showContactSupportButton", "showCertificateClarification", "Lmi7;", "i", "Lmi7;", "()Lmi7;", "orderState", "<init>", "(I[Ljava/lang/String;IIZZZZLmi7;)V", "j", "k", "l", Image.TYPE_MEDIUM, "n", "Lti7$a;", "Lti7$b;", "Lti7$c;", "Lti7$d;", "Lti7$e;", "Lti7$f;", "Lti7$g;", "Lti7$h;", "Lti7$i;", "Lti7$j;", "Lti7$k;", "Lti7$l;", "Lti7$m;", "Lti7$n;", "activeorder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: ti7  reason: default package */
/* loaded from: classes.dex */
public abstract class ti7 implements pi7 {
    private final int a;
    private final String[] b;
    private final int c;
    private final int d;
    private final boolean e;
    private final boolean f;
    private final boolean g;
    private final boolean h;
    private final mi7 i;

    /* compiled from: OrderStateVO.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lti7$a;", "Lti7;", "", "progress", "progressMax", "", "showTimer", "showCertificateClarification", "<init>", "(IIZZ)V", "activeorder_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: ti7$a */
    /* loaded from: classes.dex */
    public static final class a extends ti7 {
        public a(int i, int i2, boolean z, boolean z2) {
            super(d19.order_state_accepted, new String[0], i, i2, z, false, false, z2, mi7.d, 96, null);
        }
    }

    /* compiled from: OrderStateVO.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lti7$b;", "Lti7;", "", "progress", "progressMax", "<init>", "(II)V", "activeorder_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: ti7$b */
    /* loaded from: classes.dex */
    public static final class b extends ti7 {
        public b(int i, int i2) {
            super(d19.order_state_was_cancelled, new String[0], i, i2, false, false, false, false, mi7.m, 224, null);
        }
    }

    /* compiled from: OrderStateVO.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lti7$c;", "Lti7;", "", "progress", "progressMax", "", "showCertificateClarification", "<init>", "(IIZ)V", "activeorder_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: ti7$c */
    /* loaded from: classes.dex */
    public static final class c extends ti7 {
        public c(int i, int i2, boolean z) {
            super(d19.order_state_completed, new String[0], i, i2, false, false, false, z, mi7.l, 96, null);
        }
    }

    /* compiled from: OrderStateVO.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lti7$d;", "Lti7;", "", "progress", "progressMax", "", "showTimer", "showCertificateClarification", "<init>", "(IIZZ)V", "activeorder_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: ti7$d */
    /* loaded from: classes.dex */
    public static final class d extends ti7 {
        public d(int i, int i2, boolean z, boolean z2) {
            super(d19.order_state_cooking, new String[0], i, i2, z, false, false, z2, mi7.h, 96, null);
        }
    }

    /* compiled from: OrderStateVO.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lti7$e;", "Lti7;", "", "progress", "progressMax", "", "showTimer", "<init>", "(IIZ)V", "activeorder_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: ti7$e */
    /* loaded from: classes.dex */
    public static final class e extends ti7 {
        public /* synthetic */ e(int i, int i2, boolean z, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, i2, (i3 & 4) != 0 ? true : z);
        }

        public e(int i, int i2, boolean z) {
            super(d19.order_state_courier_is_late, new String[0], i, i2, z, false, true, true, mi7.n, null);
        }
    }

    /* compiled from: OrderStateVO.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lti7$f;", "Lti7;", "", "progress", "progressMax", "", "timeTo", "<init>", "(IILjava/lang/String;)V", "activeorder_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: ti7$f */
    /* loaded from: classes.dex */
    public static final class f extends ti7 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(int i, int i2, String str) {
            super(d19.order_state_will_be_ready_by, new String[]{str}, i, i2, false, false, false, false, mi7.f, 224, null);
            z65.h(str, "timeTo");
        }
    }

    /* compiled from: OrderStateVO.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lti7$g;", "Lti7;", "", "progress", "progressMax", "", "timeTo", "<init>", "(IILjava/lang/String;)V", "activeorder_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: ti7$g */
    /* loaded from: classes.dex */
    public static final class g extends ti7 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(int i, int i2, String str) {
            super(d19.order_state_will_be_wait_for_you_by, new String[]{str}, i, i2, false, false, false, false, mi7.g, 224, null);
            z65.h(str, "timeTo");
        }
    }

    /* compiled from: OrderStateVO.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lti7$h;", "Lti7;", "", "progress", "progressMax", "", "timeFrom", "timeTo", "<init>", "(IILjava/lang/String;Ljava/lang/String;)V", "activeorder_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: ti7$h */
    /* loaded from: classes.dex */
    public static final class h extends ti7 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(int i, int i2, String str, String str2) {
            super(d19.order_state_deliver_from_to, new String[]{str, str2}, i, i2, false, false, false, false, mi7.e, 224, null);
            z65.h(str, "timeFrom");
            z65.h(str2, "timeTo");
        }
    }

    /* compiled from: OrderStateVO.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lti7$i;", "Lti7;", "", "progress", "progressMax", "", "timeFrom", "<init>", "(IILjava/lang/String;)V", "activeorder_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: ti7$i */
    /* loaded from: classes.dex */
    public static final class i extends ti7 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(int i, int i2, String str) {
            super(d19.order_state_deliver_by, new String[]{str}, i, i2, false, false, false, false, mi7.e, 224, null);
            z65.h(str, "timeFrom");
        }
    }

    /* compiled from: OrderStateVO.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lti7$j;", "Lti7;", "", "progress", "progressMax", "", "showTimer", "<init>", "(IIZ)V", "activeorder_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: ti7$j */
    /* loaded from: classes.dex */
    public static final class j extends ti7 {
        public j(int i, int i2, boolean z) {
            super(d19.order_state_on_delivery, new String[0], i, i2, z, false, false, true, mi7.k, 96, null);
        }
    }

    /* compiled from: OrderStateVO.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lti7$k;", "Lti7;", "", "progress", "progressMax", "<init>", "(II)V", "activeorder_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: ti7$k */
    /* loaded from: classes.dex */
    public static final class k extends ti7 {
        public k(int i, int i2) {
            super(d19.order_state_ready_for_carryout, new String[0], i, i2, false, true, false, false, mi7.j, 192, null);
        }
    }

    /* compiled from: OrderStateVO.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lti7$l;", "Lti7;", "", "progress", "progressMax", "<init>", "(II)V", "activeorder_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: ti7$l */
    /* loaded from: classes.dex */
    public static final class l extends ti7 {
        public l(int i, int i2) {
            super(d19.order_state_ready_for_delivery, new String[0], i, i2, false, false, false, true, mi7.i, 96, null);
        }
    }

    /* compiled from: OrderStateVO.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lti7$m;", "Lti7;", "", "progress", "progressMax", "<init>", "(II)V", "activeorder_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: ti7$m */
    /* loaded from: classes.dex */
    public static final class m extends ti7 {
        public m(int i, int i2) {
            super(d19.carry_the_order, new String[0], i, i2, false, true, false, false, mi7.j, 192, null);
        }
    }

    /* compiled from: OrderStateVO.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lti7$n;", "Lti7;", "", "progress", "progressMax", "<init>", "(II)V", "activeorder_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: ti7$n */
    /* loaded from: classes.dex */
    public static final class n extends ti7 {
        public n(int i, int i2) {
            super(d19.order_state_unknown, new String[0], i, i2, false, false, false, false, mi7.c, 224, null);
        }
    }

    public /* synthetic */ ti7(int i2, String[] strArr, int i3, int i4, boolean z, boolean z2, boolean z3, boolean z4, mi7 mi7Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, strArr, i3, i4, z, z2, z3, z4, mi7Var);
    }

    @Override // defpackage.pi7
    public String[] a() {
        return this.b;
    }

    @Override // defpackage.pi7
    public int b() {
        return this.d;
    }

    @Override // defpackage.pi7
    public boolean c() {
        return this.f;
    }

    @Override // defpackage.pi7
    public boolean d() {
        return this.h;
    }

    @Override // defpackage.pi7
    public int e() {
        return this.a;
    }

    @Override // defpackage.pi7
    public boolean f() {
        return this.e;
    }

    @Override // defpackage.pi7
    public int g() {
        return this.c;
    }

    @Override // defpackage.pi7
    public boolean h() {
        return this.g;
    }

    @Override // defpackage.pi7
    public mi7 i() {
        return this.i;
    }

    private ti7(int i2, String[] strArr, int i3, int i4, boolean z, boolean z2, boolean z3, boolean z4, mi7 mi7Var) {
        this.a = i2;
        this.b = strArr;
        this.c = i3;
        this.d = i4;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = z4;
        this.i = mi7Var;
    }

    public /* synthetic */ ti7(int i2, String[] strArr, int i3, int i4, boolean z, boolean z2, boolean z3, boolean z4, mi7 mi7Var, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, strArr, i3, i4, z, (i5 & 32) != 0 ? false : z2, (i5 & 64) != 0 ? false : z3, (i5 & 128) != 0 ? false : z4, mi7Var, null);
    }
}
