package defpackage;

import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.inappstory.sdk.stories.api.models.Image;
import com.inappstory.sdk.stories.ui.widgets.readerscreen.generated.ElementGenerator;
import kotlin.Metadata;
/* compiled from: DrawScope.kt */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u0000 ?2\u00020\u0001:\u0001@J[\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012J[\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016Jy\u0010!\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u001d\u001a\u00020\u00192\b\b\u0002\u0010\u001e\u001a\u00020\u001b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010 \u001a\u00020\u001fH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b!\u0010\"Je\u0010%\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010$\u001a\u00020#2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b%\u0010&Je\u0010'\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010$\u001a\u00020#2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b'\u0010(JO\u0010+\u001a\u00020\u00102\u0006\u0010*\u001a\u00020)2\u0006\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b+\u0010,JO\u0010-\u001a\u00020\u00102\u0006\u0010*\u001a\u00020)2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b-\u0010.J!\u00102\u001a\u00020\u0006*\u00020\u00062\u0006\u0010/\u001a\u00020\u0004H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b0\u00101R\u0014\u00106\u001a\u0002038&X¦\u0004¢\u0006\u0006\u001a\u0004\b4\u00105R\u001d\u00109\u001a\u00020\u00048VX\u0096\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b7\u00108R\u001d\u0010\u0007\u001a\u00020\u00068VX\u0096\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b:\u00108R\u0014\u0010>\u001a\u00020;8&X¦\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=ø\u0001\u0003\u0082\u0002\u0015\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!\n\u0004\b!0\u0001¨\u0006AÀ\u0006\u0003"}, d2 = {"Ly73;", "La03;", "Lmg0;", "brush", "Ls67;", "topLeft", "Lcna;", "size", "", "alpha", "Lz73;", "style", "Lwc1;", "colorFilter", "Lpc0;", "blendMode", "", "A0", "(Lmg0;JJFLz73;Lwc1;I)V", "Luc1;", RemoteMessageConst.Notification.COLOR, "t0", "(JJJFLz73;Lwc1;I)V", "Leu4;", ElementGenerator.TYPE_IMAGE, "Ls55;", "srcOffset", "Lw55;", "srcSize", "dstOffset", "dstSize", "Lyu3;", "filterQuality", "c0", "(Leu4;JJJJFLz73;Lwc1;II)V", "Lbx1;", "cornerRadius", "R", "(Lmg0;JJJFLz73;Lwc1;I)V", "q0", "(JJJJLz73;FLwc1;I)V", "Lor7;", "path", "g0", "(Lor7;JFLz73;Lwc1;I)V", "s0", "(Lor7;Lmg0;FLz73;Lwc1;I)V", "offset", "offsetSize-PENXr5M", "(JJ)J", "offsetSize", "Ls73;", "o0", "()Ls73;", "drawContext", "u0", "()J", ElementGenerator.TEXT_ALIGN_CENTER, Image.TYPE_SMALL, "Lqm5;", "getLayoutDirection", "()Lqm5;", "layoutDirection", "L", "a", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: y73  reason: default package */
/* loaded from: classes.dex */
public interface y73 extends a03 {
    public static final a L = a.a;

    /* compiled from: DrawScope.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fR \u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R \u0010\n\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\u0003\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\r"}, d2 = {"Ly73$a;", "", "Lpc0;", "b", "I", "a", "()I", "DefaultBlendMode", "Lyu3;", c.a, "DefaultFilterQuality", "<init>", "()V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: y73$a */
    /* loaded from: classes.dex */
    public static final class a {
        static final /* synthetic */ a a = new a();
        private static final int b = pc0.b.B();
        private static final int c = yu3.a.a();

        private a() {
        }

        public final int a() {
            return b;
        }

        public final int b() {
            return c;
        }
    }

    void A0(mg0 mg0Var, long j, long j2, float f, z73 z73Var, wc1 wc1Var, int i);

    void R(mg0 mg0Var, long j, long j2, long j3, float f, z73 z73Var, wc1 wc1Var, int i);

    void c0(eu4 eu4Var, long j, long j2, long j3, long j4, float f, z73 z73Var, wc1 wc1Var, int i, int i2);

    void g0(or7 or7Var, long j, float f, z73 z73Var, wc1 wc1Var, int i);

    qm5 getLayoutDirection();

    s73 o0();

    void q0(long j, long j2, long j3, long j4, z73 z73Var, float f, wc1 wc1Var, int i);

    long s();

    void s0(or7 or7Var, mg0 mg0Var, float f, z73 z73Var, wc1 wc1Var, int i);

    void t0(long j, long j2, long j3, float f, z73 z73Var, wc1 wc1Var, int i);

    long u0();
}
