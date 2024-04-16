package defpackage;

import ch.qos.logback.core.net.SyslogConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.adapter.internal.CommonCode;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.share.IASShareManager;
import com.inappstory.sdk.stories.api.models.Image;
import im.threads.ui.fragments.ChatFragment;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
/* compiled from: QRUtil.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0007\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b \u0010!J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\t\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u000e\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0007J\u001e\u0010\u0011\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fJ\u000e\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0007J\u001e\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0007J\u000e\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0019\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\u001a\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001cR \u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u001b0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001e¨\u0006\""}, d2 = {"Lmu8;", "", "", Image.TYPE_SMALL, "", "j", "i", "", "data", "a", "typeNumber", "", Image.TYPE_HIGH, "Lbu8;", "dataType", "Lgk3;", "errorCorrectionLevel", "g", "errorCorrectLength", "Lue8;", e.a, "Lf96;", "maskPattern", "f", DateTokenConverter.CONVERTER_KEY, "b", c.a, "", "[[I", "PATTERN_POSITION_TABLE", "[[[I", "MAX_LENGTH", "<init>", "()V", "qrcode-kotlin_release"}, k = 1, mv = {1, 7, 1})
/* renamed from: mu8  reason: default package */
/* loaded from: classes3.dex */
public final class mu8 {
    public static final mu8 a = new mu8();
    private static final int[][] b = {new int[0], new int[]{6, 18}, new int[]{6, 22}, new int[]{6, 26}, new int[]{6, 30}, new int[]{6, 34}, new int[]{6, 22, 38}, new int[]{6, 24, 42}, new int[]{6, 26, 46}, new int[]{6, 28, 50}, new int[]{6, 30, 54}, new int[]{6, 32, 58}, new int[]{6, 34, 62}, new int[]{6, 26, 46, 66}, new int[]{6, 26, 48, 70}, new int[]{6, 26, 50, 74}, new int[]{6, 30, 54, 78}, new int[]{6, 30, 56, 82}, new int[]{6, 30, 58, 86}, new int[]{6, 34, 62, 90}, new int[]{6, 28, 50, 72, 94}, new int[]{6, 26, 50, 74, 98}, new int[]{6, 30, 54, 78, 102}, new int[]{6, 28, 54, 80, 106}, new int[]{6, 32, 58, 84, 110}, new int[]{6, 30, 58, 86, 114}, new int[]{6, 34, 62, 90, 118}, new int[]{6, 26, 50, 74, 98, 122}, new int[]{6, 30, 54, 78, 102, 126}, new int[]{6, 26, 52, 78, 104, 130}, new int[]{6, 30, 56, 82, 108, 134}, new int[]{6, 34, 60, 86, 112, 138}, new int[]{6, 30, 58, 86, 114, 142}, new int[]{6, 34, 62, 90, 118, 146}, new int[]{6, 30, 54, 78, 102, 126, 150}, new int[]{6, 24, 50, 76, 102, 128, 154}, new int[]{6, 28, 54, 80, 106, 132, 158}, new int[]{6, 32, 58, 84, 110, SyslogConstants.LOG_LOCAL1, 162}, new int[]{6, 26, 54, 82, 110, 138, 166}, new int[]{6, 30, 58, 86, 114, 142, 170}};
    private static final int[][][] c = {new int[][]{new int[]{41, 25, 17, 10}, new int[]{34, 20, 14, 8}, new int[]{27, 16, 11, 7}, new int[]{17, 10, 7, 4}}, new int[][]{new int[]{77, 47, 32, 20}, new int[]{63, 38, 26, 16}, new int[]{48, 29, 20, 12}, new int[]{34, 20, 14, 8}}, new int[][]{new int[]{127, 77, 53, 32}, new int[]{101, 61, 42, 26}, new int[]{77, 47, 32, 20}, new int[]{58, 35, 24, 15}}, new int[][]{new int[]{187, 114, 78, 48}, new int[]{149, 90, 62, 38}, new int[]{111, 67, 46, 28}, new int[]{82, 50, 34, 21}}, new int[][]{new int[]{255, 154, 106, 65}, new int[]{ChatFragment.REQUEST_PERMISSION_READ_EXTERNAL, 122, 84, 52}, new int[]{SyslogConstants.LOG_LOCAL2, 87, 60, 37}, new int[]{106, 64, 44, 27}}, new int[][]{new int[]{322, 195, 134, 82}, new int[]{255, 154, 106, 65}, new int[]{178, 108, 74, 45}, new int[]{139, 84, 58, 36}}, new int[][]{new int[]{370, 224, 154, 95}, new int[]{293, 178, 122, 75}, new int[]{207, 125, 86, 53}, new int[]{154, 93, 64, 39}}, new int[][]{new int[]{461, 279, 192, 118}, new int[]{365, 221, SyslogConstants.LOG_LOCAL3, 93}, new int[]{259, 157, 108, 66}, new int[]{ChatFragment.REQUEST_PERMISSION_READ_EXTERNAL, 122, 84, 52}}, new int[][]{new int[]{552, 335, 230, 141}, new int[]{432, 262, 180, 111}, new int[]{312, 189, 130, 80}, new int[]{235, 143, 98, 60}}, new int[][]{new int[]{652, 395, 271, 167}, new int[]{513, 311, 213, 131}, new int[]{364, 221, 151, 93}, new int[]{288, 174, 119, 74}}, new int[][]{new int[]{772, 468, 321, 198}, new int[]{604, 366, 251, 155}, new int[]{427, 259, 177, 109}, new int[]{331, ChatFragment.REQUEST_PERMISSION_BOTTOM_GALLERY_GALLERY, 137, 85}}, new int[][]{new int[]{883, 535, 367, 226}, new int[]{691, 419, 287, 177}, new int[]{489, 296, 203, 125}, new int[]{374, 227, 155, 96}}, new int[][]{new int[]{1022, 619, 425, 262}, new int[]{796, 483, 331, ChatFragment.REQUEST_PERMISSION_RECORD_AUDIO}, new int[]{580, 352, 241, 149}, new int[]{427, 259, 177, 109}}, new int[][]{new int[]{1101, 667, 458, 282}, new int[]{871, 528, 362, 223}, new int[]{621, 376, 258, 159}, new int[]{468, 283, 194, 120}}, new int[][]{new int[]{1250, 758, 520, 320}, new int[]{991, 600, 412, 254}, new int[]{703, 426, 292, 180}, new int[]{530, 321, 220, SyslogConstants.LOG_LOCAL1}}, new int[][]{new int[]{1408, 854, 586, 361}, new int[]{1082, 656, 450, 277}, new int[]{775, 470, 322, 198}, new int[]{602, 365, 250, 154}}, new int[][]{new int[]{1548, 938, 644, 397}, new int[]{1212, 734, 504, 310}, new int[]{876, 531, 364, 224}, new int[]{674, 408, 280, 173}}, new int[][]{new int[]{1725, 1046, 718, 442}, new int[]{1346, 816, 560, 345}, new int[]{948, 574, 394, 243}, new int[]{746, 452, 310, 191}}, new int[][]{new int[]{1903, 1153, 792, 488}, new int[]{1500, IASShareManager.SHARE_EVENT, 624, 384}, new int[]{1063, 644, 442, 272}, new int[]{813, 493, 338, 208}}, new int[][]{new int[]{2061, 1249, 858, 528}, new int[]{1600, 970, 666, 410}, new int[]{1159, 702, 482, 297}, new int[]{919, 557, 382, 235}}, new int[][]{new int[]{2232, 1352, 929, 572}, new int[]{1708, 1035, 711, 438}, new int[]{1224, 742, 509, 314}, new int[]{969, 587, 403, 248}}, new int[][]{new int[]{2409, 1460, 1003, 618}, new int[]{1872, 1134, 779, 480}, new int[]{1358, 823, 565, 348}, new int[]{1056, 640, 439, 270}}, new int[][]{new int[]{2620, 1588, 1091, 672}, new int[]{2059, 1248, 857, 528}, new int[]{1468, 890, 611, 376}, new int[]{1108, 672, 461, 284}}, new int[][]{new int[]{2812, 1704, 1171, 721}, new int[]{2188, 1326, 911, 561}, new int[]{1588, 963, 661, 407}, new int[]{1228, 744, 511, 315}}, new int[][]{new int[]{3057, 1853, 1273, 784}, new int[]{2395, 1451, 997, 614}, new int[]{1718, 1041, 715, 440}, new int[]{1286, 779, 535, 330}}, new int[][]{new int[]{3283, 1990, 1367, 842}, new int[]{2544, 1542, 1059, 652}, new int[]{1804, 1094, 751, 462}, new int[]{1425, 864, 593, 365}}, new int[][]{new int[]{3517, 2132, 1465, 902}, new int[]{2701, 1637, 1125, 692}, new int[]{1933, 1172, 805, 496}, new int[]{1501, 910, 625, 385}}, new int[][]{new int[]{3669, 2223, 1528, 940}, new int[]{2857, 1732, 1190, 732}, new int[]{2085, 1263, 868, 534}, new int[]{1581, 958, 658, 405}}, new int[][]{new int[]{3909, 2369, 1628, CommonCode.BusInterceptor.PRIVACY_CANCEL}, new int[]{3035, 1839, 1264, 778}, new int[]{2181, 1322, 908, 559}, new int[]{1677, 1016, 698, 430}}, new int[][]{new int[]{4158, 2520, 1732, 1066}, new int[]{3289, 1994, 1370, 843}, new int[]{2358, 1429, 982, 604}, new int[]{1782, 1080, 742, 457}}, new int[][]{new int[]{4417, 2677, 1840, 1132}, new int[]{3486, 2113, 1452, 894}, new int[]{2473, 1499, 1030, 634}, new int[]{1897, 1150, 790, 486}}, new int[][]{new int[]{4686, 2840, 1952, 1201}, new int[]{3693, 2238, 1538, 947}, new int[]{2670, 1618, 1112, 684}, new int[]{2022, 1226, 842, 518}}, new int[][]{new int[]{4965, 3009, 2068, 1273}, new int[]{3909, 2369, 1628, CommonCode.BusInterceptor.PRIVACY_CANCEL}, new int[]{2805, 1700, 1168, 719}, new int[]{2157, 1307, 898, 553}}, new int[][]{new int[]{5253, 3183, 2188, 1347}, new int[]{4134, 2506, 1722, 1060}, new int[]{2949, 1787, 1228, 756}, new int[]{2301, 1394, 958, 590}}};

    /* compiled from: QRUtil.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* renamed from: mu8$a */
    /* loaded from: classes3.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[f96.values().length];
            try {
                iArr[f96.PATTERN000.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[f96.PATTERN001.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[f96.PATTERN010.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[f96.PATTERN011.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[f96.PATTERN100.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[f96.PATTERN101.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[f96.PATTERN110.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[f96.PATTERN111.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private mu8() {
    }

    private final int a(int i) {
        int i2 = 0;
        while (i != 0) {
            i2++;
            i >>>= 1;
        }
        return i2;
    }

    private final boolean i(String str) {
        return new ec9("^[0-9A-Z $%*+\\-./:]+$").f(str);
    }

    private final boolean j(String str) {
        return new ec9("^\\d+$").f(str);
    }

    public final int b(int i) {
        int i2 = i << 10;
        int i3 = i2;
        while (a(i3) - a(1335) >= 0) {
            i3 ^= 1335 << (a(i3) - a(1335));
        }
        return (i2 | i3) ^ 21522;
    }

    public final int c(int i) {
        int i2 = i << 12;
        int i3 = i2;
        while (a(i3) - a(7973) >= 0) {
            i3 ^= 7973 << (a(i3) - a(7973));
        }
        return i2 | i3;
    }

    public final bu8 d(String str) {
        z65.h(str, Image.TYPE_SMALL);
        if (i(str)) {
            if (j(str)) {
                return bu8.NUMBERS;
            }
            return bu8.UPPER_ALPHA_NUM;
        }
        return bu8.DEFAULT;
    }

    public final ue8 e(int i) {
        ue8 ue8Var = new ue8(new int[]{1}, 0, 2, null);
        for (int i2 = 0; i2 < i; i2++) {
            ue8Var = ue8Var.e(new ue8(new int[]{1, ku8.a.a(i2)}, 0, 2, null));
        }
        return ue8Var;
    }

    public final boolean f(f96 f96Var, int i, int i2) {
        z65.h(f96Var, "maskPattern");
        switch (a.$EnumSwitchMapping$0[f96Var.ordinal()]) {
            case 1:
                if ((i + i2) % 2 != 0) {
                    return false;
                }
                break;
            case 2:
                if (i % 2 != 0) {
                    return false;
                }
                break;
            case 3:
                if (i2 % 3 != 0) {
                    return false;
                }
                break;
            case 4:
                if ((i + i2) % 3 != 0) {
                    return false;
                }
                break;
            case 5:
                if (((i / 2) + (i2 / 3)) % 2 != 0) {
                    return false;
                }
                break;
            case 6:
                int i3 = i * i2;
                if ((i3 % 2) + (i3 % 3) != 0) {
                    return false;
                }
                break;
            case 7:
                int i4 = i * i2;
                if (((i4 % 2) + (i4 % 3)) % 2 != 0) {
                    return false;
                }
                break;
            case 8:
                if ((((i * i2) % 3) + ((i + i2) % 2)) % 2 != 0) {
                    return false;
                }
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return true;
    }

    public final int g(int i, bu8 bu8Var, gk3 gk3Var) {
        z65.h(bu8Var, "dataType");
        z65.h(gk3Var, "errorCorrectionLevel");
        return c[i - 1][gk3Var.ordinal()][bu8Var.ordinal()];
    }

    public final int[] h(int i) {
        return b[i - 1];
    }
}
