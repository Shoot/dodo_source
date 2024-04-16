package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
/* compiled from: AnalyticsExtensions.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0016\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006J\u0010\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u0006J\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0006J\u0010\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\r¨\u0006\u0012"}, d2 = {"Luc;", "", "Lfl8;", "product", "", e.a, "", "doughTypeId", "sizeGroupId", DateTokenConverter.CONVERTER_KEY, c.a, "orderType", "b", "Lmi7;", "orderState", "a", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: uc  reason: default package */
/* loaded from: classes4.dex */
public final class uc {
    public static final uc a = new uc();

    /* compiled from: AnalyticsExtensions.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: uc$a */
    /* loaded from: classes4.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[mi7.values().length];
            try {
                iArr[mi7.c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[mi7.d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[mi7.e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[mi7.f.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[mi7.g.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[mi7.h.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[mi7.i.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[mi7.j.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[mi7.k.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[mi7.l.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[mi7.m.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private uc() {
    }

    public final String a(mi7 mi7Var) {
        int i;
        if (mi7Var == null) {
            i = -1;
        } else {
            i = a.$EnumSwitchMapping$0[mi7Var.ordinal()];
        }
        switch (i) {
            case 1:
            default:
                return "unknown";
            case 2:
                return "accepted";
            case 3:
                return "deferred_delivery";
            case 4:
                return "deferred_carryout_with_cooking";
            case 5:
                return "deferred_carryout_without_cooking";
            case 6:
                return "cooking";
            case 7:
                return "ready_for_delivery";
            case 8:
                return "ready_for_carryout";
            case 9:
                return "on_delivery";
            case 10:
                return "completed";
            case 11:
                return "canceled";
        }
    }

    public final String b(int i) {
        if (i == jk7.e.i()) {
            return "delivery";
        }
        if (i == jk7.f.i()) {
            return "carryout";
        }
        if (i == jk7.g.i()) {
            return "restaurant";
        }
        return "undefined";
    }

    public final String c(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return null;
                }
                return "35";
            }
            return "30";
        }
        return "25";
    }

    public final String d(int i, int i2) {
        String str;
        String str2 = "";
        if (i != 2) {
            str = "";
        } else {
            str = "T";
        }
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    str2 = "35";
                }
            } else {
                str2 = "30";
            }
        } else {
            str2 = "25";
        }
        return str2 + str;
    }

    public final String e(fl8 fl8Var) {
        if (fl8Var == null) {
            return null;
        }
        if (fl8Var instanceof m78) {
            m78 m78Var = (m78) fl8Var;
            return d(m78Var.q(), m78Var.u());
        } else if (fl8Var instanceof zi1) {
            return null;
        } else {
            return fl8Var.m().getValue();
        }
    }
}
