package com.inappstory.sdk.stories.utils;
/* loaded from: classes3.dex */
public class AudioModes {
    public static final String MODE_CALL_SCREENING = "MODE_CALL_SCREENING";
    public static final String MODE_CURRENT = "MODE_CURRENT";
    public static final String MODE_INVALID = "MODE_INVALID";
    public static final String MODE_IN_CALL = "MODE_IN_CALL";
    public static final String MODE_IN_COMMUNICATION = "MODE_IN_COMMUNICATION";
    public static final String MODE_NORMAL = "MODE_NORMAL";
    public static final String MODE_RINGTONE = "MODE_RINGTONE";

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int getModeVal(String str) {
        char c;
        str.hashCode();
        switch (str.hashCode()) {
            case -1797197487:
                if (str.equals(MODE_CALL_SCREENING)) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -782653128:
                if (str.equals(MODE_IN_COMMUNICATION)) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 394055357:
                if (str.equals(MODE_CURRENT)) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1226900283:
                if (str.equals(MODE_INVALID)) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1235261084:
                if (str.equals(MODE_IN_CALL)) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1813795518:
                if (str.equals(MODE_RINGTONE)) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                return 4;
            case 1:
                return 3;
            case 2:
                return -1;
            case 3:
                return -2;
            case 4:
                return 2;
            case 5:
                return 1;
            default:
                return 0;
        }
    }
}
