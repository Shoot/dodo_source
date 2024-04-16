package im.threads.ui.utils;

import android.graphics.BlendMode;
import android.graphics.PorterDuff;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
/* compiled from: ColorFilterKotlinExt.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\r\u0010\u0003\u001a\u00020\u0004H\u0001¢\u0006\u0002\b\u0005J\r\u0010\u0006\u001a\u00020\u0007H\u0000¢\u0006\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001a¨\u0006\u001b"}, d2 = {"Lim/threads/ui/utils/ColorFilterMode;", "", "(Ljava/lang/String;I)V", "getBlendMode", "Landroid/graphics/BlendMode;", "getBlendMode$threads_release", "getPorterDuffMode", "Landroid/graphics/PorterDuff$Mode;", "getPorterDuffMode$threads_release", "CLEAR", "SRC", "DST", "SRC_OVER", "DST_OVER", "SRC_IN", "DST_IN", "SRC_OUT", "DST_OUT", "SRC_ATOP", "DST_ATOP", "XOR", "DARKEN", "LIGHTEN", "MULTIPLY", "SCREEN", "ADD", "OVERLAY", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public enum ColorFilterMode {
    CLEAR,
    SRC,
    DST,
    SRC_OVER,
    DST_OVER,
    SRC_IN,
    DST_IN,
    SRC_OUT,
    DST_OUT,
    SRC_ATOP,
    DST_ATOP,
    XOR,
    DARKEN,
    LIGHTEN,
    MULTIPLY,
    SCREEN,
    ADD,
    OVERLAY;

    /* compiled from: ColorFilterKotlinExt.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ColorFilterMode.values().length];
            try {
                iArr[ColorFilterMode.CLEAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ColorFilterMode.SRC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ColorFilterMode.DST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ColorFilterMode.SRC_OVER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ColorFilterMode.DST_OVER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ColorFilterMode.SRC_IN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ColorFilterMode.DST_IN.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ColorFilterMode.SRC_OUT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[ColorFilterMode.DST_OUT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[ColorFilterMode.SRC_ATOP.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[ColorFilterMode.DST_ATOP.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[ColorFilterMode.XOR.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[ColorFilterMode.DARKEN.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[ColorFilterMode.LIGHTEN.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[ColorFilterMode.MULTIPLY.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[ColorFilterMode.SCREEN.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[ColorFilterMode.ADD.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[ColorFilterMode.OVERLAY.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public final BlendMode getBlendMode$threads_release() {
        BlendMode blendMode;
        BlendMode blendMode2;
        BlendMode blendMode3;
        BlendMode blendMode4;
        BlendMode blendMode5;
        BlendMode blendMode6;
        BlendMode blendMode7;
        BlendMode blendMode8;
        BlendMode blendMode9;
        BlendMode blendMode10;
        BlendMode blendMode11;
        BlendMode blendMode12;
        BlendMode blendMode13;
        BlendMode blendMode14;
        BlendMode blendMode15;
        BlendMode blendMode16;
        BlendMode blendMode17;
        BlendMode blendMode18;
        switch (WhenMappings.$EnumSwitchMapping$0[ordinal()]) {
            case 1:
                blendMode = BlendMode.CLEAR;
                return blendMode;
            case 2:
                blendMode2 = BlendMode.SRC;
                return blendMode2;
            case 3:
                blendMode3 = BlendMode.DST;
                return blendMode3;
            case 4:
                blendMode4 = BlendMode.SRC_OVER;
                return blendMode4;
            case 5:
                blendMode5 = BlendMode.DST_OVER;
                return blendMode5;
            case 6:
                blendMode6 = BlendMode.SRC_IN;
                return blendMode6;
            case 7:
                blendMode7 = BlendMode.DST_IN;
                return blendMode7;
            case 8:
                blendMode8 = BlendMode.SRC_OUT;
                return blendMode8;
            case 9:
                blendMode9 = BlendMode.DST_OUT;
                return blendMode9;
            case 10:
                blendMode10 = BlendMode.SRC_ATOP;
                return blendMode10;
            case 11:
                blendMode11 = BlendMode.DST_ATOP;
                return blendMode11;
            case 12:
                blendMode12 = BlendMode.XOR;
                return blendMode12;
            case 13:
                blendMode13 = BlendMode.DARKEN;
                return blendMode13;
            case 14:
                blendMode14 = BlendMode.LIGHTEN;
                return blendMode14;
            case 15:
                blendMode15 = BlendMode.MULTIPLY;
                return blendMode15;
            case 16:
                blendMode16 = BlendMode.SCREEN;
                return blendMode16;
            case 17:
                blendMode17 = BlendMode.PLUS;
                return blendMode17;
            case 18:
                blendMode18 = BlendMode.OVERLAY;
                return blendMode18;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final PorterDuff.Mode getPorterDuffMode$threads_release() {
        switch (WhenMappings.$EnumSwitchMapping$0[ordinal()]) {
            case 1:
                return PorterDuff.Mode.CLEAR;
            case 2:
                return PorterDuff.Mode.SRC;
            case 3:
                return PorterDuff.Mode.DST;
            case 4:
                return PorterDuff.Mode.SRC_OVER;
            case 5:
                return PorterDuff.Mode.DST_OVER;
            case 6:
                return PorterDuff.Mode.SRC_IN;
            case 7:
                return PorterDuff.Mode.DST_IN;
            case 8:
                return PorterDuff.Mode.SRC_OUT;
            case 9:
                return PorterDuff.Mode.DST_OUT;
            case 10:
                return PorterDuff.Mode.SRC_ATOP;
            case 11:
                return PorterDuff.Mode.DST_ATOP;
            case 12:
                return PorterDuff.Mode.XOR;
            case 13:
                return PorterDuff.Mode.DARKEN;
            case 14:
                return PorterDuff.Mode.LIGHTEN;
            case 15:
                return PorterDuff.Mode.MULTIPLY;
            case 16:
                return PorterDuff.Mode.SCREEN;
            case 17:
                return PorterDuff.Mode.ADD;
            case 18:
                return PorterDuff.Mode.OVERLAY;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
