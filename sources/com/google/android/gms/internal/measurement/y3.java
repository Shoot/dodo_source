package com.google.android.gms.internal.measurement;

import ch.qos.logback.core.CoreConstants;
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
/* loaded from: classes2.dex */
final class y3 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(d1 d1Var) {
        x3 x3Var = new x3(d1Var);
        StringBuilder sb = new StringBuilder(x3Var.zza());
        for (int i = 0; i < x3Var.zza(); i++) {
            byte e = x3Var.e(i);
            if (e != 34) {
                if (e != 39) {
                    if (e != 92) {
                        switch (e) {
                            case 7:
                                sb.append("\\a");
                                continue;
                            case 8:
                                sb.append("\\b");
                                continue;
                            case 9:
                                sb.append("\\t");
                                continue;
                            case 10:
                                sb.append("\\n");
                                continue;
                            case 11:
                                sb.append("\\v");
                                continue;
                            case 12:
                                sb.append("\\f");
                                continue;
                            case 13:
                                sb.append("\\r");
                                continue;
                            default:
                                if (e >= 32 && e <= 126) {
                                    sb.append((char) e);
                                    continue;
                                } else {
                                    sb.append(CoreConstants.ESCAPE_CHAR);
                                    sb.append((char) (((e >>> 6) & 3) + 48));
                                    sb.append((char) (((e >>> 3) & 7) + 48));
                                    sb.append((char) ((e & 7) + 48));
                                    break;
                                }
                        }
                    } else {
                        sb.append("\\\\");
                    }
                } else {
                    sb.append("\\'");
                }
            } else {
                sb.append("\\\"");
            }
        }
        return sb.toString();
    }
}
