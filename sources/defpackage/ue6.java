package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.gson.Gson;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import im.threads.business.transport.MessageAttributes;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.MatchResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/* compiled from: MenuItemV5ImageResolver.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0001\fB\u0011\b\u0007\u0012\u0006\u0010\u0014\u001a\u00020\u0012¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010\f\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\f\u0010\r\u001a\u00020\u0006*\u00020\u0006H\u0002J&\u0010\u0011\u001a\u00020\u00062\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\nR\u0014\u0010\u0014\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0013R\u001c\u0010\u0018\u001a\n \u0016*\u0004\u0018\u00010\u00150\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0017¨\u0006\u001c"}, d2 = {"Lue6;", "", "Lrv4;", "size", "Lxv4;", "imageValue", "", e.a, "Llu4;", "imageFormat", "Luv4;", MessageAttributes.TYPE, "a", DateTokenConverter.CONVERTER_KEY, "", "Lwv4;", "images", "b", "Lcom/google/gson/Gson;", "Lcom/google/gson/Gson;", "gson", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "Lorg/slf4j/Logger;", "logger", "<init>", "(Lcom/google/gson/Gson;)V", c.a, "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: ue6 */
/* loaded from: classes4.dex */
public final class ue6 {
    private static final a c = new a(null);
    private static final ec9 d = new ec9("\\{(\\w+)\\}");
    private static final ec9 e = new ec9("\\{baseUrl\\}");
    private static final ec9 f = new ec9("\\{id\\}");
    private static final ec9 g = new ec9("\\{format\\}");
    private static final ec9 h = new ec9("\\{size\\}");
    private static final ec9 i = new ec9("\\{width\\}");
    private static final ec9 j = new ec9("\\{height\\}");
    private final Gson a;
    private final Logger b;

    /* compiled from: MenuItemV5ImageResolver.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0004¨\u0006\r"}, d2 = {"Lue6$a;", "", "Lec9;", "GENERAL_REG_EX", "Lec9;", "REG_EX_BASE_URL", "REG_EX_FORMAT", "REG_EX_HEIGHT", "REG_EX_ID", "REG_EX_SIZE", "REG_EX_WIDTH", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: ue6$a */
    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: Comparisons.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ue6$b */
    /* loaded from: classes4.dex */
    public static final class b<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int d;
            d = mk1.d(Long.valueOf(((xv4) t).a()), Long.valueOf(((xv4) t2).a()));
            return d;
        }
    }

    public ue6(Gson gson) {
        z65.h(gson, "gson");
        this.a = gson;
        this.b = LoggerFactory.getLogger("MenuItemV5ImageResolver");
    }

    private final String a(lu4 lu4Var, uv4 uv4Var) {
        Object Z;
        if (lu4Var.b().contains(uv4Var.getValue())) {
            return d.i(lu4Var.a(), uv4Var.getValue());
        }
        List<String> b2 = lu4Var.b();
        uv4 uv4Var2 = uv4.c;
        if (b2.contains(uv4Var2.getValue())) {
            return d.i(lu4Var.a(), uv4Var2.getValue());
        } else if (!lu4Var.b().isEmpty()) {
            String a2 = lu4Var.a();
            ec9 ec9Var = d;
            Z = sc1.Z(lu4Var.b());
            return ec9Var.i(a2, (String) Z);
        } else {
            return lu4Var.a();
        }
    }

    public static /* synthetic */ String c(ue6 ue6Var, List list, xv4 xv4Var, uv4 uv4Var, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            uv4Var = uv4.b;
        }
        return ue6Var.b(list, xv4Var, uv4Var);
    }

    private final String d(String str) {
        String F;
        String F2;
        F = l0b.F(str, "{", "", false, 4, null);
        F2 = l0b.F(F, "}", "", false, 4, null);
        return F2;
    }

    private final String e(rv4 rv4Var, xv4 xv4Var) {
        List<xv4> y0;
        Object Z;
        Object Z2;
        y0 = sc1.y0(rv4Var.b(), new b());
        for (xv4 xv4Var2 : y0) {
            if (xv4Var2.a() >= xv4Var.a()) {
                return i.i(j.i(rv4Var.a(), String.valueOf(xv4Var2.a())), String.valueOf(xv4Var2.b()));
            }
        }
        if (!rv4Var.b().isEmpty()) {
            String a2 = rv4Var.a();
            ec9 ec9Var = j;
            Z = sc1.Z(rv4Var.b());
            String i2 = ec9Var.i(a2, String.valueOf(((xv4) Z).a()));
            ec9 ec9Var2 = i;
            Z2 = sc1.Z(rv4Var.b());
            return ec9Var2.i(i2, String.valueOf(((xv4) Z2).b()));
        }
        return rv4Var.a();
    }

    public final String b(List<wv4> list, xv4 xv4Var, uv4 uv4Var) {
        Object Z;
        z65.h(list, "images");
        z65.h(xv4Var, "imageValue");
        z65.h(uv4Var, MessageAttributes.TYPE);
        if (list.isEmpty()) {
            return "";
        }
        Z = sc1.Z(list);
        wv4 wv4Var = (wv4) Z;
        String b2 = wv4Var.b();
        for (MatchResult matchResult : ec9.d(d, wv4Var.b(), 0, 2, null)) {
            if (e.f(matchResult.getValue())) {
                String value = matchResult.getValue();
                try {
                    Object obj = wv4Var.a().get(d(value));
                    if (obj != null) {
                        b2 = l0b.F(b2, matchResult.getValue(), obj.toString(), false, 4, null);
                    } else {
                        Logger logger = this.b;
                        logger.error("Failed to parse image section! " + value + " does not exist in imageMeta");
                    }
                } catch (Exception e2) {
                    Logger logger2 = this.b;
                    String d2 = d(value);
                    logger2.error("Failed to parse " + d2 + " from imageMeta: ", (Throwable) e2);
                }
            } else {
                if (f.f(matchResult.getValue())) {
                    String value2 = matchResult.getValue();
                    try {
                        Object obj2 = wv4Var.a().get(d(value2));
                        if (obj2 != null) {
                            b2 = l0b.F(b2, matchResult.getValue(), obj2.toString(), false, 4, null);
                        } else {
                            Logger logger3 = this.b;
                            logger3.error("Failed to parse image section! " + value2 + " does not exist in imageMeta");
                        }
                    } catch (Exception e3) {
                        Logger logger4 = this.b;
                        String d3 = d(value2);
                        logger4.error("Failed to parse " + d3 + " from imageMeta: ", (Throwable) e3);
                    }
                } else {
                    if (h.f(matchResult.getValue())) {
                        String value3 = matchResult.getValue();
                        try {
                            Object obj3 = wv4Var.a().get(d(value3));
                            if (obj3 == null) {
                                Logger logger5 = this.b;
                                logger5.error("Failed to parse image section! " + value3 + " does not exist in imageMeta");
                            } else {
                                rv4 rv4Var = (rv4) this.a.k(this.a.t(obj3), rv4.class);
                                String value4 = matchResult.getValue();
                                z65.e(rv4Var);
                                b2 = l0b.F(b2, value4, e(rv4Var, xv4Var), false, 4, null);
                            }
                        } catch (Exception e4) {
                            Logger logger6 = this.b;
                            String d4 = d(value3);
                            logger6.error("Failed to parse " + d4 + " from imageMeta: ", (Throwable) e4);
                        }
                    } else {
                        if (g.f(matchResult.getValue())) {
                            String value5 = matchResult.getValue();
                            try {
                                Object obj4 = wv4Var.a().get(d(value5));
                                if (obj4 == null) {
                                    Logger logger7 = this.b;
                                    logger7.error("Failed to parse image section! " + value5 + " does not exist in imageMeta");
                                } else {
                                    lu4 lu4Var = (lu4) this.a.k(this.a.t(obj4), lu4.class);
                                    String value6 = matchResult.getValue();
                                    z65.e(lu4Var);
                                    b2 = l0b.F(b2, value6, a(lu4Var, uv4Var), false, 4, null);
                                }
                            } catch (Exception e5) {
                                Logger logger8 = this.b;
                                String d5 = d(value5);
                                logger8.error("Failed to parse " + d5 + " from imageMeta: ", (Throwable) e5);
                            }
                        } else {
                            String value7 = matchResult.getValue();
                            try {
                                Object obj5 = wv4Var.a().get(d(value7));
                                if (obj5 == null) {
                                    Logger logger9 = this.b;
                                    logger9.error("Failed to parse image section! " + value7 + " does not exist in imageMeta");
                                } else {
                                    String str = b2;
                                    b2 = l0b.F(str, matchResult.getValue(), ((vv4) this.a.k(this.a.t(obj5), vv4.class)).a(), false, 4, null);
                                }
                            } catch (Exception e6) {
                                Logger logger10 = this.b;
                                String d6 = d(value7);
                                logger10.error("Failed to parse " + d6 + " from imageMeta: ", (Throwable) e6);
                            }
                        }
                    }
                }
            }
        }
        return b2;
    }
}
