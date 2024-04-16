package com.appsflyer.internal;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
final class AFa1tSDK {

    /* loaded from: classes.dex */
    enum AFa1wSDK {
        UNKNOWN("uk"),
        ACCELEROMETER("am"),
        MAGNETOMETER("mm"),
        RESERVED("rs"),
        GYROSCOPE("gs");
        
        String AFKeystoreWrapper;

        AFa1wSDK(String str) {
            this.AFKeystoreWrapper = str;
        }
    }

    /* loaded from: classes.dex */
    enum AFa1xSDK {
        NONE,
        FIRST,
        ALL
    }

    /* loaded from: classes.dex */
    enum AFa1ySDK {
        UNKNOWN(0),
        ACCELEROMETER(1),
        MAGNETOMETER(2),
        RESERVED(3),
        GYROSCOPE(4);
        
        private int afErrorLog;

        AFa1ySDK(int i) {
            this.afErrorLog = i;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static List<BigDecimal> AFInAppEventParameterName(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(BigDecimal.valueOf(Double.parseDouble(((Float) arrayList.get(0)).toString())));
        arrayList2.add(BigDecimal.valueOf(Double.parseDouble(((Float) arrayList.get(1)).toString())));
        arrayList2.add(BigDecimal.valueOf(Double.parseDouble(((Float) arrayList.get(2)).toString())));
        return arrayList2;
    }
}
