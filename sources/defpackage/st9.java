package defpackage;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.gbb;
import defpackage.ibb;
import defpackage.is5;
import defpackage.jcb;
import defpackage.kab;
import defpackage.ml;
import defpackage.ns5;
import defpackage.oga;
import defpackage.s67;
import defpackage.uc1;
import defpackage.v34;
import defpackage.v80;
import defpackage.wcb;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
/* compiled from: Savers.kt */
@Metadata(d1 = {"\u0000ô\u0001\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aK\u0010\t\u001a\u00020\b\"\u0014\b\u0000\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0000\"\u0004\b\u0001\u0010\u0002\"\u0004\b\u0002\u0010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\n\u001a!\u0010\u000b\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00012\b\u0010\u0004\u001a\u0004\u0018\u00018\u0000H\u0000¢\u0006\u0004\b\u000b\u0010\f\"&\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\b0\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\".\u0010\u0016\u001a\u001c\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\b0\u00140\u0013\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u000f\".\u0010\u001a\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0014\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u000f\u0012\u0004\b\u0018\u0010\u0019\" \u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u000f\"&\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u000f\u0012\u0004\b\u001f\u0010\u0019\"&\u0010#\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\b0\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\"\u0010\u000f\u001a\u0004\b\"\u0010\u0011\"&\u0010'\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\b0\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b%\u0010\u000f\u001a\u0004\b&\u0010\u0011\" \u0010*\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010\u000f\" \u0010-\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010\u000f\" \u00100\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010\u000f\" \u00103\u001a\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010\u000f\"#\u00106\u001a\u000e\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b5\u0010\u000f\"#\u00109\u001a\u000e\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b8\u0010\u000f\" \u0010<\u001a\u000e\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010\u000f\"#\u0010?\u001a\u000e\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b>\u0010\u000f\")\u0010C\u001a\u000e\u0012\u0004\u0012\u00020@\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\f\n\u0004\bA\u0010\u000f\u0012\u0004\bB\u0010\u0019\"#\u0010F\u001a\u000e\u0012\u0004\u0012\u00020D\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\bE\u0010\u000f\" \u0010I\u001a\u000e\u0012\u0004\u0012\u00020G\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010\u000f\" \u0010K\u001a\u000e\u0012\u0004\u0012\u00020J\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u000f\"$\u0010N\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\b0\u0000*\u00020L8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b;\u0010M\"$\u0010N\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\b0\u0000*\u00020O8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b>\u0010P\"$\u0010N\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\b0\u0000*\u00020Q8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bA\u0010R\"$\u0010N\u001a\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\b0\u0000*\u00020S8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b,\u0010T\"'\u0010N\u001a\u000e\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\b0\u0000*\u00020U8@X\u0080\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b%\u0010V\"'\u0010N\u001a\u000e\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u00020\b0\u0000*\u00020W8@X\u0080\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\bE\u0010X\"$\u0010N\u001a\u000e\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020\b0\u0000*\u00020Y8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b8\u0010Z\"'\u0010N\u001a\u000e\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020\b0\u0000*\u00020[8@X\u0080\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b)\u0010\\\"'\u0010N\u001a\u000e\u0012\u0004\u0012\u00020@\u0012\u0004\u0012\u00020\b0\u0000*\u00020]8@X\u0080\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\bH\u0010^\"'\u0010N\u001a\u000e\u0012\u0004\u0012\u00020D\u0012\u0004\u0012\u00020\b0\u0000*\u00020_8@X\u0080\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b5\u0010`\"$\u0010N\u001a\u000e\u0012\u0004\u0012\u00020G\u0012\u0004\u0012\u00020\b0\u0000*\u00020a8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b2\u0010b\"$\u0010N\u001a\u000e\u0012\u0004\u0012\u00020J\u0012\u0004\u0012\u00020\b0\u0000*\u00020c8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b/\u0010d\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006e"}, d2 = {"Lpt9;", "T", "Original", "Saveable", "value", "saver", "Lrt9;", Action.SCOPE_ATTRIBUTE, "", "u", "(Ljava/lang/Object;Lpt9;Lrt9;)Ljava/lang/Object;", "t", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lml;", "a", "Lpt9;", com.huawei.hms.push.e.a, "()Lpt9;", "AnnotatedStringSaver", "", "Lml$a;", "b", "AnnotationRangeListSaver", com.huawei.hms.opendevice.c.a, "getAnnotationRangeSaver$annotations", "()V", "AnnotationRangeSaver", "Lxxb;", DateTokenConverter.CONVERTER_KEY, "VerbatimTtsAnnotationSaver", "Lstb;", "getUrlAnnotationSaver$annotations", "UrlAnnotationSaver", "Ljq7;", "f", "ParagraphStyleSaver", "Lvqa;", "g", Image.TYPE_SMALL, "SpanStyleSaver", "Lkab;", Image.TYPE_HIGH, "TextDecorationSaver", "Lgbb;", "i", "TextGeometricTransformSaver", "Libb;", "j", "TextIndentSaver", "Lv34;", "k", "FontWeightSaver", "Lv80;", "l", "BaselineShiftSaver", "Ljcb;", Image.TYPE_MEDIUM, "TextRangeSaver", "Loga;", "n", "ShadowSaver", "Luc1;", "o", "ColorSaver", "Lwcb;", "p", "getTextUnitSaver$annotations", "TextUnitSaver", "Ls67;", "q", "OffsetSaver", "Lns5;", "r", "LocaleListSaver", "Lis5;", "LocaleSaver", "Lkab$a;", "(Lkab$a;)Lpt9;", "Saver", "Lgbb$a;", "(Lgbb$a;)Lpt9;", "Libb$a;", "(Libb$a;)Lpt9;", "Lv34$a;", "(Lv34$a;)Lpt9;", "Lv80$a;", "(Lv80$a;)Lpt9;", "Ljcb$a;", "(Ljcb$a;)Lpt9;", "Loga$a;", "(Loga$a;)Lpt9;", "Luc1$a;", "(Luc1$a;)Lpt9;", "Lwcb$a;", "(Lwcb$a;)Lpt9;", "Ls67$a;", "(Ls67$a;)Lpt9;", "Lns5$a;", "(Lns5$a;)Lpt9;", "Lis5$a;", "(Lis5$a;)Lpt9;", "ui-text_release"}, k = 2, mv = {1, 8, 0})
/* renamed from: st9  reason: default package */
/* loaded from: classes.dex */
public final class st9 {
    private static final pt9<ml, Object> a = qt9.a(a.a, b.a);
    private static final pt9<List<ml.a<? extends Object>>, Object> b = qt9.a(c.a, d.a);
    private static final pt9<ml.a<? extends Object>, Object> c = qt9.a(e.a, f.a);
    private static final pt9<xxb, Object> d = qt9.a(k0.a, l0.a);
    private static final pt9<stb, Object> e = qt9.a(i0.a, j0.a);
    private static final pt9<jq7, Object> f = qt9.a(s.a, t.a);
    private static final pt9<vqa, Object> g = qt9.a(w.a, x.a);
    private static final pt9<kab, Object> h = qt9.a(y.a, z.a);
    private static final pt9<gbb, Object> i = qt9.a(a0.a, b0.a);
    private static final pt9<ibb, Object> j = qt9.a(c0.a, d0.a);
    private static final pt9<v34, Object> k = qt9.a(k.a, l.a);
    private static final pt9<v80, Object> l = qt9.a(g.a, h.a);
    private static final pt9<jcb, Object> m = qt9.a(e0.a, f0.a);
    private static final pt9<oga, Object> n = qt9.a(u.a, v.a);
    private static final pt9<uc1, Object> o = qt9.a(i.a, j.a);
    private static final pt9<wcb, Object> p = qt9.a(g0.a, h0.a);
    private static final pt9<s67, Object> q = qt9.a(q.a, r.a);
    private static final pt9<ns5, Object> r = qt9.a(m.a, n.a);
    private static final pt9<is5, Object> s = qt9.a(o.a, p.a);

    /* compiled from: Savers.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lrt9;", "Lml;", "it", "", "a", "(Lrt9;Lml;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: st9$a */
    /* loaded from: classes.dex */
    static final class a extends ej5 implements Function2<rt9, ml, Object> {
        public static final a a = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Object invoke(rt9 rt9Var, ml mlVar) {
            ArrayList h;
            z65.h(rt9Var, "$this$Saver");
            z65.h(mlVar, "it");
            h = kc1.h(st9.t(mlVar.h()), st9.u(mlVar.f(), st9.b, rt9Var), st9.u(mlVar.d(), st9.b, rt9Var), st9.u(mlVar.b(), st9.b, rt9Var));
            return h;
        }
    }

    /* compiled from: Savers.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lrt9;", "Lgbb;", "it", "", "a", "(Lrt9;Lgbb;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: st9$a0 */
    /* loaded from: classes.dex */
    static final class a0 extends ej5 implements Function2<rt9, gbb, Object> {
        public static final a0 a = new a0();

        a0() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Object invoke(rt9 rt9Var, gbb gbbVar) {
            ArrayList h;
            z65.h(rt9Var, "$this$Saver");
            z65.h(gbbVar, "it");
            h = kc1.h(Float.valueOf(gbbVar.b()), Float.valueOf(gbbVar.c()));
            return h;
        }
    }

    /* compiled from: Savers.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lml;", "a", "(Ljava/lang/Object;)Lml;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: st9$b */
    /* loaded from: classes.dex */
    static final class b extends ej5 implements Function1<Object, ml> {
        public static final b a = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final ml invoke(Object obj) {
            List list;
            List list2;
            String str;
            List list3;
            List list4;
            z65.h(obj, "it");
            List list5 = (List) obj;
            Object obj2 = list5.get(1);
            pt9 pt9Var = st9.b;
            Boolean bool = Boolean.FALSE;
            List list6 = null;
            if (z65.c(obj2, bool) || obj2 == null) {
                list = null;
            } else {
                list = (List) pt9Var.b(obj2);
            }
            Object obj3 = list5.get(2);
            pt9 pt9Var2 = st9.b;
            if (z65.c(obj3, bool) || obj3 == null) {
                list2 = null;
            } else {
                list2 = (List) pt9Var2.b(obj3);
            }
            Object obj4 = list5.get(0);
            if (obj4 != null) {
                str = (String) obj4;
            } else {
                str = null;
            }
            z65.e(str);
            if (list != null) {
                List list7 = list;
                if (list7.isEmpty()) {
                    list7 = null;
                }
                list3 = list7;
            } else {
                list3 = null;
            }
            if (list2 != null) {
                List list8 = list2;
                if (list8.isEmpty()) {
                    list8 = null;
                }
                list4 = list8;
            } else {
                list4 = null;
            }
            Object obj5 = list5.get(3);
            pt9 pt9Var3 = st9.b;
            if (!z65.c(obj5, bool) && obj5 != null) {
                list6 = (List) pt9Var3.b(obj5);
            }
            return new ml(str, list3, list4, list6);
        }
    }

    /* compiled from: Savers.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lgbb;", "a", "(Ljava/lang/Object;)Lgbb;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: st9$b0 */
    /* loaded from: classes.dex */
    static final class b0 extends ej5 implements Function1<Object, gbb> {
        public static final b0 a = new b0();

        b0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final gbb invoke(Object obj) {
            z65.h(obj, "it");
            List list = (List) obj;
            return new gbb(((Number) list.get(0)).floatValue(), ((Number) list.get(1)).floatValue());
        }
    }

    /* compiled from: Savers.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0014\u0010\u0004\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lrt9;", "", "Lml$a;", "", "it", "a", "(Lrt9;Ljava/util/List;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: st9$c */
    /* loaded from: classes.dex */
    static final class c extends ej5 implements Function2<rt9, List<? extends ml.a<? extends Object>>, Object> {
        public static final c a = new c();

        c() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Object invoke(rt9 rt9Var, List<? extends ml.a<? extends Object>> list) {
            z65.h(rt9Var, "$this$Saver");
            z65.h(list, "it");
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                arrayList.add(st9.u(list.get(i), st9.c, rt9Var));
            }
            return arrayList;
        }
    }

    /* compiled from: Savers.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lrt9;", "Libb;", "it", "", "a", "(Lrt9;Libb;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: st9$c0 */
    /* loaded from: classes.dex */
    static final class c0 extends ej5 implements Function2<rt9, ibb, Object> {
        public static final c0 a = new c0();

        c0() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Object invoke(rt9 rt9Var, ibb ibbVar) {
            ArrayList h;
            z65.h(rt9Var, "$this$Saver");
            z65.h(ibbVar, "it");
            wcb b = wcb.b(ibbVar.b());
            wcb.a aVar = wcb.b;
            h = kc1.h(st9.u(b, st9.r(aVar), rt9Var), st9.u(wcb.b(ibbVar.c()), st9.r(aVar), rt9Var));
            return h;
        }
    }

    /* compiled from: Savers.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0012\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00000\u0003\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "it", "", "Lml$a;", "a", "(Ljava/lang/Object;)Ljava/util/List;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: st9$d */
    /* loaded from: classes.dex */
    static final class d extends ej5 implements Function1<Object, List<? extends ml.a<? extends Object>>> {
        public static final d a = new d();

        d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final List<ml.a<? extends Object>> invoke(Object obj) {
            z65.h(obj, "it");
            List list = (List) obj;
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Object obj2 = list.get(i);
                pt9 pt9Var = st9.c;
                ml.a aVar = null;
                if (!z65.c(obj2, Boolean.FALSE) && obj2 != null) {
                    aVar = (ml.a) pt9Var.b(obj2);
                }
                z65.e(aVar);
                arrayList.add(aVar);
            }
            return arrayList;
        }
    }

    /* compiled from: Savers.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Libb;", "a", "(Ljava/lang/Object;)Libb;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: st9$d0 */
    /* loaded from: classes.dex */
    static final class d0 extends ej5 implements Function1<Object, ibb> {
        public static final d0 a = new d0();

        d0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final ibb invoke(Object obj) {
            wcb b;
            z65.h(obj, "it");
            List list = (List) obj;
            Object obj2 = list.get(0);
            wcb.a aVar = wcb.b;
            pt9<wcb, Object> r = st9.r(aVar);
            Boolean bool = Boolean.FALSE;
            wcb wcbVar = null;
            if (z65.c(obj2, bool) || obj2 == null) {
                b = null;
            } else {
                b = r.b(obj2);
            }
            z65.e(b);
            long k = b.k();
            Object obj3 = list.get(1);
            pt9<wcb, Object> r2 = st9.r(aVar);
            if (!z65.c(obj3, bool) && obj3 != null) {
                wcbVar = r2.b(obj3);
            }
            z65.e(wcbVar);
            return new ibb(k, wcbVar.k(), null);
        }
    }

    /* compiled from: Savers.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002*\u00020\u00002\u000e\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lrt9;", "Lml$a;", "", "it", "a", "(Lrt9;Lml$a;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: st9$e */
    /* loaded from: classes.dex */
    static final class e extends ej5 implements Function2<rt9, ml.a<? extends Object>, Object> {
        public static final e a = new e();

        /* compiled from: Savers.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: st9$e$a */
        /* loaded from: classes.dex */
        public /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[sl.values().length];
                try {
                    iArr[sl.Paragraph.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[sl.Span.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[sl.VerbatimTts.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[sl.Url.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[sl.String.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        e() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Object invoke(rt9 rt9Var, ml.a<? extends Object> aVar) {
            sl slVar;
            Object u;
            ArrayList h;
            z65.h(rt9Var, "$this$Saver");
            z65.h(aVar, "it");
            Object e = aVar.e();
            if (e instanceof jq7) {
                slVar = sl.Paragraph;
            } else if (e instanceof vqa) {
                slVar = sl.Span;
            } else if (e instanceof xxb) {
                slVar = sl.VerbatimTts;
            } else if (e instanceof stb) {
                slVar = sl.Url;
            } else {
                slVar = sl.String;
            }
            int i = a.$EnumSwitchMapping$0[slVar.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 5) {
                                u = st9.t(aVar.e());
                            } else {
                                throw new NoWhenBranchMatchedException();
                            }
                        } else {
                            Object e2 = aVar.e();
                            z65.f(e2, "null cannot be cast to non-null type androidx.compose.ui.text.UrlAnnotation");
                            u = st9.u((stb) e2, st9.e, rt9Var);
                        }
                    } else {
                        Object e3 = aVar.e();
                        z65.f(e3, "null cannot be cast to non-null type androidx.compose.ui.text.VerbatimTtsAnnotation");
                        u = st9.u((xxb) e3, st9.d, rt9Var);
                    }
                } else {
                    Object e4 = aVar.e();
                    z65.f(e4, "null cannot be cast to non-null type androidx.compose.ui.text.SpanStyle");
                    u = st9.u((vqa) e4, st9.s(), rt9Var);
                }
            } else {
                Object e5 = aVar.e();
                z65.f(e5, "null cannot be cast to non-null type androidx.compose.ui.text.ParagraphStyle");
                u = st9.u((jq7) e5, st9.f(), rt9Var);
            }
            h = kc1.h(st9.t(slVar), u, st9.t(Integer.valueOf(aVar.f())), st9.t(Integer.valueOf(aVar.d())), st9.t(aVar.g()));
            return h;
        }
    }

    /* compiled from: Savers.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lrt9;", "Ljcb;", "it", "", "a", "(Lrt9;J)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: st9$e0 */
    /* loaded from: classes.dex */
    static final class e0 extends ej5 implements Function2<rt9, jcb, Object> {
        public static final e0 a = new e0();

        e0() {
            super(2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final Object a(rt9 rt9Var, long j) {
            ArrayList h;
            z65.h(rt9Var, "$this$Saver");
            h = kc1.h(st9.t(Integer.valueOf(jcb.j(j))), st9.t(Integer.valueOf(jcb.g(j))));
            return h;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(rt9 rt9Var, jcb jcbVar) {
            return a(rt9Var, jcbVar.m());
        }
    }

    /* compiled from: Savers.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0000\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lml$a;", "a", "(Ljava/lang/Object;)Lml$a;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: st9$f */
    /* loaded from: classes.dex */
    static final class f extends ej5 implements Function1<Object, ml.a<? extends Object>> {
        public static final f a = new f();

        /* compiled from: Savers.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: st9$f$a */
        /* loaded from: classes.dex */
        public /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[sl.values().length];
                try {
                    iArr[sl.Paragraph.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[sl.Span.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[sl.VerbatimTts.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[sl.Url.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[sl.String.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final ml.a<? extends Object> invoke(Object obj) {
            sl slVar;
            Integer num;
            Integer num2;
            String str;
            z65.h(obj, "it");
            List list = (List) obj;
            Object obj2 = list.get(0);
            jq7 jq7Var = null;
            if (obj2 != null) {
                slVar = (sl) obj2;
            } else {
                slVar = null;
            }
            z65.e(slVar);
            Object obj3 = list.get(2);
            if (obj3 != null) {
                num = (Integer) obj3;
            } else {
                num = null;
            }
            z65.e(num);
            int intValue = num.intValue();
            Object obj4 = list.get(3);
            if (obj4 != null) {
                num2 = (Integer) obj4;
            } else {
                num2 = null;
            }
            z65.e(num2);
            int intValue2 = num2.intValue();
            Object obj5 = list.get(4);
            if (obj5 != null) {
                str = (String) obj5;
            } else {
                str = null;
            }
            z65.e(str);
            int i = a.$EnumSwitchMapping$0[slVar.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 5) {
                                Object obj6 = list.get(1);
                                if (obj6 != null) {
                                    jq7Var = (String) obj6;
                                }
                                z65.e(jq7Var);
                                return new ml.a<>(jq7Var, intValue, intValue2, str);
                            }
                            throw new NoWhenBranchMatchedException();
                        }
                        Object obj7 = list.get(1);
                        pt9 pt9Var = st9.e;
                        if (!z65.c(obj7, Boolean.FALSE) && obj7 != null) {
                            jq7Var = (stb) pt9Var.b(obj7);
                        }
                        z65.e(jq7Var);
                        return new ml.a<>(jq7Var, intValue, intValue2, str);
                    }
                    Object obj8 = list.get(1);
                    pt9 pt9Var2 = st9.d;
                    if (!z65.c(obj8, Boolean.FALSE) && obj8 != null) {
                        jq7Var = (xxb) pt9Var2.b(obj8);
                    }
                    z65.e(jq7Var);
                    return new ml.a<>(jq7Var, intValue, intValue2, str);
                }
                Object obj9 = list.get(1);
                pt9<vqa, Object> s = st9.s();
                if (!z65.c(obj9, Boolean.FALSE) && obj9 != null) {
                    jq7Var = s.b(obj9);
                }
                z65.e(jq7Var);
                return new ml.a<>(jq7Var, intValue, intValue2, str);
            }
            Object obj10 = list.get(1);
            pt9<jq7, Object> f = st9.f();
            if (!z65.c(obj10, Boolean.FALSE) && obj10 != null) {
                jq7Var = f.b(obj10);
            }
            z65.e(jq7Var);
            return new ml.a<>(jq7Var, intValue, intValue2, str);
        }
    }

    /* compiled from: Savers.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Ljcb;", "a", "(Ljava/lang/Object;)Ljcb;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: st9$f0 */
    /* loaded from: classes.dex */
    static final class f0 extends ej5 implements Function1<Object, jcb> {
        public static final f0 a = new f0();

        f0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final jcb invoke(Object obj) {
            Integer num;
            z65.h(obj, "it");
            List list = (List) obj;
            Object obj2 = list.get(0);
            Integer num2 = null;
            if (obj2 != null) {
                num = (Integer) obj2;
            } else {
                num = null;
            }
            z65.e(num);
            int intValue = num.intValue();
            Object obj3 = list.get(1);
            if (obj3 != null) {
                num2 = (Integer) obj3;
            }
            z65.e(num2);
            return jcb.b(kcb.b(intValue, num2.intValue()));
        }
    }

    /* compiled from: Savers.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lrt9;", "Lv80;", "it", "", "a", "(Lrt9;F)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: st9$g */
    /* loaded from: classes.dex */
    static final class g extends ej5 implements Function2<rt9, v80, Object> {
        public static final g a = new g();

        g() {
            super(2);
        }

        public final Object a(rt9 rt9Var, float f) {
            z65.h(rt9Var, "$this$Saver");
            return Float.valueOf(f);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(rt9 rt9Var, v80 v80Var) {
            return a(rt9Var, v80Var.h());
        }
    }

    /* compiled from: Savers.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lrt9;", "Lwcb;", "it", "", "a", "(Lrt9;J)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: st9$g0 */
    /* loaded from: classes.dex */
    static final class g0 extends ej5 implements Function2<rt9, wcb, Object> {
        public static final g0 a = new g0();

        g0() {
            super(2);
        }

        public final Object a(rt9 rt9Var, long j) {
            ArrayList h;
            z65.h(rt9Var, "$this$Saver");
            h = kc1.h(st9.t(Float.valueOf(wcb.h(j))), st9.t(ycb.d(wcb.g(j))));
            return h;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(rt9 rt9Var, wcb wcbVar) {
            return a(rt9Var, wcbVar.k());
        }
    }

    /* compiled from: Savers.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lv80;", "a", "(Ljava/lang/Object;)Lv80;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: st9$h */
    /* loaded from: classes.dex */
    static final class h extends ej5 implements Function1<Object, v80> {
        public static final h a = new h();

        h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final v80 invoke(Object obj) {
            z65.h(obj, "it");
            return v80.b(v80.c(((Float) obj).floatValue()));
        }
    }

    /* compiled from: Savers.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lwcb;", "a", "(Ljava/lang/Object;)Lwcb;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: st9$h0 */
    /* loaded from: classes.dex */
    static final class h0 extends ej5 implements Function1<Object, wcb> {
        public static final h0 a = new h0();

        h0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final wcb invoke(Object obj) {
            Float f;
            z65.h(obj, "it");
            List list = (List) obj;
            Object obj2 = list.get(0);
            ycb ycbVar = null;
            if (obj2 != null) {
                f = (Float) obj2;
            } else {
                f = null;
            }
            z65.e(f);
            float floatValue = f.floatValue();
            Object obj3 = list.get(1);
            if (obj3 != null) {
                ycbVar = (ycb) obj3;
            }
            z65.e(ycbVar);
            return wcb.b(xcb.a(floatValue, ycbVar.j()));
        }
    }

    /* compiled from: Savers.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lrt9;", "Luc1;", "it", "", "a", "(Lrt9;J)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: st9$i */
    /* loaded from: classes.dex */
    static final class i extends ej5 implements Function2<rt9, uc1, Object> {
        public static final i a = new i();

        i() {
            super(2);
        }

        public final Object a(rt9 rt9Var, long j) {
            z65.h(rt9Var, "$this$Saver");
            return opb.a(j);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(rt9 rt9Var, uc1 uc1Var) {
            return a(rt9Var, uc1Var.t());
        }
    }

    /* compiled from: Savers.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lrt9;", "Lstb;", "it", "", "a", "(Lrt9;Lstb;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: st9$i0 */
    /* loaded from: classes.dex */
    static final class i0 extends ej5 implements Function2<rt9, stb, Object> {
        public static final i0 a = new i0();

        i0() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Object invoke(rt9 rt9Var, stb stbVar) {
            z65.h(rt9Var, "$this$Saver");
            z65.h(stbVar, "it");
            return st9.t(stbVar.a());
        }
    }

    /* compiled from: Savers.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Luc1;", "a", "(Ljava/lang/Object;)Luc1;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: st9$j */
    /* loaded from: classes.dex */
    static final class j extends ej5 implements Function1<Object, uc1> {
        public static final j a = new j();

        j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final uc1 invoke(Object obj) {
            z65.h(obj, "it");
            return uc1.f(uc1.g(((opb) obj).p()));
        }
    }

    /* compiled from: Savers.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lstb;", "a", "(Ljava/lang/Object;)Lstb;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: st9$j0 */
    /* loaded from: classes.dex */
    static final class j0 extends ej5 implements Function1<Object, stb> {
        public static final j0 a = new j0();

        j0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final stb invoke(Object obj) {
            z65.h(obj, "it");
            return new stb((String) obj);
        }
    }

    /* compiled from: Savers.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lrt9;", "Lv34;", "it", "", "a", "(Lrt9;Lv34;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: st9$k */
    /* loaded from: classes.dex */
    static final class k extends ej5 implements Function2<rt9, v34, Object> {
        public static final k a = new k();

        k() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Object invoke(rt9 rt9Var, v34 v34Var) {
            z65.h(rt9Var, "$this$Saver");
            z65.h(v34Var, "it");
            return Integer.valueOf(v34Var.B());
        }
    }

    /* compiled from: Savers.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lrt9;", "Lxxb;", "it", "", "a", "(Lrt9;Lxxb;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: st9$k0 */
    /* loaded from: classes.dex */
    static final class k0 extends ej5 implements Function2<rt9, xxb, Object> {
        public static final k0 a = new k0();

        k0() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Object invoke(rt9 rt9Var, xxb xxbVar) {
            z65.h(rt9Var, "$this$Saver");
            z65.h(xxbVar, "it");
            return st9.t(xxbVar.a());
        }
    }

    /* compiled from: Savers.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lv34;", "a", "(Ljava/lang/Object;)Lv34;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: st9$l */
    /* loaded from: classes.dex */
    static final class l extends ej5 implements Function1<Object, v34> {
        public static final l a = new l();

        l() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final v34 invoke(Object obj) {
            z65.h(obj, "it");
            return new v34(((Integer) obj).intValue());
        }
    }

    /* compiled from: Savers.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lxxb;", "a", "(Ljava/lang/Object;)Lxxb;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: st9$l0 */
    /* loaded from: classes.dex */
    static final class l0 extends ej5 implements Function1<Object, xxb> {
        public static final l0 a = new l0();

        l0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final xxb invoke(Object obj) {
            z65.h(obj, "it");
            return new xxb((String) obj);
        }
    }

    /* compiled from: Savers.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lrt9;", "Lns5;", "it", "", "a", "(Lrt9;Lns5;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: st9$m */
    /* loaded from: classes.dex */
    static final class m extends ej5 implements Function2<rt9, ns5, Object> {
        public static final m a = new m();

        m() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Object invoke(rt9 rt9Var, ns5 ns5Var) {
            z65.h(rt9Var, "$this$Saver");
            z65.h(ns5Var, "it");
            List<is5> h = ns5Var.h();
            ArrayList arrayList = new ArrayList(h.size());
            int size = h.size();
            for (int i = 0; i < size; i++) {
                arrayList.add(st9.u(h.get(i), st9.j(is5.b), rt9Var));
            }
            return arrayList;
        }
    }

    /* compiled from: Savers.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lns5;", "a", "(Ljava/lang/Object;)Lns5;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: st9$n */
    /* loaded from: classes.dex */
    static final class n extends ej5 implements Function1<Object, ns5> {
        public static final n a = new n();

        n() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final ns5 invoke(Object obj) {
            z65.h(obj, "it");
            List list = (List) obj;
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Object obj2 = list.get(i);
                pt9<is5, Object> j = st9.j(is5.b);
                is5 is5Var = null;
                if (!z65.c(obj2, Boolean.FALSE) && obj2 != null) {
                    is5Var = j.b(obj2);
                }
                z65.e(is5Var);
                arrayList.add(is5Var);
            }
            return new ns5(arrayList);
        }
    }

    /* compiled from: Savers.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lrt9;", "Lis5;", "it", "", "a", "(Lrt9;Lis5;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: st9$o */
    /* loaded from: classes.dex */
    static final class o extends ej5 implements Function2<rt9, is5, Object> {
        public static final o a = new o();

        o() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Object invoke(rt9 rt9Var, is5 is5Var) {
            z65.h(rt9Var, "$this$Saver");
            z65.h(is5Var, "it");
            return is5Var.b();
        }
    }

    /* compiled from: Savers.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lis5;", "a", "(Ljava/lang/Object;)Lis5;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: st9$p */
    /* loaded from: classes.dex */
    static final class p extends ej5 implements Function1<Object, is5> {
        public static final p a = new p();

        p() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final is5 invoke(Object obj) {
            z65.h(obj, "it");
            return new is5((String) obj);
        }
    }

    /* compiled from: Savers.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lrt9;", "Ls67;", "it", "", "a", "(Lrt9;J)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: st9$q */
    /* loaded from: classes.dex */
    static final class q extends ej5 implements Function2<rt9, s67, Object> {
        public static final q a = new q();

        q() {
            super(2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final Object a(rt9 rt9Var, long j) {
            ArrayList h;
            z65.h(rt9Var, "$this$Saver");
            if (!s67.i(j, s67.b.b())) {
                h = kc1.h(st9.t(Float.valueOf(s67.l(j))), st9.t(Float.valueOf(s67.m(j))));
                return h;
            }
            return Boolean.FALSE;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(rt9 rt9Var, s67 s67Var) {
            return a(rt9Var, s67Var.t());
        }
    }

    /* compiled from: Savers.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Ls67;", "a", "(Ljava/lang/Object;)Ls67;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: st9$r */
    /* loaded from: classes.dex */
    static final class r extends ej5 implements Function1<Object, s67> {
        public static final r a = new r();

        r() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final s67 invoke(Object obj) {
            Float f;
            z65.h(obj, "it");
            if (z65.c(obj, Boolean.FALSE)) {
                return s67.d(s67.b.b());
            }
            List list = (List) obj;
            Object obj2 = list.get(0);
            Float f2 = null;
            if (obj2 != null) {
                f = (Float) obj2;
            } else {
                f = null;
            }
            z65.e(f);
            float floatValue = f.floatValue();
            Object obj3 = list.get(1);
            if (obj3 != null) {
                f2 = (Float) obj3;
            }
            z65.e(f2);
            return s67.d(x67.a(floatValue, f2.floatValue()));
        }
    }

    /* compiled from: Savers.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lrt9;", "Ljq7;", "it", "", "a", "(Lrt9;Ljq7;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: st9$s */
    /* loaded from: classes.dex */
    static final class s extends ej5 implements Function2<rt9, jq7, Object> {
        public static final s a = new s();

        s() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Object invoke(rt9 rt9Var, jq7 jq7Var) {
            ArrayList h;
            z65.h(rt9Var, "$this$Saver");
            z65.h(jq7Var, "it");
            h = kc1.h(st9.t(jq7Var.j()), st9.t(jq7Var.l()), st9.u(wcb.b(jq7Var.g()), st9.r(wcb.b), rt9Var), st9.u(jq7Var.m(), st9.p(ibb.c), rt9Var));
            return h;
        }
    }

    /* compiled from: Savers.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Ljq7;", "a", "(Ljava/lang/Object;)Ljq7;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: st9$t */
    /* loaded from: classes.dex */
    static final class t extends ej5 implements Function1<Object, jq7> {
        public static final t a = new t();

        t() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final jq7 invoke(Object obj) {
            i9b i9bVar;
            oab oabVar;
            wcb b;
            ibb b2;
            z65.h(obj, "it");
            List list = (List) obj;
            Object obj2 = list.get(0);
            if (obj2 != null) {
                i9bVar = (i9b) obj2;
            } else {
                i9bVar = null;
            }
            Object obj3 = list.get(1);
            if (obj3 != null) {
                oabVar = (oab) obj3;
            } else {
                oabVar = null;
            }
            Object obj4 = list.get(2);
            pt9<wcb, Object> r = st9.r(wcb.b);
            Boolean bool = Boolean.FALSE;
            if (z65.c(obj4, bool) || obj4 == null) {
                b = null;
            } else {
                b = r.b(obj4);
            }
            z65.e(b);
            long k = b.k();
            Object obj5 = list.get(3);
            pt9<ibb, Object> p = st9.p(ibb.c);
            if (z65.c(obj5, bool) || obj5 == null) {
                b2 = null;
            } else {
                b2 = p.b(obj5);
            }
            return new jq7(i9bVar, oabVar, k, b2, null, null, null, null, null, 496, null);
        }
    }

    /* compiled from: Savers.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lrt9;", "Loga;", "it", "", "a", "(Lrt9;Loga;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: st9$u */
    /* loaded from: classes.dex */
    static final class u extends ej5 implements Function2<rt9, oga, Object> {
        public static final u a = new u();

        u() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Object invoke(rt9 rt9Var, oga ogaVar) {
            ArrayList h;
            z65.h(rt9Var, "$this$Saver");
            z65.h(ogaVar, "it");
            h = kc1.h(st9.u(uc1.f(ogaVar.c()), st9.h(uc1.b), rt9Var), st9.u(s67.d(ogaVar.d()), st9.l(s67.b), rt9Var), st9.t(Float.valueOf(ogaVar.b())));
            return h;
        }
    }

    /* compiled from: Savers.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Loga;", "a", "(Ljava/lang/Object;)Loga;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: st9$v */
    /* loaded from: classes.dex */
    static final class v extends ej5 implements Function1<Object, oga> {
        public static final v a = new v();

        v() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final oga invoke(Object obj) {
            uc1 b;
            s67 b2;
            z65.h(obj, "it");
            List list = (List) obj;
            Object obj2 = list.get(0);
            pt9<uc1, Object> h = st9.h(uc1.b);
            Boolean bool = Boolean.FALSE;
            Float f = null;
            if (z65.c(obj2, bool) || obj2 == null) {
                b = null;
            } else {
                b = h.b(obj2);
            }
            z65.e(b);
            long t = b.t();
            Object obj3 = list.get(1);
            pt9<s67, Object> l = st9.l(s67.b);
            if (z65.c(obj3, bool) || obj3 == null) {
                b2 = null;
            } else {
                b2 = l.b(obj3);
            }
            z65.e(b2);
            long t2 = b2.t();
            Object obj4 = list.get(2);
            if (obj4 != null) {
                f = (Float) obj4;
            }
            z65.e(f);
            return new oga(t, t2, f.floatValue(), null);
        }
    }

    /* compiled from: Savers.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lrt9;", "Lvqa;", "it", "", "a", "(Lrt9;Lvqa;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: st9$w */
    /* loaded from: classes.dex */
    static final class w extends ej5 implements Function2<rt9, vqa, Object> {
        public static final w a = new w();

        w() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Object invoke(rt9 rt9Var, vqa vqaVar) {
            ArrayList h;
            z65.h(rt9Var, "$this$Saver");
            z65.h(vqaVar, "it");
            uc1 f = uc1.f(vqaVar.g());
            uc1.a aVar = uc1.b;
            wcb b = wcb.b(vqaVar.k());
            wcb.a aVar2 = wcb.b;
            h = kc1.h(st9.u(f, st9.h(aVar), rt9Var), st9.u(b, st9.r(aVar2), rt9Var), st9.u(vqaVar.n(), st9.i(v34.b), rt9Var), st9.t(vqaVar.l()), st9.t(vqaVar.m()), st9.t(-1), st9.t(vqaVar.j()), st9.u(wcb.b(vqaVar.o()), st9.r(aVar2), rt9Var), st9.u(vqaVar.e(), st9.g(v80.b), rt9Var), st9.u(vqaVar.u(), st9.o(gbb.c), rt9Var), st9.u(vqaVar.p(), st9.k(ns5.c), rt9Var), st9.u(uc1.f(vqaVar.d()), st9.h(aVar), rt9Var), st9.u(vqaVar.s(), st9.n(kab.b), rt9Var), st9.u(vqaVar.r(), st9.m(oga.d), rt9Var));
            return h;
        }
    }

    /* compiled from: Savers.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lvqa;", "a", "(Ljava/lang/Object;)Lvqa;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: st9$x */
    /* loaded from: classes.dex */
    static final class x extends ej5 implements Function1<Object, vqa> {
        public static final x a = new x();

        x() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final vqa invoke(Object obj) {
            uc1 b;
            wcb b2;
            v34 b3;
            q34 q34Var;
            r34 r34Var;
            String str;
            wcb b4;
            v80 b5;
            gbb b6;
            ns5 b7;
            uc1 b8;
            kab b9;
            oga b10;
            z65.h(obj, "it");
            List list = (List) obj;
            Object obj2 = list.get(0);
            uc1.a aVar = uc1.b;
            pt9<uc1, Object> h = st9.h(aVar);
            Boolean bool = Boolean.FALSE;
            if (z65.c(obj2, bool) || obj2 == null) {
                b = null;
            } else {
                b = h.b(obj2);
            }
            z65.e(b);
            long t = b.t();
            Object obj3 = list.get(1);
            wcb.a aVar2 = wcb.b;
            pt9<wcb, Object> r = st9.r(aVar2);
            if (z65.c(obj3, bool) || obj3 == null) {
                b2 = null;
            } else {
                b2 = r.b(obj3);
            }
            z65.e(b2);
            long k = b2.k();
            Object obj4 = list.get(2);
            pt9<v34, Object> i = st9.i(v34.b);
            if (z65.c(obj4, bool) || obj4 == null) {
                b3 = null;
            } else {
                b3 = i.b(obj4);
            }
            Object obj5 = list.get(3);
            if (obj5 != null) {
                q34Var = (q34) obj5;
            } else {
                q34Var = null;
            }
            Object obj6 = list.get(4);
            if (obj6 != null) {
                r34Var = (r34) obj6;
            } else {
                r34Var = null;
            }
            Object obj7 = list.get(6);
            if (obj7 != null) {
                str = (String) obj7;
            } else {
                str = null;
            }
            Object obj8 = list.get(7);
            pt9<wcb, Object> r2 = st9.r(aVar2);
            if (z65.c(obj8, bool) || obj8 == null) {
                b4 = null;
            } else {
                b4 = r2.b(obj8);
            }
            z65.e(b4);
            long k2 = b4.k();
            Object obj9 = list.get(8);
            pt9<v80, Object> g = st9.g(v80.b);
            if (z65.c(obj9, bool) || obj9 == null) {
                b5 = null;
            } else {
                b5 = g.b(obj9);
            }
            Object obj10 = list.get(9);
            pt9<gbb, Object> o = st9.o(gbb.c);
            if (z65.c(obj10, bool) || obj10 == null) {
                b6 = null;
            } else {
                b6 = o.b(obj10);
            }
            Object obj11 = list.get(10);
            pt9<ns5, Object> k3 = st9.k(ns5.c);
            if (z65.c(obj11, bool) || obj11 == null) {
                b7 = null;
            } else {
                b7 = k3.b(obj11);
            }
            Object obj12 = list.get(11);
            pt9<uc1, Object> h2 = st9.h(aVar);
            if (z65.c(obj12, bool) || obj12 == null) {
                b8 = null;
            } else {
                b8 = h2.b(obj12);
            }
            z65.e(b8);
            long t2 = b8.t();
            Object obj13 = list.get(12);
            pt9<kab, Object> n = st9.n(kab.b);
            if (z65.c(obj13, bool) || obj13 == null) {
                b9 = null;
            } else {
                b9 = n.b(obj13);
            }
            Object obj14 = list.get(13);
            pt9<oga, Object> m = st9.m(oga.d);
            if (z65.c(obj14, bool) || obj14 == null) {
                b10 = null;
            } else {
                b10 = m.b(obj14);
            }
            return new vqa(t, k, b3, q34Var, r34Var, null, str, k2, b5, b6, b7, t2, b9, b10, null, null, 49184, null);
        }
    }

    /* compiled from: Savers.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lrt9;", "Lkab;", "it", "", "a", "(Lrt9;Lkab;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: st9$y */
    /* loaded from: classes.dex */
    static final class y extends ej5 implements Function2<rt9, kab, Object> {
        public static final y a = new y();

        y() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Object invoke(rt9 rt9Var, kab kabVar) {
            z65.h(rt9Var, "$this$Saver");
            z65.h(kabVar, "it");
            return Integer.valueOf(kabVar.e());
        }
    }

    /* compiled from: Savers.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkab;", "a", "(Ljava/lang/Object;)Lkab;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: st9$z */
    /* loaded from: classes.dex */
    static final class z extends ej5 implements Function1<Object, kab> {
        public static final z a = new z();

        z() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final kab invoke(Object obj) {
            z65.h(obj, "it");
            return new kab(((Integer) obj).intValue());
        }
    }

    public static final pt9<ml, Object> e() {
        return a;
    }

    public static final pt9<jq7, Object> f() {
        return f;
    }

    public static final pt9<v80, Object> g(v80.a aVar) {
        z65.h(aVar, "<this>");
        return l;
    }

    public static final pt9<uc1, Object> h(uc1.a aVar) {
        z65.h(aVar, "<this>");
        return o;
    }

    public static final pt9<v34, Object> i(v34.a aVar) {
        z65.h(aVar, "<this>");
        return k;
    }

    public static final pt9<is5, Object> j(is5.a aVar) {
        z65.h(aVar, "<this>");
        return s;
    }

    public static final pt9<ns5, Object> k(ns5.a aVar) {
        z65.h(aVar, "<this>");
        return r;
    }

    public static final pt9<s67, Object> l(s67.a aVar) {
        z65.h(aVar, "<this>");
        return q;
    }

    public static final pt9<oga, Object> m(oga.a aVar) {
        z65.h(aVar, "<this>");
        return n;
    }

    public static final pt9<kab, Object> n(kab.a aVar) {
        z65.h(aVar, "<this>");
        return h;
    }

    public static final pt9<gbb, Object> o(gbb.a aVar) {
        z65.h(aVar, "<this>");
        return i;
    }

    public static final pt9<ibb, Object> p(ibb.a aVar) {
        z65.h(aVar, "<this>");
        return j;
    }

    public static final pt9<jcb, Object> q(jcb.a aVar) {
        z65.h(aVar, "<this>");
        return m;
    }

    public static final pt9<wcb, Object> r(wcb.a aVar) {
        z65.h(aVar, "<this>");
        return p;
    }

    public static final pt9<vqa, Object> s() {
        return g;
    }

    public static final <T extends pt9<Original, Saveable>, Original, Saveable> Object u(Original original, T t2, rt9 rt9Var) {
        Object a2;
        z65.h(t2, "saver");
        z65.h(rt9Var, Action.SCOPE_ATTRIBUTE);
        if (original == null || (a2 = t2.a(rt9Var, original)) == null) {
            return Boolean.FALSE;
        }
        return a2;
    }

    public static final <T> T t(T t2) {
        return t2;
    }
}
