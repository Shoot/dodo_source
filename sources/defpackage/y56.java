package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import ru.dodopizza.backend.domain.country.dto.addressformat.AddressDetailsFieldDesignDto;
/* compiled from: MapAddressStateVOImpl.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0014\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u001a\u001c\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0005H\u0002\u001a\f\u0010\t\u001a\u00020\u0007*\u00020\u0000H\u0002\u001a\n\u0010\n\u001a\u00020\u0003*\u00020\u0001\u001a\u001a\u0010\u000e\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0005\u001a&\u0010\u0014\u001a\u00020\u000b*\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0013\u001a\u00020\u0012\u001a\n\u0010\u0015\u001a\u00020\u000b*\u00020\u000b\u001a\n\u0010\u0016\u001a\u00020\u000b*\u00020\u000b\u001a\n\u0010\u0017\u001a\u00020\u000b*\u00020\u000b\u001a\n\u0010\u0018\u001a\u00020\u000b*\u00020\u000b\u001a\n\u0010\u0019\u001a\u00020\u000b*\u00020\u000b\u001a\n\u0010\u001a\u001a\u00020\u000b*\u00020\u000b\u001a\n\u0010\u001b\u001a\u00020\u000b*\u00020\u000b\u001a\u0012\u0010\u001c\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0012\u001a\n\u0010\u001d\u001a\u00020\u000b*\u00020\u000b\u001a\u0012\u0010\u001f\u001a\u00020\u001e*\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0005¨\u0006 "}, d2 = {"Lf9;", "Lw7;", "addressFields", "", "f", "", "mainFieldValue", "Ldi0;", DateTokenConverter.CONVERTER_KEY, e.a, Image.TYPE_HIGH, "Lx56;", "fieldId", "text", "i", "Lru/dodopizza/backend/domain/country/dto/addressformat/AddressDetailsFieldDesignDto;", "fieldsDto", "localityId", "Ljx2;", "deliveryLocation", "o", "n", "q", "p", "k", Image.TYPE_MEDIUM, "r", "l", Image.TYPE_SMALL, "j", "Le87;", "g", "geo_release"}, k = 2, mv = {1, 9, 0})
/* renamed from: y56 */
/* loaded from: classes2.dex */
public final class y56 {

    /* compiled from: MapAddressStateVOImpl.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: y56$a */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[f9.values().length];
            try {
                iArr[f9.p.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[f9.q.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[f9.o.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[f9.n.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[f9.k.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[f9.m.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[f9.r.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[f9.s.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[f9.l.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[f9.j.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final di0 d(f9 f9Var, w7 w7Var, String str) {
        switch (a.$EnumSwitchMapping$0[f9Var.ordinal()]) {
            case 4:
                if (h(w7Var)) {
                    return di0.c;
                }
                return di0.a;
            case 5:
                if (str.length() == 0) {
                    return di0.c;
                }
                return di0.a;
            case 6:
                if (str.length() == 0) {
                    return di0.c;
                }
                return di0.a;
            case 7:
                return di0.b;
            case 8:
                return di0.c;
            case 9:
                return di0.b;
            default:
                return di0.c;
        }
    }

    public static final di0 e(f9 f9Var) {
        switch (a.$EnumSwitchMapping$0[f9Var.ordinal()]) {
            case 1:
                return di0.a;
            case 2:
                return di0.a;
            case 3:
                return di0.a;
            case 4:
                return di0.a;
            case 5:
                return di0.c;
            case 6:
                return di0.a;
            case 7:
                return di0.c;
            case 8:
                return di0.b;
            case 9:
                return di0.c;
            case 10:
                return di0.c;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final boolean f(f9 f9Var, w7 w7Var) {
        int i = a.$EnumSwitchMapping$0[f9Var.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return true;
        }
        if (i != 4) {
            return false;
        }
        return h(w7Var);
    }

    public static final e87 g(x56 x56Var, String str) {
        Map x;
        z65.h(x56Var, "<this>");
        z65.h(str, "fieldId");
        String str2 = x56Var.s().c().get(str);
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        String str4 = x56Var.t().get(str);
        if (str4 != null) {
            str3 = str4;
        }
        if (!z65.c(str2, str3)) {
            x = g86.x(x56Var.t());
            x.put(str, str2);
            Unit unit = Unit.a;
            return new e87(x56.r(x56Var, null, null, null, null, x, 15, null), true);
        }
        return new e87(x56Var, false);
    }

    public static final boolean h(w7 w7Var) {
        z65.h(w7Var, "<this>");
        List<d7> c = w7Var.c();
        if ((c instanceof Collection) && c.isEmpty()) {
            return false;
        }
        for (d7 d7Var : c) {
            if (d7Var.l() && d7Var.i().length() == 0) {
                return true;
            }
        }
        return false;
    }

    public static final x56 i(x56 x56Var, String str, String str2) {
        z65.h(x56Var, "<this>");
        z65.h(str, "fieldId");
        z65.h(str2, "text");
        return x56.r(x56Var, null, null, x7.b(x56Var.l(), str, str2), oy2.c(x56Var.s(), str, str2), null, 19, null);
    }

    public static final x56 j(x56 x56Var) {
        z65.h(x56Var, "<this>");
        return x56.r(x56Var, f9.o, null, x7.a(x56Var.l(), false), oy2.b(jx2.f, x56Var.s()), null, 18, null);
    }

    public static final x56 k(x56 x56Var) {
        z65.h(x56Var, "<this>");
        return x56.r(x56Var, f9.r, null, x7.a(x56Var.l(), false), null, null, 26, null);
    }

    public static final x56 l(x56 x56Var) {
        z65.h(x56Var, "<this>");
        return x56.r(x56Var, f9.q, null, null, null, null, 30, null);
    }

    public static final x56 m(x56 x56Var) {
        z65.h(x56Var, "<this>");
        return x56.r(x56Var, f9.s, null, x7.a(x56Var.l(), false), null, null, 26, null);
    }

    public static final x56 n(x56 x56Var) {
        z65.h(x56Var, "<this>");
        return x56.r(x56Var, f9.m, null, x7.a(x56Var.l(), true), null, null, 26, null);
    }

    public static final x56 o(x56 x56Var, AddressDetailsFieldDesignDto addressDetailsFieldDesignDto, String str, jx2 jx2Var) {
        jx2 b;
        w7 w7Var;
        w7 w7Var2;
        String str2;
        String str3;
        z65.h(x56Var, "<this>");
        z65.h(jx2Var, "deliveryLocation");
        if (x56Var.u() == f9.j) {
            b = jx2Var;
        } else {
            b = oy2.b(jx2Var, x56Var.s());
        }
        w7 w7Var3 = null;
        if (addressDetailsFieldDesignDto != null) {
            if (str == null) {
                str3 = "";
            } else {
                str3 = str;
            }
            w7Var = e9.c(addressDetailsFieldDesignDto, b, str3);
        } else {
            w7Var = null;
        }
        if (jx2Var.f().length() == 0) {
            if (w7Var != null) {
                w7Var3 = x7.a(w7Var, false);
            }
        } else {
            w7Var3 = w7Var;
        }
        f9 f9Var = f9.m;
        if (w7Var3 == null) {
            w7Var2 = x56Var.l();
        } else {
            w7Var2 = w7Var3;
        }
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        return x56Var.q(f9Var, str2, w7Var2, b, b.c());
    }

    public static final x56 p(x56 x56Var) {
        z65.h(x56Var, "<this>");
        return x56.r(x56Var, f9.l, null, x7.c(x7.a(x56Var.l(), false), false), null, null, 26, null);
    }

    public static final x56 q(x56 x56Var) {
        z65.h(x56Var, "<this>");
        return x56.r(x56Var, f9.k, null, x7.c(x7.a(x56Var.l(), false), false), null, null, 26, null);
    }

    public static final x56 r(x56 x56Var) {
        z65.h(x56Var, "<this>");
        return x56.r(x56Var, f9.n, null, x7.c(x7.a(x56Var.l(), true), true), null, null, 26, null);
    }

    public static final x56 s(x56 x56Var, jx2 jx2Var) {
        z65.h(x56Var, "<this>");
        z65.h(jx2Var, "deliveryLocation");
        return x56.r(x56Var, f9.p, null, x7.a(x56Var.l(), false), oy2.b(jx2Var, x56Var.s()), null, 18, null);
    }
}
