package defpackage;

import androidx.compose.foundation.text.modifiers.SelectableTextAnnotatedStringElement;
import androidx.compose.foundation.text.modifiers.TextAnnotatedStringElement;
import com.huawei.hms.push.constant.RemoteMessageConst;
import defpackage.ml;
import defpackage.w24;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
/* compiled from: BasicText.kt */
@Metadata(d1 = {"\u0000b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a}\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00062\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014\u001aq\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00062\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000eH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016\u001a¯\u0001\u0010\"\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u00020\u00042\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u00182\u0014\u0010\u001d\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001b\u0018\u00010\u001a2\u001c\u0010\u001f\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u001a\u0012\u0004\u0012\u00020\b\u0018\u00010\u00062\b\u0010!\u001a\u0004\u0018\u00010 2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\"\u0010#\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006$"}, d2 = {"", "text", "Lsm6;", "modifier", "Lrcb;", "style", "Lkotlin/Function1;", "Lbcb;", "", "onTextLayout", "Lgcb;", "overflow", "", "softWrap", "", "maxLines", "minLines", "Lcd1;", RemoteMessageConst.Notification.COLOR, "b", "(Ljava/lang/String;Lsm6;Lrcb;Lkotlin/jvm/functions/Function1;IZIILcd1;Lqn1;II)V", "a", "(Ljava/lang/String;Lsm6;Lrcb;Lkotlin/jvm/functions/Function1;IZIILqn1;II)V", "Lml;", "Lw24$b;", "fontFamilyResolver", "", "Lml$a;", "Ljb8;", "placeholders", "Lk99;", "onPlaceholderLayout", "Lu9a;", "selectionController", com.huawei.hms.opendevice.c.a, "(Lsm6;Lml;Lrcb;Lkotlin/jvm/functions/Function1;IZIILw24$b;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lu9a;Lcd1;)Lsm6;", "foundation_release"}, k = 2, mv = {1, 8, 0})
/* renamed from: q90  reason: default package */
/* loaded from: classes.dex */
public final class q90 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BasicText.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: q90$a */
    /* loaded from: classes.dex */
    public static final class a extends ej5 implements Function2<qn1, Integer, Unit> {
        final /* synthetic */ String a;
        final /* synthetic */ sm6 b;
        final /* synthetic */ rcb c;
        final /* synthetic */ Function1<bcb, Unit> d;
        final /* synthetic */ int e;
        final /* synthetic */ boolean f;
        final /* synthetic */ int g;
        final /* synthetic */ int h;
        final /* synthetic */ int i;
        final /* synthetic */ int j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(String str, sm6 sm6Var, rcb rcbVar, Function1<? super bcb, Unit> function1, int i, boolean z, int i2, int i3, cd1 cd1Var, int i4, int i5) {
            super(2);
            this.a = str;
            this.b = sm6Var;
            this.c = rcbVar;
            this.d = function1;
            this.e = i;
            this.f = z;
            this.g = i2;
            this.h = i3;
            this.i = i4;
            this.j = i5;
        }

        public final void a(qn1 qn1Var, int i) {
            q90.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, null, qn1Var, f99.a(this.i | 1), this.j);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(qn1 qn1Var, Integer num) {
            a(qn1Var, num.intValue());
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BasicText.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: q90$b */
    /* loaded from: classes.dex */
    public static final class b extends ej5 implements Function2<qn1, Integer, Unit> {
        final /* synthetic */ String a;
        final /* synthetic */ sm6 b;
        final /* synthetic */ rcb c;
        final /* synthetic */ Function1<bcb, Unit> d;
        final /* synthetic */ int e;
        final /* synthetic */ boolean f;
        final /* synthetic */ int g;
        final /* synthetic */ int h;
        final /* synthetic */ int i;
        final /* synthetic */ int j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(String str, sm6 sm6Var, rcb rcbVar, Function1<? super bcb, Unit> function1, int i, boolean z, int i2, int i3, int i4, int i5) {
            super(2);
            this.a = str;
            this.b = sm6Var;
            this.c = rcbVar;
            this.d = function1;
            this.e = i;
            this.f = z;
            this.g = i2;
            this.h = i3;
            this.i = i4;
            this.j = i5;
        }

        public final void a(qn1 qn1Var, int i) {
            q90.a(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, qn1Var, f99.a(this.i | 1), this.j);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(qn1 qn1Var, Integer num) {
            a(qn1Var, num.intValue());
            return Unit.a;
        }
    }

    /* compiled from: Composables.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\u000e\b\u0001\u0010\u0003\u0018\u0001*\u0006\u0012\u0002\b\u00030\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "T", "Lwp;", "E", "invoke", "()Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: q90$c */
    /* loaded from: classes.dex */
    public static final class c extends ej5 implements Function0<mn1> {
        final /* synthetic */ Function0 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Function0 function0) {
            super(0);
            this.a = function0;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [mn1, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function0
        public final mn1 invoke() {
            return this.a.invoke();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x012f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void a(java.lang.String r27, defpackage.sm6 r28, defpackage.rcb r29, kotlin.jvm.functions.Function1 r30, int r31, boolean r32, int r33, int r34, defpackage.qn1 r35, int r36, int r37) {
        /*
            Method dump skipped, instructions count: 462
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q90.a(java.lang.String, sm6, rcb, kotlin.jvm.functions.Function1, int, boolean, int, int, qn1, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01e3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:162:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0129  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(java.lang.String r47, defpackage.sm6 r48, defpackage.rcb r49, kotlin.jvm.functions.Function1<? super defpackage.bcb, kotlin.Unit> r50, int r51, boolean r52, int r53, int r54, defpackage.cd1 r55, defpackage.qn1 r56, int r57, int r58) {
        /*
            Method dump skipped, instructions count: 884
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q90.b(java.lang.String, sm6, rcb, kotlin.jvm.functions.Function1, int, boolean, int, int, cd1, qn1, int, int):void");
    }

    private static final sm6 c(sm6 sm6Var, ml mlVar, rcb rcbVar, Function1<? super bcb, Unit> function1, int i, boolean z, int i2, int i3, w24.b bVar, List<ml.a<jb8>> list, Function1<? super List<k99>, Unit> function12, u9a u9aVar, cd1 cd1Var) {
        if (u9aVar == null) {
            return sm6Var.f(sm6.a).f(new TextAnnotatedStringElement(mlVar, rcbVar, bVar, function1, i, z, i2, i3, list, function12, null, cd1Var, null));
        }
        return sm6Var.f(u9aVar.f()).f(new SelectableTextAnnotatedStringElement(mlVar, rcbVar, bVar, function1, i, z, i2, i3, list, function12, u9aVar, cd1Var, null));
    }
}
