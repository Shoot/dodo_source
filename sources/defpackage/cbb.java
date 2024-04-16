package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.push.e;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
/* compiled from: TextForegroundStyle.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\b`\u0018\u0000 \u000f2\u00020\u0001:\u0002\u000f\u0007J\u0010\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0016J\u0016\u0010\u0005\u001a\u00020\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004H\u0016R\u001d\u0010\t\u001a\u00020\u00068&X¦\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\r\u001a\u0004\u0018\u00010\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010ø\u0001\u0003\u0082\u0002\u0015\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006\u0012À\u0006\u0001"}, d2 = {"Lcbb;", "", "other", DateTokenConverter.CONVERTER_KEY, "Lkotlin/Function0;", c.a, "Luc1;", "b", "()J", RemoteMessageConst.Notification.COLOR, "Lmg0;", e.a, "()Lmg0;", "brush", "", "a", "()F", "alpha", "ui-text_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: cbb  reason: default package */
/* loaded from: classes.dex */
public interface cbb {
    public static final a a = a.a;

    /* compiled from: TextForegroundStyle.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u000b\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Lcbb$a;", "", "Luc1;", RemoteMessageConst.Notification.COLOR, "Lcbb;", "b", "(J)Lcbb;", "Lmg0;", "brush", "", "alpha", "a", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: cbb$a */
    /* loaded from: classes.dex */
    public static final class a {
        static final /* synthetic */ a a = new a();

        private a() {
        }

        public final cbb a(mg0 mg0Var, float f) {
            if (mg0Var == null) {
                return b.b;
            }
            if (mg0Var instanceof jqa) {
                return b(sab.b(((jqa) mg0Var).b(), f));
            }
            if (mg0Var instanceof mga) {
                return new og0((mga) mg0Var, f);
            }
            throw new NoWhenBranchMatchedException();
        }

        public final cbb b(long j) {
            if (j != uc1.b.e()) {
                return new nf1(j, null);
            }
            return b.b;
        }
    }

    /* compiled from: TextForegroundStyle.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0005\u001a\u00020\u00028VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0010"}, d2 = {"Lcbb$b;", "Lcbb;", "Luc1;", "b", "()J", RemoteMessageConst.Notification.COLOR, "Lmg0;", e.a, "()Lmg0;", "brush", "", "a", "()F", "alpha", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: cbb$b */
    /* loaded from: classes.dex */
    public static final class b implements cbb {
        public static final b b = new b();

        private b() {
        }

        @Override // defpackage.cbb
        public float a() {
            return Float.NaN;
        }

        @Override // defpackage.cbb
        public long b() {
            return uc1.b.e();
        }

        @Override // defpackage.cbb
        public /* synthetic */ cbb c(Function0 function0) {
            return bbb.b(this, function0);
        }

        @Override // defpackage.cbb
        public /* synthetic */ cbb d(cbb cbbVar) {
            return bbb.a(this, cbbVar);
        }

        @Override // defpackage.cbb
        public mg0 e() {
            return null;
        }
    }

    float a();

    long b();

    cbb c(Function0<? extends cbb> function0);

    cbb d(cbb cbbVar);

    mg0 e();
}
