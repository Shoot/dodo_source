package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.Unit;
/* compiled from: ByteString.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u0019\n\u0002\b\b\u001a$\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000\u001a\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\bH\u0002\u001a\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0003H\u0002\" \u0010\u0015\u001a\u00020\u000e8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Llk0;", "Lyg0;", "buffer", "", "offset", "byteCount", "", DateTokenConverter.CONVERTER_KEY, "", c.a, com.huawei.hms.push.e.a, "", Image.TYPE_SMALL, "codePointCount", "", "a", "[C", "f", "()[C", "getHEX_DIGIT_CHARS$annotations", "()V", "HEX_DIGIT_CHARS", "okio"}, k = 2, mv = {1, 9, 0})
/* renamed from: e */
/* loaded from: classes3.dex */
public final class e {
    private static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static final int c(byte[] bArr, int i) {
        int i2;
        byte b;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int length = bArr.length;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        loop0: while (i8 < length) {
            byte b2 = bArr[i8];
            if (b2 >= 0) {
                int i11 = i10 + 1;
                if (i10 == i) {
                    return i9;
                }
                if ((b2 != 10 && b2 != 13 && ((b2 >= 0 && b2 < 32) || (Byte.MAX_VALUE <= b2 && b2 < 160))) || b2 == 65533) {
                    return -1;
                }
                if (b2 < 65536) {
                    i2 = 1;
                } else {
                    i2 = 2;
                }
                i9 += i2;
                i8++;
                while (true) {
                    i10 = i11;
                    if (i8 < length && (b = bArr[i8]) >= 0) {
                        i8++;
                        i11 = i10 + 1;
                        if (i10 == i) {
                            return i9;
                        }
                        if ((b == 10 || b == 13 || ((b < 0 || b >= 32) && (Byte.MAX_VALUE > b || b >= 160))) && b != 65533) {
                            if (b < 65536) {
                                i3 = 1;
                            } else {
                                i3 = 2;
                            }
                            i9 += i3;
                        }
                    }
                }
            } else if ((b2 >> 5) == -2) {
                int i12 = i8 + 1;
                if (length <= i12) {
                    if (i10 != i) {
                        return -1;
                    }
                    return i9;
                }
                byte b3 = bArr[i12];
                if ((b3 & 192) == 128) {
                    int i13 = (b2 << 6) ^ (b3 ^ 3968);
                    if (i13 < 128) {
                        if (i10 != i) {
                            return -1;
                        }
                        return i9;
                    }
                    int i14 = i10 + 1;
                    if (i10 == i) {
                        return i9;
                    }
                    if ((i13 != 10 && i13 != 13 && ((i13 >= 0 && i13 < 32) || (127 <= i13 && i13 < 160))) || i13 == 65533) {
                        return -1;
                    }
                    if (i13 < 65536) {
                        i4 = 1;
                    } else {
                        i4 = 2;
                    }
                    i9 += i4;
                    Unit unit = Unit.a;
                    i8 += 2;
                    i10 = i14;
                } else if (i10 != i) {
                    return -1;
                } else {
                    return i9;
                }
            } else {
                if ((b2 >> 4) == -2) {
                    int i15 = i8 + 2;
                    if (length <= i15) {
                        if (i10 != i) {
                            return -1;
                        }
                        return i9;
                    }
                    byte b4 = bArr[i8 + 1];
                    if ((b4 & 192) == 128) {
                        byte b5 = bArr[i15];
                        if ((b5 & 192) == 128) {
                            int i16 = (b2 << 12) ^ ((b5 ^ (-123008)) ^ (b4 << 6));
                            if (i16 < 2048) {
                                if (i10 != i) {
                                    return -1;
                                }
                                return i9;
                            } else if (55296 <= i16 && i16 < 57344) {
                                if (i10 != i) {
                                    return -1;
                                }
                                return i9;
                            } else {
                                i5 = i10 + 1;
                                if (i10 == i) {
                                    return i9;
                                }
                                if ((i16 != 10 && i16 != 13 && ((i16 >= 0 && i16 < 32) || (127 <= i16 && i16 < 160))) || i16 == 65533) {
                                    return -1;
                                }
                                if (i16 < 65536) {
                                    i7 = 1;
                                } else {
                                    i7 = 2;
                                }
                                i9 += i7;
                                Unit unit2 = Unit.a;
                                i8 += 3;
                            }
                        } else if (i10 != i) {
                            return -1;
                        } else {
                            return i9;
                        }
                    } else if (i10 != i) {
                        return -1;
                    } else {
                        return i9;
                    }
                } else if ((b2 >> 3) == -2) {
                    int i17 = i8 + 3;
                    if (length <= i17) {
                        if (i10 != i) {
                            return -1;
                        }
                        return i9;
                    }
                    byte b6 = bArr[i8 + 1];
                    if ((b6 & 192) == 128) {
                        byte b7 = bArr[i8 + 2];
                        if ((b7 & 192) == 128) {
                            byte b8 = bArr[i17];
                            if ((b8 & 192) == 128) {
                                int i18 = (b2 << 18) ^ (((b8 ^ 3678080) ^ (b7 << 6)) ^ (b6 << 12));
                                if (i18 > 1114111) {
                                    if (i10 != i) {
                                        return -1;
                                    }
                                    return i9;
                                } else if (55296 <= i18 && i18 < 57344) {
                                    if (i10 != i) {
                                        return -1;
                                    }
                                    return i9;
                                } else if (i18 < 65536) {
                                    if (i10 != i) {
                                        return -1;
                                    }
                                    return i9;
                                } else {
                                    i5 = i10 + 1;
                                    if (i10 == i) {
                                        return i9;
                                    }
                                    if ((i18 != 10 && i18 != 13 && ((i18 >= 0 && i18 < 32) || (127 <= i18 && i18 < 160))) || i18 == 65533) {
                                        return -1;
                                    }
                                    if (i18 < 65536) {
                                        i6 = 1;
                                    } else {
                                        i6 = 2;
                                    }
                                    i9 += i6;
                                    Unit unit3 = Unit.a;
                                    i8 += 4;
                                }
                            } else if (i10 != i) {
                                return -1;
                            } else {
                                return i9;
                            }
                        } else if (i10 != i) {
                            return -1;
                        } else {
                            return i9;
                        }
                    } else if (i10 != i) {
                        return -1;
                    } else {
                        return i9;
                    }
                } else if (i10 != i) {
                    return -1;
                } else {
                    return i9;
                }
                i10 = i5;
            }
        }
        return i9;
    }

    public static final void d(lk0 lk0Var, yg0 yg0Var, int i, int i2) {
        z65.h(lk0Var, "<this>");
        z65.h(yg0Var, "buffer");
        yg0Var.p1(lk0Var.u(), i, i2);
    }

    public static final int e(char c) {
        if ('0' <= c && c < ':') {
            return c - '0';
        }
        if ('a' <= c && c < 'g') {
            return c - 'W';
        }
        if ('A' <= c && c < 'G') {
            return c - '7';
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c);
    }

    public static final char[] f() {
        return a;
    }
}
